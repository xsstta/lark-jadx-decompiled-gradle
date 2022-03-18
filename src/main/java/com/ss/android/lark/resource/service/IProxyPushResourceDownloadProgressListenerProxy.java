package com.ss.android.lark.resource.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IProxyPushResourceDownloadProgressListenerProxy implements IInterface, AbstractC53139a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.resource.service.IProxyPushResourceDownloadProgressListener";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IProxyPushResourceDownloadProgressListenerProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29579a
    public void onPushDownloadProgress(String str, int i, long j, long j2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IProxyPushResourceDownloadProgressListener");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeLong(j);
            obtain.writeLong(j2);
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
