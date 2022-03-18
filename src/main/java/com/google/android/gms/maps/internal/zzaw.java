package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;

public abstract class zzaw extends zzb implements zzav {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean onMyLocationButtonClick = onMyLocationButtonClick();
        parcel2.writeNoException();
        C21936a.m79266a(parcel2, onMyLocationButtonClick);
        return true;
    }
}
