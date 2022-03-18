package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IManualOfflineCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIManualOfflineCallback mBinderIManualOfflineCallback;
    private AbstractC5191j mIManualOfflineCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIManualOfflineCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIManualOfflineCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIManualOfflineCallbackImp.init(application);
    }

    public IManualOfflineCallbackLinker(AbstractC5191j jVar, Application application) {
        this.mIManualOfflineCallbackImp = jVar;
        this.mBinderIManualOfflineCallback = new BinderIManualOfflineCallbackImp(this.mIManualOfflineCallbackImp, application);
    }
}
