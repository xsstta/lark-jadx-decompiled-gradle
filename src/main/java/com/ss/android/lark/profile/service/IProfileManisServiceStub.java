package com.ss.android.lark.profile.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.profile.func.manis.ProfileManisServiceImpl;
import com.ss.android.lark.profile.service.IProfileManisService;

public final class IProfileManisServiceStub extends Binder implements IInterface, IProfileManisService {
    public final ProfileManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.profile.service.IProfileManisService
    public void startContactsProfileActivityByChatterId(String str) {
        this.base.startContactsProfileActivityByChatterId(str);
    }

    public IProfileManisServiceStub(Context context) {
        this.base = new ProfileManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.profile.service.IProfileManisService");
    }

    @Override // com.ss.android.lark.profile.service.IProfileManisService
    public void fetchUserProfile(String str, IProfileManisService.AbstractC52889a aVar) {
        this.base.fetchUserProfile(str, aVar);
    }

    public static IProfileManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.profile.service.IProfileManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IProfileManisServiceProxy)) {
            return new IProfileManisServiceProxy(context, iBinder);
        }
        return (IProfileManisServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.profile.service.IProfileManisService");
            startContactsProfileActivityByChatterId(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.profile.service.IProfileManisService");
            fetchUserProfile(parcel.readString(), FetchUserProfileCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.profile.service.IProfileManisService");
            return true;
        }
    }
}
