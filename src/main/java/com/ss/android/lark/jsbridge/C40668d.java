package com.ss.android.lark.jsbridge;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ss.android.lark.log.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.ss.android.lark.jsbridge.d */
public class C40668d extends WebViewClient {

    /* renamed from: a */
    private BridgeWebView f103273a;

    /* renamed from: b */
    private boolean f103274b = true;

    public C40668d(BridgeWebView bridgeWebView) {
        this.f103273a = bridgeWebView;
    }

    /* renamed from: a */
    public void mo146781a(boolean z) {
        this.f103274b = z;
        Log.m165389i("BridgeWebViewClient", "change useless decode state to " + z);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f103273a.mo146768a(false, true);
        if (this.f103273a.getStartupMessage() != null) {
            for (C40671g gVar : this.f103273a.getStartupMessage()) {
                this.f103273a.mo146769b(gVar);
            }
            this.f103273a.setStartupMessage(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f103274b) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.m165398w("BridgeWebViewClient", "url decode failed", e);
            } catch (IllegalArgumentException e2) {
                Log.m165398w("BridgeWebViewClient", "url decode failed", e2);
            }
        }
        if (str.startsWith("larkbridge://return/")) {
            this.f103273a.mo146765a(str);
            Log.m165389i("BridgeWebViewClient", "url loading:larkbridge://return/");
            return true;
        } else if (!str.startsWith("larkbridge://")) {
            return super.shouldOverrideUrlLoading(webView, str);
        } else {
            this.f103273a.mo146763a();
            Log.m165389i("BridgeWebViewClient", "url loading:larkbridge://");
            return true;
        }
    }
}
