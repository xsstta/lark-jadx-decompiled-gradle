package com.bytedance.ee.bear.contract.darkmode;

import android.app.Application;
import com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderDarkModeServiceImp extends BinderDarkModeService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5128c mDarkModeService;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mDarkModeService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderDarkModeServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
    public void addDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener) {
        lazyInit();
        this.mDarkModeService.addDarkModeListener(binderIDarkModeChangedListener);
    }

    @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
    public void notifyDarkModeChangedListeners(int i) {
        lazyInit();
        this.mDarkModeService.notifyDarkModeChangedListeners(i);
    }

    @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
    public void removeDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener) {
        lazyInit();
        this.mDarkModeService.removeDarkModeListener(binderIDarkModeChangedListener);
    }

    public BinderDarkModeServiceImp(AbstractC5128c cVar, Application application) {
        this.mDarkModeService = cVar;
        this.mApplication = application;
    }
}
