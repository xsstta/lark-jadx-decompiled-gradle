package com.bytedance.ee.bear.document;

import android.webkit.WebView;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;

/* renamed from: com.bytedance.ee.bear.document.-$$Lambda$DocBridgeWebViewV2$rvL5So-goCD7E4d4ck-YDbSyIS8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DocBridgeWebViewV2$rvL5SogoCD7E4d4ckYDbSyIS8 implements IWebViewExtension.RenderProcessGoneListener {
    public static final /* synthetic */ $$Lambda$DocBridgeWebViewV2$rvL5SogoCD7E4d4ckYDbSyIS8 INSTANCE = new $$Lambda$DocBridgeWebViewV2$rvL5SogoCD7E4d4ckYDbSyIS8();

    private /* synthetic */ $$Lambda$DocBridgeWebViewV2$rvL5SogoCD7E4d4ckYDbSyIS8() {
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
    public final boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
        return DocBridgeWebViewV2.m22673a(webView, tTRenderProcessGoneDetail);
    }
}
