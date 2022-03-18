package com.ss.android.vc.common.p3083e;

/* renamed from: com.ss.android.vc.common.e.ae */
public class C60741ae {
    /* renamed from: a */
    public static void m236053a(Runnable runnable) {
        m236054a(runnable, 0);
    }

    /* renamed from: b */
    public static void m236055b(Runnable runnable) {
        C60735ab.m236015d().removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m236054a(Runnable runnable, long j) {
        C60735ab.m236015d().postDelayed(runnable, j);
    }
}
