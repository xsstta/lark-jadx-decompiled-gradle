package im.delight.android.webview;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

public class AdvancedWebView extends WebView {

    /* renamed from: a */
    protected static final String[] f171438a = {"org.mozilla.firefox", "com.android.chrome", "com.opera.browser", "org.mozilla.firefox_beta", "com.chrome.beta", "com.opera.browser.beta"};

    /* renamed from: b */
    protected WeakReference<Activity> f171439b;

    /* renamed from: c */
    protected WeakReference<Fragment> f171440c;

    /* renamed from: d */
    protected AbstractC68228a f171441d;

    /* renamed from: e */
    protected final List<String> f171442e = new LinkedList();

    /* renamed from: f */
    protected ValueCallback<Uri> f171443f;

    /* renamed from: g */
    protected ValueCallback<Uri[]> f171444g;

    /* renamed from: h */
    protected long f171445h;

    /* renamed from: i */
    protected String f171446i;

    /* renamed from: j */
    protected int f171447j = 51426;

    /* renamed from: k */
    protected WebViewClient f171448k;

    /* renamed from: l */
    protected WebChromeClient f171449l;

    /* renamed from: m */
    protected boolean f171450m;

    /* renamed from: n */
    protected String f171451n = "*/*";

    /* renamed from: o */
    protected final Map<String, String> f171452o = new HashMap();

    /* renamed from: im.delight.android.webview.AdvancedWebView$a */
    public interface AbstractC68228a {
        /* renamed from: a */
        void mo237173a(int i, String str, String str2);

        /* renamed from: a */
        void mo237174a(String str);

        /* renamed from: a */
        void mo237175a(String str, Bitmap bitmap);

        /* renamed from: a */
        void mo237176a(String str, String str2, String str3, long j, String str4, String str5);

        /* renamed from: b */
        void mo237177b(String str);
    }

    public List<String> getPermittedHostnames() {
        return this.f171442e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo237112b() {
        this.f171445h = System.currentTimeMillis();
    }

    public void onPause() {
        pauseTimers();
        if (Build.VERSION.SDK_INT >= 11) {
            super.onPause();
        }
    }

    public void onResume() {
        if (Build.VERSION.SDK_INT >= 11) {
            super.onResume();
        }
        resumeTimers();
    }

    protected static String getLanguageIso3() {
        try {
            return Locale.getDefault().getISO3Language().toLowerCase(Locale.US);
        } catch (MissingResourceException unused) {
            return "eng";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo237114c() {
        if (this.f171445h + 500 >= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo237108a() {
        Activity activity;
        WeakReference<Fragment> weakReference = this.f171440c;
        if (weakReference == null || weakReference.get() == null || Build.VERSION.SDK_INT < 11 || this.f171440c.get().getActivity() == null) {
            WeakReference<Activity> weakReference2 = this.f171439b;
            if (weakReference2 != null && weakReference2.get() != null) {
                activity = this.f171439b.get();
            } else {
                return;
            }
        } else {
            activity = this.f171440c.get().getActivity();
        }
        getSettings().setGeolocationDatabasePath(activity.getFilesDir().getPath());
    }

    /* access modifiers changed from: protected */
    public String getFileUploadPromptLabel() {
        try {
            if (this.f171446i.equals("zho")) {
                return m264860b("6YCJ5oup5LiA5Liq5paH5Lu2");
            }
            if (this.f171446i.equals("spa")) {
                return m264860b("RWxpamEgdW4gYXJjaGl2bw==");
            }
            if (this.f171446i.equals("hin")) {
                return m264860b("4KSP4KSVIOCkq+CkvOCkvuCkh+CksiDgpJrgpYHgpKjgpYfgpII=");
            }
            if (this.f171446i.equals("ben")) {
                return m264860b("4KaP4KaV4Kaf4Ka/IOCmq+CmvuCmh+CmsiDgpqjgpr/gprDgp43gpqzgpr7gpprgpqg=");
            }
            if (this.f171446i.equals("ara")) {
                return m264860b("2KfYrtiq2YrYp9ixINmF2YTZgSDZiNin2K3Yrw==");
            }
            if (this.f171446i.equals("por")) {
                return m264860b("RXNjb2xoYSB1bSBhcnF1aXZv");
            }
            if (this.f171446i.equals("rus")) {
                return m264860b("0JLRi9Cx0LXRgNC40YLQtSDQvtC00LjQvSDRhNCw0LnQuw==");
            }
            if (this.f171446i.equals("jpn")) {
                return m264860b("MeODleOCoeOCpOODq+OCkumBuOaKnuOBl+OBpuOBj+OBoOOBleOBhA==");
            }
            if (this.f171446i.equals("pan")) {
                return m264860b("4KiH4Kmx4KiVIOCoq+CovuCoh+CosiDgqJrgqYHgqKPgqYs=");
            }
            if (this.f171446i.equals("deu")) {
                return m264860b("V8OkaGxlIGVpbmUgRGF0ZWk=");
            }
            if (this.f171446i.equals("jav")) {
                return m264860b("UGlsaWggc2lqaSBiZXJrYXM=");
            }
            if (this.f171446i.equals("msa")) {
                return m264860b("UGlsaWggc2F0dSBmYWls");
            }
            if (this.f171446i.equals("tel")) {
                return m264860b("4LCS4LCVIOCwq+CxhuCxluCwsuCxjeCwqOCxgSDgsI7gsILgsJrgsYHgsJXgsYvgsILgsKHgsL8=");
            }
            if (this.f171446i.equals("vie")) {
                return m264860b("Q2jhu41uIG3hu5l0IHThuq1wIHRpbg==");
            }
            if (this.f171446i.equals("kor")) {
                return m264860b("7ZWY64KY7J2YIO2MjOydvOydhCDshKDtg50=");
            }
            if (this.f171446i.equals("fra")) {
                return m264860b("Q2hvaXNpc3NleiB1biBmaWNoaWVy");
            }
            if (this.f171446i.equals("mar")) {
                return m264860b("4KSr4KS+4KSH4KSyIOCkqOCkv+CkteCkoeCkvg==");
            }
            if (this.f171446i.equals("tam")) {
                return m264860b("4K6S4K6w4K+BIOCuleCvh+CuvuCuquCvjeCuquCviCDgrqTgr4fgrrDgr43grrXgr4E=");
            }
            if (this.f171446i.equals("urd")) {
                return m264860b("2KfbjNqpINmB2KfYptmEINmF24zauiDYs9uSINin2YbYqtiu2KfYqCDaqdix24zaug==");
            }
            if (this.f171446i.equals("fas")) {
                return m264860b("2LHYpyDYp9mG2KrYrtin2Kgg2qnZhtuM2K8g24zaqSDZgdin24zZhA==");
            }
            if (this.f171446i.equals("tur")) {
                return m264860b("QmlyIGRvc3lhIHNlw6dpbg==");
            }
            if (this.f171446i.equals("ita")) {
                return m264860b("U2NlZ2xpIHVuIGZpbGU=");
            }
            if (this.f171446i.equals("tha")) {
                return m264860b("4LmA4Lil4Li34Lit4LiB4LmE4Lif4Lil4LmM4Lir4LiZ4Li24LmI4LiH");
            }
            if (this.f171446i.equals("guj")) {
                return m264860b("4KqP4KqVIOCqq+CqvuCqh+CqsuCqqOCrhyDgqqrgqrjgqoLgqqY=");
            }
            return "Choose a file";
        } catch (Exception unused) {
            return "Choose a file";
        }
    }

    public void setUploadableFileTypes(String str) {
        this.f171451n = str;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f171449l = webChromeClient;
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.f171448k = webViewClient;
    }

    public void setCookiesEnabled(boolean z) {
        CookieManager.getInstance().setAcceptCookie(z);
    }

    public void setMixedContentAllowed(boolean z) {
        mo237113b(getSettings(), z);
    }

    /* renamed from: b */
    protected static String m264860b(String str) throws IllegalArgumentException, UnsupportedEncodingException {
        return new String(Base64.decode(str, 0), "UTF-8");
    }

    public void setThirdPartyCookiesEnabled(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, z);
        }
    }

    public AdvancedWebView(Context context) {
        super(context);
        mo237109a(context);
    }

    public void loadUrl(String str) {
        if (this.f171452o.size() > 0) {
            super.loadUrl(str, this.f171452o);
        } else {
            super.loadUrl(str);
        }
    }

    public void setGeolocationEnabled(boolean z) {
        if (z) {
            getSettings().setJavaScriptEnabled(true);
            getSettings().setGeolocationEnabled(true);
            mo237108a();
        }
        this.f171450m = z;
    }

    public void setDesktopMode(boolean z) {
        String str;
        WebSettings settings = getSettings();
        if (z) {
            str = settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA");
        } else {
            str = settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android");
        }
        settings.setUserAgentString(str);
        settings.setUseWideViewPort(z);
        settings.setLoadWithOverviewMode(z);
        settings.setSupportZoom(z);
        settings.setBuiltInZoomControls(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo237109a(Context context) {
        if (!isInEditMode()) {
            if (context instanceof Activity) {
                this.f171439b = new WeakReference<>((Activity) context);
            }
            this.f171446i = getLanguageIso3();
            setFocusable(true);
            setFocusableInTouchMode(true);
            setSaveEnabled(true);
            String path = context.getFilesDir().getPath();
            String str = path.substring(0, path.lastIndexOf("/")) + "/databases";
            WebSettings settings = getSettings();
            settings.setAllowFileAccess(false);
            m264859a(settings, false);
            settings.setBuiltInZoomControls(false);
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            if (Build.VERSION.SDK_INT < 18) {
                settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            }
            settings.setDatabaseEnabled(true);
            if (Build.VERSION.SDK_INT < 19) {
                settings.setDatabasePath(str);
            }
            mo237113b(settings, true);
            setThirdPartyCookiesEnabled(true);
            super.setWebViewClient(new WebViewClient() {
                /* class im.delight.android.webview.AdvancedWebView.C682251 */

                public void onLoadResource(WebView webView, String str) {
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onLoadResource(webView, str);
                    } else {
                        super.onLoadResource(webView, str);
                    }
                }

                public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
                    if (Build.VERSION.SDK_INT < 21) {
                        return;
                    }
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onReceivedClientCertRequest(webView, clientCertRequest);
                    } else {
                        super.onReceivedClientCertRequest(webView, clientCertRequest);
                    }
                }

                public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onUnhandledKeyEvent(webView, keyEvent);
                    } else {
                        super.onUnhandledKeyEvent(webView, keyEvent);
                    }
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    if (Build.VERSION.SDK_INT < 21) {
                        return null;
                    }
                    if (AdvancedWebView.this.f171448k != null) {
                        return AdvancedWebView.this.f171448k.shouldInterceptRequest(webView, webResourceRequest);
                    }
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }

                public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
                    if (AdvancedWebView.this.f171448k != null) {
                        return AdvancedWebView.this.f171448k.shouldOverrideKeyEvent(webView, keyEvent);
                    }
                    return super.shouldOverrideKeyEvent(webView, keyEvent);
                }

                public void onPageFinished(WebView webView, String str) {
                    if (!AdvancedWebView.this.mo237114c() && AdvancedWebView.this.f171441d != null) {
                        AdvancedWebView.this.f171441d.mo237174a(str);
                    }
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onPageFinished(webView, str);
                    }
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    if (Build.VERSION.SDK_INT < 11) {
                        return null;
                    }
                    if (AdvancedWebView.this.f171448k != null) {
                        return AdvancedWebView.this.f171448k.shouldInterceptRequest(webView, str);
                    }
                    return super.shouldInterceptRequest(webView, str);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!AdvancedWebView.this.mo237111a(str)) {
                        if (AdvancedWebView.this.f171441d != null) {
                            AdvancedWebView.this.f171441d.mo237177b(str);
                        }
                        return true;
                    } else if (AdvancedWebView.this.f171448k != null && AdvancedWebView.this.f171448k.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    } else {
                        webView.loadUrl(str);
                        return true;
                    }
                }

                public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.doUpdateVisitedHistory(webView, str, z);
                    } else {
                        super.doUpdateVisitedHistory(webView, str, z);
                    }
                }

                public void onFormResubmission(WebView webView, Message message, Message message2) {
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onFormResubmission(webView, message, message2);
                    } else {
                        super.onFormResubmission(webView, message, message2);
                    }
                }

                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onReceivedSslError(webView, sslErrorHandler, sslError);
                    } else {
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }
                }

                public void onScaleChanged(WebView webView, float f, float f2) {
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onScaleChanged(webView, f, f2);
                    } else {
                        super.onScaleChanged(webView, f, f2);
                    }
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    if (!AdvancedWebView.this.mo237114c() && AdvancedWebView.this.f171441d != null) {
                        AdvancedWebView.this.f171441d.mo237175a(str, bitmap);
                    }
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onPageStarted(webView, str, bitmap);
                    }
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    AdvancedWebView.this.mo237112b();
                    if (AdvancedWebView.this.f171441d != null) {
                        AdvancedWebView.this.f171441d.mo237173a(i, str, str2);
                    }
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onReceivedError(webView, i, str, str2);
                    }
                }

                public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                    } else {
                        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                    }
                }

                public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
                    if (Build.VERSION.SDK_INT < 12) {
                        return;
                    }
                    if (AdvancedWebView.this.f171448k != null) {
                        AdvancedWebView.this.f171448k.onReceivedLoginRequest(webView, str, str2, str3);
                    } else {
                        super.onReceivedLoginRequest(webView, str, str2, str3);
                    }
                }
            });
            super.setWebChromeClient(new WebChromeClient() {
                /* class im.delight.android.webview.AdvancedWebView.C682262 */

                public Bitmap getDefaultVideoPoster() {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.getDefaultVideoPoster();
                    }
                    return super.getDefaultVideoPoster();
                }

                public View getVideoLoadingProgressView() {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.getVideoLoadingProgressView();
                    }
                    return super.getVideoLoadingProgressView();
                }

                public void onGeolocationPermissionsHidePrompt() {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onGeolocationPermissionsHidePrompt();
                    } else {
                        super.onGeolocationPermissionsHidePrompt();
                    }
                }

                public void onHideCustomView() {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onHideCustomView();
                    } else {
                        super.onHideCustomView();
                    }
                }

                public boolean onJsTimeout() {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.onJsTimeout();
                    }
                    return super.onJsTimeout();
                }

                @Override // android.webkit.WebChromeClient
                public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.getVisitedHistory(valueCallback);
                    } else {
                        super.getVisitedHistory(valueCallback);
                    }
                }

                public void onCloseWindow(WebView webView) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onCloseWindow(webView);
                    } else {
                        super.onCloseWindow(webView);
                    }
                }

                public void onPermissionRequest(PermissionRequest permissionRequest) {
                    if (Build.VERSION.SDK_INT < 21) {
                        return;
                    }
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onPermissionRequest(permissionRequest);
                    } else {
                        super.onPermissionRequest(permissionRequest);
                    }
                }

                public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                    if (Build.VERSION.SDK_INT < 21) {
                        return;
                    }
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onPermissionRequestCanceled(permissionRequest);
                    } else {
                        super.onPermissionRequestCanceled(permissionRequest);
                    }
                }

                public void onRequestFocus(WebView webView) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onRequestFocus(webView);
                    } else {
                        super.onRequestFocus(webView);
                    }
                }

                public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.onConsoleMessage(consoleMessage);
                    }
                    return super.onConsoleMessage(consoleMessage);
                }

                public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    if (AdvancedWebView.this.f171450m) {
                        callback.invoke(str, true, false);
                    } else if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onGeolocationPermissionsShowPrompt(str, callback);
                    } else {
                        super.onGeolocationPermissionsShowPrompt(str, callback);
                    }
                }

                public void onProgressChanged(WebView webView, int i) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onProgressChanged(webView, i);
                    } else {
                        super.onProgressChanged(webView, i);
                    }
                }

                public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onReceivedIcon(webView, bitmap);
                    } else {
                        super.onReceivedIcon(webView, bitmap);
                    }
                }

                public void onReceivedTitle(WebView webView, String str) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onReceivedTitle(webView, str);
                    } else {
                        super.onReceivedTitle(webView, str);
                    }
                }

                public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onShowCustomView(view, customViewCallback);
                    } else {
                        super.onShowCustomView(view, customViewCallback);
                    }
                }

                public void onConsoleMessage(String str, int i, String str2) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onConsoleMessage(str, i, str2);
                    } else {
                        super.onConsoleMessage(str, i, str2);
                    }
                }

                public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
                    } else {
                        super.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
                    }
                }

                public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onReceivedTouchIconUrl(webView, str, z);
                    } else {
                        super.onReceivedTouchIconUrl(webView, str, z);
                    }
                }

                public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
                    if (Build.VERSION.SDK_INT < 14) {
                        return;
                    }
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onShowCustomView(view, i, customViewCallback);
                    } else {
                        super.onShowCustomView(view, i, customViewCallback);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    boolean z = false;
                    if (Build.VERSION.SDK_INT < 21) {
                        return false;
                    }
                    if (fileChooserParams.getMode() == 1) {
                        z = true;
                    }
                    AdvancedWebView.this.mo237110a(null, valueCallback, z);
                    return true;
                }

                public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.onCreateWindow(webView, z, z2, message);
                    }
                    return super.onCreateWindow(webView, z, z2, message);
                }

                public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.onJsAlert(webView, str, str2, jsResult);
                    }
                    return super.onJsAlert(webView, str, str2, jsResult);
                }

                public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.onJsBeforeUnload(webView, str, str2, jsResult);
                    }
                    return super.onJsBeforeUnload(webView, str, str2, jsResult);
                }

                public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.onJsConfirm(webView, str, str2, jsResult);
                    }
                    return super.onJsConfirm(webView, str, str2, jsResult);
                }

                public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    if (AdvancedWebView.this.f171449l != null) {
                        return AdvancedWebView.this.f171449l.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                    }
                    return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                }

                public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
                    if (AdvancedWebView.this.f171449l != null) {
                        AdvancedWebView.this.f171449l.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                    } else {
                        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                    }
                }
            });
            setDownloadListener(new DownloadListener() {
                /* class im.delight.android.webview.AdvancedWebView.C682273 */

                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    String guessFileName = URLUtil.guessFileName(str, str3, str4);
                    if (AdvancedWebView.this.f171441d != null) {
                        AdvancedWebView.this.f171441d.mo237176a(str, guessFileName, str4, j, str3, str2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo237111a(String str) {
        if (this.f171442e.size() == 0) {
            return true;
        }
        String host = Uri.parse(str).getHost();
        for (String str2 : this.f171442e) {
            if (!host.equals(str2)) {
                if (host.endsWith("." + str2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected static void m264859a(WebSettings webSettings, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            webSettings.setAllowFileAccessFromFileURLs(z);
            webSettings.setAllowUniversalAccessFromFileURLs(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo237113b(WebSettings webSettings, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(!z ? 1 : 0);
        }
    }

    public AdvancedWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo237109a(context);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (map == null) {
            map = this.f171452o;
        } else if (this.f171452o.size() > 0) {
            map.putAll(this.f171452o);
        }
        super.loadUrl(str, map);
    }

    public AdvancedWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo237109a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo237110a(ValueCallback<Uri> valueCallback, ValueCallback<Uri[]> valueCallback2, boolean z) {
        ValueCallback<Uri> valueCallback3 = this.f171443f;
        if (valueCallback3 != null) {
            valueCallback3.onReceiveValue(null);
        }
        this.f171443f = valueCallback;
        ValueCallback<Uri[]> valueCallback4 = this.f171444g;
        if (valueCallback4 != null) {
            valueCallback4.onReceiveValue(null);
        }
        this.f171444g = valueCallback2;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (z && Build.VERSION.SDK_INT >= 18) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        intent.setType(this.f171451n);
        WeakReference<Fragment> weakReference = this.f171440c;
        if (weakReference == null || weakReference.get() == null || Build.VERSION.SDK_INT < 11) {
            WeakReference<Activity> weakReference2 = this.f171439b;
            if (weakReference2 != null && weakReference2.get() != null) {
                this.f171439b.get().startActivityForResult(Intent.createChooser(intent, getFileUploadPromptLabel()), this.f171447j);
                return;
            }
            return;
        }
        this.f171440c.get().startActivityForResult(Intent.createChooser(intent, getFileUploadPromptLabel()), this.f171447j);
    }
}
