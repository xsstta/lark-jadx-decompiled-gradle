package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.LatLng;

public abstract class zzao extends zzb implements zzan {
    public zzao() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onMapLongClick((LatLng) C21936a.m79263a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
