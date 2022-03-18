package com.ss.android.lark.appcenter.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;
import com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

public final class AppCenterProxyProxy implements IInterface, AppCenterProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.appcenter.manis.AppCenterProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public List<AppCenterMenuIPCItem> getAppCenterMenuItems(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readArrayList;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppCenterProxyProxy", "call method getAppCenterMenuItems throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public AppCenterProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void doCheckFace(String str, AppCenterProxy.AbstractC29094a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new IPCDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppCenterProxyProxy", "call method doCheckFace throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void getEnterBotMenuItem(String str, AppCenterProxy.AbstractC29096c cVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            obtain.writeString(str);
            if (cVar != null) {
                obtain.writeStrongBinder(new MenuCallBackIPCStub(cVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppCenterProxyProxy", "call method getEnterBotMenuItem throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy
    public void openScanQRCodeActivity(IntArray intArray, boolean z, AppCenterProxy.AbstractC29095b bVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.appcenter.manis.AppCenterProxy");
            if (intArray != null) {
                obtain.writeInt(1);
                intArray.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (bVar != null) {
                obtain.writeStrongBinder(new IPCQRCodeScanResultHandlerStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppCenterProxyProxy", "call method openScanQRCodeActivity throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
