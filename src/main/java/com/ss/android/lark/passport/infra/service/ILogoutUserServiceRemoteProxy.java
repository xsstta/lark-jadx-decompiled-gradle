package com.ss.android.lark.passport.infra.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote;

public final class ILogoutUserServiceRemoteProxy implements IInterface, ILogoutUserServiceRemote {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote
    public void logout(ILogoutUserServiceRemote.ILogoutCallBack aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote");
            if (aVar != null) {
                obtain.writeStrongBinder(new ILogoutCallBackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ILogoutUserServiceRemoteProxy", "call method logout throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public ILogoutUserServiceRemoteProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
