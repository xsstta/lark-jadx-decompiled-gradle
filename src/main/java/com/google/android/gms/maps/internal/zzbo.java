package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public abstract class zzbo extends zzb implements zzbn {
    public zzbo() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onStreetViewPanoramaLongClick((StreetViewPanoramaOrientation) C21936a.m79263a(parcel, StreetViewPanoramaOrientation.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
