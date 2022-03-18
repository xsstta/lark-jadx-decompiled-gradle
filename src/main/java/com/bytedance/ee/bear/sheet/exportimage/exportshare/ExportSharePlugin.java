package com.bytedance.ee.bear.sheet.exportimage.exportshare;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.exportimage.exportshare.C11113b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportSharePlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "BIZ_SHEET_EXPORT_SHARE", "", "TAG", "handler", "Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportSharePlugin$ExportShareHandler;", "viewModel", "Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportShareViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "getFragment", "Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportShareDialogFragment;", "hideFragment", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "shouldDisableLandscape", "", "showFragment", "ExportShareHandler", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ExportSharePlugin extends DocumentPlugin implements AbstractC6054a {
    private final String BIZ_SHEET_EXPORT_SHARE = "biz.sheet.exportShare";
    public final String TAG = "ExportSharePlugin";
    public ExportShareHandler handler;
    public C11113b viewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    public final void hideFragment() {
        View$OnClickListenerC11112a fragment = getFragment();
        if (fragment != null) {
            fragment.mo5513b();
        }
    }

    private final View$OnClickListenerC11112a getFragment() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
        return (View$OnClickListenerC11112a) supportFragmentManager.findFragmentByTag(this.TAG);
    }

    public final void showFragment() {
        if (getFragment() == null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            ((View$OnClickListenerC11112a) instantiateFragment(View$OnClickListenerC11112a.class)).mo5511a(activity.getSupportFragmentManager(), this.TAG);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportSharePlugin$ExportShareHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportShareModel;", "(Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportSharePlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCallback", "id", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.exportshare.ExportSharePlugin$a */
    private final class ExportShareHandler implements AbstractC7945d<ExportShareModel> {

        /* renamed from: b */
        private AbstractC7947h f29842b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ExportShareHandler() {
        }

        /* renamed from: a */
        public final void mo42378a(String str) {
            String str2 = ExportSharePlugin.this.TAG;
            C13479a.m54764b(str2, "onCallback(id: " + str + ')');
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "id", (Object) str);
            AbstractC7947h hVar = this.f29842b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(ExportShareModel exportShareModel, AbstractC7947h hVar) {
            String[] strArr;
            boolean z;
            this.f29842b = hVar;
            C11113b bVar = ExportSharePlugin.this.viewModel;
            if (bVar != null) {
                if (exportShareModel != null) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.setActiveValue(z);
            }
            C11113b bVar2 = ExportSharePlugin.this.viewModel;
            if (bVar2 != null) {
                if (exportShareModel != null) {
                    strArr = exportShareModel.getTypes();
                } else {
                    strArr = null;
                }
                bVar2.setShareItems(strArr);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/exportshare/ExportSharePlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/sheet/exportimage/exportshare/ExportShareViewModel$SheetExportShareDelegate;", "onDoAction", "", "id", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.exportshare.ExportSharePlugin$b */
    public static final class C11110b implements C11113b.AbstractC11114a {

        /* renamed from: a */
        final /* synthetic */ ExportSharePlugin f29843a;

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a, com.bytedance.ee.bear.sheet.exportimage.exportshare.C11113b.AbstractC11114a
        /* renamed from: a */
        public /* synthetic */ void mo23197a(ExportFormatEnum exportFormatEnum, AbstractC5168a aVar) {
            C11113b.AbstractC11114a.CC.$default$a(this, exportFormatEnum, aVar);
        }

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a, com.bytedance.ee.bear.sheet.exportimage.exportshare.C11113b.AbstractC11114a
        /* renamed from: a */
        public /* synthetic */ void mo23198a(String str) {
            C11113b.AbstractC11114a.CC.$default$a(this, str);
        }

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a, com.bytedance.ee.bear.sheet.exportimage.exportshare.C11113b.AbstractC11114a
        /* renamed from: b */
        public /* synthetic */ void mo23199b(String str) {
            C11113b.AbstractC11114a.CC.$default$b(this, str);
        }

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a, com.bytedance.ee.bear.sheet.exportimage.exportshare.C11113b.AbstractC11114a
        /* renamed from: c */
        public /* synthetic */ void mo23200c() {
            C11113b.AbstractC11114a.CC.$default$c(this);
        }

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a, com.bytedance.ee.bear.sheet.exportimage.exportshare.C11113b.AbstractC11114a
        /* renamed from: c */
        public /* synthetic */ void mo23201c(String str) {
            C11113b.AbstractC11114a.CC.$default$c(this, str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11110b(ExportSharePlugin exportSharePlugin) {
            this.f29843a = exportSharePlugin;
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.exportshare.C11113b.AbstractC11114a
        /* renamed from: d */
        public void mo42379d(String str) {
            ExportShareHandler aVar = this.f29843a.handler;
            if (aVar != null) {
                aVar.mo42378a(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/exportshare/ExportSharePlugin$onAttachToHost$2", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "t", "(Ljava/lang/Boolean;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.exportshare.ExportSharePlugin$c */
    public static final class C11111c implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ExportSharePlugin f29844a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11111c(ExportSharePlugin exportSharePlugin) {
            this.f29844a = exportSharePlugin;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) this.f29844a.findPlugin(UnspecifiedOrientationPlugin.class);
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this.f29844a);
                }
                this.f29844a.showFragment();
                return;
            }
            if (unspecifiedOrientationPlugin != null) {
                unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this.f29844a);
            }
            this.f29844a.hideFragment();
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        ExportShareHandler aVar = new ExportShareHandler();
        this.handler = aVar;
        String str = this.BIZ_SHEET_EXPORT_SHARE;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        map.put(str, aVar);
    }

    public void onAttachToHost(C6095s sVar) {
        LiveData<Boolean> active;
        super.onAttachToHost((C4943e) sVar);
        C11113b bVar = (C11113b) viewModel(C11113b.class);
        this.viewModel = bVar;
        if (bVar != null) {
            bVar.setExportShareDelegate(new C11110b(this));
        }
        C11113b bVar2 = this.viewModel;
        if (bVar2 != null && (active = bVar2.getActive()) != null) {
            active.mo5923a(getLifecycleOwner(), new C11111c(this));
        }
    }
}
