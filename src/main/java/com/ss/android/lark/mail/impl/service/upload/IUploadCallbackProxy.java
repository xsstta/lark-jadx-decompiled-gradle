package com.ss.android.lark.mail.impl.service.upload;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IUploadCallbackProxy implements IInterface, AbstractC43390b {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.service.upload.IUploadCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IUploadCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43390b
    public boolean onFailed(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = false;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.service.upload.IUploadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return z;
    }

    @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43390b
    public boolean updateProgress(String str, int i, long j, long j2, String str2, String str3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = false;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.service.upload.IUploadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeLong(j);
            obtain.writeLong(j2);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return z;
    }
}
