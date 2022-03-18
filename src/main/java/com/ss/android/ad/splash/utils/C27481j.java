package com.ss.android.ad.splash.utils;

/* renamed from: com.ss.android.ad.splash.utils.j */
public class C27481j {

    /* renamed from: a */
    private static final char[] f68701a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static int m100386a(long j, long j2) {
        int i;
        if (j2 > 0) {
            i = (int) (((((double) j) * 1.0d) / ((double) j2)) * 100.0d);
        } else {
            i = 0;
        }
        return Math.min(Math.max(0, i), 100);
    }
}
