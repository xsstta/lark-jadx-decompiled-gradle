package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C21928p;
import com.google.android.gms.internal.location.zza;

public final class zzz extends zza implements zzx {
    zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.zzx
    public final void onLocationChanged(Location location) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, location);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
