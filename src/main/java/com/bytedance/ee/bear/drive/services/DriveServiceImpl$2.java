package com.bytedance.ee.bear.drive.services;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class DriveServiceImpl$2 extends BinderAccountChangeCallback.Stub {
    final /* synthetic */ C7189m this$0;

    DriveServiceImpl$2(C7189m mVar) {
        this.this$0 = mVar;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
    public void onChange(AccountService.Account account) {
        C13479a.m54764b("DriveServiceImpl", "accountService#onChange...");
        if (account == null) {
            C13479a.m54758a("DriveServiceImpl", "accountService#onChange() account is null");
            return;
        }
        C13479a.m54764b("DriveServiceImpl", "accountService#onChange():  mUserToken=" + "" + ", account.token=" + "");
        if (!TextUtils.isEmpty(this.this$0.f19306c) && !TextUtils.equals(account.f14591h, this.this$0.f19306c)) {
            this.this$0.mo28172d();
        }
        this.this$0.f19306c = account.f14591h;
    }
}
