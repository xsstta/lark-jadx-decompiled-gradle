package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class DvmGlesOptimizer {
    private static boolean mOptimized;

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (DvmGlesOptimizer.class) {
            if (!mOptimized) {
                if (Build.VERSION.SDK_INT == 19) {
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            optimize();
                            mOptimized = true;
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("DvmGlesOptimizer", "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e("DvmGlesOptimizer", "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
