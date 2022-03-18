package com.ss.android.lark.dynamicconfig.interfaces;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IDynamicManisServiceProxy implements IInterface, IDynamicManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService
    public String getDynamicDomain(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService");
            obtain.writeInt(i);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDynamicManisServiceProxy", "call method getDynamicDomain throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public IDynamicManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
