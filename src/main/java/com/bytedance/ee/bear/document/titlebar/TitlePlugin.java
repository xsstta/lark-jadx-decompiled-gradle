package com.bytedance.ee.bear.document.titlebar;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4940b;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.DocReport;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p718t.C13742g;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.Map;
import java.util.Objects;
import org.koin.java.KoinJavaComponent;

public class TitlePlugin extends DocumentPluginV2 implements AbstractC5887o.AbstractC5888a {
    protected View contentOuterContainer;
    private boolean customEnableNestScroll;
    public AbstractC7947h deviceInfoCallback;
    private final C1177w<Boolean> isCardShowing;
    private boolean isHostSupportNestScroll;
    public boolean isPad;
    private boolean isTemplatePreview;
    private boolean loading;
    private DocReport mDocReport;
    private boolean mHasReportViewEvent;
    private C4940b mLastDeviceInfo;
    protected AppBarLayout titleBar;
    private final ComponentCallbacks titleBarDarkModeConfigurationChangedCallbacks;
    public final TitleBar.AbstractC4938a titleBarStateChangedListener;
    private final View.OnLayoutChangeListener updateWebPaddingTask;

    public TitlePlugin() {
        this(false);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadStart() {
        this.loading = true;
        updateNestScroll();
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadSuccess() {
        this.loading = false;
        updateNestScroll();
        C13742g.m55705a(new Runnable() {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$TitlePlugin$c37eYRK5NmnVoPdbgYmCJ1kQ0 */

            public final void run() {
                TitlePlugin.this.lambda$onLoadSuccess$3$TitlePlugin();
            }
        });
    }

    public void setAppBarLayoutVisible() {
        this.titleBar.setVisibility(0);
        this.titleBar.setAlpha(1.0f);
    }

    private int getPaddingBottom() {
        if (!this.isTemplatePreview) {
            return 0;
        }
        if (getDocumentMetadata().isCommonTemplatePreview()) {
            return C57582a.m223600a(160);
        }
        return C57582a.m223600a(250);
    }

    private void handleCardShowingStatus() {
        if (!this.isPad) {
            this.isCardShowing.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$TitlePlugin$ZCdxzcKDnsPIJdAQkKpKb3fuJ0A */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    TitlePlugin.this.lambda$handleCardShowingStatus$2$TitlePlugin((Boolean) obj);
                }
            });
        }
    }

    private boolean shouldEnableNestScroll() {
        if (!this.isHostSupportNestScroll || this.loading || (!this.customEnableNestScroll || !(!this.isPad))) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$onLoadSuccess$3$TitlePlugin() {
        if (isUIContainerAttached() && !this.mHasReportViewEvent) {
            this.mDocReport.mo23009g();
            this.mHasReportViewEvent = true;
        }
    }

    private void lockDefaultNavigationModeIfNeed() {
        boolean a = ((AbstractC6196a) KoinJavaComponent.m268610a(AbstractC6196a.class)).mo25028a();
        C13479a.m54764b("TitlePlugin", "enableLockDefaultNavigationMode = " + a);
        if (a) {
            getTitleBar().mo19528h(false);
        }
    }

    /* access modifiers changed from: private */
    public void updateContentContainerPaddingTop() {
        int i;
        if (this.contentOuterContainer != null) {
            if (shouldEnableNestScroll()) {
                i = 0;
            } else {
                i = this.titleBar.getHeight();
            }
            if (this.contentOuterContainer.getPaddingTop() != i) {
                this.contentOuterContainer.setPadding(0, i, 0, getPaddingBottom());
            }
        }
    }

    private void updateNestScroll() {
        ImmersiveTitleBarBehavior immersiveTitleBarBehavior;
        WebView b;
        if (isUIContainerAttached()) {
            boolean shouldEnableNestScroll = shouldEnableNestScroll();
            AbstractC4931i webOrNull = getWebOrNull();
            if (!(webOrNull == null || (b = webOrNull.mo19435b()) == null)) {
                b.setNestedScrollingEnabled(shouldEnableNestScroll);
            }
            if (this.contentOuterContainer != null && this.titleBar != null) {
                updateContentContainerPaddingTop();
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.titleBar.getLayoutParams();
                ImmersiveWebContainerBehavior immersiveWebContainerBehavior = null;
                if (shouldEnableNestScroll) {
                    immersiveTitleBarBehavior = new ImmersiveTitleBarBehavior();
                } else {
                    immersiveTitleBarBehavior = null;
                }
                layoutParams.setBehavior(immersiveTitleBarBehavior);
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) this.contentOuterContainer.getLayoutParams();
                if (shouldEnableNestScroll) {
                    immersiveWebContainerBehavior = new ImmersiveWebContainerBehavior();
                }
                layoutParams2.setBehavior(immersiveWebContainerBehavior);
                this.contentOuterContainer.requestLayout();
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.titlebar.TitlePlugin$a */
    private class C6189a implements AbstractC7945d<String> {
        private C6189a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            if (((TitleBarFixedInfo) JSONObject.parseObject(str, TitleBarFixedInfo.class)).isFixed()) {
                TitlePlugin.this.updateEnableNestScroll(false);
                TitlePlugin.this.titleBar.setAlpha(1.0f);
                TitlePlugin.this.titleBar.setVisibility(0);
                return;
            }
            TitlePlugin.this.updateEnableNestScroll(true);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.titlebar.TitlePlugin$b */
    private class C6190b implements AbstractC7945d<NameData> {
        private C6190b() {
        }

        /* renamed from: a */
        public void handle(NameData nameData, AbstractC7947h hVar) {
            TitlePlugin.this.getDocumentMetadata().setDocName(nameData.getName());
            TitlePlugin.this.getDocumentMetadata().getShowingIconInfo().mo5929b(nameData.getIcon_info());
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.titlebar.TitlePlugin$c */
    private class C6191c implements AbstractC7945d<NavigationTitle> {
        private C6191c() {
        }

        /* renamed from: a */
        public void handle(NavigationTitle navigationTitle, AbstractC7947h hVar) {
            if (TitlePlugin.this.getDocumentMetadata().isAnnounceDoc() && ("".equals(navigationTitle.getTitle()) || TitlePlugin.this.getString(R.string.Doc_Facade_UntitledDocument).equals(navigationTitle.getTitle()))) {
                navigationTitle.setTitle(TitlePlugin.this.getString(R.string.Doc_Lark_Announcement));
            }
            TitlePlugin.this.getDocumentMetadata().updateTitle(navigationTitle);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.titlebar.TitlePlugin$d */
    private class C6192d implements AbstractC7945d<TitleVisibilityData> {
        private C6192d() {
        }

        /* renamed from: a */
        public void handle(TitleVisibilityData titleVisibilityData, AbstractC7947h hVar) {
            TitleBar titleBar;
            C13479a.m54772d("TitlePlugin", "set title visibility: " + titleVisibilityData);
            if (titleVisibilityData != null && (titleBar = TitlePlugin.this.getTitleBar()) != null) {
                titleBar.mo19515a(titleVisibilityData.getVisible());
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.titlebar.TitlePlugin$e */
    private class C6193e implements AbstractC7945d<ToggleTitlebarData> {
        private C6193e() {
        }

        /* renamed from: a */
        public void handle(ToggleTitlebarData toggleTitlebarData, AbstractC7947h hVar) {
            boolean z;
            if (!TitlePlugin.this.isPad) {
                boolean z2 = true;
                if (toggleTitlebarData.getStates() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                C13479a.m54764b("TitlePlugin", "Toggle title show:" + z);
                AbstractC4958n uIContainer = TitlePlugin.this.getUIContainer();
                TitleBar e = uIContainer.mo19600e();
                if (TitlePlugin.this.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z && !z2) {
                    uIContainer.mo19596c();
                    e.mo19522c(false);
                } else if (!z) {
                    uIContainer.mo19599d();
                    e.mo19524d(false);
                }
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.titlebar.TitlePlugin$f */
    private class C6194f implements AbstractC7945d<String> {
        private C6194f() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("TitlePlugin", "Toggle titleBar visible");
            if (TitlePlugin.this.isPad) {
                return;
            }
            if (TitlePlugin.this.titleBar.getVisibility() == 0) {
                TitlePlugin.this.titleBar.setVisibility(4);
            } else {
                TitlePlugin.this.titleBar.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.titlebar.TitlePlugin$g */
    private class C6195g implements AbstractC7945d<Void> {
        private C6195g() {
        }

        /* renamed from: a */
        public void handle(Void r2, AbstractC7947h hVar) {
            C13479a.m54772d("TitlePlugin", "front end notify get device info");
            TitlePlugin.this.deviceInfoCallback = hVar;
            TitlePlugin.this.getTitleBar().mo19511a(TitlePlugin.this.titleBarStateChangedListener);
            TitlePlugin titlePlugin = TitlePlugin.this;
            titlePlugin.notifyDeviceInfo(titlePlugin.getTitleBar().mo19521c());
        }
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$1$TitlePlugin(View view) {
        this.mDocReport.mo22999a("back");
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        handleOrientation(configuration);
    }

    public TitlePlugin(boolean z) {
        this(z, false);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        getEditorAbility().mo24600o().mo23799b(this);
    }

    public void updateCardShowingStatus(boolean z) {
        this.isCardShowing.mo5926a(Boolean.valueOf(z));
    }

    public void updateEnableNestScroll(boolean z) {
        if (this.customEnableNestScroll != z) {
            C13479a.m54764b("TitlePlugin", "updateEnableNestScroll, enable = " + z);
            this.customEnableNestScroll = z;
            updateNestScroll();
        }
    }

    private void handleOrientation(Configuration configuration) {
        boolean z;
        if (!this.isPad) {
            if (configuration.orientation == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                getUIContainer().mo19599d();
                getTitleBar().mo19524d(false);
                return;
            }
            getUIContainer().mo19596c();
            getTitleBar().mo19522c(false);
        }
    }

    public /* synthetic */ void lambda$handleCardShowingStatus$2$TitlePlugin(Boolean bool) {
        C13479a.m54764b("TitlePlugin", "handleCardShowingStatus, isShowing = " + bool);
        if (bool != null) {
            getTitleBar().mo19529i(bool.booleanValue());
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        if (!this.isTemplatePreview) {
            map.put("biz.navigation.setTitleVisibility", new C6192d());
            map.put("biz.navigation.setTitle", new C6191c());
            map.put("biz.util.toggleTitlebar", new C6193e());
            map.put("biz.navigation.setName", new C6190b());
            map.put("biz.util.getDeviceInfo", new C6195g());
            map.put("biz.edit.togglgEditMode", new C6194f());
            map.put("biz.util.fixedTitleBar", new C6189a());
        }
    }

    public void notifyDeviceInfo(C4940b bVar) {
        if (bVar.f14503c > BitmapDescriptorFactory.HUE_RED) {
            bVar.f14503c = 1.0f;
        } else {
            bVar.f14503c = BitmapDescriptorFactory.HUE_RED;
        }
        bVar.f14504d = BitmapDescriptorFactory.HUE_RED;
        if (!Objects.equals(bVar, this.mLastDeviceInfo) && this.deviceInfoCallback != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusBarHeight", (Object) Integer.valueOf(bVar.f14501a));
            jSONObject.put("titleBarHeight", (Object) Integer.valueOf(bVar.f14502b));
            jSONObject.put("titleBarVisiblePercent", (Object) Float.valueOf(bVar.f14503c));
            C13479a.m54772d("TitlePlugin", "notify js device info: " + jSONObject.toJSONString());
            this.mLastDeviceInfo = new C4940b(bVar);
            this.deviceInfoCallback.mo17188a(jSONObject);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.isPad = C13653a.m55399c(getContext());
        C13479a.m54764b("TitlePlugin", "isPad = " + this.isPad);
        getEditorAbility().mo24600o().mo23796a(this);
        this.mDocReport = new DocReport(C5084ad.m20847d(), C5234y.m21391b(), C4511g.m18594d(), C5102ai.m20872j(), C4511g.m18594d().mo17367q());
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadFail(int i, Throwable th) {
        this.loading = false;
        updateNestScroll();
    }

    public TitlePlugin(boolean z, boolean z2) {
        this.customEnableNestScroll = true;
        this.isCardShowing = new C1177w<>();
        this.updateWebPaddingTask = new View.OnLayoutChangeListener() {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$TitlePlugin$W4HhG9eNFv_ty9FGbsIey11Edw */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                TitlePlugin.this.lambda$new$0$TitlePlugin(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.titleBarStateChangedListener = new TitleBar.AbstractC4938a() {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$g1g1sY7TkEwzop2FX46t84zgpx0 */

            @Override // com.bytedance.ee.bear.browser.plugin.TitleBar.AbstractC4938a
            public final void onTitleBarStateChanged(C4940b bVar) {
                TitlePlugin.this.notifyDeviceInfo(bVar);
            }
        };
        this.titleBarDarkModeConfigurationChangedCallbacks = new ComponentCallbacks() {
            /* class com.bytedance.ee.bear.document.titlebar.TitlePlugin.ComponentCallbacksC61881 */

            public void onLowMemory() {
            }

            public void onConfigurationChanged(Configuration configuration) {
                TitlePlugin.this.getTitleBar().mo19523d();
            }
        };
        this.isHostSupportNestScroll = z;
        this.isTemplatePreview = z2;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        getDocumentMetadata().updateTitle(new NavigationTitle());
        AppBarLayout appBarLayout = this.titleBar;
        if (appBarLayout != null) {
            appBarLayout.removeOnLayoutChangeListener(this.updateWebPaddingTask);
        }
        getTitleBar().mo19517b(this.titleBarStateChangedListener);
        getActivity().getApplicationContext().unregisterComponentCallbacks(this.titleBarDarkModeConfigurationChangedCallbacks);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        boolean z;
        TitleBar.TitleGravity titleGravity;
        super.onAttachToUIContainer(eVar, nVar);
        BearUrl bearUrl = getDocumentMetadata().getBearUrl();
        if (C8275a.f22371d.mo32553a().equals(bearUrl.f17446a) || C8275a.f22378k.mo32553a().equals(bearUrl.f17446a)) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = C8275a.f22372e.mo32553a().equals(bearUrl.f17446a);
        boolean equals2 = C8275a.f22373f.mo32553a().equals(bearUrl.f17446a);
        boolean isAnnounceDoc = getDocumentMetadata().isAnnounceDoc();
        TitleBar titleBar2 = getTitleBar();
        if ((z || equals || equals2) && !isAnnounceDoc && !this.isTemplatePreview) {
            titleGravity = TitleBar.TitleGravity.Left;
        } else {
            titleGravity = TitleBar.TitleGravity.Center;
        }
        titleBar2.mo19510a(titleGravity);
        this.contentOuterContainer = nVar.mo19583a(R.id.contentOuterContainer);
        AppBarLayout appBarLayout = (AppBarLayout) nVar.mo19583a(R.id.doc_appbar_layout);
        this.titleBar = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addOnLayoutChangeListener(this.updateWebPaddingTask);
        }
        handleOrientation(getResources().getConfiguration());
        handleCardShowingStatus();
        lockDefaultNavigationModeIfNeed();
        BaseTitleBar a = getTitleBar().mo19508a();
        a.setLeftExtraClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$TitlePlugin$iaKtbIqUtywvAWSKRiSZwGBbTfU */

            public final void onClick(View view) {
                TitlePlugin.this.lambda$onAttachToUIContainer$1$TitlePlugin(view);
            }
        });
        a.setTag(R.id.title_bar_report_view, true);
        getActivity().getApplicationContext().registerComponentCallbacks(this.titleBarDarkModeConfigurationChangedCallbacks);
    }

    public /* synthetic */ void lambda$new$0$TitlePlugin(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C13742g.m55705a(new Runnable() {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$TitlePlugin$GN_EgjAiA57XVYcQJY2JHCAya0 */

            public final void run() {
                TitlePlugin.this.updateContentContainerPaddingTop();
            }
        });
    }
}
