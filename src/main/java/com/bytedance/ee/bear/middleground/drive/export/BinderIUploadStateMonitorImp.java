package com.bytedance.ee.bear.middleground.drive.export;

import android.app.Application;
import com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIUploadStateMonitorImp extends BinderIUploadStateMonitor.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC9363c.AbstractC9364a mIUploadStateMonitor;

    @Override // com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onExistUploadingFile() {
        lazyInit();
        this.mIUploadStateMonitor.onExistUploadingFile();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadFinished() {
        lazyInit();
        this.mIUploadStateMonitor.onUploadFinished();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIUploadStateMonitor;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIUploadStateMonitorImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadError(int i) {
        lazyInit();
        this.mIUploadStateMonitor.onUploadError(i);
    }

    public BinderIUploadStateMonitorImp(AbstractC9363c.AbstractC9364a aVar, Application application) {
        this.mIUploadStateMonitor = aVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onFileCountChange(int i, int i2) {
        lazyInit();
        this.mIUploadStateMonitor.onFileCountChange(i, i2);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onFileProgressChange(int i, ProgressingEntity progressingEntity) {
        lazyInit();
        this.mIUploadStateMonitor.onFileProgressChange(i, progressingEntity);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadErrorCode(String str, int i) {
        lazyInit();
        this.mIUploadStateMonitor.onUploadErrorCode(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadFileSuccess(String str, String str2, String str3) {
        lazyInit();
        this.mIUploadStateMonitor.onUploadFileSuccess(str, str2, str3);
    }
}
