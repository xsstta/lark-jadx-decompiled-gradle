package com.bytedance.ee.bear.rn;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/rn/RnSyncManager$init$1", "Lcom/bytedance/ee/bear/contract/BinderAccountChangeCallback$Stub;", "onChange", "", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RnSyncManager$init$1 extends BinderAccountChangeCallback.Stub {
    RnSyncManager$init$1() {
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
    public void onChange(AccountService.Account account) {
        if (account != null && account.mo19677a()) {
            RnSyncManager iVar = RnSyncManager.f28587a;
            RnSyncManager.f28595i = account;
            RnSyncManager iVar2 = RnSyncManager.f28587a;
            if (!TextUtils.equals(RnSyncManager.f28605s, account.f14591h)) {
                RnSyncManager iVar3 = RnSyncManager.f28587a;
                if (RnSyncManager.f28596j != null) {
                    C13479a.m54764b("RnSyncManager", " account change");
                    RnSyncManager.f28587a.mo40396m();
                    RnSyncManager.f28587a.mo40394k();
                    RnSyncManager.f28587a.mo40393j();
                    RnSyncManager.f28587a.mo40395l();
                }
                RnSyncManager iVar4 = RnSyncManager.f28587a;
                RnSyncManager.f28605s = account.f14591h;
            }
        }
    }
}
