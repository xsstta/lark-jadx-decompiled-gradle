package com.ss.android.floatbubble.util;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.floatbubble.util.c */
public class C28469c {

    /* renamed from: a */
    private static Handler f71604a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m104323a(Runnable runnable) {
        m104324a(runnable, 0);
    }

    /* renamed from: a */
    public static void m104324a(Runnable runnable, long j) {
        if (Looper.getMainLooper() != Looper.myLooper() || j > 0) {
            f71604a.postDelayed(runnable, j);
        } else {
            runnable.run();
        }
    }
}
