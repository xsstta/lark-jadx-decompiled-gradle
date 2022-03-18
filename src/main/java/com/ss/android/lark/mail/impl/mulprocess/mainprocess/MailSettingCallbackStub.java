package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting;

public final class MailSettingCallbackStub extends Binder implements IInterface, IMailSetting.AbstractC43218a {
    public final IMailSetting.AbstractC43218a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.AbstractC43218a
    public void onFail() {
        this.base.onFail();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.AbstractC43218a
    public void onSuc(ByteArray byteArray) {
        this.base.onSuc(byteArray);
    }

    public MailSettingCallbackStub(IMailSetting.AbstractC43218a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.MailSettingCallback");
    }

    public static MailSettingCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.MailSettingCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof MailSettingCallbackProxy)) {
            return new MailSettingCallbackProxy(iBinder);
        }
        return (MailSettingCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ByteArray byteArray;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.MailSettingCallback");
            if (parcel.readInt() != 0) {
                byteArray = ByteArray.CREATOR.createFromParcel(parcel);
            } else {
                byteArray = null;
            }
            onSuc(byteArray);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.MailSettingCallback");
            onFail();
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.MailSettingCallback");
            return true;
        }
    }
}
