package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl;

import android.app.Application;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderWikiDataServiceImp extends BinderWikiDataService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC12448b mWikiDataService;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService.Stub
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12448b
    public List<String> getCachedRelationSpaceIds() {
        lazyInit();
        return this.mWikiDataService.getCachedRelationSpaceIds();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mWikiDataService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderWikiDataServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderWikiDataServiceImp(AbstractC12448b bVar, Application application) {
        this.mWikiDataService = bVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12448b
    public Boolean isRelationCached(String str, String str2) {
        lazyInit();
        return this.mWikiDataService.isRelationCached(str, str2);
    }
}
