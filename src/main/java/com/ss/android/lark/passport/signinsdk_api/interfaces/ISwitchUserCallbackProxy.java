package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService;

public final class ISwitchUserCallbackProxy implements IInterface, ILoginManisService.AbstractC49387a {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService.ISwitchUserCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public ISwitchUserCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService.AbstractC49387a
    public void onSuccess(SessionResult sessionResult) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService.ISwitchUserCallback");
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

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService.AbstractC49387a
    public void onError(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService.ISwitchUserCallback");
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
