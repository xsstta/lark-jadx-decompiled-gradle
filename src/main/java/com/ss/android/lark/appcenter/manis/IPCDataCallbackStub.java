package com.ss.android.lark.appcenter.manis;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;

public final class IPCDataCallbackStub extends Binder implements IInterface, AppCenterProxy.AbstractC29094a {
    public final AppCenterProxy.AbstractC29094a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29094a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        this.base.onError(errorResultWrapper);
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29094a
    public void onSuccess(String str) {
        this.base.onSuccess(str);
    }

    public IPCDataCallbackStub(AppCenterProxy.AbstractC29094a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback");
    }

    public static IPCDataCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IPCDataCallbackProxy)) {
            return new IPCDataCallbackProxy(iBinder);
        }
        return (IPCDataCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ErrorResultWrapper errorResultWrapper;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback");
            onSuccess(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback");
            if (parcel.readInt() != 0) {
                errorResultWrapper = ErrorResultWrapper.CREATOR.createFromParcel(parcel);
            } else {
                errorResultWrapper = null;
            }
            onError(errorResultWrapper);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback");
            return true;
        }
    }
}
