package com.bytedance.ee.bear.wiki;

import android.app.Application;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.bear.wiki.BinderWikiListDataService;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderWikiListDataServiceImp extends BinderWikiListDataService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC11940d mWikiListDataService;

    @Override // com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public AbstractC68307f<Boolean> cleanWikiRecentListDataFlowable() {
        lazyInit();
        return this.mWikiListDataService.cleanWikiRecentListDataFlowable();
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public AbstractC68307f<ArrayList<WikiDocument>> getRecentWikiFlowable() {
        lazyInit();
        return this.mWikiListDataService.getRecentWikiFlowable();
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public void notifyWikiAdded() {
        lazyInit();
        this.mWikiListDataService.notifyWikiAdded();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mWikiListDataService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderWikiListDataServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public void saveRecentWiki(ArrayList<WikiDocument> arrayList) {
        lazyInit();
        this.mWikiListDataService.saveRecentWiki(arrayList);
    }

    public BinderWikiListDataServiceImp(AbstractC11940d dVar, Application application) {
        this.mWikiListDataService = dVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public void notifyWikiNodeRemoved(String str, String str2) {
        lazyInit();
        this.mWikiListDataService.notifyWikiNodeRemoved(str, str2);
    }
}
