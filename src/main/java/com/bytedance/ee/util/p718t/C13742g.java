package com.bytedance.ee.util.p718t;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.ee.util.t.g */
public class C13742g {

    /* renamed from: a */
    private static Handler f35934a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static boolean m55707a() {
        if (Thread.currentThread() == f35934a.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m55705a(Runnable runnable) {
        f35934a.post(runnable);
    }

    /* renamed from: b */
    public static boolean m55709b(Runnable runnable) {
        return f35934a.hasCallbacks(runnable);
    }

    /* renamed from: c */
    public static void m55710c(Runnable runnable) {
        f35934a.removeCallbacks(runnable);
    }

    /* renamed from: d */
    public static void m55711d(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            m55705a(runnable);
        }
    }

    /* renamed from: a */
    public static void m55706a(Runnable runnable, long j) {
        f35934a.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public static void m55708b(Runnable runnable, long j) {
        if (Looper.getMainLooper() != Looper.myLooper() || j > 0) {
            m55706a(runnable, j);
        } else {
            runnable.run();
        }
    }
}
