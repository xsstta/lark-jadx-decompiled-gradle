package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzm extends zzn {
    private final /* synthetic */ C21878q zzag;

    zzm(C21878q qVar) {
        this.zzag = qVar;
    }

    @Override // com.google.android.gms.internal.auth.zzn, com.google.android.gms.auth.account.zza
    public final void zza(boolean z) {
        this.zzag.mo73314b(new C21880s(z ? Status.RESULT_SUCCESS : C21876o.f53274a));
    }
}
