package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIDriveOpenMonitor;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIDriveOpenMonitorImp extends BinderIDriveOpenMonitor.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7184l.AbstractC7187c mIDriveOpenMonitor;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderIDriveOpenMonitor.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderIDriveOpenMonitor.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderIDriveOpenMonitor.Stub
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7187c
    public void onOpenFinish() {
        lazyInit();
        this.mIDriveOpenMonitor.onOpenFinish();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIDriveOpenMonitor;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIDriveOpenMonitorImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderIDriveOpenMonitorImp(AbstractC7184l.AbstractC7187c cVar, Application application) {
        this.mIDriveOpenMonitor = cVar;
        this.mApplication = application;
    }
}
