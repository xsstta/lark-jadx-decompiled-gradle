package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zza;

public final class zzai extends zza implements zzah {
    zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zza(Location location) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, location);
        zzb(2, zza);
    }
}
