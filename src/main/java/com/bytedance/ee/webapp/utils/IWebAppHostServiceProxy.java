package com.bytedance.ee.webapp.utils;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;

public final class IWebAppHostServiceProxy implements IInterface, IWebAppHostService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.bytedance.ee.webapp.utils.IWebAppHostService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.bytedance.ee.webapp.utils.IWebAppHostService
    public void tryKillAllBrandProcess() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.ee.webapp.utils.IWebAppHostService");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IWebAppHostServiceProxy", "call method tryKillAllBrandProcess throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.bytedance.ee.webapp.utils.IWebAppHostService
    public void setInspectDebugList(ArrayList<String> arrayList) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.ee.webapp.utils.IWebAppHostService");
            obtain.writeList(arrayList);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IWebAppHostServiceProxy", "call method setInspectDebugList throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IWebAppHostServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
