package dagger.internal;

import dagger.AbstractC68108a;

/* renamed from: dagger.internal.c */
public final class C68175c<T> implements AbstractC68108a<T>, AbstractC68174b<T> {

    /* renamed from: a */
    private static final C68175c<Object> f171410a = new C68175c<>(null);

    /* renamed from: b */
    private final T f171411b;

    @Override // javax.inject.Provider, dagger.AbstractC68108a
    /* renamed from: b */
    public T mo237032b() {
        return this.f171411b;
    }

    private C68175c(T t) {
        this.f171411b = t;
    }

    /* renamed from: a */
    public static <T> AbstractC68174b<T> m264821a(T t) {
        return new C68175c(C68177e.m264824a(t, "instance cannot be null"));
    }
}
