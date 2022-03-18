package com.ss.android.lark.mail.impl.mulprocess.webprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;

public final class ITranslationServiceProxy implements IInterface, ITranslationService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService
    public void setTranslationSetting(TranslationSetting translationSetting) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService");
            if (translationSetting != null) {
                obtain.writeInt(1);
                translationSetting.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ITranslationServiceProxy", "call method setTranslationSetting throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public ITranslationServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
