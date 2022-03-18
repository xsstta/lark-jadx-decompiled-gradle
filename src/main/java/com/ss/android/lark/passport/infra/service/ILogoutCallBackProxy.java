package com.ss.android.lark.passport.infra.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote;

public final class ILogoutCallBackProxy implements IInterface, ILogoutUserServiceRemote.ILogoutCallBack {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public ILogoutCallBackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack
    public void onResult(boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
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
