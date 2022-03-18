package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class ISendDataCallbackLinker implements IInterface, AbstractC10957d {
    private BinderISendDataCallback mBinderISendDataCallback;
    private AbstractC5212p mISendDataCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderISendDataCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mISendDataCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mISendDataCallbackImp.init(application);
    }

    public ISendDataCallbackLinker(AbstractC5212p pVar, Application application) {
        this.mISendDataCallbackImp = pVar;
        this.mBinderISendDataCallback = new BinderISendDataCallbackImp(this.mISendDataCallbackImp, application);
    }
}
