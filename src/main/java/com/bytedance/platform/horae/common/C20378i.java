package com.bytedance.platform.horae.common;

/* renamed from: com.bytedance.platform.horae.common.i */
public final class C20378i {
    /* renamed from: a */
    public static <T> T m74232a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static void m74233a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
