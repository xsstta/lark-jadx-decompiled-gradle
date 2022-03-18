package com.ss.android.lark.littleapp.mains;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.littleapp.manis.LittleAppProxyImpl;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.api.diagnose.entity.DumpConfig;

public final class LittleAppProxyStub extends Binder implements IInterface, LittleAppProxy {
    public final LittleAppProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getDeviceId() {
        return this.base.getDeviceId();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public int getEnvType() {
        return this.base.getEnvType();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getMinaBaseUrlForGadget() {
        return this.base.getMinaBaseUrlForGadget();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getMinaBaseUrlForWebApp() {
        return this.base.getMinaBaseUrlForWebApp();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public long getServerTime() {
        return this.base.getServerTime();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getSession() {
        return this.base.getSession();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean inspectModeIsOpen() {
        return this.base.inspectModeIsOpen();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean isLoginLarkEnv() {
        return this.base.isLoginLarkEnv();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean brandApplicationCanDebug(String str) {
        return this.base.brandApplicationCanDebug(str);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean canOpen(String str) {
        return this.base.canOpen(str);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean canOpenCloudFile(String str) {
        return this.base.canOpenCloudFile(str);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public CrossProcessDataEntity handleProcessSyncCall(CrossProcessCallEntity crossProcessCallEntity) {
        return this.base.handleProcessSyncCall(crossProcessCallEntity);
    }

    public LittleAppProxyStub(Context context) {
        this.base = new LittleAppProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.littleapp.mains.LittleAppProxy");
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public Bundle applyDumpInfo(String str, DumpConfig dumpConfig) {
        return this.base.applyDumpInfo(str, dumpConfig);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public MessageTriggerInfo getMessagesByCode(String str, String str2) {
        return this.base.getMessagesByCode(str, str2);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public void handleProcessAsyncCall(CrossProcessCallEntity crossProcessCallEntity, LittleAppProxy.AbstractC41394a aVar) {
        this.base.handleProcessAsyncCall(crossProcessCallEntity, aVar);
    }

    public static LittleAppProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof LittleAppProxyProxy)) {
            return new LittleAppProxyProxy(context, iBinder);
        }
        return (LittleAppProxyProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public void startChatWindowActivityByChatterId(String str, String str2, boolean z) {
        this.base.startChatWindowActivityByChatterId(str, str2, z);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1598968902) {
            DumpConfig dumpConfig = null;
            CrossProcessCallEntity crossProcessCallEntity = null;
            CrossProcessCallEntity crossProcessCallEntity2 = null;
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        dumpConfig = DumpConfig.CREATOR.createFromParcel(parcel);
                    }
                    Bundle applyDumpInfo = applyDumpInfo(readString, dumpConfig);
                    parcel2.writeNoException();
                    if (applyDumpInfo != null) {
                        parcel2.writeInt(1);
                        applyDumpInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    boolean canOpenCloudFile = canOpenCloudFile(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(canOpenCloudFile ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    boolean canOpen = canOpen(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(canOpen ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    String session = getSession();
                    parcel2.writeNoException();
                    parcel2.writeString(session);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    String minaBaseUrlForGadget = getMinaBaseUrlForGadget();
                    parcel2.writeNoException();
                    parcel2.writeString(minaBaseUrlForGadget);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    String minaBaseUrlForWebApp = getMinaBaseUrlForWebApp();
                    parcel2.writeNoException();
                    parcel2.writeString(minaBaseUrlForWebApp);
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    String deviceId = getDeviceId();
                    parcel2.writeNoException();
                    parcel2.writeString(deviceId);
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    boolean isLoginLarkEnv = isLoginLarkEnv();
                    parcel2.writeNoException();
                    parcel2.writeInt(isLoginLarkEnv ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    int envType = getEnvType();
                    parcel2.writeNoException();
                    parcel2.writeInt(envType);
                    return true;
                case 10:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    long serverTime = getServerTime();
                    parcel2.writeNoException();
                    parcel2.writeLong(serverTime);
                    return true;
                case 11:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    boolean brandApplicationCanDebug = brandApplicationCanDebug(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(brandApplicationCanDebug ? 1 : 0);
                    return true;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    boolean inspectModeIsOpen = inspectModeIsOpen();
                    parcel2.writeNoException();
                    parcel2.writeInt(inspectModeIsOpen ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    startChatWindowActivityByChatterId(readString2, readString3, z);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    if (parcel.readInt() != 0) {
                        crossProcessCallEntity2 = CrossProcessCallEntity.CREATOR.createFromParcel(parcel);
                    }
                    CrossProcessDataEntity handleProcessSyncCall = handleProcessSyncCall(crossProcessCallEntity2);
                    parcel2.writeNoException();
                    if (handleProcessSyncCall != null) {
                        parcel2.writeInt(1);
                        handleProcessSyncCall.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    if (parcel.readInt() != 0) {
                        crossProcessCallEntity = CrossProcessCallEntity.CREATOR.createFromParcel(parcel);
                    }
                    handleProcessAsyncCall(crossProcessCallEntity, IhostIpcCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.ss.android.lark.littleapp.mains.LittleAppProxy");
                    MessageTriggerInfo messagesByCode = getMessagesByCode(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (messagesByCode != null) {
                        parcel2.writeInt(1);
                        messagesByCode.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.littleapp.mains.LittleAppProxy");
            return true;
        }
    }
}
