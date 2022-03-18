package com.bytedance.ee.bear.document;

import android.webkit.WebView;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.C5084ad;

public class UpdateNetworkStatePlugin extends DocumentPlugin {
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        WebView b = getWeb().mo19435b();
        if (b instanceof DocBridgeWebViewV2) {
            ((DocBridgeWebViewV2) b).mo22325a(C5084ad.m20847d().mo20038b());
        }
    }
}
