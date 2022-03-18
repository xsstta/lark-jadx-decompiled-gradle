package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.internal.Preconditions;

public final class ck implements AbstractC21631d.AbstractC21633b, AbstractC21631d.AbstractC21634c {

    /* renamed from: a */
    public final C21611a<?> f52803a;

    /* renamed from: b */
    private final boolean f52804b;

    /* renamed from: c */
    private cl f52805c;

    public ck(C21611a<?> aVar, boolean z) {
        this.f52803a = aVar;
        this.f52804b = z;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnected(Bundle bundle) {
        m78638a();
        this.f52805c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnectionSuspended(int i) {
        m78638a();
        this.f52805c.onConnectionSuspended(i);
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21634c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        m78638a();
        this.f52805c.mo73365a(connectionResult, this.f52803a, this.f52804b);
    }

    /* renamed from: a */
    public final void mo73463a(cl clVar) {
        this.f52805c = clVar;
    }

    /* renamed from: a */
    private final void m78638a() {
        Preconditions.checkNotNull(this.f52805c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
