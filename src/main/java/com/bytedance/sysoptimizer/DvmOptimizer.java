package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

public class DvmOptimizer {
    private static boolean sOptimized;

    private static native void optLinearAllocBuffer(int i);

    private static native void startHookDvmFunc();

    private DvmOptimizer() {
    }

    public static void optDvmLinearAllocBuffer(Context context) {
        optDvmLinearAllocBuffer(context, 67108864);
    }

    public static void hookDvmLinearAllocFunc(Context context) {
        if (loadOptimizerOnNeed(context)) {
            startHookDvmFunc();
        }
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT <= 19) {
            return SysOptimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static synchronized void optDvmLinearAllocBuffer(Context context, int i) {
        synchronized (DvmOptimizer.class) {
            if (!sOptimized) {
                if (loadOptimizerOnNeed(context)) {
                    optLinearAllocBuffer(i);
                    sOptimized = true;
                }
            }
        }
    }
}
