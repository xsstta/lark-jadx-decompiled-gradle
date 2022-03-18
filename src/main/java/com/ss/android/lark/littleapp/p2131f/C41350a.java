package com.ss.android.lark.littleapp.p2131f;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.f.a */
public class C41350a {

    /* renamed from: a */
    private AtomicBoolean f105172a;

    /* renamed from: com.ss.android.lark.littleapp.f.a$a */
    private static class C41352a {

        /* renamed from: a */
        public static C41350a f105174a = new C41350a();
    }

    /* renamed from: a */
    public static C41350a m163930a() {
        return C41352a.f105174a;
    }

    private C41350a() {
        this.f105172a = new AtomicBoolean(false);
    }

    /* renamed from: b */
    private void m163931b() {
        Logger.registerLogHandler(new Logger.ILogWritter() {
            /* class com.ss.android.lark.littleapp.p2131f.C41350a.C413511 */

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public boolean isLoggable(int i) {
                return true;
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logK(String str, String str2) {
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logD(String str, String str2) {
                Log.m165379d(str, str2);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logE(String str, String str2) {
                Log.m165383e(str, str2);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logI(String str, String str2) {
                Log.m165389i(str, str2);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logV(String str, String str2) {
                Log.m165393v(str, str2);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logW(String str, String str2) {
                Log.m165397w(str, str2);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logD(String str, String str2, Throwable th) {
                Log.m165380d(str, str2, th);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logE(String str, String str2, Throwable th) {
                Log.m165384e(str, str2, th);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logI(String str, String str2, Throwable th) {
                Log.m165390i(str, str2, th);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logV(String str, String str2, Throwable th) {
                Log.m165394v(str, str2, th);
            }

            @Override // com.bytedance.common.utility.Logger.ILogWritter
            public void logW(String str, String str2, Throwable th) {
                Log.m165398w(str, str2, th);
            }
        });
    }

    /* renamed from: a */
    public JSONObject mo148931a(BDResponse bDResponse) {
        JSONObject jSONObject = new JSONObject();
        if (bDResponse != null) {
            try {
                jSONObject.put("success", bDResponse.success);
                jSONObject.put("errorMsg", bDResponse.errorMsg);
                jSONObject.put("errorCode", bDResponse.errorCode);
                jSONObject.put("detailErrorCode", bDResponse.detailErrorCode);
                jSONObject.put("detailErrorMsg", bDResponse.detailErrorMsg);
            } catch (Exception e) {
                Log.m165389i("CertHelper", "create Callback Result exception , " + e);
            }
        } else {
            jSONObject.put("success", false);
            jSONObject.put("errorMsg", "BSResponse is null");
            jSONObject.put("errorCode", -1);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public HashMap<String, String> mo148933b(Context context) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("appId", String.valueOf(C41354g.m163939a().getLarkAppId()));
        hashMap.put("appVersion", C26246a.m94977a(context));
        hashMap.put("cacheRootDir", context.getFilesDir().getAbsolutePath() + File.separator + "offline_face");
        hashMap.put("appName", "offline");
        hashMap.put("deviceId", C41354g.m163939a().getDeviceId());
        Log.m165389i("CertHelper", "getOfflineParams , params = " + hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public void mo148932a(Context context) {
        if (BytedCertManager.getInstance().getCertMonitorConfig() == null) {
            try {
                Log.m165389i("CertHelper", "checkMonitorConfig set");
                C41354g.m163939a().getInnerDependency().mo144305j();
            } catch (Exception e) {
                Log.m165390i("CertHelper", "checkMonitorConfig error, ", e);
            }
        } else {
            Log.m165389i("CertHelper", "checkMonitorConfig already set");
        }
        if (!this.f105172a.get()) {
            BytedCertManager.getInstance().setPreloadParams(context, mo148933b(context));
            Log.m165389i("CertHelper", "setPreloadParams");
            this.f105172a.set(true);
            m163931b();
        }
    }

    /* renamed from: a */
    public JSONObject mo148930a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", false);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165383e("CertHelper", "createCallback4Failed path error : " + e);
        }
        return jSONObject;
    }
}
