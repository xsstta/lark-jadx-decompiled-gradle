package com.bytedance.ee.bear.sheet.borderline;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import java.util.Map;

public class BorderLinePlugin extends DocumentPlugin {
    public C11061b borderLineViewModel;

    /* renamed from: com.bytedance.ee.bear.sheet.borderline.BorderLinePlugin$a */
    private class C11059a implements AbstractC7945d<Void> {
        private C11059a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            if (BorderLinePlugin.this.borderLineViewModel != null) {
                BorderLinePlugin.this.borderLineViewModel.clearBorderLinePanel();
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.sheet.clearBorderLinePanel", new C11059a());
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.borderLineViewModel = (C11061b) viewModel(C11061b.class);
    }
}
