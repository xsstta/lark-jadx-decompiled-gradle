package com.ss.android.lark.platform.statistics.p2502b;

import com.ss.android.lark.platform.statistics.C51989f;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.lark.platform.statistics.b.k */
public class C51984k {

    /* renamed from: a */
    static Boolean f129075a;

    /* renamed from: b */
    private static Method f129076b;

    /* renamed from: c */
    private static Method f129077c;

    /* renamed from: d */
    private static Method f129078d;

    /* renamed from: e */
    private static Method f129079e;

    /* renamed from: f */
    private static Class<?> f129080f;

    /* renamed from: a */
    public static boolean m201636a() {
        return C51989f.m201666a();
    }

    /* renamed from: c */
    public static boolean m201639c() {
        return f129075a.booleanValue();
    }

    /* renamed from: b */
    public static void m201637b() {
        if (m201636a() && !m201639c()) {
            try {
                f129077c.invoke(null, 8L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m201634a(String str) {
        if (m201636a() && !m201639c()) {
            try {
                f129076b.invoke(null, 8L, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m201635a(boolean z) {
        if (m201636a()) {
            f129075a = Boolean.valueOf(z);
            try {
                Class<?> cls = Class.forName("android.os.Trace");
                f129080f = cls;
                f129076b = cls.getMethod("traceBegin", Long.TYPE, String.class);
                f129077c = f129080f.getMethod("traceEnd", Long.TYPE);
                f129079e = f129080f.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                f129078d = f129080f.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!m201639c()) {
                try {
                    f129080f.getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, true);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m201633a(long j, String str, int i) {
        if (m201636a()) {
            try {
                f129078d.invoke(null, Long.valueOf(j), str, Integer.valueOf(i));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m201638b(long j, String str, int i) {
        if (m201636a()) {
            try {
                f129079e.invoke(null, Long.valueOf(j), str, Integer.valueOf(i));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
