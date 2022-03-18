package com.ss.android.lark.littleapp.mains;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.api.diagnose.entity.DumpConfig;

public final class LittleAppProxyProxy implements IInterface, LittleAppProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.littleapp.mains.LittleAppProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getDeviceId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method getDeviceId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public int getEnvType() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method getEnvType throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getMinaBaseUrlForGadget() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method getMinaBaseUrlForGadget throw RemoteException", e, true);
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
    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getMinaBaseUrlForWebApp() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method getMinaBaseUrlForWebApp throw RemoteException", e, true);
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
    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getSession() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method getSession throw RemoteException", e, true);
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
    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public long getServerTime() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            long readLong = obtain2.readLong();
            obtain2.recycle();
            obtain.recycle();
            return readLong;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method getServerTime throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return 0;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean inspectModeIsOpen() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method inspectModeIsOpen throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean isLoginLarkEnv() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            this.mRemote.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method isLoginLarkEnv throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean brandApplicationCanDebug(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            obtain.writeString(str);
            this.mRemote.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method brandApplicationCanDebug throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean canOpen(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            obtain.writeString(str);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method canOpen throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean canOpenCloudFile(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method canOpenCloudFile throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public CrossProcessDataEntity handleProcessSyncCall(CrossProcessCallEntity crossProcessCallEntity) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        CrossProcessDataEntity crossProcessDataEntity = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            if (crossProcessCallEntity != null) {
                obtain.writeInt(1);
                crossProcessCallEntity.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                crossProcessDataEntity = CrossProcessDataEntity.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method handleProcessSyncCall throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return crossProcessDataEntity;
    }

    public LittleAppProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public Bundle applyDumpInfo(String str, DumpConfig dumpConfig) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        Bundle bundle = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            obtain.writeString(str);
            if (dumpConfig != null) {
                obtain.writeInt(1);
                dumpConfig.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method applyDumpInfo throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return bundle;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public MessageTriggerInfo getMessagesByCode(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        MessageTriggerInfo messageTriggerInfo = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                messageTriggerInfo = MessageTriggerInfo.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method getMessagesByCode throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return messageTriggerInfo;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public void handleProcessAsyncCall(CrossProcessCallEntity crossProcessCallEntity, LittleAppProxy.AbstractC41394a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            if (crossProcessCallEntity != null) {
                obtain.writeInt(1);
                crossProcessCallEntity.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new IhostIpcCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method handleProcessAsyncCall throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public void startChatWindowActivityByChatterId(String str, String str2, boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("LittleAppProxyProxy", "call method startChatWindowActivityByChatterId throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
