package com.ss.android.lark.openapi.p2397a;

import android.os.Build;
import android.webkit.WebSettings;
import com.ss.android.lark.log.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.lark.openapi.a.a */
public class C48757a {
    /* renamed from: a */
    private static Method m192081a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m192082a(WebSettings webSettings, String str, String str2) {
        Method a;
        if (Build.VERSION.SDK_INT >= 15 && Build.VERSION.SDK_INT < 19 && (a = m192081a(webSettings.getClass(), "setProperty", String.class, String.class)) != null) {
            m192083a(webSettings, a, str, str2);
        }
    }

    /* renamed from: a */
    private static void m192083a(Object obj, Method method, Object... objArr) {
        try {
            method.invoke(obj, objArr);
        } catch (IllegalArgumentException e) {
            Log.m165383e("ApiCompatibilityUtils", "invokeVoidMethod: IllegalArgumentException: " + e.getMessage());
        } catch (IllegalAccessException e2) {
            Log.m165383e("ApiCompatibilityUtils", "invokeVoidMethod: IllegalAccessException: " + e2.getMessage());
        } catch (InvocationTargetException e3) {
            Log.m165383e("ApiCompatibilityUtils", "invokeVoidMethod: InvocationTargetException: " + e3.getMessage());
        }
    }
}
