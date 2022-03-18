package com.bytedance.crash.runtime;

import android.os.SystemClock;
import com.bytedance.crash.util.C3968x;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.l */
public final class C3863l {

    /* renamed from: a */
    private static JSONObject f11846a;

    /* renamed from: b */
    private static long f11847b;

    /* renamed from: c */
    private static long f11848c;

    /* renamed from: b */
    public static void m16004b() {
        C3864m.m16007a("npthStart", null, f11846a);
    }

    /* renamed from: a */
    public static void m16002a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            f11846a.put("total", uptimeMillis - f11848c);
            C3968x.m16530a((Object) ("npth init total cost : " + (uptimeMillis - f11848c) + " ms"));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m16003a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = f11846a;
        if (jSONObject == null) {
            f11846a = new JSONObject();
            f11848c = uptimeMillis;
        } else {
            try {
                jSONObject.put(str, uptimeMillis - f11847b);
            } catch (JSONException unused) {
            }
        }
        f11847b = uptimeMillis;
    }
}
