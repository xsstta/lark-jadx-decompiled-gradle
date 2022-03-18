package com.bytedance.ee.bear.document.offline.sync;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class PreloadManager$1 extends AccountService.AccountChangeUICallback {
    final /* synthetic */ C6002l this$0;

    PreloadManager$1(C6002l lVar) {
        this.this$0 = lVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        C13479a.m54772d("PreloadManager", "onChanged().... account = " + account);
        this.this$0.mo24261a(account);
    }
}
