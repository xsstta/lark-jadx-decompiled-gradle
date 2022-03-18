package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class PluginServiceLinker implements IInterface, AbstractC10957d {
    private BinderPluginService mBinderPluginService;
    private AbstractC7180h mPluginServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderPluginService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mPluginServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mPluginServiceImp.init(application);
    }

    public PluginServiceLinker(AbstractC7180h hVar, Application application) {
        this.mPluginServiceImp = hVar;
        this.mBinderPluginService = new BinderPluginServiceImp(this.mPluginServiceImp, application);
    }
}
