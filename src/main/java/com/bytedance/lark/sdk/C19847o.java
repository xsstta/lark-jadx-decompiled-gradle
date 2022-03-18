package com.bytedance.lark.sdk;

import android.os.Looper;

/* renamed from: com.bytedance.lark.sdk.o */
public class C19847o {
    /* renamed from: a */
    public static boolean m72384a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
