package com.google.android.gms.internal.p978authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzk */
final class zzk extends zzg {
    private final /* synthetic */ C21857e zzan;

    zzk(C21857e eVar) {
        this.zzan = eVar;
    }

    @Override // com.google.android.gms.internal.p978authapi.zzg, com.google.android.gms.internal.p978authapi.zzu
    public final void zzc(Status status, Credential credential) {
        this.zzan.mo73314b(new C21855c(status, credential));
    }

    @Override // com.google.android.gms.internal.p978authapi.zzg, com.google.android.gms.internal.p978authapi.zzu
    public final void zzc(Status status) {
        this.zzan.mo73314b(C21855c.m79171a(status));
    }
}
