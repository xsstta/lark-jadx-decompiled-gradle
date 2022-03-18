package com.bytedance.ee.bear.document.p311h;

import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.document.h.c */
public class C5813c {

    /* renamed from: a */
    private AbstractC5814d f16326a;

    /* renamed from: b */
    private DocBridgeWebViewV2 f16327b;

    /* renamed from: a */
    private AbstractC5814d m23421a() {
        if (this.f16326a == null) {
            this.f16326a = new C5816f(this.f16327b).mo23371a();
        }
        return this.f16326a;
    }

    public C5813c(DocBridgeWebViewV2 docBridgeWebViewV2) {
        this.f16327b = docBridgeWebViewV2;
    }

    /* renamed from: a */
    public synchronized AbstractC68307f<Boolean> mo23370a(boolean z, String str) {
        C13479a.m54764b("PreloadEntry", "preloadFlow() isReloadRN  " + z + "   preloadUrl: " + str);
        return m23421a().mo23367a(z, str);
    }
}
