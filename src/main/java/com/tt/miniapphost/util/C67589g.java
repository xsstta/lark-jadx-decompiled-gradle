package com.tt.miniapphost.util;

import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;

/* renamed from: com.tt.miniapphost.util.g */
public class C67589g {
    /* renamed from: a */
    private static int m263063a(float f) {
        return Math.round(f);
    }

    /* renamed from: a */
    public static int m263062a(double d) {
        return m263063a(((float) d) * ContextSingletonInstance.getInstance().getDeviceInfo().mo234268c(AppbrandContext.getInst().getApplicationContext()));
    }

    /* renamed from: a */
    public static int m263064a(int i) {
        return m263063a(((float) i) / ContextSingletonInstance.getInstance().getDeviceInfo().mo234268c(AppbrandContext.getInst().getApplicationContext()));
    }
}
