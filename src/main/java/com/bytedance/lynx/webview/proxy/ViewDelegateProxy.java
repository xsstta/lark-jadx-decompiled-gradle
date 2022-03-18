package com.bytedance.lynx.webview.proxy;

import android.webkit.WebViewProvider;
import com.bytedance.lynx.webview.internal.C19981o;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ViewDelegateProxy {
    public WebViewProvider.ViewDelegate realViewDelegate;

    public WebViewProvider.ViewDelegate getViewDelegate() {
        C200221 r0 = new InvocationHandler() {
            /* class com.bytedance.lynx.webview.proxy.ViewDelegateProxy.C200221 */

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                String name = method.getName();
                if ("onWindowVisibilityChanged".equals(name)) {
                    if (((Integer) objArr[0]).intValue() != 0) {
                        C19981o.m72875b();
                    }
                    ViewDelegateProxy.this.realViewDelegate.onWindowVisibilityChanged(((Integer) objArr[0]).intValue());
                    return null;
                } else if (!"onDetachedFromWindow".equals(name)) {
                    return method.invoke(ViewDelegateProxy.this.realViewDelegate, objArr);
                } else {
                    C19981o.m72875b();
                    ViewDelegateProxy.this.realViewDelegate.onDetachedFromWindow();
                    return null;
                }
            }
        };
        return (WebViewProvider.ViewDelegate) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{WebViewProvider.ViewDelegate.class}, r0);
    }

    public ViewDelegateProxy(WebViewProvider.ViewDelegate viewDelegate) {
        this.realViewDelegate = viewDelegate;
    }
}
