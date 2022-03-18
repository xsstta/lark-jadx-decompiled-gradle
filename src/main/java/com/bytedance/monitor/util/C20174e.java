package com.bytedance.monitor.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.monitor.util.e */
public class C20174e {

    /* renamed from: a */
    private static Map<String, Method> f49290a = new HashMap();

    /* renamed from: a */
    private static Method m73633a(Method method) {
        if (!C20173d.m73625a((Member) method)) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method c = m73635c(declaringClass, name, parameterTypes);
        if (c == null) {
            return m73634b(declaringClass, name, parameterTypes);
        }
        return c;
    }

    /* renamed from: a */
    public static Object m73630a(Class cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] b = C20175f.m73640b(objArr);
        return m73631a(cls, str, b, C20175f.m73639a(b));
    }

    /* renamed from: b */
    private static Method m73634b(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static Method m73635c(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        return interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method c = m73635c(interfaces[i], str, clsArr);
                        if (c != null) {
                            return c;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: a */
    private static String m73632a(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.toString());
        } else {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.toString());
                sb.append("#");
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static Method m73636d(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method a;
        String a2 = m73632a(cls, str, clsArr);
        synchronized (f49290a) {
            method = f49290a.get(a2);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        try {
            Method method2 = cls.getMethod(str, clsArr);
            C20173d.m73624a((AccessibleObject) method2);
            synchronized (f49290a) {
                f49290a.put(a2, method2);
            }
            return method2;
        } catch (NoSuchMethodException unused) {
            Method method3 = null;
            Method[] methods = cls.getMethods();
            for (Method method4 : methods) {
                if (method4.getName().equals(str) && C20173d.m73626a(clsArr, method4.getParameterTypes(), true) && (a = m73633a(method4)) != null && (method3 == null || C20173d.m73619a(a.getParameterTypes(), method3.getParameterTypes(), clsArr) < 0)) {
                    method3 = a;
                }
            }
            if (method3 != null) {
                C20173d.m73624a((AccessibleObject) method3);
            }
            synchronized (f49290a) {
                f49290a.put(a2, method3);
                return method3;
            }
        }
    }

    /* renamed from: a */
    public static Object m73631a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<?>[] a = C20175f.m73638a(clsArr);
        Object[] b = C20175f.m73640b(objArr);
        Method d = m73636d(cls, str, a);
        if (d != null) {
            return d.invoke(null, b);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + cls.getName());
    }
}
