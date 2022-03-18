package com.ss.android.lark.mail.impl.settings;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;

public final class ISettingChangeCallbackProxy implements IInterface, AbstractC43396c {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.settings.ISettingChangeCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public ISettingChangeCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.settings.AbstractC43396c
    public void onChanged(EmailSignature emailSignature) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.settings.ISettingChangeCallback");
            if (emailSignature != null) {
                obtain.writeInt(1);
                emailSignature.writeToParcel(obtain, 0);
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
