package com.bytedance.ee.larkbrand.utils;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.ee.larkbrand.utils.d */
public class C13343d {
    /* renamed from: a */
    public static Field m54317a(Object obj, String str) {
        return m54316a((Class) obj.getClass(), str);
    }

    /* renamed from: a */
    public static Field m54316a(Class cls, String str) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Method m54319a(Object obj, String str, Class<?>... clsArr) {
        return m54318a((Class) obj.getClass(), str, clsArr);
    }

    /* renamed from: a */
    public static Method m54318a(Class cls, String str, Class<?>... clsArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    return declaredMethod;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m54320a(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field a = m54317a(obj, str);
        Object[] objArr2 = (Object[]) a.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        a.set(obj, objArr3);
    }
}
