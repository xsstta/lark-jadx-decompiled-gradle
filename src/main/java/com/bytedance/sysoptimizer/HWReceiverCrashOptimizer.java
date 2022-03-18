package com.bytedance.sysoptimizer;

import android.content.ContextWrapper;
import android.os.Build;
import java.lang.reflect.Field;

public class HWReceiverCrashOptimizer {
    private static volatile boolean sHasFix;

    public static void fix(ContextWrapper contextWrapper) {
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 23) {
            synchronized (HWReceiverCrashOptimizer.class) {
                if (!sHasFix) {
                    sHasFix = true;
                    try {
                        Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mPackageInfo");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(contextWrapper.getBaseContext());
                        Field declaredField2 = Class.forName("android.app.LoadedApk").getDeclaredField("mReceiverResource");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, null);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
