package com.google.android.play.core.internal;

public final class ca<T> implements AbstractC22633by, cc {

    /* renamed from: a */
    private static final Object f56047a = new Object();

    /* renamed from: b */
    private volatile cc<T> f56048b;

    /* renamed from: c */
    private volatile Object f56049c = f56047a;

    private ca(cc<T> ccVar) {
        this.f56048b = ccVar;
    }

    /* renamed from: a */
    public static <P extends cc<T>, T> cc<T> m82377a(P p) {
        bd.m82321a(p);
        return !(p instanceof ca) ? new ca(p) : p;
    }

    /* renamed from: b */
    public static <P extends cc<T>, T> AbstractC22633by<T> m82378b(P p) {
        if (p instanceof AbstractC22633by) {
            return (AbstractC22633by) p;
        }
        bd.m82321a(p);
        return new ca(p);
    }

    @Override // com.google.android.play.core.internal.AbstractC22633by, com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final T mo78909a() {
        T t = (T) this.f56049c;
        Object obj = f56047a;
        if (t == obj) {
            synchronized (this) {
                t = this.f56049c;
                if (t == obj) {
                    t = this.f56048b.mo78728a();
                    Object obj2 = this.f56049c;
                    if (obj2 != obj) {
                        if (!(obj2 instanceof cb)) {
                            if (obj2 != t) {
                                String valueOf = String.valueOf(obj2);
                                String valueOf2 = String.valueOf(t);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                                sb.append("Scoped provider was invoked recursively returning different results: ");
                                sb.append(valueOf);
                                sb.append(" & ");
                                sb.append(valueOf2);
                                sb.append(". This is likely due to a circular dependency.");
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                    }
                    this.f56049c = t;
                    this.f56048b = null;
                }
            }
        }
        return t;
    }
}
