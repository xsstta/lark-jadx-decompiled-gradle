package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;

public abstract class zzbt extends zzb implements zzbs {
    public zzbt() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onSnapshotReady((Bitmap) C21936a.m79263a(parcel, Bitmap.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
