package com.ss.android.lark.appstrategy.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appstrategy.service.IAppStrategyManisService;
import com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper;
import com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper;

public final class ManisCallbackProxy implements IInterface, IAppStrategyManisService.AbstractC29241a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public ManisCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
    public void onError(ErrorResultWrapper errorResultWrapper) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback");
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

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.AbstractC29241a
    public void onSuccess(SuccessResultWrapper successResultWrapper) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appstrategy.service.IAppStrategyManisService.ManisCallback");
            if (successResultWrapper != null) {
                obtain.writeInt(1);
                successResultWrapper.writeToParcel(obtain, 0);
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
