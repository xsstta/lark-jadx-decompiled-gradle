package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class RegexMatcherOptimizer {
    private static boolean sOptimized;

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (RegexMatcherOptimizer.class) {
            if (!sOptimized) {
                if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            Log.d("RegexMatcherOptimizer", "opt ret = " + optimize());
                            optimize();
                            sOptimized = true;
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("RegexMatcherOptimizer", "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e("RegexMatcherOptimizer", "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
