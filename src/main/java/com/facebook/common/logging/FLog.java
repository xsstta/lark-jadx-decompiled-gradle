package com.facebook.common.logging;

public class FLog {
    private static AbstractC21028b sHandler = C21027a.m76618a();

    /* renamed from: v */
    public static void m76603v(String str, String str2, Object obj) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(str, formatString(str2, obj));
        }
    }

    /* renamed from: v */
    public static void m76604v(String str, String str2, Object obj, Object obj2) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m76605v(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m76606v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m76608v(String str, String str2, Object... objArr) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(str, formatString(str2, objArr));
        }
    }

    /* renamed from: v */
    public static void m76609v(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71252a(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m76607v(String str, String str2, Throwable th) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71252a(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m76563d(String str, String str2, Object obj) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(str, formatString(str2, obj));
        }
    }

    /* renamed from: d */
    public static void m76564d(String str, String str2, Object obj, Object obj2) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: d */
    public static void m76565d(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m76566d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: d */
    public static void m76568d(String str, String str2, Object... objArr) {
        if (sHandler.mo71256b(3)) {
            m76562d(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m76569d(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.mo71256b(3)) {
            m76567d(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m76567d(String str, String str2, Throwable th) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71255b(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m76587i(String str, String str2, Object obj) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(str, formatString(str2, obj));
        }
    }

    /* renamed from: i */
    public static void m76588i(String str, String str2, Object obj, Object obj2) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: i */
    public static void m76589i(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m76590i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m76592i(String str, String str2, Object... objArr) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m76593i(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71258c(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m76591i(String str, String str2, Throwable th) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71258c(str, str2, th);
        }
    }

    public static int getMinimumLoggingLevel() {
        return sHandler.mo71253b();
    }

    private static String getTag(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static boolean isLoggable(int i) {
        return sHandler.mo71256b(i);
    }

    public static void setMinimumLoggingLevel(int i) {
        sHandler.mo71250a(i);
    }

    public static void setLoggingDelegate(AbstractC21028b bVar) {
        if (bVar != null) {
            sHandler = bVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    /* renamed from: d */
    public static void m76562d(String str, String str2) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(str, str2);
        }
    }

    /* renamed from: e */
    public static void m76574e(String str, String str2) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71261e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m76586i(String str, String str2) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(str, str2);
        }
    }

    /* renamed from: v */
    public static void m76602v(String str, String str2) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(str, str2);
        }
    }

    public static void wtf(String str, String str2) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71263f(str, str2);
        }
    }

    /* renamed from: d */
    public static void m76554d(Class<?> cls, String str) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(getTag(cls), str);
        }
    }

    /* renamed from: e */
    public static void m76570e(Class<?> cls, String str) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71261e(getTag(cls), str);
        }
    }

    /* renamed from: i */
    public static void m76578i(Class<?> cls, String str) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(getTag(cls), str);
        }
    }

    /* renamed from: v */
    public static void m76594v(Class<?> cls, String str) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(getTag(cls), str);
        }
    }

    /* renamed from: w */
    public static void m76610w(Class<?> cls, String str) {
        if (sHandler.mo71256b(5)) {
            sHandler.mo71259d(getTag(cls), str);
        }
    }

    public static void wtf(Class<?> cls, String str) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71263f(getTag(cls), str);
        }
    }

    /* renamed from: w */
    public static void m76614w(String str, String str2) {
        if (sHandler.mo71256b(5)) {
            sHandler.mo71259d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m76555d(Class<?> cls, String str, Object obj) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: e */
    public static void m76571e(Class<?> cls, String str, Throwable th) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71262e(getTag(cls), str, th);
        }
    }

    /* renamed from: i */
    public static void m76579i(Class<?> cls, String str, Object obj) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: v */
    public static void m76595v(Class<?> cls, String str, Object obj) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: w */
    public static void m76611w(Class<?> cls, String str, Throwable th) {
        if (sHandler.mo71256b(5)) {
            sHandler.mo71260d(getTag(cls), str, th);
        }
    }

    public static void wtf(Class<?> cls, String str, Throwable th) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71264f(getTag(cls), str, th);
        }
    }

    /* renamed from: e */
    public static void m76572e(Class<?> cls, String str, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71261e(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: w */
    public static void m76612w(Class<?> cls, String str, Object... objArr) {
        if (sHandler.mo71256b(5)) {
            sHandler.mo71259d(getTag(cls), formatString(str, objArr));
        }
    }

    public static void wtf(Class<?> cls, String str, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71263f(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: e */
    public static void m76575e(String str, String str2, Throwable th) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71262e(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m76615w(String str, String str2, Throwable th) {
        if (sHandler.mo71256b(5)) {
            sHandler.mo71260d(str, str2, th);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71264f(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m76559d(Class<?> cls, String str, Throwable th) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71255b(getTag(cls), str, th);
        }
    }

    /* renamed from: e */
    public static void m76576e(String str, String str2, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71261e(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m76583i(Class<?> cls, String str, Throwable th) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71258c(getTag(cls), str, th);
        }
    }

    /* renamed from: v */
    public static void m76599v(Class<?> cls, String str, Throwable th) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71252a(getTag(cls), str, th);
        }
    }

    /* renamed from: w */
    public static void m76616w(String str, String str2, Object... objArr) {
        if (sHandler.mo71256b(5)) {
            sHandler.mo71259d(str, formatString(str2, objArr));
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71263f(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m76560d(Class<?> cls, String str, Object... objArr) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: i */
    public static void m76584i(Class<?> cls, String str, Object... objArr) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: v */
    public static void m76600v(Class<?> cls, String str, Object... objArr) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: w */
    public static void m76613w(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(5)) {
            m76611w(cls, formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m76556d(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: i */
    public static void m76580i(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m76596v(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: e */
    public static void m76573e(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71262e(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void wtf(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71264f(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: e */
    public static void m76577e(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71262e(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: w */
    public static void m76617w(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.mo71256b(5)) {
            sHandler.mo71260d(str, formatString(str2, objArr), th);
        }
    }

    public static void wtf(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.mo71256b(6)) {
            sHandler.mo71264f(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m76561d(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71255b(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m76585i(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(4)) {
            sHandler.mo71258c(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m76601v(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71252a(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m76557d(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m76581i(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m76597v(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (isLoggable(2)) {
            m76594v(cls, formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m76558d(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.mo71256b(3)) {
            sHandler.mo71254b(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m76582i(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.mo71256b(4)) {
            sHandler.mo71257c(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m76598v(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.mo71256b(2)) {
            sHandler.mo71251a(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }
}
