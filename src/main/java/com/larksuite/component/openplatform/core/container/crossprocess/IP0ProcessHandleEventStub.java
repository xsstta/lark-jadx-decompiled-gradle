package com.larksuite.component.openplatform.core.container.crossprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.openplatform.core.container.crossprocess.impl.P0ProcessHandleEventImpl;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;

public final class IP0ProcessHandleEventStub extends Binder implements IInterface, IP0ProcessHandleEvent {
    public final P0ProcessHandleEventImpl base;

    public IBinder asBinder() {
        return this;
    }

    public IP0ProcessHandleEventStub(Context context) {
        this.base = new P0ProcessHandleEventImpl(context);
        attachInterface(this, "com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent");
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent
    public void callP0Process(CrossProcessCallEntity crossProcessCallEntity, int i) {
        this.base.callP0Process(crossProcessCallEntity, i);
    }

    public static IP0ProcessHandleEventProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IP0ProcessHandleEventProxy)) {
            return new IP0ProcessHandleEventProxy(context, iBinder);
        }
        return (IP0ProcessHandleEventProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        CrossProcessCallEntity crossProcessCallEntity;
        if (i == 1) {
            parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent");
            if (parcel.readInt() != 0) {
                crossProcessCallEntity = CrossProcessCallEntity.CREATOR.createFromParcel(parcel);
            } else {
                crossProcessCallEntity = null;
            }
            callP0Process(crossProcessCallEntity, parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent");
            return true;
        }
    }
}
