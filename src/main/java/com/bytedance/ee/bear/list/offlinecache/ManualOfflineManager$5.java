package com.bytedance.ee.bear.list.offlinecache;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class ManualOfflineManager$5 extends AccountService.AccountChangeUICallback {
    final /* synthetic */ C8640a this$0;

    ManualOfflineManager$5(C8640a aVar) {
        this.this$0 = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        if (account != null && account.mo19677a()) {
            if (TextUtils.isEmpty(this.this$0.f23412d) || !TextUtils.equals(account.f14584a, this.this$0.f23412d)) {
                this.this$0.f23412d = account.f14584a;
                this.this$0.mo33628e();
                this.this$0.mo33622b();
                C13479a.m54764b("OfflineCacheManager", "registerAccountCallback()...onChanged, account = " + account);
                return;
            }
            C13479a.m54764b("OfflineCacheManager", "registerAccountCallback()...onChanged, account is same");
        }
    }
}
