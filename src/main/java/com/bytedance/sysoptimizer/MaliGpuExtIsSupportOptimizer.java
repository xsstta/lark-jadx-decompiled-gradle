package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class MaliGpuExtIsSupportOptimizer {
    private static boolean sOptimized;

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (MaliGpuExtIsSupportOptimizer.class) {
            if (!sOptimized) {
                if (Build.VERSION.SDK_INT == 21) {
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            if (optimize()) {
                                Log.d("MaliGpuExtIsSupportOpt", "opt for extIsSupport");
                            } else {
                                Log.d("MaliGpuExtIsSupportOpt", "opt failed");
                            }
                            sOptimized = true;
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("MaliGpuExtIsSupportOpt", "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e("MaliGpuExtIsSupportOpt", "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
