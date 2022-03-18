package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class StageFrightAndroid4Optimizer {
    private static boolean mOptimized;

    private static native boolean optimize();

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fixStageFrightAndroid4(Context context) {
        if (!mOptimized && Build.VERSION.SDK_INT < 26 && loadOptimizerOnNeed(context)) {
            try {
                optimize();
                mOptimized = true;
            } catch (UnsatisfiedLinkError e) {
                Log.e("StageFrightOptimizer", "UnsatisfiedLinkError", e);
            }
        }
    }
}
