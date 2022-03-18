package com.ss.android.lark.appcenter.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;
import com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem;
import java.util.List;

public final class AppCenterProxyStub extends Binder implements IInterface, AppCenterProxy {
    public final AppCenterProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public List<AppCenterMenuIPCItem> getAppCenterMenuItems(String str) {
        return this.base.getAppCenterMenuItems(str);
    }

    public AppCenterProxyStub(Context context) {
        this.base = new AppCenterProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.appcenter.manis.AppCenterProxy");
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void doCheckFace(String str, AppCenterProxy.AbstractC29094a aVar) {
        this.base.doCheckFace(str, aVar);
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void getEnterBotMenuItem(String str, AppCenterProxy.AbstractC29096c cVar) {
        this.base.getEnterBotMenuItem(str, cVar);
    }

    public static AppCenterProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof AppCenterProxyProxy)) {
            return new AppCenterProxyProxy(context, iBinder);
        }
        return (AppCenterProxyProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void openScanQRCodeActivity(IntArray intArray, boolean z, AppCenterProxy.AbstractC29095b bVar) {
        this.base.openScanQRCodeActivity(intArray, z, bVar);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IntArray intArray;
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            List<AppCenterMenuIPCItem> appCenterMenuItems = getAppCenterMenuItems(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeList(appCenterMenuItems);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            getEnterBotMenuItem(parcel.readString(), MenuCallBackIPCStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            doCheckFace(parcel.readString(), IPCDataCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            if (parcel.readInt() != 0) {
                intArray = IntArray.CREATOR.createFromParcel(parcel);
            } else {
                intArray = null;
            }
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            openScanQRCodeActivity(intArray, z, IPCQRCodeScanResultHandlerStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            return true;
        }
    }
}
