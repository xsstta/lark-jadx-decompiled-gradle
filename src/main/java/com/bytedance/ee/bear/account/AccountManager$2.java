package com.bytedance.ee.bear.account;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class AccountManager$2 extends BinderAccountChangeCallback.Stub {
    final /* synthetic */ C4178d this$0;

    AccountManager$2(C4178d dVar) {
        this.this$0 = dVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
    public void onChange(AccountService.Account account) {
        int i;
        if (account == null || TextUtils.isEmpty(account.f14591h)) {
            i = 0;
        } else {
            i = account.f14591h.hashCode();
        }
        C13479a.m54764b("AccountManager", "LocalAccountServiceImp  onChange : " + account + "   encrypttoken: " + i);
        this.this$0.mo16403b(account);
        this.this$0.mo16398a(account);
    }
}
