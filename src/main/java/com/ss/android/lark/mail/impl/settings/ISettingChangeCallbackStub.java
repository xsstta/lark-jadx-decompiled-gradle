package com.ss.android.lark.mail.impl.settings;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;

public final class ISettingChangeCallbackStub extends Binder implements IInterface, AbstractC43396c {
    public final AbstractC43396c base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.settings.AbstractC43396c
    public void onChanged(EmailSignature emailSignature) {
        this.base.onChanged(emailSignature);
    }

    public ISettingChangeCallbackStub(AbstractC43396c cVar) {
        this.base = cVar;
        attachInterface(this, "com.ss.android.lark.mail.impl.settings.ISettingChangeCallback");
    }

    public static ISettingChangeCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.settings.ISettingChangeCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISettingChangeCallbackProxy)) {
            return new ISettingChangeCallbackProxy(iBinder);
        }
        return (ISettingChangeCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        EmailSignature emailSignature;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.settings.ISettingChangeCallback");
            if (parcel.readInt() != 0) {
                emailSignature = EmailSignature.CREATOR.createFromParcel(parcel);
            } else {
                emailSignature = null;
            }
            onChanged(emailSignature);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.settings.ISettingChangeCallback");
            return true;
        }
    }
}
