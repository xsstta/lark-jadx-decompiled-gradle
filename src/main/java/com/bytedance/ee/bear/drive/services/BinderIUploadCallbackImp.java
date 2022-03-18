package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIUploadCallback;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIUploadCallbackImp extends BinderIUploadCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7184l.AbstractC7188d mIUploadCallback;

    @Override // com.bytedance.ee.bear.drive.services.BinderIUploadCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderIUploadCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderIUploadCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIUploadCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIUploadCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderIUploadCallbackImp(AbstractC7184l.AbstractC7188d dVar, Application application) {
        this.mIUploadCallback = dVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7188d
    public boolean onFailed(String str, int i, String str2) {
        lazyInit();
        return this.mIUploadCallback.onFailed(str, i, str2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7188d
    public boolean updateProgress(String str, int i, long j, long j2, String str2, String str3, String str4, String str5) {
        lazyInit();
        return this.mIUploadCallback.updateProgress(str, i, j, j2, str2, str3, str4, str5);
    }
}
