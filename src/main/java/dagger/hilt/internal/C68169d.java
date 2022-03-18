package dagger.hilt.internal;

import java.util.Objects;

/* renamed from: dagger.hilt.internal.d */
public final class C68169d {
    /* renamed from: a */
    public static <T> T m264813a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static <T> T m264814a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static void m264815a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
