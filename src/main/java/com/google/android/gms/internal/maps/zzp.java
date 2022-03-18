package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class zzp extends zza implements zzn {
    zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int getActiveLevelIndex() throws RemoteException {
        Parcel zza = zza(1, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int getDefaultLevelIndex() throws RemoteException {
        Parcel zza = zza(2, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final List<IBinder> getLevels() throws RemoteException {
        Parcel zza = zza(3, zza());
        ArrayList<IBinder> createBinderArrayList = zza.createBinderArrayList();
        zza.recycle();
        return createBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean isUnderground() throws RemoteException {
        Parcel zza = zza(4, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzb(zzn zzn) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzn);
        Parcel zza2 = zza(5, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzj() throws RemoteException {
        Parcel zza = zza(6, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
