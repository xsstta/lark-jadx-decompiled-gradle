package com.bytedance.ee.bear.document;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.bytedance.ee.bear.document.i */
public class C5817i extends WebViewClient {
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView instanceof DocBridgeWebViewV2) {
            ((DocBridgeWebViewV2) webView).mo22335a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
        }
        if (!renderProcessGoneDetail.didCrash()) {
            C13479a.m54758a("DocWebViewClient", "System killed the WebView======= not crashed");
            return true;
        }
        C13479a.m54758a("DocWebViewClient", "System killed the WebView======= crashed");
        return true;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C13479a.m54772d("DocWebViewClient", "start page load, ");
        if (!TextUtils.equals(str, "javascript:clear()")) {
            C13479a.m54772d("DocWebViewClient", "set webview visible");
            webView.setVisibility(0);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int statusCode = webResourceResponse.getStatusCode();
        C13479a.m54775e("DocWebViewClient", "onReceivedHttpError: received error, error = " + statusCode + ", url = ");
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        int primaryError = sslError.getPrimaryError() + HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        C13479a.m54775e("DocWebViewClient", "onReceivedSslError: received error, error = " + primaryError + "， url = ");
    }
}
