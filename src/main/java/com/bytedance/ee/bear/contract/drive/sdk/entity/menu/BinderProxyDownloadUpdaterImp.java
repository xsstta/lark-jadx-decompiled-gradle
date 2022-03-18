package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderProxyDownloadUpdaterImp extends BinderProxyDownloadUpdater.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5150g.AbstractC5152b mProxyDownloadUpdater;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mProxyDownloadUpdater;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderProxyDownloadUpdaterImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderProxyDownloadUpdaterImp(AbstractC5150g.AbstractC5152b bVar, Application application) {
        this.mProxyDownloadUpdater = bVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
    public void hideDownloadingView(String str, String str2) {
        lazyInit();
        this.mProxyDownloadUpdater.hideDownloadingView(str, str2);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
    public void showDownloadingView(String str, String str2) {
        lazyInit();
        this.mProxyDownloadUpdater.showDownloadingView(str, str2);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
    public void onDownloadingProgressChange(String str, String str2, int i) {
        lazyInit();
        this.mProxyDownloadUpdater.onDownloadingProgressChange(str, str2, i);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
    public void onFailed(String str, String str2, String str3) {
        lazyInit();
        this.mProxyDownloadUpdater.onFailed(str, str2, str3);
    }
}
