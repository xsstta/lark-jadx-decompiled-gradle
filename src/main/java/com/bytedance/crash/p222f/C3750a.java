package com.bytedance.crash.p222f;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.f.a */
public class C3750a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f11559a;

    static {
        HashMap hashMap = new HashMap();
        f11559a = hashMap;
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
    private static Object[] m15516b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C3751a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C3751a) obj).f11561b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    private static Class<?>[] m15514a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C3751a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C3751a) obj).f11560a;
            }
        }
        return clsArr;
    }

    /* renamed from: com.bytedance.crash.f.a$a */
    public static class C3751a<T> {

        /* renamed from: a */
        final Class<? extends T> f11560a;

        /* renamed from: b */
        final T f11561b;

        public C3751a(Class<? extends T> cls, T t) {
            this.f11560a = cls;
            this.f11561b = t;
        }
    }

    /* renamed from: a */
    private static <T> T m15510a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return (T) m15513a(cls, str, m15514a(objArr)).invoke(null, m15516b(objArr));
    }

    /* renamed from: b */
    private static <T> T m15515b(Object obj, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return (T) m15513a(obj.getClass(), str, m15514a(objArr)).invoke(obj, m15516b(objArr));
    }

    /* renamed from: a */
    public static <T> T m15511a(Object obj, String str, Object... objArr) {
        try {
            return (T) m15515b(obj, str, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str + "' in " + obj, e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m15512a(String str, String str2, Object... objArr) {
        try {
            return (T) m15510a(Class.forName(str), str2, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m15513a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod;
            }
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException unused) {
            if (cls.getSuperclass() != null) {
                return m15513a((Class<?>) cls.getSuperclass(), str, clsArr);
            }
            throw new NoSuchMethodException();
        } finally {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException();
        }
    }
}
