package com.ss.android.vcxp.p3186c;

import com.ss.android.vcxp.C63809f;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.vcxp.c.d */
public class C63806d {

    /* renamed from: a */
    private static ConcurrentHashMap<String, Method> f161015a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<Class, Method> f161016b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static String m250512a(String str) {
        if (str.equals(XProcess.Original.value())) {
            str = C63809f.f161025c;
        } else {
            str.equals(XProcess.Unspecified.value());
        }
        return String.format("content://%s.vcxp.%sProvider/main", C63809f.f161027e, str);
    }

    /* renamed from: b */
    public static XClass m250515b(Class cls) {
        Annotation annotation = cls.getAnnotation(XClass.class);
        if (annotation == null && (annotation = cls.getSuperclass().getAnnotation(XClass.class)) == null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                annotation = cls2.getAnnotation(XClass.class);
                if (annotation != null) {
                    break;
                }
            }
        }
        if (annotation != null) {
            return (XClass) annotation;
        }
        return null;
    }

    /* renamed from: a */
    public static Method m250513a(Class cls) {
        Method method = f161016b.get(cls);
        if (method != null) {
            return method;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method2 : declaredMethods) {
            Annotation[] declaredAnnotations = method2.getDeclaredAnnotations();
            if (declaredAnnotations != null) {
                for (Annotation annotation : declaredAnnotations) {
                    if (annotation instanceof XSingleton) {
                        method2.setAccessible(true);
                        f161016b.put(cls, method2);
                        return method2;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Method m250514a(Class cls, String str, String str2) {
        XMethod xMethod;
        String str3 = cls.getName() + "@" + str + "@" + str2;
        Method method = f161015a.get(str3);
        if (method == null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (method2.getName().equals(str)) {
                    if (str2 == null || str2.isEmpty() || ((xMethod = (XMethod) method2.getAnnotation(XMethod.class)) != null && xMethod.methodId().equals(str2))) {
                        method = method2;
                    }
                    if (method != null) {
                        method.setAccessible(true);
                        f161015a.put(str3, method);
                        break;
                    }
                }
                i++;
            }
        }
        return method;
    }
}
