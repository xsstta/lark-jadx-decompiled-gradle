package com.ss.ttvideoengine.download;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class DownloadTask {
    protected String authToken;
    protected String availableLocalFilePath;
    protected long bytesExpectedToReceive;
    protected HashMap<String, Long> bytesExpectedToReceiveMap;
    protected long bytesReceived;
    protected HashMap<String, Long> bytesReceivedMap;
    protected boolean canceled;
    protected Downloader downloader;
    protected EncryptVersion encryptVersion = EncryptVersion.NONE;
    protected Error error;
    protected boolean finished;
    protected boolean mFirstResumeCallback;
    protected Handler mHandler;
    protected ArrayList<String> mediaKeys;
    private int state;
    protected String taskDescription;
    protected long taskIdentifier = -1;
    protected String taskType = "base_task";
    protected long updateBytesReceived;
    protected long updateTs;
    protected HashMap<String, List<String>> usingUrls;
    protected String videoId;

    public enum EncryptVersion {
        NONE(0),
        MDL_VERSION_1(1);
        
        private int version;

        /* access modifiers changed from: package-private */
        public int getVersion() {
            return this.version;
        }

        private EncryptVersion(int i) {
            this.version = i;
        }
    }

    public String getAvailableLocalFilePath() {
        return this.availableLocalFilePath;
    }

    public long getBytesExpectedToReceive() {
        return this.bytesExpectedToReceive;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public Error getError() {
        return this.error;
    }

    public int getState() {
        return this.state;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

    public void suspend() {
        setState(3);
    }

    /* access modifiers changed from: package-private */
    public void downloadEnd() {
        this.error = null;
        setState(5);
        Downloader downloader2 = this.downloader;
        if (downloader2 != null) {
            downloader2.completeError(this, null);
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject jsonObject() {
        return new JSONObject(mapInfo());
    }

    public void resume() {
        initHandle();
        this.error = null;
        this.finished = false;
        this.updateTs = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void initHandle() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(TTHelper.getLooper()) {
                /* class com.ss.ttvideoengine.download.DownloadTask.HandlerC654412 */

                public void handleMessage(Message message) {
                    if (message != null && this != null) {
                        super.handleMessage(message);
                        if (message.what == 111) {
                            this.setState(0);
                            if (this.downloader != null) {
                                this.downloader.cancel(this);
                            }
                        } else if (message.what == 112) {
                            this.error = (Error) message.obj;
                            if (!DownloadTask.this._shouldRetry(this.error)) {
                                this.setState(5);
                            }
                            if (this.downloader != null) {
                                Downloader downloader = this.downloader;
                                DownloadTask downloadTask = this;
                                downloader.completeError(downloadTask, downloadTask.error);
                            }
                        } else if (message.what == 113) {
                            this.error = null;
                            this.setState(5);
                            if (this.downloader != null) {
                                this.downloader.completeError(this, null);
                            }
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public void setupBaseFiled() {
        this.taskIdentifier = -1;
        this.taskType = "base_task";
        this.bytesReceived = 0;
        this.bytesExpectedToReceive = 0;
        this.state = 0;
        this.error = null;
        this.availableLocalFilePath = null;
        this.mediaKeys = new ArrayList<>();
        this.usingUrls = null;
        this.finished = false;
        this.videoId = null;
        this.updateTs = 0;
        this.bytesReceivedMap = new HashMap<>();
        this.bytesExpectedToReceiveMap = new HashMap<>();
    }

    public String toString() {
        return super.toString() + "   id = " + this.taskIdentifier + ", state = " + this.state + ",  videoId " + this.videoId;
    }

    public void invalidateAndCancel() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[downloader] did call invalidateAndCancel, key = ");
        ArrayList<String> arrayList = this.mediaKeys;
        if (arrayList != null) {
            str = arrayList.toString();
        } else {
            str = null;
        }
        sb.append(str);
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadTask", sb.toString());
        if (this.canceled) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadTask", "[downloader] task did canceled, self.taskIdentifier = " + this.taskIdentifier);
            return;
        }
        this.canceled = true;
        this.finished = false;
        setState(4);
        initHandle();
        final ArrayList<String> arrayList2 = this.mediaKeys;
        EngineThreadPool.addExecuteTask(new Runnable() {
            /* class com.ss.ttvideoengine.download.DownloadTask.RunnableC654401 */

            public void run() {
                ArrayList arrayList = arrayList2;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        String str = (String) arrayList2.get(i);
                        DataLoaderHelper.getDataLoader().suspendedDownload(str);
                        DataLoaderHelper.getDataLoader().removeCacheFile(str);
                    }
                }
                if (DownloadTask.this.mHandler != null) {
                    DownloadTask.this.mHandler.sendMessage(Message.obtain(DownloadTask.this.mHandler, (int) SmEvents.EVENT_NT));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public Map mapInfo() {
        HashMap hashMap = new HashMap();
        putToMap(hashMap, "id", this.taskIdentifier);
        putToMap(hashMap, "des", this.taskDescription);
        putToMap(hashMap, "res_size", this.bytesReceived);
        putToMap(hashMap, "content_size", this.bytesExpectedToReceive);
        putToMap((Map) hashMap, "state", this.state);
        Error error2 = this.error;
        if (error2 != null) {
            putToMap(hashMap, "error", error2.toMap());
        }
        putToMap(hashMap, "file_path", this.availableLocalFilePath);
        putToMap(hashMap, "media_keys", this.mediaKeys);
        putToMap(hashMap, "use_urls", this.usingUrls);
        putToMap(hashMap, "finish", this.finished);
        putToMap(hashMap, "cancel", this.canceled);
        putToMap(hashMap, "task_type", this.taskType);
        putToMap(hashMap, "vid", this.videoId);
        putToMap(hashMap, "bytes_rec_map", this.bytesReceivedMap);
        putToMap(hashMap, "bytes_expect_map", this.bytesExpectedToReceiveMap);
        putToMap((Map) hashMap, "encrypt_version", this.encryptVersion.getVersion());
        return hashMap;
    }

    public void setDownloader(Downloader downloader2) {
        this.downloader = downloader2;
    }

    public void setTaskDescription(String str) {
        this.taskDescription = str;
    }

    /* access modifiers changed from: package-private */
    public void receiveError(Error error2) {
        initHandle();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(Message.obtain(handler, SmEvents.EVENT_NE_RR, error2));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean _shouldRetry(Error error2) {
        if (error2 == null || error2.code == -9995 || error2.code == -9948 || error2.code == -9949 || error2.code == -9947 || error2.code == -9946) {
            return false;
        }
        return true;
    }

    public void setState(int i) {
        String str;
        if (i != this.state) {
            this.state = i;
            StringBuilder sb = new StringBuilder();
            sb.append("[downloader] state did changed. state = ");
            sb.append(i);
            sb.append(" key = ");
            ArrayList<String> arrayList = this.mediaKeys;
            if (arrayList != null) {
                str = arrayList.toString();
            } else {
                str = null;
            }
            sb.append(str);
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadTask", sb.toString());
            Downloader downloader2 = this.downloader;
            if (downloader2 != null && downloader2.getListener() != null) {
                TTVideoEngineLog.m256500d("TTVideoEngine.DownloadTask", "[downloader] state did changed. and notify downloader state = " + i);
                this.downloader.getListener().downloaderStateChanged(this.downloader, this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void assignWithJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.taskIdentifier = jSONObject.optLong("id");
            this.taskDescription = jSONObject.optString("des");
            long optLong = jSONObject.optLong("res_size");
            this.bytesReceived = optLong;
            this.updateBytesReceived = optLong;
            this.bytesExpectedToReceive = jSONObject.optLong("content_size");
            this.state = jSONObject.optInt("state");
            this.error = TTHelper.errorWithJson(jSONObject.optJSONObject("error"));
            this.availableLocalFilePath = jSONObject.optString("file_path");
            JSONArray optJSONArray = jSONObject.optJSONArray("media_keys");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                this.mediaKeys = new ArrayList<>();
            } else {
                this.mediaKeys = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        this.mediaKeys.add(optString);
                    }
                }
            }
            this.finished = jSONObject.optBoolean("finish");
            this.canceled = jSONObject.optBoolean("cancel");
            this.taskType = jSONObject.optString("task_type");
            this.videoId = jSONObject.optString("vid");
            if (jSONObject.optInt("encrypt_version", 0) == 1) {
                this.encryptVersion = EncryptVersion.MDL_VERSION_1;
            } else {
                this.encryptVersion = EncryptVersion.NONE;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("bytes_rec_map");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.bytesReceivedMap.put(next, Long.valueOf(optJSONObject.optLong(next)));
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("bytes_expect_map");
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                Iterator<String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    this.bytesExpectedToReceiveMap.put(next2, Long.valueOf(optJSONObject2.optLong(next2)));
                }
            }
        }
    }

    public static void putToMap(Map map, String str, int i) {
        map.put(str, Integer.valueOf(i));
    }

    public static void putToMap(Map map, String str, long j) {
        map.put(str, Long.valueOf(j));
    }

    public static void putToMap(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public static void putToMap(Map map, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put(str, arrayList);
        }
    }

    public static void putToMap(Map map, String str, Map map2) {
        if (map2 != null && !map2.isEmpty()) {
            map.put(str, map2);
        }
    }

    public static void putToMap(Map map, String str, boolean z) {
        map.put(str, Boolean.valueOf(z));
    }
}
