package com.larksuite.framework.utils;

import android.os.Build;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.larksuite.framework.utils.af */
public class C26254af {
    /* renamed from: a */
    public static void m95006a(Field field, Object obj) {
        if (field != null) {
            m95007a(field, (Object) null, obj);
        }
    }

    /* renamed from: b */
    public static Object m95008b(Object obj, String str) {
        Field a = m95002a(obj, str);
        a.setAccessible(true);
        try {
            return a.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Field m95001a(Class<?> cls, String str) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return cls.getDeclaredField(str);
            }
            return (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
        } catch (Exception e) {
            Log.m165383e("ReflectionUtil", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Field m95002a(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Method m95003a(Class<?> cls, String str, Class... clsArr) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return cls.getDeclaredMethod(str, new Class[0]);
            }
            return (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
        } catch (Exception e) {
            Log.m165383e("ReflectionUtil", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Method m95004a(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m95005a(Object obj, String str, Object obj2) {
        Field a = m95002a(obj, str);
        a.setAccessible(true);
        try {
            a.set(obj, obj2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m95007a(Field field, Object obj, Object obj2) {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Object m95000a(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Method a = m95004a(obj, str, clsArr);
        a.setAccessible(true);
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(obj, objArr);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
