package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService;

public final class ISwitchUserManisServiceStub extends Binder implements IInterface, ISwitchUserManisService {
    public final SwitchUserManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    public ISwitchUserManisServiceStub(Context context) {
        this.base = new SwitchUserManisServiceImpl(context);
        attachInterface(this, "com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService");
    }

    public static ISwitchUserManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISwitchUserManisServiceProxy)) {
            return new ISwitchUserManisServiceProxy(context, iBinder);
        }
        return (ISwitchUserManisServiceProxy) queryLocalInterface;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService
    public void switchUser(String str, String str2, String str3, ISwitchUserManisService.AbstractC65155a aVar) {
        this.base.switchUser(str, str2, str3, aVar);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService");
            switchUser(parcel.readString(), parcel.readString(), parcel.readString(), ISwitchUserCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService");
            return true;
        }
    }
}
