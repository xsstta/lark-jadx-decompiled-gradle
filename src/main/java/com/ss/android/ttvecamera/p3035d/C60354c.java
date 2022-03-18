package com.ss.android.ttvecamera.p3035d;

import com.ss.android.ttvecamera.C60427s;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ttvecamera.d.c */
public class C60354c {
    /* renamed from: a */
    private static boolean m234453a(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr == null || clsArr.length == 0) {
            if (objArr == null || objArr.length == 0) {
                return true;
            }
            return false;
        } else if (objArr == null || clsArr.length != objArr.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!(objArr[i] == null || clsArr[i].isAssignableFrom(objArr[i].getClass()))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static <T> T m234451a(String str, String str2, Object[] objArr) {
        try {
            Method a = m234452a((Class<? extends Object>) Class.forName(str), str2, objArr);
            a.setAccessible(true);
            return (T) a.invoke(null, objArr);
        } catch (Exception e) {
            C60427s.m234843c("TEReflectUtil", "couldn't invoke " + str2 + ", " + e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m234452a(Class<? extends Object> cls, String str, Object[] objArr) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals(str) && m234453a(method.getParameterTypes(), objArr)) {
                return method;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return m234452a((Class<? extends Object>) superclass, str, objArr);
        }
        return null;
    }
}
