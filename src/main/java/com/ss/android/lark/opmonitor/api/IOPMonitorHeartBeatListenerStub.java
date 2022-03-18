package com.ss.android.lark.opmonitor.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IOPMonitorHeartBeatListenerStub extends Binder implements IInterface, AbstractC48904a {
    public final AbstractC48904a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.opmonitor.api.AbstractC48904a
    public int getCurrentHeartBeatStatus(String str) {
        return this.base.getCurrentHeartBeatStatus(str);
    }

    public IOPMonitorHeartBeatListenerStub(AbstractC48904a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListener");
    }

    public static IOPMonitorHeartBeatListenerProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListener");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IOPMonitorHeartBeatListenerProxy)) {
            return new IOPMonitorHeartBeatListenerProxy(iBinder);
        }
        return (IOPMonitorHeartBeatListenerProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListener");
            int currentHeartBeatStatus = getCurrentHeartBeatStatus(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(currentHeartBeatStatus);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListener");
            return true;
        }
    }
}
