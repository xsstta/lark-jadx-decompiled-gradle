package com.ss.android.lark.littleapp.mains;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;

public final class PaymentCallbackStub extends Binder implements IInterface, LittleAppProxy.AbstractC41395b {
    public final LittleAppProxy.AbstractC41395b base;

    public IBinder asBinder() {
        return this;
    }

    public PaymentCallbackStub(LittleAppProxy.AbstractC41395b bVar) {
        this.base = bVar;
        attachInterface(this, "com.ss.android.lark.littleapp.mains.LittleAppProxy.PaymentCallback");
    }

    public static PaymentCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy.PaymentCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof PaymentCallbackProxy)) {
            return new PaymentCallbackProxy(iBinder);
        }
        return (PaymentCallbackProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy.AbstractC41395b
    public void onResult(int i, String str) {
        this.base.onResult(i, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy.PaymentCallback");
            onResult(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.littleapp.mains.LittleAppProxy.PaymentCallback");
            return true;
        }
    }
}
