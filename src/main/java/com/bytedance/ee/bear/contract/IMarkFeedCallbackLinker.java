package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IMarkFeedCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIMarkFeedCallback mBinderIMarkFeedCallback;
    private AbstractC5193l mIMarkFeedCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIMarkFeedCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIMarkFeedCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIMarkFeedCallbackImp.init(application);
    }

    public IMarkFeedCallbackLinker(AbstractC5193l lVar, Application application) {
        this.mIMarkFeedCallbackImp = lVar;
        this.mBinderIMarkFeedCallback = new BinderIMarkFeedCallbackImp(this.mIMarkFeedCallbackImp, application);
    }
}
