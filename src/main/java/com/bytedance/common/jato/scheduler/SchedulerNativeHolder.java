package com.bytedance.common.jato.scheduler;

import android.content.Context;
import com.bytedance.common.jato.JatoNativeLoader;

/* access modifiers changed from: package-private */
public class SchedulerNativeHolder {
    private static boolean sInited;

    static native int nativeInit(int i, int i2, Context context);

    SchedulerNativeHolder() {
    }

    static synchronized boolean ensureInited() {
        boolean z;
        synchronized (SchedulerNativeHolder.class) {
            if (!sInited && JatoNativeLoader.loadLibrary()) {
                sInited = true;
            }
            z = sInited;
        }
        return z;
    }
}
