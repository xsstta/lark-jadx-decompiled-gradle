package dagger.internal;

import java.util.Objects;

/* renamed from: dagger.internal.e */
public final class C68177e {
    /* renamed from: a */
    public static <T> T m264823a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static <T> T m264826b(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }

    /* renamed from: a */
    public static <T> T m264824a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static <T> void m264825a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }
}
