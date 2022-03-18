package com.bytedance.ee.larkbrand.p650e;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkwebview.quality.performance.IPerformanceListener;
import com.bytedance.ee.larkwebview.quality.performance.IPerformanceService;
import com.bytedance.ee.larkwebview.service.AbstractC13471f;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapp.view.webcore.C67268f;
import com.tt.option.p3395p.AbstractC67667b;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.larkbrand.e.t */
public class C13032t implements AbstractC67667b {

    /* renamed from: a */
    AbstractC67282j.AbstractC67283a f34657a;

    /* renamed from: b */
    ConcurrentHashMap<String, TTWebViewExtension> f34658b = new ConcurrentHashMap<>();

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void cleanTTWebViewExtension(int i) {
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean isTTRenderInBrowserEnabled(int i) {
        return false;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void registerPlatformView(int i, View view, int i2) {
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void setPlatformLayerScrollListener(int i, AbstractC67282j.AbstractC67284b bVar) {
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public String getLoadSoVersion() {
        return LarkExtensionManager.getInstance().getExtension().mo49617k();
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public String getLocalSoVersion() {
        return LarkExtensionManager.getInstance().getExtension().mo49616j();
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public String getTTWebViewVersion() {
        return LarkExtensionManager.getInstance().getExtension().getTTWebViewSoVersion();
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean isTTWebView() {
        return LarkExtensionManager.getInstance().getExtension().isUsingTTWebView();
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean shouldCheckTTWebview() {
        return LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.ttw.check");
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean shouldDownloadIn4G() {
        return LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.ttw.force");
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void setPerformanceListener(AbstractC67282j.AbstractC67283a aVar) {
        this.f34657a = aVar;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void fetchWebviewCore(boolean z) {
        LarkExtensionManager.getInstance().getExtension().mo49615a(z);
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void initTTWebViewExtension(WebView webView, int i) {
        if (webView instanceof C67268f) {
            C67268f fVar = (C67268f) webView;
            ((IPerformanceService) fVar.getServiceManager().mo49931b(IPerformanceService.class)).mo49815a(new IPerformanceListener() {
                /* class com.bytedance.ee.larkbrand.p650e.C13032t.C130331 */

                @Override // com.bytedance.ee.larkwebview.quality.performance.IPerformanceListener
                /* renamed from: a */
                public void mo49056a(String str, String str2) {
                }

                @Override // com.bytedance.ee.larkwebview.quality.performance.IPerformanceListener
                /* renamed from: a */
                public void mo49055a() {
                    AppBrandLogger.m52830i("LarkOptionRenderDependImpl", "nestlarkwebview onFirstContentfulPaint");
                    if (C13032t.this.f34657a != null) {
                        C13032t.this.f34657a.mo231794a();
                    }
                }
            });
            try {
                AbstractC13471f fVar2 = (AbstractC13471f) fVar.getServiceManager().mo49931b(AbstractC13471f.class);
                if (fVar2 == null || fVar2.mo49910a() == null) {
                    AppBrandLogger.m52830i("LarkOptionRenderDependImpl", "service is null so not enable feature video_rotate_to_fullscreen");
                    return;
                }
                boolean enableFeature = fVar2.mo49910a().enableFeature("video_rotate_to_fullscreen", false);
                AppBrandLogger.m52830i("LarkOptionRenderDependImpl", "enableFeature video_rotate_to_fullscreen " + enableFeature);
            } catch (Exception e) {
                AppBrandLogger.m52829e("LarkOptionRenderDependImpl", "occur exception : ", e);
            }
        } else {
            TTWebViewExtension tTWebViewExtension = new TTWebViewExtension(webView);
            tTWebViewExtension.setTag("littleApp" + i);
            tTWebViewExtension.setPerformanceTimingListener((IWebViewExtension.PerformanceTimingListener) new IWebViewExtension.PerformanceTimingListener() {
                /* class com.bytedance.ee.larkbrand.p650e.C13032t.C130342 */

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onBodyParsing() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onCustomTagNotify(String str) {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                public void onDOMContentLoaded() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onFirstImagePaint() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                public void onFirstMeaningfulPaint() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onFirstScreenPaint() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public /* synthetic */ void onGetJavaScriptStackTrace(String str) {
                    IPerformanceTimingListenersdk113.CC.$default$onGetJavaScriptStackTrace(this, str);
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onIframeLoaded(String str) {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onJSError(String str) {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onNetFinish() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onReceivedResponse(String str) {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onReceivedSpecialEvent(String str) {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                public void onFirstContentfulPaint() {
                    AppBrandLogger.m52830i("LarkOptionRenderDependImpl", "onFirstContentfulPaint");
                    if (C13032t.this.f34657a != null) {
                        C13032t.this.f34657a.mo231794a();
                    }
                }
            });
            ConcurrentHashMap<String, TTWebViewExtension> concurrentHashMap = this.f34658b;
            concurrentHashMap.put("littleApp" + i, tTWebViewExtension);
        }
    }
}
