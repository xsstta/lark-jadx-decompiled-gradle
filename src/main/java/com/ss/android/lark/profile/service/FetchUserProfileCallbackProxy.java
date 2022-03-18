package com.ss.android.lark.profile.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.profile.dto.ErrorResultWrapper;
import com.ss.android.lark.profile.service.IProfileManisService;

public final class FetchUserProfileCallbackProxy implements IInterface, IProfileManisService.AbstractC52889a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public FetchUserProfileCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.profile.service.IProfileManisService.AbstractC52889a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback");
            if (errorResultWrapper != null) {
                obtain.writeInt(1);
                errorResultWrapper.writeToParcel(obtain, 0);
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

    @Override // com.ss.android.lark.profile.service.IProfileManisService.AbstractC52889a
    public void onSuccess(ProfileResponse profileResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback");
            if (profileResponse != null) {
                obtain.writeInt(1);
                profileResponse.writeToParcel(obtain, 0);
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
