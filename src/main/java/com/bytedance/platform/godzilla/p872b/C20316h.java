package com.bytedance.platform.godzilla.p872b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.b.h */
public final class C20316h {
    /* renamed from: a */
    private static List<Class<?>> m74089a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m74090a(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: a */
    public static Object m74088a(Object obj, InvocationHandler invocationHandler) {
        Class[] clsArr;
        List<Class<?>> a = m74089a(obj.getClass());
        if (a == null || a.size() <= 0) {
            clsArr = new Class[0];
        } else {
            clsArr = (Class[]) a.toArray(new Class[a.size()]);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), clsArr, invocationHandler);
    }

    /* renamed from: a */
    private static void m74090a(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (hashSet.add(cls2)) {
                    m74090a(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
