package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.CameraPosition;

public abstract class zzm extends zzb implements zzl {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onCameraChange((CameraPosition) C21936a.m79263a(parcel, CameraPosition.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
