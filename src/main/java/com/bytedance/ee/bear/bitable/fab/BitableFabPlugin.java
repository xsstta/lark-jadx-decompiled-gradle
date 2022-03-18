package com.bytedance.ee.bear.bitable.fab;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.fab.BitableFabModel;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.p305e.C5752a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u00020\u000f2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/bitable/fab/BitableFabPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "BIZ_BITABLE_SETFABBUTTONS", "", "TAG", "handler", "Lcom/bytedance/ee/bear/bitable/fab/BitableFabPlugin$BitableFabHandler;", "viewModel", "Lcom/bytedance/ee/bear/bitable/fab/BitableFabViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/bitable/fab/BitableFabViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "ensureFabFragment", "", "getBridgeHandlers", "handlersHolder", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "hideFloatActionBottom", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "BitableFabHandler", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableFabPlugin extends DocumentPlugin {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableFabPlugin.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/bitable/fab/BitableFabViewModel;"))};
    private final String BIZ_BITABLE_SETFABBUTTONS = "biz.bitable.setFabButtons";
    public final String TAG = "BitableFabPlugin";
    private BitableFabHandler handler;
    private final Lazy viewModel$delegate = LazyKt.lazy(new C4782c(this));

    public final BitableFabViewModel getViewModel() {
        Lazy lazy = this.viewModel$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (BitableFabViewModel) lazy.getValue();
    }

    public final void hideFloatActionBottom() {
        removeFragment();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/bitable/fab/BitableFabViewModel;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.fab.BitableFabPlugin$c */
    static final class C4782c extends Lambda implements Function0<BitableFabViewModel> {
        final /* synthetic */ BitableFabPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4782c(BitableFabPlugin bitableFabPlugin) {
            super(0);
            this.this$0 = bitableFabPlugin;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BitableFabViewModel invoke() {
            return (BitableFabViewModel) this.this$0.viewModel(BitableFabViewModel.class);
        }
    }

    public final void ensureFabFragment() {
        if (getUIContainer().mo19586a((AbstractC4941c) this) == null) {
            addOrReplaceFragment(C4783a.class);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/fab/BitableFabPlugin$BitableFabHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/bitable/fab/BitableFabModel;", "(Lcom/bytedance/ee/bear/bitable/fab/BitableFabPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "handle", "", "fab", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.fab.BitableFabPlugin$a */
    public final class BitableFabHandler implements AbstractC7945d<BitableFabModel> {

        /* renamed from: a */
        public AbstractC7947h f14062a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "id", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.fab.BitableFabPlugin$a$a */
        public static final class C4780a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ BitableFabModel $fab;
            final /* synthetic */ BitableFabHandler this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4780a(BitableFabHandler aVar, BitableFabModel bitableFabModel) {
                super(1);
                this.this$0 = aVar;
                this.$fab = bitableFabModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                Intrinsics.checkParameterIsNotNull(str, "id");
                String str2 = BitableFabPlugin.this.TAG;
                C13479a.m54764b(str2, "clicked fab[" + this.$fab + ']');
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((Object) "id", (Object) str);
                AbstractC7947h hVar = this.this$0.f14062a;
                if (hVar != null) {
                    hVar.mo17188a(jSONObject);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public BitableFabHandler() {
        }

        /* renamed from: a */
        public void handle(BitableFabModel bitableFabModel, AbstractC7947h hVar) {
            BitableFabModel.BitableFabItem[] bitableFabItemArr;
            String str = BitableFabPlugin.this.TAG;
            C13479a.m54764b(str, "handle: fab = " + bitableFabModel);
            if (!BitableFabModel.isValid(bitableFabModel)) {
                BitableFabPlugin.this.hideFloatActionBottom();
                return;
            }
            BitableFabPlugin.this.ensureFabFragment();
            this.f14062a = hVar;
            BitableFabViewModel viewModel = BitableFabPlugin.this.getViewModel();
            if (bitableFabModel == null || (bitableFabItemArr = bitableFabModel.getData()) == null) {
                bitableFabItemArr = new BitableFabModel.BitableFabItem[0];
            }
            viewModel.updateItems(bitableFabItemArr);
            BitableFabPlugin.this.getViewModel().setOnClickFabItem(new C4780a(this, bitableFabModel));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "visibility", "", "setFabVisibility"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.fab.BitableFabPlugin$b */
    public static final class C4781b implements C5752a.AbstractC5753a {

        /* renamed from: a */
        final /* synthetic */ BitableFabPlugin f14064a;

        C4781b(BitableFabPlugin bitableFabPlugin) {
            this.f14064a = bitableFabPlugin;
        }

        @Override // com.bytedance.ee.bear.document.p305e.C5752a.AbstractC5753a
        /* renamed from: a */
        public final void mo18707a(int i) {
            View a;
            if (this.f14064a.isUIContainerAttached() && (a = this.f14064a.getUIContainer().mo19583a(R.id.bitable_fab_container)) != null) {
                a.setVisibility(i);
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        BitableFabHandler aVar = new BitableFabHandler();
        this.handler = aVar;
        map.put(this.BIZ_BITABLE_SETFABBUTTONS, aVar);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        ((C5752a) viewModel(C5752a.class)).setDelegate(new C4781b(this));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        getViewModel().updateItems(new BitableFabModel.BitableFabItem[0]);
    }
}
