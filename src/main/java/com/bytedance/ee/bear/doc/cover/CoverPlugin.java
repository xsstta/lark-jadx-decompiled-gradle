package com.bytedance.ee.bear.doc.cover;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.doc.cover.CoverViewModel;
import com.bytedance.ee.bear.doc.cover.selectcover.SelectCoverFragment;
import com.bytedance.ee.bear.doc.cover.selectcover.local.LocalImageItem;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverData;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.offline.file.p319a.C5938d;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003&'(B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J$\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J2\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CoverPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "mDisposable", "Lio/reactivex/disposables/Disposable;", "mFetchCoverListener", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$IFetchCoverListener;", "mViewModel", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel;", "encodeUrl", "", "path", "uuid", "getBridgeHandlers", "", "handlersHolder", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "randomCover", "params", "Lcom/alibaba/fastjson/JSONObject;", "setCover", "setLocalImage", ShareHitPoint.f121868c, "image", "Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalImageItem;", "setOfficialCover", "entrance", "", "token", "seriesName", "mimeType", "AdjustCoverPositionHandler", "Companion", "SelectCoverHandler", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CoverPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    private Disposable mDisposable;
    public CoverViewModel.IFetchCoverListener mFetchCoverListener;
    public CoverViewModel mViewModel;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CoverPlugin$Companion;", "", "()V", "BIZ_ADJUST_COVER_POSITION", "", "BIZ_RANDOM_COVER", "BIZ_SELECT_COVER", "BIZ_SET_COVER", "TAG", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J2\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/doc/cover/CoverPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$Delegate;", "deleteCover", "", "selectLocalImage", ShareHitPoint.f121868c, "", "image", "Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalImageItem;", "selectOfficialCover", "entrance", "", "token", "seriesName", "mimeType", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$e */
    public static final class C5382e implements CoverViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ CoverPlugin f15379a;

        @Override // com.bytedance.ee.bear.doc.cover.CoverViewModel.Delegate
        /* renamed from: a */
        public void mo21503a() {
            this.f15379a.setCover(null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5382e(CoverPlugin coverPlugin) {
            this.f15379a = coverPlugin;
        }

        @Override // com.bytedance.ee.bear.doc.cover.CoverViewModel.Delegate
        /* renamed from: a */
        public void mo21505a(String str, LocalImageItem localImageItem) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(localImageItem, "image");
            this.f15379a.setLocalImage(str, localImageItem);
        }

        @Override // com.bytedance.ee.bear.doc.cover.CoverViewModel.Delegate
        /* renamed from: a */
        public void mo21504a(int i, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, "token");
            Intrinsics.checkParameterIsNotNull(str3, "seriesName");
            this.f15379a.setOfficialCover(i, str, str2, str3, str4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/CoverPlugin$onAttachToHost$3", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$IFetchCoverListener;", "onFailure", "", "throwable", "", "onSuccess", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$f */
    public static final class C5383f implements CoverViewModel.IFetchCoverListener {

        /* renamed from: a */
        final /* synthetic */ CoverPlugin f15380a;

        @Override // com.bytedance.ee.bear.doc.cover.CoverViewModel.IFetchCoverListener
        /* renamed from: a */
        public void mo21506a() {
            Companion bVar = CoverPlugin.Companion;
            C13479a.m54772d("DocCover_NewCoverPlugin", "CoverPlugin#onSuccess()");
            CoverPlugin.access$getMViewModel$p(this.f15380a).randomCover(1);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5383f(CoverPlugin coverPlugin) {
            this.f15380a = coverPlugin;
        }

        @Override // com.bytedance.ee.bear.doc.cover.CoverViewModel.IFetchCoverListener
        /* renamed from: a */
        public void mo21507a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            Companion bVar = CoverPlugin.Companion;
            C13479a.m54775e("DocCover_NewCoverPlugin", "CoverPlugin#onFailure(), throwable: " + th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CoverPlugin$AdjustCoverPositionHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/doc/cover/CoverPositionState;", "(Lcom/bytedance/ee/bear/doc/cover/CoverPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$a */
    private final class AdjustCoverPositionHandler implements AbstractC7945d<CoverPositionState> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public AdjustCoverPositionHandler() {
        }

        /* renamed from: a */
        public void handle(CoverPositionState coverPositionState, AbstractC7947h hVar) {
            Boolean bool;
            if (coverPositionState != null) {
                bool = coverPositionState.getSetting();
            } else {
                bool = null;
            }
            boolean areEqual = Intrinsics.areEqual((Object) bool, (Object) true);
            Companion bVar = CoverPlugin.Companion;
            C13479a.m54764b("DocCover_NewCoverPlugin", "AdjustCoverPositionHandler()... is setting ? " + areEqual);
            TitlePlugin titlePlugin = (TitlePlugin) CoverPlugin.this.findPlugin(TitlePlugin.class);
            if (titlePlugin != null) {
                titlePlugin.updateEnableNestScroll(!areEqual);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CoverPlugin$SelectCoverHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/doc/cover/CurrentCoverData;", "(Lcom/bytedance/ee/bear/doc/cover/CoverPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$c */
    private final class SelectCoverHandler implements AbstractC7945d<CurrentCoverData> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SelectCoverHandler() {
        }

        /* renamed from: a */
        public void handle(CurrentCoverData currentCoverData, AbstractC7947h hVar) {
            boolean z;
            Companion bVar = CoverPlugin.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("SelectCoverHandler()... exist cover ? ");
            if (currentCoverData == null || !currentCoverData.isExistCover()) {
                z = false;
            } else {
                z = true;
            }
            sb.append(z);
            C13479a.m54764b("DocCover_NewCoverPlugin", sb.toString());
            if (currentCoverData == null || TextUtils.isEmpty(currentCoverData.getToken())) {
                CoverViewModel.IFetchCoverListener bVar2 = CoverPlugin.this.mFetchCoverListener;
                if (bVar2 != null) {
                    CoverViewModel access$getMViewModel$p = CoverPlugin.access$getMViewModel$p(CoverPlugin.this);
                    C6095s sVar = (C6095s) CoverPlugin.this.getHost();
                    Intrinsics.checkExpressionValueIsNotNull(sVar, "this@CoverPlugin.host");
                    String token = sVar.mo24598m().getToken();
                    Intrinsics.checkExpressionValueIsNotNull(token, "this@CoverPlugin.host.docViewModel.token");
                    C6095s sVar2 = (C6095s) CoverPlugin.this.getHost();
                    Intrinsics.checkExpressionValueIsNotNull(sVar2, "this@CoverPlugin.host");
                    access$getMViewModel$p.randomCover(1, token, sVar2.mo24598m().getDocumentTypeValue(), bVar2);
                    return;
                }
                return;
            }
            CoverPlugin.access$getMViewModel$p(CoverPlugin.this).getSelectCoverActive().mo5929b((Boolean) true);
            CoverPlugin.access$getMViewModel$p(CoverPlugin.this).getCurrentCoverData().mo5929b(currentCoverData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/CoverPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", ActivityC23764o.f58839a, "(Ljava/lang/Boolean;)V", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$d */
    public static final class C5381d extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CoverPlugin f15378a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5381d(CoverPlugin coverPlugin) {
            this.f15378a = coverPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            C10548d.m43696a(this.f15378a.getContext());
            if (Intrinsics.areEqual((Object) true, (Object) bool)) {
                Fragment instantiateFragment = this.f15378a.instantiateFragment(SelectCoverFragment.class);
                Intrinsics.checkExpressionValueIsNotNull(instantiateFragment, "instantiateFragment(Sele…overFragment::class.java)");
                this.f15378a.getUIContainer().mo19589a(this.f15378a, instantiateFragment);
                return;
            }
            this.f15378a.removeFragment();
        }
    }

    public static final /* synthetic */ CoverViewModel access$getMViewModel$p(CoverPlugin coverPlugin) {
        CoverViewModel aVar = coverPlugin.mViewModel;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        return aVar;
    }

    private final void randomCover(JSONObject jSONObject) {
        C13479a.m54764b("DocCover_NewCoverPlugin", "randomCover()...");
        execJS("javascript:lark.biz.title.randomCover", jSONObject);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$i */
    public static final class C5386i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C5386i f15385a = new C5386i();

        C5386i() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Companion bVar = CoverPlugin.Companion;
            C13479a.m54758a("DocCover_NewCoverPlugin", "setLocalImage()... error = " + th);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.title.selectCover", new SelectCoverHandler());
        map.put("biz.title.adjustCoverPosition", new AdjustCoverPositionHandler());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "image", "Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalImageItem;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$g */
    public static final class C5384g<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ CoverPlugin f15381a;

        C5384g(CoverPlugin coverPlugin) {
            this.f15381a = coverPlugin;
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(LocalImageItem localImageItem) {
            Intrinsics.checkParameterIsNotNull(localImageItem, "image");
            HashMap hashMap = new HashMap();
            hashMap.put(this.f15381a.encodeUrl(localImageItem.getFilePath(), localImageItem.getUuid()), localImageItem.getFilePath());
            return C5938d.m23938a(this.f15381a.getDocViewModel().getUrl(), (Map<String, String>) hashMap, false);
        }
    }

    public final void setCover(JSONObject jSONObject) {
        C13479a.m54764b("DocCover_NewCoverPlugin", "setCover()...");
        CoverViewModel aVar = this.mViewModel;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        aVar.getSelectCoverActive().mo5929b((Boolean) false);
        execJS("javascript:lark.biz.title.setCover", jSONObject);
    }

    public void onAttachToHost(C6095s sVar) {
        boolean z;
        super.onAttachToHost((C4943e) sVar);
        AbstractC1142af viewModel = viewModel(CoverViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewModel(CoverViewModel::class.java)");
        CoverViewModel aVar = (CoverViewModel) viewModel;
        this.mViewModel = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        aVar.getSelectCoverActive().mo5923a(getLifecycleOwner(), new C5381d(this));
        CoverViewModel aVar2 = this.mViewModel;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        aVar2.setDelegate(new C5382e(this));
        CoverViewModel aVar3 = this.mViewModel;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        if (getDocViewModel().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        aVar3.setVCFollowMode(z);
        this.mFetchCoverListener = new C5383f(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.CoverPlugin$h */
    public static final class C5385h<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CoverPlugin f15382a;

        /* renamed from: b */
        final /* synthetic */ String f15383b;

        /* renamed from: c */
        final /* synthetic */ LocalImageItem f15384c;

        C5385h(CoverPlugin coverPlugin, String str, LocalImageItem localImageItem) {
            this.f15382a = coverPlugin;
            this.f15383b = str;
            this.f15384c = localImageItem;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "coverSource", (Object) this.f15383b);
            jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) 2);
            jSONObject2.put((Object) "code", (Object) 0);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = jSONObject3;
            jSONObject4.put((Object) "uuid", (Object) this.f15384c.getUuid());
            jSONObject4.put((Object) "contentType", (Object) this.f15384c.getContentType());
            jSONObject4.put((Object) "src", (Object) this.f15382a.encodeUrl(this.f15384c.getFilePath(), this.f15384c.getUuid()));
            jSONObject4.put((Object) "width", (Object) Integer.valueOf(this.f15384c.getWidth()));
            jSONObject4.put((Object) "height", (Object) Integer.valueOf(this.f15384c.getHeight()));
            jSONArray.add(jSONObject3);
            jSONObject2.put((Object) "thumbs", (Object) jSONArray);
            this.f15382a.setCover(jSONObject);
        }
    }

    public final String encodeUrl(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("docsource://com.bytedance.net/file/f/");
        sb.append(str2);
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null);
        if (str != null) {
            String substring = str.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        Disposable disposable;
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        CoverViewModel aVar = this.mViewModel;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        aVar.getCoverSeriesList().mo5929b((List<OfficialCoverData.CoverSeries>) null);
        Disposable disposable2 = this.mDisposable;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.mDisposable) != null) {
            disposable.dispose();
        }
    }

    public final void setLocalImage(String str, LocalImageItem localImageItem) {
        this.mDisposable = AbstractC68307f.m265083a(localImageItem).mo238014c(new C5384g(this)).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new C5385h(this, str, localImageItem), C5386i.f15385a);
    }

    public final void setOfficialCover(int i, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "coverSource", (Object) str);
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) 1);
        jSONObject2.put((Object) "token", (Object) str2);
        jSONObject2.put((Object) "contentType", (Object) str4);
        jSONObject2.put((Object) "series", (Object) str3);
        if (1 == i) {
            randomCover(jSONObject);
        } else {
            setCover(jSONObject);
        }
    }
}
