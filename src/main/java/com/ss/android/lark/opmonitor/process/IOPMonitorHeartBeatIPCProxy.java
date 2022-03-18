package com.ss.android.lark.opmonitor.process;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48904a;
import com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListenerStub;
import com.ss.android.lark.opmonitor.model.OPMonitorHeartBeatMonitorData;

public final class IOPMonitorHeartBeatIPCProxy implements IInterface, IOPMonitorHeartBeatIPC {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void endHeartBeat(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IOPMonitorHeartBeatIPCProxy", "call method endHeartBeat throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void setLarkStatus(boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IOPMonitorHeartBeatIPCProxy", "call method setLarkStatus throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IOPMonitorHeartBeatIPCProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void registerHeartBeat(OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData, AbstractC48904a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC");
            if (oPMonitorHeartBeatMonitorData != null) {
                obtain.writeInt(1);
                oPMonitorHeartBeatMonitorData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new IOPMonitorHeartBeatListenerStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IOPMonitorHeartBeatIPCProxy", "call method registerHeartBeat throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
