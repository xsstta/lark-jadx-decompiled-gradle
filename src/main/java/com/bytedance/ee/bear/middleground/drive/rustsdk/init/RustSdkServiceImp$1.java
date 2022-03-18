package com.bytedance.ee.bear.middleground.drive.rustsdk.init;

import com.bytedance.ee.bear.contract.AccountService;

/* access modifiers changed from: package-private */
public class RustSdkServiceImp$1 extends AccountService.AccountChangeUICallback {
    final /* synthetic */ C9399b this$0;

    RustSdkServiceImp$1(C9399b bVar) {
        this.this$0 = bVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        if (account != null && account.mo19677a()) {
            this.this$0.mo35849a(account);
        }
    }
}
