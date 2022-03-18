package com.ss.android.lark.appcenter.manis;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;

public final class IPCDataCallbackProxy implements IInterface, AppCenterProxy.AbstractC29094a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IPCDataCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29094a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback");
            if (errorResultWrapper != null) {
                obtain.writeInt(1);
                errorResultWrapper.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(2, obtain, obtain2, 0);
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

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29094a
    public void onSuccess(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCDataCallback");
            obtain.writeString(str);
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
