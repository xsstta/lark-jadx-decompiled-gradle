package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.Status;

final class am implements AbstractC21631d.AbstractC21634c {

    /* renamed from: a */
    private final /* synthetic */ C21676k f52664a;

    am(aj ajVar, C21676k kVar) {
        this.f52664a = kVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21634c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f52664a.mo73314b(new Status(8));
    }
}
