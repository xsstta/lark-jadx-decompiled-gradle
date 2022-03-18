package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.webkit.WebView;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.util.p718t.C13742g;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.d */
class C9345d implements C7939a.AbstractC7942a {

    /* renamed from: a */
    private WebView f25096a;

    public C9345d(WebView webView) {
        this.f25096a = webView;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m38582b(String str) {
        this.f25096a.evaluateJavascript(str, null);
    }

    @Override // com.bytedance.ee.bear.jsbridge.C7939a.AbstractC7942a
    /* renamed from: a */
    public void mo30839a(String str) {
        C13742g.m55711d(new Runnable(String.format("javascript:LkWebViewJavascriptBridge._handleMessageFromNative(%s);", str)) {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.$$Lambda$d$aWWPb5u5vpfLxv24bXYSscBQKyc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9345d.this.m38582b(this.f$1);
            }
        });
    }
}
