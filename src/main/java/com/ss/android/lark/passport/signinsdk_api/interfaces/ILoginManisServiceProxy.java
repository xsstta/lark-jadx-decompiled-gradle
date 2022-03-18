package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService;

public final class ILoginManisServiceProxy implements IInterface, ILoginManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public ILoginManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService
    public void switchLoginTenantUser(String str, ILoginManisService.AbstractC49387a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new ISwitchUserCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ILoginManisServiceProxy", "call method switchLoginTenantUser throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
