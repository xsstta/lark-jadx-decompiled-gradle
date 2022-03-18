package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderBackgroundSyncDocumentsCallbackImp extends BinderBackgroundSyncDocumentsCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5094ag.AbstractC5095a mBackgroundSyncDocumentsCallback;

    @Override // com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mBackgroundSyncDocumentsCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderBackgroundSyncDocumentsCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5095a
    public void onChange(OfflineDoc offlineDoc) {
        lazyInit();
        this.mBackgroundSyncDocumentsCallback.onChange(offlineDoc);
    }

    public BinderBackgroundSyncDocumentsCallbackImp(AbstractC5094ag.AbstractC5095a aVar, Application application) {
        this.mBackgroundSyncDocumentsCallback = aVar;
        this.mApplication = application;
    }
}
