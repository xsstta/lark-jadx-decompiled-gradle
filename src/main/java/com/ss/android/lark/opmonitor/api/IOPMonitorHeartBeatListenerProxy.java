package com.ss.android.lark.opmonitor.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IOPMonitorHeartBeatListenerProxy implements IInterface, AbstractC48904a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListener";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IOPMonitorHeartBeatListenerProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.opmonitor.api.AbstractC48904a
    public int getCurrentHeartBeatStatus(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.opmonitor.api.IOPMonitorHeartBeatListener");
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }
}
