package com.bytedance.monitor.util.p853a;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.monitor.util.a.a */
public class C20166a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f49278a;

    /* renamed from: com.bytedance.monitor.util.a.a$a */
    public static class C20167a<T> {

        /* renamed from: a */
        public final Class<? extends T> f49279a;

        /* renamed from: b */
        public final T f49280b;
    }

    static {
        HashMap hashMap = new HashMap();
        f49278a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Float.class, Float.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(Boolean.TYPE, Boolean.TYPE);
        hashMap.put(Byte.TYPE, Byte.TYPE);
        hashMap.put(Character.TYPE, Character.TYPE);
        hashMap.put(Short.TYPE, Short.TYPE);
        hashMap.put(Integer.TYPE, Integer.TYPE);
        hashMap.put(Float.TYPE, Float.TYPE);
        hashMap.put(Long.TYPE, Long.TYPE);
        hashMap.put(Double.TYPE, Double.TYPE);
    }

    /* renamed from: b */
    private static Object[] m73596b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C20167a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C20167a) obj).f49280b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    private static Class<?>[] m73595a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C20167a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C20167a) obj).f49279a;
            }
        }
        return clsArr;
    }

    /* renamed from: a */
    private static boolean m73594a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (clsArr2 == null || clsArr2.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr2 == null) {
            if (clsArr.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].isAssignableFrom(clsArr2[i])) {
                    Map<Class<?>, Class<?>> map = f49278a;
                    if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static <T> T m73590a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return (T) m73592a(cls, str, m73595a(objArr)).invoke(null, m73596b(objArr));
    }

    /* renamed from: a */
    public static <T> T m73591a(String str, String str2, Object... objArr) {
        try {
            return (T) m73590a(Class.forName(str), str2, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m73592a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method a = m73593a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m73592a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private static Method m73593a(Method[] methodArr, String str, Class<?>[] clsArr) {
        Objects.requireNonNull(str, "Method name must not be null.");
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m73594a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }
}
