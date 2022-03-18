package com.ss.android.lark.mail.impl.mulprocess.webprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.imp.MailPushImp;

public final class IMailPushStub extends Binder implements IInterface, IMailPush {
    public final MailPushImp base;

    public IBinder asBinder() {
        return this;
    }

    public IMailPushStub(Context context) {
        this.base = new MailPushImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush");
    }

    public static IMailPushProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMailPushProxy)) {
            return new IMailPushProxy(context, iBinder);
        }
        return (IMailPushProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ByteArray byteArray;
        boolean z;
        boolean z2;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush");
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                byteArray = ByteArray.CREATOR.createFromParcel(parcel);
            } else {
                byteArray = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            push(readInt, byteArray, readString, z, z2);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush");
            return true;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush
    public void push(int i, ByteArray byteArray, String str, boolean z, boolean z2) {
        this.base.push(i, byteArray, str, z, z2);
    }
}
