package com.bytedance.sdk.bytebridge.web.adapter;

import android.webkit.WebView;
import com.bytedance.sdk.bytebridge.web.context.JsCallContext;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/adapter/IFlutterWebViewInterceptorListener;", "", "call", "", "bridgeContext", "Lcom/bytedance/sdk/bytebridge/web/context/JsCallContext;", "callSync", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "isFlutterWebView", "", "webView", "Landroid/webkit/WebView;", "isInterceptor", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.a.b */
public interface IFlutterWebViewInterceptorListener {
    /* renamed from: a */
    void mo69862a(JsCallContext bVar);

    /* renamed from: a */
    boolean mo69863a();

    /* renamed from: a */
    boolean mo69864a(WebView webView);
}
