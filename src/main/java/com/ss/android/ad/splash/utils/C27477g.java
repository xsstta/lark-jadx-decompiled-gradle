package com.ss.android.ad.splash.utils;

import android.util.Log;
import com.ss.android.ad.splash.core.C27287e;

/* renamed from: com.ss.android.ad.splash.utils.g */
public class C27477g {

    /* renamed from: a */
    static int f68693a = 2;

    /* renamed from: a */
    private static String m100324a() {
        if (!C27287e.m99266h()) {
            return "";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 1; i < stackTrace.length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (!className.equals(Thread.class.getCanonicalName()) && !className.equals(C27477g.class.getCanonicalName())) {
                return "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")#" + stackTraceElement.getMethodName() + ". ";
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m100325a(String str) {
        m100326a("SplashAdSdk", m100324a() + str);
    }

    /* renamed from: b */
    public static void m100328b(String str, String str2) {
        if (str2 != null && f68693a <= 4) {
            Log.i(str, m100324a() + str2);
        }
    }

    /* renamed from: c */
    public static void m100329c(String str, String str2) {
        if (str2 != null && f68693a <= 5) {
            Log.w(str, m100324a() + str2);
        }
    }

    /* renamed from: d */
    public static void m100330d(String str, String str2) {
        if (str2 != null && f68693a <= 6) {
            Log.e(str, m100324a() + str2);
        }
    }

    /* renamed from: a */
    public static void m100326a(String str, String str2) {
        if (str2 != null && f68693a <= 3) {
            Log.d(str, m100324a() + str2);
        }
    }

    /* renamed from: a */
    public static void m100327a(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && f68693a <= 6) {
            Log.e(str, m100324a() + str2, th);
        }
    }
}
