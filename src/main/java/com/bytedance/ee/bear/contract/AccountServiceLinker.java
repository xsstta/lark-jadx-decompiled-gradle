package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class AccountServiceLinker implements IInterface, AbstractC10957d {
    private AbstractC5114b mAccountServiceImp;
    private BinderAccountService mBinderAccountService;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderAccountService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mAccountServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mAccountServiceImp.init(application);
    }

    public AccountServiceLinker(AbstractC5114b bVar, Application application) {
        this.mAccountServiceImp = bVar;
        this.mBinderAccountService = new BinderAccountServiceImp(this.mAccountServiceImp, application);
    }
}
