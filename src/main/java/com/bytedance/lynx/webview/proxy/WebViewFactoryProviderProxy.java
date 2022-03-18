package com.bytedance.lynx.webview.proxy;

import android.webkit.TracingController;
import android.webkit.WebView;
import android.webkit.WebViewFactoryProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WebViewFactoryProviderProxy {

    /* renamed from: a */
    private WebViewFactoryProvider f48935a;
    public WebViewFactoryProvider realWebViewFactoryProver;

    public WebViewFactoryProvider getWebViewFactoryProvider() {
        return this.f48935a;
    }

    public TracingController getTracingController() {
        return this.realWebViewFactoryProver.getTracingController();
    }

    public ClassLoader getWebViewClassLoader() {
        return this.realWebViewFactoryProver.getWebViewClassLoader();
    }

    public WebViewFactoryProviderProxy(WebViewFactoryProvider webViewFactoryProvider) {
        this.realWebViewFactoryProver = webViewFactoryProvider;
        C200231 r5 = new InvocationHandler() {
            /* class com.bytedance.lynx.webview.proxy.WebViewFactoryProviderProxy.C200231 */

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if ("createWebView".equals(method.getName())) {
                    return new WebViewProviderProxy((WebView) objArr[0], WebViewFactoryProviderProxy.this.realWebViewFactoryProver.createWebView((WebView) objArr[0], (WebView.PrivateAccess) objArr[1])).getWebViewProvider();
                }
                return method.invoke(WebViewFactoryProviderProxy.this.realWebViewFactoryProver, objArr);
            }
        };
        this.f48935a = (WebViewFactoryProvider) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{WebViewFactoryProvider.class}, r5);
    }
}
