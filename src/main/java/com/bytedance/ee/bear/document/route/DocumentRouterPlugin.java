package com.bytedance.ee.bear.document.route;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.DocumentWebClientPriority;

public class DocumentRouterPlugin extends DocumentPlugin {
    private boolean clearHistoryWhenNavigate;

    public DocumentRouterPlugin(boolean z) {
        this.clearHistoryWhenNavigate = z;
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        getWeb().mo19426a(new C6090b(sVar, this.clearHistoryWhenNavigate), DocumentWebClientPriority.Router.ordinal());
    }
}
