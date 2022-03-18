package com.ss.android.lark.openplatform.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class OpenPlatformIpcProxy implements IInterface, OpenPlatformIpc {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.openplatform.manis.OpenPlatformIpc";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public OpenPlatformIpcProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.openplatform.manis.OpenPlatformIpc
    public void startChatWindowActivityByChatIdAndPos(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.openplatform.manis.OpenPlatformIpc");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("OpenPlatformIpcProxy", "call method startChatWindowActivityByChatIdAndPos throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
