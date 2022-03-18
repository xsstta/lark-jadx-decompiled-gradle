package com.bytedance.ee.larkwebview.service.p681a;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import com.bytedance.ee.larkwebview.p677e.C13437a;
import com.bytedance.ee.larkwebview.service.AbstractC13471f;
import com.bytedance.ee.larkwebview.service.AbstractC13476k;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.service.a.b */
public class C13460b implements AbstractC13471f {

    /* renamed from: a */
    private TTWebViewExtension f35498a;

    /* renamed from: b */
    private WebView f35499b;

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13471f
    /* renamed from: a */
    public TTWebViewExtension mo49910a() {
        return this.f35498a;
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13471f
    /* renamed from: a */
    public void mo49911a(final LarkWebView larkWebView) {
        if (larkWebView == null) {
            Log.m165389i("TTWebViewServiceImpl", "webview is null");
            return;
        }
        this.f35499b = larkWebView;
        TTWebViewExtension tTWebViewExtension = new TTWebViewExtension(larkWebView);
        this.f35498a = tTWebViewExtension;
        tTWebViewExtension.setMemoryEventListener((IWebViewExtension.MemoryEventListener) new IWebViewExtension.MemoryEventListener() {
            /* class com.bytedance.ee.larkwebview.service.p681a.C13460b.C134611 */
        });
        this.f35498a.setRenderProcessGoneListener((IWebViewExtension.RenderProcessGoneListener) new IWebViewExtension.RenderProcessGoneListener() {
            /* class com.bytedance.ee.larkwebview.service.p681a.$$Lambda$b$D6zRG0CAlgix9pighjUJFCsXKtM */

            @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
            public final boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                return C13460b.m54704a(LarkWebView.this, webView, tTRenderProcessGoneDetail);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m54704a(LarkWebView larkWebView, WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
        WebMonitorManager.f35486a.mo49878c(larkWebView);
        AbstractC13476k kVar = (AbstractC13476k) larkWebView.getServiceManager().mo49931b(AbstractC13476k.class);
        C13437a aVar = null;
        if (kVar != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = new C13437a(tTRenderProcessGoneDetail.didCrash(), tTRenderProcessGoneDetail.rendererPriority());
            }
            boolean a = kVar.mo49919a(webView, aVar);
            Log.m165389i("TTWebViewServiceImpl", "onRenderProcessGone service handle , result = " + a);
            return a;
        }
        WebViewClient webViewClient = larkWebView.getWebViewClient();
        if (webViewClient == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            aVar = new C13437a(tTRenderProcessGoneDetail.didCrash(), tTRenderProcessGoneDetail.rendererPriority());
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            z = webViewClient.onRenderProcessGone(webView, aVar);
        }
        Log.m165389i("TTWebViewServiceImpl", "onRenderProcessGone client handle result " + z);
        return z;
    }
}
