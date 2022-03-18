package com.larksuite.component.openplatform.core.container.crossprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.container.crossprocess.impl.HostProcessHandleEventImpl;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import java.util.List;

public final class IHostProcessHandleEventStub extends Binder implements IInterface, IHostProcessHandleEvent {
    public final HostProcessHandleEventImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public List<IHostProcessHandleEvent.IPCPluginConfig> getAppEnvPluginConfigs() {
        return this.base.getAppEnvPluginConfigs();
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public List<IHostProcessHandleEvent.IPCPluginConfig> getBizEnvPluginConfigsForWebApp() {
        return this.base.getBizEnvPluginConfigsForWebApp();
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnDestroy(String str) {
        this.base.notifyAppContainerOnDestroy(str);
    }

    public IHostProcessHandleEventStub(Context context) {
        this.base = new HostProcessHandleEventImpl(context);
        attachInterface(this, "com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnCreate(String str, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        this.base.notifyAppContainerOnCreate(str, lKOpenApiAccessConfig);
    }

    public static IHostProcessHandleEventProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IHostProcessHandleEventProxy)) {
            return new IHostProcessHandleEventProxy(context, iBinder);
        }
        return (IHostProcessHandleEventProxy) queryLocalInterface;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public LKBasePluginResult dispatchEventToHostProcess(String str, LKEvent lKEvent, IHostProcessHandleEvent.HandleEventCallback handleEventCallback, long j) {
        return this.base.dispatchEventToHostProcess(str, lKEvent, handleEventCallback, j);
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void sendAsyncHandleResultToHostProcess(long j, String str, int i, String str2) {
        this.base.sendAsyncHandleResultToHostProcess(j, str, i, str2);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1598968902) {
            LKOpenApiAccessConfig lKOpenApiAccessConfig = null;
            LKEvent lKEvent = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        lKOpenApiAccessConfig = LKOpenApiAccessConfig.CREATOR.createFromParcel(parcel);
                    }
                    notifyAppContainerOnCreate(readString, lKOpenApiAccessConfig);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
                    notifyAppContainerOnDestroy(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        lKEvent = LKEvent.CREATOR.createFromParcel(parcel);
                    }
                    LKBasePluginResult dispatchEventToHostProcess = dispatchEventToHostProcess(readString2, lKEvent, HandleEventCallbackStub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    if (dispatchEventToHostProcess != null) {
                        parcel2.writeInt(1);
                        dispatchEventToHostProcess.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
                    sendAsyncHandleResultToHostProcess(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
                    List<IHostProcessHandleEvent.IPCPluginConfig> appEnvPluginConfigs = getAppEnvPluginConfigs();
                    parcel2.writeNoException();
                    parcel2.writeList(appEnvPluginConfigs);
                    return true;
                case 6:
                    parcel.enforceInterface("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
                    List<IHostProcessHandleEvent.IPCPluginConfig> bizEnvPluginConfigsForWebApp = getBizEnvPluginConfigsForWebApp();
                    parcel2.writeNoException();
                    parcel2.writeList(bizEnvPluginConfigsForWebApp);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
            return true;
        }
    }
}
