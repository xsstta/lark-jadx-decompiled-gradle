package com.ss.android.lark.mediapicker.utils;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.lark.mediapicker.utils.p */
public class C44763p {

    /* renamed from: a */
    private static final Handler f113363a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static void m177519b(Runnable runnable) {
        f113363a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m177517a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f113363a.post(runnable);
        }
    }

    /* renamed from: a */
    public static void m177518a(Runnable runnable, long j) {
        f113363a.postDelayed(runnable, j);
    }
}
