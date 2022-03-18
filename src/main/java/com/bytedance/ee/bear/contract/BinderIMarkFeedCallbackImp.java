package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderIMarkFeedCallback;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIMarkFeedCallbackImp extends BinderIMarkFeedCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private ak.AbstractC5106b mIMarkFeedCallback;

    @Override // com.bytedance.ee.bear.contract.BinderIMarkFeedCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderIMarkFeedCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderIMarkFeedCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIMarkFeedCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIMarkFeedCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak.AbstractC5106b
    public void onSuccess(String str) {
        lazyInit();
        this.mIMarkFeedCallback.onSuccess(str);
    }

    public BinderIMarkFeedCallbackImp(ak.AbstractC5106b bVar, Application application) {
        this.mIMarkFeedCallback = bVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.ak.AbstractC5106b
    public void onFail(int i, String str) {
        lazyInit();
        this.mIMarkFeedCallback.onFail(i, str);
    }
}
