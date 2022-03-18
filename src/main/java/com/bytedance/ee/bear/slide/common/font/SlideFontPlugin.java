package com.bytedance.ee.bear.slide.common.font;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import java.util.Map;

public class SlideFontPlugin extends DocumentPlugin {
    public C11426f mFontManage;
    private WebViewClient mWebRequestInterceptor;

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        getWeb().mo19438b(this.mWebRequestInterceptor);
        this.mFontManage.mo43785d();
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        C11426f.m47492a(getContext(), C5084ad.m20847d());
        C11426f c = C11426f.m47502c();
        this.mFontManage = c;
        c.mo43777a(getDocViewModel(), C5234y.m21391b());
        this.mWebRequestInterceptor = new WebViewClient() {
            /* class com.bytedance.ee.bear.slide.common.font.SlideFontPlugin.C114181 */

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return SlideFontPlugin.this.mFontManage.mo43776a(str, (Map<String, String>) null);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return SlideFontPlugin.this.mFontManage.mo43776a(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
            }
        };
        getWeb().mo19425a(this.mWebRequestInterceptor);
    }
}
