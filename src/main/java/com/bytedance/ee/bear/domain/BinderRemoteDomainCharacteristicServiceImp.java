package com.bytedance.ee.bear.domain;

import android.app.Application;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderRemoteDomainCharacteristicServiceImp extends BinderRemoteDomainCharacteristicService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC6307e.AbstractC6308a mRemoteDomainCharacteristicService;

    @Override // com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public void fetchConfig() {
        lazyInit();
        this.mRemoteDomainCharacteristicService.fetchConfig();
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public AbstractC68307f<String> getDomainCharacteristicConfig() {
        lazyInit();
        return this.mRemoteDomainCharacteristicService.getDomainCharacteristicConfig();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mRemoteDomainCharacteristicService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderRemoteDomainCharacteristicServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public void registerConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
        lazyInit();
        this.mRemoteDomainCharacteristicService.registerConfigChangeListener(binderOnDomainCharacteristicChangeListener);
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public void unregisterConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
        lazyInit();
        this.mRemoteDomainCharacteristicService.unregisterConfigChangeListener(binderOnDomainCharacteristicChangeListener);
    }

    public BinderRemoteDomainCharacteristicServiceImp(AbstractC6307e.AbstractC6308a aVar, Application application) {
        this.mRemoteDomainCharacteristicService = aVar;
        this.mApplication = application;
    }
}
