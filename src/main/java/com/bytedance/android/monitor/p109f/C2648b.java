package com.bytedance.android.monitor.p109f;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.bytedance.android.monitor.f.b */
public class C2648b {

    /* renamed from: a */
    private static AbstractC2647a f8423a;

    /* renamed from: b */
    private static boolean f8424b;

    /* renamed from: a */
    public static boolean m11132a() {
        return f8424b;
    }

    /* renamed from: a */
    public static void m11131a(boolean z) {
        f8424b = z;
    }

    /* renamed from: a */
    private static String m11129a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "hybrid_multi_monitor";
        }
        if (str.startsWith("hybrid_multi_monitor_")) {
            return str;
        }
        return "hybrid_multi_monitor_" + str;
    }

    /* renamed from: b */
    public static void m11133b(String str, String str2) {
        String a = m11129a(str);
        AbstractC2647a aVar = f8423a;
        if (aVar != null) {
            aVar.mo11456b(a, str2);
        } else {
            Log.e(a, str2);
        }
    }

    /* renamed from: a */
    public static void m11130a(String str, String str2) {
        if (m11132a()) {
            String a = m11129a(str);
            AbstractC2647a aVar = f8423a;
            if (aVar != null) {
                aVar.mo11455a(a, str2);
            } else {
                Log.d(a, str2);
            }
        }
    }
}
