package com.ss.android.lark.appcenter.manis;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;
import com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem;

public final class MenuCallBackIPCStub extends Binder implements IInterface, AppCenterProxy.AbstractC29096c {
    public final AppCenterProxy.AbstractC29096c base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29096c
    public void onSuccess(AppCenterMenuIPCItem appCenterMenuIPCItem) {
        this.base.onSuccess(appCenterMenuIPCItem);
    }

    public MenuCallBackIPCStub(AppCenterProxy.AbstractC29096c cVar) {
        this.base = cVar;
        attachInterface(this, "com.ss.android.lark.appcenter.manis.AppCenterProxy.MenuCallBackIPC");
    }

    public static MenuCallBackIPCProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy.MenuCallBackIPC");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof MenuCallBackIPCProxy)) {
            return new MenuCallBackIPCProxy(iBinder);
        }
        return (MenuCallBackIPCProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        AppCenterMenuIPCItem appCenterMenuIPCItem;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy.MenuCallBackIPC");
            if (parcel.readInt() != 0) {
                appCenterMenuIPCItem = AppCenterMenuIPCItem.CREATOR.createFromParcel(parcel);
            } else {
                appCenterMenuIPCItem = null;
            }
            onSuccess(appCenterMenuIPCItem);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.appcenter.manis.AppCenterProxy.MenuCallBackIPC");
            return true;
        }
    }
}
