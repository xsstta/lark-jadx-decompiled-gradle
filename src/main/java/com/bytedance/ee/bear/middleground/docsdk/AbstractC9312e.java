package com.bytedance.ee.bear.middleground.docsdk;

import android.app.KeyguardManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13613a;
import com.bytedance.ee.util.url.UrlRouteReportParam;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.e */
public abstract class AbstractC9312e extends WebViewClient {
    /* renamed from: a */
    public abstract C9306a mo34185a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34186a(WebView webView, boolean z, int i) {
    }

    /* renamed from: a */
    public abstract void mo34190a(String str, Map<String, String> map);

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return mo35536b(webView, renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C9306a a = mo34185a();
        mo34190a("link_clicked", UrlRouteReportParam.m55765a(a.mo35527b(), a.mo35528c()));
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* renamed from: b */
    public final boolean mo35536b(WebView webView, boolean z, int i) {
        String str;
        boolean z2;
        C13479a.m54764b("BridgeWebViewClient", "onRenderProcessGone(): ");
        mo34186a(webView, z, i);
        try {
            HashMap hashMap = new HashMap();
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            hashMap.put("didCrash", str);
            hashMap.put("rendererPriorityAtExit", String.valueOf(i));
            hashMap.put("app_visible", String.valueOf(C13613a.m55256b().mo50550c()));
            hashMap.put("screen_status", String.valueOf(((KeyguardManager) webView.getContext().getApplicationContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()));
            hashMap.put("doc_sdk", String.valueOf(true));
            if (webView.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            hashMap.put("webview_visible", String.valueOf(z2));
            hashMap.put("attached_window", String.valueOf(webView.isAttachedToWindow()));
            hashMap.put("business_channel", mo34185a().mo35526a());
            mo34190a("docs_dev_performance_webview_error", hashMap);
        } catch (Throwable th) {
            C13479a.m54758a("BridgeWebViewClient", "onRenderProcessGone error = " + th);
        }
        return true;
    }
}
