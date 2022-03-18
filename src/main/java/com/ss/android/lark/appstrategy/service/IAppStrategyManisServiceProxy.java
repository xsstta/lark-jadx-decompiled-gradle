package com.ss.android.lark.appstrategy.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appstrategy.service.IAppStrategyManisService;
import com.ss.android.lark.log.Log;

public final class IAppStrategyManisServiceProxy implements IInterface, IAppStrategyManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.appstrategy.service.IAppStrategyManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IAppStrategyManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenApp(String str, IAppStrategyManisService.AbstractC29241a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new ManisCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IAppStrategyManisServiceProxy", "call method getOpenApp throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenAppInfoV2(String str, int i, IAppStrategyManisService.AbstractC29241a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
            obtain.writeString(str);
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new ManisCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IAppStrategyManisServiceProxy", "call method getOpenAppInfoV2 throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void updateLastUseTime(String str, String str2, long j, IAppStrategyManisService.AbstractC29241a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appstrategy.service.IAppStrategyManisService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            if (aVar != null) {
                obtain.writeStrongBinder(new ManisCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IAppStrategyManisServiceProxy", "call method updateLastUseTime throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
