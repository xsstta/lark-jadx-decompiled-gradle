package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.C21902a;
import com.google.android.gms.internal.base.zaa;

public final class zag extends zaa implements zaf {
    zag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.signin.internal.zaf
    public final void zam(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zab(7, zaa);
    }

    @Override // com.google.android.gms.signin.internal.zaf
    public final void zaa(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel zaa = zaa();
        C21902a.m79212a(zaa, iAccountAccessor);
        zaa.writeInt(i);
        C21902a.m79214a(zaa, z);
        zab(9, zaa);
    }

    @Override // com.google.android.gms.signin.internal.zaf
    public final void zaa(zah zah, zad zad) throws RemoteException {
        Parcel zaa = zaa();
        C21902a.m79213a(zaa, zah);
        C21902a.m79212a(zaa, zad);
        zab(12, zaa);
    }
}
