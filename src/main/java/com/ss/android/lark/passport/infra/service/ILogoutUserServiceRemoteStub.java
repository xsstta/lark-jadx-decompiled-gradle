package com.ss.android.lark.passport.infra.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote;
import com.ss.lark.android.passport.biz.service.impl.LogoutUserServiceRemote;

public final class ILogoutUserServiceRemoteStub extends Binder implements IInterface, ILogoutUserServiceRemote {
    public final LogoutUserServiceRemote base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote
    public void logout(ILogoutUserServiceRemote.ILogoutCallBack aVar) {
        this.base.logout(aVar);
    }

    public ILogoutUserServiceRemoteStub(Context context) {
        this.base = new LogoutUserServiceRemote(context);
        attachInterface(this, "com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote");
    }

    public static ILogoutUserServiceRemoteProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ILogoutUserServiceRemoteProxy)) {
            return new ILogoutUserServiceRemoteProxy(context, iBinder);
        }
        return (ILogoutUserServiceRemoteProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote");
            logout(ILogoutCallBackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote");
            return true;
        }
    }
}
