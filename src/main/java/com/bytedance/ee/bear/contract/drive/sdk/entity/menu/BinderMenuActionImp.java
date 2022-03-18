package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderMenuActionImp extends BinderMenuAction.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private BaseMoreMenuAction.AbstractC5143a mMenuAction;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mMenuAction;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderMenuActionImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.AbstractC5143a
    public void action(Bundle bundle) {
        lazyInit();
        this.mMenuAction.action(bundle);
    }

    public BinderMenuActionImp(BaseMoreMenuAction.AbstractC5143a aVar, Application application) {
        this.mMenuAction = aVar;
        this.mApplication = application;
    }
}
