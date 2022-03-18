package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class JitCompileMethodCrash {
    private static String TAG = "OPTIMIZER-JIT";
    private static boolean mOptimized;

    private static native boolean optimize(int i);

    private JitCompileMethodCrash() {
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 27 || Build.VERSION.SDK_INT > 30) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (JitCompileMethodCrash.class) {
            if (mOptimized) {
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean optimize = optimize(Build.VERSION.SDK_INT);
                    mOptimized = optimize;
                    return optimize;
                } catch (UnsatisfiedLinkError e) {
                    Log.e(TAG, "failed to optimize, UnsatisfiedLinkError", e);
                }
            }
            Log.e(TAG, "optimize failed.");
            return false;
        }
    }
}
