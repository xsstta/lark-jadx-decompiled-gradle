package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting;

public final class IMailSettingProxy implements IInterface, IMailSetting {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public EmailAliasList getAliasList() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        EmailAliasList emailAliasList = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                emailAliasList = EmailAliasList.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMailSettingProxy", "call method getAliasList throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return emailAliasList;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public EmailAutoReply getAutoReplyValue() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        EmailAutoReply emailAutoReply = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                emailAutoReply = EmailAutoReply.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMailSettingProxy", "call method getAutoReplyValue throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return emailAutoReply;
    }

    public IMailSettingProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public void updateAutoReply(EmailAutoReply emailAutoReply, IMailSetting.AbstractC43218a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting");
            if (emailAutoReply != null) {
                obtain.writeInt(1);
                emailAutoReply.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new MailSettingCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMailSettingProxy", "call method updateAutoReply throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
