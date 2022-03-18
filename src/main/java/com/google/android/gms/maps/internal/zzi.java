package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

public abstract class zzi extends zzb implements zzh {
    public zzi() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zzh = zzh(zzu.zzg(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C21936a.m79264a(parcel2, zzh);
        } else if (i != 2) {
            return false;
        } else {
            IObjectWrapper zzi = zzi(zzu.zzg(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C21936a.m79264a(parcel2, zzi);
        }
        return true;
    }
}
