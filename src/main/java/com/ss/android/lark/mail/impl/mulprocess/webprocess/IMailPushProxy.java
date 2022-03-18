package com.ss.android.lark.mail.impl.mulprocess.webprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;

public final class IMailPushProxy implements IInterface, IMailPush {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IMailPushProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush
    public void push(int i, ByteArray byteArray, String str, boolean z, boolean z2) {
        int i2;
        int i3;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush");
            obtain.writeInt(i);
            if (byteArray != null) {
                obtain.writeInt(1);
                byteArray.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            if (z2) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            obtain.writeInt(i3);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMailPushProxy", "call method push throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
