package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class LocalLoginCallbackLinker implements IInterface, AbstractC10957d {
    private BinderLocalLoginCallback mBinderLocalLoginCallback;
    private AbstractC5228s mLocalLoginCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderLocalLoginCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mLocalLoginCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mLocalLoginCallbackImp.init(application);
    }

    public LocalLoginCallbackLinker(AbstractC5228s sVar, Application application) {
        this.mLocalLoginCallbackImp = sVar;
        this.mBinderLocalLoginCallback = new BinderLocalLoginCallbackImp(this.mLocalLoginCallbackImp, application);
    }
}
