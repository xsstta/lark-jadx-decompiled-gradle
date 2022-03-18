package androidx.webkit;

import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.C1622c;
import androidx.webkit.internal.C1623d;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Retention(RetentionPolicy.SOURCE)
    public @interface SafeBrowsingThreat {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            onReceivedError(webView, webResourceRequest, new C1623d(webResourceError));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, new C1623d(invocationHandler));
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
        if (Build.VERSION.SDK_INT >= 21 && WebViewFeature.m7324a("WEB_RESOURCE_ERROR_GET_CODE") && WebViewFeature.m7324a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceErrorCompat.getErrorCode(), webResourceErrorCompat.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i, new C1622c(safeBrowsingResponse));
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, AbstractC1618a aVar) {
        if (WebViewFeature.m7324a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            aVar.mo8379a(true);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i, new C1622c(invocationHandler));
    }
}
