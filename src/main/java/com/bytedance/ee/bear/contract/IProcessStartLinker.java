package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IProcessStartLinker implements IInterface, AbstractC10957d {
    private BinderIProcessStart mBinderIProcessStart;
    private AbstractC5200n mIProcessStartImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIProcessStart.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIProcessStartImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIProcessStartImp.init(application);
    }

    public IProcessStartLinker(AbstractC5200n nVar, Application application) {
        this.mIProcessStartImp = nVar;
        this.mBinderIProcessStart = new BinderIProcessStartImp(this.mIProcessStartImp, application);
    }
}
