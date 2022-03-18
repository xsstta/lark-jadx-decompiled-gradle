package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.MailSettingImp;

public final class IMailSettingStub extends Binder implements IInterface, IMailSetting {
    public final MailSettingImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public EmailAliasList getAliasList() {
        return this.base.getAliasList();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public EmailAutoReply getAutoReplyValue() {
        return this.base.getAutoReplyValue();
    }

    public IMailSettingStub(Context context) {
        this.base = new MailSettingImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public void updateAutoReply(EmailAutoReply emailAutoReply, IMailSetting.AbstractC43218a aVar) {
        this.base.updateAutoReply(emailAutoReply, aVar);
    }

    public static IMailSettingProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMailSettingProxy)) {
            return new IMailSettingProxy(context, iBinder);
        }
        return (IMailSettingProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        EmailAutoReply emailAutoReply;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
            EmailAliasList aliasList = getAliasList();
            parcel2.writeNoException();
            if (aliasList != null) {
                parcel2.writeInt(1);
                aliasList.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
            if (parcel.readInt() != 0) {
                emailAutoReply = EmailAutoReply.CREATOR.createFromParcel(parcel);
            } else {
                emailAutoReply = null;
            }
            updateAutoReply(emailAutoReply, MailSettingCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
            EmailAutoReply autoReplyValue = getAutoReplyValue();
            parcel2.writeNoException();
            if (autoReplyValue != null) {
                parcel2.writeInt(1);
                autoReplyValue.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
            return true;
        }
    }
}
