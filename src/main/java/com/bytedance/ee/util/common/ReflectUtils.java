package com.bytedance.ee.util.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class ReflectUtils {

    /* renamed from: a */
    public final Object f35764a;

    /* renamed from: a */
    public <T> T mo50540a() {
        return (T) this.f35764a;
    }

    public int hashCode() {
        return this.f35764a.hashCode();
    }

    public String toString() {
        return this.f35764a.toString();
    }

    public static class ReflectException extends RuntimeException {
        private static final long serialVersionUID = 858774075258496016L;

        public ReflectException(String str) {
            super(str);
        }

        public ReflectException(Throwable th) {
            super(th);
        }

        public ReflectException(String str, Throwable th) {
            super(str, th);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReflectUtils) || !this.f35764a.equals(((ReflectUtils) obj).mo50540a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> Class<T> m55227a(Object obj) {
        Type[] typeArr;
        if (obj == null) {
            return null;
        }
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        if (genericSuperclass == null) {
            typeArr = null;
        } else {
            typeArr = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        if (typeArr == null || typeArr.length <= 0) {
            return null;
        }
        return (Class) typeArr[0];
    }

    /* renamed from: a */
    public static Class<?> m55226a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Void.TYPE == cls) {
            return Void.class;
        }
        return cls;
    }

    /* renamed from: b */
    public static <T> Class<T> m55228b(Object obj) {
        Type[] typeArr;
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        while (cls != null && (cls.getGenericInterfaces() == null || cls.getGenericInterfaces().length == 0)) {
            cls = cls.getSuperclass();
        }
        if (cls == null) {
            return null;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length <= 0 || !(genericInterfaces[0] instanceof ParameterizedType)) {
            typeArr = null;
        } else {
            typeArr = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
        }
        if (typeArr == null || typeArr.length <= 0) {
            return null;
        }
        return (Class) typeArr[0];
    }
}
