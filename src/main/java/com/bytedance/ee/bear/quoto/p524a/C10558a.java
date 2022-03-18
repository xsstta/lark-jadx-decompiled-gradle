package com.bytedance.ee.bear.quoto.p524a;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.quoto.a.a */
public final class C10558a<T> {

    /* renamed from: a */
    private final T f28335a;

    /* renamed from: a */
    public static <T> C10558a<T> m43752a() {
        return new C10558a<>(null);
    }

    /* renamed from: b */
    public boolean mo40006b() {
        if (this.f28335a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public T mo40007c() {
        T t = this.f28335a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    private C10558a(T t) {
        this.f28335a = t;
    }

    /* renamed from: a */
    public static <T> C10558a<T> m43753a(T t) {
        return new C10558a<>(t);
    }
}
