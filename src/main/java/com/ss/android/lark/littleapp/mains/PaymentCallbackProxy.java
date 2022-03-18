package com.ss.android.lark.littleapp.mains;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;

public final class PaymentCallbackProxy implements IInterface, LittleAppProxy.AbstractC41395b {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.littleapp.mains.LittleAppProxy.PaymentCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public PaymentCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy.AbstractC41395b
    public void onResult(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy.PaymentCallback");
            obtain.writeInt(i);
            obtain.writeString(str);
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
