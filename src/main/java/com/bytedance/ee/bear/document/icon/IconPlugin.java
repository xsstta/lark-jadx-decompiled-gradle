package com.bytedance.ee.bear.document.icon;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.icon.DocIconNetResult;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0006\u0010\u0017\u001a\u00020\fJ\u0010\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\fH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "activeObserver", "Landroidx/lifecycle/Observer;", "", "iconEventReport", "Lcom/bytedance/ee/bear/document/icon/IconEventReport;", "iconViewModel", "Lcom/bytedance/ee/bear/document/icon/IconViewModel;", "ensureIconSelectFragment", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "setIcon", "iconInfoData", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "shouldDisableLandscape", "showIconSelectList", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "showOfflineToast", "Companion", "SelectIconHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class IconPlugin extends DocumentPlugin implements AbstractC6054a {
    public static final Companion Companion = new Companion(null);
    private AbstractC1178x<Boolean> activeObserver;
    private IconEventReport iconEventReport;
    private IconViewModel iconViewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconPlugin$Companion;", "", "()V", "BIZ_NAVIGATION_SELECT_ICON", "", "JS_BIZ_TITLE_SET_ICON", "NONE_ICON_KEY", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.IconPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void showOfflineToast() {
        CharSequence charSequence;
        Context context = getContext();
        Context context2 = getContext();
        if (context2 == null || (charSequence = context2.getText(R.string.Doc_Doc_IconOfflineHint)) == null) {
        }
        Toast.showText(context, charSequence, 0);
    }

    public final void showIconSelectList() {
        DocViewModel docViewModel = getDocViewModel();
        Intrinsics.checkExpressionValueIsNotNull(docViewModel, "docViewModel");
        C1177w<IconInfo> iconInfoData = docViewModel.getIconInfoData();
        Intrinsics.checkExpressionValueIsNotNull(iconInfoData, "docViewModel.iconInfoData");
        showIconSelectList(iconInfoData.mo5927b());
    }

    public final void ensureIconSelectFragment() {
        IconPlugin iconPlugin = this;
        if (getUIContainer().mo19586a((AbstractC4941c) iconPlugin) == null) {
            IconSelectFragment dVar = (IconSelectFragment) instantiateFragment(IconSelectFragment.class);
            dVar.mo23417a(getDocViewModel().getToken());
            dVar.mo23416a(this.iconEventReport);
            getUIContainer().mo19590a(iconPlugin, dVar, C4957m.m20520a(R.anim.dialog_in_from_bottom, R.anim.dialog_out_to_bottom));
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconPlugin$SelectIconHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "(Lcom/bytedance/ee/bear/document/icon/IconPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.IconPlugin$b */
    public final class SelectIconHandler implements AbstractC7945d<IconInfo> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SelectIconHandler() {
        }

        /* renamed from: a */
        public void handle(IconInfo iconInfo, AbstractC7947h hVar) {
            C13479a.m54764b("DocIconPlugin", "Selected icon: " + iconInfo);
            IconPlugin.this.showIconSelectList(iconInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/document/icon/IconPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", "it", "(Ljava/lang/Boolean;)V", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.IconPlugin$c */
    public static final class C5820c extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ IconPlugin f16335a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5820c(IconPlugin iconPlugin) {
            this.f16335a = iconPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            if (Intrinsics.areEqual((Object) true, (Object) bool)) {
                C13479a.m54772d("DocIconPlugin", "show icon select panel");
                this.f16335a.ensureIconSelectFragment();
                UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) this.f16335a.findPlugin(UnspecifiedOrientationPlugin.class);
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this.f16335a);
                    return;
                }
                return;
            }
            C13479a.m54772d("DocIconPlugin", "close icon select panel");
            this.f16335a.removeFragment();
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin2 = (UnspecifiedOrientationPlugin) this.f16335a.findPlugin(UnspecifiedOrientationPlugin.class);
            if (unspecifiedOrientationPlugin2 != null) {
                unspecifiedOrientationPlugin2.onOrientationSupportPanelDismiss(this.f16335a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "Lkotlin/ParameterName;", "name", "iconInfoData", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.IconPlugin$d */
    public static final /* synthetic */ class C5821d extends FunctionReference implements Function1<DocIconNetResult.Icon, Unit> {
        C5821d(IconPlugin iconPlugin) {
            super(1, iconPlugin);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "setIcon";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(IconPlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "setIcon(Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocIconNetResult.Icon icon) {
            invoke(icon);
            return Unit.INSTANCE;
        }

        public final void invoke(DocIconNetResult.Icon icon) {
            ((IconPlugin) this.receiver).setIcon(icon);
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AbstractC1142af viewModel = viewModel(IconViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewModel(IconViewModel::class.java)");
        this.iconViewModel = (IconViewModel) viewModel;
        this.activeObserver = new C5820c(this);
        IconViewModel eVar = this.iconViewModel;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconViewModel");
        }
        C1177w<Boolean> active = eVar.getActive();
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        AbstractC1178x<Boolean> xVar = this.activeObserver;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activeObserver");
        }
        active.mo5923a(lifecycleOwner, xVar);
        IconViewModel eVar2 = this.iconViewModel;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconViewModel");
        }
        eVar2.setSetIconCallback(new C5821d(this));
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
        this.iconEventReport = new IconEventReport(b, getDocViewModel().getDocumentType());
        bindBridgeHandler("biz.navigation.selectIcon", new SelectIconHandler());
    }

    public final void setIcon(DocIconNetResult.Icon icon) {
        C13479a.m54772d("DocIconPlugin", "set icon: " + icon);
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        if (!b.mo20041b()) {
            showOfflineToast();
        } else if (icon == null || TextUtils.equals("noneIconKey", icon.key)) {
            execJS("javascript:window.lark.biz.title.setIcon", new JSONObject());
        } else {
            IconInfo iconInfo = new IconInfo();
            iconInfo.setFs_unit(icon.fs_unit);
            iconInfo.setKey(icon.key);
            iconInfo.setType(icon.type);
            execJS("javascript:window.lark.biz.title.setIcon", iconInfo);
        }
    }

    public final void showIconSelectList(IconInfo iconInfo) {
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        if (!b.mo20041b()) {
            showOfflineToast();
            return;
        }
        IconViewModel eVar = this.iconViewModel;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconViewModel");
        }
        eVar.getActive().mo5929b((Boolean) true);
        IconViewModel eVar2 = this.iconViewModel;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconViewModel");
        }
        eVar2.getSelectedIcon().mo5929b(iconInfo);
        if (IconInfo.isEmpty(iconInfo)) {
            IconEventReport aVar = this.iconEventReport;
            if (aVar != null) {
                aVar.mo23391a();
                return;
            }
            return;
        }
        IconEventReport aVar2 = this.iconEventReport;
        if (aVar2 != null) {
            aVar2.mo23393b();
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        IconViewModel eVar = this.iconViewModel;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconViewModel");
        }
        eVar.getActive().mo5929b((Boolean) false);
    }
}
