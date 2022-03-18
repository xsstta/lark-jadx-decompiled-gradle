package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class HighLevelTrimMemory {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    private static native boolean disable();

    private HighLevelTrimMemory() {
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (HighLevelTrimMemory.class) {
            if (mOptimized) {
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean disable = disable();
                    mOptimized = disable;
                    return disable;
                } catch (UnsatisfiedLinkError e) {
                    Log.e(TAG, "failed to optimize, UnsatisfiedLinkError", e);
                }
            }
            return false;
        }
    }
}
