package com.ss.android.lark.mail.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.AbstractC41849c;

public final class DriveCallbackStub extends Binder implements IInterface, AbstractC41849c.AbstractC41850a {
    public final AbstractC41849c.AbstractC41850a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
    public void saveClick() {
        this.base.saveClick();
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
    public void forwardClick(String str) {
        this.base.forwardClick(str);
    }

    public DriveCallbackStub(AbstractC41849c.AbstractC41850a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.mail.impl.IHostDependency.DriveCallback");
    }

    public static DriveCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.IHostDependency.DriveCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof DriveCallbackProxy)) {
            return new DriveCallbackProxy(iBinder);
        }
        return (DriveCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.IHostDependency.DriveCallback");
            forwardClick(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.IHostDependency.DriveCallback");
            saveClick();
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.IHostDependency.DriveCallback");
            return true;
        }
    }
}
