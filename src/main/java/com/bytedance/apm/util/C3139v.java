package com.bytedance.apm.util;

import android.os.Looper;

/* renamed from: com.bytedance.apm.util.v */
public class C3139v {
    /* renamed from: a */
    public static boolean m13080a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
