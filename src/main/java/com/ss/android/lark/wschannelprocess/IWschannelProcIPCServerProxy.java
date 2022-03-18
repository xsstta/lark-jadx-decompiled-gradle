package com.ss.android.lark.wschannelprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IWschannelProcIPCServerProxy implements IInterface, IWschannelProcIPCServer {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer
    public void dealMainProcDozeStateChange(boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IWschannelProcIPCServerProxy", "call method dealMainProcDozeStateChange throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IWschannelProcIPCServerProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
