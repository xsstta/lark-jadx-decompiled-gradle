package com.ss.android.lark.appcenter.manis;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;
import com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem;

public final class MenuCallBackIPCProxy implements IInterface, AppCenterProxy.AbstractC29096c {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.appcenter.manis.AppCenterProxy.MenuCallBackIPC";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public MenuCallBackIPCProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29096c
    public void onSuccess(AppCenterMenuIPCItem appCenterMenuIPCItem) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy.MenuCallBackIPC");
            if (appCenterMenuIPCItem != null) {
                obtain.writeInt(1);
                appCenterMenuIPCItem.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
