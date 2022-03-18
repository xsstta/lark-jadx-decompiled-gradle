package com.bytedance.ee.bear.notification;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.notification.AbstractC10323d;

/* access modifiers changed from: package-private */
public class NotificationViewModel$12 extends AccountService.AccountChangeUICallback {
    final /* synthetic */ C10350i this$0;
    final /* synthetic */ AbstractC10323d.AbstractC10324a val$listener;

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        if (account != null && account.mo19677a()) {
            this.val$listener.mo39433a();
        }
    }

    NotificationViewModel$12(C10350i iVar, AbstractC10323d.AbstractC10324a aVar) {
        this.this$0 = iVar;
        this.val$listener = aVar;
    }
}
