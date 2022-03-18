package com.bytedance.sysoptimizer;

import android.content.Context;

public class BadParcelableCrashOptimizer {
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static void fix(Context context) {
        sContext = context;
    }
}
