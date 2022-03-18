package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.f */
public final class C0845f {
    /* renamed from: a */
    public static <T> T m3991a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static int m3989a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static void m3993a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static int m3990a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static <T> T m3992a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m3994a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
