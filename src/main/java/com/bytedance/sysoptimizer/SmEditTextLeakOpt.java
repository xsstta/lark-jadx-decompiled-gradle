package com.bytedance.sysoptimizer;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public class SmEditTextLeakOpt {
    private static final String TAG = "com.bytedance.sysoptimizer.SmEditTextLeakOpt";

    public static void optimize(Application application) {
        try {
            if ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 19) {
                Method declaredMethod = Class.forName("android.sec.clipboard.ClipboardUIManager").getDeclaredMethod("getInstance", Context.class);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, application);
                String str = TAG;
                Log.i(str, Build.MANUFACTURER + "," + invoke.toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
