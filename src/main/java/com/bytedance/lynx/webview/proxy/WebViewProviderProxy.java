package com.bytedance.lynx.webview.proxy;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewProvider;
import com.bytedance.lynx.webview.internal.C19981o;
import com.bytedance.lynx.webview.internal.C19999w;
import com.bytedance.lynx.webview.internal.C20021z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WebViewProviderProxy {

    /* renamed from: a */
    private WebView f48937a;

    /* renamed from: b */
    private C19999w f48938b;
    public WebViewProvider.ViewDelegate realViewDelegate;
    public ViewDelegateProxy realViewDelegateProxy;
    public WebViewProvider realWebViewProvider;
    public C20021z webViewClientWrapper;

    public interface RealGetter {
        WebViewProvider getRealWebViewProvider();
    }

    public C19999w getSdkDebug() {
        if (this.f48938b == null) {
            this.f48938b = new C19999w(this.f48937a);
        }
        return this.f48938b;
    }

    public WebViewProvider getWebViewProvider() {
        C200241 r0 = new InvocationHandler() {
            /* class com.bytedance.lynx.webview.proxy.WebViewProviderProxy.C200241 */

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                String name = method.getName();
                if ("destroy".equals(name)) {
                    C19981o.m72875b();
                    return method.invoke(WebViewProviderProxy.this.realWebViewProvider, objArr);
                } else if ("loadUrl".equals(name)) {
                    if (WebViewProviderProxy.this.getSdkDebug().mo67884a((String) objArr[0])) {
                        return null;
                    }
                    return method.invoke(WebViewProviderProxy.this.realWebViewProvider, objArr);
                } else if ("goBack".equals(name)) {
                    if (WebViewProviderProxy.this.getSdkDebug().mo67883a()) {
                        return null;
                    }
                    return method.invoke(WebViewProviderProxy.this.realWebViewProvider, objArr);
                } else if ("setWebViewClient".equals(name)) {
                    WebViewClient webViewClient = (WebViewClient) objArr[0];
                    if (webViewClient == null) {
                        WebViewProviderProxy.this.realWebViewProvider.setWebViewClient(webViewClient);
                        return null;
                    }
                    if (webViewClient instanceof C20021z) {
                        WebViewProviderProxy.this.webViewClientWrapper = (C20021z) webViewClient;
                    } else {
                        WebViewProviderProxy.this.webViewClientWrapper = new C20021z(webViewClient);
                    }
                    WebViewProviderProxy.this.realWebViewProvider.setWebViewClient(WebViewProviderProxy.this.webViewClientWrapper);
                    return null;
                } else if ("getViewDelegate".equals(name)) {
                    WebViewProvider.ViewDelegate viewDelegate = WebViewProviderProxy.this.realWebViewProvider.getViewDelegate();
                    if (viewDelegate == null) {
                        return viewDelegate;
                    }
                    if (WebViewProviderProxy.this.realViewDelegate != null && viewDelegate.equals(WebViewProviderProxy.this.realViewDelegate)) {
                        return WebViewProviderProxy.this.realViewDelegateProxy.getViewDelegate();
                    }
                    WebViewProviderProxy webViewProviderProxy = WebViewProviderProxy.this;
                    webViewProviderProxy.realViewDelegate = webViewProviderProxy.realWebViewProvider.getViewDelegate();
                    WebViewProviderProxy webViewProviderProxy2 = WebViewProviderProxy.this;
                    webViewProviderProxy2.realViewDelegateProxy = new ViewDelegateProxy(webViewProviderProxy2.realViewDelegate);
                    return WebViewProviderProxy.this.realViewDelegateProxy.getViewDelegate();
                } else if ("getRealWebViewProvider".equals(name)) {
                    return WebViewProviderProxy.this.realWebViewProvider;
                } else {
                    return method.invoke(WebViewProviderProxy.this.realViewDelegate, objArr);
                }
            }
        };
        return (WebViewProvider) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{WebViewProvider.class, RealGetter.class}, r0);
    }

    public WebViewProviderProxy(WebView webView, WebViewProvider webViewProvider) {
        this.realWebViewProvider = webViewProvider;
        this.f48937a = webView;
    }
}
