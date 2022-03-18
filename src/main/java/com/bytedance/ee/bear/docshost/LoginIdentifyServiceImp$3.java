package com.bytedance.ee.bear.docshost;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/docshost/LoginIdentifyServiceImp$3", "Lcom/bytedance/ee/bear/contract/BinderAccountChangeCallback$Stub;", "onChange", "", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "docs-host-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LoginIdentifyServiceImp$3 extends BinderAccountChangeCallback.Stub {
    final /* synthetic */ LoginIdentifyServiceImp this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    LoginIdentifyServiceImp$3(LoginIdentifyServiceImp eVar) {
        this.this$0 = eVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
    public void onChange(AccountService.Account account) {
        this.this$0.mo22264a(account);
    }
}
