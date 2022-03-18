package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;

public final class TransmissionDataCallbackStub extends Binder implements IInterface, AbstractC54255a.AbstractC54256a {
    public final AbstractC54255a.AbstractC54256a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
    public void onError(ParcelableError parcelableError) {
        this.base.onError(parcelableError);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
    public void onSuccess(TransmissionData transmissionData) {
        this.base.onSuccess(transmissionData);
    }

    public TransmissionDataCallbackStub(AbstractC54255a.AbstractC54256a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback");
    }

    public static TransmissionDataCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof TransmissionDataCallbackProxy)) {
            return new TransmissionDataCallbackProxy(iBinder);
        }
        return (TransmissionDataCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        TransmissionData transmissionData = null;
        ParcelableError parcelableError = null;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback");
            if (parcel.readInt() != 0) {
                transmissionData = TransmissionData.CREATOR.createFromParcel(parcel);
            }
            onSuccess(transmissionData);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback");
            if (parcel.readInt() != 0) {
                parcelableError = ParcelableError.CREATOR.createFromParcel(parcel);
            }
            onError(parcelableError);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback");
            return true;
        }
    }
}
