package com.bytedance.common.utility.reflect;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import java.lang.reflect.Method;

public final class ReflectUtils {
    public static Method getMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        if (cls == null || StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            Logger.m15167d("ReflectUtils", "thread id : " + Thread.currentThread().getName());
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object invokeMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object... objArr2) {
        if (cls != null && !StringUtils.isEmpty(str)) {
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            try {
                Method method = getMethod(cls, str, clsArr);
                if (method == null) {
                    return null;
                }
                method.setAccessible(true);
                if (objArr2 == null || objArr2.length <= 0) {
                    return method.invoke(null, objArr);
                }
                return method.invoke(objArr2[0], objArr);
            } catch (Throwable th) {
                Logger.m15170e("ReflectUtils", "exception in invokeMethod, pkg : " + cls.getName() + ", function : " + str + ", " + th.toString());
            }
        }
        return null;
    }
}
