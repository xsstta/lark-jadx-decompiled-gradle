package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IPluginUpdateCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIPluginUpdateCallback mBinderIPluginUpdateCallback;
    private AbstractC7178f mIPluginUpdateCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIPluginUpdateCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIPluginUpdateCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIPluginUpdateCallbackImp.init(application);
    }

    public IPluginUpdateCallbackLinker(AbstractC7178f fVar, Application application) {
        this.mIPluginUpdateCallbackImp = fVar;
        this.mBinderIPluginUpdateCallback = new BinderIPluginUpdateCallbackImp(this.mIPluginUpdateCallbackImp, application);
    }
}
