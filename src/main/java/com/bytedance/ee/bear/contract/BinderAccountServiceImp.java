package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountService;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.config.LoginInfo;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderAccountServiceImp extends BinderAccountService.Stub {
    private AccountService mAccountService;
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);

    @Override // com.bytedance.ee.bear.contract.BinderAccountService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderAccountService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderAccountService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<AccountService.Account> findLoginUser() {
        lazyInit();
        return this.mAccountService.findLoginUser();
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> logoutFlow() {
        lazyInit();
        return this.mAccountService.logoutFlow();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mAccountService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderAccountServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> checkAndLogin(String str) {
        lazyInit();
        return this.mAccountService.checkAndLogin(str);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> checkLoginInfo(LoginInfo loginInfo) {
        lazyInit();
        return this.mAccountService.checkLoginInfo(loginInfo);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> loginFlow(String str) {
        lazyInit();
        return this.mAccountService.loginFlow(str);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> notifyConfigChange(DocDynamicConfig docDynamicConfig) {
        lazyInit();
        return this.mAccountService.notifyConfigChange(docDynamicConfig);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public void registerChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback) {
        lazyInit();
        this.mAccountService.registerChangeCallback(binderAccountChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public void unregisterChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback) {
        lazyInit();
        this.mAccountService.unregisterChangeCallback(binderAccountChangeCallback);
    }

    public BinderAccountServiceImp(AccountService accountService, Application application) {
        this.mAccountService = accountService;
        this.mApplication = application;
    }
}
