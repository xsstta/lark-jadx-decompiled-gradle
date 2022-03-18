package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.drive.services.BinderPluginService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderPluginServiceImp extends BinderPluginService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7197n mPluginService;

    @Override // com.bytedance.ee.bear.drive.services.BinderPluginService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderPluginService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderPluginService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mPluginService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderPluginServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderPluginServiceImp(AbstractC7197n nVar, Application application) {
        this.mPluginService = nVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n
    public void onPluginUpdate(String str, BinderIPluginUpdateCallback binderIPluginUpdateCallback) {
        lazyInit();
        this.mPluginService.onPluginUpdate(str, binderIPluginUpdateCallback);
    }
}
