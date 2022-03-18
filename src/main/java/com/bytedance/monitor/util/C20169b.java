package com.bytedance.monitor.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.monitor.util.b */
public final class C20169b {

    /* renamed from: a */
    private static final Map<String, Field> f49282a = new HashMap();

    /* renamed from: a */
    public static Object m73602a(Field field, Object obj) throws IllegalAccessException {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    /* renamed from: a */
    public static Object m73601a(Object obj, String str) throws IllegalAccessException {
        Field a = m73603a(obj.getClass(), str);
        if (a != null) {
            return m73602a(a, obj);
        }
        return null;
    }

    /* renamed from: b */
    private static String m73606b(Class<?> cls, String str) {
        return cls.toString() + "#" + str;
    }

    /* renamed from: a */
    public static Field m73603a(Class<?> cls, String str) {
        Field field;
        String b = m73606b(cls, str);
        Map<String, Field> map = f49282a;
        synchronized (map) {
            field = map.get(b);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = f49282a;
                synchronized (map2) {
                    map2.put(b, declaredField);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m73604a(Object obj, String str, Object obj2) throws IllegalAccessException {
        Field a = m73603a(obj.getClass(), str);
        if (a != null) {
            m73605a(a, obj, obj2);
        }
    }

    /* renamed from: a */
    public static void m73605a(Field field, Object obj, Object obj2) throws IllegalAccessException {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }
}
