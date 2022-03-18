package com.bytedance.ee.bear.leanmode;

import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class LeanModeManager$1 extends BinderIProcessStart.Stub {
    final /* synthetic */ C8133b this$0;
    final /* synthetic */ C10917c val$serviceContext;

    @Override // com.bytedance.ee.bear.contract.ak.AbstractC5107c
    public void onProcessStart() {
        C13479a.m54764b("LeanModeManager", "process restart, sync again, mCCMConfig is null = ");
        C8132a.m32450a().mo31332b(this.val$serviceContext);
    }

    LeanModeManager$1(C8133b bVar, C10917c cVar) {
        this.this$0 = bVar;
        this.val$serviceContext = cVar;
    }
}
