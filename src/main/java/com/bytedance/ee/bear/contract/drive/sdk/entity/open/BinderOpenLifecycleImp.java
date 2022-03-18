package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.app.Application;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderOpenLifecycleImp extends BinderOpenLifecycle.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private BaseOpenEntity.AbstractC5156a mOpenLifecycle;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity.AbstractC5156a
    public void onClose() {
        lazyInit();
        this.mOpenLifecycle.onClose();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mOpenLifecycle;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderOpenLifecycleImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity.AbstractC5156a
    public void onVisibleChange(boolean z) {
        lazyInit();
        this.mOpenLifecycle.onVisibleChange(z);
    }

    public BinderOpenLifecycleImp(BaseOpenEntity.AbstractC5156a aVar, Application application) {
        this.mOpenLifecycle = aVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity.AbstractC5156a
    public void onOpenFinish(int i, String str) {
        lazyInit();
        this.mOpenLifecycle.onOpenFinish(i, str);
    }
}
