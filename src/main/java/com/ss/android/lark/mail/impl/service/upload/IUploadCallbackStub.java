package com.ss.android.lark.mail.impl.service.upload;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IUploadCallbackStub extends Binder implements IInterface, AbstractC43390b {
    public final AbstractC43390b base;

    public IBinder asBinder() {
        return this;
    }

    public IUploadCallbackStub(AbstractC43390b bVar) {
        this.base = bVar;
        attachInterface(this, "com.ss.android.lark.mail.impl.service.upload.IUploadCallback");
    }

    public static IUploadCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.service.upload.IUploadCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IUploadCallbackProxy)) {
            return new IUploadCallbackProxy(iBinder);
        }
        return (IUploadCallbackProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43390b
    public boolean onFailed(String str, int i) {
        return this.base.onFailed(str, i);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.service.upload.IUploadCallback");
            boolean updateProgress = updateProgress(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(updateProgress ? 1 : 0);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.service.upload.IUploadCallback");
            boolean onFailed = onFailed(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(onFailed ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.service.upload.IUploadCallback");
            return true;
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43390b
    public boolean updateProgress(String str, int i, long j, long j2, String str2, String str3) {
        return this.base.updateProgress(str, i, j, j2, str2, str3);
    }
}
