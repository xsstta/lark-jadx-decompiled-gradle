package com.bytedance.ee.bear.document.customheader;

import android.content.res.Configuration;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5421a;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b;
import com.bytedance.ee.bear.doc.follow.p296b.C5425d;
import com.bytedance.ee.bear.doc.p290a.AbstractC5319a;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocActivity;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.customheader.CustomHeaderViewModel;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.facade.common.BaseCommonActivity;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.site.ActivityC23764o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "callBackFunction", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "isFromVc", "", "vcFollowTitleBarStateInterceptor", "Lcom/bytedance/ee/bear/doc/follow/state/DocFollowStateController$ITitleBarStateInterceptor;", "viewModel", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "handleTitleBarStateInVc", "enter", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onConfigurationChanged", "newConfiguration", "Landroid/content/res/Configuration;", "onFullScreenModeChanged", "Companion", "ExitDocumentHandler", "SetHeaderHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CustomHeaderPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public AbstractC7947h callBackFunction;
    private boolean isFromVc;
    private final AbstractC5422b.AbstractC5423a vcFollowTitleBarStateInterceptor = C5727f.f16109a;
    public CustomHeaderViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/doc/follow/state/DocFollowState;", "kotlin.jvm.PlatformType", "onIntercept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin$f */
    static final class C5727f implements AbstractC5422b.AbstractC5423a {

        /* renamed from: a */
        public static final C5727f f16109a = new C5727f();

        C5727f() {
        }

        @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b.AbstractC5423a
        public final boolean onIntercept(AbstractC5421a aVar) {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderPlugin$Companion;", "", "()V", "BIZ_EXIT_DOCUMENT", "", "BIZ_SET_CUSTOM_HEADER", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderPlugin$ExitDocumentHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Ljava/lang/Void;", "(Lcom/bytedance/ee/bear/document/customheader/CustomHeaderPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin$b */
    private final class ExitDocumentHandler implements AbstractC7945d<Void> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ExitDocumentHandler() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            boolean z;
            DocActivity.C5593a aVar;
            if (((C6095s) CustomHeaderPlugin.this.getHost()) != null) {
                FragmentActivity activity = CustomHeaderPlugin.this.getActivity();
                if (!(activity instanceof BaseCommonActivity)) {
                    activity = null;
                }
                BaseCommonActivity baseCommonActivity = (BaseCommonActivity) activity;
                if (baseCommonActivity == null || (aVar = (DocActivity.C5593a) baseCommonActivity.mo17222a(DocActivity.C5593a.class)) == null) {
                    z = false;
                } else {
                    z = aVar.mo22318a();
                }
                if (!z) {
                    CustomHeaderPlugin.this.getActivity().finish();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderPlugin$SetHeaderHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig;", "(Lcom/bytedance/ee/bear/document/customheader/CustomHeaderPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin$c */
    private final class SetHeaderHandler implements AbstractC7945d<CustomHeaderConfig> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SetHeaderHandler() {
        }

        /* renamed from: a */
        public void handle(CustomHeaderConfig customHeaderConfig, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(customHeaderConfig, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("CustomHeaderPlugin", "setCustomHeader: " + customHeaderConfig);
            CustomHeaderPlugin.this.callBackFunction = hVar;
            CustomHeaderPlugin.access$getViewModel$p(CustomHeaderPlugin.this).getActive().mo5929b(Boolean.valueOf(customHeaderConfig.isEmpty() ^ true));
            CustomHeaderPlugin.access$getViewModel$p(CustomHeaderPlugin.this).getHeaderData().mo5929b(customHeaderConfig);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/document/customheader/CustomHeaderPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", ActivityC23764o.f58839a, "(Ljava/lang/Boolean;)V", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin$d */
    public static final class C5725d extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CustomHeaderPlugin f16107a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5725d(CustomHeaderPlugin customHeaderPlugin) {
            this.f16107a = customHeaderPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            this.f16107a.onFullScreenModeChanged(Intrinsics.areEqual((Object) bool, (Object) true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/customheader/CustomHeaderPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel$Delegate;", "onItemClick", "", "id", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin$e */
    public static final class C5726e implements CustomHeaderViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ CustomHeaderPlugin f16108a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5726e(CustomHeaderPlugin customHeaderPlugin) {
            this.f16108a = customHeaderPlugin;
        }

        @Override // com.bytedance.ee.bear.document.customheader.CustomHeaderViewModel.Delegate
        /* renamed from: a */
        public void mo22977a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "id", (Object) str);
            AbstractC7947h hVar = this.f16108a.callBackFunction;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
            C13479a.m54764b("CustomHeaderPlugin", "callback: " + jSONObject);
        }
    }

    public static final /* synthetic */ CustomHeaderViewModel access$getViewModel$p(CustomHeaderPlugin customHeaderPlugin) {
        CustomHeaderViewModel cVar = customHeaderPlugin.viewModel;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return cVar;
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.navigation.setCustomHeader", new SetHeaderHandler());
        map.put("biz.util.exitDocument", new ExitDocumentHandler());
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AbstractC1142af viewModel2 = viewModel(CustomHeaderViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "viewModel(CustomHeaderViewModel::class.java)");
        CustomHeaderViewModel cVar = (CustomHeaderViewModel) viewModel2;
        this.viewModel = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        cVar.getActive().mo5923a(getLifecycleOwner(), new C5725d(this));
        CustomHeaderViewModel cVar2 = this.viewModel;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        cVar2.setDelegate(new C5726e(this));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        CustomHeaderViewModel cVar = this.viewModel;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Boolean> isStatusBarImmersive = cVar.isStatusBarImmersive();
        if (!this.isFromVc) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            if (CustomHeaderUtils.m23142c(activity)) {
                z = true;
                isStatusBarImmersive.mo5929b(Boolean.valueOf(z));
                if (configuration != null && 2 == configuration.orientation) {
                    getTitleBar().mo19522c(false);
                    return;
                }
            }
        }
        z = false;
        isStatusBarImmersive.mo5929b(Boolean.valueOf(z));
        if (configuration != null) {
        }
    }

    private final void handleTitleBarStateInVc(boolean z) {
        C5425d curTitleBarState;
        FollowPlugin followPlugin = (FollowPlugin) findPlugin(FollowPlugin.class);
        if (z) {
            TitleBar titleBar = getTitleBar();
            Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
            BaseTitleBar a = titleBar.mo19508a();
            Intrinsics.checkExpressionValueIsNotNull(a, "titleBar.titleBarLayout");
            a.setVisibility(0);
            if (followPlugin != null) {
                followPlugin.addTitleBarStateInterceptor(this.vcFollowTitleBarStateInterceptor);
                return;
            }
            return;
        }
        if (followPlugin != null) {
            followPlugin.removeTitleBarStateInterceptor(this.vcFollowTitleBarStateInterceptor);
        }
        if (followPlugin != null && (curTitleBarState = followPlugin.getCurTitleBarState()) != null && !curTitleBarState.f15476a) {
            C13479a.m54764b("CustomHeaderPlugin", "hide original titleBar when exit fullScreen mode");
            TitleBar titleBar2 = getTitleBar();
            Intrinsics.checkExpressionValueIsNotNull(titleBar2, "titleBar");
            BaseTitleBar a2 = titleBar2.mo19508a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "titleBar.titleBarLayout");
            a2.setVisibility(8);
        }
    }

    public final void onFullScreenModeChanged(boolean z) {
        C13479a.m54764b("CustomHeaderPlugin", "onFullScreenModeChanged: enter = " + z);
        TitlePlugin titlePlugin = (TitlePlugin) findPlugin(TitlePlugin.class);
        if (titlePlugin != null) {
            titlePlugin.updateEnableNestScroll(!z);
        }
        getTitleBar().mo19527g(z);
        ((AbstractC5319a) KoinJavaComponent.m268613a(AbstractC5319a.class, null, null, 6, null)).mo21342a(getHost(), !z);
        if (this.isFromVc) {
            handleTitleBarStateInVc(z);
        }
        if (z) {
            getUIContainer().mo19589a(this, (CustomHeaderFragment) instantiateFragment(CustomHeaderFragment.class));
        } else {
            removeFragment();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (com.bytedance.ee.bear.document.customheader.CustomHeaderUtils.m23142c(r5) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachToUIContainer(com.bytedance.ee.bear.document.C6095s r4, com.bytedance.ee.bear.browser.plugin.AbstractC4958n r5) {
        /*
            r3 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "uiContainer"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            com.bytedance.ee.bear.browser.plugin.e r4 = (com.bytedance.ee.bear.browser.plugin.C4943e) r4
            super.onAttachToUIContainer(r4, r5)
            com.bytedance.ee.bear.document.DocViewModel r4 = r3.getDocViewModel()
            com.bytedance.ee.bear.contract.doc.DocsOpenSource r4 = r4.getOpenSource()
            com.bytedance.ee.bear.contract.doc.DocsOpenSource r5 = com.bytedance.ee.bear.contract.doc.DocsOpenSource.vc
            r0 = 1
            r1 = 0
            if (r4 != r5) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r3.isFromVc = r4
            com.bytedance.ee.bear.document.customheader.c r4 = r3.viewModel
            if (r4 != 0) goto L_0x002b
            java.lang.String r5 = "viewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x002b:
            androidx.lifecycle.w r4 = r4.isStatusBarImmersive()
            boolean r5 = r3.isFromVc
            if (r5 != 0) goto L_0x0043
            androidx.fragment.app.FragmentActivity r5 = r3.getActivity()
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r2)
            boolean r5 = com.bytedance.ee.bear.document.customheader.CustomHeaderUtils.m23142c(r5)
            if (r5 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4.mo5929b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin.onAttachToUIContainer(com.bytedance.ee.bear.document.s, com.bytedance.ee.bear.browser.plugin.n):void");
    }
}
