package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.C21902a;
import com.google.android.gms.internal.base.zaa;

public final class zah extends zaa implements ISignInButtonCreator {
    zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    @Override // com.google.android.gms.common.internal.ISignInButtonCreator
    public final IObjectWrapper newSignInButton(IObjectWrapper iObjectWrapper, int i, int i2) throws RemoteException {
        Parcel zaa = zaa();
        C21902a.m79212a(zaa, iObjectWrapper);
        zaa.writeInt(i);
        zaa.writeInt(i2);
        Parcel zaa2 = zaa(1, zaa);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zaa2.readStrongBinder());
        zaa2.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.common.internal.ISignInButtonCreator
    public final IObjectWrapper newSignInButtonFromConfig(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel zaa = zaa();
        C21902a.m79212a(zaa, iObjectWrapper);
        C21902a.m79213a(zaa, signInButtonConfig);
        Parcel zaa2 = zaa(2, zaa);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zaa2.readStrongBinder());
        zaa2.recycle();
        return asInterface;
    }
}
