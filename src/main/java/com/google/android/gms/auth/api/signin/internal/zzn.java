package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

final class zzn extends zzc {
    private final /* synthetic */ C21599k zzbm;

    zzn(C21599k kVar) {
        this.zzbm = kVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void zzf(Status status) throws RemoteException {
        this.zzbm.mo73314b((AbstractC21641i) status);
    }
}
