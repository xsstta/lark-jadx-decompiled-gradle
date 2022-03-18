package com.bytedance.ee.bear.document.p311h;

import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.document.h.b */
public class C5812b extends AbstractC5811a {
    C5812b(DocBridgeWebViewV2 docBridgeWebViewV2) {
        super(docBridgeWebViewV2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m23419a(Boolean bool) throws Exception {
        this.f16325a.resumeTimers();
        this.f16325a.setReadyStatus(Boolean.TRUE);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.p311h.AbstractC5811a
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo23369b(boolean z, String str) {
        C13479a.m54764b("DefaultDocPreLoader", "loadTemplateFlow()... isReloadRN = " + z);
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(this.f16325a, z) {
            /* class com.bytedance.ee.bear.document.p311h.$$Lambda$b$_kBpxMoKxu7bJVaCvA_y_1Y97Pk */
            public final /* synthetic */ DocBridgeWebViewV2 f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5812b.lambda$_kBpxMoKxu7bJVaCvA_y_1Y97Pk(C5812b.this, this.f$1, this.f$2, (String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.p311h.$$Lambda$b$4tKhZ7Jey_PttN3mrKf_0W4cKPY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5812b.lambda$4tKhZ7Jey_PttN3mrKf_0W4cKPY(C5812b.this, (Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m23418a(DocBridgeWebViewV2 docBridgeWebViewV2, boolean z, String str) throws Exception {
        docBridgeWebViewV2.getOfflineEngine().mo23896a();
        mo23368a(z);
        return true;
    }
}
