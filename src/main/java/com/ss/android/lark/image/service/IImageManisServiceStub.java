package com.ss.android.lark.image.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.image.impl.ImageManisService;
import com.ss.android.lark.image.service.IImageManisService;

public final class IImageManisServiceStub extends Binder implements IInterface, IImageManisService {
    public final ImageManisService base;

    public IBinder asBinder() {
        return this;
    }

    public IImageManisServiceStub(Context context) {
        this.base = new ImageManisService(context);
        attachInterface(this, "com.ss.android.lark.image.service.IImageManisService");
    }

    public static IImageManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.image.service.IImageManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IImageManisServiceProxy)) {
            return new IImageManisServiceProxy(context, iBinder);
        }
        return (IImageManisServiceProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.image.service.IImageManisService
    public void uploadEncryptImage(String str, boolean z, boolean z2, IImageManisService.AbstractC38924a aVar) {
        this.base.uploadEncryptImage(str, z, z2, aVar);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.image.service.IImageManisService");
            String readString = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            uploadEncryptImage(readString, z, z2, UploadEncryptImageCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.image.service.IImageManisService");
            return true;
        }
    }
}
