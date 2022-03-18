package com.ss.android.lark.opmonitor.process;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.opmonitor.api.AbstractC48904a;
import com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListenerStub;
import com.ss.android.lark.opmonitor.model.OPMonitorHeartBeatMonitorData;

public final class IOPMonitorHeartBeatIPCStub extends Binder implements IInterface, IOPMonitorHeartBeatIPC {
    public final OPMonitorHeartBeatIPC base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void endHeartBeat(String str) {
        this.base.endHeartBeat(str);
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void setLarkStatus(boolean z) {
        this.base.setLarkStatus(z);
    }

    public IOPMonitorHeartBeatIPCStub(Context context) {
        this.base = new OPMonitorHeartBeatIPC(context);
        attachInterface(this, "com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void registerHeartBeat(OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData, AbstractC48904a aVar) {
        this.base.registerHeartBeat(oPMonitorHeartBeatMonitorData, aVar);
    }

    public static IOPMonitorHeartBeatIPCProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IOPMonitorHeartBeatIPCProxy)) {
            return new IOPMonitorHeartBeatIPCProxy(context, iBinder);
        }
        return (IOPMonitorHeartBeatIPCProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData;
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
            if (parcel.readInt() != 0) {
                oPMonitorHeartBeatMonitorData = OPMonitorHeartBeatMonitorData.CREATOR.createFromParcel(parcel);
            } else {
                oPMonitorHeartBeatMonitorData = null;
            }
            registerHeartBeat(oPMonitorHeartBeatMonitorData, IOPMonitorHeartBeatListenerStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
            endHeartBeat(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            setLarkStatus(z);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
            return true;
        }
    }
}
