package com.bumptech.glide.util;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.util.f */
public final class C2563f {

    /* renamed from: a */
    private static final double f8279a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f8279a = d;
    }

    /* renamed from: a */
    public static long m10880a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public static double m10879a(long j) {
        return ((double) (m10880a() - j)) * f8279a;
    }
}
