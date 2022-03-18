package com.bytedance.ee.lark.infra.foundation.utils;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.j */
public class C12792j {

    /* renamed from: a */
    private static final Handler f34172a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m52871a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f34172a.post(runnable);
        }
    }
}
