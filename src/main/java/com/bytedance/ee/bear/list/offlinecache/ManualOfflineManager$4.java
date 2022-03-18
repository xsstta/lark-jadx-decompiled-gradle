package com.bytedance.ee.bear.list.offlinecache;

import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;

/* access modifiers changed from: package-private */
public class ManualOfflineManager$4 extends BinderIProcessStart.Stub {
    final /* synthetic */ C8640a this$0;

    @Override // com.bytedance.ee.bear.contract.ak.AbstractC5107c
    public void onProcessStart() {
        C13479a.m54764b("OfflineCacheManager", "onProcessStart()...");
        C13748k.m55735c(this.this$0.f23417i);
        C13748k.m55733a(this.this$0.f23417i, 5000);
    }

    ManualOfflineManager$4(C8640a aVar) {
        this.this$0 = aVar;
    }
}
