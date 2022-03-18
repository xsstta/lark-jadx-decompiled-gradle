package com.ss.android.lark.featuregating.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IFeatureGatingProxyProxy implements IInterface, IFeatureGatingProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.featuregating.service.IFeatureGatingProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public IFeatureGatingProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.featuregating.service.IFeatureGatingProxy
    public boolean isEnable(String str, boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z2 = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.featuregating.service.IFeatureGatingProxy");
            obtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            return z2;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IFeatureGatingProxyProxy", "call method isEnable throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
