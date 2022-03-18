package com.bytedance.ee.bear.middleground.drive;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/drive/Drive$registerAccountChangeCallBack$1", "Lcom/bytedance/ee/bear/contract/AccountService$AccountChangeUICallback;", "onChangeInUi", "", "src", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "middleground-drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class Drive$registerAccountChangeCallBack$1 extends AccountService.AccountChangeUICallback {
    final /* synthetic */ Runnable $callback;
    final /* synthetic */ String $path;
    final /* synthetic */ Drive this$0;

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        if (account != null && account.mo19677a()) {
            C13479a.m54775e("Middleground_Drive_DriveSDK", "account change callback ");
            this.this$0.mo35608a(this.$callback, this.$path, account);
        }
    }

    Drive$registerAccountChangeCallBack$1(Drive aVar, Runnable runnable, String str) {
        this.this$0 = aVar;
        this.$callback = runnable;
        this.$path = str;
    }
}
