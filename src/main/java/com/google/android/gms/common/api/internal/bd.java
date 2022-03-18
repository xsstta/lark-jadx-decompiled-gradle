package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21611a.AbstractC21615d;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.common.api.internal.C21655b;

public final class bd<O extends C21611a.AbstractC21615d> extends C21686u {

    /* renamed from: a */
    private final C21628c<O> f52701a;

    public bd(C21628c<O> cVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f52701a = cVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final void mo73264a(bq bqVar) {
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: b */
    public final void mo73270b(bq bqVar) {
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73261a(T t) {
        return (T) this.f52701a.mo73244a(t);
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73268b(T t) {
        return (T) this.f52701a.mo73249b(t);
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: c */
    public final Looper mo73271c() {
        return this.f52701a.mo73255h();
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: b */
    public final Context mo73267b() {
        return this.f52701a.mo73256i();
    }
}
