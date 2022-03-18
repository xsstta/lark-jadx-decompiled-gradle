package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class NougatJitCompileOptimizer {
    private static boolean sOptimized;

    private static native void optimize();

    public static synchronized void fix(Context context) {
        synchronized (NougatJitCompileOptimizer.class) {
            if (!sOptimized) {
                if (Build.VERSION.SDK_INT == 24) {
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            optimize();
                            sOptimized = true;
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("NJitCompileOptimizer", "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e("NJitCompileOptimizer", "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
