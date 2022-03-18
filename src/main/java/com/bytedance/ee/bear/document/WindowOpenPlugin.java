package com.bytedance.ee.bear.document;

import android.webkit.WebChromeClient;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.log.C13479a;

public class WindowOpenPlugin extends DocumentPlugin {
    private WebChromeClient webChromeClient;

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        if (this.webChromeClient != null) {
            getWeb().mo19437b(this.webChromeClient);
            this.webChromeClient = null;
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        if (getWeb().mo19435b() instanceof DocBridgeWebViewV2) {
            this.webChromeClient = new C5806g(((DocBridgeWebViewV2) getWeb().mo19435b()).getWebViewClient());
            C13479a.m54772d("WindowOpenPlugin", "addWebChromeClientDelegate ");
            getWeb().mo19423a(this.webChromeClient);
            return;
        }
        this.webChromeClient = null;
    }
}
