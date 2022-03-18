package com.google.android.gms.internal.p977authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf */
public final class zzf extends zza implements zze {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // com.google.android.gms.internal.p977authapiphone.zze
    public final void zza(zzg zzg) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21848a.m79163a(obtainAndWriteInterfaceToken, zzg);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
