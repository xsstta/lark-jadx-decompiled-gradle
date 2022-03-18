package com.ss.android.lark.integrator.littleapp.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class GadgetProxyStub extends Binder implements IInterface, GadgetProxy {
    public final GadgetProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    public GadgetProxyStub(Context context) {
        this.base = new GadgetProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.integrator.littleapp.manis.GadgetProxy");
    }

    public static GadgetProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.integrator.littleapp.manis.GadgetProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof GadgetProxyProxy)) {
            return new GadgetProxyProxy(context, iBinder);
        }
        return (GadgetProxyProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.integrator.littleapp.manis.GadgetProxy
    public void monitorEvent(String str, String str2, String str3, String str4) {
        this.base.monitorEvent(str, str2, str3, str4);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.integrator.littleapp.manis.GadgetProxy");
            monitorEvent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.integrator.littleapp.manis.GadgetProxy");
            return true;
        }
    }
}
