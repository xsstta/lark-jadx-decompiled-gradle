package com.bytedance.lynx.webview.glue;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.TokenBindingService;
import android.webkit.TracingController;
import android.webkit.WebIconDatabase;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import android.webkit.WebViewFactoryProvider;
import android.webkit.WebViewProvider;
import com.bytedance.lynx.webview.glue.WebViewType;
import com.bytedance.lynx.webview.internal.C19986s;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.proxy.WebViewProviderProxy;
import java.lang.reflect.Method;

public class TTWebProviderWrapper implements WebViewFactoryProvider {

    /* renamed from: a */
    private volatile WebViewFactoryProvider f48706a;

    /* renamed from: b */
    private ProviderCallback f48707b;

    /* renamed from: c */
    private EventCallback f48708c;

    /* renamed from: d */
    private Handler f48709d;

    /* renamed from: e */
    private boolean f48710e;

    /* renamed from: f */
    private boolean f48711f;

    /* renamed from: g */
    private boolean f48712g;
    public ConditionVariable mCondition;
    public Runnable mInitCallback;

    public interface EventCallback {
        void sendEnsureTime(long j);
    }

    public interface ProviderCallback {
        WebViewFactoryProvider getGlueProvider();

        WebViewFactoryProvider getSysProvider();
    }

    public TracingController getTracingController() {
        ensureFactoryProviderCreated(false);
        return this.f48706a.getTracingController();
    }

    public ClassLoader getWebViewClassLoader() {
        ensureFactoryProviderCreated(false);
        return this.f48706a.getWebViewClassLoader();
    }

    public void asyncTriggerEnsure() {
        if (this.mInitCallback != null && this.f48709d != null) {
            this.mCondition = new ConditionVariable();
            this.f48709d.post(new Runnable() {
                /* class com.bytedance.lynx.webview.glue.TTWebProviderWrapper.RunnableC199361 */

                public void run() {
                    try {
                        TTWebProviderWrapper.this.mInitCallback.run();
                    } catch (Throwable th) {
                        TTWebProviderWrapper.this.mCondition.open();
                        throw th;
                    }
                    TTWebProviderWrapper.this.mCondition.open();
                }
            });
        }
    }

    public CookieManager getCookieManager() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return this.f48706a.getCookieManager();
    }

    public GeolocationPermissions getGeolocationPermissions() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return this.f48706a.getGeolocationPermissions();
    }

    public ServiceWorkerController getServiceWorkerController() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return GlueApiHelperForO.createServiceWorkerController(this.f48706a);
    }

    public WebViewFactoryProvider.Statics getStatics() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return this.f48706a.getStatics();
    }

    public CookieManager getSysCookieManager() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return this.f48707b.getSysProvider().getCookieManager();
    }

    public TokenBindingService getTokenBindingService() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return GlueApiHelperForO.createTokenBindingService(this.f48706a);
    }

    public WebIconDatabase getWebIconDatabase() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return this.f48706a.getWebIconDatabase();
    }

    public WebStorage getWebStorage() {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return this.f48706a.getWebStorage();
    }

    public boolean isSoSupportProxyProvider() {
        if (this.f48711f) {
            return this.f48712g;
        }
        this.f48711f = true;
        ISdkToGlue e = C20011y.m72976a().mo67902F().mo67781e();
        if (e != null) {
            this.f48712g = e.isFeatureSupport("support_proxy_webview_provider", 1);
        }
        return this.f48712g;
    }

    public void resetGlueProvider(WebViewFactoryProvider webViewFactoryProvider) {
        this.f48706a = webViewFactoryProvider;
    }

    public TTWebProviderWrapper(boolean z) {
        this.f48710e = z;
    }

    public WebViewDatabase getWebViewDatabase(Context context) {
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        return this.f48706a.getWebViewDatabase(context);
    }

    public boolean isSuitableTTWebViewProvider(WebViewProvider webViewProvider) {
        if (!webViewProvider.getClass().getName().startsWith("com.bytedance") || !isSoSupportProxyProvider()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r6 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r6.sendEnsureTime(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r6 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ensureFactoryProviderCreated(boolean r6) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.glue.TTWebProviderWrapper.ensureFactoryProviderCreated(boolean):void");
    }

    public WebViewProvider createWebView(WebView webView, WebView.PrivateAccess privateAccess) {
        WebViewProvider webViewProvider = null;
        if (this.f48710e) {
            return null;
        }
        ensureFactoryProviderCreated(false);
        if (webView instanceof DedicatedWebView) {
            try {
                Method declaredMethod = this.f48706a.getClass().getDeclaredMethod("createWebView", WebView.class, WebView.PrivateAccess.class, Boolean.TYPE);
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    webViewProvider = (WebViewProvider) declaredMethod.invoke(this.f48706a, webView, privateAccess, true);
                }
            } catch (Throwable th) {
                Log.d("TTWebProviderWrapper", "createWebView: ", th);
            }
        } else if (webView instanceof WebViewType.SystemWebView) {
            webViewProvider = this.f48707b.getSysProvider().createWebView(webView, privateAccess);
        }
        if (webViewProvider == null) {
            webViewProvider = this.f48706a.createWebView(webView, privateAccess);
        }
        boolean a = C19986s.m72924a().mo67858a("sdk_enable_web_provider_proxy", false);
        if (webView instanceof WebViewType.NoProxyWebView) {
            a &= isSuitableTTWebViewProvider(webViewProvider);
        }
        if (a) {
            return new WebViewProviderProxy(webView, webViewProvider).getWebViewProvider();
        }
        return webViewProvider;
    }

    public TTWebProviderWrapper(Handler handler, Runnable runnable, ProviderCallback providerCallback, EventCallback eventCallback) {
        this.mInitCallback = runnable;
        this.f48707b = providerCallback;
        this.f48708c = eventCallback;
        this.f48709d = handler;
    }
}
