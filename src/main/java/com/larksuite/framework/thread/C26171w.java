package com.larksuite.framework.thread;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.larksuite.framework.thread.w */
public class C26171w {

    /* renamed from: a */
    private static Handler f64640a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m94675a(Runnable runnable) {
        m94676a(runnable, 0);
    }

    /* renamed from: a */
    public static void m94676a(Runnable runnable, long j) {
        if (Looper.getMainLooper() != Looper.myLooper() || j > 0) {
            f64640a.postDelayed(runnable, j);
        } else {
            runnable.run();
        }
    }
}
