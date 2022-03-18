package com.bytedance.common.jato.utils;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DoubleReflector {
    private static Method mForNameMethod;
    private static Method mGetDeclaredConstructorMethod;
    private static Method mGetDeclaredFieldMethod;
    private static Method mGetDeclaredMethod;

    static {
        try {
            mGetDeclaredFieldMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            mGetDeclaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            mGetDeclaredConstructorMethod = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            mForNameMethod = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    public static Class<?> getClass(String str) throws Exception {
        Method method;
        Class<?> cls = null;
        if (Build.VERSION.SDK_INT >= 29 && (method = mForNameMethod) != null) {
            cls = (Class) method.invoke(null, str);
        }
        if (cls == null) {
            return Class.forName(str);
        }
        return cls;
    }

    public static Constructor getConstructor(Class<?> cls, Class<?>... clsArr) throws Exception {
        Constructor constructor;
        Method method;
        if (Build.VERSION.SDK_INT < 29 || (method = mGetDeclaredConstructorMethod) == null) {
            constructor = null;
        } else {
            constructor = (Constructor) method.invoke(cls, clsArr);
        }
        if (constructor == null) {
            return cls.getDeclaredConstructor(clsArr);
        }
        return constructor;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) throws Exception {
        Method method;
        Method method2;
        if (Build.VERSION.SDK_INT < 29 || (method2 = mGetDeclaredMethod) == null) {
            method = null;
        } else {
            method = (Method) method2.invoke(cls, str, clsArr);
        }
        if (method == null) {
            return cls.getDeclaredMethod(str, clsArr);
        }
        return method;
    }
}
