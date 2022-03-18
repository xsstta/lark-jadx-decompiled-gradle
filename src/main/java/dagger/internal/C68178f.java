package dagger.internal;

import javax.inject.Provider;

/* renamed from: dagger.internal.f */
public final class C68178f<T> implements Provider<T> {

    /* renamed from: a */
    static final /* synthetic */ boolean f171412a = true;

    /* renamed from: b */
    private static final Object f171413b = new Object();

    /* renamed from: c */
    private volatile Provider<T> f171414c;

    /* renamed from: d */
    private volatile Object f171415d = f171413b;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public T mo47880b() {
        T t = (T) this.f171415d;
        if (t != f171413b) {
            return t;
        }
        Provider<T> provider = this.f171414c;
        if (provider == null) {
            return (T) this.f171415d;
        }
        T b = provider.mo47880b();
        this.f171415d = b;
        this.f171414c = null;
        return b;
    }

    private C68178f(Provider<T> provider) {
        if (f171412a || provider != null) {
            this.f171414c = provider;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m264827a(P p) {
        if ((p instanceof C68178f) || (p instanceof C68173a)) {
            return p;
        }
        return new C68178f((Provider) C68177e.m264823a(p));
    }
}
