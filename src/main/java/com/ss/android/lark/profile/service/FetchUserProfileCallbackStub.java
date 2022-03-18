package com.ss.android.lark.profile.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.profile.dto.ErrorResultWrapper;
import com.ss.android.lark.profile.service.IProfileManisService;

public final class FetchUserProfileCallbackStub extends Binder implements IInterface, IProfileManisService.AbstractC52889a {
    public final IProfileManisService.AbstractC52889a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.profile.service.IProfileManisService.AbstractC52889a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        this.base.onError(errorResultWrapper);
    }

    @Override // com.ss.android.lark.profile.service.IProfileManisService.AbstractC52889a
    public void onSuccess(ProfileResponse profileResponse) {
        this.base.onSuccess(profileResponse);
    }

    public FetchUserProfileCallbackStub(IProfileManisService.AbstractC52889a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback");
    }

    public static FetchUserProfileCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof FetchUserProfileCallbackProxy)) {
            return new FetchUserProfileCallbackProxy(iBinder);
        }
        return (FetchUserProfileCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ProfileResponse profileResponse = null;
        ErrorResultWrapper errorResultWrapper = null;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback");
            if (parcel.readInt() != 0) {
                profileResponse = ProfileResponse.CREATOR.createFromParcel(parcel);
            }
            onSuccess(profileResponse);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback");
            if (parcel.readInt() != 0) {
                errorResultWrapper = ErrorResultWrapper.CREATOR.createFromParcel(parcel);
            }
            onError(errorResultWrapper);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.profile.service.IProfileManisService.FetchUserProfileCallback");
            return true;
        }
    }
}
