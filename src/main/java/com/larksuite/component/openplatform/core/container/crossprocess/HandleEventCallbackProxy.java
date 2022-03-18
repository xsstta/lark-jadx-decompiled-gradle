package com.larksuite.component.openplatform.core.container.crossprocess;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;

public final class HandleEventCallbackProxy implements IInterface, IHostProcessHandleEvent.HandleEventCallback {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public HandleEventCallbackProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public void onLinkTraceId(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            obtain.writeString(str);
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public void onSuccess(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public void onFail(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            obtain.writeInt(i);
            obtain.writeString(str);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public LKBasePluginResult dispatchEventToAppProcess(LKEvent lKEvent, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        LKBasePluginResult lKBasePluginResult = null;
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            if (lKEvent != null) {
                obtain.writeInt(1);
                lKEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeLong(j);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                lKBasePluginResult = LKBasePluginResult.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return lKBasePluginResult;
    }
}
