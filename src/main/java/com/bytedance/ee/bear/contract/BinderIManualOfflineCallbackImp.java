package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIManualOfflineCallbackImp extends BinderIManualOfflineCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private am.AbstractC5110c mIManualOfflineCallback;

    @Override // com.bytedance.ee.bear.contract.BinderIManualOfflineCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderIManualOfflineCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderIManualOfflineCallback.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
    public void onDownloadStatusChange() {
        lazyInit();
        this.mIManualOfflineCallback.onDownloadStatusChange();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIManualOfflineCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIManualOfflineCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderIManualOfflineCallbackImp(am.AbstractC5110c cVar, Application application) {
        this.mIManualOfflineCallback = cVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
    public void onShowConfirmDownloadDialog(Document document, long j, BinderIManualOfflineDialogCallback binderIManualOfflineDialogCallback) {
        lazyInit();
        this.mIManualOfflineCallback.onShowConfirmDownloadDialog(document, j, binderIManualOfflineDialogCallback);
    }
}
