package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

final class zzl extends zzc {
    private final /* synthetic */ C21598j zzbl;

    zzl(C21598j jVar) {
        this.zzbl = jVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void zze(Status status) throws RemoteException {
        this.zzbl.mo73314b((AbstractC21641i) status);
    }
}
