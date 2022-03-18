package com.ss.android.lark.passport.infra.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote;

public final class ILogoutCallBackStub extends Binder implements IInterface, ILogoutUserServiceRemote.ILogoutCallBack {
    public final ILogoutUserServiceRemote.ILogoutCallBack base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack
    public void onResult(boolean z) {
        this.base.onResult(z);
    }

    public ILogoutCallBackStub(ILogoutUserServiceRemote.ILogoutCallBack aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack");
    }

    public static ILogoutCallBackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ILogoutCallBackProxy)) {
            return new ILogoutCallBackProxy(iBinder);
        }
        return (ILogoutCallBackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack");
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            onResult(z);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack");
            return true;
        }
    }
}
