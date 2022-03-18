package com.bytedance.lynx.webview.internal;

import android.os.Build;
import android.os.Trace;
import android.util.AndroidRuntimeException;
import android.webkit.WebViewDelegate;
import android.webkit.WebViewFactoryProvider;
import com.bytedance.lynx.webview.util.C20048g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.lynx.webview.internal.u */
public class C19997u {
    /* renamed from: a */
    public static WebViewFactoryProvider m72950a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return m72951b();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return m72952c();
        }
        if (Build.VERSION.SDK_INT >= 22) {
            return m72953d();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return m72954e();
        }
        return null;
    }

    /* renamed from: e */
    private static WebViewFactoryProvider m72954e() {
        Trace.beginSection("WebViewFactory.getProvider()");
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Object[] objArr = {"getFactoryClass", new Class[0]};
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke((Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory"), objArr);
            method.setAccessible(true);
            Class cls = (Class) method.invoke(null, new Object[0]);
            Trace.beginSection("WebViewFactoryProvider invocation");
            try {
                WebViewFactoryProvider webViewFactoryProvider = (WebViewFactoryProvider) cls.newInstance();
                C20048g.m73162b("SysProviderCreator", "Loaded provider: " + webViewFactoryProvider);
                Trace.endSection();
                return webViewFactoryProvider;
            } catch (Exception e) {
                C20048g.m73164d("error instantiating provider" + e);
                throw new AndroidRuntimeException(e);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Exception e2) {
            C20048g.m73164d("SysProviderCreator", "Create system provider error: " + e2.toString());
            C19943g.m72724a(EventType.LOAD_LOAD_SYSTEM_PROVIDER_ERROR, (Object) null);
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    private static WebViewFactoryProvider m72951b() {
        Method method;
        Trace.beginSection("WebViewFactory.getProvider()");
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Object[] objArr = {"getProviderClass", new Class[0]};
            Method method2 = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke((Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory"), objArr);
            method2.setAccessible(true);
            try {
                method = ((Class) method2.invoke(null, new Object[0])).getMethod("create", WebViewDelegate.class);
            } catch (Exception e) {
                C20048g.m73164d("error instantiating provider with static factory method" + e);
                method = null;
            }
            Trace.beginSection("WebViewFactoryProvider invocation");
            try {
                Constructor declaredConstructor = WebViewDelegate.class.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                WebViewFactoryProvider webViewFactoryProvider = (WebViewFactoryProvider) method.invoke(null, declaredConstructor.newInstance(new Object[0]));
                C20048g.m73162b("SysProviderCreator", "Loaded provider: " + webViewFactoryProvider);
                Trace.endSection();
                return webViewFactoryProvider;
            } catch (Exception e2) {
                C20048g.m73164d("error instantiating provider" + e2);
                throw new AndroidRuntimeException(e2);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Exception e3) {
            C20048g.m73164d("SysProviderCreator", "Create system provider error: " + e3.toString());
            C19943g.m72724a(EventType.LOAD_LOAD_SYSTEM_PROVIDER_ERROR, (Object) null);
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: c */
    private static WebViewFactoryProvider m72952c() {
        Constructor constructor;
        Exception e;
        Trace.beginSection("WebViewFactory.getProvider()");
        try {
            Object[] objArr = {"getProviderClass", new Class[0]};
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke((Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "android.webkit.WebViewFactory"), objArr);
            method.setAccessible(true);
            try {
                constructor = ((Class) method.invoke(null, new Object[0])).getDeclaredConstructor(WebViewDelegate.class);
                try {
                    constructor.setAccessible(true);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                constructor = null;
                C20048g.m73164d("error instantiating provider with static factory method" + e);
                Trace.beginSection("WebViewFactoryProvider invocation");
                Constructor declaredConstructor = WebViewDelegate.class.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                WebViewFactoryProvider webViewFactoryProvider = (WebViewFactoryProvider) constructor.newInstance(declaredConstructor.newInstance(new Object[0]));
                C20048g.m73162b("SysProviderCreator", "Loaded provider: " + webViewFactoryProvider);
                Trace.endSection();
                return webViewFactoryProvider;
            }
            Trace.beginSection("WebViewFactoryProvider invocation");
            try {
                Constructor declaredConstructor2 = WebViewDelegate.class.getDeclaredConstructor(new Class[0]);
                declaredConstructor2.setAccessible(true);
                WebViewFactoryProvider webViewFactoryProvider2 = (WebViewFactoryProvider) constructor.newInstance(declaredConstructor2.newInstance(new Object[0]));
                C20048g.m73162b("SysProviderCreator", "Loaded provider: " + webViewFactoryProvider2);
                Trace.endSection();
                return webViewFactoryProvider2;
            } catch (Exception e4) {
                C20048g.m73164d("error instantiating provider" + e4);
                throw new AndroidRuntimeException(e4);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Exception e5) {
            C20048g.m73164d("SysProviderCreator", "Create system provider error: " + e5.toString());
            C19943g.m72724a(EventType.LOAD_LOAD_SYSTEM_PROVIDER_ERROR, (Object) null);
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6 = (android.webkit.WebViewFactoryProvider) r6.newInstance();
        com.bytedance.lynx.webview.util.C20048g.m73162b("SysProviderCreator", "Loaded provider: " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dd, code lost:
        android.os.Trace.endSection();
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e3, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.bytedance.lynx.webview.util.C20048g.m73164d("error instantiating provider" + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0102, code lost:
        throw new android.util.AndroidRuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0103, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0106, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00bf */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.webkit.WebViewFactoryProvider m72953d() {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19997u.m72953d():android.webkit.WebViewFactoryProvider");
    }
}
