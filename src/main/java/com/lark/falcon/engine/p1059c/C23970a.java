package com.lark.falcon.engine.p1059c;

import android.util.Log;

/* renamed from: com.lark.falcon.engine.c.a */
public class C23970a {
    /* renamed from: a */
    public static void m87618a(String str, String str2) {
        Log.d(str, str2);
    }

    /* renamed from: b */
    public static void m87621b(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: c */
    public static void m87622c(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: a */
    public static void m87620a(String str, Throwable th) {
        Log.e(str, Log.getStackTraceString(th));
    }

    /* renamed from: a */
    public static void m87619a(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }
}
