package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIDownloadCallback;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIDownloadCallbackImp extends BinderIDownloadCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7184l.AbstractC7185a mIDownloadCallback;

    @Override // com.bytedance.ee.bear.drive.services.BinderIDownloadCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderIDownloadCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderIDownloadCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIDownloadCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIDownloadCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderIDownloadCallbackImp(AbstractC7184l.AbstractC7185a aVar, Application application) {
        this.mIDownloadCallback = aVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7185a
    public boolean onFailed(String str, int i) {
        lazyInit();
        return this.mIDownloadCallback.onFailed(str, i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7185a
    public boolean updateProgress(String str, int i, long j, long j2, String str2) {
        lazyInit();
        return this.mIDownloadCallback.updateProgress(str, i, j, j2, str2);
    }
}
