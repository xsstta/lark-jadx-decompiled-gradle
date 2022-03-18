package com.bytedance.platform.godzilla.p872b;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.b.a */
public final class C20309a {

    /* renamed from: a */
    private static final Map<String, Field> f49581a = new HashMap();

    /* renamed from: a */
    public static Object m74064a(Field field) throws IllegalAccessException {
        return m74065a((Field) C20314f.m74083a(field, "The field must not be null"), (Object) null);
    }

    /* renamed from: b */
    public static Object m74069b(Class<?> cls, String str) throws IllegalAccessException {
        Field a = m74066a(cls, str);
        if (a != null) {
            return m74064a(a);
        }
        return null;
    }

    /* renamed from: a */
    public static Object m74063a(Object obj, String str) throws IllegalAccessException {
        Object a = C20314f.m74083a(obj, "target object must not be null");
        Field a2 = m74066a(a.getClass(), str);
        if (a2 != null) {
            return m74065a(a2, a);
        }
        return null;
    }

    /* renamed from: b */
    public static void m74070b(Field field, Object obj) throws IllegalAccessException {
        m74068a((Field) C20314f.m74083a(field, "The field must not be null"), (Object) null, obj);
    }

    /* renamed from: c */
    private static String m74071c(Class<?> cls, String str) {
        return cls.toString() + "#" + str;
    }

    /* renamed from: a */
    public static Object m74065a(Field field, Object obj) throws IllegalAccessException {
        boolean z;
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        C20314f.m74084a(z, "The field must not be null");
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    /* renamed from: a */
    public static Field m74066a(Class<?> cls, String str) {
        Field field;
        Field field2;
        Class<? super Object> cls2 = (Class) C20314f.m74083a(cls, "The class must not be null");
        C20314f.m74085b(!TextUtils.isEmpty(str), "The field name must not be blank");
        String c = m74071c(cls2, str);
        Map<String, Field> map = f49581a;
        synchronized (map) {
            field = map.get(c);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls2 != null) {
            try {
                if (!C20313e.m74082a() || C20311c.m74075a() == null) {
                    field2 = cls2.getDeclaredField(str);
                } else {
                    field2 = C20311c.m74075a().mo68639a(cls2, str);
                    if (field2 == null) {
                        field2 = cls2.getDeclaredField(str);
                    }
                }
                if (field2 != null) {
                    if (!field2.isAccessible()) {
                        field2.setAccessible(true);
                    }
                    Map<String, Field> map2 = f49581a;
                    synchronized (map2) {
                        map2.put(c, field2);
                    }
                }
                return field2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m74067a(Object obj, String str, Object obj2) throws IllegalAccessException {
        Object a = C20314f.m74083a(obj, "target object must not be null");
        Field a2 = m74066a(a.getClass(), str);
        if (a2 != null) {
            m74068a(a2, a, obj2);
        }
    }

    /* renamed from: a */
    public static void m74068a(Field field, Object obj, Object obj2) throws IllegalAccessException {
        Field field2 = (Field) C20314f.m74083a(field, "The field must not be null");
        if (!field2.isAccessible()) {
            field2.setAccessible(true);
        }
        field2.set(obj, obj2);
    }
}
