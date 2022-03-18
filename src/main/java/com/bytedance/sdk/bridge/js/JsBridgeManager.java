package com.bytedance.sdk.bridge.js;

import android.util.Log;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.sdk.bridge.IBridgeAuthenticator;
import com.bytedance.sdk.bridge.api.BridgeService;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate;
import com.bytedance.sdk.bridge.js.spec.IFlutterInterceptorListener;
import com.bytedance.sdk.bridge.js.spec.IJsBridgeMessageHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0004J\u001c\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J\u001c\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020&2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J$\u0010'\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J$\u0010'\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J$\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J&\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J\u0016\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%J\u0016\u00102\u001a\u00020!2\u0006\u00101\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#J\u0016\u00102\u001a\u00020!2\u0006\u00101\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020&J\u0018\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u00042\b\b\u0001\u00105\u001a\u00020\u0004J\u000e\u00106\u001a\u00020!2\u0006\u00101\u001a\u00020\u0001J\u000e\u00107\u001a\u00020!2\u0006\u0010\"\u001a\u00020&J\u0016\u00107\u001a\u00020!2\u0006\u00101\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#J\u0018\u00107\u001a\u00020!2\u0006\u00101\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020&H\u0007J\u0016\u00108\u001a\u00020!2\u0006\u00101\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/bytedance/sdk/bridge/js/JsBridgeManager;", "", "()V", "TAG", "", "bridgeService", "Lcom/bytedance/sdk/bridge/api/BridgeService;", "flutterInterceptorListener", "Lcom/bytedance/sdk/bridge/js/spec/IFlutterInterceptorListener;", "getFlutterInterceptorListener", "()Lcom/bytedance/sdk/bridge/js/spec/IFlutterInterceptorListener;", "setFlutterInterceptorListener", "(Lcom/bytedance/sdk/bridge/js/spec/IFlutterInterceptorListener;)V", "jsBridgeAuthenticator", "Lcom/bytedance/sdk/bridge/IBridgeAuthenticator;", "getJsBridgeAuthenticator", "()Lcom/bytedance/sdk/bridge/IBridgeAuthenticator;", "setJsBridgeAuthenticator", "(Lcom/bytedance/sdk/bridge/IBridgeAuthenticator;)V", "jsBridgeMessageHandler", "Lcom/bytedance/sdk/bridge/js/spec/IJsBridgeMessageHandler;", "getJsBridgeMessageHandler", "()Lcom/bytedance/sdk/bridge/js/spec/IJsBridgeMessageHandler;", "setJsBridgeMessageHandler", "(Lcom/bytedance/sdk/bridge/js/spec/IJsBridgeMessageHandler;)V", "specialBridgeNames", "", "canHandleUrl", "", "url", "checkCanBeHeldByByteBridge", "name", "delegateJavaScriptInterface", "", "webView", "Landroid/webkit/WebView;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Lcom/bytedance/sdk/bridge/js/webview/IWebView;", "delegateMessage", "delegateRequest", "request", "Lcom/bytedance/sdk/bridge/js/delegate/JsBridgeRequest;", "bridgeContext", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "delegateWebView", "webViewClient", "Landroid/webkit/WebViewClient;", "registerJsBridgeWithLifeCycle", "bridgeModule", "registerJsBridgeWithWebView", "registerJsEvent", "event", "privilege", "registerJsGlobalBridge", "unregisterJsBridgeWithWebView", "unregisterSingleBridgeModuleWithWebView", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.c */
public final class JsBridgeManager {

    /* renamed from: a */
    public static final JsBridgeManager f50485a = new JsBridgeManager();

    /* renamed from: b */
    private static IBridgeAuthenticator<String> f50486b;

    /* renamed from: c */
    private static IJsBridgeMessageHandler f50487c;

    /* renamed from: d */
    private static final BridgeService f50488d = ((BridgeService) C20216d.m73783a(BridgeService.class));

    /* renamed from: e */
    private static IFlutterInterceptorListener f50489e;

    /* renamed from: f */
    private static final List<String> f50490f = CollectionsKt.listOf((Object[]) new String[]{"appInfo", "getAppInfo", "callNativePhone", "sendALog", "x.subscribeEvent", "x.unsubscribeEvent", "x.publishEvent"});

    /* renamed from: a */
    public final void mo69629a(WebView webView) {
        m75225a(this, webView, null, 2, null);
    }

    /* renamed from: a */
    public final boolean mo69632a(WebView webView, String str) {
        return m75226a(this, webView, str, null, 4, null);
    }

    private JsBridgeManager() {
    }

    /* renamed from: a */
    public final IBridgeAuthenticator<String> mo69628a() {
        return f50486b;
    }

    /* renamed from: b */
    public final IJsBridgeMessageHandler mo69635b() {
        return f50487c;
    }

    /* renamed from: c */
    public final IFlutterInterceptorListener mo69638c() {
        return f50489e;
    }

    /* renamed from: b */
    public final boolean mo69637b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        for (String str2 : f50490f) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo69634a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return JsBridgeDelegate.f50450a.mo69603a(str);
    }

    /* renamed from: b */
    public final void mo69636b(Object obj, WebView webView) {
        Intrinsics.checkParameterIsNotNull(obj, "bridgeModule");
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        JsBridgeRegistry.f50491a.mo69649b(obj, webView);
    }

    /* renamed from: a */
    public final void mo69630a(WebView webView, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        try {
            JsBridgeDelegate.f50450a.mo69596a(JsBridgeDelegate.f50450a.mo69594a(webView), lifecycle);
        } catch (Exception e) {
            e.printStackTrace();
            String stackTraceString = Log.getStackTraceString(e);
            BridgeService bridgeService = f50488d;
            if (bridgeService != null) {
                bridgeService.reportErrorInfo("JsBridgeManager", "delegateJavaScriptInterface = " + stackTraceString);
            }
        }
    }

    /* renamed from: a */
    public final void mo69631a(Object obj, WebView webView) {
        Intrinsics.checkParameterIsNotNull(obj, "bridgeModule");
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        JsBridgeRegistry.f50491a.mo69642a(obj, webView);
    }

    /* renamed from: a */
    public final boolean mo69633a(WebView webView, String str, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        Intrinsics.checkParameterIsNotNull(str, "url");
        try {
            return JsBridgeDelegate.f50450a.mo69602a(JsBridgeDelegate.f50450a.mo69594a(webView), str, lifecycle);
        } catch (Exception e) {
            e.printStackTrace();
            String stackTraceString = Log.getStackTraceString(e);
            BridgeService bridgeService = f50488d;
            if (bridgeService == null) {
                return false;
            }
            bridgeService.reportErrorInfo("JsBridgeManager", "delegateMessage = " + stackTraceString);
            return false;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m75225a(JsBridgeManager cVar, WebView webView, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        cVar.mo69630a(webView, lifecycle);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m75226a(JsBridgeManager cVar, WebView webView, String str, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 4) != 0) {
            lifecycle = null;
        }
        return cVar.mo69633a(webView, str, lifecycle);
    }
}
