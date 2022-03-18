package com.ss.android.lark.stepcount.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.stepcount.service.impl.StepCountManisServiceImpl;

public final class IStepCountManisServiceStub extends Binder implements IInterface, IStepCountManisService {
    public final StepCountManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public int getDayStepCount() {
        return this.base.getDayStepCount();
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public boolean getStepCountAuthorized() {
        return this.base.getStepCountAuthorized();
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public void setStepCountAuthorized(boolean z) {
        this.base.setStepCountAuthorized(z);
    }

    public IStepCountManisServiceStub(Context context) {
        this.base = new StepCountManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.stepcount.service.IStepCountManisService");
    }

    public static IStepCountManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.stepcount.service.IStepCountManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IStepCountManisServiceProxy)) {
            return new IStepCountManisServiceProxy(context, iBinder);
        }
        return (IStepCountManisServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.stepcount.service.IStepCountManisService");
            int dayStepCount = getDayStepCount();
            parcel2.writeNoException();
            parcel2.writeInt(dayStepCount);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.stepcount.service.IStepCountManisService");
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            setStepCountAuthorized(z);
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.stepcount.service.IStepCountManisService");
            boolean stepCountAuthorized = getStepCountAuthorized();
            parcel2.writeNoException();
            parcel2.writeInt(stepCountAuthorized ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.stepcount.service.IStepCountManisService");
            return true;
        }
    }
}
