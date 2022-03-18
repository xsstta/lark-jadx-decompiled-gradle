package com.bytedance.ee.bear.document;

import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6293y;
import com.bytedance.ee.log.C13479a;

public class FullVideoPlugin extends DocumentPlugin {
    private WebChromeClient webChromeClient;

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        if (this.webChromeClient != null) {
            getWeb().mo19437b(this.webChromeClient);
            this.webChromeClient = null;
        }
    }

    public void onAttachToHost(final C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        final WebView b = getWeb().mo19435b();
        if (b instanceof DocBridgeWebViewV2) {
            this.webChromeClient = new C6293y(new C6293y.AbstractC6294a() {
                /* class com.bytedance.ee.bear.document.FullVideoPlugin.C56151 */

                @Override // com.bytedance.ee.bear.document.C6293y.AbstractC6294a
                /* renamed from: a */
                public ViewGroup mo22512a() {
                    if (sVar.mo19565g() != null) {
                        return (ViewGroup) sVar.mo19565g().mo19601f();
                    }
                    return null;
                }
            });
            C13479a.m54772d("FullVideoPlugin", "add FullVideoChromeClient ");
            getWeb().mo19423a(this.webChromeClient);
            return;
        }
        this.webChromeClient = null;
    }
}
