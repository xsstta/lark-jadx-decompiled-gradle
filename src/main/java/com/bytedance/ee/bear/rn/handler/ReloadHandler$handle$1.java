package com.bytedance.ee.bear.rn.handler;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.rn.RnSyncManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/rn/handler/ReloadHandler$handle$1", "Lcom/bytedance/ee/bear/contract/BinderIRnConnectStatus$Stub;", "connected", "", "disconnect", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ReloadHandler$handle$1 extends BinderIRnConnectStatus.Stub {
    final /* synthetic */ AbstractC7947h $callback;

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void connected() {
        RnSyncManager.f28587a.mo40383b(this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "code", (Object) 0);
        this.$callback.mo17188a(jSONObject);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void disconnect() {
        RnSyncManager.f28587a.mo40383b(this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "code", (Object) 1);
        this.$callback.mo17188a(jSONObject);
    }

    ReloadHandler$handle$1(AbstractC7947h hVar) {
        this.$callback = hVar;
    }
}
