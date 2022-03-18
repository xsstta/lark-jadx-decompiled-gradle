package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.C21902a;
import com.google.android.gms.internal.base.zaa;

public final class zam extends zaa implements zal {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // com.google.android.gms.common.internal.service.zal
    public final void zaa(zaj zaj) throws RemoteException {
        Parcel zaa = zaa();
        C21902a.m79212a(zaa, zaj);
        zac(1, zaa);
    }
}
