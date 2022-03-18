package com.huawei.secure.android.common.ssl.p1028b;

import android.util.Log;

/* renamed from: com.huawei.secure.android.common.ssl.b.f */
public class C23821f {
    /* renamed from: a */
    public static void m87074a(String str, String str2) {
    }

    /* renamed from: a */
    private static String m87073a(String str) {
        return "SecurityComp10105302: " + str;
    }

    /* renamed from: b */
    public static void m87076b(String str, String str2) {
        Log.i(m87073a(str), str2);
    }

    /* renamed from: c */
    public static void m87077c(String str, String str2) {
        Log.w(m87073a(str), str2);
    }

    /* renamed from: d */
    public static void m87078d(String str, String str2) {
        Log.e(m87073a(str), str2);
    }

    /* renamed from: a */
    public static void m87075a(String str, String str2, Throwable th) {
        Log.e(m87073a(str), str2, th);
    }
}
