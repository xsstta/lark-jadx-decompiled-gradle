package com.ss.android.lark.mail.impl.mulprocess.webprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.imp.TranslationService;

public final class ITranslationServiceStub extends Binder implements IInterface, ITranslationService {
    public final TranslationService base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService
    public void setTranslationSetting(TranslationSetting translationSetting) {
        this.base.setTranslationSetting(translationSetting);
    }

    public ITranslationServiceStub(Context context) {
        this.base = new TranslationService(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService");
    }

    public static ITranslationServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ITranslationServiceProxy)) {
            return new ITranslationServiceProxy(context, iBinder);
        }
        return (ITranslationServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        TranslationSetting translationSetting;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService");
            if (parcel.readInt() != 0) {
                translationSetting = TranslationSetting.CREATOR.createFromParcel(parcel);
            } else {
                translationSetting = null;
            }
            setTranslationSetting(translationSetting);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService");
            return true;
        }
    }
}
