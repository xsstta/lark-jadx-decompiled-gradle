package com.larksuite.component.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.dto.MetricIPCData;
import com.larksuite.component.service.impl.MetricManisServiceImpl;

public final class IMetricManisServiceStub extends Binder implements IInterface, IMetricManisService {
    public final MetricManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.larksuite.component.service.IMetricManisService
    public void metricIPC(MetricIPCData metricIPCData) {
        this.base.metricIPC(metricIPCData);
    }

    public IMetricManisServiceStub(Context context) {
        this.base = new MetricManisServiceImpl(context);
        attachInterface(this, "com.larksuite.component.service.IMetricManisService");
    }

    public static IMetricManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.larksuite.component.service.IMetricManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMetricManisServiceProxy)) {
            return new IMetricManisServiceProxy(context, iBinder);
        }
        return (IMetricManisServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        MetricIPCData metricIPCData;
        if (i == 1) {
            parcel.enforceInterface("com.larksuite.component.service.IMetricManisService");
            if (parcel.readInt() != 0) {
                metricIPCData = MetricIPCData.CREATOR.createFromParcel(parcel);
            } else {
                metricIPCData = null;
            }
            metricIPC(metricIPCData);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.larksuite.component.service.IMetricManisService");
            return true;
        }
    }
}
