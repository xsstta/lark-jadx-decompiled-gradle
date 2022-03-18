package com.ss.android.appcenter.engine.vlayout;

/* renamed from: com.ss.android.appcenter.engine.vlayout.a */
public class C28261a {
    /* renamed from: a */
    public static long m103594a(long j, long j2) {
        long j3 = j + j2;
        return ((j3 * (1 + j3)) / 2) + j2;
    }

    /* renamed from: a */
    public static void m103595a(long j, long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            jArr = new long[2];
        }
        long floor = (long) (Math.floor(Math.sqrt((double) ((8 * j) + 1)) - 1.0d) / 2.0d);
        long j2 = j - (((floor * floor) + floor) / 2);
        jArr[0] = floor - j2;
        jArr[1] = j2;
    }
}
