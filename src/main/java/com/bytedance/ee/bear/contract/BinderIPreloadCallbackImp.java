package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIPreloadCallbackImp extends BinderIPreloadCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5094ag.AbstractC5096b mIPreloadCallback;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIPreloadCallback.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIPreloadCallback.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIPreloadCallback.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIPreloadCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIPreloadCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadFail(String str) {
        lazyInit();
        this.mIPreloadCallback.onPreloadFail(str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadStart(String str) {
        lazyInit();
        this.mIPreloadCallback.onPreloadStart(str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadSuccess(String str) {
        lazyInit();
        this.mIPreloadCallback.onPreloadSuccess(str);
    }

    public BinderIPreloadCallbackImp(AbstractC5094ag.AbstractC5096b bVar, Application application) {
        this.mIPreloadCallback = bVar;
        this.mApplication = application;
    }
}
