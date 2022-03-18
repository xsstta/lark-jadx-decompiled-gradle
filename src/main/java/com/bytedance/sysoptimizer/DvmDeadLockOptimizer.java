package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class DvmDeadLockOptimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    private static native boolean optimize();

    private DvmDeadLockOptimizer() {
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT != 19) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (DvmDeadLockOptimizer.class) {
            if (mOptimized) {
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean optimize = optimize();
                    mOptimized = optimize;
                    return optimize;
                } catch (UnsatisfiedLinkError e) {
                    Log.e(TAG, "failed to optimize, UnsatisfiedLinkError", e);
                }
            }
            return false;
        }
    }
}
