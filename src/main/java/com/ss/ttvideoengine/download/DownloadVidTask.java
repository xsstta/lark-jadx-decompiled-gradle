package com.ss.ttvideoengine.download;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.AppInfo;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.InfoWrapper;
import com.ss.ttvideoengine.JniUtils;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.download.DownloadTask;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.model.VideoRef;
import com.ss.ttvideoengine.net.ChannelSelect;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.ss.ttvideoengine.utils.TTVideoEngineUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DownloadVidTask extends DownloadTask {
    public String apiString;
    public int apiVersion;
    public String authString;
    private boolean baseDashEnable;
    private boolean boeEnable;
    private String codecType = "h264";
    private Resolution currentResolution;
    private String fallbackAPI;
    private IDownloadVidTaskListener fetchListener;
    private VideoInfoFetcher fetcher;
    private boolean httpsEnable;
    private String keySeed;
    Context mContext;
    private TTVNetClient netClient;
    private Map<Integer, String> params;
    private Resolution resolution;
    private HashMap<String, Resolution> resolutionMap;
    private int retryCount;
    private VideoModel videoModel;

    public int getApiVersion() {
        return this.apiVersion;
    }

    public Resolution getCurrentResolution() {
        return this.currentResolution;
    }

    public IDownloadVidTaskListener getFetchListener() {
        return this.fetchListener;
    }

    public TTVNetClient getNetClient() {
        return this.netClient;
    }

    public Map<Integer, String> getParams() {
        return this.params;
    }

    public Resolution getResolution() {
        return this.resolution;
    }

    public HashMap<String, Resolution> getResolutionMap() {
        return this.resolutionMap;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public VideoModel getVideoModel() {
        return this.videoModel;
    }

    public boolean isBaseDashEnable() {
        return this.baseDashEnable;
    }

    public boolean isBoeEnable() {
        return this.boeEnable;
    }

    public boolean isHttpsEnable() {
        return this.httpsEnable;
    }

    private DownloadVidTask() {
    }

    static DownloadVidTask taskItem() {
        DownloadVidTask downloadVidTask = new DownloadVidTask();
        downloadVidTask.setupBaseFiled();
        return downloadVidTask;
    }

    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void invalidateAndCancel() {
        VideoInfoFetcher videoInfoFetcher = this.fetcher;
        if (videoInfoFetcher != null) {
            videoInfoFetcher.cancel();
        }
        super.invalidateAndCancel();
    }

    public boolean isBytevc1Enable() {
        return this.codecType.equals("bytevc1");
    }

    public boolean isBytevc2Enable() {
        return this.codecType.equals("bytevc2");
    }

    @Override // com.ss.ttvideoengine.download.DownloadTask
    public String getAvailableLocalFilePath() {
        if (this.baseDashEnable) {
            return null;
        }
        if (getVideoModel() == null || getVideoModel().getSpadea() == null) {
            return super.getAvailableLocalFilePath();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void setupBaseFiled() {
        super.setupBaseFiled();
        this.retryCount = 0;
        this.taskType = "vid_task";
        this.apiVersion = 0;
        this.resolution = Resolution.Standard;
    }

    private String getHost() {
        if (!TextUtils.isEmpty(AppInfo.mOpenApiHostName)) {
            return AppInfo.mOpenApiHostName;
        }
        if (InfoWrapper.getUseHostSelect()) {
            ChannelSelect.getInstance().init(AppInfo.mContext);
            ChannelSelect.getInstance().setHostList(4, InfoWrapper.getTopHostArrayV2());
            String select = ChannelSelect.getInstance().select(4);
            if (!TextUtils.isEmpty(select)) {
                return select;
            }
        }
        JSONArray topHostArrayV2 = InfoWrapper.getTopHostArrayV2();
        if (!TTHelper.isEmpty(topHostArrayV2)) {
            Object opt = topHostArrayV2.opt(0);
            if (opt instanceof String) {
                return (String) opt;
            }
        }
        return AppInfo.getDefaultVodTopHostV2();
    }

    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void resume() {
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] did call resume, videoId = " + this.videoId);
        if (this.canceled) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] task did canceled");
        } else if (getState() == 2) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] state is running");
        } else {
            super.resume();
            if (this.downloader == null || this.downloader.shouldResume(this)) {
                this.retryCount = 0;
                setState(2);
                if (getVideoModel() != null) {
                    _downloadWithVideoModel(getVideoModel());
                } else {
                    _fetchVideoModel();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public JSONObject jsonObject() {
        HashMap hashMap = new HashMap();
        putToMap(hashMap, "base_json", super.mapInfo());
        putToMap(hashMap, "codec_type", this.codecType);
        putToMap(hashMap, "base_dash", this.baseDashEnable);
        putToMap(hashMap, "https", this.httpsEnable);
        putToMap(hashMap, "boe", this.boeEnable);
        putToMap(hashMap, CommonCode.MapKey.HAS_RESOLUTION, Resolution.toString(this.resolution));
        putToMap(hashMap, "param", this.params);
        HashMap<String, Resolution> hashMap2 = this.resolutionMap;
        if (hashMap2 != null && hashMap2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            for (String str : this.resolutionMap.keySet()) {
                hashMap3.put(str, Resolution.toString(this.resolutionMap.get(str)));
            }
            putToMap(hashMap, "resolution_map", hashMap3);
        }
        putToMap((Map) hashMap, "api_version", this.apiVersion);
        putToMap(hashMap, "curr_resolution", Resolution.toString(this.currentResolution));
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            if (getVideoModel() != null) {
                jSONObject.putOpt("video_model", getVideoModel().getJsonInfo());
            }
            return jSONObject;
        } catch (JSONException unused) {
            TTVideoEngineLog.m256503e("TTVideoEngine.DownloadVidTask", "[downloader] jsonObject fail.");
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void suspend() {
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] did call suspend, videoId = " + this.videoId);
        if (this.canceled) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] task did canceled");
        } else if (getState() == 3 || getState() == 0 || getState() == 5) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] not need suspend, state = " + getState());
        } else if (!this.downloader.suspended(this)) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] suspend task, task in waiting, taskIdentifier: " + this.taskIdentifier);
        } else {
            super.suspend();
            if (this.mediaKeys != null && this.mediaKeys.size() > 0) {
                for (int i = 0; i < this.mediaKeys.size(); i++) {
                    DataLoaderHelper.getDataLoader().suspendedDownload((String) this.mediaKeys.get(i));
                }
            }
        }
    }

    private void _fetchVideoModel() {
        int i;
        this.apiString = null;
        this.authString = null;
        this.fetcher = null;
        VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(this.mContext, this.netClient);
        this.fetcher = videoInfoFetcher;
        videoInfoFetcher.setListener(new MyFetcherListener(this));
        this.fetcher.setResolutionMap(this.resolutionMap);
        this.fetcher.setVideoID(this.videoId);
        this.fetcher.setUseVideoModelCache(true);
        if (!TextUtils.isEmpty(this.fallbackAPI)) {
            try {
                i = JniUtils.getDecodeMethod();
            } catch (Exception unused) {
                i = 0;
            }
            String format = String.format("%s&method=%d", this.fallbackAPI, Integer.valueOf(i));
            this.apiString = format;
            if (this.boeEnable) {
                this.apiString = TTHelper.buildBoeUrl(format);
            }
            String BuildHttpsApi = TTVideoEngineUtils.BuildHttpsApi(this.apiString);
            this.apiString = BuildHttpsApi;
            TTVideoEngineLog.m256505i("TTVideoEngine.DownloadVidTask", String.format("[downloader] api string from fallback api:%s ,keySeed = %s", BuildHttpsApi, this.keySeed));
            this.fetcher.setUseFallbakApi(true);
            this.fetcher.fetchInfo(this.apiString, null, 0, this.keySeed);
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.codecType.equals("bytevc2")) {
            hashMap.put("codec_type", "4");
        } else if (this.codecType.equals("bytevc1")) {
            hashMap.put("codec_type", "3");
        }
        if (this.baseDashEnable) {
            hashMap.put("format_type", "dash");
        }
        if (this.httpsEnable) {
            hashMap.put("ssl", "1");
        }
        IDownloadVidTaskListener iDownloadVidTaskListener = this.fetchListener;
        if (iDownloadVidTaskListener != null) {
            this.apiString = iDownloadVidTaskListener.apiString(hashMap, this.videoId, this.apiVersion);
            this.authString = this.fetchListener.authString(this.videoId, this.apiVersion);
            if (this.boeEnable) {
                this.apiString = TTHelper.buildBoeUrl(this.apiString);
            } else {
                this.apiString = this.apiString;
            }
        }
        String BuildHttpsApi2 = TTVideoEngineUtils.BuildHttpsApi(this.apiString);
        this.apiString = BuildHttpsApi2;
        this.fetcher.fetchInfo(BuildHttpsApi2, this.authString, this.apiVersion);
        TTVideoEngineLog.m256505i("TTVideoEngine.DownloadVidTask", "[downloader] fetch videoModel, apiString = " + this.apiString);
    }

    public void setApiVersion(int i) {
        this.apiVersion = i;
    }

    public void setBoeEnable(boolean z) {
        this.boeEnable = z;
    }

    public void setFetchListener(IDownloadVidTaskListener iDownloadVidTaskListener) {
        this.fetchListener = iDownloadVidTaskListener;
    }

    public void setNetClient(TTVNetClient tTVNetClient) {
        this.netClient = tTVNetClient;
    }

    public void setParams(Map<Integer, String> map) {
        this.params = map;
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        this.resolutionMap = hashMap;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public boolean _shouldRetry(Error error) {
        if (super._shouldRetry(error) && this.retryCount < 10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void receiveError(Error error) {
        if (_shouldRetry(error)) {
            this.retryCount++;
            _fetchVideoModel();
            return;
        }
        super.receiveError(error);
    }

    private String getTobAPIString(String str) {
        String authorization = getAuthorization(str);
        if (TextUtils.isEmpty(authorization)) {
            return null;
        }
        String host = getHost();
        StringBuilder sb = new StringBuilder();
        if (host.startsWith("http")) {
            sb.append(host);
            sb.append("?");
            sb.append(authorization);
        } else {
            sb.append("https://");
            sb.append(host);
            sb.append("?");
            sb.append(authorization);
        }
        return sb.toString();
    }

    public void _downloadWithVideoModel(VideoModel videoModel2) {
        this.mediaKeys.clear();
        this.usingUrls = new HashMap();
        String dynamicType = videoModel2.getDynamicType();
        if (TextUtils.isEmpty(dynamicType) || !dynamicType.equals("segment_base")) {
            VideoInfo videoInfo = videoModel2.getVideoInfo(this.resolution, this.params, true);
            if (_downloadUrlInfo(videoInfo)) {
                this.currentResolution = videoInfo.getResolution();
            } else {
                return;
            }
        } else {
            VideoInfo videoInfo2 = videoModel2.getVideoInfo(this.resolution, VideoRef.TYPE_AUDIO, this.params, true);
            if (videoInfo2 != null) {
                if (_downloadUrlInfo(videoInfo2)) {
                    this.currentResolution = videoInfo2.getResolution();
                } else {
                    return;
                }
            }
            VideoInfo videoInfo3 = videoModel2.getVideoInfo(this.resolution, VideoRef.TYPE_VIDEO, this.params, true);
            if (videoInfo3 != null) {
                if (_downloadUrlInfo(videoInfo3)) {
                    this.currentResolution = videoInfo3.getResolution();
                } else {
                    return;
                }
            }
        }
        if (this.downloader != null) {
            this.downloader.resume(this);
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(DownloadVidTask.class)) {
            return false;
        }
        DownloadVidTask downloadVidTask = (DownloadVidTask) obj;
        if (this.mediaKeys != null && this.mediaKeys.size() > 0 && downloadVidTask.mediaKeys != null) {
            return this.mediaKeys.equals(downloadVidTask.mediaKeys);
        }
        if (this.videoId != null && downloadVidTask.videoId != null) {
            z = this.videoId.equals(downloadVidTask.videoId);
        } else if (this.videoId == null && downloadVidTask.videoId == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.baseDashEnable != downloadVidTask.baseDashEnable) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || !this.codecType.equals(downloadVidTask.codecType)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 || this.resolution != downloadVidTask.resolution) {
            return false;
        }
        return true;
    }

    public String getAuthorization(String str) {
        String str2;
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "getAuthorization " + str);
        String base64Decode = TTHelper.base64Decode(str);
        if (TextUtils.isEmpty(base64Decode)) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "getAuthorization result null");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(base64Decode);
            String optString = jSONObject.optString("GetPlayInfoToken");
            if (!TextUtils.isEmpty(optString)) {
                base64Decode = optString;
            }
            str2 = jSONObject.optString("TokenVersion");
        } catch (JSONException e) {
            e.printStackTrace();
            str2 = "";
        }
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "getAuthorization result:" + base64Decode + ", version:" + str2);
        return base64Decode;
    }

    public void setVideoModel(VideoModel videoModel2) {
        this.videoModel = videoModel2;
        String videoRefStr = videoModel2.getVideoRefStr(SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST);
        String videoRefStr2 = videoModel2.getVideoRefStr(SmEvents.EVENT_AUTO_END);
        if (!TextUtils.isEmpty(videoRefStr)) {
            this.fallbackAPI = videoRefStr;
            TTVideoEngineLog.m256505i("TTVideoEngine.DownloadVidTask", "[downloader] set fallbackapi " + videoRefStr);
        }
        if (!TextUtils.isEmpty(videoRefStr2)) {
            this.keySeed = videoRefStr2;
            TTVideoEngineLog.m256505i("TTVideoEngine.DownloadVidTask", "[downloader] set keyseed " + this.keySeed);
        }
    }

    private boolean _downloadUrlInfo(VideoInfo videoInfo) {
        String[] valueStrArr = videoInfo.getValueStrArr(16);
        String valueStr = videoInfo.getValueStr(15);
        if (valueStrArr == null || valueStrArr.length < 1 || TextUtils.isEmpty(valueStr)) {
            receiveError(new Error("kTTVideoErrorDomainFetchingInfo", -9996, 0, "error info  urls or filehash is null: apiString = " + this.apiString + " authString = " + this.authString + " filehash = " + valueStr));
            return false;
        }
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] download urlinfo videoId = " + this.videoId + " " + videoInfo.getResolution().toString() + " filehash = " + valueStr);
        this.mediaKeys.add(valueStr);
        this.usingUrls.put(valueStr, Arrays.asList(valueStrArr));
        String downloadUrl = DataLoaderHelper.getDataLoader().downloadUrl(valueStr, this.videoId, valueStrArr, this.encryptVersion.getVersion());
        if (DataLoaderHelper.getDataLoader().startDownload(downloadUrl)) {
            return true;
        }
        receiveError(new Error("kTTVideoErrorDomainDownload", -9996, 0, "resume download fail. url = " + downloadUrl + " dataloader state is " + DataLoaderHelper.getDataLoader().isRunning()));
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.download.DownloadTask
    public void assignWithJson(JSONObject jSONObject) {
        super.assignWithJson(jSONObject.optJSONObject("base_json"));
        this.codecType = jSONObject.optString("codec_type");
        this.baseDashEnable = jSONObject.optBoolean("base_dash");
        this.httpsEnable = jSONObject.optBoolean("https");
        this.boeEnable = jSONObject.optBoolean("boe");
        Resolution forString = Resolution.forString(jSONObject.optString(CommonCode.MapKey.HAS_RESOLUTION));
        this.resolution = forString;
        if (forString == Resolution.Undefine) {
            this.resolution = Resolution.Standard;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("param");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            this.params = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.params.put(Integer.valueOf(next), optJSONObject.optString(next));
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("resolution_map");
        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
            this.resolutionMap = new HashMap<>();
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                this.resolutionMap.put(next2, Resolution.forString(optJSONObject2.optString(next2)));
            }
        }
        this.apiVersion = jSONObject.optInt("api_version");
        this.currentResolution = Resolution.forString(jSONObject.optString("curr_resolution"));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("video_model");
        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
            VideoModel videoModel2 = new VideoModel();
            try {
                videoModel2.extractFields(optJSONObject3);
            } catch (Throwable unused) {
                TTVideoEngineLog.m256503e("TTVideoEngine.DownloadVidTask", "[downloader] ssignWithJson fail.");
                videoModel2 = null;
            } finally {
                setVideoModel(videoModel2);
            }
        }
    }

    /* access modifiers changed from: private */
    public class MyFetcherListener implements VideoInfoFetcher.FetcherListener {
        private final WeakReference<DownloadVidTask> mTaskItemRef;

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onLog(String str) {
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onRetry(Error error) {
        }

        public MyFetcherListener(DownloadVidTask downloadVidTask) {
            this.mTaskItemRef = new WeakReference<>(downloadVidTask);
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onCompletion(VideoModel videoModel, Error error) {
            DownloadVidTask downloadVidTask = this.mTaskItemRef.get();
            if (downloadVidTask != null) {
                TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "did fetch video modeo, videoId is " + downloadVidTask.videoId);
                if (downloadVidTask.getState() == 4 || downloadVidTask.getState() == 5) {
                    TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "but state is canceled. videoId = " + downloadVidTask.videoId);
                } else if (videoModel != null) {
                    downloadVidTask.setVideoModel(videoModel);
                    if (downloadVidTask.getState() == 3) {
                        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "but state is suspended. videoId = " + downloadVidTask.videoId);
                        return;
                    }
                    downloadVidTask._downloadWithVideoModel(videoModel);
                } else if (error != null) {
                    downloadVidTask.receiveError(error);
                }
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onStatusException(int i, String str) {
            DownloadVidTask downloadVidTask = this.mTaskItemRef.get();
            if (downloadVidTask != null) {
                downloadVidTask.receiveError(new Error("kTTVideoErrorDomainFetchingInfo", -9996, i, "error info: apiString = " + DownloadVidTask.this.apiString + " authString = " + DownloadVidTask.this.authString + " apiVersion = " + DownloadVidTask.this.apiVersion + " state = " + i));
            }
        }
    }

    static DownloadVidTask taskItem(VideoModel videoModel2, Resolution resolution2) {
        if (videoModel2 == null || resolution2 == null) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] videoModel or resolution is invalid");
            return null;
        }
        String videoRefStr = videoModel2.getVideoRefStr(2);
        if (TextUtils.isEmpty(videoRefStr)) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] videoId is invalid");
            return null;
        }
        DownloadVidTask taskItem = taskItem();
        taskItem.videoId = videoRefStr;
        taskItem.setVideoModel(videoModel2);
        taskItem.resolution = resolution2;
        if (Arrays.asList(videoModel2.getCodecs()).contains("bytevc2")) {
            taskItem.codecType = "bytevc2";
        } else if (Arrays.asList(videoModel2.getCodecs()).contains("bytevc1")) {
            taskItem.codecType = "bytevc1";
        }
        String dynamicType = videoModel2.getDynamicType();
        if (dynamicType != null) {
            taskItem.baseDashEnable = dynamicType.equals("segment_base");
        }
        taskItem.httpsEnable = videoModel2.getVideoRefBool(106);
        return taskItem;
    }

    static DownloadVidTask taskItem(String str, Resolution resolution2, String str2, boolean z, boolean z2) {
        return taskItem(str, resolution2, str2, z, z2, null);
    }

    static DownloadVidTask taskItem(String str, Resolution resolution2, boolean z, boolean z2, boolean z3) {
        String str2;
        if (z) {
            str2 = "bytevc1";
        } else {
            str2 = "h264";
        }
        return taskItem(str, resolution2, str2, z2, z3);
    }

    static DownloadVidTask taskItem(String str, Resolution resolution2, String str2, boolean z, boolean z2, String str3) {
        return taskItem(str, resolution2, str2, z, z2, str3, DownloadTask.EncryptVersion.NONE);
    }

    static DownloadVidTask taskItem(String str, Resolution resolution2, String str2, boolean z, boolean z2, String str3, DownloadTask.EncryptVersion encryptVersion) {
        TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "taskItem videoId:" + str + ", resolution:" + resolution2 + ", codecType:" + str2 + ", baseDashEnable:" + z + ", httpsEnable:" + z2 + ",authToken:" + str3);
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader] videoId is invalid");
            return null;
        } else if (resolution2 == null) {
            TTVideoEngineLog.m256500d("TTVideoEngine.DownloadVidTask", "[downloader]  resolution is invalid");
            return null;
        } else {
            DownloadVidTask taskItem = taskItem();
            taskItem.videoId = str;
            taskItem.resolution = resolution2;
            taskItem.codecType = str2;
            taskItem.baseDashEnable = z;
            taskItem.httpsEnable = z2;
            taskItem.authToken = str3;
            taskItem.encryptVersion = encryptVersion;
            return taskItem;
        }
    }
}
