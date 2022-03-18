package com.bytedance.monitor.util.p854b;

import java.lang.reflect.Method;

/* renamed from: com.bytedance.monitor.util.b.a */
public class C20170a {

    /* renamed from: a */
    private static C20170a f49283a;

    private C20170a() {
    }

    /* renamed from: a */
    public static C20170a m73607a() {
        if (f49283a == null) {
            f49283a = new C20170a();
        }
        return f49283a;
    }

    /* renamed from: a */
    public Object mo68316a(Class<?> cls) {
        return mo68318a(mo68319a(cls, "getUnsafe", new Class[0]), new Object[0]);
    }

    /* renamed from: a */
    public Object mo68318a(Method method, Object... objArr) {
        return mo68317a(method, (Object) null, objArr);
    }

    /* renamed from: a */
    public Object mo68317a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Method mo68319a(Class<?> cls, String str, Class<?>... clsArr) {
        if (clsArr == null) {
            return cls.getDeclaredMethod(str, new Class[0]);
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
