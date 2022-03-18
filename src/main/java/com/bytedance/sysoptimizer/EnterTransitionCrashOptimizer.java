package com.bytedance.sysoptimizer;

import android.content.Context;

public class EnterTransitionCrashOptimizer {
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static void fix(Context context) {
        sContext = context;
    }
}
