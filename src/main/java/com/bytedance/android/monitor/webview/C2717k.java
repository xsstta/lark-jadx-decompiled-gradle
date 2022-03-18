package com.bytedance.android.monitor.webview;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.android.monitor.webview.k */
public class C2717k implements InvocationHandler {

    /* renamed from: a */
    private Class<?> f8634a;

    /* renamed from: b */
    private Object f8635b;

    /* renamed from: a */
    public Object mo11704a() throws Exception {
        this.f8634a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
        this.f8635b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewClientDelegate").newInstance();
        return Proxy.newProxyInstance(this.f8634a.getClassLoader(), new Class[]{this.f8634a}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!((C2711i) C2711i.m11480a()).mo11682c()) {
            return method.invoke(this.f8635b, objArr);
        }
        if ("onPageStarted".equals(method.getName())) {
            ((C2711i) C2711i.m11480a()).mo11681c((WebView) objArr[0], (String) objArr[1]);
            return method.invoke(this.f8635b, objArr);
        } else if ("onPageFinished".equals(method.getName())) {
            ((C2711i) C2711i.m11480a()).mo11683e((WebView) objArr[0], (String) objArr[1]);
            return method.invoke(this.f8635b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 3) {
            ((C2711i) C2711i.m11480a()).mo11678b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceError) objArr[2]);
            return method.invoke(this.f8635b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 4) {
            ((C2711i) C2711i.m11480a()).mo11677b((WebView) objArr[0], ((Integer) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
            return method.invoke(this.f8635b, objArr);
        } else if (!"onReceivedHttpError".equals(method.getName()) || objArr.length != 3) {
            return method.invoke(this.f8635b, objArr);
        } else {
            ((C2711i) C2711i.m11480a()).mo11679b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
            return method.invoke(this.f8635b, objArr);
        }
    }
}
