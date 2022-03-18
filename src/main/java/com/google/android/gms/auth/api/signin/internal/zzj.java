package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C21582d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

final class zzj extends zzc {
    private final /* synthetic */ C21597i zzbk;

    zzj(C21597i iVar) {
        this.zzbk = iVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void zzc(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            C21601m.m78217a(this.zzbk.f52532a).mo73106a(this.zzbk.f52533b, googleSignInAccount);
        }
        this.zzbk.mo73314b(new C21582d(googleSignInAccount, status));
    }
}
