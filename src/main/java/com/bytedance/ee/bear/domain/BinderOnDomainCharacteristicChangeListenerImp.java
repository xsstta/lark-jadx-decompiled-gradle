package com.bytedance.ee.bear.domain;

import android.app.Application;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderOnDomainCharacteristicChangeListenerImp extends BinderOnDomainCharacteristicChangeListener.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC6307e.AbstractC6308a.AbstractC6309a mOnDomainCharacteristicChangeListener;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mOnDomainCharacteristicChangeListener;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderOnDomainCharacteristicChangeListenerImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a.AbstractC6309a
    public void onConfigChanged(Map<String, String> map) {
        lazyInit();
        this.mOnDomainCharacteristicChangeListener.onConfigChanged(map);
    }

    public BinderOnDomainCharacteristicChangeListenerImp(AbstractC6307e.AbstractC6308a.AbstractC6309a aVar, Application application) {
        this.mOnDomainCharacteristicChangeListener = aVar;
        this.mApplication = application;
    }
}
