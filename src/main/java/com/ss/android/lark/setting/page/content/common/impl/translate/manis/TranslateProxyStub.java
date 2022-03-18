package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;

public final class TranslateProxyStub extends Binder implements IInterface, TranslateProxy {
    public final TranslateProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void getTargetLangList(AbstractC54255a.AbstractC54256a aVar) {
        this.base.getTargetLangList(aVar);
    }

    public TranslateProxyStub(Context context) {
        this.base = new TranslateProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void detectSourceLanguage(TransmissionData transmissionData, AbstractC54255a.AbstractC54256a aVar) {
        this.base.detectSourceLanguage(transmissionData, aVar);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void sendTranslateRequest(TransmissionData transmissionData, AbstractC54255a.AbstractC54256a aVar) {
        this.base.sendTranslateRequest(transmissionData, aVar);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setAutoTranslate(boolean z, AbstractC54255a.AbstractC54257b bVar) {
        this.base.setAutoTranslate(z, bVar);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void updateGlobalAutoTranslateScope(int i, AbstractC54255a.AbstractC54257b bVar) {
        this.base.updateGlobalAutoTranslateScope(i, bVar);
    }

    public static TranslateProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof TranslateProxyProxy)) {
            return new TranslateProxyProxy(context, iBinder);
        }
        return (TranslateProxyProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void getWebTranslateSetting(String str, String str2, AbstractC54255a.AbstractC54256a aVar) {
        this.base.getWebTranslateSetting(str, str2, aVar);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setUnTranslateThisLanguage(TransmissionData transmissionData, boolean z, AbstractC54255a.AbstractC54257b bVar) {
        this.base.setUnTranslateThisLanguage(transmissionData, z, bVar);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setUnTranslateThisSite(String str, boolean z, AbstractC54255a.AbstractC54257b bVar) {
        this.base.setUnTranslateThisSite(str, z, bVar);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1598968902) {
            boolean z = false;
            TransmissionData transmissionData = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    updateGlobalAutoTranslateScope(parcel.readInt(), VoidCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    if (parcel.readInt() != 0) {
                        transmissionData = TransmissionData.CREATOR.createFromParcel(parcel);
                    }
                    detectSourceLanguage(transmissionData, TransmissionDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    if (parcel.readInt() != 0) {
                        transmissionData = TransmissionData.CREATOR.createFromParcel(parcel);
                    }
                    sendTranslateRequest(transmissionData, TransmissionDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    getWebTranslateSetting(parcel.readString(), parcel.readString(), TransmissionDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    getTargetLangList(TransmissionDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setAutoTranslate(z, VoidCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    if (parcel.readInt() != 0) {
                        transmissionData = TransmissionData.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setUnTranslateThisLanguage(transmissionData, z, VoidCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setUnTranslateThisSite(readString, z, VoidCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            return true;
        }
    }
}
