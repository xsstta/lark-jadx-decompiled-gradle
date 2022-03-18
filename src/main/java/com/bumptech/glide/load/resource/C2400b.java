package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2567j;

/* renamed from: com.bumptech.glide.load.resource.b */
public class C2400b<T> implements AbstractC2383u<T> {

    /* renamed from: a */
    protected final T f7943a;

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public final int mo10879e() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public void mo10880f() {
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: d */
    public final T mo10878d() {
        return this.f7943a;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<T> mo10877c() {
        return (Class<T>) this.f7943a.getClass();
    }

    public C2400b(T t) {
        this.f7943a = (T) C2567j.m10894a((Object) t);
    }
}
