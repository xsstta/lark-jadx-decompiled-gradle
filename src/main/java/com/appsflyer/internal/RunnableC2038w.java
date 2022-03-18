package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.model.event.Validate;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.w */
public final class RunnableC2038w implements Runnable {

    /* renamed from: ı */
    private static String f6986 = null;

    /* renamed from: ι */
    private static String f6987 = "https://%ssdk-services.%s/validate-android-signature";

    /* renamed from: Ɩ */
    private String f6988;

    /* renamed from: ǃ */
    private final Intent f6989;

    /* renamed from: ɨ */
    private Map<String, String> f6990;

    /* renamed from: ɩ */
    private WeakReference<Context> f6991;

    /* renamed from: ɹ */
    private String f6992;

    /* renamed from: Ι */
    private String f6993;

    /* renamed from: І */
    private String f6994;

    /* renamed from: і */
    private String f6995;

    /* renamed from: Ӏ */
    private String f6996;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AppsFlyerLibCore.f6760);
        sb.append("/androidevent?buildnumber=5.2.0&app_id=");
        f6986 = sb.toString();
    }

    public final void run() {
        String str = this.f6993;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isTrackingStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.f6991.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.f6988);
                    hashMap.put("sig-data", this.f6995);
                    hashMap.put("signature", this.f6992);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new_insert_after_java_lang_Thread_by_knot(new Thread(new Runnable() {
                        /* class com.appsflyer.internal.RunnableC2038w.RunnableC20392 */

                        public final void run() {
                            RunnableC2038w wVar = RunnableC2038w.this;
                            RunnableC2038w.m8938(wVar, hashMap2, wVar.f6990, RunnableC2038w.this.f6991);
                        }
                    })).start();
                    hashMap.put("dev_key", this.f6993);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put("advertiserId", AppsFlyerProperties.getInstance().getString("advertiserId"));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl(f6987);
                    if (C2015ai.f6878 == null) {
                        C2015ai.f6878 = new C2015ai();
                    }
                    C2015ai.f6878.mo10067("server_request", url, jSONObject);
                    HttpURLConnection r1 = m8934((Validate) new Validate().params(hashMap).urlString(url));
                    int i = -1;
                    if (r1 != null) {
                        i = r1.getResponseCode();
                    }
                    AppsFlyerLibCore.getInstance();
                    String r4 = AppsFlyerLibCore.m8749(r1);
                    if (C2015ai.f6878 == null) {
                        C2015ai.f6878 = new C2015ai();
                    }
                    C2015ai.f6878.mo10067("server_response", url, String.valueOf(i), r4);
                    JSONObject jSONObject2 = new JSONObject(r4);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.afInfoLog(sb.toString());
                        m8936(jSONObject2.optBoolean("result"), this.f6995, this.f6994, this.f6996, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        m8936(false, this.f6995, this.f6994, this.f6996, jSONObject2.toString());
                    }
                    if (r1 != null) {
                        r1.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ı */
    private static HttpURLConnection m8934(Validate validate) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(validate.urlString());
        AFLogger.afDebugLog(sb.toString());
        return new RunnableC2046z(validate.trackingStopped(AppsFlyerLib.getInstance().isTrackingStopped())).mo10108();
    }

    /* renamed from: Ι */
    static /* synthetic */ void m8938(RunnableC2038w wVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(f6986));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = AppsFlyerLibCore.getSharedPreferences((Context) weakReference.get()).getString("referrer", "");
            AFEvent context = new Validate().encrypt(true).context((Context) weakReference.get());
            context.f6702 = wVar.f6993;
            context.f6707 = "af_purchase";
            context.f6706 = string;
            context.f6705 = wVar.f6989;
            Validate validate = (Validate) context;
            Map<String, Object> r1 = AppsFlyerLibCore.getInstance().mo9986(validate);
            r1.put("price", wVar.f6994);
            r1.put("currency", wVar.f6996);
            r1.put("receipt_data", map);
            if (map2 != null) {
                r1.put("extra_prms", map2);
            }
            String jSONObject = new JSONObject(r1).toString();
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai.f6878.mo10067("server_request", obj, jSONObject);
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection r6 = m8934((Validate) validate.params(r1).urlString(obj));
                int i = -1;
                if (r6 != null) {
                    i = r6.getResponseCode();
                }
                AppsFlyerLibCore.getInstance();
                String r8 = AppsFlyerLibCore.m8749(r6);
                if (C2015ai.f6878 == null) {
                    C2015ai.f6878 = new C2015ai();
                }
                C2015ai.f6878.mo10067("server_response", obj, String.valueOf(i), r8);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(i);
                sb2.append(": ");
                sb2.append(new JSONObject(r8).toString());
                AFLogger.afInfoLog(sb2.toString());
                if (r6 != null) {
                    r6.disconnect();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ǃ */
    private static void m8936(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.f6759 != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLibCore.f6759.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.f6759;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public RunnableC2038w(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.f6991 = new WeakReference<>(context);
        this.f6993 = str;
        this.f6988 = str2;
        this.f6995 = str4;
        this.f6994 = str5;
        this.f6996 = str6;
        this.f6990 = map;
        this.f6992 = str3;
        this.f6989 = intent;
    }
}
