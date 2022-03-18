package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class KGetCookieOptimizer {
    private static boolean sOptimized;

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (KGetCookieOptimizer.class) {
            if (!sOptimized) {
                if (Build.VERSION.SDK_INT == 19) {
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            if (optimize()) {
                                Log.d("KGetCookieOptimizer", "GetCookie opt succ");
                            }
                            sOptimized = true;
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("KGetCookieOptimizer", "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e("KGetCookieOptimizer", "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
