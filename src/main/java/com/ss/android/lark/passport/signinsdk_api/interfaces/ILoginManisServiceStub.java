package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService;
import com.ss.lark.android.passport.biz.compat.login.serviceimpl.LoginManisServiceImpl;

public final class ILoginManisServiceStub extends Binder implements IInterface, ILoginManisService {
    public final LoginManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    public ILoginManisServiceStub(Context context) {
        this.base = new LoginManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService
    public void switchLoginTenantUser(String str, ILoginManisService.AbstractC49387a aVar) {
        this.base.switchLoginTenantUser(str, aVar);
    }

    public static ILoginManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ILoginManisServiceProxy)) {
            return new ILoginManisServiceProxy(context, iBinder);
        }
        return (ILoginManisServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService");
            switchLoginTenantUser(parcel.readString(), ISwitchUserCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService");
            return true;
        }
    }
}
