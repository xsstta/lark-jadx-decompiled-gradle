package com.bytedance.ee.bear.onboarding;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import org.koin.java.KoinJavaComponent;

class OnBoardingManager$1 extends AccountService.AccountChangeUICallback {
    OnBoardingManager$1() {
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        if (account != null) {
            ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39509a(account.f14591h, account.f14584a);
        }
    }
}
