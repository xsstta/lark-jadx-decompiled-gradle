package com.bytedance.ee.bear.document;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleObserver;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4956d;
import com.bytedance.ee.bear.browser.plugin.lazy.C4954c;
import com.bytedance.ee.bear.contract.RenderCallbackAdapter;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.AbstractC6295z;
import com.bytedance.ee.bear.list.dto.C8275a;
import java.util.Map;

public class DocumentLazyPluginMounterFactory {

    private static class InnerPluginMounterHolder extends RenderCallbackAdapter implements LifecycleObserver {

        /* renamed from: a */
        public final C4954c f15916a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC4956d mo22492a() {
            return this.f15916a;
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b, com.bytedance.ee.bear.contract.RenderCallbackAdapter
        public void onRenderSuccess(Map<String, String> map) {
            this.f15916a.mo19615b();
        }

        private InnerPluginMounterHolder(final C6095s sVar) {
            AbstractC4931i b = sVar.mo19448b();
            final DocBridgeWebViewV2 docBridgeWebViewV2 = (DocBridgeWebViewV2) b.mo19435b();
            docBridgeWebViewV2.mo22326a(this);
            C56101 r2 = new C4954c(sVar) {
                /* class com.bytedance.ee.bear.document.DocumentLazyPluginMounterFactory.InnerPluginMounterHolder.C56101 */

                @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4956d, com.bytedance.ee.bear.browser.plugin.lazy.C4953b
                /* renamed from: a */
                public void mo19608a() {
                    super.mo19608a();
                    docBridgeWebViewV2.mo22338b(InnerPluginMounterHolder.this);
                }
            };
            this.f15916a = r2;
            ((AbstractC6295z) b).mo22531a(new AbstractC6295z.AbstractC6296a() {
                /* class com.bytedance.ee.bear.document.$$Lambda$vIm_t7ptckT4VMzcKUzY_S_yrm8 */

                @Override // com.bytedance.ee.bear.document.AbstractC6295z.AbstractC6296a
                public final void onBeforeJsMsgDispatch(String str) {
                    C4954c.this.mo19614a(str);
                }
            });
            sVar.mo24600o().mo23796a(new AbstractC5887o.C5889b() {
                /* class com.bytedance.ee.bear.document.DocumentLazyPluginMounterFactory.InnerPluginMounterHolder.C56112 */

                @Override // com.bytedance.ee.bear.document.AbstractC5887o.C5889b, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
                public void onLoadSuccess() {
                    DocViewModel m = sVar.mo24598m();
                    if (m != null && !TextUtils.equals(m.getDocumentType(), C8275a.f22371d.mo32553a()) && !TextUtils.equals(m.getDocumentType(), C8275a.f22372e.mo32553a()) && !TextUtils.equals(m.getDocumentType(), C8275a.f22373f.mo32553a())) {
                        InnerPluginMounterHolder.this.f15916a.mo19615b();
                    }
                }

                @Override // com.bytedance.ee.bear.document.AbstractC5887o.C5889b, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
                public void onLoadFail(int i, Throwable th) {
                    InnerPluginMounterHolder.this.f15916a.mo19615b();
                }
            });
        }
    }

    /* renamed from: a */
    static AbstractC4956d m22795a(C6095s sVar) {
        return new InnerPluginMounterHolder(sVar).mo22492a();
    }
}
