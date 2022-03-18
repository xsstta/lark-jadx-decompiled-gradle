package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

public abstract class zzas extends zzb implements zzar {
    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zza = zza(zzu.zzg(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C21936a.m79266a(parcel2, zza);
        return true;
    }
}
