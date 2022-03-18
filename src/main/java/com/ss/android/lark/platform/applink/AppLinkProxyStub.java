package com.ss.android.lark.platform.applink;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.applink.AppLink;

public final class AppLinkProxyStub extends Binder implements IInterface, AppLinkProxy {
    public final AppLinkProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    public AppLinkProxyStub(Context context) {
        this.base = new AppLinkProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.platform.applink.AppLinkProxy");
    }

    @Override // com.ss.android.lark.platform.applink.AppLinkProxy
    public void handle(String str, AppLink appLink) {
        this.base.handle(str, appLink);
    }

    public static AppLinkProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.platform.applink.AppLinkProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof AppLinkProxyProxy)) {
            return new AppLinkProxyProxy(context, iBinder);
        }
        return (AppLinkProxyProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        AppLink appLink;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.platform.applink.AppLinkProxy");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                appLink = AppLink.CREATOR.createFromParcel(parcel);
            } else {
                appLink = null;
            }
            handle(readString, appLink);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.platform.applink.AppLinkProxy");
            return true;
        }
    }
}
