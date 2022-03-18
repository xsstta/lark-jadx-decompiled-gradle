package com.ss.android.lark.appcenter.wrapper.dto;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class ManisOnClickListenerStub extends Binder implements IInterface, AbstractC29143b {
    public final AbstractC29143b base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.appcenter.wrapper.dto.AbstractC29143b
    public void onClick(Bundle bundle) {
        this.base.onClick(bundle);
    }

    public ManisOnClickListenerStub(AbstractC29143b bVar) {
        this.base = bVar;
        attachInterface(this, "com.ss.android.lark.appcenter.wrapper.dto.ManisOnClickListener");
    }

    public static ManisOnClickListenerProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.appcenter.wrapper.dto.ManisOnClickListener");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ManisOnClickListenerProxy)) {
            return new ManisOnClickListenerProxy(iBinder);
        }
        return (ManisOnClickListenerProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Bundle bundle;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.wrapper.dto.ManisOnClickListener");
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            } else {
                bundle = null;
            }
            onClick(bundle);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.appcenter.wrapper.dto.ManisOnClickListener");
            return true;
        }
    }
}
