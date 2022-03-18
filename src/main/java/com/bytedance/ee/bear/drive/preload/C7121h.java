package com.bytedance.ee.bear.drive.preload;

import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.C7501e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.DataLoaderListener;
import com.ss.ttvideoengine.PreLoaderItemCallBackInfo;
import com.ss.ttvideoengine.PreloaderURLItem;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.drive.preload.h */
public class C7121h {
    /* renamed from: b */
    public static void m28531b() {
        try {
            C13479a.m54764b("TTVideoEngineWrapper", "cancel all video preload task");
            TTVideoEngine.cancelAllPreloadTasks();
        } catch (Exception e) {
            C13479a.m54761a("TTVideoEngineWrapper", e);
        }
    }

    /* renamed from: a */
    public static void m28528a() {
        try {
            C7501e.m30025i();
            TTVideoEngineLog.turnOn(1, 0);
            TTVideoEngine.setStringValue(0, C6880a.m27109f(C13615c.f35773a).getAbsolutePath());
            TTVideoEngine.setIntValue(1, 104857600);
            TTVideoEngine.setDataLoaderListener(new DataLoaderListener() {
                /* class com.bytedance.ee.bear.drive.preload.C7121h.C71221 */

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public String apiStringForFetchVideoModel(Map<String, String> map, String str, Resolution resolution) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public String authStringForFetchVideoModel(String str, Resolution resolution) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public String getCheckSumInfo(String str) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public HashMap<String, String> getCustomHttpHeaders(String str) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onLoadProgress(DataLoaderHelper.DataLoaderTaskLoadProgress dataLoaderTaskLoadProgress) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onLogInfoToMonitor(int i, String str, JSONObject jSONObject) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onNotifyCDNLog(DataLoaderCDNLog dataLoaderCDNLog) {
                    C13479a.m54772d("TTVideoEngineWrapper", "onNotifyCDNLog(DataLoaderCDNLog log). ");
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public boolean loadLibrary(String str) {
                    C13479a.m54772d("TTVideoEngineWrapper", "loadLibrary. ");
                    return false;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onNotifyCDNLog(JSONObject jSONObject) {
                    C13479a.m54772d("TTVideoEngineWrapper", "onNotifyCDNLog(JSONObject log). ");
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onTaskProgress(DataLoaderHelper.DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo) {
                    C13479a.m54772d("TTVideoEngineWrapper", "<onTaskProgress> " + dataLoaderTaskProgressInfo.mCacheSizeFromZero + "<key> " + dataLoaderTaskProgressInfo.mKey + "<mediaSize> " + dataLoaderTaskProgressInfo.mMediaSize);
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void dataLoaderError(String str, int i, Error error) {
                    C13479a.m54772d("TTVideoEngineWrapper", "<dataLoaderError>" + error.description);
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onLogInfo(int i, String str, JSONObject jSONObject) {
                    C13479a.m54772d("TTVideoEngineWrapper", "<onLogInfo>" + str + "_" + jSONObject.toString());
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onNotify(int i, long j, long j2, String str) {
                    C13479a.m54772d("TTVideoEngineWrapper", "<onNotify>" + str);
                }
            });
            TTVideoEngine.startDataLoader(C13615c.f35773a);
        } catch (Exception e) {
            C13479a.m54761a("TTVideoEngineWrapper", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28529a(PreLoaderItemCallBackInfo preLoaderItemCallBackInfo) {
        if (preLoaderItemCallBackInfo == null) {
            C13479a.m54758a("TTVideoEngineWrapper", "preload info is empty");
        } else if (preLoaderItemCallBackInfo.getKey() == 2) {
            C13479a.m54764b("TTVideoEngineWrapper", "preload success " + preLoaderItemCallBackInfo.preloadDataInfo.mLocalFilePath);
        } else {
            C13479a.m54758a("TTVideoEngineWrapper", "preload not success " + preLoaderItemCallBackInfo.getKey());
        }
    }

    /* renamed from: a */
    public static void m28530a(String str, String str2, String str3, long j) {
        PreloaderURLItem preloaderURLItem = new PreloaderURLItem(str2, (String) null, j, new String[]{str3});
        preloaderURLItem.setCustomHeader("Cookie", "bear-session=" + str);
        preloaderURLItem.setCallBackListener($$Lambda$h$6MD3SCUwtMCyK8io_4hBouX5j8.INSTANCE);
        TTVideoEngine.addTask(preloaderURLItem);
    }
}
