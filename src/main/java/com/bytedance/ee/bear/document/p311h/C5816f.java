package com.bytedance.ee.bear.document.p311h;

import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.h.f */
public class C5816f {

    /* renamed from: a */
    private DocBridgeWebViewV2 f16328a;

    /* renamed from: a */
    public AbstractC5814d mo23371a() {
        if (!((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("resourceIntercept", true)).booleanValue()) {
            return new C5812b(this.f16328a);
        }
        C13479a.m54772d("PreloaderFactory", "creatPreloader: use offline.");
        return new C5815e(this.f16328a);
    }

    public C5816f(DocBridgeWebViewV2 docBridgeWebViewV2) {
        this.f16328a = docBridgeWebViewV2;
    }
}
