package com.ss.android.lark.dynamicconfig.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class DynamicHostProxyStub extends Binder implements IInterface, DynamicHostProxy {
    public final DynamicHostProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy
    public String getDocMainDomain() {
        return this.base.getDocMainDomain();
    }

    @Override // com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy
    public String getMainDomain() {
        return this.base.getMainDomain();
    }

    public DynamicHostProxyStub(Context context) {
        this.base = new DynamicHostProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy");
    }

    public static DynamicHostProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof DynamicHostProxyProxy)) {
            return new DynamicHostProxyProxy(context, iBinder);
        }
        return (DynamicHostProxyProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy");
            String mainDomain = getMainDomain();
            parcel2.writeNoException();
            parcel2.writeString(mainDomain);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy");
            String docMainDomain = getDocMainDomain();
            parcel2.writeNoException();
            parcel2.writeString(docMainDomain);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy");
            return true;
        }
    }
}
