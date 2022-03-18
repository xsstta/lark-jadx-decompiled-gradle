package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService;

public final class ISwitchUserManisServiceProxy implements IInterface, ISwitchUserManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public ISwitchUserManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService
    public void switchUser(String str, String str2, String str3, ISwitchUserManisService.AbstractC65155a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (aVar != null) {
                obtain.writeStrongBinder(new ISwitchUserCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ISwitchUserManisServiceProxy", "call method switchUser throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
