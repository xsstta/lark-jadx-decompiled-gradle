package com.ss.lark.android.passport.biz.link_handler;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService;

public final class ISwitchUserCallbackStub extends Binder implements IInterface, ISwitchUserManisService.AbstractC65155a {
    public final ISwitchUserManisService.AbstractC65155a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.AbstractC65155a
    public void onSuccess(SessionResult sessionResult) {
        this.base.onSuccess(sessionResult);
    }

    public ISwitchUserCallbackStub(ISwitchUserManisService.AbstractC65155a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback");
    }

    public static ISwitchUserCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISwitchUserCallbackProxy)) {
            return new ISwitchUserCallbackProxy(iBinder);
        }
        return (ISwitchUserCallbackProxy) queryLocalInterface;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.AbstractC65155a
    public void onError(int i, String str) {
        this.base.onError(i, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        SessionResult sessionResult;
        if (i == 1) {
            parcel.enforceInterface("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback");
            if (parcel.readInt() != 0) {
                sessionResult = SessionResult.CREATOR.createFromParcel(parcel);
            } else {
                sessionResult = null;
            }
            onSuccess(sessionResult);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback");
            onError(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback");
            return true;
        }
    }
}
