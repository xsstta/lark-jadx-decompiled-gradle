package com.bytedance.ee.bear.basesdk.business.comment;

import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.rn.RnSyncManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/basesdk/business/comment/CommentSdk$initRn$1", "Lcom/bytedance/ee/bear/contract/BinderIRnConnectStatus$Stub;", "connected", "", "disconnect", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommentSdk$initRn$1 extends BinderIRnConnectStatus.Stub {
    final /* synthetic */ CommentSdk this$0;

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void disconnect() {
        RnSyncManager.f28587a.mo40383b(this);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void connected() {
        Runnable b = this.this$0.mo17199b();
        if (b != null) {
            b.run();
        }
        RnSyncManager.f28587a.mo40383b(this);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CommentSdk$initRn$1(CommentSdk bVar) {
        this.this$0 = bVar;
    }
}
