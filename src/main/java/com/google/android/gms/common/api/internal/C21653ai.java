package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.internal.C21655b;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.ai */
public final class C21653ai implements ar {

    /* renamed from: a */
    private final as f52634a;

    public C21653ai(as asVar) {
        this.f52634a = asVar;
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73341a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73342a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73343a(ConnectionResult connectionResult, C21611a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: b */
    public final boolean mo73345b() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73340a() {
        for (C21611a.AbstractC21622f fVar : this.f52634a.f52672a.values()) {
            fVar.disconnect();
        }
        this.f52634a.f52675d.f52637c = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73339a(T t) {
        this.f52634a.f52675d.f52635a.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73344b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: c */
    public final void mo73346c() {
        this.f52634a.mo73373d();
    }
}
