package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class OnRequestCallbackLinker implements IInterface, AbstractC10957d {
    private BinderOnRequestCallback mBinderOnRequestCallback;
    private AbstractC5229t mOnRequestCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderOnRequestCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mOnRequestCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mOnRequestCallbackImp.init(application);
    }

    public OnRequestCallbackLinker(AbstractC5229t tVar, Application application) {
        this.mOnRequestCallbackImp = tVar;
        this.mBinderOnRequestCallback = new BinderOnRequestCallbackImp(this.mOnRequestCallbackImp, application);
    }
}
