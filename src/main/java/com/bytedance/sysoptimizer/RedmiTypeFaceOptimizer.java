package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class RedmiTypeFaceOptimizer {
    private static boolean mOptimized;

    private static native boolean optimize(boolean z);

    public static void fixOnAndroidQ(Context context) {
        fixOnAndroidQ(context, false);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fixOnAndroidQ(Context context, boolean z) {
        if (!mOptimized && Build.VERSION.SDK_INT == 29 && loadOptimizerOnNeed(context)) {
            try {
                optimize(z);
                mOptimized = true;
            } catch (UnsatisfiedLinkError e) {
                Log.e("RedmiTypeFaceOptimizer", "UnsatisfiedLinkError", e);
            }
        }
    }
}
