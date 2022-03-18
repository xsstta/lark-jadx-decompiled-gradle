package com.bytedance.ee.bear.document.p311h;

import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.h.a */
abstract class AbstractC5811a implements AbstractC5814d {

    /* renamed from: a */
    final DocBridgeWebViewV2 f16325a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC68307f<Boolean> mo23369b(boolean z, String str);

    AbstractC5811a(DocBridgeWebViewV2 docBridgeWebViewV2) {
        this.f16325a = docBridgeWebViewV2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23368a(boolean z) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48481e()).mo238001b(new Consumer(z) {
            /* class com.bytedance.ee.bear.document.p311h.$$Lambda$a$jCDVxQ3EahhXRS_iARncuR1pUA */
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC5811a.m23414c(this.f$0, (String) obj);
            }
        }, $$Lambda$a$mYQd0BTIPpyug6go_GYjQfQr4.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.document.p311h.AbstractC5814d
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo23367a(boolean z, String str) {
        return mo23369b(z, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m23414c(boolean z, String str) throws Exception {
        C13479a.m54764b("AbsDocPreloader", "initRnSyncManager======  ");
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40253a(z);
    }
}
