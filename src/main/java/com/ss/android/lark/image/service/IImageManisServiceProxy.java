package com.ss.android.lark.image.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.image.service.IImageManisService;
import com.ss.android.lark.log.Log;

public final class IImageManisServiceProxy implements IInterface, IImageManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.image.service.IImageManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IImageManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.image.service.IImageManisService
    public void uploadEncryptImage(String str, boolean z, boolean z2, IImageManisService.AbstractC38924a aVar) {
        int i;
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.image.service.IImageManisService");
            obtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            if (aVar != null) {
                obtain.writeStrongBinder(new UploadEncryptImageCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IImageManisServiceProxy", "call method uploadEncryptImage throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
