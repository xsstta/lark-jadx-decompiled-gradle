package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderBadgeService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderBadgeServiceImp extends BinderBadgeService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5080aa mBadgeService;

    @Override // com.bytedance.ee.bear.contract.BinderBadgeService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderBadgeService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderBadgeService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mBadgeService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderBadgeServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void remove(String str) {
        lazyInit();
        this.mBadgeService.remove(str);
    }

    public BinderBadgeServiceImp(AbstractC5080aa aaVar, Application application) {
        this.mBadgeService = aaVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void read(String str, int i, List<String> list) {
        lazyInit();
        this.mBadgeService.read(str, i, list);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void updateBadge(String str, long j, long j2) {
        lazyInit();
        this.mBadgeService.updateBadge(str, j, j2);
    }
}
