package com.ss.android.lark.platform.applink;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;

public final class AppLinkProxyProxy implements IInterface, AppLinkProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.platform.applink.AppLinkProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public AppLinkProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.platform.applink.AppLinkProxy
    public void handle(String str, AppLink appLink) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.platform.applink.AppLinkProxy");
            obtain.writeString(str);
            if (appLink != null) {
                obtain.writeInt(1);
                appLink.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppLinkProxyProxy", "call method handle throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
