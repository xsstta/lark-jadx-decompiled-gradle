package com.lynx.tasm.utils;

import android.os.Handler;
import android.os.Looper;
import com.lynx.tasm.base.C26614b;

/* renamed from: com.lynx.tasm.utils.m */
public class C26959m {

    /* renamed from: a */
    private static Handler f66913a;

    /* renamed from: b */
    public static void m97973b() {
        C26614b.m96458a(m97972a(), "Expected to run on UI thread!");
    }

    /* renamed from: a */
    public static boolean m97972a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m97969a(Runnable runnable) {
        synchronized (C26959m.class) {
            if (f66913a == null) {
                f66913a = new Handler(Looper.getMainLooper());
            }
        }
        f66913a.post(runnable);
    }

    /* renamed from: a */
    public static void m97970a(Runnable runnable, Object obj) {
        synchronized (C26959m.class) {
            if (f66913a == null) {
                f66913a = new Handler(Looper.getMainLooper());
            }
        }
        f66913a.removeCallbacks(runnable, obj);
    }

    /* renamed from: a */
    public static void m97971a(Runnable runnable, Object obj, long j) {
        synchronized (C26959m.class) {
            if (f66913a == null) {
                f66913a = new Handler(Looper.getMainLooper());
            }
        }
        f66913a.postAtTime(runnable, obj, j);
    }
}
