package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderOnRequestCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderOnRequestCallbackImp extends BinderOnRequestCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private am.AbstractC5113f mOnRequestCallback;

    @Override // com.bytedance.ee.bear.contract.BinderOnRequestCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderOnRequestCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderOnRequestCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5113f
    public void onSuccess() {
        lazyInit();
        this.mOnRequestCallback.onSuccess();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mOnRequestCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderOnRequestCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderOnRequestCallbackImp(am.AbstractC5113f fVar, Application application) {
        this.mOnRequestCallback = fVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5113f
    public void onFail(int i, String str) {
        lazyInit();
        this.mOnRequestCallback.onFail(i, str);
    }
}
