package com.bytedance.android.monitor.p112i;

import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitor.i.a */
public class C2653a {

    /* renamed from: a */
    private static Method f8440a;

    /* renamed from: a */
    public static void m11156a(String str, String str2) {
        try {
            if (f8440a == null) {
                f8440a = C2659h.m11187a(Class.forName("com.ss.android.agilelogger.ALog"), "i", (Class<?>[]) new Class[]{String.class, String.class});
            }
            Method method = f8440a;
            if (method != null) {
                method.invoke(null, str, str2);
            }
        } catch (Throwable th) {
            C2655c.m11159a(th);
        }
    }
}
