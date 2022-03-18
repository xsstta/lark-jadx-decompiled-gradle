package com.ss.android.lark.mail.impl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.AbstractC41849c;

public final class DriveCallbackProxy implements IInterface, AbstractC41849c.AbstractC41850a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.IHostDependency.DriveCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
    public void saveClick() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.IHostDependency.DriveCallback");
            this.mRemote.transact(2, obtain, obtain2, 0);
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

    public DriveCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
    public void forwardClick(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.IHostDependency.DriveCallback");
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
