package com.bytedance.ee.bear.drive.loader.download.p356a;

import java.util.NoSuchElementException;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.a.a */
public final class C7002a<T> {

    /* renamed from: a */
    private final T f18934a;

    /* renamed from: a */
    public static <T> C7002a<T> m27890a() {
        return new C7002a<>(null);
    }

    /* renamed from: b */
    public boolean mo27534b() {
        if (this.f18934a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public T mo27535c() {
        T t = this.f18934a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    private C7002a(T t) {
        this.f18934a = t;
    }

    /* renamed from: a */
    public static <T> C7002a<T> m27891a(T t) {
        return new C7002a<>(t);
    }
}
