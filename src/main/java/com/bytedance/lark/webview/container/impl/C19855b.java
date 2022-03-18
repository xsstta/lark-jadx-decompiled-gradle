package com.bytedance.lark.webview.container.impl;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ClientCertRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.webview.container.C25819a;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.impl.C25841b;
import com.larksuite.component.webview.container.impl.C25844c;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25855f;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25856g;
import com.larksuite.component.webview.container.impl.statistics.WebContainerReporter;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.C26323w;
import com.ss.android.lark.log.Log;
import java.util.HashMap;

/* renamed from: com.bytedance.lark.webview.container.impl.b */
public class C19855b extends WebViewClient {

    /* renamed from: a */
    private AbstractC25856g f48464a;

    /* renamed from: b */
    private AbstractC25855f f48465b;

    /* renamed from: c */
    private C25844c f48466c;

    /* renamed from: d */
    private IWebContainerContract.IWebContainerView.AbstractC25824a f48467d;

    /* renamed from: a */
    public void mo67263a(AbstractC25855f fVar) {
        this.f48465b = fVar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar = this.f48467d;
        if (aVar != null) {
            aVar.mo50977a(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse a;
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar = this.f48467d;
        if (aVar == null || !(webView instanceof LarkWebView) || (a = aVar.mo91871a((LarkWebView) webView, webResourceRequest)) == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return a;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.m165397w("LarkWebViewClient", "Container WebView LarkWebView onRenderProcessGone");
        if (Build.VERSION.SDK_INT >= 26 && renderProcessGoneDetail != null) {
            if (renderProcessGoneDetail.didCrash()) {
                Log.m165383e("LarkWebViewClient", "onRenderProcessGone WebView has been killed - crashed");
            } else {
                Log.m165383e("LarkWebViewClient", "onRenderProcessGone WebView has been killed - not crash");
            }
        }
        AbstractC25855f fVar = this.f48465b;
        if (fVar == null) {
            return true;
        }
        fVar.mo67348a(webView);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("larkbridge://")) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        if (C25819a.m93330b(str)) {
            return true;
        }
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar = this.f48467d;
        if (aVar != null && (webView instanceof LarkWebView) && aVar.mo51002c((LarkWebView) webView, str)) {
            return true;
        }
        if (C25819a.m93327a(str)) {
            return C25819a.m93325a(webView.getContext(), str);
        }
        if (C25841b.m93494a(str)) {
            C26323w.m95324a(webView.getContext(), str);
            return true;
        }
        if (webView.canGoBack()) {
            this.f48464a.mo67293f();
        }
        if (this.f48466c.mo91939a(webView, str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        boolean z;
        if (C26284k.m95185a(webView.getContext())) {
            Log.m165379d("LarkWebViewClient", "onPageFinished : " + str);
        } else {
            Log.m165379d("LarkWebViewClient", "onPageFinished");
        }
        if (C25819a.m93330b(str)) {
            C25819a.m93326a(webView, str);
            return;
        }
        WebContainerReporter.m93651a().mo92045a("page_finish");
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar = this.f48467d;
        if (aVar != null && (webView instanceof LarkWebView)) {
            aVar.mo50995b((LarkWebView) webView, str);
        }
        AbstractC25855f fVar = this.f48465b;
        if (fVar != null) {
            fVar.mo67350a(webView, str);
        }
        this.f48464a.mo67283a(webView.getTitle());
        Activity activity = null;
        if (webView.getContext() instanceof WebContainerActivity) {
            activity = (Activity) webView.getContext();
        } else if ((webView.getContext() instanceof MutableContextWrapper) && (((MutableContextWrapper) webView.getContext()).getBaseContext() instanceof WebContainerActivity)) {
            activity = (Activity) ((MutableContextWrapper) webView.getContext()).getBaseContext();
        }
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar2 = this.f48467d;
        boolean z2 = false;
        if ((aVar2 == null || !aVar2.mo50998b(str)) && !C25819a.m93327a(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!webView.canGoBack()) {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList.getSize() == 0 || (copyBackForwardList.getSize() == 1 && "about:blank".equals(copyBackForwardList.getItemAtIndex(0).getUrl()))) {
                z2 = true;
            }
        }
        if (z && !"about:blank".equals(str) && !C25819a.m93330b(str) && z2 && activity != null && !activity.isFinishing()) {
            activity.finish();
        }
        super.onPageFinished(webView, str);
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public C19855b(AbstractC25856g gVar, C25844c cVar, IWebContainerContract.IWebContainerView.AbstractC25824a aVar) {
        this.f48464a = gVar;
        this.f48466c = cVar;
        this.f48467d = aVar;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (C26284k.m95185a(webView.getContext())) {
            Log.m165379d("LarkWebViewClient", "onPageStarted : " + str);
        } else {
            Log.m165379d("LarkWebViewClient", "onPageStarted");
        }
        WebContainerReporter.m93651a().mo92045a("page_start");
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar = this.f48467d;
        if (aVar != null && (webView instanceof LarkWebView)) {
            aVar.mo50978a((LarkWebView) webView, str);
        }
        this.f48466c.mo91940b(str);
        AbstractC25855f fVar = this.f48465b;
        if (fVar != null) {
            fVar.mo67351a(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        NullPointerException e;
        String str2 = "";
        Log.m165397w("LarkWebViewClient", "onReceivedSslError will cancel request");
        WebContainerReporter.m93651a().mo92045a("ssl_error");
        try {
            str = Uri.parse(webView.getUrl()).getHost();
            try {
                str2 = Uri.parse(sslError.getUrl()).getHost();
            } catch (NullPointerException e2) {
                e = e2;
            }
        } catch (NullPointerException e3) {
            e = e3;
            str = str2;
            Log.m165384e("LarkWebViewClient", "onReceivedSslError", e);
            if (!TextUtils.isEmpty(str)) {
            }
            Log.m165389i("LarkWebViewClient", "sub resource ssl error , not handle");
            return;
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            Log.m165389i("LarkWebViewClient", "sub resource ssl error , not handle");
            return;
        }
        Log.m165389i("LarkWebViewClient", "main resource ssl error , callback error");
        AbstractC25855f fVar = this.f48465b;
        if (fVar != null) {
            fVar.mo67349a(webView, sslError.getPrimaryError(), sslError.toString(), sslError.getUrl());
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webView != null && webResourceRequest != null) {
            StringBuffer stringBuffer = new StringBuffer();
            HashMap<String, String> hashMap = new HashMap<>();
            stringBuffer.append("onReceivedError");
            if (C26284k.m95185a(webView.getContext())) {
                stringBuffer.append(", url : ");
                stringBuffer.append(webResourceRequest.getUrl().toString());
                hashMap.put("url", webResourceRequest.getUrl().toString());
            }
            stringBuffer.append(", method : ");
            stringBuffer.append(webResourceRequest.getMethod());
            hashMap.put("method", webResourceRequest.getMethod());
            stringBuffer.append(", hasGesture : ");
            stringBuffer.append(webResourceRequest.hasGesture());
            hashMap.put("hasGesture", String.valueOf(webResourceRequest.hasGesture()));
            stringBuffer.append(", isForMainFrame : ");
            stringBuffer.append(webResourceRequest.isForMainFrame());
            hashMap.put("isForMainFrame", String.valueOf(webResourceRequest.isForMainFrame()));
            if (Build.VERSION.SDK_INT >= 24) {
                stringBuffer.append(", isRedirect : ");
                stringBuffer.append(webResourceRequest.isRedirect());
                hashMap.put("isRedirect", String.valueOf(webResourceRequest.isRedirect()));
            }
            if (webResourceError != null && Build.VERSION.SDK_INT >= 23) {
                stringBuffer.append(", errCode : ");
                stringBuffer.append(webResourceError.getErrorCode());
                hashMap.put("errCode", String.valueOf(webResourceError.getErrorCode()));
                stringBuffer.append(", errDesc : ");
                stringBuffer.append(webResourceError.getDescription());
                hashMap.put("errDesc", String.valueOf(webResourceError.getDescription()));
            }
            WebContainerReporter.m93651a().mo92046a("received_error", hashMap);
            Log.m165383e("LarkWebViewClient", stringBuffer.toString());
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webView != null && webResourceRequest != null) {
            StringBuffer stringBuffer = new StringBuffer();
            HashMap<String, String> hashMap = new HashMap<>();
            stringBuffer.append("onReceivedHttpError");
            if (C26284k.m95185a(webView.getContext())) {
                stringBuffer.append(", url : ");
                stringBuffer.append(webResourceRequest.getUrl().toString());
                hashMap.put("url", webResourceRequest.getUrl().toString());
            }
            stringBuffer.append(", method : ");
            stringBuffer.append(webResourceRequest.getMethod());
            hashMap.put("method", webResourceRequest.getMethod());
            stringBuffer.append(", hasGesture : ");
            stringBuffer.append(webResourceRequest.hasGesture());
            hashMap.put("hasGesture", String.valueOf(webResourceRequest.hasGesture()));
            stringBuffer.append(", isForMainFrame : ");
            stringBuffer.append(webResourceRequest.isForMainFrame());
            hashMap.put("isForMainFrame", String.valueOf(webResourceRequest.isForMainFrame()));
            if (Build.VERSION.SDK_INT >= 24) {
                stringBuffer.append(", isRedirect : ");
                stringBuffer.append(webResourceRequest.isRedirect());
                hashMap.put("isRedirect", String.valueOf(webResourceRequest.isRedirect()));
            }
            if (webResourceResponse != null) {
                stringBuffer.append(", statusCode : ");
                stringBuffer.append(webResourceResponse.getStatusCode());
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(webResourceResponse.getStatusCode()));
                stringBuffer.append(", mimeType : ");
                stringBuffer.append(webResourceResponse.getMimeType());
                hashMap.put("mimeType", webResourceResponse.getMimeType());
                stringBuffer.append(", reasonPhrase : ");
                stringBuffer.append(webResourceResponse.getReasonPhrase());
                hashMap.put("reasonPhrase", webResourceResponse.getReasonPhrase());
            }
            WebContainerReporter.m93651a().mo92046a("received_http_error", hashMap);
            Log.m165383e("LarkWebViewClient", stringBuffer.toString());
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar = this.f48467d;
        if (aVar != null && (webView instanceof LarkWebView)) {
            aVar.mo50976a((LarkWebView) webView, i, str, str2);
        }
        AbstractC25855f fVar = this.f48465b;
        if (fVar != null) {
            fVar.mo67349a(webView, i, str, str2);
        }
    }
}
