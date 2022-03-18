package com.ss.android.lark.mail.impl.validator.base;

import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.validator.base.f */
public final class C43886f {
    /* renamed from: a */
    public static <T> T m173939a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static void m173945b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m173941a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static int m173937a(int i, int i2) {
        return m173938a(i, i2, "index");
    }

    /* renamed from: a */
    public static <T> T m173940a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m173938a(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m173944b(i, i2, str));
    }

    /* renamed from: a */
    public static void m173942a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C43894j.m173961a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: b */
    private static String m173944b(int i, int i2, String str) {
        if (i < 0) {
            return C43894j.m173961a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C43894j.m173961a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: a */
    public static void m173943a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C43894j.m173961a(str, obj));
        }
    }
}
