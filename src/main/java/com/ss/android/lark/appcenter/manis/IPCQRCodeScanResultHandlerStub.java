package com.ss.android.lark.appcenter.manis;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;

public final class IPCQRCodeScanResultHandlerStub extends Binder implements IInterface, AppCenterProxy.AbstractC29095b {
    public final AppCenterProxy.AbstractC29095b base;

    public IBinder asBinder() {
        return this;
    }

    public IPCQRCodeScanResultHandlerStub(AppCenterProxy.AbstractC29095b bVar) {
        this.base = bVar;
        attachInterface(this, "com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCQRCodeScanResultHandler");
    }

    public static IPCQRCodeScanResultHandlerProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCQRCodeScanResultHandler");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IPCQRCodeScanResultHandlerProxy)) {
            return new IPCQRCodeScanResultHandlerProxy(iBinder);
        }
        return (IPCQRCodeScanResultHandlerProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29095b
    public boolean handleResult(String str, int i) {
        return this.base.handleResult(str, i);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCQRCodeScanResultHandler");
            boolean handleResult = handleResult(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(handleResult ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCQRCodeScanResultHandler");
            return true;
        }
    }
}
