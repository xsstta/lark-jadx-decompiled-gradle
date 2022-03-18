package com.bytedance.platform.horae.common;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.horae.common.d */
public final class C20373d {

    /* renamed from: a */
    private static final Map<String, Field> f49726a = new HashMap();

    /* renamed from: b */
    private static String m74220b(Class<?> cls, String str) {
        return cls.toString() + "#" + str;
    }

    /* renamed from: a */
    public static Field m74219a(Class<?> cls, String str) {
        Field field;
        Field field2;
        Class cls2 = (Class) C20378i.m74232a(cls, "The class must not be null");
        C20378i.m74233a(!TextUtils.isEmpty(str), "The field name must not be blank");
        String b = m74220b(cls2, str);
        Map<String, Field> map = f49726a;
        synchronized (map) {
            field = map.get(b);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls2 != null) {
            try {
                if (C20377h.m74231a()) {
                    field2 = C20371b.m74215a(cls2, str);
                    if (field2 == null) {
                        field2 = cls2.getDeclaredField(str);
                    }
                } else {
                    field2 = cls2.getDeclaredField(str);
                }
                if (!field2.isAccessible()) {
                    field2.setAccessible(true);
                }
                Map<String, Field> map2 = f49726a;
                synchronized (map2) {
                    map2.put(b, field2);
                }
                return field2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        return null;
    }
}
