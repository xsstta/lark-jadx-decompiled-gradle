package com.bytedance.ee.bear.document.p310g;

import android.app.Application;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.g.a */
public class C5807a implements AbstractC5808b {

    /* renamed from: a */
    private C10917c f16316a;

    public C5807a(C10917c cVar) {
        this.f16316a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23393a(Throwable th) throws Exception {
        C13479a.m54761a("EditorInitTask", th);
        C13606d.m55245a("EditorInitTask", th);
    }

    @Override // com.bytedance.ee.bear.document.p310g.AbstractC5808b
    /* renamed from: a */
    public void mo23364a(Application application) {
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b($$Lambda$a$6lzXCDE1TRkOWgZWBn9w2EHLlI.INSTANCE, $$Lambda$a$5NUIWrTx50z4XC5BHmtyjeJE5hE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23392a(Boolean bool) throws Exception {
        C13479a.m54764b("EditorInitTask", "***reportPreloadHtml*** preloadTemplate, result = " + bool);
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40253a(((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40254a());
    }
}
