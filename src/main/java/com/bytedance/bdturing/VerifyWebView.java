package com.bytedance.bdturing;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.bdturing.BdTuringConfig;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;

public class VerifyWebView extends WebView {

    /* renamed from: a */
    private C3550g f11126a;

    /* renamed from: b */
    private WebChromeClient f11127b = new WebChromeClient() {
        /* class com.bytedance.bdturing.VerifyWebView.C35183 */

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }
    };

    /* renamed from: c */
    private WebViewClient f11128c = new WebViewClient() {
        /* class com.bytedance.bdturing.VerifyWebView.C35194 */

        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str.toLowerCase().contains("/favicon.ico")) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public void onPageFinished(WebView webView, String str) {
            LogUtil.m14895a("VerifyWebView", "onPageFinished ");
            if (!VerifyWebView.this.f11130g && !VerifyWebView.this.f11131h) {
                VerifyWebView.this.f11131h = true;
                VerifyWebView.this.f11129f.mo14250a();
            }
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            LogUtil.m14895a("VerifyWebView", "onPageStarted ");
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (LogUtil.m14896a()) {
                VerifyWebView.this.getContext();
            }
            if (VerifyWebView.this.f11132i != null && (VerifyWebView.this.f11132i instanceof TwiceVerifyWebActivity)) {
                int i = 0;
                try {
                    i = webResourceResponse.getStatusCode();
                } catch (Throwable unused) {
                }
                ((TwiceVerifyWebActivity) VerifyWebView.this.f11132i).mo14417a(i);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            try {
                if (!webResourceRequest.getUrl().toString().toLowerCase().contains("/favicon.ico")) {
                }
            } catch (Exception e) {
                LogUtil.m14894a(e);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (LogUtil.m14896a()) {
                Context context = VerifyWebView.this.getContext();
                Toast.makeText(context, "onReceivedSslError : " + sslError, 1).show();
            }
            if (VerifyWebView.this.f11132i != null && (VerifyWebView.this.f11132i instanceof TwiceVerifyWebActivity)) {
                int i = 0;
                try {
                    i = sslError.getPrimaryError();
                } catch (Throwable unused) {
                }
                ((TwiceVerifyWebActivity) VerifyWebView.this.f11132i).mo14417a(i);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            VerifyWebView.this.f11130g = true;
            LogUtil.m14895a("VerifyWebView", i + " onReceivedError " + str);
            AbstractC3571m mVar = VerifyWebView.this.f11129f;
            mVar.mo14251a(i, str + "|" + str2);
            if (VerifyWebView.this.f11132i != null && (VerifyWebView.this.f11132i instanceof TwiceVerifyWebActivity)) {
                ((TwiceVerifyWebActivity) VerifyWebView.this.f11132i).mo14417a(i);
            }
            super.onReceivedError(webView, i, str, str2);
        }
    };

    /* renamed from: f */
    public AbstractC3571m f11129f;

    /* renamed from: g */
    public boolean f11130g;

    /* renamed from: h */
    protected boolean f11131h;

    /* renamed from: i */
    public Activity f11132i;

    public void setOnTouchListener(C3550g gVar) {
        this.f11126a = gVar;
    }

    public void setParentActivity(Activity activity) {
        this.f11132i = activity;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C3550g gVar = this.f11126a;
        if (gVar != null) {
            gVar.mo14358a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public VerifyWebView(Context context) {
        super(context, null);
    }

    /* renamed from: a */
    public void mo14257a(AbstractC3571m mVar) {
        this.f11129f = mVar;
        WebSettings settings = getSettings();
        boolean z = true;
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setTextZoom(100);
        if (C3520a.m14831a().mo14275c().mo14210b() != BdTuringConfig.RegionType.REGION_BOE) {
            z = false;
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        try {
            setOverScrollMode(2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (LogUtil.m14896a()) {
            setWebChromeClient(this.f11127b);
        }
        setWebViewClient(this.f11128c);
    }

    public VerifyWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo14256a(int i, int i2, int i3, int i4) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new TypeEvaluator<int[]>() {
            /* class com.bytedance.bdturing.VerifyWebView.C35161 */

            /* renamed from: a */
            public int[] evaluate(float f, int[] iArr, int[] iArr2) {
                int length = iArr.length;
                int[] iArr3 = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr3[i] = (int) (((float) iArr[i]) + (((float) (iArr2[i] - iArr[i])) * f));
                }
                return iArr3;
            }
        }, new int[]{i3, i4}, new int[]{i, i2});
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.bdturing.VerifyWebView.C35172 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = VerifyWebView.this.getLayoutParams();
                int[] iArr = (int[]) valueAnimator.getAnimatedValue();
                layoutParams.width = iArr[0];
                layoutParams.height = iArr[1];
                VerifyWebView.this.setLayoutParams(layoutParams);
            }
        });
        ofObject.setDuration(300L).start();
    }
}
