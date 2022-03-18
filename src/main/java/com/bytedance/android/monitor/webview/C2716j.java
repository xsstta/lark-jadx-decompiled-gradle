package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.android.monitor.webview.j */
public class C2716j implements InvocationHandler {

    /* renamed from: a */
    private Class<?> f8632a;

    /* renamed from: b */
    private Object f8633b;

    /* renamed from: a */
    public Object mo11702a() throws Exception {
        this.f8632a = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
        this.f8633b = Class.forName("com.bytedance.lynx.webview.monitors.WebChromeClientDelegate").newInstance();
        return Proxy.newProxyInstance(this.f8632a.getClassLoader(), new Class[]{this.f8632a}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!((C2711i) C2711i.m11480a()).mo11682c()) {
            return method.invoke(this.f8633b, objArr);
        }
        if ("onProgressChanged".equals(method.getName()) && objArr.length == 2) {
            ((C2711i) C2711i.m11480a()).mo11676b((WebView) objArr[0], ((Integer) objArr[1]).intValue());
        }
        return method.invoke(this.f8633b, objArr);
    }
}
