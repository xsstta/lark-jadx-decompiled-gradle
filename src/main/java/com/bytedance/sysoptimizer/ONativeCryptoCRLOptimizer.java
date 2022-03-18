package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class ONativeCryptoCRLOptimizer {
    private static boolean sOptimized;

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (ONativeCryptoCRLOptimizer.class) {
            if (!sOptimized) {
                if (Build.VERSION.SDK_INT == 27) {
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            if (optimize()) {
                                Log.e("NativeCrypt", "hook succ");
                            } else {
                                Log.e("NativeCrypt", "hook fail");
                            }
                            sOptimized = true;
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("NativeCrypt", "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e("NativeCrypt", "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
