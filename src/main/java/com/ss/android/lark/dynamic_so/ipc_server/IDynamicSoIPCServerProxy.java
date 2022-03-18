package com.ss.android.lark.dynamic_so.ipc_server;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IDynamicSoIPCServerProxy implements IInterface, AbstractC36881b {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.dynamic_so.ipc_server.IDynamicSoIPCServer";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.dynamic_so.ipc_server.AbstractC36881b
    public boolean checkSoNeedUpdate(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.dynamic_so.ipc_server.IDynamicSoIPCServer");
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDynamicSoIPCServerProxy", "call method checkSoNeedUpdate throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IDynamicSoIPCServerProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
