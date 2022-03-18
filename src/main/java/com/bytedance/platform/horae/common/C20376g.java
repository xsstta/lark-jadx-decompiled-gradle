package com.bytedance.platform.horae.common;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.horae.common.g */
public final class C20376g {

    /* renamed from: a */
    private static Map<String, Method> f49730a = new HashMap();

    /* renamed from: b */
    private static final HashMap<Class<?>, Class<?>> f49731b;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f49731b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
    }

    /* renamed from: a */
    public static boolean m74229a(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = f49731b.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = f49731b.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    /* renamed from: a */
    public static Object m74226a(Class cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] b = C20374e.m74223b(objArr);
        return m74227a(cls, str, b, C20374e.m74222a(b));
    }

    /* renamed from: b */
    private static String m74230b(Class<?> cls, String str, Class... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.toString());
        } else {
            for (Class cls2 : clsArr) {
                sb.append(cls2.toString());
                sb.append("#");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Method m74228a(Class<?> cls, String str, Class... clsArr) {
        Method method;
        Method[] declaredMethods;
        C20378i.m74232a(cls, "The class must not be null");
        C20378i.m74233a(!TextUtils.isEmpty(str), "The method name must not be blank");
        String b = m74230b(cls, str, clsArr);
        synchronized (f49730a) {
            method = f49730a.get(b);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        while (cls != null) {
            try {
                if (C20377h.m74231a()) {
                    method = C20371b.m74216a(cls, str, clsArr);
                    if (method == null) {
                        method = cls.getDeclaredMethod(str, clsArr);
                    }
                } else {
                    method = cls.getDeclaredMethod(str, clsArr);
                }
            } catch (NoSuchMethodException unused) {
            }
            if (method == null && (declaredMethods = cls.getDeclaredMethods()) != null) {
                for (Method method2 : declaredMethods) {
                    if (method2 != null && TextUtils.equals(method2.getName(), str)) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        if (clsArr != null && clsArr.length == parameterTypes.length) {
                            boolean z = true;
                            for (int i = 0; i < clsArr.length; i++) {
                                if (!m74229a(clsArr[i], parameterTypes[i])) {
                                    z = false;
                                }
                            }
                            if (z) {
                                method = method2;
                            }
                        }
                    }
                }
            }
            if (method != null) {
                method.setAccessible(true);
                synchronized (f49730a) {
                    f49730a.put(b, method);
                }
                return method;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: a */
    public static Object m74227a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<?>[] a = C20374e.m74221a(clsArr);
        Object[] b = C20374e.m74223b(objArr);
        Method a2 = m74228a((Class<?>) cls, str, (Class[]) a);
        if (a2 != null) {
            return a2.invoke(null, b);
        }
        return null;
    }
}
