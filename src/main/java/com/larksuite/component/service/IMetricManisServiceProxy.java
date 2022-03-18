package com.larksuite.component.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.dto.MetricIPCData;
import com.ss.android.lark.log.Log;

public final class IMetricManisServiceProxy implements IInterface, IMetricManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.larksuite.component.service.IMetricManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.larksuite.component.service.IMetricManisService
    public void metricIPC(MetricIPCData metricIPCData) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.service.IMetricManisService");
            if (metricIPCData != null) {
                obtain.writeInt(1);
                metricIPCData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMetricManisServiceProxy", "call method metricIPC throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IMetricManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
