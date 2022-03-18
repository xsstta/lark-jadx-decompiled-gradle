package com.google.android.datatransport.runtime.p971a;

import android.util.Log;

/* renamed from: com.google.android.datatransport.runtime.a.a */
public final class C21399a {
    /* renamed from: a */
    private static String m77443a(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: a */
    public static void m77444a(String str, String str2) {
        Log.i(m77443a(str), str2);
    }

    /* renamed from: a */
    public static void m77446a(String str, String str2, Throwable th) {
        Log.e(m77443a(str), str2, th);
    }

    /* renamed from: b */
    public static void m77448b(String str, String str2, Object obj) {
        Log.w(m77443a(str), String.format(str2, obj));
    }

    /* renamed from: a */
    public static void m77445a(String str, String str2, Object obj) {
        Log.d(m77443a(str), String.format(str2, obj));
    }

    /* renamed from: a */
    public static void m77447a(String str, String str2, Object... objArr) {
        Log.d(m77443a(str), String.format(str2, objArr));
    }
}
