package com.bytedance.ee.bear.document.p311h;

import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.document.h.e */
public class C5815e extends AbstractC5811a {
    C5815e(DocBridgeWebViewV2 docBridgeWebViewV2) {
        super(docBridgeWebViewV2);
    }

    @Override // com.bytedance.ee.bear.document.p311h.AbstractC5811a
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo23369b(boolean z, String str) {
        C13479a.m54764b("OfflineDocPreLoader", "loadTemplateFlow()... isReloadRN = " + z);
        DocBridgeWebViewV2 docBridgeWebViewV2 = this.f16325a;
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(docBridgeWebViewV2, z) {
            /* class com.bytedance.ee.bear.document.p311h.$$Lambda$e$zeIBUHeIJ9F9E_g1wGN00j4XwZs */
            public final /* synthetic */ DocBridgeWebViewV2 f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5815e.lambda$zeIBUHeIJ9F9E_g1wGN00j4XwZs(C5815e.this, this.f$1, this.f$2, (String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo237990a((Function) new Function(str) {
            /* class com.bytedance.ee.bear.document.p311h.$$Lambda$e$yn9XyO3e1bU_pnZWnrYlyntiQg */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5815e.m269243lambda$yn9XyO3e1bU_pnZWnrYlyntiQg(DocBridgeWebViewV2.this, this.f$1, (Boolean) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m23425a(DocBridgeWebViewV2 docBridgeWebViewV2, String str, Boolean bool) {
        if (bool.booleanValue()) {
            return docBridgeWebViewV2.getOfflineEngine().mo23895a(docBridgeWebViewV2, str);
        }
        return AbstractC68307f.m265083a((Object) false);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Boolean m23424a(DocBridgeWebViewV2 docBridgeWebViewV2, boolean z, String str) {
        docBridgeWebViewV2.getOfflineEngine().mo23896a();
        C13479a.m54764b("OfflineDocPreLoader", "loadTemplateFlow status:" + docBridgeWebViewV2.getDocStatus());
        if (docBridgeWebViewV2.getDocStatus() == 1) {
            C13479a.m54764b("OfflineDocPreLoader", " preloadOfflineAsync interrupted cause: DocStatus.LOADING");
            return false;
        }
        mo23368a(z);
        return true;
    }
}
