package com.ss.ttvideoengine.fetcher;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngineConfig;
import com.ss.ttvideoengine.VideoModelCache;
import com.ss.ttvideoengine.database.VideoModelDBManager;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.net.NetUtils;
import com.ss.ttvideoengine.net.TTHTTPNetwork;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoInfoFetcher {
    private String[] EnvParamsStrs = {"device_type", "device_id", "ac", "aid", "device_platform", "ab_version", "app_name", "version_code", "os_version", "menifest_version_code", "update_version_code", "user_id", "web_id", "player_version", "barragemask"};
    private String[] ParamsStrs = {"Action", "Version", "video_id", "codec_type", "base64", "url_type", "format_type", "ptoken", "preload", "cdn_type"};
    private boolean isExternNetClient;
    public String mApiString = "";
    private String mAuth;
    public boolean mCancelled;
    private Context mContext;
    private JSONObject mEnvParams;
    public int mErrorCode = -1;
    private Future mFuture;
    private boolean mGetMethodEnable = true;
    private Handler mHandler;
    private String mHost;
    private String mKeyseed;
    public FetcherListener mListener;
    private TTVNetClient mNetworkSession;
    private JSONObject mParams;
    private int mPlayVersion;
    private String mProjectTag;
    private HashMap<String, Resolution> mResolutionMap;
    private int mRetryIndex;
    private long mStartFetchT;
    private int mType;
    private String mURLWithoutParams;
    private boolean mUseFallbakApi;
    private boolean mUseVideoModelCache;
    public String mVID;
    public VideoModel mVideoModel;
    private TreeMap<String, String> queryMap;

    public interface FetcherListener {
        void onCompletion(VideoModel videoModel, Error error);

        void onLog(String str);

        void onRetry(Error error);

        void onStatusException(int i, String str);
    }

    public void cancel() {
        synchronized (this) {
            this.mHandler.removeCallbacksAndMessages(null);
            FetcherListener fetcherListener = this.mListener;
            if (fetcherListener != null) {
                fetcherListener.onLog("fetcher cancelled");
                if (!this.mCancelled) {
                    this.mCancelled = true;
                    Future future = this.mFuture;
                    if (future != null) {
                        future.cancel(true);
                    }
                    this.mNetworkSession.cancel();
                }
            }
        }
    }

    private void _fetchInfoInternal() {
        if (this.mUseVideoModelCache && (TextUtils.isEmpty(this.mApiString) || !NetUtils.isNetAvailable(this.mContext))) {
            TTVideoEngineLog.m256505i("VideoInfoFetcher", "get videomodel from DB");
            EngineThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.ttvideoengine.fetcher.VideoInfoFetcher.RunnableC654451 */

                public void run() {
                    VideoModelDBManager.CacheInfo query = VideoModelDBManager.query(VideoInfoFetcher.this.mVID);
                    if (query != null && !TextUtils.isEmpty(query.videoModelStr)) {
                        try {
                            JSONObject jSONObject = new JSONObject(query.videoModelStr);
                            TTVideoEngineLog.m256505i("VideoInfoFetcher", "using videomodel from DB");
                            VideoInfoFetcher.this._getInfoSuccess(jSONObject, query);
                            return;
                        } catch (Exception e) {
                            TTVideoEngineLog.m256503e("VideoInfoFetcher", e.toString());
                        }
                    }
                    if (TextUtils.isEmpty(VideoInfoFetcher.this.mApiString)) {
                        VideoInfoFetcher.this._notifyError(new Error("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty and no cache"));
                        return;
                    }
                    VideoInfoFetcher videoInfoFetcher = VideoInfoFetcher.this;
                    videoInfoFetcher._beginToFetch(videoInfoFetcher.mApiString, null);
                }
            });
        } else if (TextUtils.isEmpty(this.mApiString)) {
            _notifyError(new Error("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty"));
        } else {
            _beginToFetch(this.mApiString, null);
        }
    }

    public void setListener(FetcherListener fetcherListener) {
        this.mListener = fetcherListener;
    }

    public void setPlayType(int i) {
        this.mType = i;
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        this.mResolutionMap = hashMap;
    }

    public void setVideoID(String str) {
        this.mVID = str;
    }

    public void setUseFallbakApi(Boolean bool) {
        this.mUseFallbakApi = bool.booleanValue();
    }

    private void _notifyShouldRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(0, error));
    }

    public void setUseVideoModelCache(boolean z) {
        this.mUseVideoModelCache = z;
        if (z) {
            VideoModelDBManager.getInstance(this.mContext);
        }
    }

    private void _notifySuccess(VideoModel videoModel) {
        TTVideoEngineLog.m256505i("VideoInfoFetcher", "_notifySuccess");
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, videoModel));
    }

    public void _notifyError(Error error) {
        TTVideoEngineLog.m256505i("VideoInfoFetcher", "_notifyError " + error);
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    private static class MyHandler extends Handler {
        private final WeakReference<VideoInfoFetcher> mFetcherRef;

        public void handleMessage(Message message) {
            FetcherListener fetcherListener;
            VideoInfoFetcher videoInfoFetcher = this.mFetcherRef.get();
            if (videoInfoFetcher != null && (fetcherListener = videoInfoFetcher.mListener) != null) {
                if (videoInfoFetcher.mCancelled) {
                    fetcherListener.onLog("fetcher is cancelled");
                    return;
                }
                int i = message.what;
                if (i == 0) {
                    fetcherListener.onRetry((Error) message.obj);
                } else if (i == 1) {
                    fetcherListener.onCompletion(null, (Error) message.obj);
                } else if (i == 2) {
                    VideoModel videoModel = (VideoModel) message.obj;
                    videoInfoFetcher.mVideoModel = videoModel;
                    fetcherListener.onCompletion(videoModel, null);
                } else if (i == 3) {
                    fetcherListener.onStatusException(message.arg1, (String) message.obj);
                }
            }
        }

        public MyHandler(VideoInfoFetcher videoInfoFetcher, Looper looper) {
            super(looper);
            this.mFetcherRef = new WeakReference<>(videoInfoFetcher);
        }
    }

    public void _retryIfNeeded(Error error) {
        TTVideoEngineLog.m256505i("VideoInfoFetcher", "_retryIfNeeded error " + error);
        synchronized (this) {
            if (!this.mCancelled) {
                if (error == null) {
                    error = new Error("kTTVideoErrorDomainFetchingInfo", -9994);
                } else if (TextUtils.isEmpty(error.domain) && error.code == -9979) {
                    error = new Error("kTTVideoErrorDomainFetchingInfo", -9979, error.internalCode, error.description);
                } else if (TextUtils.isEmpty(error.domain)) {
                    error = new Error("kTTVideoErrorDomainFetchingInfo", -9994, error.internalCode, error.description);
                }
                if (error.code == -9969) {
                    if (error.internalCode / HwBuildEx.VersionCodes.CUR_DEVELOPMENT != 10) {
                        if (error.internalCode != -9970) {
                            error.code = -9990;
                        }
                    }
                    error.description += ("<apiStr:" + this.mApiString + ">");
                    _notifyError(error);
                    return;
                }
                if (this.mRetryIndex < 1) {
                    _notifyShouldRetry(error);
                    this.mRetryIndex++;
                    _fetchInfoInternal();
                } else {
                    error.description += ("<apiStr:" + this.mApiString + ">");
                    _notifyError(error);
                }
            }
        }
    }

    private String _parseAPIString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "_parseAPIString:apistring is empty";
        }
        try {
            this.mHost = new URL(str).getHost();
            String[] split = str.split("[?]");
            if (split.length < 2) {
                return "_parseAPIString:apistring param is empty";
            }
            String[] split2 = split[1].split(ContainerUtils.FIELD_DELIMITER);
            this.mURLWithoutParams = split[0] + "?";
            this.mEnvParams = new JSONObject();
            this.mParams = new JSONObject();
            this.queryMap = new TreeMap<>();
            for (int i = 0; i < split2.length; i++) {
                if (this.mGetMethodEnable) {
                    String[] split3 = split2[i].split(ContainerUtils.KEY_VALUE_DELIMITER);
                    this.queryMap.put(split3[0], split3[1]);
                } else if (split2[i].indexOf("Action") == 0 || split2[i].indexOf("Version") == 0) {
                    this.mURLWithoutParams += split2[i];
                    this.mURLWithoutParams += ContainerUtils.FIELD_DELIMITER;
                    String[] split4 = split2[i].split(ContainerUtils.KEY_VALUE_DELIMITER);
                    this.queryMap.put(split4[0], split4[1]);
                } else {
                    String[] split5 = split2[i].split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split5.length >= 2) {
                        String str2 = split5[0];
                        String str3 = split5[1];
                        for (int i2 = 2; i2 < split5.length; i2++) {
                            str3 = str3 + ContainerUtils.KEY_VALUE_DELIMITER + split5[i2];
                        }
                        int i3 = 0;
                        while (true) {
                            try {
                                String[] strArr = this.EnvParamsStrs;
                                if (i3 >= strArr.length) {
                                    break;
                                }
                                if (strArr[i3].equals(str2)) {
                                    this.mEnvParams.put(str2, str3);
                                }
                                i3++;
                            } catch (JSONException unused) {
                                return "_parseAPIString:put params error";
                            }
                        }
                        int i4 = 0;
                        while (true) {
                            String[] strArr2 = this.ParamsStrs;
                            if (i4 >= strArr2.length) {
                                break;
                            }
                            if (strArr2[i4].equals(str2)) {
                                this.mParams.put(str2, str3);
                            }
                            i4++;
                        }
                    }
                }
            }
            String str4 = this.mURLWithoutParams;
            this.mURLWithoutParams = str4.substring(0, str4.length() - 1);
            return null;
        } catch (Throwable unused2) {
            return "_parseAPIString:apistring to URL error";
        }
    }

    public void fetchInfo(String str, String str2) {
        this.mApiString = str;
        this.mAuth = str2;
        this.mRetryIndex = 0;
        _fetchInfoInternal();
    }

    private void _notifyException(int i, String str) {
        TTVideoEngineLog.m256505i("VideoInfoFetcher", "_notifyException " + i + ", excMessage " + str);
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, i, 0, str));
    }

    public VideoInfoFetcher(Context context, TTVNetClient tTVNetClient) {
        TTVNetClient tTVNetClient2;
        this.mContext = context;
        this.mHandler = new MyHandler(this, TTHelper.getLooper());
        if (tTVNetClient != null || TTVideoEngineConfig.gNetClient == null) {
            tTVNetClient2 = tTVNetClient;
        } else {
            tTVNetClient2 = TTVideoEngineConfig.gNetClient;
        }
        if (tTVNetClient2 == null) {
            this.isExternNetClient = false;
            this.mNetworkSession = new TTHTTPNetwork();
        } else {
            this.isExternNetClient = true;
            this.mNetworkSession = tTVNetClient2;
        }
        this.mProjectTag = "";
    }

    public void _beginToFetch(String str, JSONObject jSONObject) {
        HashMap hashMap;
        TTVideoEngineLog.m256505i("VideoInfoFetcher", "_beginToFetch url " + str);
        this.mStartFetchT = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(this.mAuth)) {
            hashMap = new HashMap();
            hashMap.put("Authorization", this.mAuth);
        } else {
            hashMap = null;
        }
        Method[] declaredMethods = this.mNetworkSession.getClass().getDeclaredMethods();
        boolean z = false;
        if (declaredMethods != null && declaredMethods.length > 0) {
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Method method = declaredMethods[i];
                    if (method != null && method.getName() != null && method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.mNetworkSession.startTask(str, hashMap, (JSONObject) null, 0, new TTVNetClient.CompletionListener() {
                /* class com.ss.ttvideoengine.fetcher.VideoInfoFetcher.C654462 */

                @Override // com.ss.ttvideoengine.net.TTVNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    if (jSONObject != null || error == null) {
                        if (error != null) {
                            VideoInfoFetcher.this.mErrorCode = error.internalCode;
                        }
                        VideoInfoFetcher.this._getInfoSuccess(jSONObject, null);
                        return;
                    }
                    VideoInfoFetcher.this._retryIfNeeded(error);
                }
            });
        } else {
            this.mNetworkSession.startTask(str, hashMap, new TTVNetClient.CompletionListener() {
                /* class com.ss.ttvideoengine.fetcher.VideoInfoFetcher.C654473 */

                @Override // com.ss.ttvideoengine.net.TTVNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    if (jSONObject != null || error == null) {
                        VideoInfoFetcher.this._getInfoSuccess(jSONObject, null);
                    } else {
                        VideoInfoFetcher.this._retryIfNeeded(error);
                    }
                }
            });
        }
    }

    public void _getInfoSuccess(JSONObject jSONObject, VideoModelDBManager.CacheInfo cacheInfo) {
        int i;
        TTVideoEngineLog.m256505i("VideoInfoFetcher", "_getInfoSuccess");
        synchronized (this) {
            if (!this.mCancelled) {
                if (jSONObject != null) {
                    VideoModel videoModel = new VideoModel();
                    if (jSONObject.has("ResponseMetadata") || jSONObject.has("Result")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("ResponseMetadata");
                        if (optJSONObject == null) {
                            TTVideoEngineLog.m256505i("VideoInfoFetcher", "_getInfoSuccess metadata is null");
                            return;
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("Error");
                        if (optJSONObject2 != null) {
                            String str = optJSONObject2.toString() + " RequestId:" + optJSONObject.optString("RequestId");
                            if (this.mPlayVersion == 2) {
                                i = optJSONObject2.optInt("CodeN");
                            } else {
                                i = this.mErrorCode;
                            }
                            Error error = new Error("kTTVideoErrorDomainFetchingInfo", -9969, i, str);
                            error.parameters.put("log_id", optJSONObject.optString("RequestId"));
                            _retryIfNeeded(error);
                            return;
                        }
                        JSONObject optJSONObject3 = jSONObject.optJSONObject("Result");
                        if (optJSONObject3 == null) {
                            _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9997, "fetched info Result is empty"));
                            return;
                        }
                        if (this.mPlayVersion == 2) {
                            try {
                                optJSONObject3 = optJSONObject3.optJSONObject("Data");
                            } catch (Throwable th) {
                                _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9977, th.toString()));
                                return;
                            }
                        }
                        if (optJSONObject3 == null) {
                            _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9997, "fetched info Result is empty after decrypt"));
                            return;
                        }
                        try {
                            videoModel.extractFields(optJSONObject3);
                            if (videoModel.hasData() && videoModel.getVideoRefInt(4) != 10 && videoModel.getVideoRefInt(4) != 0 && this.mType == 0) {
                                _notifyException(videoModel.getVideoRefInt(4), "ver2 server side error,hh");
                                return;
                            }
                        } catch (Throwable unused) {
                            _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9976, "fetched info Result is empty after decrypt"));
                            return;
                        }
                    } else {
                        try {
                            if (!TextUtils.isEmpty(this.mKeyseed) || this.mUseFallbakApi) {
                                videoModel.setVideoRefBool(219, true);
                                videoModel.setVideoRefStr(SmEvents.EVENT_AUTO_END, this.mKeyseed);
                            }
                            videoModel.extractFields(jSONObject);
                            int optInt = jSONObject.optInt("code");
                            String optString = jSONObject.optString("message");
                            String optString2 = jSONObject.optString("tttrace_id");
                            if (videoModel.getVideoRef() != null && videoModel.getVideoRefInt(4) != 10 && videoModel.getVideoRefInt(4) != 0 && this.mType == 0) {
                                _notifyException(videoModel.getVideoRefInt(4), optString);
                                return;
                            } else if (optInt != 0) {
                                Error error2 = new Error("kTTVideoErrorDomainFetchingInfo", -9990, optInt, jSONObject.toString());
                                error2.parameters.put("log_id", optString2);
                                _notifyError(error2);
                                return;
                            }
                        } catch (Throwable th2) {
                            _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9976, th2.toString()));
                            return;
                        }
                    }
                    videoModel.setUpResolution(this.mResolutionMap);
                    _notifySuccess(videoModel);
                    if (this.mUseVideoModelCache) {
                        if (cacheInfo == null) {
                            VideoModelDBManager.insert(this.mVID, jSONObject.toString());
                            VideoModelCache.getInstance().put(this.mVID, this.mApiString, videoModel);
                        } else {
                            VideoModelCache.VideoModelCacheInfo videoModelCacheInfo = new VideoModelCache.VideoModelCacheInfo();
                            videoModelCacheInfo.model = videoModel;
                            videoModelCacheInfo.modelGotTime = cacheInfo.time;
                            VideoModelCache.getInstance().put(this.mVID, (String) null, videoModelCacheInfo);
                        }
                    }
                    return;
                }
            }
            TTVideoEngineLog.m256505i("VideoInfoFetcher", "_getInfoSuccess mCancelled " + this.mCancelled + " or jsonObject is null " + jSONObject);
        }
    }

    public void fetchInfo(String str, String str2, int i) {
        fetchInfo(str, str2, i, null);
    }

    public VideoInfoFetcher(Context context, TTVNetClient tTVNetClient, String str) {
        TTVNetClient tTVNetClient2;
        this.mContext = context;
        this.mHandler = new MyHandler(this, TTHelper.getLooper());
        if (tTVNetClient != null || TTVideoEngineConfig.gNetClient == null) {
            tTVNetClient2 = tTVNetClient;
        } else {
            tTVNetClient2 = TTVideoEngineConfig.gNetClient;
        }
        if (tTVNetClient2 == null) {
            this.isExternNetClient = false;
            this.mNetworkSession = new TTHTTPNetwork();
        } else {
            this.isExternNetClient = true;
            this.mNetworkSession = tTVNetClient2;
        }
        this.mProjectTag = str;
    }

    public void fetchInfo(String str, String str2, int i, String str3) {
        TTVideoEngineLog.m256505i("VideoInfoFetcher", "fetchInfo apiString " + str + ", auth " + str2 + ", playversion " + i + ", keyseed " + str3);
        this.mApiString = str;
        this.mAuth = str2;
        this.mRetryIndex = 0;
        this.mPlayVersion = i;
        this.mKeyseed = str3;
        try {
            this.mHost = new URL(str).getHost();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        _fetchInfoInternal();
    }
}
