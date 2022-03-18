package com.ss.android.lark.p1786d;

import java.lang.reflect.Field;

/* renamed from: com.ss.android.lark.d.d */
public final class C36433d {
    /* renamed from: a */
    public static Field m143581a(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
