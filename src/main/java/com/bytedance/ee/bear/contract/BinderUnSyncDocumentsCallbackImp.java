package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderUnSyncDocumentsCallbackImp extends BinderUnSyncDocumentsCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5094ag.AbstractC5100f mUnSyncDocumentsCallback;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mUnSyncDocumentsCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderUnSyncDocumentsCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5100f
    public void onChange(List<String> list) {
        lazyInit();
        this.mUnSyncDocumentsCallback.onChange(list);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5100f
    public void onRemove(List<String> list) {
        lazyInit();
        this.mUnSyncDocumentsCallback.onRemove(list);
    }

    public BinderUnSyncDocumentsCallbackImp(AbstractC5094ag.AbstractC5100f fVar, Application application) {
        this.mUnSyncDocumentsCallback = fVar;
        this.mApplication = application;
    }
}
