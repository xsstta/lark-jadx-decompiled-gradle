package com.ss.lark.android.passport.biz.link_handler;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService;

public final class ISwitchUserCallbackProxy implements IInterface, ISwitchUserManisService.AbstractC65155a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public ISwitchUserCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.AbstractC65155a
    public void onSuccess(SessionResult sessionResult) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback");
            if (sessionResult != null) {
                obtain.writeInt(1);
                sessionResult.writeToParcel(obtain, 0);
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

    @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.AbstractC65155a
    public void onError(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.ISwitchUserCallback");
            obtain.writeInt(i);
            obtain.writeString(str);
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
}
