package com.ss.android.lark.wschannelprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.wschannelprocess.wschannelipc.WschannelProcIPCServer;

public final class IWschannelProcIPCServerStub extends Binder implements IInterface, IWschannelProcIPCServer {
    public final WschannelProcIPCServer base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer
    public void dealMainProcDozeStateChange(boolean z) {
        this.base.dealMainProcDozeStateChange(z);
    }

    public IWschannelProcIPCServerStub(Context context) {
        this.base = new WschannelProcIPCServer(context);
        attachInterface(this, "com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer");
    }

    public static IWschannelProcIPCServerProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IWschannelProcIPCServerProxy)) {
            return new IWschannelProcIPCServerProxy(context, iBinder);
        }
        return (IWschannelProcIPCServerProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer");
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            dealMainProcDozeStateChange(z);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer");
            return true;
        }
    }
}
