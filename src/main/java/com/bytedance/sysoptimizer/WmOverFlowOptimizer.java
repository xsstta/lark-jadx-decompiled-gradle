package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class WmOverFlowOptimizer {
    private static boolean mOptimized;

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (WmOverFlowOptimizer.class) {
            if (!mOptimized) {
                if (Build.VERSION.SDK_INT > 23 && Build.VERSION.SDK_INT <= 25) {
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            optimize();
                            mOptimized = true;
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("WmOverFlowOptimizer", "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e("WmOverFlowOptimizer", "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
