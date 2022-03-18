package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderIMakeCopyCallbackImp extends BinderIMakeCopyCallback.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private am.AbstractC5109b mIMakeCopyCallback;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIMakeCopyCallback.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIMakeCopyCallback.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderIMakeCopyCallback.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mIMakeCopyCallback;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderIMakeCopyCallbackImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    public BinderIMakeCopyCallbackImp(am.AbstractC5109b bVar, Application application) {
        this.mIMakeCopyCallback = bVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5109b
    public void onFailed(String str, int i) {
        lazyInit();
        this.mIMakeCopyCallback.onFailed(str, i);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5109b
    public void onSucceed(String str, String str2, String str3) {
        lazyInit();
        this.mIMakeCopyCallback.onSucceed(str, str2, str3);
    }
}
