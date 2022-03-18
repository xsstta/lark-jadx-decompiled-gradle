package com.bytedance.android.monitor.p112i;

import android.text.TextUtils;
import com.bytedance.android.monitor.p109f.C2648b;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitor.i.h */
public class C2659h {
    /* renamed from: a */
    public static Object m11186a(Class<?> cls, String str, Object... objArr) {
        return m11185a(cls, str, null, null, objArr);
    }

    /* renamed from: a */
    public static Method m11187a(Class<?> cls, String str, Class<?>[] clsArr) {
        if (cls == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m11185a(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object... objArr2) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            try {
                Method a = m11187a(cls, str, clsArr);
                if (a == null) {
                    return null;
                }
                a.setAccessible(true);
                if (objArr2 == null || objArr2.length <= 0) {
                    return a.invoke(null, objArr);
                }
                return a.invoke(objArr2[0], objArr);
            } catch (Throwable th) {
                C2648b.m11133b("ReflectUtils", "exception in invokeMethod, pkg : " + cls.getName() + ", function : " + str + ", " + th.toString());
            }
        }
        return null;
    }
}
