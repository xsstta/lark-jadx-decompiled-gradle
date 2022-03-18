package com.bytedance.ee.bear.document.offline.sync.sync;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;

/* access modifiers changed from: package-private */
public class SyncOfflineDataManager$3 extends BinderAccountChangeCallback.Stub {
    final /* synthetic */ C6027a this$0;

    public /* synthetic */ void lambda$onChange$0$SyncOfflineDataManager$3() {
        this.this$0.f16880d.mo5925a(this.this$0.f16883g);
    }

    SyncOfflineDataManager$3(C6027a aVar) {
        this.this$0 = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
    public void onChange(AccountService.Account account) {
        if (account != null && this.this$0.f16883g != null) {
            C13479a.m54772d("SyncOfflineDataManager", "valid account changes");
            this.this$0.f16880d = C5955d.m24025b().mo24096d();
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$SyncOfflineDataManager$3$gMCHebJs1J7LZ99lmPnHgFRrw5I */

                public final void run() {
                    SyncOfflineDataManager$3.this.lambda$onChange$0$SyncOfflineDataManager$3();
                }
            });
        }
    }
}
