package com.ss.android.lark.mm.p2288b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.lark.mm.b.k */
public final class C45859k {

    /* renamed from: a */
    private static Handler f115681a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static void m181687b(Runnable runnable) {
        f115681a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m181685a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f115681a.post(runnable);
        }
    }

    /* renamed from: a */
    public static void m181686a(Runnable runnable, long j) {
        f115681a.postDelayed(runnable, j);
    }
}
