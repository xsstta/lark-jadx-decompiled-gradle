package com.bytedance.monitor.collector.p852a;

import android.os.Build;
import com.bytedance.monitor.util.C20169b;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.monitor.collector.a.a */
public final class C20123a {
    /* renamed from: a */
    public static boolean m73448a() {
        if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Object m73446a(Object obj, String str) {
        try {
            return m73449b(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static Field m73449b(Class<?> cls, String str) {
        if (!m73448a()) {
            return C20169b.m73603a(cls, str);
        }
        try {
            return m73447a(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Field m73447a(Class<?> cls, String str) {
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
