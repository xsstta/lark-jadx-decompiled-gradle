package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzal extends zza implements zzaj {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzaj
    public final void zza(zzad zzad) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, zzad);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
