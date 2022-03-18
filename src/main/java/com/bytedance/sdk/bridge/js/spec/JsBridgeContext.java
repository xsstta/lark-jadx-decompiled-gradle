package com.bytedance.sdk.bridge.js.spec;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.sdk.bridge.BridgeManager;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate;
import com.bytedance.sdk.bridge.js.webview.ISafeWebView;
import com.bytedance.sdk.bridge.js.webview.IWebView;
import com.bytedance.sdk.bridge.js.webview.WebViewWrapper;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0014\u001a\u00020\u0005J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "Lcom/bytedance/sdk/bridge/model/IBridgeContext;", "webView", "Lcom/bytedance/sdk/bridge/js/webview/IWebView;", "callBackId", "", "currentUrl", "(Lcom/bytedance/sdk/bridge/js/webview/IWebView;Ljava/lang/String;Ljava/lang/String;)V", "getCallBackId", "()Ljava/lang/String;", "webViewRef", "Ljava/lang/ref/WeakReference;", "callback", "", "bridgeResult", "Lcom/bytedance/sdk/bridge/model/BridgeResult;", "getActivity", "Landroid/app/Activity;", "getIWebView", "getUri", "getUrlForAuth", "getWebView", "Landroid/webkit/WebView;", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.spec.d */
public class JsBridgeContext implements IBridgeContext {

    /* renamed from: a */
    private final WeakReference<IWebView> f50508a;

    /* renamed from: b */
    private final String f50509b;

    /* renamed from: c */
    private final String f50510c;

    /* renamed from: f */
    public final String mo69671f() {
        return this.f50509b;
    }

    /* renamed from: b */
    public IWebView mo69667b() {
        return this.f50508a.get();
    }

    /* renamed from: a */
    public WebView mo69665a() {
        IWebView bVar = this.f50508a.get();
        if (!(bVar instanceof WebViewWrapper)) {
            bVar = null;
        }
        WebViewWrapper dVar = (WebViewWrapper) bVar;
        if (dVar != null) {
            return dVar.mo69730d();
        }
        return null;
    }

    /* renamed from: c */
    public final String mo69668c() {
        if (!TextUtils.isEmpty(this.f50510c)) {
            return this.f50510c;
        }
        IWebView bVar = this.f50508a.get();
        if (bVar != null) {
            return bVar.mo69706c();
        }
        return null;
    }

    /* renamed from: e */
    public final String mo69670e() {
        boolean z;
        IWebView b;
        String str = null;
        if (BridgeManager.f50421a.mo69560a().mo69548e() && (b = mo69667b()) != null && (b instanceof ISafeWebView)) {
            str = ((ISafeWebView) b).mo69700a();
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = mo69668c();
        }
        if (str == null) {
            Intrinsics.throwNpe();
        }
        return str;
    }

    /* renamed from: d */
    public Activity mo69669d() {
        Activity activity;
        Context context;
        ViewParent viewParent;
        Context context2;
        ViewParent viewParent2;
        Context context3;
        IWebView bVar = this.f50508a.get();
        if (bVar != null) {
            activity = bVar.mo69704b();
        } else {
            activity = null;
        }
        if (activity != null) {
            return activity;
        }
        WebView a = mo69665a();
        if (a != null) {
            context = a.getContext();
        } else {
            context = null;
        }
        while (context != null && (context instanceof ContextWrapper)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        WebView a2 = mo69665a();
        if (a2 != null) {
            viewParent = a2.getParent();
        } else {
            viewParent = null;
        }
        while (viewParent != null) {
            if (!(viewParent instanceof View)) {
                viewParent2 = null;
            } else {
                viewParent2 = viewParent;
            }
            View view = (View) viewParent2;
            if (view != null) {
                context3 = view.getContext();
            } else {
                context3 = null;
            }
            if (context3 instanceof Activity) {
                break;
            }
            viewParent = viewParent.getParent();
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            context2 = view2.getContext();
        } else {
            context2 = null;
        }
        while (context2 != null && (context2 instanceof ContextWrapper)) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        return null;
    }

    @Override // com.bytedance.sdk.bridge.model.IBridgeContext
    /* renamed from: a */
    public void mo69666a(BridgeResult bridgeResult) {
        Intrinsics.checkParameterIsNotNull(bridgeResult, "bridgeResult");
        IWebView b = mo69667b();
        if (!TextUtils.isEmpty(this.f50509b) && b != null) {
            JsBridgeDelegate bVar = JsBridgeDelegate.f50450a;
            String str = this.f50509b;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            JsBridgeDelegate.m75186a(bVar, str, bridgeResult.mo69759d(), b, false, null, 16, null);
        }
    }

    public JsBridgeContext(IWebView bVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(bVar, "webView");
        Intrinsics.checkParameterIsNotNull(str2, "currentUrl");
        this.f50509b = str;
        this.f50510c = str2;
        this.f50508a = new WeakReference<>(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsBridgeContext(IWebView bVar, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, (i & 4) != 0 ? "" : str2);
    }
}
