package com.bytedance.ee.bear.bitable.panel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.panel.BitablePanelModel;
import com.bytedance.ee.bear.bitable.panel.BitablePanelViewModel;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "BIZ_BITABLE_SET_MODEL", "", "TAG", "handler", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelPlugin$BitablePanelHandler;", "viewModel", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getBitablePanelFragment", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelFragment;", "getBridgeHandlers", "", "handlersHolder", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "hideBitablePanelFragment", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "showBitablePanelFragment", "BitablePanelHandler", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitablePanelPlugin extends DocumentPlugin {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitablePanelPlugin.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel;"))};
    private final String BIZ_BITABLE_SET_MODEL = "biz.bitable.showPanel";
    public final String TAG = "BitablePanelPlugin";
    public BitablePanelHandler handler;
    private final Lazy viewModel$delegate = LazyKt.lazy(new C4804d(this));

    public final BitablePanelViewModel getViewModel() {
        Lazy lazy = this.viewModel$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (BitablePanelViewModel) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u001c\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelPlugin$BitablePanelHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel;", "(Lcom/bytedance/ee/bear/bitable/panel/BitablePanelPlugin;)V", "callBack", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "executeCallback", "", "id", "", "tableId", "viewId", "getCallbackParam", "Lcom/alibaba/fastjson/JSONObject;", "itemId", "handle", "model", "callback", "onCancel", "onClickItem", "item", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.BitablePanelPlugin$a */
    private final class BitablePanelHandler implements AbstractC7945d<BitablePanelModel> {

        /* renamed from: b */
        private AbstractC7947h f14111b;

        /* renamed from: a */
        public final void mo18829a() {
            m19857a("exit", "", "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public BitablePanelHandler() {
        }

        /* renamed from: a */
        public final void mo18830a(BitablePanelModel.BitablePanelItem bitablePanelItem) {
            Intrinsics.checkParameterIsNotNull(bitablePanelItem, "item");
            String id = bitablePanelItem.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "item.id");
            String tableId = bitablePanelItem.getTableId();
            String str = "";
            if (tableId == null) {
                tableId = str;
            }
            String viewId = bitablePanelItem.getViewId();
            if (viewId != null) {
                str = viewId;
            }
            m19857a(id, tableId, str);
        }

        /* renamed from: a */
        public void handle(BitablePanelModel bitablePanelModel, AbstractC7947h hVar) {
            String str = BitablePanelPlugin.this.TAG;
            C13479a.m54764b(str, "BitablePanelHandler received: " + bitablePanelModel);
            this.f14111b = hVar;
            if (bitablePanelModel == null || !BitablePanelModel.isValid(bitablePanelModel)) {
                BitablePanelPlugin.this.getViewModel().setActive(false);
                return;
            }
            BitablePanelModel.BitablePanelItem.sortByGroupId(bitablePanelModel.getData());
            BitablePanelPlugin.this.getViewModel().updatePanelJsModel(bitablePanelModel);
            BitablePanelPlugin.this.getViewModel().setActive(true);
        }

        /* renamed from: b */
        private final JSONObject m19858b(String str, String str2, String str3) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "id", (Object) str);
            jSONObject2.put((Object) "tableId", (Object) str2);
            jSONObject2.put((Object) "viewId", (Object) str3);
            return jSONObject;
        }

        /* renamed from: a */
        private final void m19857a(String str, String str2, String str3) {
            String str4 = BitablePanelPlugin.this.TAG;
            C13479a.m54764b(str4, "executeCallback（id = " + str);
            AbstractC7947h hVar = this.f14111b;
            if (hVar != null) {
                hVar.mo17188a(m19858b(str, str2, str3));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.BitablePanelPlugin$d */
    static final class C4804d extends Lambda implements Function0<BitablePanelViewModel> {
        final /* synthetic */ BitablePanelPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4804d(BitablePanelPlugin bitablePanelPlugin) {
            super(0);
            this.this$0 = bitablePanelPlugin;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BitablePanelViewModel invoke() {
            return (BitablePanelViewModel) this.this$0.viewModel(BitablePanelViewModel.class);
        }
    }

    public final void hideBitablePanelFragment() {
        BitablePanelFragment bitablePanelFragment = getBitablePanelFragment();
        if (bitablePanelFragment != null) {
            bitablePanelFragment.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/panel/BitablePanelPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel$Delegate;", "onCancel", "", "onClickItem", "item", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.BitablePanelPlugin$b */
    public static final class C4802b implements BitablePanelViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ BitablePanelPlugin f14112a;

        @Override // com.bytedance.ee.bear.bitable.panel.BitablePanelViewModel.Delegate
        /* renamed from: a */
        public void mo18832a() {
            BitablePanelHandler aVar = this.f14112a.handler;
            if (aVar != null) {
                aVar.mo18829a();
            }
            this.f14112a.getViewModel().setActive(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4802b(BitablePanelPlugin bitablePanelPlugin) {
            this.f14112a = bitablePanelPlugin;
        }

        @Override // com.bytedance.ee.bear.bitable.panel.BitablePanelViewModel.Delegate
        /* renamed from: a */
        public void mo18833a(BitablePanelModel.BitablePanelItem bitablePanelItem) {
            Intrinsics.checkParameterIsNotNull(bitablePanelItem, "item");
            BitablePanelHandler aVar = this.f14112a.handler;
            if (aVar != null) {
                aVar.mo18830a(bitablePanelItem);
            }
        }
    }

    private final BitablePanelFragment getBitablePanelFragment() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(BitablePanelFragment.f14115f.mo18837a());
        if (findFragmentByTag instanceof BitablePanelFragment) {
            return (BitablePanelFragment) findFragmentByTag;
        }
        return null;
    }

    public final void showBitablePanelFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(fragmentManager, "fragmentManager");
        ((BitablePanelFragment) instantiateFragment(BitablePanelFragment.class)).mo5511a(fragmentManager, BitablePanelFragment.f14115f.mo18837a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/panel/BitablePanelPlugin$onAttachToHost$2", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", "t", "(Ljava/lang/Boolean;)V", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.BitablePanelPlugin$c */
    public static final class C4803c extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BitablePanelPlugin f14113a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4803c(BitablePanelPlugin bitablePanelPlugin) {
            this.f14113a = bitablePanelPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f14113a.showBitablePanelFragment();
            } else {
                this.f14113a.hideBitablePanelFragment();
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        BitablePanelHandler aVar = new BitablePanelHandler();
        this.handler = aVar;
        map.put(this.BIZ_BITABLE_SET_MODEL, aVar);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        getViewModel().setDelegate(new C4802b(this));
        getViewModel().getActive().mo5923a(getLifecycleOwner(), new C4803c(this));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        getViewModel().setActive(false);
    }
}
