package com.bytedance.ee.webapp.utils;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

public final class IWebAppHostServiceStub extends Binder implements IInterface, IWebAppHostService {
    public final WebAppHostServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.bytedance.ee.webapp.utils.IWebAppHostService
    public void tryKillAllBrandProcess() {
        this.base.tryKillAllBrandProcess();
    }

    @Override // com.bytedance.ee.webapp.utils.IWebAppHostService
    public void setInspectDebugList(ArrayList<String> arrayList) {
        this.base.setInspectDebugList(arrayList);
    }

    public IWebAppHostServiceStub(Context context) {
        this.base = new WebAppHostServiceImpl(context);
        attachInterface(this, "com.bytedance.ee.webapp.utils.IWebAppHostService");
    }

    public static IWebAppHostServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.webapp.utils.IWebAppHostService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IWebAppHostServiceProxy)) {
            return new IWebAppHostServiceProxy(context, iBinder);
        }
        return (IWebAppHostServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.bytedance.ee.webapp.utils.IWebAppHostService");
            setInspectDebugList(parcel.readArrayList(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.bytedance.ee.webapp.utils.IWebAppHostService");
            tryKillAllBrandProcess();
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.bytedance.ee.webapp.utils.IWebAppHostService");
            return true;
        }
    }
}
