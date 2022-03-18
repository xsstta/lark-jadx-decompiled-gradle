package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderSaveToSpaceCallbackImp extends BinderSaveToSpaceCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5150g.AbstractC5155e mSaveToSpaceCallback;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mSaveToSpaceCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderSaveToSpaceCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5155e
    public void onClick(boolean z) {
        lazyInit();
        this.mSaveToSpaceCallback.onClick(z);
    }

    public BinderSaveToSpaceCallbackImp(AbstractC5150g.AbstractC5155e eVar, Application application) {
        this.mSaveToSpaceCallback = eVar;
        this.mApplication = application;
    }
}
