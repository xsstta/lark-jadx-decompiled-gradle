package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIDeleteDocCallbackImp extends BinderIDeleteDocCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private am.AbstractC5108a mIDeleteDocCallback;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIDeleteDocCallback.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIDeleteDocCallback.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIDeleteDocCallback.Stub
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onPostExecuteSuccess() {
        lazyInit();
        this.mIDeleteDocCallback.onPostExecuteSuccess();
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onPreExecute() {
        lazyInit();
        this.mIDeleteDocCallback.onPreExecute();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIDeleteDocCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIDeleteDocCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onOfflinePostExecute(boolean z) {
        lazyInit();
        this.mIDeleteDocCallback.onOfflinePostExecute(z);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onPostExecuteFail(int i) {
        lazyInit();
        this.mIDeleteDocCallback.onPostExecuteFail(i);
    }

    public BinderIDeleteDocCallbackImp(am.AbstractC5108a aVar, Application application) {
        this.mIDeleteDocCallback = aVar;
        this.mApplication = application;
    }
}
