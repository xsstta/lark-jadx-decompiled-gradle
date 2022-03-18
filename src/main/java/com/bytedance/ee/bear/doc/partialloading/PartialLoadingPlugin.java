package com.bytedance.ee.bear.doc.partialloading;

import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.larksuite.suite.R;
import java.util.Map;

public class PartialLoadingPlugin extends DocumentPlugin {
    private C5449a mLoadingObsuration;

    /* renamed from: com.bytedance.ee.bear.doc.partialloading.PartialLoadingPlugin$a */
    private class C5447a implements AbstractC7945d<Void> {
        private C5447a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            PartialLoadingPlugin.this.updatePartialLoading(false);
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.partialloading.PartialLoadingPlugin$b */
    private class C5448b implements AbstractC7945d<Void> {
        private C5448b() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            PartialLoadingPlugin.this.updatePartialLoading(true);
        }
    }

    public void updatePartialLoading(boolean z) {
        C5449a aVar = this.mLoadingObsuration;
        if (aVar != null) {
            if (z) {
                aVar.mo21802a();
            } else {
                aVar.mo21803b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.showPartialLoading", new C5448b());
        map.put("biz.util.hidePartialLoading", new C5447a());
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.mLoadingObsuration = new C5449a(nVar.mo19584a(this, R.layout.doc_stub_loading_obscuration));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        C5449a aVar = this.mLoadingObsuration;
        if (aVar != null) {
            aVar.mo21803b();
        }
    }
}
