package com.ss.android.lark.openplatform.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class OpenPlatformIpcStub extends Binder implements IInterface, OpenPlatformIpc {
    public final OpenPlatformIpcImpl base;

    public IBinder asBinder() {
        return this;
    }

    public OpenPlatformIpcStub(Context context) {
        this.base = new OpenPlatformIpcImpl(context);
        attachInterface(this, "com.ss.android.lark.openplatform.manis.OpenPlatformIpc");
    }

    @Override // com.ss.android.lark.openplatform.manis.OpenPlatformIpc
    public void startChatWindowActivityByChatIdAndPos(String str, int i) {
        this.base.startChatWindowActivityByChatIdAndPos(str, i);
    }

    public static OpenPlatformIpcProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.openplatform.manis.OpenPlatformIpc");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof OpenPlatformIpcProxy)) {
            return new OpenPlatformIpcProxy(context, iBinder);
        }
        return (OpenPlatformIpcProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.openplatform.manis.OpenPlatformIpc");
            startChatWindowActivityByChatIdAndPos(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.openplatform.manis.OpenPlatformIpc");
            return true;
        }
    }
}
