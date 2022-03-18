package dagger.internal;

import dagger.AbstractC68108a;
import javax.inject.Provider;

/* renamed from: dagger.internal.a */
public final class C68173a<T> implements AbstractC68108a<T>, Provider<T> {

    /* renamed from: a */
    static final /* synthetic */ boolean f171406a = true;

    /* renamed from: b */
    private static final Object f171407b = new Object();

    /* renamed from: c */
    private volatile Provider<T> f171408c;

    /* renamed from: d */
    private volatile Object f171409d = f171407b;

    @Override // javax.inject.Provider, dagger.AbstractC68108a
    /* renamed from: b */
    public T mo237032b() {
        T t = (T) this.f171409d;
        Object obj = f171407b;
        if (t == obj) {
            synchronized (this) {
                t = this.f171409d;
                if (t == obj) {
                    t = this.f171408c.mo47880b();
                    this.f171409d = m264817a(this.f171409d, t);
                    this.f171408c = null;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m264818a(P p) {
        C68177e.m264823a(p);
        if (p instanceof C68173a) {
            return p;
        }
        return new C68173a(p);
    }

    private C68173a(Provider<T> provider) {
        if (f171406a || provider != null) {
            this.f171408c = provider;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> AbstractC68108a<T> m264819b(P p) {
        if (p instanceof AbstractC68108a) {
            return (AbstractC68108a) p;
        }
        return new C68173a((Provider) C68177e.m264823a(p));
    }

    /* renamed from: a */
    public static Object m264817a(Object obj, Object obj2) {
        boolean z;
        if (obj == f171407b || (obj instanceof C68176d)) {
            z = false;
        } else {
            z = f171406a;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }
}
