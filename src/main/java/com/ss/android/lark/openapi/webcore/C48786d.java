package com.ss.android.lark.openapi.webcore;

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
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.ss.android.lark.jsbridge.C40668d;
import com.ss.android.lark.openapi.webcore.p2398a.AbstractC48779c;

/* renamed from: com.ss.android.lark.openapi.webcore.d */
public class C48786d extends C40668d {

    /* renamed from: a */
    private AbstractC48779c f122572a;

    /* renamed from: b */
    private String f122573b;

    /* renamed from: a */
    public String mo170466a() {
        return this.f122573b;
    }

    public C48786d(LarkWebView larkWebView) {
        super(larkWebView);
    }

    /* renamed from: a */
    public void mo170467a(AbstractC48779c cVar) {
        this.f122572a = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo170468a(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            return cVar.mo170387a(webView, tTRenderProcessGoneDetail);
        }
        return true;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170433c(webView, str);
        }
    }

    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170434d(webView, str);
        }
    }

    @Override // com.ss.android.lark.jsbridge.C40668d
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170432b(webView, str);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170416a(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170431b(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        boolean shouldOverrideKeyEvent = super.shouldOverrideKeyEvent(webView, keyEvent);
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            return shouldOverrideKeyEvent | cVar.mo170425a(webView, keyEvent);
        }
        return shouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            return shouldOverrideUrlLoading | cVar.mo170427a(webView, webResourceRequest);
        }
        return shouldOverrideUrlLoading;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            webResourceResponse = cVar.mo170429b(webView, webResourceRequest);
        } else {
            webResourceResponse = null;
        }
        if (webResourceResponse == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return webResourceResponse;
    }

    @Override // com.ss.android.lark.jsbridge.C40668d, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            return shouldOverrideUrlLoading | cVar.mo170428a(webView, str);
        }
        return shouldOverrideUrlLoading;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f122572a == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 26 || TTWebSdk.isTTWebView() || renderProcessGoneDetail == null) {
            return this.f122572a.mo170426a(webView, renderProcessGoneDetail);
        }
        if (mo170468a(webView, new TTRenderProcessGoneDetail(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit())) || this.f122572a.mo170426a(webView, renderProcessGoneDetail)) {
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponse;
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            webResourceResponse = cVar.mo170435e(webView, str);
        } else {
            webResourceResponse = null;
        }
        if (webResourceResponse == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        return webResourceResponse;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170424a(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170430b(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f122573b = str;
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170422a(webView, str, bitmap);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170421a(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170418a(webView, sslErrorHandler, sslError);
        } else {
            sslErrorHandler.cancel();
        }
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170413a(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170415a(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170420a(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170414a(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170417a(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170423a(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        AbstractC48779c cVar = this.f122572a;
        if (cVar != null) {
            cVar.mo170419a(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
