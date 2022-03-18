package com.bytedance.sdk.bytebridge.web.conduct;

import android.webkit.ValueCallback;
import com.bytedance.sdk.bytebridge.base.utils.Logger;
import com.bytedance.sdk.bytebridge.web.context.JsContext;
import com.bytedance.sdk.bytebridge.web.widget.LoadUrlStatus;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fH\u0007J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010 \u001a\u00020\u0004J.\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J.\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007J\u000e\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(J\u001c\u0010)\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0007J\u001c\u0010)\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/conduct/JsBridge;", "", "()V", "TAG", "", "canHandleUrl", "", "url", "delegateJavaScriptInterface", "", "webView", "Landroid/webkit/WebView;", "Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "delegateMessage", "delegateWebView", "webViewClient", "Landroid/webkit/WebViewClient;", "loadUrl", "iWebView", "resultUrl", "context", "Lcom/bytedance/sdk/bytebridge/web/context/JsContext;", "onJsbridgeRequest", "view", "originInfo", "Lcom/bytedance/sdk/bytebridge/web/widget/JsCallOriginInfo;", "onJsbridgeRequestSync", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "registerBridgeModule", "bridgeModuleSrc", "registerEvent", "event", "privilege", "sendEvent", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "iJsLoadUrlResult", "Lcom/bytedance/sdk/bytebridge/web/conduct/IJsLoadUrlResult;", "setFlutterWebViewInterceptor", "iFlutterWebViewInterceptorListener", "Lcom/bytedance/sdk/bytebridge/web/adapter/IFlutterWebViewInterceptorListener;", "unregisterBridgeModule", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.b.b */
public final class JsBridge {

    /* renamed from: a */
    public static final JsBridge f50632a = new JsBridge();

    private JsBridge() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "callbackResult", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.web.b.b$a */
    public static final class C20690a<T> implements ValueCallback<String> {

        /* renamed from: a */
        final /* synthetic */ JsContext f50633a;

        C20690a(JsContext cVar) {
            this.f50633a = cVar;
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            Logger cVar = Logger.f50602a;
            cVar.mo69824a("JsBridgeDelegate", "loadUrl = " + str);
            JsContext cVar2 = this.f50633a;
            if (cVar2 != null) {
                LoadUrlStatus loadUrlStatus = LoadUrlStatus.WEBVIEW_EVALUATE_JAVASCRIPT_VALUE_CALLBACK;
                Intrinsics.checkExpressionValueIsNotNull(str, "callbackResult");
                cVar2.mo69875a(loadUrlStatus, str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69868a(com.bytedance.sdk.bytebridge.web.context.IWebView r7, java.lang.String r8, com.bytedance.sdk.bytebridge.web.context.JsContext r9) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bytebridge.web.conduct.JsBridge.mo69868a(com.bytedance.sdk.bytebridge.web.c.a, java.lang.String, com.bytedance.sdk.bytebridge.web.c.c):void");
    }
}
