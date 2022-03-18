package com.tt.miniapp.p3352w.p3354b;

import android.text.TextUtils;

/* renamed from: com.tt.miniapp.w.b.f */
public class C67300f {
    /* renamed from: a */
    public static String m262171a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("host_event_")) {
            return str;
        }
        return "host_event_" + str;
    }

    /* renamed from: b */
    public static String m262172b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("host_event_")) {
            return str;
        }
        return str.replaceFirst("host_event_", "");
    }
}
