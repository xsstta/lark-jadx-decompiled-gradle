package com.ss.android.lark.mail.impl.settings;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IOnBoardStatusChangeCallbackProxy implements IInterface, AbstractC43395b {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.settings.IOnBoardStatusChangeCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IOnBoardStatusChangeCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.settings.AbstractC43395b
    public void onChanged(Integer num) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.settings.IOnBoardStatusChangeCallback");
            obtain.writeInt(num.intValue());
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
