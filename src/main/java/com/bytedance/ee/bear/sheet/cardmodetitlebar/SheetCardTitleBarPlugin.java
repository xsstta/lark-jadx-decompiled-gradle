package com.bytedance.ee.bear.sheet.cardmodetitlebar;

import android.content.res.Configuration;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarViewModel;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000fH\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "activeObserver", "Landroidx/lifecycle/Observer;", "", "setNavBarHandler", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarPlugin$SetNavBarHandler;", "viewModel", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarViewModel;", "ensureSheetCardTitleBarFragment", "", "getBridgeHandlers", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onConfigurationChanged", "newConfiguration", "Landroid/content/res/Configuration;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "shouldDisableLandscape", "Companion", "SetNavBarHandler", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SheetCardTitleBarPlugin extends DocumentPlugin implements AbstractC6054a {
    public static final Companion Companion = new Companion(null);
    public static final String TAG;
    private AbstractC1178x<Boolean> activeObserver;
    public SetNavBarHandler setNavBarHandler;
    public SheetCardTitleBarViewModel viewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarPlugin$Companion;", "", "()V", "SET_NAV_BAR", "", "TAG", "getTAG", "()Ljava/lang/String;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo42171a() {
            return SheetCardTitleBarPlugin.TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarPlugin$SetNavBarHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/CardNavBarData;", "(Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "getCallback", "()Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "setCallback", "(Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarPlugin$b */
    public final class SetNavBarHandler implements AbstractC7945d<CardNavBarData> {

        /* renamed from: b */
        private AbstractC7947h f29733b;

        /* renamed from: a */
        public final AbstractC7947h mo42172a() {
            return this.f29733b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SetNavBarHandler() {
        }

        /* renamed from: a */
        public void handle(CardNavBarData cardNavBarData, AbstractC7947h hVar) {
            CardNavBarItem cardNavBarItem;
            String a = SheetCardTitleBarPlugin.Companion.mo42171a();
            C13479a.m54764b(a, "SetNavBarHandler receive data : " + cardNavBarData);
            if (cardNavBarData != null) {
                cardNavBarItem = cardNavBarData.getItems();
            } else {
                cardNavBarItem = null;
            }
            if (cardNavBarItem == null) {
                SheetCardTitleBarPlugin.access$getViewModel$p(SheetCardTitleBarPlugin.this).getActive().mo5929b((Boolean) false);
                return;
            }
            SheetCardTitleBarPlugin.access$getViewModel$p(SheetCardTitleBarPlugin.this).getActive().mo5929b((Boolean) true);
            SheetCardTitleBarPlugin.access$getViewModel$p(SheetCardTitleBarPlugin.this).getNavBar().mo5929b(cardNavBarData);
            this.f29733b = hVar;
        }
    }

    static {
        String simpleName = SheetCardTitleBarPlugin.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "SheetCardTitleBarPlugin::class.java.simpleName");
        TAG = simpleName;
    }

    public final void ensureSheetCardTitleBarFragment() {
        SheetCardTitleBarPlugin sheetCardTitleBarPlugin = this;
        if (getUIContainer().mo19586a((AbstractC4941c) sheetCardTitleBarPlugin) == null) {
            getUIContainer().mo19589a(sheetCardTitleBarPlugin, (SheetCardTitleBarFragment) instantiateFragment(SheetCardTitleBarFragment.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", "it", "(Ljava/lang/Boolean;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarPlugin$c */
    public static final class C11067c extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SheetCardTitleBarPlugin f29734a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11067c(SheetCardTitleBarPlugin sheetCardTitleBarPlugin) {
            this.f29734a = sheetCardTitleBarPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            if (Intrinsics.areEqual((Object) true, (Object) bool)) {
                UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) this.f29734a.findPlugin(UnspecifiedOrientationPlugin.class);
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this.f29734a);
                }
                this.f29734a.ensureSheetCardTitleBarFragment();
                C11088a.f29783b = true;
                return;
            }
            this.f29734a.removeFragment();
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin2 = (UnspecifiedOrientationPlugin) this.f29734a.findPlugin(UnspecifiedOrientationPlugin.class);
            if (unspecifiedOrientationPlugin2 != null) {
                unspecifiedOrientationPlugin2.onOrientationSupportPanelDismiss(this.f29734a);
            }
            C11088a.f29783b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarViewModel$Delegate;", "onItemClick", "", "id", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarPlugin$d */
    public static final class C11068d implements SheetCardTitleBarViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ SheetCardTitleBarPlugin f29735a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11068d(SheetCardTitleBarPlugin sheetCardTitleBarPlugin) {
            this.f29735a = sheetCardTitleBarPlugin;
        }

        @Override // com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarViewModel.Delegate
        /* renamed from: a */
        public void mo42175a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) str);
            String a = SheetCardTitleBarPlugin.Companion.mo42171a();
            C13479a.m54772d(a, "click card_nav_bar_item : " + str);
            AbstractC7947h a2 = SheetCardTitleBarPlugin.access$getSetNavBarHandler$p(this.f29735a).mo42172a();
            if (a2 != null) {
                a2.mo17188a(jSONObject);
            }
        }
    }

    public static final /* synthetic */ SetNavBarHandler access$getSetNavBarHandler$p(SheetCardTitleBarPlugin sheetCardTitleBarPlugin) {
        SetNavBarHandler bVar = sheetCardTitleBarPlugin.setNavBarHandler;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setNavBarHandler");
        }
        return bVar;
    }

    public static final /* synthetic */ SheetCardTitleBarViewModel access$getViewModel$p(SheetCardTitleBarPlugin sheetCardTitleBarPlugin) {
        SheetCardTitleBarViewModel bVar = sheetCardTitleBarPlugin.viewModel;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return bVar;
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        SetNavBarHandler bVar = new SetNavBarHandler();
        this.setNavBarHandler = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setNavBarHandler");
        }
        map.put("biz.sheet.setCardModeNavBar", bVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null && 2 == configuration.orientation) {
            SheetCardTitleBarViewModel bVar = this.viewModel;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            bVar.getActive().mo5929b((Boolean) false);
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AbstractC1142af viewModel2 = viewModel(SheetCardTitleBarViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "viewModel(SheetCardTitleBarViewModel::class.java)");
        this.viewModel = (SheetCardTitleBarViewModel) viewModel2;
        this.activeObserver = new C11067c(this);
        SheetCardTitleBarViewModel bVar = this.viewModel;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.setDelegate(new C11068d(this));
        SheetCardTitleBarViewModel bVar2 = this.viewModel;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Boolean> active = bVar2.getActive();
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        AbstractC1178x<Boolean> xVar = this.activeObserver;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activeObserver");
        }
        active.mo5923a(lifecycleOwner, xVar);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        SheetCardTitleBarViewModel bVar = this.viewModel;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.getActive().mo5929b((Boolean) false);
    }
}
