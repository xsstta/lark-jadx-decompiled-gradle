package io.reactivex.internal.p3459a;

import io.reactivex.functions.AbstractC68311c;
import java.util.Objects;

/* renamed from: io.reactivex.internal.a.b */
public final class C68362b {

    /* renamed from: a */
    static final AbstractC68311c<Object, Object> f171680a = new C68363a();

    /* renamed from: a */
    public static int m265224a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m265226a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: io.reactivex.internal.a.b$a */
    static final class C68363a implements AbstractC68311c<Object, Object> {
        C68363a() {
        }

        @Override // io.reactivex.functions.AbstractC68311c
        /* renamed from: a */
        public boolean mo238039a(Object obj, Object obj2) {
            return C68362b.m265230a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static <T> AbstractC68311c<T, T> m265228a() {
        return (AbstractC68311c<T, T>) f171680a;
    }

    /* renamed from: a */
    public static <T> T m265229a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static int m265225a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    /* renamed from: a */
    public static long m265227a(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }

    /* renamed from: a */
    public static boolean m265230a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
