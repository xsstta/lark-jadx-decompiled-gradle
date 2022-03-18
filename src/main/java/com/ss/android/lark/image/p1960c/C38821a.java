package com.ss.android.lark.image.p1960c;

import java.lang.reflect.Field;

/* renamed from: com.ss.android.lark.image.c.a */
public class C38821a {
    /* renamed from: a */
    public static Object m153223a(Object obj, String str) {
        Field b = m153225b(obj, str);
        b.setAccessible(true);
        try {
            return b.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static Field m153225b(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m153224a(Object obj, String str, Object obj2) {
        try {
            Field b = m153225b(obj, str);
            b.setAccessible(true);
            b.set(obj, obj2);
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}
