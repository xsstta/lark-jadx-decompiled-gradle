package com.google.android.play.core.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.j */
public class BinderC22641j extends Binder implements IInterface {
    protected BinderC22641j(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo78896a(int i, Parcel parcel) throws RemoteException {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo78896a(i, parcel);
    }
}
