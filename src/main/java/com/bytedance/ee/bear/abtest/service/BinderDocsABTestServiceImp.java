package com.bytedance.ee.bear.abtest.service;

import android.app.Application;
import com.bytedance.ee.bear.abtest.service.BinderDocsABTestService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderDocsABTestServiceImp extends BinderDocsABTestService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC4156b mDocsABTestService;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.abtest.service.BinderDocsABTestService.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.abtest.service.BinderDocsABTestService.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.abtest.service.BinderDocsABTestService.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mDocsABTestService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderDocsABTestServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderDocsABTestServiceImp(AbstractC4156b bVar, Application application) {
        this.mDocsABTestService = bVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public Boolean getABTestBooleanValue(String str, boolean z) {
        lazyInit();
        return this.mDocsABTestService.getABTestBooleanValue(str, z);
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public Integer getABTestIntValue(String str, boolean z) {
        lazyInit();
        return this.mDocsABTestService.getABTestIntValue(str, z);
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public String getABTestStringValue(String str, boolean z) {
        lazyInit();
        return this.mDocsABTestService.getABTestStringValue(str, z);
    }
}
