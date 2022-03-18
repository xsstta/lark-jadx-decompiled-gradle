package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C21928p;
import com.google.android.gms.internal.location.zza;

public final class zzw extends zza implements zzu {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationAvailability(LocationAvailability locationAvailability) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, locationAvailability);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationResult(LocationResult locationResult) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, locationResult);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
