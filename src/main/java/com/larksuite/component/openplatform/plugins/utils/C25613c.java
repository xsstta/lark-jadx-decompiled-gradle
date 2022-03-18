package com.larksuite.component.openplatform.plugins.utils;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.larksuite.component.openplatform.plugins.utils.c */
public class C25613c {

    /* renamed from: a */
    private static Handler f62316a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static boolean m91384a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m91382a(Runnable runnable) {
        m91383a(runnable, true);
    }

    /* renamed from: a */
    public static void m91383a(Runnable runnable, boolean z) {
        if (!m91384a() || !z) {
            f62316a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
