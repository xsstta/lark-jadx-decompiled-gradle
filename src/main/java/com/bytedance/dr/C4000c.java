package com.bytedance.dr;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.dr.c */
public final class C4000c {

    /* renamed from: a */
    private static final String f12151a = (C4000c.class.getSimpleName() + "#");

    /* renamed from: b */
    private static AbstractC3997a<C4011h> f12152b = new AbstractC3997a<C4011h>() {
        /* class com.bytedance.dr.C4000c.C40011 */

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C4011h mo15706a(Object... objArr) {
            return new C4011h((Context) objArr[0]);
        }
    };

    /* renamed from: a */
    public static String m16652a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optString("id", null);
        }
        return null;
    }

    /* renamed from: a */
    public static void m16654a(Context context) {
        f12152b.mo15707b(context).mo15747a();
    }

    /* renamed from: a */
    public static String m16651a(SharedPreferences sharedPreferences) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a = C3998b.m16648a(sharedPreferences);
        C4002d.m16661b("TrackerDr", f12151a + "getCdid takes " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return a;
    }

    /* renamed from: a */
    public static Map<String, String> m16653a(Context context, SharedPreferences sharedPreferences) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, String> a = f12152b.mo15707b(context).mo15746a(100);
        C4002d.m16661b("TrackerDr", f12151a + "getOaid takes " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return a;
    }
}
