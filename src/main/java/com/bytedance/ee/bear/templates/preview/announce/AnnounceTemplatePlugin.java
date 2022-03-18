package com.bytedance.ee.bear.templates.preview.announce;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateViewModel;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0004\u001f !\"B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000eH\u0016J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "mCallback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "panelDelegate", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin$TemplatePanelDelegate;", "templateViewModel", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel;", "ensureFragment", "", "getBridgeHandlers", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "handleData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/templates/preview/announce/TemplateData;", "hideTemplateView", "initData", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onBackPressed", "", "removeFragment", "Companion", "PanelStatusChangeHandler", "TemplatePanelDelegate", "TemplatePanelHandler", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AnnounceTemplatePlugin extends DocumentPlugin implements AbstractC7666d {
    public static final Companion Companion = new Companion(null);
    public AbstractC7947h mCallback;
    private final TemplatePanelDelegate panelDelegate = new TemplatePanelDelegate();
    public AnnounceTemplateViewModel templateViewModel;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin$Companion;", "", "()V", "BIZ_ANNOUNCEMENT_SET_TEMPLATE", "", "BIZ_ANNOUNCE_ON_TEMPLATE_VISIBLE_CHANGE", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin$TemplatePanelDelegate;", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$PanelDelegate;", "(Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin;)V", "onClickHidePanel", "", "onRefreshUI", "onRemoveFragment", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePlugin$c */
    public final class TemplatePanelDelegate implements AnnounceTemplateViewModel.PanelDelegate {
        @Override // com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateViewModel.PanelDelegate
        /* renamed from: b */
        public void mo44316b() {
            AnnounceTemplatePlugin.this.removeFragment();
        }

        @Override // com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateViewModel.PanelDelegate
        /* renamed from: c */
        public void mo44317c() {
            AbstractC7947h hVar = AnnounceTemplatePlugin.this.mCallback;
            if (hVar != null) {
                hVar.mo17188a(new JSONObject());
            }
        }

        @Override // com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateViewModel.PanelDelegate
        /* renamed from: a */
        public void mo44315a() {
            String announceUrl;
            AnnounceTemplateViewModel cVar = AnnounceTemplatePlugin.this.templateViewModel;
            if (cVar != null && (announceUrl = cVar.getAnnounceUrl()) != null) {
                AbstractC4931i web = AnnounceTemplatePlugin.this.getWeb();
                Intrinsics.checkExpressionValueIsNotNull(web, "web");
                web.mo19435b().loadUrl(announceUrl);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public TemplatePanelDelegate() {
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        getActivity().finish();
        return true;
    }

    private final void ensureFragment() {
        AnnounceTemplatePlugin announceTemplatePlugin = this;
        if (getUIContainer().mo19586a((AbstractC4941c) announceTemplatePlugin) == null) {
            getUIContainer().mo19589a(announceTemplatePlugin, instantiateFragment(TemplateCardPanelFragment.class));
        }
        AnnounceTemplateAnalytic.f31127b.mo44376a();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void removeFragment() {
        if (getUIContainer() != null && getUIContainer().mo19586a((AbstractC4941c) this) != null) {
            super.removeFragment();
            AnnounceTemplateAnalytic.f31127b.mo44377a("hidden_template");
        }
    }

    private final void hideTemplateView() {
        C6095s sVar = (C6095s) getHost();
        Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
        FragmentActivity f = sVar.mo19564f();
        Intrinsics.checkExpressionValueIsNotNull(f, "host.activity");
        ViewGroup viewGroup = (ViewGroup) f.getWindow().findViewById(16908290);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.layout_announce_template_preview);
        View findViewById = viewGroup.findViewById(R.id.tv_preview_title);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    private final void initData() {
        String str;
        AnnounceTemplateViewModel cVar;
        AnnounceTemplateViewModel cVar2;
        AnnounceTemplateViewModel cVar3 = this.templateViewModel;
        String str2 = null;
        if (cVar3 != null) {
            str = cVar3.getAnnounceToken();
        } else {
            str = null;
        }
        if (str == null && (cVar2 = this.templateViewModel) != null) {
            cVar2.setAnnounceToken(getDocViewModel().getBearUrl().f17447b);
        }
        AnnounceTemplateViewModel cVar4 = this.templateViewModel;
        if (cVar4 != null) {
            str2 = cVar4.getAnnounceUrl();
        }
        if (str2 == null && (cVar = this.templateViewModel) != null) {
            cVar.setAnnounceUrl(getDocViewModel().getUrl());
        }
        AnnounceTemplateViewModel cVar5 = this.templateViewModel;
        if (cVar5 != null) {
            TitleBar titleBar = getTitleBar();
            Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
            BaseTitleBar a = titleBar.mo19508a();
            Intrinsics.checkExpressionValueIsNotNull(a, "titleBar.titleBarLayout");
            cVar5.setTitleBarHeight((float) a.getLayoutParams().height);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin$PanelStatusChangeHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Ljava/lang/Void;", "(Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePlugin$b */
    public final class PanelStatusChangeHandler implements AbstractC7945d<Void> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PanelStatusChangeHandler() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            AnnounceTemplatePlugin.this.mCallback = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin$TemplatePanelHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/templates/preview/announce/TemplateData;", "(Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePlugin$d */
    public final class TemplatePanelHandler implements AbstractC7945d<TemplateData> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public TemplatePanelHandler() {
        }

        /* renamed from: a */
        public void handle(TemplateData templateData, AbstractC7947h hVar) {
            if (templateData != null) {
                AnnounceTemplatePlugin.this.handleData(templateData);
                return;
            }
            Companion aVar = AnnounceTemplatePlugin.Companion;
            Log.e("AnnounceTemplatePlugin", "handle: TemplatePanelHandler data null!");
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        bindBridgeHandler("biz.announcement.setTemplate", new TemplatePanelHandler());
        bindBridgeHandler("biz.announcement.onTemplateHidden", new PanelStatusChangeHandler());
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AnnounceTemplateViewModel cVar = (AnnounceTemplateViewModel) new C1144ai(getActivity()).mo6005a(AnnounceTemplateViewModel.class);
        this.templateViewModel = cVar;
        if (cVar != null) {
            cVar.setPanelDelegate(this.panelDelegate);
        }
    }

    public final void handleData(TemplateData templateData) {
        Boolean bool;
        C1177w<Boolean> panelActive;
        AnnounceTemplateViewModel.ViewDelegate viewDelegate;
        TemplateData templateData2;
        Intrinsics.checkParameterIsNotNull(templateData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        AnnounceTemplateViewModel cVar = this.templateViewModel;
        if (cVar != null) {
            cVar.setTemplateData(templateData);
        }
        if (Intrinsics.areEqual((Object) templateData.getVisible(), (Object) true)) {
            AnnounceTemplateViewModel cVar2 = this.templateViewModel;
            if (cVar2 != null) {
                cVar2.loadCardData();
            }
            ensureFragment();
            return;
        }
        AnnounceTemplateViewModel cVar3 = this.templateViewModel;
        if (cVar3 == null || (templateData2 = cVar3.getTemplateData()) == null) {
            bool = null;
        } else {
            bool = templateData2.getNeedAnimation();
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            AnnounceTemplateViewModel cVar4 = this.templateViewModel;
            if (cVar4 != null && (viewDelegate = cVar4.getViewDelegate()) != null) {
                viewDelegate.mo44408a();
                return;
            }
            return;
        }
        removeFragment();
        AnnounceTemplateViewModel cVar5 = this.templateViewModel;
        if (cVar5 != null && (panelActive = cVar5.m269993getPanelActive()) != null) {
            panelActive.mo5929b((Boolean) false);
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        hideTemplateView();
        initData();
    }
}
