package com.ss.android.lark.image.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.image.service.IImageManisService;

public final class UploadEncryptImageCallbackStub extends Binder implements IInterface, IImageManisService.AbstractC38924a {
    public final IImageManisService.AbstractC38924a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.image.service.IImageManisService.AbstractC38924a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        this.base.onError(errorResultWrapper);
    }

    @Override // com.ss.android.lark.image.service.IImageManisService.AbstractC38924a
    public void onSuccess(EncryptImageData encryptImageData) {
        this.base.onSuccess(encryptImageData);
    }

    public UploadEncryptImageCallbackStub(IImageManisService.AbstractC38924a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback");
    }

    public static UploadEncryptImageCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof UploadEncryptImageCallbackProxy)) {
            return new UploadEncryptImageCallbackProxy(iBinder);
        }
        return (UploadEncryptImageCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        EncryptImageData encryptImageData = null;
        ErrorResultWrapper errorResultWrapper = null;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback");
            if (parcel.readInt() != 0) {
                encryptImageData = EncryptImageData.CREATOR.createFromParcel(parcel);
            }
            onSuccess(encryptImageData);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback");
            if (parcel.readInt() != 0) {
                errorResultWrapper = ErrorResultWrapper.CREATOR.createFromParcel(parcel);
            }
            onError(errorResultWrapper);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback");
            return true;
        }
    }
}
