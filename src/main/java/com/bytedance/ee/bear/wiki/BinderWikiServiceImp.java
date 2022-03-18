package com.bytedance.ee.bear.wiki;

import android.app.Application;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.bear.wiki.BinderWikiService;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderWikiServiceImp extends BinderWikiService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC11955g mWikiService;

    @Override // com.bytedance.ee.bear.wiki.BinderWikiService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.wiki.BinderWikiService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.wiki.BinderWikiService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mWikiService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderWikiServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11955g
    public AbstractC68307f<Boolean> cleanWikiDataFlowable(long j) {
        lazyInit();
        return this.mWikiService.cleanWikiDataFlowable(j);
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11955g
    public void updateWikiTitle(OfflineRenameData offlineRenameData) {
        lazyInit();
        this.mWikiService.updateWikiTitle(offlineRenameData);
    }

    public BinderWikiServiceImp(AbstractC11955g gVar, Application application) {
        this.mWikiService = gVar;
        this.mApplication = application;
    }
}
