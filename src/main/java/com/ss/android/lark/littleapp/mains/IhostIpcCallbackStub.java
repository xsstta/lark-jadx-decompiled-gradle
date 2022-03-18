package com.ss.android.lark.littleapp.mains;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

public final class IhostIpcCallbackStub extends Binder implements IInterface, LittleAppProxy.AbstractC41394a {
    public final LittleAppProxy.AbstractC41394a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy.AbstractC41394a
    public void onIpcCallback(CrossProcessDataEntity crossProcessDataEntity) {
        this.base.onIpcCallback(crossProcessDataEntity);
    }

    public IhostIpcCallbackStub(LittleAppProxy.AbstractC41394a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.littleapp.mains.LittleAppProxy.IhostIpcCallback");
    }

    public static IhostIpcCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy.IhostIpcCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IhostIpcCallbackProxy)) {
            return new IhostIpcCallbackProxy(iBinder);
        }
        return (IhostIpcCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        CrossProcessDataEntity crossProcessDataEntity;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy.IhostIpcCallback");
            if (parcel.readInt() != 0) {
                crossProcessDataEntity = CrossProcessDataEntity.CREATOR.createFromParcel(parcel);
            } else {
                crossProcessDataEntity = null;
            }
            onIpcCallback(crossProcessDataEntity);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.littleapp.mains.LittleAppProxy.IhostIpcCallback");
            return true;
        }
    }
}
