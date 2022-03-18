package com.bytedance.platform.horae.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.horae.common.c */
public final class C20372c {
    /* renamed from: a */
    public static Field m74217a(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Method m74218a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
