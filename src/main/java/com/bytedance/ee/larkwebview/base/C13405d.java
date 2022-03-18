package com.bytedance.ee.larkwebview.base;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.monitor.webview.C2711i;
import com.bytedance.ee.larkwebview.monitor.base.WebViewClientMonitorProxy;
import com.bytedance.ee.larkwebview.p671d.p675c.C13436a;
import com.bytedance.ee.larkwebview.p677e.C13437a;
import com.bytedance.ee.larkwebview.quality.safe.ISafeService;
import com.bytedance.ee.larkwebview.service.AbstractC13458a;
import com.bytedance.ee.larkwebview.service.AbstractC13468c;
import com.bytedance.ee.larkwebview.service.AbstractC13469d;
import com.bytedance.ee.larkwebview.service.AbstractC13472g;
import com.bytedance.ee.larkwebview.service.AbstractC13475j;
import com.bytedance.ee.larkwebview.service.AbstractC13476k;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.base.d */
public class C13405d extends WebViewClient {

    /* renamed from: a */
    private AbstractC13402a f35335a;

    /* renamed from: b */
    private WebViewClient f35336b;

    /* renamed from: c */
    private WebViewClientMonitorProxy f35337c;

    /* renamed from: b */
    public WebViewClient mo49744b() {
        return this.f35336b;
    }

    /* renamed from: c */
    public void mo49745c(WebViewClient webViewClient) {
        Log.m165389i("LarkWebViewClient", "Caller setWebViewClient");
        this.f35336b = webViewClient;
    }

    public C13405d(AbstractC13402a aVar) {
        this.f35335a = aVar;
        this.f35337c = new WebViewClientMonitorProxy(aVar.getWebView());
    }

    public void onLoadResource(WebView webView, String str) {
        Log.m165389i("LarkWebViewClient", "onLoadResource");
        super.onLoadResource(webView, str);
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        }
    }

    public void onPageCommitVisible(WebView webView, String str) {
        Log.m165389i("LarkWebViewClient", "onPageCommitVisible");
        super.onPageCommitVisible(webView, str);
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onReceivedClientCertRequest mClient handle");
            this.f35336b.onReceivedClientCertRequest(webView, clientCertRequest);
            return;
        }
        Log.m165389i("LarkWebViewClient", "onReceivedClientCertRequest default handle");
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onUnhandledKeyEvent mClient handle");
            this.f35336b.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        Log.m165389i("LarkWebViewClient", "onUnhandledKeyEvent default handle");
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        WebViewClient webViewClient;
        AbstractC13475j jVar = (AbstractC13475j) this.f35335a.getServiceManager().mo49931b(AbstractC13475j.class);
        if (jVar != null) {
            webResourceResponse = jVar.mo49927b(webView, webResourceRequest);
        } else {
            webResourceResponse = null;
        }
        if (webResourceResponse == null && (webViewClient = this.f35336b) != null) {
            webResourceResponse = webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (webResourceResponse == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return webResourceResponse;
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        boolean shouldOverrideKeyEvent = super.shouldOverrideKeyEvent(webView, keyEvent);
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            shouldOverrideKeyEvent |= webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        Log.m165389i("LarkWebViewClient", "shouldOverrideKeyEvent , override = " + shouldOverrideKeyEvent);
        return shouldOverrideKeyEvent;
    }

    public void onPageFinished(WebView webView, String str) {
        this.f35337c.mo49850a(webView, str);
        C2711i.m11480a().mo11585d(webView, str);
        Log.m165389i("LarkWebViewClient", "onPageFinished");
        super.onPageFinished(webView, str);
        AbstractC13469d dVar = (AbstractC13469d) this.f35335a.getServiceManager().mo49931b(AbstractC13469d.class);
        if (dVar != null) {
            dVar.mo49924a(webView, str);
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
        ISafeService cVar = (ISafeService) this.f35335a.getServiceManager().mo49931b(ISafeService.class);
        if (cVar != null) {
            cVar.mo49834a();
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C13437a aVar;
        this.f35337c.mo49852a(webView, renderProcessGoneDetail);
        AbstractC13476k kVar = (AbstractC13476k) this.f35335a.getServiceManager().mo49931b(AbstractC13476k.class);
        if (kVar != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = new C13437a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
            } else {
                aVar = null;
            }
            Log.m165389i("LarkWebViewClient", "onRenderProcessGone service handle");
            return kVar.mo49919a(webView, aVar);
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            boolean onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            Log.m165389i("LarkWebViewClient", "onRenderProcessGone mClient handle result " + onRenderProcessGone);
            return onRenderProcessGone;
        }
        Log.m165389i("LarkWebViewClient", "onRenderProcessGone default return true");
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponse;
        WebViewClient webViewClient;
        AbstractC13475j jVar = (AbstractC13475j) this.f35335a.getServiceManager().mo49931b(AbstractC13475j.class);
        if (jVar != null) {
            webResourceResponse = jVar.mo49929c(webView, str);
        } else {
            webResourceResponse = null;
        }
        if (webResourceResponse == null && (webViewClient = this.f35336b) != null) {
            webResourceResponse = webViewClient.shouldInterceptRequest(webView, str);
        }
        if (webResourceResponse == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z;
        AbstractC13475j jVar = (AbstractC13475j) this.f35335a.getServiceManager().mo49931b(AbstractC13475j.class);
        if (jVar != null) {
            z = jVar.mo49926a(webView, webResourceRequest);
            Log.m165389i("LarkWebViewClient", "IWebViewInterceptService intercept = " + z);
        } else {
            z = false;
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            z |= webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            Log.m165389i("LarkWebViewClient", "after mClient override url intercept = " + z);
        }
        if (z) {
            Log.m165389i("LarkWebViewClient", "shouldOverrideUrlLoading intercept return true");
            return true;
        }
        Log.m165389i("LarkWebViewClient", "shouldOverrideUrlLoading return default");
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        AbstractC13475j jVar = (AbstractC13475j) this.f35335a.getServiceManager().mo49931b(AbstractC13475j.class);
        if (jVar != null) {
            z = jVar.mo49928b(webView, str);
            Log.m165389i("LarkWebViewClient", "interceptService intercept override result = " + z);
        } else {
            z = false;
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            z |= webViewClient.shouldOverrideUrlLoading(webView, str);
            Log.m165389i("LarkWebViewClient", "after mClient override , intercept = " + z);
        }
        if (z) {
            Log.m165389i("LarkWebViewClient", "shouldOverrideUrlLoading intercept return true");
            return true;
        }
        AbstractC13458a aVar = (AbstractC13458a) this.f35335a.getServiceManager().mo49931b(AbstractC13458a.class);
        if (aVar == null || !aVar.mo49904a(this.f35335a.getWebViewContext(), str)) {
            C13436a secLinkChecker = this.f35335a.getWebView().getSecLinkChecker();
            if (secLinkChecker == null || !secLinkChecker.mo49838a((BaseWebView) webView, str)) {
                boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
                if (!shouldOverrideUrlLoading) {
                    C2711i.m11480a().mo11586f(webView, str);
                }
                Log.m165389i("LarkWebViewClient", "shouldOverrideUrlLoading return default");
                return shouldOverrideUrlLoading;
            }
            Log.m165389i("LarkWebViewClient", "SecurityLinkChecker handle override , return true");
            return true;
        }
        aVar.mo49905b(this.f35335a.getWebViewContext(), str);
        Log.m165389i("LarkWebViewClient", "appLinkService handle override , return true");
        return true;
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onFormResubmission mClient handle");
            this.f35336b.onFormResubmission(webView, message, message2);
            return;
        }
        Log.m165389i("LarkWebViewClient", "onFormResubmission default handle");
        super.onFormResubmission(webView, message, message2);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onScaleChanged mClient handle");
            this.f35336b.onScaleChanged(webView, f, f2);
            return;
        }
        Log.m165389i("LarkWebViewClient", "onScaleChanged default handle");
        super.onScaleChanged(webView, f, f2);
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onTooManyRedirects mClient handle");
            this.f35336b.onTooManyRedirects(webView, message, message2);
            return;
        }
        Log.m165389i("LarkWebViewClient", "onTooManyRedirects default handle");
        super.onTooManyRedirects(webView, message, message2);
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "doUpdateVisitedHistory mClient handle , isReload = " + z);
            this.f35336b.doUpdateVisitedHistory(webView, str, z);
            return;
        }
        Log.m165389i("LarkWebViewClient", "doUpdateVisitedHistory default handle, isReload = " + z);
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C2711i.m11480a().mo11583a(webView, webResourceRequest, webResourceResponse);
        this.f35337c.mo49849a(webView, webResourceRequest, webResourceResponse);
        AbstractC13468c cVar = (AbstractC13468c) this.f35335a.getServiceManager().mo49931b(AbstractC13468c.class);
        if (cVar != null) {
            cVar.mo49923a(webView, webResourceRequest, webResourceResponse);
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f35337c.mo49847a(webView, sslErrorHandler, sslError);
        AbstractC13468c cVar = (AbstractC13468c) this.f35335a.getServiceManager().mo49931b(AbstractC13468c.class);
        if (cVar != null) {
            cVar.mo49921a(webView, sslErrorHandler, sslError);
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f35337c.mo49848a(webView, webResourceRequest, webResourceError);
        C2711i.m11480a().mo11582a(webView, webResourceRequest, webResourceError);
        AbstractC13468c cVar = (AbstractC13468c) this.f35335a.getServiceManager().mo49931b(AbstractC13468c.class);
        if (cVar != null) {
            cVar.mo49922a(webView, webResourceRequest, webResourceError);
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f35337c.mo49851a(webView, str, bitmap);
        C2711i.m11480a().mo11584b(webView, str);
        this.f35335a.getWebView().getWebTimeHelper().mo49753b(str, System.currentTimeMillis());
        Log.m165389i("LarkWebViewClient", "onPageStarted");
        AbstractC13472g gVar = (AbstractC13472g) this.f35335a.getServiceManager().mo49931b(AbstractC13472g.class);
        if (gVar != null) {
            gVar.mo49913a(str, this.f35335a.getWebView());
        }
        if (this.f35335a.getWebView().getSecLinkChecker() != null) {
            this.f35335a.getWebView().getSecLinkChecker().mo49839b(str);
        }
        super.onPageStarted(webView, str, bitmap);
        AbstractC13469d dVar = (AbstractC13469d) this.f35335a.getServiceManager().mo49931b(AbstractC13469d.class);
        if (dVar != null) {
            dVar.mo49925a(webView, str, bitmap);
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
        ISafeService cVar = (ISafeService) this.f35335a.getServiceManager().mo49931b(ISafeService.class);
        if (cVar != null) {
            cVar.mo49834a();
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onReceivedHttpAuthRequest mClient handle");
            this.f35336b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        Log.m165389i("LarkWebViewClient", "onReceivedHttpAuthRequest default handle");
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onReceivedLoginRequest mClient handle");
            this.f35336b.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        Log.m165389i("LarkWebViewClient", "onReceivedLoginRequest default handle");
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        Log.m165389i("LarkWebViewClient", "onSafeBrowsingHit");
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        if (this.f35336b != null) {
            Log.m165389i("LarkWebViewClient", "onSafeBrowsingHit mClient handle");
            this.f35336b.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        C2711i.m11480a().mo11581a(webView, i, str, str2);
        AbstractC13468c cVar = (AbstractC13468c) this.f35335a.getServiceManager().mo49931b(AbstractC13468c.class);
        if (cVar != null) {
            cVar.mo49920a(webView, i, str, str2);
        }
        WebViewClient webViewClient = this.f35336b;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }
}
