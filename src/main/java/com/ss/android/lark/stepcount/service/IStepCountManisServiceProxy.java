package com.ss.android.lark.stepcount.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IStepCountManisServiceProxy implements IInterface, IStepCountManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.stepcount.service.IStepCountManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public int getDayStepCount() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.stepcount.service.IStepCountManisService");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IStepCountManisServiceProxy", "call method getDayStepCount throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public boolean getStepCountAuthorized() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.stepcount.service.IStepCountManisService");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IStepCountManisServiceProxy", "call method getStepCountAuthorized throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public void setStepCountAuthorized(boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.stepcount.service.IStepCountManisService");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IStepCountManisServiceProxy", "call method setStepCountAuthorized throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IStepCountManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
