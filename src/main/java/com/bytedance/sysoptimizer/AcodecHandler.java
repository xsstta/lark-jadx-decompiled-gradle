package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.android.bytehook.ByteHook;

public class AcodecHandler {
    private static volatile boolean mInit;

    private static native void fixAcodecMessage();

    private static boolean inAndroid4x() {
        if (Build.VERSION.SDK_INT <= 20) {
            return true;
        }
        return false;
    }

    private static boolean inAndroid5x() {
        if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
            return true;
        }
        return false;
    }

    public static synchronized void fixAcodecMessage(Context context) {
        synchronized (AcodecHandler.class) {
            if ((inAndroid4x() || inAndroid5x()) && SysOptimizer.loadOptimizerLibrary(context)) {
                Log.i("AcodecHandler", "handlerAcodecMessage");
                ByteHook.init();
                fixAcodecMessage();
            }
        }
    }
}
