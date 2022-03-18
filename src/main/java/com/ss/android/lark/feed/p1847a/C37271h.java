package com.ss.android.lark.feed.p1847a;

import android.os.SystemClock;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.feed.a.h */
public class C37271h {

    /* renamed from: a */
    private static long f95687a;

    /* renamed from: a */
    public static boolean m146782a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - f95687a > 500) {
            f95687a = uptimeMillis;
            return false;
        }
        Log.m165389i("ThrottleClickFilter", "click had been filtered");
        return true;
    }
}
