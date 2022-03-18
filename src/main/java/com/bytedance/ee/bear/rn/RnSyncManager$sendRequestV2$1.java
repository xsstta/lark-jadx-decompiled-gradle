package com.bytedance.ee.bear.rn;

import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.jsbridge.v2.RNBridgeV2;
import com.bytedance.ee.bear.jsbridge.v2.RNCallback;
import com.bytedance.ee.bear.jsbridge.v2.RNMessage;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/rn/RnSyncManager$sendRequestV2$1", "Lcom/bytedance/ee/bear/contract/BinderIRnConnectStatus$Stub;", "connected", "", "disconnect", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RnSyncManager$sendRequestV2$1 extends BinderIRnConnectStatus.Stub {
    final /* synthetic */ RNCallback $callback;
    final /* synthetic */ RNMessage $message;

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void disconnect() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void connected() {
        RnSyncManager.f28587a.mo40383b(this);
        RnSyncManager iVar = RnSyncManager.f28587a;
        RNBridgeV2 aVar = RnSyncManager.f28598l;
        if (aVar != null) {
            aVar.mo30855a(this.$message, this.$callback);
        }
    }

    RnSyncManager$sendRequestV2$1(RNMessage rNMessage, RNCallback bVar) {
        this.$message = rNMessage;
        this.$callback = bVar;
    }
}
