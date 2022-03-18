package com.ss.android.lark.appstrategy.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appstrategy.service.IAppStrategyManisService;
import com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl;

public final class IAppStrategyManisServiceStub extends Binder implements IInterface, IAppStrategyManisService {
    public final AppStrategyManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    public IAppStrategyManisServiceStub(Context context) {
        this.base = new AppStrategyManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenApp(String str, IAppStrategyManisService.AbstractC29241a aVar) {
        this.base.getOpenApp(str, aVar);
    }

    public static IAppStrategyManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppStrategyManisServiceProxy)) {
            return new IAppStrategyManisServiceProxy(context, iBinder);
        }
        return (IAppStrategyManisServiceProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenAppInfoV2(String str, int i, IAppStrategyManisService.AbstractC29241a aVar) {
        this.base.getOpenAppInfoV2(str, i, aVar);
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void updateLastUseTime(String str, String str2, long j, IAppStrategyManisService.AbstractC29241a aVar) {
        this.base.updateLastUseTime(str, str2, j, aVar);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
            getOpenApp(parcel.readString(), ManisCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
            getOpenAppInfoV2(parcel.readString(), parcel.readInt(), ManisCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
            updateLastUseTime(parcel.readString(), parcel.readString(), parcel.readLong(), ManisCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
            return true;
        }
    }
}
