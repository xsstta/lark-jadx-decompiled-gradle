package com.facebook.infer.annotation;

import javax.annotation.Nullable;

/* renamed from: com.facebook.infer.annotation.a */
public class C21045a {
    /* renamed from: a */
    public static <T> T m76676a(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static void m76678a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static <T> T m76677a(@Nullable T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    /* renamed from: a */
    public static void m76679a(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
