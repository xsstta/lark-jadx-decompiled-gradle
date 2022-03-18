package com.bytedance.sysoptimizer.java;

import android.content.Context;
import android.os.Build;
import java.util.Collections;

public class IAutofillManagerProtector {
    private static boolean sIsInit;

    public static void install(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && context != null && !sIsInit) {
            sIsInit = BinderServiceWrapperProtector.install(context, "autofill", Collections.singletonList("startSession"), "IAMP", BinderServiceWrapperProtector.VOID_ADMIN_RESULT);
        }
    }
}
