package com.ss.android.lark.magic.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IMagicProxyStub extends Binder implements IInterface, IMagicProxy {
    public final IMagicProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.magic.manis.IMagicProxy
    public void showMagic(String str) {
        this.base.showMagic(str);
    }

    public IMagicProxyStub(Context context) {
        this.base = new IMagicProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.magic.manis.IMagicProxy");
    }

    public static IMagicProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.magic.manis.IMagicProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMagicProxyProxy)) {
            return new IMagicProxyProxy(context, iBinder);
        }
        return (IMagicProxyProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.magic.manis.IMagicProxy
    public void transferLifecycleToMain(String str, String str2, long j, long j2) {
        this.base.transferLifecycleToMain(str, str2, j, j2);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.magic.manis.IMagicProxy");
            showMagic(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.magic.manis.IMagicProxy");
            transferLifecycleToMain(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.magic.manis.IMagicProxy");
            return true;
        }
    }
}
