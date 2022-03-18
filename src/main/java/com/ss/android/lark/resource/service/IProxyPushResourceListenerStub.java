package com.ss.android.lark.resource.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IProxyPushResourceListenerStub extends Binder implements IInterface, AbstractC53140b {
    public final AbstractC53140b base;

    public IBinder asBinder() {
        return this;
    }

    public IProxyPushResourceListenerStub(AbstractC53140b bVar) {
        this.base = bVar;
        attachInterface(this, "com.ss.android.lark.resource.service.IProxyPushResourceListener");
    }

    public static IProxyPushResourceListenerProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.resource.service.IProxyPushResourceListener");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IProxyPushResourceListenerProxy)) {
            return new IProxyPushResourceListenerProxy(iBinder);
        }
        return (IProxyPushResourceListenerProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29580b
    public void onPushDownloadStatus(String str, boolean z) {
        this.base.onPushDownloadStatus(str, z);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.resource.service.IProxyPushResourceListener");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            onPushDownloadStatus(readString, z);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.resource.service.IProxyPushResourceListener");
            return true;
        }
    }
}
