package com.ss.android.lark.image.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.image.service.IImageManisService;

public final class UploadEncryptImageCallbackProxy implements IInterface, IImageManisService.AbstractC38924a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public UploadEncryptImageCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.image.service.IImageManisService.AbstractC38924a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback");
            if (errorResultWrapper != null) {
                obtain.writeInt(1);
                errorResultWrapper.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
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

    @Override // com.ss.android.lark.image.service.IImageManisService.AbstractC38924a
    public void onSuccess(EncryptImageData encryptImageData) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.image.service.IImageManisService.UploadEncryptImageCallback");
            if (encryptImageData != null) {
                obtain.writeInt(1);
                encryptImageData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
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
