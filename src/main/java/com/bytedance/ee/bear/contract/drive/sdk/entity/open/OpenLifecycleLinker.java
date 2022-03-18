package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class OpenLifecycleLinker implements IInterface, AbstractC10957d {
    private BinderOpenLifecycle mBinderOpenLifecycle;
    private AbstractC5165a mOpenLifecycleImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderOpenLifecycle.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mOpenLifecycleImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mOpenLifecycleImp.init(application);
    }

    public OpenLifecycleLinker(AbstractC5165a aVar, Application application) {
        this.mOpenLifecycleImp = aVar;
        this.mBinderOpenLifecycle = new BinderOpenLifecycleImp(this.mOpenLifecycleImp, application);
    }
}
