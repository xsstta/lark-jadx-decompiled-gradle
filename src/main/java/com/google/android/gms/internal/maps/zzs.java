package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzs extends zza implements zzq {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final String getName() throws RemoteException {
        Parcel zza = zza(1, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final String getShortName() throws RemoteException {
        Parcel zza = zza(2, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final void activate() throws RemoteException {
        zzb(3, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final boolean zzb(zzq zzq) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzq);
        Parcel zza2 = zza(4, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final int zzj() throws RemoteException {
        Parcel zza = zza(5, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
