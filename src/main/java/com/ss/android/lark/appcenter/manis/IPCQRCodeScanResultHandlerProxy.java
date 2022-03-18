package com.ss.android.lark.appcenter.manis;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;

public final class IPCQRCodeScanResultHandlerProxy implements IInterface, AppCenterProxy.AbstractC29095b {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCQRCodeScanResultHandler";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IPCQRCodeScanResultHandlerProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29095b
    public boolean handleResult(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = false;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy.IPCQRCodeScanResultHandler");
            obtain.writeString(str);
            obtain.writeInt(i);
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
