package com.ss.android.lark.dynamicconfig.interfaces;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.dynamicconfig.service.impl.DynamicManisServiceImpl;

public final class IDynamicManisServiceStub extends Binder implements IInterface, IDynamicManisService {
    public final DynamicManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService
    public String getDynamicDomain(int i) {
        return this.base.getDynamicDomain(i);
    }

    public IDynamicManisServiceStub(Context context) {
        this.base = new DynamicManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService");
    }

    public static IDynamicManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicManisServiceProxy)) {
            return new IDynamicManisServiceProxy(context, iBinder);
        }
        return (IDynamicManisServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService");
            String dynamicDomain = getDynamicDomain(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(dynamicDomain);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService");
            return true;
        }
    }
}
