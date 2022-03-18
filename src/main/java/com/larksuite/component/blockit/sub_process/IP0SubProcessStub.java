package com.larksuite.component.blockit.sub_process;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IP0SubProcessStub extends Binder implements IInterface, IP0SubProcess {
    public final P0SubProcessImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.larksuite.component.blockit.sub_process.IP0SubProcess
    public void triggerRefresh(String str) {
        this.base.triggerRefresh(str);
    }

    public IP0SubProcessStub(Context context) {
        this.base = new P0SubProcessImpl(context);
        attachInterface(this, "com.larksuite.component.blockit.sub_process.IP0SubProcess");
    }

    public static IP0SubProcessProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.larksuite.component.blockit.sub_process.IP0SubProcess");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IP0SubProcessProxy)) {
            return new IP0SubProcessProxy(context, iBinder);
        }
        return (IP0SubProcessProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.larksuite.component.blockit.sub_process.IP0SubProcess");
            triggerRefresh(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.larksuite.component.blockit.sub_process.IP0SubProcess");
            return true;
        }
    }
}
