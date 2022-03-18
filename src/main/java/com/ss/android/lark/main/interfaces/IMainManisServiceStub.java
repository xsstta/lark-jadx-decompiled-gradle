package com.ss.android.lark.main.interfaces;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.main.manis.MainManisServiceImpl;

public final class IMainManisServiceStub extends Binder implements IInterface, IMainManisService {
    public final MainManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.main.interfaces.IMainManisService
    public void openLostPage(String str) {
        this.base.openLostPage(str);
    }

    public IMainManisServiceStub(Context context) {
        this.base = new MainManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.main.interfaces.IMainManisService");
    }

    public static IMainManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.main.interfaces.IMainManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMainManisServiceProxy)) {
            return new IMainManisServiceProxy(context, iBinder);
        }
        return (IMainManisServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.main.interfaces.IMainManisService");
            openLostPage(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.main.interfaces.IMainManisService");
            return true;
        }
    }
}
