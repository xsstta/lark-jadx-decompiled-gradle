package com.ss.android.lark.mail.impl.service.upload;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IDownloadCallbackStub extends Binder implements IInterface, AbstractC43389a {
    public final AbstractC43389a base;

    public IBinder asBinder() {
        return this;
    }

    public IDownloadCallbackStub(AbstractC43389a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.mail.impl.service.upload.IDownloadCallback");
    }

    public static IDownloadCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.service.upload.IDownloadCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadCallbackProxy)) {
            return new IDownloadCallbackProxy(iBinder);
        }
        return (IDownloadCallbackProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
    public boolean onFailed(String str, int i) {
        return this.base.onFailed(str, i);
    }

    @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
    public boolean updateProgress(String str, int i, long j, long j2) {
        return this.base.updateProgress(str, i, j, j2);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.service.upload.IDownloadCallback");
            boolean updateProgress = updateProgress(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
            parcel2.writeInt(updateProgress ? 1 : 0);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.service.upload.IDownloadCallback");
            boolean onFailed = onFailed(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(onFailed ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.service.upload.IDownloadCallback");
            return true;
        }
    }
}
