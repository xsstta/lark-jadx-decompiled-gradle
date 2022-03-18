package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;

final class zzh extends AccountTransferClient.zza<DeviceMetaData> {
    private final /* synthetic */ C21550c zzas;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzh(C21550c cVar, AccountTransferClient.AbstractC21546a aVar) {
        super(aVar);
        this.zzas = cVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zza(DeviceMetaData deviceMetaData) {
        this.zzas.mo72948a(deviceMetaData);
    }
}
