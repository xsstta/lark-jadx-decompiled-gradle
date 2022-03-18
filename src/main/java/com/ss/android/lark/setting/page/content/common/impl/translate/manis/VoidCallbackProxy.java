package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError;

public final class VoidCallbackProxy implements IInterface, AbstractC54255a.AbstractC54257b {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
    public void onSuccess() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback");
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

    public VoidCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54257b
    public void onError(ParcelableError parcelableError) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.VoidCallback");
            if (parcelableError != null) {
                obtain.writeInt(1);
                parcelableError.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(2, obtain, obtain2, 0);
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
