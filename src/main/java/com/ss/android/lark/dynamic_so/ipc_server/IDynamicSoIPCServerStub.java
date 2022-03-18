package com.ss.android.lark.dynamic_so.ipc_server;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IDynamicSoIPCServerStub extends Binder implements IInterface, AbstractC36881b {
    public final C36880a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.dynamic_so.ipc_server.AbstractC36881b
    public boolean checkSoNeedUpdate(String str) {
        return this.base.checkSoNeedUpdate(str);
    }

    public IDynamicSoIPCServerStub(Context context) {
        this.base = new C36880a(context);
        attachInterface(this, "com.ss.android.lark.dynamic_so.ipc_server.IDynamicSoIPCServer");
    }

    public static IDynamicSoIPCServerProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.dynamic_so.ipc_server.IDynamicSoIPCServer");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicSoIPCServerProxy)) {
            return new IDynamicSoIPCServerProxy(context, iBinder);
        }
        return (IDynamicSoIPCServerProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.dynamic_so.ipc_server.IDynamicSoIPCServer");
            boolean checkSoNeedUpdate = checkSoNeedUpdate(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(checkSoNeedUpdate ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.dynamic_so.ipc_server.IDynamicSoIPCServer");
            return true;
        }
    }
}
