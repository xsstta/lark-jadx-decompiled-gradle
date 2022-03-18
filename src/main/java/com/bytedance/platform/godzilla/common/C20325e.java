package com.bytedance.platform.godzilla.common;

import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.common.e */
public final class C20325e {
    /* renamed from: a */
    public static Field m74110a(Class<?> cls, String str) {
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
