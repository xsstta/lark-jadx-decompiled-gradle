package com.larksuite.component.openplatform.core.container.crossprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;

public final class HandleEventCallbackStub extends Binder implements IInterface, IHostProcessHandleEvent.HandleEventCallback {
    public final IHostProcessHandleEvent.HandleEventCallback base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public void onLinkTraceId(String str) {
        this.base.onLinkTraceId(str);
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public void onSuccess(String str) {
        this.base.onSuccess(str);
    }

    public HandleEventCallbackStub(IHostProcessHandleEvent.HandleEventCallback handleEventCallback) {
        this.base = handleEventCallback;
        attachInterface(this, "com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
    }

    public static HandleEventCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof HandleEventCallbackProxy)) {
            return new HandleEventCallbackProxy(iBinder);
        }
        return (HandleEventCallbackProxy) queryLocalInterface;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public LKBasePluginResult dispatchEventToAppProcess(LKEvent lKEvent, long j) {
        return this.base.dispatchEventToAppProcess(lKEvent, j);
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
    public void onFail(int i, String str) {
        this.base.onFail(i, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        LKEvent lKEvent;
        if (i == 1) {
            parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            if (parcel.readInt() != 0) {
                lKEvent = LKEvent.CREATOR.createFromParcel(parcel);
            } else {
                lKEvent = null;
            }
            LKBasePluginResult dispatchEventToAppProcess = dispatchEventToAppProcess(lKEvent, parcel.readLong());
            parcel2.writeNoException();
            if (dispatchEventToAppProcess != null) {
                parcel2.writeInt(1);
                dispatchEventToAppProcess.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            onSuccess(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            onFail(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            onLinkTraceId(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback");
            return true;
        }
    }
}
