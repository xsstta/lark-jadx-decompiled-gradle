package com.bytedance.ee.bear.slide;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.RenderCallbackAdapter;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocTipsLayout;
import com.bytedance.ee.bear.document.WebViewContainer;
import com.bytedance.ee.bear.slide.browse.navbar.C11376a;
import com.bytedance.ee.bear.slide.browse.navbar.SlideNavBarContainer;
import com.bytedance.ee.bear.slide.browse.sidebar.C11381b;
import com.bytedance.ee.bear.slide.browse.sidebar.SlideSideBar;
import com.bytedance.ee.bear.slide.common.export.SlideExportPlugin;
import com.bytedance.ee.bear.slide.common.font.AbstractC11424d;
import com.bytedance.ee.bear.slide.common.font.C11419a;
import com.bytedance.ee.bear.slide.common.font.C11428g;
import com.bytedance.ee.bear.slide.common.font.C11430h;
import com.bytedance.ee.bear.slide.common.font.FontDownloadHintLayout;
import com.bytedance.ee.bear.slide.common.font.SlideDownloadFontInfoData;
import com.bytedance.ee.bear.slide.common.p550a.C11387c;
import com.bytedance.ee.bear.slide.common.widget.SlideWebViewContainer;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.slide.a */
public class C11371a extends C5869m implements AbstractC11424d {

    /* renamed from: e */
    public C11387c f30533e;

    /* renamed from: f */
    private DocTipsLayout f30534f;

    /* renamed from: g */
    private BaseTitleBar f30535g;

    /* renamed from: h */
    private FontDownloadHintLayout f30536h;

    /* renamed from: i */
    private SlidePlugin f30537i;

    /* renamed from: j */
    private SlideExportPlugin f30538j;

    /* renamed from: k */
    private SlideWebViewContainer f30539k;

    /* renamed from: l */
    private SlideNavBarContainer f30540l;

    /* renamed from: m */
    private C11376a f30541m;

    /* renamed from: n */
    private SlideSideBar f30542n;

    /* renamed from: o */
    private C11381b f30543o;

    /* renamed from: p */
    private C11428g f30544p;

    /* renamed from: q */
    private C11430h f30545q;

    /* renamed from: r */
    private C11373a f30546r;

    /* renamed from: l */
    public C11376a mo43519l() {
        return this.f30541m;
    }

    @Override // com.bytedance.ee.bear.slide.common.font.AbstractC11424d
    /* renamed from: p */
    public void mo43521p() {
        this.f30536h.mo43708c();
    }

    @Override // com.bytedance.ee.bear.slide.common.font.AbstractC11424d
    /* renamed from: q */
    public void mo43522q() {
        this.f30536h.mo43704a();
    }

    /* renamed from: s */
    private void m47185s() {
        this.f30540l.setOnSizeChangedListener(new SlideNavBarContainer.AbstractC11375a() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$a$Z6UzRm8OQ0ev4n9PCLLcegDrsXs */

            @Override // com.bytedance.ee.bear.slide.browse.navbar.SlideNavBarContainer.AbstractC11375a
            public final void onSizeChanged(int i, int i2, int i3, int i4) {
                C11371a.this.m47176a(i, i2, i3, i4);
            }
        });
    }

    @Override // com.bytedance.ee.bear.slide.common.font.AbstractC11424d
    /* renamed from: o */
    public void mo43520o() {
        this.f30536h.mo43707b();
        this.f30536h.setOnRetryClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$a$PBnosvUW20dvCL4h4x5Pam9VXSw */

            public final void onClick(View view) {
                C11371a.this.m47182c((C11371a) view);
            }
        });
    }

    /* renamed from: r */
    private void m47184r() {
        this.f30537i.getIsPresentation().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$a$NUeAhkJs9w6eYTHROF21sYpEjpI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11371a.this.m47178a((C11371a) ((Boolean) obj));
            }
        });
        this.f30538j.getPageStatus().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$a$E7T5pI0mnywHlgjsOmwk3CL7TaI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11371a.this.m47179a((C11371a) ((Integer) obj));
            }
        });
    }

    /* renamed from: t */
    private void m47186t() {
        this.f30540l.setOnSizeChangedListener(null);
        this.f30536h.setOnDownloadClickListener(null);
        this.f30536h.setOnRetryClickListener(null);
    }

    /* renamed from: u */
    private void m47187u() {
        if (!mo30190n() || this.f30538j.getPageStatus().mo5927b() == null || this.f30538j.getPageStatus().mo5927b().intValue() == 0) {
            FragmentActivity activity = getActivity();
            Objects.requireNonNull(activity);
            activity.onBackPressed();
            return;
        }
        this.f30538j.getExportPresenter().mo43670a(new JSONObject());
    }

    @Override // com.bytedance.ee.bear.document.aj, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onDestroyView() {
        super.onDestroyView();
        this.f30537i.getIsPresentation().mo5922a(this);
        this.f30538j.getPageStatus().mo5922a(this);
        this.f30543o.mo43563h();
        this.f30533e.mo43575b();
        this.f30544p.mo43795c();
        this.f30541m.mo43534e();
        this.f30536h.mo43708c();
        m47186t();
        ((DocBridgeWebViewV2) mo19446f().mo19448b().mo19435b()).mo22338b(this.f30546r);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m47183d(View view) {
        m47187u();
    }

    /* renamed from: com.bytedance.ee.bear.slide.a$a */
    private class C11373a extends RenderCallbackAdapter {
        private C11373a() {
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b, com.bytedance.ee.bear.contract.RenderCallbackAdapter
        public void onRenderSuccess(Map<String, String> map) {
            C11371a.this.f30533e.mo43574a(map);
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.font.AbstractC11424d
    /* renamed from: a */
    public void mo43514a(int i) {
        this.f30536h.mo43705a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m47182c(View view) {
        this.f30544p.mo43793b();
        this.f30545q.mo43801c();
    }

    /* renamed from: b */
    public void mo43517b(boolean z) {
        if (z) {
            this.f30541m.mo43529a(true);
        } else {
            this.f30541m.mo43531b(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47177a(ConnectionService.NetworkState networkState) {
        if (networkState == null || !networkState.mo20041b()) {
            this.f30536h.setVisibility(8);
        } else {
            this.f30536h.setVisibility(0);
        }
    }

    /* renamed from: c */
    public void mo43518c(boolean z) {
        if (z) {
            this.f30541m.mo43529a(false);
        } else {
            this.f30541m.mo43531b(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47178a(Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.f30541m.mo43528a(1);
            this.f30542n.mo43549d();
            this.f30543o.mo43562g();
            this.f30543o.mo43561f();
            return;
        }
        this.f30541m.mo43528a(0);
        this.f30543o.mo43559d();
        this.f30543o.mo43560e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        boolean z;
        if (this.f30537i.getIsPresentation().mo5927b() == null) {
            z = true;
        } else {
            z = this.f30537i.getIsPresentation().mo5927b().booleanValue();
        }
        bundle.putBoolean("isPresentation", z);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47179a(Integer num) {
        if (num != null) {
            this.f30541m.mo43528a(num.intValue());
            if (num.intValue() == 0) {
                this.f30539k.getChildAt(0).setPadding(0, 0, 0, 0);
                this.f30535g.mo45075a(R.drawable.ud_icon_left_outlined, R.color.facade_selector_icon_n1);
                this.f30543o.mo43559d();
                this.f30543o.mo43560e();
            } else if (num.intValue() == 2) {
                this.f30541m.mo43531b(true);
                this.f30539k.getChildAt(0).setPadding(0, 0, 0, this.f30540l.getHeight());
                this.f30535g.mo45075a(R.drawable.ud_icon_close_small_outlined, R.color.facade_selector_icon_n1);
                this.f30542n.mo43549d();
                this.f30543o.mo43562g();
                this.f30543o.mo43561f();
            } else if (num.intValue() == 3) {
                this.f30535g.mo45075a(R.drawable.ud_icon_left_outlined, R.color.facade_selector_icon_n1);
            }
        }
    }

    /* renamed from: b */
    private void m47181b(View view) {
        this.f30534f = (DocTipsLayout) view.findViewById(R.id.doc_main_tips_layout);
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.doc_main_title);
        this.f30535g = baseTitleBar;
        baseTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$a$SDz0FbXJ7Hztt83xTWYNYTp2uxY */

            public final void onClick(View view) {
                C11371a.this.m47183d(view);
            }
        });
        this.f30536h = (FontDownloadHintLayout) view.findViewById(R.id.slide_font_download_hint_layout);
        mo22586k().setTitle("");
        this.f30539k = (SlideWebViewContainer) view.findViewById(R.id.contentOuterContainer);
        this.f30537i = (SlidePlugin) mo19446f().mo19540a(SlidePlugin.class);
        this.f30538j = (SlideExportPlugin) mo19446f().mo19540a(SlideExportPlugin.class);
        DocBridgeWebViewV2 docBridgeWebViewV2 = (DocBridgeWebViewV2) ((WebViewContainer) mo22584i()).getWebView();
        C11376a aVar = new C11376a(docBridgeWebViewV2, (AppBarLayout) view.findViewById(R.id.doc_appbar_layout), this.f30539k);
        this.f30541m = aVar;
        aVar.mo43530b();
        SlideSideBar slideSideBar = (SlideSideBar) view.findViewById(R.id.slide_side_bar);
        this.f30542n = slideSideBar;
        this.f30543o = new C11381b(slideSideBar, this.f30541m, mo19446f().mo19448b(), mo22586k(), C5234y.m21391b());
        this.f30540l = (SlideNavBarContainer) view.findViewById(R.id.slide_nav_bar_container);
        this.f30534f.setNoNetworkTip(view.getContext().getString(R.string.Slide_Slide_NoNetwork));
        if (docBridgeWebViewV2 != null) {
            C13479a.m54764b("SlideFragment", "initView WebView:w=" + docBridgeWebViewV2.getWidth() + " h=" + docBridgeWebViewV2.getHeight());
        }
    }

    @Override // com.bytedance.ee.bear.document.aj
    /* renamed from: a */
    public void mo22581a(boolean z) {
        if (z) {
            mo43517b(true);
        } else {
            mo43518c(true);
        }
    }

    @Override // com.bytedance.ee.bear.document.aj, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity;
        super.onViewCreated(view, bundle);
        C11387c cVar = new C11387c(getContext(), C5234y.m21391b());
        this.f30533e = cVar;
        cVar.mo43573a();
        if (bundle != null && bundle.containsKey("isPresentation") && bundle.getBoolean("isPresentation", false) && (activity = getActivity()) != null) {
            activity.setRequestedOrientation(1);
        }
        m47181b(view);
        m47185s();
        m47184r();
        ConnectionService d = C5084ad.m20847d();
        d.mo20037a().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$a$P3vYrCSVGkKfsbyKApEd0KZdQRA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11371a.this.m47177a((C11371a) ((ConnectionService.NetworkState) obj));
            }
        });
        this.f30544p = new C11428g(d, this);
        C11430h hVar = new C11430h();
        this.f30545q = hVar;
        hVar.mo43797a(mo22586k(), C5234y.m21391b());
        C11373a aVar = new C11373a();
        this.f30546r = aVar;
        ((DocBridgeWebViewV2) mo19446f().mo19448b().mo19435b()).mo22326a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47180a(List list, View view) {
        this.f30544p.mo43794b(list);
        this.f30545q.mo43800b();
    }

    @Override // com.bytedance.ee.bear.slide.common.font.AbstractC11424d
    /* renamed from: a */
    public void mo43515a(long j, List<C11419a> list) {
        this.f30536h.mo43706a(j);
        this.f30536h.setOnDownloadClickListener(new View.OnClickListener(list) {
            /* class com.bytedance.ee.bear.slide.$$Lambda$a$HozfqcHD6oPlc6Gl4x8MwGaKkv0 */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C11371a.this.m47180a((C11371a) this.f$1, (List) view);
            }
        });
    }

    /* renamed from: a */
    public void mo43516a(SlideDownloadFontInfoData slideDownloadFontInfoData, C11428g.AbstractC11429a aVar) {
        this.f30544p.mo43792a(slideDownloadFontInfoData, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47176a(int i, int i2, int i3, int i4) {
        if (i4 != 0 && i2 != i4) {
            this.f30541m.mo43532c();
        }
    }
}
