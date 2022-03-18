package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IDeleteDocCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIDeleteDocCallback mBinderIDeleteDocCallback;
    private AbstractC5175h mIDeleteDocCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIDeleteDocCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIDeleteDocCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIDeleteDocCallbackImp.init(application);
    }

    public IDeleteDocCallbackLinker(AbstractC5175h hVar, Application application) {
        this.mIDeleteDocCallbackImp = hVar;
        this.mBinderIDeleteDocCallback = new BinderIDeleteDocCallbackImp(this.mIDeleteDocCallbackImp, application);
    }
}
