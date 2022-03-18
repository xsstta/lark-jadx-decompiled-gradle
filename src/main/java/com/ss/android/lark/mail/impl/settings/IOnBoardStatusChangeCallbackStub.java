package com.ss.android.lark.mail.impl.settings;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IOnBoardStatusChangeCallbackStub extends Binder implements IInterface, AbstractC43395b {
    public final AbstractC43395b base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.settings.AbstractC43395b
    public void onChanged(Integer num) {
        this.base.onChanged(num);
    }

    public IOnBoardStatusChangeCallbackStub(AbstractC43395b bVar) {
        this.base = bVar;
        attachInterface(this, "com.ss.android.lark.mail.impl.settings.IOnBoardStatusChangeCallback");
    }

    public static IOnBoardStatusChangeCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.settings.IOnBoardStatusChangeCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnBoardStatusChangeCallbackProxy)) {
            return new IOnBoardStatusChangeCallbackProxy(iBinder);
        }
        return (IOnBoardStatusChangeCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.settings.IOnBoardStatusChangeCallback");
            onChanged(Integer.valueOf(parcel.readInt()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.settings.IOnBoardStatusChangeCallback");
            return true;
        }
    }
}
