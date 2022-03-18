package com.bytedance.sysoptimizer.fake.name;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.sysoptimizer.SysOptimizer;

public class SmFakeNameHandler {
    private static String TAG = "SYSOPTIMIZER";
    private static volatile boolean inited;

    private static native void replace(int i);

    private static boolean inAndroid5x() {
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 21) {
            return true;
        }
        return false;
    }

    private static boolean shouldFix() {
        if (!inAndroid5x() || !Build.MODEL.startsWith("SM-")) {
            return false;
        }
        return true;
    }

    public static synchronized void start(Context context) {
        synchronized (SmFakeNameHandler.class) {
            if (shouldFix()) {
                if (!inited) {
                    inited = true;
                    if (SysOptimizer.loadOptimizerLibrary(context)) {
                        try {
                            replace(Build.VERSION.SDK_INT);
                        } catch (UnsatisfiedLinkError e) {
                            Log.e(TAG, "UnsatisfiedLinkError", e);
                        } catch (NoSuchMethodError e2) {
                            Log.e(TAG, "NoSuchMethodError", e2);
                        }
                    }
                }
            }
        }
    }
}
