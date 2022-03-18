package com.bytedance.monitor.util.p854b;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.monitor.util.b.b */
public class C20171b {

    /* renamed from: a */
    private static C20170a f49284a;

    /* renamed from: b */
    private static Class f49285b;

    /* renamed from: c */
    private static Object f49286c;

    static {
        try {
            f49284a = C20170a.m73607a();
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f49285b = cls;
            f49286c = f49284a.mo68316a(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static long m73613a(Field field) {
        Method a = f49284a.mo68319a(f49285b, "objectFieldOffset", Field.class);
        Object a2 = f49284a.mo68317a(a, f49286c, field);
        if (a2 == null) {
            return 0;
        }
        return ((Long) a2).longValue();
    }

    /* renamed from: a */
    public static long m73612a(Object obj, long j, Object obj2) {
        Method a = f49284a.mo68319a(f49285b, "putObject", Object.class, Long.TYPE, Object.class);
        Object a2 = f49284a.mo68317a(a, f49286c, obj, Long.valueOf(j), obj2);
        if (a2 == null) {
            return 0;
        }
        return ((Long) a2).longValue();
    }
}
