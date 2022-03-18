package com.ss.android.lark.appstrategy.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appstrategy.service.IAppStrategyManisService;
import com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper;
import com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper;

public final class ManisCallbackStub extends Binder implements IInterface, IAppStrategyManisService.AbstractC29241a {
    public final IAppStrategyManisService.AbstractC29241a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        this.base.onError(errorResultWrapper);
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
    public void onSuccess(SuccessResultWrapper successResultWrapper) {
        this.base.onSuccess(successResultWrapper);
    }

    public ManisCallbackStub(IAppStrategyManisService.AbstractC29241a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback");
    }

    public static ManisCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ManisCallbackProxy)) {
            return new ManisCallbackProxy(iBinder);
        }
        return (ManisCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        SuccessResultWrapper successResultWrapper = null;
        ErrorResultWrapper errorResultWrapper = null;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback");
            if (parcel.readInt() != 0) {
                successResultWrapper = SuccessResultWrapper.CREATOR.createFromParcel(parcel);
            }
            onSuccess(successResultWrapper);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback");
            if (parcel.readInt() != 0) {
                errorResultWrapper = ErrorResultWrapper.CREATOR.createFromParcel(parcel);
            }
            onError(errorResultWrapper);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback");
            return true;
        }
    }
}
