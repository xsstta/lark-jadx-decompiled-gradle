package com.ss.android.lark.guidemgr.manis;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.guidemgr.manis.IGuideMgrProxy;

public final class OnGuideChangeListenerProxy implements IInterface, IGuideMgrProxy.OnGuideChangeListener {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public OnGuideChangeListenerProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener
    public void onGuideChanged(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener");
            obtain.writeString(str);
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
