package com.ss.android.vc.meeting.module.follow.universal;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.bear.jsbridge.BridgeWebViewV2;

public class UniversalWebView extends BridgeWebViewV2 {

    /* renamed from: a */
    public AbstractC61854a f155294a;

    /* renamed from: b */
    private C61856c f155295b;

    /* renamed from: c */
    private C61855b f155296c;

    /* renamed from: com.ss.android.vc.meeting.module.follow.universal.UniversalWebView$a */
    public interface AbstractC61854a {
        /* renamed from: a */
        void mo214211a(int i, String str);

        /* renamed from: b */
        boolean mo214212b(String str);

        /* renamed from: c */
        void mo214213c(String str);

        /* renamed from: d */
        void mo214214d();

        /* renamed from: e */
        void mo214215e();
    }

    /* renamed from: a */
    private void m241631a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        setWebViewClient(this.f155295b);
        setWebChromeClient(this.f155296c);
    }

    public void setLoadingCallback(AbstractC61854a aVar) {
        this.f155294a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.follow.universal.UniversalWebView$b */
    public class C61855b extends WebChromeClient {
        private C61855b() {
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (UniversalWebView.this.f155294a != null) {
                UniversalWebView.this.f155294a.mo214213c(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.follow.universal.UniversalWebView$c */
    public class C61856c extends WebViewClient {
        private C61856c() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (UniversalWebView.this.f155294a != null) {
                UniversalWebView.this.f155294a.mo214215e();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (UniversalWebView.this.f155294a != null) {
                return UniversalWebView.this.f155294a.mo214212b(str);
            }
            return false;
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            if (UniversalWebView.this.f155294a != null) {
                UniversalWebView.this.f155294a.mo214212b(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (UniversalWebView.this.f155294a != null) {
                UniversalWebView.this.f155294a.mo214214d();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (UniversalWebView.this.f155294a != null) {
                UniversalWebView.this.f155294a.mo214211a(i, str);
            }
        }
    }

    public UniversalWebView(Context context) {
        super(context);
        m241632a(context);
    }

    /* renamed from: a */
    private void m241632a(Context context) {
        this.f155295b = new C61856c();
        this.f155296c = new C61855b();
        m241631a();
    }

    public UniversalWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m241632a(context);
    }
}
