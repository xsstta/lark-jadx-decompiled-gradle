package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class ArtOptimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    private static native boolean disableDumpOatFile(int i);

    private static native boolean increaseSuspendTime(int i);

    private ArtOptimizer() {
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 23) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean disableDumpOatFileForANR(Context context) {
        synchronized (ArtOptimizer.class) {
            if (mOptimized) {
                return true;
            }
            if (Build.VERSION.SDK_INT != 29 || !SysOptimizer.loadOptimizerLibrary(context)) {
                return false;
            }
            try {
                boolean disableDumpOatFile = disableDumpOatFile(Build.VERSION.SDK_INT);
                mOptimized = disableDumpOatFile;
                return disableDumpOatFile;
            } catch (UnsatisfiedLinkError e) {
                Log.e(TAG, "UnsatisfiedLinkError", e);
                return false;
            }
        }
    }

    public static synchronized boolean optSuspendTimeout(Context context) {
        synchronized (ArtOptimizer.class) {
            if (mOptimized) {
                return true;
            }
            if (!loadOptimizerOnNeed(context)) {
                return false;
            }
            try {
                boolean increaseSuspendTime = increaseSuspendTime(Build.VERSION.SDK_INT);
                mOptimized = increaseSuspendTime;
                return increaseSuspendTime;
            } catch (UnsatisfiedLinkError e) {
                Log.e(TAG, "UnsatisfiedLinkError", e);
                return false;
            }
        }
    }
}
