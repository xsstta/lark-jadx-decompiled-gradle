package com.bytedance.sysoptimizer;

import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class HackHelper {
    private static Map<String, Constructor> sConstructorCache = new HashMap();
    private static Map<String, Field> sFieldCache = new HashMap();
    private static boolean sInited = false;
    private static Map<String, Method> sMethodCache = new HashMap();

    public static void init() {
        if (!sInited) {
            try {
                writeField(HackHelperImpl.class, "classLoader", (Object) null);
            } catch (Exception unused) {
            }
            sInited = true;
        }
    }

    private static <T> void checkNotNull(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException(str);
        }
    }

    private static void checkTrue(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    private static String getFieldKey(Class<?> cls, String str) {
        return cls.getName() + "#" + str;
    }

    public static Constructor getConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor constructor;
        checkNotNull(cls, "The class must not be null !!!");
        String methodKey = getMethodKey(cls, "clinit", clsArr);
        synchronized (sConstructorCache) {
            constructor = sConstructorCache.get(methodKey);
        }
        if (constructor != null) {
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            return constructor;
        }
        try {
            Constructor constructor2 = HackHelperImpl.getConstructor(cls, clsArr);
            if (constructor2 != null) {
                synchronized (sConstructorCache) {
                    sConstructorCache.put(methodKey, constructor2);
                }
            }
            return constructor2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field getField(Class<?> cls, String str) {
        Field field;
        checkNotNull(cls, "The class must not be null !!!");
        checkTrue(!TextUtils.isEmpty(str), "The field name must not be blank !!!");
        String fieldKey = getFieldKey(cls, str);
        synchronized (sFieldCache) {
            field = sFieldCache.get(fieldKey);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        try {
            Field field2 = HackHelperImpl.getField(cls, str);
            if (field2 != null) {
                synchronized (sFieldCache) {
                    sFieldCache.put(fieldKey, field2);
                }
            }
            return field2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void writeField(Object obj, String str, Object obj2) throws IllegalAccessException {
        checkNotNull(obj, "target object must not be null");
        Field field = getField(obj.getClass(), str);
        if (field != null) {
            writeField(field, obj, obj2);
        }
    }

    private static String getMethodKey(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("#");
        sb.append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.getName());
        } else {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.getName());
                sb.append("#");
            }
        }
        return sb.toString();
    }

    private static void writeField(Field field, Object obj, Object obj2) throws IllegalAccessException {
        checkNotNull(field, "The field must not be null");
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        checkNotNull(cls, "The class must not be null !!!");
        checkTrue(!TextUtils.isEmpty(str), "The method name must not be blank !!!");
        String methodKey = getMethodKey(cls, str, clsArr);
        synchronized (sMethodCache) {
            method = sMethodCache.get(methodKey);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        try {
            Method method2 = HackHelperImpl.getMethod(cls, str, clsArr);
            if (method2 != null) {
                synchronized (sMethodCache) {
                    sMethodCache.put(methodKey, method2);
                }
            }
            return method2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
