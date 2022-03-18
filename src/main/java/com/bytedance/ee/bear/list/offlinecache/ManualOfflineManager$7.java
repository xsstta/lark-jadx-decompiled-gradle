package com.bytedance.ee.bear.list.offlinecache;

import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class ManualOfflineManager$7 extends BinderIRnConnectStatus.Stub {
    final /* synthetic */ C8640a this$0;

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void disconnect() {
        C13479a.m54764b("OfflineCacheManager", "registerRNConnectCallback()...disconnect");
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5097c
    public void connected() {
        C13479a.m54764b("OfflineCacheManager", " registerRNConnectCallback()...connected");
        this.this$0.mo33609a(0);
    }

    ManualOfflineManager$7(C8640a aVar) {
        this.this$0 = aVar;
    }
}
