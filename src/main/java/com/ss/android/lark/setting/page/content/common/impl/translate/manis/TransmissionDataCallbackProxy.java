package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;

public final class TransmissionDataCallbackProxy implements IInterface, AbstractC54255a.AbstractC54256a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public TransmissionDataCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
    public void onError(ParcelableError parcelableError) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback");
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

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a.AbstractC54256a
    public void onSuccess(TransmissionData transmissionData) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.CallbackContract.TransmissionDataCallback");
            if (transmissionData != null) {
                obtain.writeInt(1);
                transmissionData.writeToParcel(obtain, 0);
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
