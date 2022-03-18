package com.ss.android.vc.irtc.impl.pool;

import com.ss.android.vc.irtc.C61064p;

/* access modifiers changed from: package-private */
public class MemUtils {
    MemUtils() {
    }

    public static boolean isMemoryLow() {
        return isMemoryLow(0);
    }

    public static void dumpMemoryInfo() {
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        C61064p.m237485a("MemUtils", "[Low memory]Used memory: " + freeMemory + ", freeMemory: " + (Runtime.getRuntime().maxMemory() - freeMemory));
    }

    public static boolean isMemoryLow(long j) {
        long maxMemory = Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        if (maxMemory < 16777216 || (maxMemory >> 3) < j) {
            return true;
        }
        return false;
    }
}
