package com.ss.android.lark.calendar.impl.utils;

import android.os.SystemClock;

/* renamed from: com.ss.android.lark.calendar.impl.utils.ab */
public class C32631ab {

    /* renamed from: a */
    private static long f83729a;

    /* renamed from: a */
    public static boolean m125168a() {
        return m125169a(1000);
    }

    /* renamed from: a */
    public static boolean m125169a(int i) {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - f83729a > ((long) i)) {
            z = false;
        } else {
            z = true;
        }
        f83729a = uptimeMillis;
        return z;
    }
}
