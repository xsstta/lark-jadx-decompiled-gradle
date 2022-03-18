package com.bytedance.ee.bear.basesdk.services;

import com.bytedance.ee.bear.contract.AccountService;

/* access modifiers changed from: package-private */
public class RemoteDomainCharacteristicServiceImp$2 extends AccountService.AccountChangeUICallback {
    final /* synthetic */ C4514h this$0;

    RemoteDomainCharacteristicServiceImp$2(C4514h hVar) {
        this.this$0 = hVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        if (account != null && account.mo19677a()) {
            this.this$0.fetchConfig();
        }
    }
}
