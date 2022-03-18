package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IPreloadCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIPreloadCallback mBinderIPreloadCallback;
    private AbstractC5199m mIPreloadCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIPreloadCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIPreloadCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIPreloadCallbackImp.init(application);
    }

    public IPreloadCallbackLinker(AbstractC5199m mVar, Application application) {
        this.mIPreloadCallbackImp = mVar;
        this.mBinderIPreloadCallback = new BinderIPreloadCallbackImp(this.mIPreloadCallbackImp, application);
    }
}
