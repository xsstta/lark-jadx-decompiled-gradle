package com.bytedance.raphael;

import com.C1711a;

public class Raphael {
    public static int ALLOC_MODE = 4194304;
    public static int DIFF_CACHE = 2097152;
    public static int FULL_CACHE = 0;
    public static int MAP64_MODE = 8388608;
    private static volatile boolean isSoLoad;
    private static volatile boolean isStart;

    public static native void print_native();

    public static native void start_native(int i, String str, String str2);

    public static native void stop_native();

    private static boolean loadLibrary() {
        if (isSoLoad) {
            return true;
        }
        try {
            C1711a.m7628a("raphael");
            isSoLoad = true;
        } catch (Throwable unused) {
            isSoLoad = false;
        }
        return isSoLoad;
    }

    public static synchronized void print() {
        synchronized (Raphael.class) {
            if (isStart) {
                print_native();
            }
        }
    }

    public static synchronized void stop() {
        synchronized (Raphael.class) {
            if (isStart) {
                stop_native();
                isStart = false;
            }
        }
    }

    public static synchronized void start(int i, String str, String str2) {
        synchronized (Raphael.class) {
            if (loadLibrary()) {
                if (!isStart) {
                    start_native(i, str, str2);
                    isStart = true;
                }
            }
        }
    }
}
