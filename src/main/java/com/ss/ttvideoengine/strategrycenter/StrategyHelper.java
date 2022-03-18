package com.ss.ttvideoengine.strategrycenter;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.vcloud.strategy.ILogCallback;
import com.bytedance.vcloud.strategy.IStrategyEventListener;
import com.bytedance.vcloud.strategy.IStrategyStateSupplier;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.ttvideoengine.TTNetWorkListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.preload.PreloadScene;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class StrategyHelper {
    private String mAlgorithmJson;
    private int mAppID;
    private StrategyCenter mCenter;
    private boolean mCheckPlayerVer;
    private Context mContext;
    private boolean mDidSetAppInfo;
    private long mIOManager;
    private long mIOManagerVersion;
    private int mLogLevel = 5;
    private String mPlayLoadAlgorithmJson;
    private String mPlayRangeAlgorithmJson;
    private boolean mPlayerIsMatch;
    private String mPreloadTimelinessAlgorithmJson;
    private String mSmartPreloadAlgorithmJson;
    private String mSmartRangeAlgorithmJson;
    public IStrategyStateSupplier mSupplier;

    /* access modifiers changed from: package-private */
    public static class MyALogCallBak implements ILogCallback {
        MyALogCallBak() {
        }

        public void log(String str) {
            TTVideoEngineLog.m256505i("StrategyHelper", str);
        }
    }

    /* access modifiers changed from: private */
    public static class StrategyHelperHolder {
        public static final StrategyHelper Instance = new StrategyHelper();

        private StrategyHelperHolder() {
        }
    }

    public static StrategyHelper helper() {
        return StrategyHelperHolder.Instance;
    }

    public int getLogLevel() {
        return this.mLogLevel;
    }

    public IStrategyStateSupplier getSupplier() {
        return this.mSupplier;
    }

    public boolean playerIsMatch() {
        return this.mPlayerIsMatch;
    }

    public boolean needCheckPlayerVersion() {
        return !this.mCheckPlayerVer;
    }

    public boolean isRunning() {
        return getCenter().mo70647b();
    }

    public StrategyCenter getCenter() {
        if (this.mCenter == null) {
            this.mCenter = new StrategyCenter(new MyIStrategyEventListener());
        }
        return this.mCenter;
    }

    private void _configParams() {
        getCenter().mo70629a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, this.mLogLevel);
        getCenter().mo70629a(801, StrategyKeys.mInteractionBlockDurationPreloaded);
        getCenter().mo70629a(802, StrategyKeys.mInteractionBlockDurationNonPreloaded);
        if (this.mAlgorithmJson != null) {
            getCenter().mo70630a(31001, this.mAlgorithmJson);
        }
        if (this.mSmartPreloadAlgorithmJson != null) {
            getCenter().mo70630a(31002, this.mSmartPreloadAlgorithmJson);
        }
        if (this.mPreloadTimelinessAlgorithmJson != null) {
            getCenter().mo70630a(31003, this.mPreloadTimelinessAlgorithmJson);
        }
        if (this.mPlayLoadAlgorithmJson != null) {
            getCenter().mo70630a(31004, this.mPlayLoadAlgorithmJson);
        }
        if (this.mPlayRangeAlgorithmJson != null) {
            getCenter().mo70630a(31005, this.mPlayRangeAlgorithmJson);
        }
        if (this.mSmartRangeAlgorithmJson != null) {
            getCenter().mo70630a(31006, this.mSmartRangeAlgorithmJson);
        }
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setSupplier(IStrategyStateSupplier iStrategyStateSupplier) {
        this.mSupplier = iStrategyStateSupplier;
    }

    /* access modifiers changed from: package-private */
    public class MyIStrategyEventListener implements IStrategyEventListener {
        public void onEvent(String str, int i, int i2, String str2) {
        }

        MyIStrategyEventListener() {
        }

        public void onEventLog(String str, String str2) {
            TTVideoEngineLog.m256500d("StrategyHelper", "eventName: " + str + ", logInfo: " + str2);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    VideoEventManager.instance.addEventV2(true, new JSONObject(str2), str);
                } catch (JSONException e) {
                    TTVideoEngineLog.m256501d(e);
                }
            }
        }
    }

    public void setLogLevel(int i) {
        getCenter().mo70629a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, i);
        this.mLogLevel = i;
    }

    public boolean checkPlayerVersion(int i) {
        if (i != -1) {
            boolean z = true;
            this.mCheckPlayerVer = true;
            if (getCenter().mo70652e() != i) {
                z = false;
            }
            this.mPlayerIsMatch = z;
        }
        return this.mPlayerIsMatch;
    }

    public void start(boolean z) {
        String str;
        getCenter().mo70640a(z);
        _configParams();
        if (this.mAlgorithmJson == null) {
            if (this.mAppID == 32) {
                str = "{\"strategy_center_v1\":{\"feed\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}},\"fullscreen_immersive\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}},\"story\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}}}}";
            } else {
                str = "{\"strategy_center_v1\":{\"engine_default\":{\"preload_strategy\":{\"name\":\"default\",\"tasks\":[{\"download_progress\":100,\"count\":5,\"offset\":0,\"size\":800}]}},\"video_range_request\":{\"enable_concurrent_download\":0,\"allowed_segment_download\":0,\"fixed_size\":3000,\"fixed_duration\":10}}}";
            }
            setAlgorithmJson(31001, str);
        }
        getCenter().mo70646b(z);
        getCenter().mo70631a(this.mIOManager, this.mIOManagerVersion);
        if (!getCenter().mo70651d()) {
            TTVideoEngineLog.m256505i("StrategyHelper", "io manager interface not match, start fail.");
            getCenter().mo70648c();
            return;
        }
        getCenter().mo70633a(new MyALogCallBak());
        PreloadScene preloadScene = new PreloadScene("engine_default");
        preloadScene.mSceneId = "engine_default";
        preloadScene.mAutoPlay = 1;
        preloadScene.mMute = 0;
        preloadScene.mMaxVisibleCardCnt = 1;
        preloadScene.setAlgorithmName("engine_default");
        helper().getCenter().mo70635a(preloadScene.toJsonString());
        helper().getCenter().mo70649c("engine_default");
        getCenter().mo70634a(new IStrategyStateSupplier() {
            /* class com.ss.ttvideoengine.strategrycenter.StrategyHelper.C654841 */

            public double getNetworkSpeed() {
                if (StrategyHelper.this.mSupplier != null) {
                    return StrategyHelper.this.mSupplier.getNetworkSpeed();
                }
                return 0.0d;
            }

            public int getNetworkType() {
                int currentAccessType = TTNetWorkListener.getInstance().getCurrentAccessType();
                if (currentAccessType == 0) {
                    return 20;
                }
                if (currentAccessType == 1) {
                    return 10;
                }
                return 0;
            }

            public String mediaInfoJsonString(String str) {
                Map<String, Object> mediaInfo;
                if (StrategyHelper.this.mSupplier == null || (mediaInfo = StrategyHelper.this.mSupplier.mediaInfo(str)) == null) {
                    return null;
                }
                try {
                    return new JSONObject(mediaInfo).toString();
                } catch (Throwable unused) {
                    return null;
                }
            }

            public String selectBitrateJsonString(String str, int i) {
                Map<String, Integer> selectBitrate;
                if (StrategyHelper.this.mSupplier == null || (selectBitrate = StrategyHelper.this.mSupplier.selectBitrate(str, i)) == null) {
                    return null;
                }
                try {
                    return new JSONObject(selectBitrate).toString();
                } catch (Throwable unused) {
                    return null;
                }
            }

            public String selectBitrateJsonString(String str, String str2, int i) {
                Map<String, Integer> selectBitrate;
                if (StrategyHelper.this.mSupplier == null || (selectBitrate = StrategyHelper.this.mSupplier.selectBitrate(new StrategyMediaParam(str, str2, i))) == null) {
                    return null;
                }
                try {
                    return new JSONObject(selectBitrate).toString();
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void setIOManager(long j, long j2) {
        this.mIOManager = j;
        this.mIOManagerVersion = j2;
    }

    public void configAppInfo(String str, Map map) {
        if (!this.mDidSetAppInfo && getCenter().mo70641a()) {
            getCenter().mo70653e(str);
            this.mDidSetAppInfo = true;
        }
        if (map != null && map.containsKey(HiAnalyticsConstant.HaKey.BI_KEY_APPID)) {
            this.mAppID = TTHelper.parseInt(map.get(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        }
    }

    public void setAlgorithmJson(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("StrategyHelper", "[preload] Algorithm json " + str);
            return;
        }
        switch (i) {
            case 31001:
                this.mAlgorithmJson = str;
                break;
            case 31002:
                this.mSmartPreloadAlgorithmJson = str;
                break;
            case 31003:
                this.mPreloadTimelinessAlgorithmJson = str;
                break;
            case 31004:
                this.mPlayLoadAlgorithmJson = str;
                break;
            case 31005:
                this.mPlayRangeAlgorithmJson = str;
                break;
            case 31006:
                this.mSmartRangeAlgorithmJson = str;
                break;
        }
        if (getCenter().mo70641a()) {
            getCenter().mo70630a(i, str);
        }
    }

    public void playSelection(String str, int i, int i2) {
        getCenter().mo70637a(str, i, i2);
    }

    public static String buildMediaInfo(String str, String str2, String[] strArr) {
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("urls", strArr);
            hashMap2.put("file_hash", str2);
            arrayList.add(hashMap2);
            hashMap.put("vid", str);
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap).toString();
        } catch (Throwable th) {
            TTVideoEngineLog.m256503e("StrategyHelper", th.toString());
            return null;
        }
    }
}
