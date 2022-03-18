package com.larksuite.component.openplatform.core.container.crossprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

public final class IHostProcessHandleEventProxy implements IInterface, IHostProcessHandleEvent {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public List<IHostProcessHandleEvent.IPCPluginConfig> getAppEnvPluginConfigs() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readArrayList;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProcessHandleEventProxy", "call method getAppEnvPluginConfigs throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public List<IHostProcessHandleEvent.IPCPluginConfig> getBizEnvPluginConfigsForWebApp() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readArrayList;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProcessHandleEventProxy", "call method getBizEnvPluginConfigsForWebApp throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnDestroy(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProcessHandleEventProxy", "call method notifyAppContainerOnDestroy throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IHostProcessHandleEventProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnCreate(String str, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
            obtain.writeString(str);
            if (lKOpenApiAccessConfig != null) {
                obtain.writeInt(1);
                lKOpenApiAccessConfig.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProcessHandleEventProxy", "call method notifyAppContainerOnCreate throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void sendAsyncHandleResultToHostProcess(long j, String str, int i, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
            obtain.writeLong(j);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProcessHandleEventProxy", "call method sendAsyncHandleResultToHostProcess throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public LKBasePluginResult dispatchEventToHostProcess(String str, LKEvent lKEvent, IHostProcessHandleEvent.HandleEventCallback handleEventCallback, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        LKBasePluginResult lKBasePluginResult = null;
        try {
            obtain.writeInterfaceToken("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent");
            obtain.writeString(str);
            if (lKEvent != null) {
                obtain.writeInt(1);
                lKEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (handleEventCallback != null) {
                obtain.writeStrongBinder(new HandleEventCallbackStub(handleEventCallback).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            obtain.writeLong(j);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                lKBasePluginResult = LKBasePluginResult.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IHostProcessHandleEventProxy", "call method dispatchEventToHostProcess throw RemoteException", e, true);
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
