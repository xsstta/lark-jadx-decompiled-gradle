package com.bytedance.framwork.core.sdkmonitor;

import java.io.Closeable;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.d */
public class C14174d {
    /* renamed from: a */
    public static void m57264a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
