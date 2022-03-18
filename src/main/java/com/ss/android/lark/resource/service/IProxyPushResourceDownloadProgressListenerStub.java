package com.ss.android.lark.resource.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IProxyPushResourceDownloadProgressListenerStub extends Binder implements IInterface, AbstractC53139a {
    public final AbstractC53139a base;

    public IBinder asBinder() {
        return this;
    }

    public IProxyPushResourceDownloadProgressListenerStub(AbstractC53139a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.resource.service.IProxyPushResourceDownloadProgressListener");
    }

    public static IProxyPushResourceDownloadProgressListenerProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.resource.service.IProxyPushResourceDownloadProgressListener");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IProxyPushResourceDownloadProgressListenerProxy)) {
            return new IProxyPushResourceDownloadProgressListenerProxy(iBinder);
        }
        return (IProxyPushResourceDownloadProgressListenerProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29579a
    public void onPushDownloadProgress(String str, int i, long j, long j2) {
        this.base.onPushDownloadProgress(str, i, j, j2);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.resource.service.IProxyPushResourceDownloadProgressListener");
            onPushDownloadProgress(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.resource.service.IProxyPushResourceDownloadProgressListener");
            return true;
        }
    }
}
