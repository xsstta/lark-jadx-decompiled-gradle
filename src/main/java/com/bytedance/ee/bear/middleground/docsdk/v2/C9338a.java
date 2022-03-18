package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.webkit.WebView;
import com.bytedance.ee.bear.browser.C4929h;
import com.bytedance.ee.bear.browser.bridge.JSBridge;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.larkwebview.bridge.Bridge;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.a */
public class C9338a extends C4929h {

    /* renamed from: a */
    private JSBridge f25090a = new JSBridge(this);

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: c */
    public IBridge mo19440c() {
        return this.f25090a;
    }

    public C9338a(WebView webView, Bridge aVar) {
        super(webView, aVar);
    }
}
