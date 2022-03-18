package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.SettingServiceImp;
import com.ss.android.lark.mail.impl.settings.AbstractC43396c;
import com.ss.android.lark.mail.impl.settings.ISettingChangeCallbackStub;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;

public final class ISettingServiceStub extends Binder implements IInterface, ISettingService {
    public final SettingServiceImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public EmailAliasList getAliasList(String str) {
        return this.base.getAliasList(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public boolean isSmartReplyEnable(String str) {
        return this.base.isSmartReplyEnable(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public void removeSignatureChangeCallback(String str) {
        this.base.removeSignatureChangeCallback(str);
    }

    public ISettingServiceStub(Context context) {
        this.base = new SettingServiceImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public void addSignatureChangeCallback(String str, AbstractC43396c cVar) {
        this.base.addSignatureChangeCallback(str, cVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public void updateSignature(String str, EmailSignature emailSignature) {
        this.base.updateSignature(str, emailSignature);
    }

    public static ISettingServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISettingServiceProxy)) {
            return new ISettingServiceProxy(context, iBinder);
        }
        return (ISettingServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        EmailSignature emailSignature;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                emailSignature = EmailSignature.CREATOR.createFromParcel(parcel);
            } else {
                emailSignature = null;
            }
            updateSignature(readString, emailSignature);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
            EmailAliasList aliasList = getAliasList(parcel.readString());
            parcel2.writeNoException();
            if (aliasList != null) {
                parcel2.writeInt(1);
                aliasList.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
            boolean isSmartReplyEnable = isSmartReplyEnable(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(isSmartReplyEnable ? 1 : 0);
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
            addSignatureChangeCallback(parcel.readString(), ISettingChangeCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 5) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
            removeSignatureChangeCallback(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService");
            return true;
        }
    }
}
