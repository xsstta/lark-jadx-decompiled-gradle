package com.google.firebase.components;

import com.google.firebase.p995a.AbstractC22752a;

/* renamed from: com.google.firebase.components.m */
public class C22775m<T> implements AbstractC22752a<T> {

    /* renamed from: a */
    private static final Object f56316a = new Object();

    /* renamed from: b */
    private volatile Object f56317b = f56316a;

    /* renamed from: c */
    private volatile AbstractC22752a<T> f56318c;

    @Override // com.google.firebase.p995a.AbstractC22752a
    /* renamed from: a */
    public T mo79125a() {
        T t = (T) this.f56317b;
        Object obj = f56316a;
        if (t == obj) {
            synchronized (this) {
                t = this.f56317b;
                if (t == obj) {
                    t = this.f56318c.mo79125a();
                    this.f56317b = t;
                    this.f56318c = null;
                }
            }
        }
        return t;
    }

    public C22775m(AbstractC22752a<T> aVar) {
        this.f56318c = aVar;
    }
}
