package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderVCDocDataService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderVCDocDataServiceImp extends BinderVCDocDataService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private as mVCDocDataService;

    @Override // com.bytedance.ee.bear.contract.BinderVCDocDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderVCDocDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderVCDocDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void clearOffMemCache() {
        lazyInit();
        this.mVCDocDataService.clearOffMemCache();
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void clearOfflineDB() {
        lazyInit();
        this.mVCDocDataService.clearOfflineDB();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mVCDocDataService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderVCDocDataServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void delDocs(String str) {
        lazyInit();
        this.mVCDocDataService.delDocs(str);
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void delDocsList(List<String> list) {
        lazyInit();
        this.mVCDocDataService.delDocsList(list);
    }

    public BinderVCDocDataServiceImp(as asVar, Application application) {
        this.mVCDocDataService = asVar;
        this.mApplication = application;
    }
}
