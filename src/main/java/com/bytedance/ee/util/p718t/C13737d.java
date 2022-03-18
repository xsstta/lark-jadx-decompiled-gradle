package com.bytedance.ee.util.p718t;

import android.os.SystemClock;

/* renamed from: com.bytedance.ee.util.t.d */
public class C13737d {

    /* renamed from: a */
    private static long f35932a;

    /* renamed from: a */
    public static boolean m55692a() {
        return m55693a(500);
    }

    /* renamed from: a */
    public static boolean m55693a(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - f35932a < j) {
            return false;
        }
        f35932a = uptimeMillis;
        return true;
    }
}
