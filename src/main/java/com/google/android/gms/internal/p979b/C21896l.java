package com.google.android.gms.internal.p979b;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.google.android.gms.internal.b.l */
public final class C21896l {

    /* renamed from: a */
    private static final byte[] f53306a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    private static final int[] f53307b = {1, 10, 100, 1000, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c */
    private static final int[] f53308c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d */
    private static final int[] f53309d = {1, 1, 2, 6, 24, SmEvents.EVENT_NW, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    private static int[] f53310e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, SmEvents.EVENT_NO, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: a */
    public static int m79206a(int i, int i2) {
        long j = ((long) i) << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
