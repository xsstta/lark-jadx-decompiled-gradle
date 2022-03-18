package com.ss.android.floatbubble.util;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.floatbubble.util.b */
public class C28467b {

    /* renamed from: a */
    private static final Method f71603a = m104312a(m104310a("android.os.SystemProperties"));

    /* renamed from: b */
    private static String m104314b(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* renamed from: b */
    private static String m104313b(String str) {
        String c = m104315c(str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        return c;
    }

    /* renamed from: c */
    private static String m104315c(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return java.lang.ClassLoader.getSystemClassLoader().loadClass(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Class<?> m104310a(java.lang.String r1) {
        /*
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x000d }
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x000d }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x000d }
            throw r0     // Catch:{ ClassNotFoundException -> 0x000d }
        L_0x000d:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ ClassNotFoundException -> 0x0016 }
            java.lang.Class r1 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0016 }
            return r1
        L_0x0016:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.floatbubble.util.C28467b.m104310a(java.lang.String):java.lang.Class");
    }

    /* renamed from: a */
    private static Method m104312a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("get", String.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m104311a(String str, String str2) {
        Method method = f71603a;
        if (method != null) {
            try {
                return m104314b(m104313b((String) method.invoke(null, str)), str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
