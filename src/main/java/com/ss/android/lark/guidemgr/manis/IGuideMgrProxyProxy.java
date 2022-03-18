package com.ss.android.lark.guidemgr.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.guidemgr.manis.IGuideMgrProxy;
import com.ss.android.lark.log.Log;

public final class IGuideMgrProxyProxy implements IInterface, IGuideMgrProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.guidemgr.manis.IGuideMgrProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void fetchFromMainProcess() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IGuideMgrProxyProxy", "call method fetchFromMainProcess throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void onGuideChanged(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            obtain.writeString(str);
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IGuideMgrProxyProxy", "call method onGuideChanged throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void registerOnGuideChangeListener(IGuideMgrProxy.OnGuideChangeListener aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            if (aVar != null) {
                obtain.writeStrongBinder(new OnGuideChangeListenerStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IGuideMgrProxyProxy", "call method registerOnGuideChangeListener throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public boolean report(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IGuideMgrProxyProxy", "call method report throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IGuideMgrProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
