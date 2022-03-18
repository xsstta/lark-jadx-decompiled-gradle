package com.ss.android.vc.trace;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.vc.trace.a */
public class C63784a {

    /* renamed from: a */
    public static boolean f160962a;

    /* renamed from: b */
    private static Method f160963b;

    /* renamed from: c */
    private static Method f160964c;

    /* renamed from: d */
    private static Class<?> f160965d;

    /* renamed from: a */
    public static void m250427a() {
        try {
            Class<?> cls = Class.forName("android.os.Trace");
            f160965d = cls;
            f160964c = cls.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            f160963b = f160965d.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250429b(String str) {
        if (f160962a) {
            Log.d("VCTracer", "[VCTracer] [" + str + "] END");
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m250428a(String str) {
        if (f160962a) {
            Log.d("VCTracer", "[VCTracer] [" + str + "] START");
            Trace.beginSection(str);
        }
    }

    /* renamed from: c */
    public static void m250430c(String str) {
        if (f160962a) {
            Log.d("VCTracer", "[VCTracer] [" + str + "] ASYNC START");
            try {
                f160963b.invoke(null, 8L, str, Integer.valueOf(str.hashCode()));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m250431d(String str) {
        if (f160962a) {
            Log.d("VCTracer", "[VCTracer] [" + str + "] ASYNC END");
            try {
                f160964c.invoke(null, 8L, str, Integer.valueOf(str.hashCode()));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
