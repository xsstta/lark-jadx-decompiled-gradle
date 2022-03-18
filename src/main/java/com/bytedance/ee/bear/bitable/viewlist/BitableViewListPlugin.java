package com.bytedance.ee.bear.bitable.viewlist;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.viewlist.BitableViewListViewModel;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000eH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "activeObserver", "Landroidx/lifecycle/Observer;", "", "setBiTableViewsHandler", "Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListPlugin$SetBiTableViewsHandler;", "viewModel", "Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "getViewListFragment", "Landroidx/fragment/app/DialogFragment;", "hideViewListFragment", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "shouldDisableLandscape", "showViewListFragment", "Companion", "SetBiTableViewsHandler", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableViewListPlugin extends DocumentPlugin implements AbstractC6054a {
    public static final Companion Companion = new Companion(null);
    public static final String TAG;
    private AbstractC1178x<Boolean> activeObserver;
    public SetBiTableViewsHandler setBiTableViewsHandler;
    public BitableViewListViewModel viewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListPlugin$Companion;", "", "()V", "SET_BITABLE_VIEW_LIST", "", "TAG", "getTAG", "()Ljava/lang/String;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.BitableViewListPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo19005a() {
            return BitableViewListPlugin.TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListPlugin$SetBiTableViewsHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewList;", "(Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "getCallback", "()Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "setCallback", "(Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.BitableViewListPlugin$b */
    public final class SetBiTableViewsHandler implements AbstractC7945d<BiTableViewList> {

        /* renamed from: b */
        private AbstractC7947h f14247b;

        /* renamed from: a */
        public final AbstractC7947h mo19006a() {
            return this.f14247b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SetBiTableViewsHandler() {
        }

        /* renamed from: a */
        public void handle(BiTableViewList biTableViewList, AbstractC7947h hVar) {
            String str;
            List<BiTableViewItem> views;
            String a = BitableViewListPlugin.Companion.mo19005a();
            C13479a.m54764b(a, "SetBiTableViewsHandler receive data : " + biTableViewList);
            if (biTableViewList != null) {
                str = biTableViewList.getTableId();
            } else {
                str = null;
            }
            if (str == null || biTableViewList.getViews() == null || ((views = biTableViewList.getViews()) != null && views.isEmpty())) {
                C13479a.m54772d(BitableViewListPlugin.Companion.mo19005a(), "close bitableViewList...");
                BitableViewListPlugin.access$getViewModel$p(BitableViewListPlugin.this).setActive(false);
                return;
            }
            BitableViewListPlugin.access$getViewModel$p(BitableViewListPlugin.this).setActive(true);
            BitableViewListPlugin.access$getViewModel$p(BitableViewListPlugin.this).getViewList().mo5929b(biTableViewList);
            this.f14247b = hVar;
        }
    }

    public final void hideViewListFragment() {
        DialogInterface$OnCancelListenerC1021b viewListFragment = getViewListFragment();
        if (viewListFragment != null) {
            viewListFragment.mo5513b();
        }
    }

    static {
        String simpleName = BitableViewListPlugin.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "BitableViewListPlugin::class.java.simpleName");
        TAG = simpleName;
    }

    private final DialogInterface$OnCancelListenerC1021b getViewListFragment() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        Fragment findFragmentByTag = activity.getSupportFragmentManager().findFragmentByTag(BitableViewListFragment.f14259g.mo19018a());
        if (!(findFragmentByTag instanceof DialogInterface$OnCancelListenerC1021b)) {
            findFragmentByTag = null;
        }
        return (DialogInterface$OnCancelListenerC1021b) findFragmentByTag;
    }

    public final void showViewListFragment() {
        if (getViewListFragment() == null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            ((DialogInterface$OnCancelListenerC1021b) instantiateFragment(BitableViewListFragment.class)).mo5511a(activity.getSupportFragmentManager(), BitableViewListFragment.f14259g.mo19018a());
            return;
        }
        C13479a.m54775e(TAG, "showViewListFragment, fragment exist");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/bitable/viewlist/BitableViewListPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel$Delegate;", "onDoAction", "", "tableId", "", "action", "payload", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.BitableViewListPlugin$d */
    public static final class C4851d implements BitableViewListViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ BitableViewListPlugin f14250a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4851d(BitableViewListPlugin bitableViewListPlugin) {
            this.f14250a = bitableViewListPlugin;
        }

        @Override // com.bytedance.ee.bear.bitable.viewlist.BitableViewListViewModel.Delegate
        /* renamed from: a */
        public void mo19009a(String str, String str2, Map<String, String> map) {
            Intrinsics.checkParameterIsNotNull(str, "tableId");
            Intrinsics.checkParameterIsNotNull(str2, "action");
            String a = BitableViewListPlugin.Companion.mo19005a();
            C13479a.m54772d(a, "Do biTable view list action[" + str2 + "], tableId[" + str + "] payload:" + String.valueOf(map));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tableId", (Object) str);
            jSONObject.put("action", (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            jSONObject2.putAll(map);
            jSONObject.put("payload", (Object) jSONObject2);
            AbstractC7947h a2 = BitableViewListPlugin.access$getSetBiTableViewsHandler$p(this.f14250a).mo19006a();
            if (a2 != null) {
                a2.mo17188a(jSONObject);
            }
        }
    }

    public static final /* synthetic */ SetBiTableViewsHandler access$getSetBiTableViewsHandler$p(BitableViewListPlugin bitableViewListPlugin) {
        SetBiTableViewsHandler bVar = bitableViewListPlugin.setBiTableViewsHandler;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setBiTableViewsHandler");
        }
        return bVar;
    }

    public static final /* synthetic */ BitableViewListViewModel access$getViewModel$p(BitableViewListPlugin bitableViewListPlugin) {
        BitableViewListViewModel cVar = bitableViewListPlugin.viewModel;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return cVar;
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        SetBiTableViewsHandler bVar = new SetBiTableViewsHandler();
        this.setBiTableViewsHandler = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setBiTableViewsHandler");
        }
        map.put("biz.bitable.setView", bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/viewlist/BitableViewListPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", "it", "(Ljava/lang/Boolean;)V", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.BitableViewListPlugin$c */
    public static final class C4850c extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BitableViewListPlugin f14248a;

        /* renamed from: b */
        final /* synthetic */ UnspecifiedOrientationPlugin f14249b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            if (Intrinsics.areEqual((Object) true, (Object) bool)) {
                this.f14248a.showViewListFragment();
                UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = this.f14249b;
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this.f14248a);
                    return;
                }
                return;
            }
            this.f14248a.hideViewListFragment();
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin2 = this.f14249b;
            if (unspecifiedOrientationPlugin2 != null) {
                unspecifiedOrientationPlugin2.onOrientationSupportPanelDismiss(this.f14248a);
            }
        }

        C4850c(BitableViewListPlugin bitableViewListPlugin, UnspecifiedOrientationPlugin unspecifiedOrientationPlugin) {
            this.f14248a = bitableViewListPlugin;
            this.f14249b = unspecifiedOrientationPlugin;
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AbstractC1142af viewModel2 = viewModel(BitableViewListViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "viewModel(BitableViewListViewModel::class.java)");
        this.viewModel = (BitableViewListViewModel) viewModel2;
        this.activeObserver = new C4850c(this, (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class));
        BitableViewListViewModel cVar = this.viewModel;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        cVar.setDelegate(new C4851d(this));
        BitableViewListViewModel cVar2 = this.viewModel;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Boolean> active = cVar2.getActive();
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        AbstractC1178x<Boolean> xVar = this.activeObserver;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activeObserver");
        }
        active.mo5923a(lifecycleOwner, xVar);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        BitableViewListViewModel cVar = this.viewModel;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        cVar.setActive(false);
    }
}
