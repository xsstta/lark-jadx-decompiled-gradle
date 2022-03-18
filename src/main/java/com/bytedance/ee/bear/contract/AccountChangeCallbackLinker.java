package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class AccountChangeCallbackLinker implements IInterface, AbstractC10957d {
    private AbstractC5078a mAccountChangeCallbackImp;
    private BinderAccountChangeCallback mBinderAccountChangeCallback;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderAccountChangeCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mAccountChangeCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mAccountChangeCallbackImp.init(application);
    }

    public AccountChangeCallbackLinker(AbstractC5078a aVar, Application application) {
        this.mAccountChangeCallbackImp = aVar;
        this.mBinderAccountChangeCallback = new BinderAccountChangeCallbackImp(this.mAccountChangeCallbackImp, application);
    }
}
