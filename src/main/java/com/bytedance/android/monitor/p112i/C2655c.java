package com.bytedance.android.monitor.p112i;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p104a.AbstractC2632d;

/* renamed from: com.bytedance.android.monitor.i.c */
public class C2655c {
    /* renamed from: a */
    public static void m11159a(Throwable th) {
        AbstractC2632d exceptionHandler = HybridMonitor.getInstance().getExceptionHandler();
        if (exceptionHandler != null) {
            exceptionHandler.mo11409a(th);
        }
    }
}
