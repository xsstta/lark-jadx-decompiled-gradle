package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError;

public final class VoidCallbackStub extends Binder implements IInterface, AbstractC54255a.AbstractC54257b {
    public final AbstractC54255a.AbstractC54257b base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
    public void onSuccess() {
        this.base.onSuccess();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
    public void onError(ParcelableError parcelableError) {
        this.base.onError(parcelableError);
    }

    public VoidCallbackStub(AbstractC54255a.AbstractC54257b bVar) {
        this.base = bVar;
        attachInterface(this, "com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback");
    }

    public static VoidCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof VoidCallbackProxy)) {
            return new VoidCallbackProxy(iBinder);
        }
        return (VoidCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ParcelableError parcelableError;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback");
            onSuccess();
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback");
            if (parcel.readInt() != 0) {
                parcelableError = ParcelableError.CREATOR.createFromParcel(parcel);
            } else {
                parcelableError = null;
            }
            onError(parcelableError);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback");
            return true;
        }
    }
}
