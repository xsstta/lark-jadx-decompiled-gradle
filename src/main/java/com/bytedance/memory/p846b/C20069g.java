package com.bytedance.memory.p846b;

/* renamed from: com.bytedance.memory.b.g */
public final class C20069g {
    /* renamed from: a */
    public static void m73233a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static <T> T m73232a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }
}
