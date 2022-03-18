package com.ss.android.lark.ug.dyflow.common;

import android.os.IBinder;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/FlowStepDelegateSafeWrapper;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate;", "binder", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "stepDelegate", "asBinder", "getFlowParam", "", "key", "getStepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "handleSlotAction", "", "slotName", "mustLink", "notifyExtExit", "", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "runStep", "uri", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FlowStepDelegateSafeWrapper implements IFlowStepDelegate {
    public static final Companion Companion = new Companion(null);
    private final IBinder binder;
    private IFlowStepDelegate stepDelegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/FlowStepDelegateSafeWrapper$Companion;", "", "()V", "TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.FlowStepDelegateSafeWrapper$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IBinder asBinder() {
        return this.binder;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public FlowStepData getStepData() {
        try {
            return this.stepDelegate.getStepData();
        } catch (RemoteException e) {
            Log.m165384e("DyFlow", "getStepData remoteException", e);
            return null;
        }
    }

    public FlowStepDelegateSafeWrapper(IBinder iBinder) {
        Intrinsics.checkParameterIsNotNull(iBinder, "binder");
        this.binder = iBinder;
        IFlowStepDelegate asInterface = IFlowStepDelegate.Stub.asInterface(iBinder);
        Intrinsics.checkExpressionValueIsNotNull(asInterface, "IFlowStepDelegate.Stub.asInterface(binder)");
        this.stepDelegate = asInterface;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public String getFlowParam(String str) {
        try {
            return this.stepDelegate.getFlowParam(str);
        } catch (RemoteException e) {
            Log.m165384e("DyFlow", "getFlowParam remoteException", e);
            return null;
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public boolean runStep(String str) {
        try {
            return this.stepDelegate.runStep(str);
        } catch (RemoteException e) {
            Log.m165384e("DyFlow", "runStep remoteException", e);
            return false;
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public boolean handleSlotAction(String str, boolean z) {
        try {
            return this.stepDelegate.handleSlotAction(str, z);
        } catch (RemoteException e) {
            Log.m165384e("DyFlow", "handleSlotAction remoteException", e);
            return false;
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public void notifyExtExit(int i, String str) {
        try {
            this.stepDelegate.notifyExtExit(i, str);
        } catch (RemoteException e) {
            Log.m165384e("DyFlow", "notifyExtExit remoteException", e);
            Unit unit = Unit.INSTANCE;
        }
    }
}
