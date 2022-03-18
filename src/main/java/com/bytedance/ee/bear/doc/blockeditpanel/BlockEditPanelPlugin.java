package com.bytedance.ee.bear.doc.blockeditpanel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.bear.doc.blockeditpanel.view.BlockEditPanelFragment;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.toolbar.selectcolor.SelectColorV2Plugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u00020\u00162\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019H\u0016J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPluginV2;", "()V", "JS_BIZ_UTIL_SET_PANEL_HEIGHT", "", "TAG", "analytic", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelAnalytic;", "blockMenuItemsHandler", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelPlugin$SetBlockMenuItemsHandler;", "highlightDelegate", "Lcom/bytedance/ee/bear/document/toolbar/selectcolor/SelectColorV2Plugin$Delegate;", "getHighlightDelegate", "()Lcom/bytedance/ee/bear/document/toolbar/selectcolor/SelectColorV2Plugin$Delegate;", "highlightDelegate$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;", "viewModel$delegate", "ensureFragment", "", "getBridgeHandlers", "handlersHolder", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "SetBlockMenuItemsHandler", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BlockEditPanelPlugin extends DocumentPluginV2 {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BlockEditPanelPlugin.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BlockEditPanelPlugin.class), "highlightDelegate", "getHighlightDelegate()Lcom/bytedance/ee/bear/document/toolbar/selectcolor/SelectColorV2Plugin$Delegate;"))};
    public final String JS_BIZ_UTIL_SET_PANEL_HEIGHT = "lark.biz.util.setPanelHeight";
    public final String TAG = "BlockEditPanelPlugin";
    public C5340a analytic;
    public SetBlockMenuItemsHandler blockMenuItemsHandler = new SetBlockMenuItemsHandler();
    private final Lazy highlightDelegate$delegate = LazyKt.lazy(new C5335b(this));
    private final Lazy viewModel$delegate = LazyKt.lazy(new C5339e(this));

    public final SelectColorV2Plugin.AbstractC6243a getHighlightDelegate() {
        Lazy lazy = this.highlightDelegate$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (SelectColorV2Plugin.AbstractC6243a) lazy.getValue();
    }

    public final BlockEditPanelViewModel getViewModel() {
        Lazy lazy = this.viewModel$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (BlockEditPanelViewModel) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/document/toolbar/selectcolor/SelectColorV2Plugin$Delegate;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelPlugin$b */
    static final class C5335b extends Lambda implements Function0<SelectColorV2Plugin.AbstractC6243a> {
        final /* synthetic */ BlockEditPanelPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5335b(BlockEditPanelPlugin blockEditPanelPlugin) {
            super(0);
            this.this$0 = blockEditPanelPlugin;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SelectColorV2Plugin.AbstractC6243a invoke() {
            return new SelectColorV2Plugin.AbstractC6243a(this) {
                /* class com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelPlugin.C5335b.C53361 */

                /* renamed from: a */
                final /* synthetic */ C5335b f15240a;

                {
                    this.f15240a = r1;
                }

                @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.SelectColorV2Plugin.AbstractC6243a
                /* renamed from: a */
                public final void mo21365a(Highlight highlight) {
                    this.f15240a.this$0.getViewModel().getHighlight().mo5929b(highlight);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J0\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0018"}, d2 = {"com/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel$Delegate;", "onClickBack", "", "currLevel", "", "onClickColorMenuItem", "backgroundItem", "Lcom/bytedance/ee/bear/document/model/toolbar/selectcolor/impl/Highlight$ColorItem;", "textItem", "clearItem", "resetItem", "onClickMenuItem", "menuItem", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/BlockEditPanelMenusModel$BlockEditPanelMenuItem;", "isClickDropdown", "", "onClickTriangleButton", "onClosePanel", "level", "onDestroyBlockEditPanel", "onPanelHeightChanged", "height", "onPullingDown", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelPlugin$d */
    public static final class C5338d implements BlockEditPanelViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ BlockEditPanelPlugin f15242a;

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: a */
        public void mo21367a() {
            C13479a.m54764b(this.f15242a.TAG, "onDestroyBlockEditPanel");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5338d(BlockEditPanelPlugin blockEditPanelPlugin) {
            this.f15242a = blockEditPanelPlugin;
        }

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: c */
        public void mo21372c(int i) {
            C5340a aVar = this.f15242a.analytic;
            if (aVar != null) {
                aVar.mo21377c();
            }
        }

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: d */
        public void mo21373d(int i) {
            C5340a aVar = this.f15242a.analytic;
            if (aVar != null) {
                aVar.mo21375a();
            }
        }

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: e */
        public void mo21374e(int i) {
            C5340a aVar = this.f15242a.analytic;
            if (aVar != null) {
                aVar.mo21376b();
            }
        }

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: a */
        public void mo21368a(int i) {
            String str = this.f15242a.TAG;
            C13479a.m54764b(str, "onClosePanel, level: " + i);
            BlockEditPanelPlugin blockEditPanelPlugin = this.f15242a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("closedLevel", (Object) Integer.valueOf(i));
            DocumentPluginV2.dispatchBridgeMsg$default(blockEditPanelPlugin, "lark.biz.navigation.closeBlockMenuPanel", jSONObject, null, 4, null);
        }

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: b */
        public void mo21371b(int i) {
            if (!(!Intrinsics.areEqual((Object) this.f15242a.getViewModel().getActive().mo5927b(), (Object) true))) {
                int b = C13749l.m55749b(i);
                String str = this.f15242a.TAG;
                C13479a.m54764b(str, "onPanelHeightChanged. height=" + b);
                BlockEditPanelPlugin blockEditPanelPlugin = this.f15242a;
                String str2 = blockEditPanelPlugin.JS_BIZ_UTIL_SET_PANEL_HEIGHT;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("height", (Object) Integer.valueOf(b));
                DocumentPluginV2.dispatchBridgeMsg$default(blockEditPanelPlugin, str2, jSONObject, null, 4, null);
            }
        }

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: a */
        public void mo21369a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem, boolean z) {
            Intrinsics.checkParameterIsNotNull(blockEditPanelMenuItem, "menuItem");
            this.f15242a.blockMenuItemsHandler.mo21363a(blockEditPanelMenuItem, z);
        }

        @Override // com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel.Delegate
        /* renamed from: a */
        public void mo21370a(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
            C13479a.m54764b(this.f15242a.TAG, "onClickColorMenuItem");
            SelectColorV2Plugin selectColorV2Plugin = (SelectColorV2Plugin) this.f15242a.findPlugin(SelectColorV2Plugin.class);
            if (selectColorV2Plugin != null) {
                selectColorV2Plugin.processItemClick(colorItem, colorItem2, colorItem3, colorItem4);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelPlugin$e */
    static final class C5339e extends Lambda implements Function0<BlockEditPanelViewModel> {
        final /* synthetic */ BlockEditPanelPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5339e(BlockEditPanelPlugin blockEditPanelPlugin) {
            super(0);
            this.this$0 = blockEditPanelPlugin;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BlockEditPanelViewModel invoke() {
            return (BlockEditPanelViewModel) this.this$0.viewModel(BlockEditPanelViewModel.class);
        }
    }

    public final void ensureFragment() {
        if (getUIContainer() != null) {
            BlockEditPanelPlugin blockEditPanelPlugin = this;
            if (getUIContainer().mo19586a((AbstractC4941c) blockEditPanelPlugin) == null) {
                getUIContainer().mo19590a(blockEditPanelPlugin, instantiateFragment(BlockEditPanelFragment.class), C4957m.m20520a(R.anim.popup_enter_anim, R.anim.popup_exit_anim));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelPlugin$SetBlockMenuItemsHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/BlockEditPanelMenusModel;", "(Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onClickMenuItem", "menuItem", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/BlockEditPanelMenusModel$BlockEditPanelMenuItem;", "clickDropdown", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelPlugin$a */
    private final class SetBlockMenuItemsHandler implements AbstractC7945d<BlockEditPanelMenusModel> {

        /* renamed from: b */
        private AbstractC7947h f15239b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SetBlockMenuItemsHandler() {
        }

        /* renamed from: a */
        public void handle(BlockEditPanelMenusModel blockEditPanelMenusModel, AbstractC7947h hVar) {
            String str = BlockEditPanelPlugin.this.TAG;
            C13479a.m54764b(str, "handle BlockMenuItemsData: " + blockEditPanelMenusModel);
            this.f15239b = hVar;
            BlockEditPanelPlugin.this.getViewModel().setActive(BlockEditPanelMenusModel.isValid(blockEditPanelMenusModel));
            BlockEditPanelPlugin.this.getViewModel().setMenuItems(blockEditPanelMenusModel);
        }

        /* renamed from: a */
        public final void mo21363a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem, boolean z) {
            Intrinsics.checkParameterIsNotNull(blockEditPanelMenuItem, "menuItem");
            JSONObject jSONObject = new JSONObject();
            String id = blockEditPanelMenuItem.getId();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "id", (Object) id);
            if (TextUtils.equals(id, EMenuItemConfig.HIGHLIGHT.id)) {
                jSONObject2.put((Object) "clickDropdown", (Object) Boolean.valueOf(z));
                jSONObject2.put((Object) "backgroundColor", (Object) blockEditPanelMenuItem.getBackgroundColor());
                jSONObject2.put((Object) "foregroundColor", (Object) blockEditPanelMenuItem.getForegroundColor());
            }
            String str = BlockEditPanelPlugin.this.TAG;
            C13479a.m54764b(str, "onClickMenuItem: " + jSONObject);
            AbstractC7947h hVar = this.f15239b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", "active", "(Ljava/lang/Boolean;)V", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelPlugin$c */
    public static final class C5337c extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BlockEditPanelPlugin f15241a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5337c(BlockEditPanelPlugin blockEditPanelPlugin) {
            this.f15241a = blockEditPanelPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            SelectColorV2Plugin selectColorV2Plugin = (SelectColorV2Plugin) this.f15241a.findPlugin(SelectColorV2Plugin.class);
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                if (selectColorV2Plugin != null) {
                    selectColorV2Plugin.setShowHighlightDelegate(this.f15241a.getHighlightDelegate());
                }
                this.f15241a.ensureFragment();
                return;
            }
            if (selectColorV2Plugin != null) {
                selectColorV2Plugin.setShowHighlightDelegate(null);
            }
            this.f15241a.getViewModel().getHighlight().mo5929b((Highlight) null);
            this.f15241a.removeFragment();
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.navigation.setBlockMenuPanelItems", this.blockMenuItemsHandler);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        getViewModel().getActive().mo5923a(getLifecycleOwner(), new C5337c(this));
        getViewModel().setDelegate(new C5338d(this));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        this.analytic = new C5340a(getEditorAbility().mo24602q().getBearUrl(), C5234y.m21391b());
    }
}
