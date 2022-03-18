package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class HostServiceLinker implements IInterface, AbstractC10957d {
    private BinderHostService mBinderHostService;
    private AbstractC5173g mHostServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderHostService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mHostServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mHostServiceImp.init(application);
    }

    public HostServiceLinker(AbstractC5173g gVar, Application application) {
        this.mHostServiceImp = gVar;
        this.mBinderHostService = new BinderHostServiceImp(this.mHostServiceImp, application);
    }
}
