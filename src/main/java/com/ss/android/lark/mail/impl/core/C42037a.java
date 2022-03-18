package com.ss.android.lark.mail.impl.core;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.mail.impl.core.a */
public class C42037a {

    /* renamed from: a */
    private static final Field f106678a;

    static {
        Field field;
        try {
            field = Class.class.getDeclaredField("ifTable");
        } catch (Exception unused) {
            field = null;
        }
        f106678a = field;
    }

    /* renamed from: a */
    public static HashSet<Class<?>> m167218a(Class<?> cls) {
        HashSet<Class<?>> hashSet = new HashSet<>();
        Field field = f106678a;
        if (field != null) {
            field.setAccessible(true);
            try {
                Object[] objArr = (Object[]) field.get(cls);
                for (Object obj : objArr) {
                    if (obj instanceof Class) {
                        hashSet.add((Class) obj);
                    }
                }
                return hashSet;
            } catch (IllegalAccessException unused) {
            }
        }
        do {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length > 0) {
                for (Class<?> cls2 : interfaces) {
                    if (!hashSet.contains(cls2)) {
                        hashSet.addAll(m167218a(cls2));
                    }
                }
                hashSet.addAll(Arrays.asList(interfaces));
            }
            cls = cls.getSuperclass();
            if (cls == null) {
                break;
            }
        } while (cls != Object.class);
        return hashSet;
    }

    /* renamed from: b */
    public static boolean m167220b(Class<?> cls, Class<?> cls2) {
        if (cls == cls2) {
            return true;
        }
        for (Class<?> cls3 : cls2.getInterfaces()) {
            if (m167220b(cls, cls3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.HashSet<java.lang.Class<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> HashSet<Class<? extends T>> m167219a(Class<T> cls, Class<? extends T> cls2) {
        if (cls.isInterface()) {
            HashSet<Class<?>> a = m167218a(cls2);
            a.remove(cls);
            HashSet<Class<? extends T>> hashSet = (HashSet<Class<? extends T>>) new HashSet();
            Iterator<Class<?>> it = a.iterator();
            while (it.hasNext()) {
                Class<?> next = it.next();
                if (next instanceof Class) {
                    Class<?> cls3 = next;
                    if (m167220b(cls, cls3)) {
                        hashSet.add(cls3);
                    }
                }
            }
            return hashSet;
        }
        throw new IllegalArgumentException("base should be a interface");
    }
}
