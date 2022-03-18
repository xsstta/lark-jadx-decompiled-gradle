package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class ConfigChangeCallbackLinker implements IInterface, AbstractC10957d {
    private BinderConfigChangeCallback mBinderConfigChangeCallback;
    private AbstractC5166e mConfigChangeCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderConfigChangeCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mConfigChangeCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mConfigChangeCallbackImp.init(application);
    }

    public ConfigChangeCallbackLinker(AbstractC5166e eVar, Application application) {
        this.mConfigChangeCallbackImp = eVar;
        this.mBinderConfigChangeCallback = new BinderConfigChangeCallbackImp(this.mConfigChangeCallbackImp, application);
    }
}
