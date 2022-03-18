package com.google.firebase.components;

import java.util.Objects;

/* renamed from: com.google.firebase.components.n */
public final class C22776n {
    /* renamed from: a */
    public static <T> T m82763a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static <T> T m82764a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static void m82765a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m82766b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
