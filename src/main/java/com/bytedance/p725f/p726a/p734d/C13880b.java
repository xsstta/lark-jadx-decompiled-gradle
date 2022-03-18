package com.bytedance.p725f.p726a.p734d;

import android.util.Log;

/* renamed from: com.bytedance.f.a.d.b */
public class C13880b {

    /* renamed from: a */
    private static boolean f36306a = Log.isLoggable("watson_assist", 3);

    /* renamed from: a */
    public static void m56265a(String str) {
        m56266a("watson_assist", str);
    }

    /* renamed from: b */
    public static void m56267b(String str) {
        m56268b("watson_assist", str);
    }

    /* renamed from: c */
    public static void m56269c(String str) {
        m56270c("watson_assist", str);
    }

    /* renamed from: b */
    public static void m56268b(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: c */
    public static void m56270c(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: a */
    public static void m56266a(String str, String str2) {
        if (f36306a) {
            Log.d(str, str2);
        }
    }
}
