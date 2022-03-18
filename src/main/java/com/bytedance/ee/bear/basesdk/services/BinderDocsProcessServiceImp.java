package com.bytedance.ee.bear.basesdk.services;

import android.app.Application;
import com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderDocsProcessServiceImp extends BinderDocsProcessService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC4501b mDocsProcessService;

    @Override // com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mDocsProcessService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderDocsProcessServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.services.AbstractC4501b
    public void updateWatermarkInfo(WatermarkInfo watermarkInfo) {
        lazyInit();
        this.mDocsProcessService.updateWatermarkInfo(watermarkInfo);
    }

    public BinderDocsProcessServiceImp(AbstractC4501b bVar, Application application) {
        this.mDocsProcessService = bVar;
        this.mApplication = application;
    }
}
