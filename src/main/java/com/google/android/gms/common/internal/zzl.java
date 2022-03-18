package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C21910a;
import com.google.android.gms.internal.common.zza;

public final class zzl extends zza implements IGmsCallbacks {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        C21910a.m79220a(zza, bundle);
        zzb(1, zza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zza(int i, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        C21910a.m79220a(zza, bundle);
        zzb(2, zza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zza(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        C21910a.m79220a(zza, zzb);
        zzb(3, zza);
    }
}
