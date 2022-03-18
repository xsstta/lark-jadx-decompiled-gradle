package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.PointOfInterest;

public abstract class zzbc extends zzb implements zzbb {
    public zzbc() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((PointOfInterest) C21936a.m79263a(parcel, PointOfInterest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
