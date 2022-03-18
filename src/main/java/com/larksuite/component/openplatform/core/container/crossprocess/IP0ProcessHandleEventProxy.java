package com.larksuite.component.openplatform.core.container.crossprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;

public final class IP0ProcessHandleEventProxy implements IInterface, IP0ProcessHandleEvent {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IP0ProcessHandleEventProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent
    public void callP0Process(CrossProcessCallEntity crossProcessCallEntity, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent");
            if (crossProcessCallEntity != null) {
                obtain.writeInt(1);
                crossProcessCallEntity.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IP0ProcessHandleEventProxy", "call method callP0Process throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
