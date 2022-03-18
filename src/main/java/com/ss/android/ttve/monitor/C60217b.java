package com.ss.android.ttve.monitor;

import com.ss.android.vesdk.C63929ab;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.b */
public class C60217b {

    /* renamed from: a */
    private static boolean f150309a;

    /* renamed from: b */
    private static AbstractC60218a f150310b;

    /* renamed from: com.ss.android.ttve.monitor.b$a */
    public interface AbstractC60218a {
        /* renamed from: a */
        void mo205706a(String str, JSONObject jSONObject, String str2, String str3, String str4);
    }

    /* renamed from: a */
    public static void m234040a() {
        ApplogUtilsInvoker.nativeInit();
    }

    /* renamed from: a */
    public static synchronized void m234041a(AbstractC60218a aVar) {
        synchronized (C60217b.class) {
            f150310b = aVar;
            C60215a.m234037a("", aVar, false);
        }
    }

    /* renamed from: a */
    public static void m234047a(boolean z) {
        C63929ab.m250974a("ApplogUtils", "setReportToBusiness " + z);
        f150309a = z;
    }

    /* renamed from: a */
    public static void m234045a(String str, JSONObject jSONObject, String str2) {
        m234046a(str, jSONObject, str2, true, false);
    }

    /* renamed from: a */
    public static void m234042a(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        m234045a(str, jSONObject, str3);
    }

    /* renamed from: a */
    public static void m234043a(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        m234046a(str, jSONObject, str3, z, true);
    }

    /* renamed from: a */
    public static void m234046a(String str, JSONObject jSONObject, String str2, boolean z, boolean z2) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("sdkVersion", "9.9.0.301");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (f150309a || z2) {
            m234044a(str, str2, jSONObject, null, null, true);
        }
        if (z) {
            try {
                jSONObject.put("second_appid", "1357");
                jSONObject.put("second_appname", "video_editor_sdk");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            m234044a(str, str2, jSONObject, "1357", "video_editor_sdk", false);
        }
    }

    /* renamed from: a */
    private static void m234044a(String str, String str2, JSONObject jSONObject, String str3, String str4, boolean z) {
        C63929ab.m250976b("ApplogUtils", "onEventReport " + str + ": " + jSONObject);
        C60215a.m234038a(str, jSONObject, str2, z);
    }
}
