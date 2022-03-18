package com.ss.android.lark.littleapp.mains;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

public final class IhostIpcCallbackProxy implements IInterface, LittleAppProxy.AbstractC41394a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.littleapp.mains.LittleAppProxy.IhostIpcCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IhostIpcCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy.AbstractC41394a
    public void onIpcCallback(CrossProcessDataEntity crossProcessDataEntity) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy.IhostIpcCallback");
            if (crossProcessDataEntity != null) {
                obtain.writeInt(1);
                crossProcessDataEntity.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
