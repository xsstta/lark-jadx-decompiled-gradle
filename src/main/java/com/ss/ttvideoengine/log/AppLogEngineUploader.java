package com.ss.ttvideoengine.log;

import android.content.Context;
import android.text.TextUtils;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Iterator;
import org.json.JSONObject;

public class AppLogEngineUploader implements VideoEventEngineUploader {
    private Context mContext;

    /* access modifiers changed from: private */
    public static class Holder {
        public static final AppLogEngineUploader instance = new AppLogEngineUploader();

        private Holder() {
        }
    }

    private AppLogEngineUploader() {
    }

    public static AppLogEngineUploader getInstance() {
        return Holder.instance;
    }

    static void logPrint(final JSONObject jSONObject) {
        EngineThreadPool.addExecuteTask(new Runnable() {
            /* class com.ss.ttvideoengine.log.AppLogEngineUploader.RunnableC654481 */

            public void run() {
                if (jSONObject != null) {
                    TTVideoEngineLog.m256505i("AppLogEngineUploader", "video statistics start");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            if (next != null) {
                                TTVideoEngineLog.m256505i("AppLogEngineUploader", "video statistics:" + next + ":" + jSONObject.get(next));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    TTVideoEngineLog.m256505i("AppLogEngineUploader", "video statistics end");
                }
            }
        });
    }

    @Override // com.ss.ttvideoengine.log.VideoEventEngineUploader
    public void onEvent(String str, JSONObject jSONObject) {
        EngineThreadPool.addExecuteTask(new Runnable(str, jSONObject) {
            /* class com.ss.ttvideoengine.log.$$Lambda$AppLogEngineUploader$XGBsYtRkXmmRAhuYSgjUN3x_70 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ JSONObject f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AppLogEngineUploader.this.lambda$onEvent$0$AppLogEngineUploader(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.ttvideoengine.log.VideoEventEngineUploader
    public void onEventV2(String str, JSONObject jSONObject) {
        EngineThreadPool.addExecuteTask(new Runnable(str, jSONObject) {
            /* class com.ss.ttvideoengine.log.$$Lambda$AppLogEngineUploader$tUlnkBSGAlJoxCn5NXPUjmDgnk */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                AppLogEngineUploader.lambda$onEventV2$1(this.f$0, this.f$1);
            }
        });
    }

    public void setReportLogByEngine(boolean z, Context context) {
        this.mContext = context;
        if (z) {
            DataLoaderHelper.getDataLoader().setEngineUploader(this);
            VideoEventManager.instance.setEngineUploader(this);
            return;
        }
        DataLoaderHelper.getDataLoader().setEngineUploader(null);
        VideoEventManager.instance.setEngineUploader(null);
    }

    static /* synthetic */ void lambda$onEventV2$1(String str, JSONObject jSONObject) {
        TTVideoEngineLog.m256505i("AppLogEngineUploader", "onEventV2 monitorName " + str);
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            logPrint(jSONObject);
            try {
                jSONObject.putOpt("params_for_special", "videoplayer_monitor");
                Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class).invoke(null, str, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
                TTVideoEngineLog.m256503e("AppLogEngineUploader", "upload error " + e);
            }
        }
    }

    public /* synthetic */ void lambda$onEvent$0$AppLogEngineUploader(String str, JSONObject jSONObject) {
        TTVideoEngineLog.m256505i("AppLogEngineUploader", "onEvent event " + str);
        if (jSONObject != null) {
            logPrint(jSONObject);
            try {
                Class<?> cls = Class.forName("com.ss.android.common.applog.AppLog");
                jSONObject.put("session_id", (String) cls.getMethod("getCurrentSessionId", new Class[0]).invoke(null, new Object[0]));
                cls.getMethod("recordMiscLog", Context.class, String.class, JSONObject.class).invoke(null, this.mContext, str, jSONObject);
            } catch (Exception e) {
                TTVideoEngineLog.m256503e("AppLogEngineUploader", "upload error " + e.toString());
            }
        }
    }
}
