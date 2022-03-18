package com.ss.android.lark.featuregating.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.featuregating.service.impl.FeatureGatingProxyImpl;

public final class IFeatureGatingProxyStub extends Binder implements IInterface, IFeatureGatingProxy {
    public final FeatureGatingProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    public IFeatureGatingProxyStub(Context context) {
        this.base = new FeatureGatingProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.featuregating.service.IFeatureGatingProxy");
    }

    @Override // com.ss.android.lark.featuregating.service.IFeatureGatingProxy
    public boolean isEnable(String str, boolean z) {
        return this.base.isEnable(str, z);
    }

    public static IFeatureGatingProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.featuregating.service.IFeatureGatingProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IFeatureGatingProxyProxy)) {
            return new IFeatureGatingProxyProxy(context, iBinder);
        }
        return (IFeatureGatingProxyProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.featuregating.service.IFeatureGatingProxy");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            boolean isEnable = isEnable(readString, z);
            parcel2.writeNoException();
            parcel2.writeInt(isEnable ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.featuregating.service.IFeatureGatingProxy");
            return true;
        }
    }
}
