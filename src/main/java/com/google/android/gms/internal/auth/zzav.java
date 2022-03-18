package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzav extends zzaj {
    private final /* synthetic */ C21871j zzcg;

    zzav(C21871j jVar) {
        this.zzcg = jVar;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zzb(String str) {
        if (str != null) {
            this.zzcg.mo73314b(new C21873l(str));
        } else {
            this.zzcg.mo73314b(C21871j.m79179d(new Status(3006)));
        }
    }
}
