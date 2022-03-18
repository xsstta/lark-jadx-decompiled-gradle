package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIManualOfflineDialogCallbackImp extends BinderIManualOfflineDialogCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private am.AbstractC5111d mIManualOfflineDialogCallback;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIManualOfflineDialogCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIManualOfflineDialogCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5111d
    public void onConfirmDownload(Document document) {
        lazyInit();
        this.mIManualOfflineDialogCallback.onConfirmDownload(document);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5111d
    public void onWaitingWifi(Document document) {
        lazyInit();
        this.mIManualOfflineDialogCallback.onWaitingWifi(document);
    }

    public BinderIManualOfflineDialogCallbackImp(am.AbstractC5111d dVar, Application application) {
        this.mIManualOfflineDialogCallback = dVar;
        this.mApplication = application;
    }
}
