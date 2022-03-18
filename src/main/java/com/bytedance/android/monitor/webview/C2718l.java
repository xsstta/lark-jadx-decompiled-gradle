package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.android.monitor.webview.l */
public class C2718l implements InvocationHandler {

    /* renamed from: a */
    private Class<?> f8636a;

    /* renamed from: b */
    private Object f8637b;

    /* renamed from: a */
    public Object mo11706a() throws Exception {
        this.f8636a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
        this.f8637b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewDelegate").newInstance();
        return Proxy.newProxyInstance(this.f8636a.getClassLoader(), new Class[]{this.f8636a}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!((C2711i) C2711i.m11480a()).mo11682c()) {
            return method.invoke(this.f8637b, objArr);
        }
        if ("init".equals(method.getName())) {
            ((C2711i) C2711i.m11480a()).mo11685k((WebView) objArr[0]);
            return method.invoke(this.f8637b, objArr);
        } else if ("loadUrl".equals(method.getName())) {
            ((C2711i) C2711i.m11480a()).mo11684g((WebView) objArr[0], (String) objArr[1]);
            return method.invoke(this.f8637b, objArr);
        } else if ("goBack".equals(method.getName())) {
            ((C2711i) C2711i.m11480a()).mo11688p((WebView) objArr[0]);
            return method.invoke(this.f8637b, objArr);
        } else if ("reload".equals(method.getName())) {
            ((C2711i) C2711i.m11480a()).mo11687n((WebView) objArr[0]);
            return method.invoke(this.f8637b, objArr);
        } else if ("destroy".equals(method.getName())) {
            ((C2711i) C2711i.m11480a()).mo11686m((WebView) objArr[0]);
            return method.invoke(this.f8637b, objArr);
        } else if (!"onAttachedToWindow".equals(method.getName())) {
            return method.invoke(this.f8637b, objArr);
        } else {
            ((C2711i) C2711i.m11480a()).mo11689r((WebView) objArr[0]);
            return method.invoke(this.f8637b, objArr);
        }
    }
}
