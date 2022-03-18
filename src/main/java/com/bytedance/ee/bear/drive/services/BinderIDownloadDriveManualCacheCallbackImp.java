package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.contract.drive.DriveManualCacheStatus;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIDownloadDriveManualCacheCallbackImp extends BinderIDownloadDriveManualCacheCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7184l.AbstractC7186b mIDownloadDriveManualCacheCallback;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIDownloadDriveManualCacheCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIDownloadDriveManualCacheCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7186b
    public void onStatusChange(DriveManualCacheStatus driveManualCacheStatus) {
        lazyInit();
        this.mIDownloadDriveManualCacheCallback.onStatusChange(driveManualCacheStatus);
    }

    public BinderIDownloadDriveManualCacheCallbackImp(AbstractC7184l.AbstractC7186b bVar, Application application) {
        this.mIDownloadDriveManualCacheCallback = bVar;
        this.mApplication = application;
    }
}
