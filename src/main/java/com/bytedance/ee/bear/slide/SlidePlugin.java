package com.bytedance.ee.bear.slide;

import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.menu.C5874b;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.slide.SlidePlugin;
import com.bytedance.ee.bear.slide.common.font.C11428g;
import com.bytedance.ee.bear.slide.common.font.SlideDownloadFontInfoData;
import com.bytedance.ee.bear.slide.common.p550a.C11386b;
import com.bytedance.ee.bear.slide.common.widget.SlideWebViewContainer;
import com.bytedance.ee.bear.slide.presentation.SlidePagerIndexData;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class SlidePlugin extends DocumentPlugin implements AbstractC7666d {
    private C1177w<Boolean> mIsPresentation;
    public C11386b mSlideImageInterceptUtil;
    private WebViewClient mSlideImageRequestInterceptor;
    public int webViewNormalHeight;
    public int webViewNormalWidth;

    /* access modifiers changed from: protected */
    public C1177w<Boolean> getIsPresentation() {
        if (this.mIsPresentation == null) {
            C1177w<Boolean> wVar = new C1177w<>();
            this.mIsPresentation = wVar;
            wVar.mo5929b((Boolean) false);
        }
        return this.mIsPresentation;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        if (getIsPresentation().mo5927b() == null || !getIsPresentation().mo5927b().booleanValue()) {
            return false;
        }
        C13479a.m54764b("SlidePlugin", "native request exit slide show ");
        execJS("javascript:window.lark.biz.slide.exitShowByNative", new JSONObject());
        getIsPresentation().mo5929b((Boolean) false);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlidePlugin$a */
    public class C11361a implements AbstractC7945d<String> {
        private C11361a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("SlidePlugin", "slide click toggle title bar");
            if (((C6095s) SlidePlugin.this.getHost()).mo24597l() instanceof C11371a) {
                ((C11371a) ((C6095s) SlidePlugin.this.getHost()).mo24597l()).mo43519l().mo43527a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlidePlugin$b */
    public class C11362b implements AbstractC7945d<String> {
        private C11362b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("SlidePlugin", "JS request enter slide show ");
            SlidePlugin.this.getIsPresentation().mo5929b((Boolean) true);
            if (((C6095s) SlidePlugin.this.getHost()).mo24597l() instanceof C11371a) {
                ((C11371a) ((C6095s) SlidePlugin.this.getHost()).mo24597l()).mo43518c(false);
            }
            View a = SlidePlugin.this.getUIContainer().mo19583a(R.id.contentOuterContainer);
            SlidePlugin.this.webViewNormalWidth = a.getWidth();
            SlidePlugin.this.webViewNormalHeight = a.getHeight();
            SlidePlugin.this.getUIContainer().mo19599d();
            SlidePlugin.this.getActivity().setRequestedOrientation(0);
            if (a instanceof SlideWebViewContainer) {
                ((SlideWebViewContainer) a).setOnSizeChangedCallBack(new SlideWebViewContainer.AbstractC11431a(hVar) {
                    /* class com.bytedance.ee.bear.slide.$$Lambda$SlidePlugin$b$la6dAGu4JvmK7DQXEu_A0HQL4 */
                    public final /* synthetic */ AbstractC7947h f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.ee.bear.slide.common.widget.SlideWebViewContainer.AbstractC11431a
                    public final void onSizeChanged(int i, int i2) {
                        SlidePlugin.C11362b.this.m47142a(this.f$1, i, i2);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m47142a(AbstractC7947h hVar, int i, int i2) {
            C13479a.m54764b("SlidePlugin", "SlideEntryShowHandler OnSizeChange w=" + i + " h=" + i2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", (Object) Integer.valueOf(SlidePlugin.this.transformInnerWH(i)));
            jSONObject.put("height", (Object) Integer.valueOf(SlidePlugin.this.transformInnerWH(i2)));
            hVar.mo17188a(jSONObject);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlidePlugin$c */
    public class C11363c implements AbstractC7945d<String> {
        private C11363c() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("SlidePlugin", "JS request exit slide show ");
            SlidePlugin.this.getIsPresentation().mo5929b((Boolean) false);
            View a = SlidePlugin.this.getUIContainer().mo19583a(R.id.contentOuterContainer);
            SlidePlugin.this.getUIContainer().mo19596c();
            SlidePlugin.this.getActivity().setRequestedOrientation(1);
            if (a instanceof SlideWebViewContainer) {
                ((SlideWebViewContainer) a).setOnSizeChangedCallBack(null);
                C13479a.m54764b("SlidePlugin", "SlideExitShowHandler  w=" + SlidePlugin.this.webViewNormalWidth + " h=" + SlidePlugin.this.webViewNormalHeight);
                JSONObject jSONObject = new JSONObject();
                SlidePlugin slidePlugin = SlidePlugin.this;
                jSONObject.put("width", (Object) Integer.valueOf(slidePlugin.transformInnerWH(slidePlugin.webViewNormalWidth)));
                SlidePlugin slidePlugin2 = SlidePlugin.this;
                jSONObject.put("height", (Object) Integer.valueOf(slidePlugin2.transformInnerWH(slidePlugin2.webViewNormalHeight)));
                hVar.mo17188a(jSONObject);
            }
            if (((C6095s) SlidePlugin.this.getHost()).mo24597l() instanceof C11371a) {
                ((C11371a) ((C6095s) SlidePlugin.this.getHost()).mo24597l()).mo43517b(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlidePlugin$d */
    public class C11364d implements AbstractC7945d<SlideDownloadFontInfoData> {
        private C11364d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m47145a(AbstractC7947h hVar, String str) {
            C13479a.m54764b("SlidePlugin", "slide download font suc");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fontKey", (Object) str);
            hVar.mo17188a(jSONObject);
        }

        /* renamed from: a */
        public void handle(SlideDownloadFontInfoData slideDownloadFontInfoData, AbstractC7947h hVar) {
            C13479a.m54764b("SlidePlugin", "slide download font handle");
            if (((C6095s) SlidePlugin.this.getHost()).mo24597l() instanceof C11371a) {
                ((C11371a) ((C6095s) SlidePlugin.this.getHost()).mo24597l()).mo43516a(slideDownloadFontInfoData, new C11428g.AbstractC11429a() {
                    /* class com.bytedance.ee.bear.slide.$$Lambda$SlidePlugin$d$2U7DA9cgHnVoCD7ckzfUD29Pjgk */

                    @Override // com.bytedance.ee.bear.slide.common.font.C11428g.AbstractC11429a
                    public final void downloadSuccess(String str) {
                        SlidePlugin.C11364d.m47145a(AbstractC7947h.this, str);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlidePlugin$e */
    public class C11365e implements AbstractC7945d<SlidePagerIndexData> {
        private C11365e() {
        }

        /* renamed from: a */
        public void handle(SlidePagerIndexData slidePagerIndexData, AbstractC7947h hVar) {
            C13479a.m54764b("SlidePlugin", "slide pager info:current " + slidePagerIndexData.getCurrent() + " total" + slidePagerIndexData.getTotal());
        }
    }

    public int transformInnerWH(int i) {
        return (int) (((float) i) / getContext().getResources().getDisplayMetrics().density);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        C5874b.m23628a("SLIDE", (int) R.drawable.ud_icon_presentation_outlined, (int) R.color.facade_selector_icon_n1);
        bindBridgeHandler("biz.slide.entryShow", new C11362b());
        bindBridgeHandler("biz.slide.exitShow", new C11363c());
        bindBridgeHandler("biz.slide.showPageIndex", new C11365e());
        bindBridgeHandler("biz.slide.downloadFont", new C11364d());
        bindBridgeHandler("biz.slide.clickToggleTitleBar", new C11361a());
        this.mSlideImageInterceptUtil = new C11386b();
        this.mSlideImageRequestInterceptor = new WebViewClient() {
            /* class com.bytedance.ee.bear.slide.SlidePlugin.C113601 */

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return SlidePlugin.this.mSlideImageInterceptUtil.mo43571a(webView, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return SlidePlugin.this.mSlideImageInterceptUtil.mo43572a(webView, str);
            }
        };
        getWeb().mo19425a(this.mSlideImageRequestInterceptor);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        if (getIsPresentation().mo5927b() != null && getIsPresentation().mo5927b().booleanValue()) {
            getUIContainer().mo19596c();
            getActivity().setRequestedOrientation(1);
            getIsPresentation().mo5929b((Boolean) false);
            if (((C6095s) getHost()).mo24597l() instanceof C11371a) {
                ((C11371a) ((C6095s) getHost()).mo24597l()).mo43517b(false);
            }
        }
        getWeb().mo19438b(this.mSlideImageRequestInterceptor);
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
    }
}
