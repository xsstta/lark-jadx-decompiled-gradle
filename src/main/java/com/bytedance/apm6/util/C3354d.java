package com.bytedance.apm6.util;

import java.io.Closeable;

/* renamed from: com.bytedance.apm6.util.d */
public class C3354d {
    /* renamed from: a */
    public static void m13949a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m13950b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
