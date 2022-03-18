package com.bytedance.platform.horae.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.horae.common.b */
public final class C20371b {
    /* renamed from: a */
    public static Field m74215a(Class<?> cls, String str) {
        if (!C20377h.m74231a()) {
            return C20373d.m74219a(cls, str);
        }
        try {
            return C20372c.m74217a(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m74216a(Class<?> cls, String str, Class<?>... clsArr) {
        if (!C20377h.m74231a()) {
            return C20376g.m74228a(cls, str, (Class[]) clsArr);
        }
        try {
            return C20372c.m74218a(cls, str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
