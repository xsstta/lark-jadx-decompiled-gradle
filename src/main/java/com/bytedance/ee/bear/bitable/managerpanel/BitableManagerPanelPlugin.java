package com.bytedance.ee.bear.bitable.managerpanel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelData;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.huawei.hms.site.ActivityC23764o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002J \u0010\r\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "mCallBackFunction", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "mManagerPanelViewModel", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelViewModel;", "executeOperationCallback", "", "id", "", "blockId", "viewId", "getBridgeHandlers", "handlersHolder", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "getManagerPanelFragment", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelFragment;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "Companion", "ManagerPanelHandler", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableManagerPanelPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public AbstractC7947h mCallBackFunction;
    public BitableManagerPanelViewModel mManagerPanelViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelPlugin$Companion;", "", "()V", "BIZ_MANAGER_PANEL", "", "OPERATION_ADD_TABLE", "OPERATION_ADD_VIEW", "OPERATION_EXIT", "OPERATION_FOLD_TABLE", "OPERATION_MORE", "OPERATION_SWITCH_VIEW", "OPERATION_UNFOLD_TABLE", "TAG", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/bitable/managerpanel/OperationCallBack;", "onAddTable", "", "onAddView", "blockId", "", "onClickMore", "viewId", "onClosePanel", "onFoldTable", "onSwitchView", "onUnfoldTable", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelPlugin$d */
    public static final class C4787d implements OperationCallBack {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelPlugin f14075a;

        @Override // com.bytedance.ee.bear.bitable.managerpanel.OperationCallBack
        /* renamed from: b */
        public void mo18763b() {
            this.f14075a.executeOperationCallback("add_table");
        }

        @Override // com.bytedance.ee.bear.bitable.managerpanel.OperationCallBack
        /* renamed from: a */
        public void mo18760a() {
            BitableManagerPanelPlugin.access$getMManagerPanelViewModel$p(this.f14075a).getActive().mo5929b((Boolean) false);
            this.f14075a.executeOperationCallback("exit");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4787d(BitableManagerPanelPlugin bitableManagerPanelPlugin) {
            this.f14075a = bitableManagerPanelPlugin;
        }

        @Override // com.bytedance.ee.bear.bitable.managerpanel.OperationCallBack
        /* renamed from: a */
        public void mo18761a(String str) {
            this.f14075a.executeOperationCallback("add_view", str, null);
        }

        @Override // com.bytedance.ee.bear.bitable.managerpanel.OperationCallBack
        /* renamed from: b */
        public void mo18764b(String str) {
            this.f14075a.executeOperationCallback("unfold_table", str, null);
        }

        @Override // com.bytedance.ee.bear.bitable.managerpanel.OperationCallBack
        /* renamed from: c */
        public void mo18766c(String str) {
            this.f14075a.executeOperationCallback("fold_table", str, null);
        }

        @Override // com.bytedance.ee.bear.bitable.managerpanel.OperationCallBack
        /* renamed from: a */
        public void mo18762a(String str, String str2) {
            this.f14075a.executeOperationCallback("switch", str, str2);
        }

        @Override // com.bytedance.ee.bear.bitable.managerpanel.OperationCallBack
        /* renamed from: b */
        public void mo18765b(String str, String str2) {
            this.f14075a.executeOperationCallback("more", str, str2);
        }
    }

    public final BitableManagerPanelFragment getManagerPanelFragment() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("BitableManagerPanelFragment");
        if (!(findFragmentByTag instanceof BitableManagerPanelFragment)) {
            findFragmentByTag = null;
        }
        return (BitableManagerPanelFragment) findFragmentByTag;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelPlugin$ManagerPanelHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData;", "(Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelPlugin;)V", "handle", "", "panelData", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelPlugin$b */
    private final class ManagerPanelHandler implements AbstractC7945d<BitableManagerPanelData> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ManagerPanelHandler() {
        }

        /* renamed from: a */
        public void handle(BitableManagerPanelData bitableManagerPanelData, AbstractC7947h hVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(bitableManagerPanelData, "panelData");
            C13479a.m54772d("BitableManagerPanelPlugin", "ManagerPanelHandler... received " + bitableManagerPanelData);
            BitableManagerPanelPlugin.this.mCallBackFunction = hVar;
            C1177w<Boolean> active = BitableManagerPanelPlugin.access$getMManagerPanelViewModel$p(BitableManagerPanelPlugin.this).getActive();
            BitableManagerPanelData.BlockBean[] data = bitableManagerPanelData.getData();
            boolean z2 = false;
            if (data != null) {
                if (data.length == 0) {
                    z2 = true;
                }
                z = Boolean.valueOf(!z2);
            } else {
                z = false;
            }
            active.mo5929b(z);
            BitableManagerPanelPlugin.access$getMManagerPanelViewModel$p(BitableManagerPanelPlugin.this).getPanelData().mo5929b(bitableManagerPanelData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", ActivityC23764o.f58839a, "(Ljava/lang/Boolean;)V", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelPlugin$c */
    public static final class C4786c extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelPlugin f14074a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4786c(BitableManagerPanelPlugin bitableManagerPanelPlugin) {
            this.f14074a = bitableManagerPanelPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            C13479a.m54764b("BitableManagerPanelPlugin", "active onChange: " + bool);
            if (!Intrinsics.areEqual((Object) true, (Object) bool)) {
                BitableManagerPanelFragment managerPanelFragment = this.f14074a.getManagerPanelFragment();
                if (managerPanelFragment != null) {
                    managerPanelFragment.mo5513b();
                }
            } else if (this.f14074a.getManagerPanelFragment() == null) {
                FragmentManager fragmentManager = this.f14074a.getFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(fragmentManager, "fragmentManager");
                ((BitableManagerPanelFragment) this.f14074a.instantiateFragment(BitableManagerPanelFragment.class)).mo5511a(fragmentManager, "BitableManagerPanelFragment");
            }
        }
    }

    public final void executeOperationCallback(String str) {
        executeOperationCallback(str, null, null);
    }

    public static final /* synthetic */ BitableManagerPanelViewModel access$getMManagerPanelViewModel$p(BitableManagerPanelPlugin bitableManagerPanelPlugin) {
        BitableManagerPanelViewModel cVar = bitableManagerPanelPlugin.mManagerPanelViewModel;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        return cVar;
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.bitable.managerPanel", new ManagerPanelHandler());
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AbstractC1142af viewModel = viewModel(BitableManagerPanelViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewModel(BitableManager…nelViewModel::class.java)");
        BitableManagerPanelViewModel cVar = (BitableManagerPanelViewModel) viewModel;
        this.mManagerPanelViewModel = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        cVar.getActive().mo5923a(getLifecycleOwner(), new C4786c(this));
        BitableManagerPanelViewModel cVar2 = this.mManagerPanelViewModel;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        cVar2.setOperationCallBack(new C4787d(this));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        BitableManagerPanelViewModel cVar = this.mManagerPanelViewModel;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        cVar.getActive().mo5929b((Boolean) false);
    }

    public final void executeOperationCallback(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "id", (Object) str);
        jSONObject2.put((Object) "blockId", (Object) str2);
        jSONObject2.put((Object) "viewId", (Object) str3);
        C13479a.m54764b("BitableManagerPanelPlugin", "executeOperationCallback: " + jSONObject.toJSONString());
        AbstractC7947h hVar = this.mCallBackFunction;
        if (hVar != null) {
            hVar.mo17188a(jSONObject);
        }
    }
}
