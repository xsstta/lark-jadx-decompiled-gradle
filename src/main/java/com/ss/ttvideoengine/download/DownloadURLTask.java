package com.ss.ttvideoengine.download;

import android.text.TextUtils;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.download.DownloadTask;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class DownloadURLTask extends DownloadTask {
    private String key;
    private ArrayList<String> urls;

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public boolean _shouldRetry(Error error) {
        return false;
    }

    private DownloadURLTask() {
    }

    public String getKey() {
        return this.key;
    }

    public ArrayList<String> getUrls() {
        return this.urls;
    }

    public String getVideoId() {
        return this.videoId;
    }

    static DownloadURLTask taskItem() {
        DownloadURLTask downloadURLTask = new DownloadURLTask();
        downloadURLTask.setupBaseFiled();
        return downloadURLTask;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void setupBaseFiled() {
        super.setupBaseFiled();
        this.urls = null;
        this.key = null;
        this.taskType = "url_task";
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public JSONObject jsonObject() {
        HashMap hashMap = new HashMap();
        putToMap(hashMap, "base_json", super.mapInfo());
        putToMap(hashMap, "key", this.key);
        putToMap(hashMap, "urls", this.urls);
        return new JSONObject(hashMap);
    }

    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void resume() {
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] did call resume, key = " + this.mediaKeys.toString());
        if (this.canceled) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] task did canceled");
        } else if (getState() == 2) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] state is running");
        } else {
            super.resume();
            if (this.downloader == null || this.downloader.shouldResume(this)) {
                this.usingUrls = new HashMap();
                this.usingUrls.put(this.key, this.urls);
                setState(2);
                DataLoaderHelper dataLoader = DataLoaderHelper.getDataLoader();
                String str = this.key;
                String str2 = this.videoId;
                ArrayList<String> arrayList = this.urls;
                String downloadUrl = dataLoader.downloadUrl(str, str2, (String[]) arrayList.toArray(new String[arrayList.size()]), this.encryptVersion.getVersion());
                if (!DataLoaderHelper.getDataLoader().startDownload(downloadUrl)) {
                    receiveError(new Error("kTTVideoErrorDomainDownload", -9996, 0, "resume download fail. url = " + downloadUrl + " dataload state is " + DataLoaderHelper.getDataLoader().isRunning()));
                    return;
                }
                TTVideoEngineLog.m256505i("TTVideoEngine.DownloadURLTask", "[downloader] resume a task. key = " + this.key + " downloader url is " + downloadUrl);
                if (this.downloader != null) {
                    this.downloader.resume(this);
                    return;
                }
                return;
            }
            TTVideoEngineLog.m256505i("TTVideoEngine.DownloadURLTask", "[downloader] not should resume task = " + toString());
        }
    }

    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void suspend() {
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] did call suspend, key = " + this.mediaKeys.toString());
        if (this.canceled) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] task did canceled");
        } else if (getState() == 3 || getState() == 0 || getState() == 5) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] not need suspend, state = " + getState());
        } else if (!this.downloader.suspended(this)) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] suspend task, task in waiting, taskIdentifier: " + this.taskIdentifier);
        } else {
            super.suspend();
            if (this.mediaKeys != null && this.mediaKeys.size() > 0) {
                for (int i = 0; i < this.mediaKeys.size(); i++) {
                    DataLoaderHelper.getDataLoader().suspendedDownload((String) this.mediaKeys.get(i));
                }
            }
            if (this.downloader != null) {
                this.downloader.tryNextWaitingTask(this);
            }
        }
    }

    public void updateUrls(ArrayList<String> arrayList) {
        this.urls = arrayList;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void assignWithJson(JSONObject jSONObject) {
        super.assignWithJson(jSONObject.optJSONObject("base_json"));
        this.key = jSONObject.optString("key");
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.urls = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.urls.add(optString);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(DownloadURLTask.class)) {
            return false;
        }
        return ((DownloadURLTask) obj).key.equals(this.key);
    }

    static DownloadURLTask taskItem(String str, ArrayList<String> arrayList, String str2) {
        return taskItem(str, arrayList, str2, DownloadTask.EncryptVersion.NONE);
    }

    static DownloadURLTask taskItem(String str, ArrayList<String> arrayList, String str2, DownloadTask.EncryptVersion encryptVersion) {
        if (TextUtils.isEmpty(str) || arrayList == null || arrayList.size() < 1) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadURLTask", "[downloader] key or urls is invalid.");
            return null;
        }
        DownloadURLTask taskItem = taskItem();
        taskItem.key = str;
        taskItem.urls = arrayList;
        taskItem.videoId = str2;
        taskItem.mediaKeys.add(str);
        taskItem.encryptVersion = encryptVersion;
        return taskItem;
    }
}
