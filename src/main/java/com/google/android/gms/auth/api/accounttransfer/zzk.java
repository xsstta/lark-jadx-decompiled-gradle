package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzs;

final class zzk extends zzs {
    private final /* synthetic */ AccountTransferClient.AbstractC21547b zzay;

    zzk(AccountTransferClient.AbstractC21547b bVar) {
        this.zzay = bVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zzd() {
        this.zzay.mo72948a((Object) null);
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void onFailure(Status status) {
        this.zzay.mo72945a(status);
    }
}
