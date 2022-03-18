package com.bytedance.ee.bear.document.icon;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.document.icon.DocIconNetResult;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.empty.C7689c;
import com.bytedance.ee.bear.facade.common.empty.C7690d;
import com.bytedance.ee.bear.facade.common.empty.C7692e;
import com.bytedance.ee.bear.facade.common.empty.Config;
import com.bytedance.ee.bear.facade.common.empty.EmptyView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.reflect.KDeclarationContainer;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 S2\u00020\u0001:\u0001SB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010 H\u0002J\u001c\u00105\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010 2\b\b\u0002\u00106\u001a\u00020$H\u0002J\b\u00107\u001a\u000203H\u0002J\u0014\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010;\u001a\u00020\"H\u0002J\b\u0010<\u001a\u00020\"H\u0002J\u0010\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u0002032\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010A\u001a\u0002032\u0006\u0010>\u001a\u00020?H\u0002J\"\u0010B\u001a\u0002032\u0018\b\u0002\u0010C\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u0004\u0012\u000203\u0018\u00010DH\u0002J\b\u0010F\u001a\u00020$H\u0016J\u0012\u0010G\u001a\u0002032\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J&\u0010J\u001a\u0004\u0018\u00010?2\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010O\u001a\u000203H\u0016J\u001a\u0010P\u001a\u0002032\u0006\u0010>\u001a\u00020?2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010Q\u001a\u000203H\u0002J\b\u0010R\u001a\u000203H\u0002R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u0018\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconSelectFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "connectionObserver", "Lcom/bytedance/ee/util/observer/DiffObserver;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "connectionService", "Lcom/bytedance/ee/bear/contract/ConnectionService;", "getConnectionService", "()Lcom/bytedance/ee/bear/contract/ConnectionService;", "disposable", "Lio/reactivex/disposables/Disposable;", "documentToken", "", "getDocumentToken", "()Ljava/lang/String;", "setDocumentToken", "(Ljava/lang/String;)V", "emptyMediator", "Lcom/bytedance/ee/bear/facade/common/empty/EmptyMediator;", "emptyStateSource", "Lcom/bytedance/ee/bear/facade/common/empty/EmptyStateSource;", "eventReport", "Lcom/bytedance/ee/bear/document/icon/IconEventReport;", "getEventReport", "()Lcom/bytedance/ee/bear/document/icon/IconEventReport;", "setEventReport", "(Lcom/bytedance/ee/bear/document/icon/IconEventReport;)V", "iconImageAdapter", "Lcom/bytedance/ee/bear/document/icon/IconImageAdapter;", "iconListObserver", "", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "itemMargin", "", "loaded", "", "localeService", "Lcom/bytedance/ee/bear/contract/LocaleService;", "getLocaleService", "()Lcom/bytedance/ee/bear/contract/LocaleService;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "selectIconObserver", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "spanCount", "statusbar", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "viewModel", "Lcom/bytedance/ee/bear/document/icon/IconViewModel;", "clickIcon", "", "iconInfo", "clickIconWidthRandomOption", "random", "close", "getEmptyViewConfig", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "language", "getItemCountPerRow", "getItemMargin", "initEmptyView", "view", "Landroid/view/View;", "initRecyclerView", "initTitle", "loadIconInfoIfNeed", "onError", "Lkotlin/Function1;", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "randomSelect", "registerObservers", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.icon.d */
public final class IconSelectFragment extends C7667e {

    /* renamed from: g */
    public static final Companion f16354g = new Companion(null);

    /* renamed from: a */
    public IconImageAdapter f16355a;

    /* renamed from: b */
    public IconViewModel f16356b;

    /* renamed from: c */
    public C7692e f16357c;

    /* renamed from: d */
    public int f16358d;

    /* renamed from: e */
    public int f16359e;

    /* renamed from: f */
    public boolean f16360f;

    /* renamed from: h */
    private RecyclerView f16361h;

    /* renamed from: i */
    private IStatusBar f16362i;

    /* renamed from: j */
    private Disposable f16363j;

    /* renamed from: k */
    private AbstractC13687a<IconInfo> f16364k;

    /* renamed from: l */
    private AbstractC13687a<List<DocIconNetResult.Icon>> f16365l;

    /* renamed from: m */
    private AbstractC13687a<ConnectionService.NetworkState> f16366m;

    /* renamed from: n */
    private C7690d f16367n;

    /* renamed from: o */
    private String f16368o;

    /* renamed from: p */
    private IconEventReport f16369p;

    /* renamed from: q */
    private HashMap f16370q;

    /* renamed from: c */
    public void mo23419c() {
        HashMap hashMap = this.f16370q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconSelectFragment$Companion;", "", "()V", "ICON_LIST_MARGIN", "", "ITEM_WIDTH", "MIN_ITEM_MARGIN", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onFailedRetry"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$c */
    public static final class C5831c implements EmptyView.AbstractC7668a {

        /* renamed from: a */
        final /* synthetic */ IconSelectFragment f16371a;

        C5831c(IconSelectFragment dVar) {
            this.f16371a = dVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.empty.EmptyView.AbstractC7668a
        public final void onFailedRetry() {
            IconSelectFragment.m23461a(this.f16371a, null, 1, null);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo23418b();
        return true;
    }

    /* renamed from: d */
    private final ao m23467d() {
        ao b = C4484g.m18494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "SdkLocaleServiceWrapper.getInstance()");
        return b;
    }

    /* renamed from: e */
    private final ConnectionService m23468e() {
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        return d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f16363j;
        if (disposable != null) {
            disposable.dispose();
        }
        IStatusBar aVar = this.f16362i;
        if (aVar != null) {
            aVar.mo50689b();
        }
        mo23419c();
    }

    /* renamed from: f */
    private final int m23469f() {
        int a = C13749l.m55736a();
        int a2 = C13749l.m55738a(8);
        return (int) ((float) Math.floor((double) (((float) (((a - a2) - C13749l.m55738a(8)) / C13749l.m55738a(48))) * 1.0f)));
    }

    /* renamed from: g */
    private final int m23470g() {
        int a = C13749l.m55736a();
        int a2 = C13749l.m55738a(8);
        int a3 = C13749l.m55738a(8);
        int a4 = C13749l.m55738a(48);
        int i = (a - a2) - a3;
        int i2 = this.f16358d;
        return (int) ((float) Math.floor((double) (((float) (i - (a4 * i2))) / (((float) i2) - 1.0f))));
    }

    /* renamed from: b */
    public final void mo23418b() {
        IconViewModel eVar = this.f16356b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar.getActive().mo5929b((Boolean) false);
    }

    /* renamed from: h */
    private final void m23471h() {
        this.f16364k = new C5838j(this);
        IconViewModel eVar = this.f16356b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<IconInfo> selectedIcon = eVar.getSelectedIcon();
        IconSelectFragment dVar = this;
        AbstractC13687a<IconInfo> aVar = this.f16364k;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        selectedIcon.mo5923a(dVar, aVar);
        this.f16365l = new C5839k(this);
        IconViewModel eVar2 = this.f16356b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<List<DocIconNetResult.Icon>> iconInfoList = eVar2.getIconInfoList();
        AbstractC13687a<List<DocIconNetResult.Icon>> aVar2 = this.f16365l;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        iconInfoList.mo5923a(dVar, aVar2);
        this.f16366m = new C5840l(this);
        LiveData<ConnectionService.NetworkState> a = m23468e().mo20037a();
        AbstractC13687a<ConnectionService.NetworkState> aVar3 = this.f16366m;
        if (aVar3 == null) {
            Intrinsics.throwNpe();
        }
        a.mo5923a(dVar, aVar3);
    }

    /* renamed from: a */
    public final void mo23414a() {
        C13479a.m54772d("IconSelectFragment", "random select icon");
        IconViewModel eVar = this.f16356b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        List<DocIconNetResult.Icon> b = eVar.getIconInfoList().mo5927b();
        Integer valueOf = b != null ? Integer.valueOf(b.size()) : null;
        if (!(valueOf == null || valueOf.intValue() == 0)) {
            IconViewModel eVar2 = this.f16356b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            IconInfo b2 = eVar2.getSelectedIcon().mo5927b();
            ArrayList arrayList = new ArrayList();
            for (T t : b) {
                T t2 = t;
                if (true ^ TextUtils.equals(b2 != null ? b2.getKey() : null, t2.key)) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                m23460a((DocIconNetResult.Icon) CollectionsKt.random(arrayList2, Random.f173148c), true);
            }
        }
    }

    /* renamed from: a */
    public final void mo23416a(IconEventReport aVar) {
        this.f16369p = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "invoke", "com/bytedance/ee/bear/document/icon/IconSelectFragment$getEmptyViewConfig$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$b */
    public static final class C5830b extends Lambda implements Function1<Config, Unit> {
        final /* synthetic */ Context $it;
        final /* synthetic */ String $language$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5830b(Context context, String str) {
            super(1);
            this.$it = context;
            this.$language$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(Config aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            Context context = this.$it;
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            aVar.mo30143a(context);
            aVar.mo30152e();
            String str = this.$language$inlined;
            if (str != null) {
                aVar.mo30144a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "Lkotlin/ParameterName;", "name", "iconInfo", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$d */
    public static final /* synthetic */ class C5832d extends FunctionReference implements Function1<DocIconNetResult.Icon, Unit> {
        C5832d(IconSelectFragment dVar) {
            super(1, dVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "clickIcon";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(IconSelectFragment.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "clickIcon(Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocIconNetResult.Icon icon) {
            invoke(icon);
            return Unit.INSTANCE;
        }

        public final void invoke(DocIconNetResult.Icon icon) {
            ((IconSelectFragment) this.receiver).mo23415a(icon);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/document/icon/IconSelectFragment$initRecyclerView$itemDecoration$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$e */
    public static final class C5833e extends RecyclerView.AbstractC1335d {

        /* renamed from: a */
        final /* synthetic */ IconSelectFragment f16372a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5833e(IconSelectFragment dVar) {
            this.f16372a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            rect.left = 0;
            rect.top = 0;
            if (recyclerView.indexOfChild(view) % this.f16372a.f16358d == this.f16372a.f16358d - 1) {
                rect.right = 0;
            } else {
                rect.right = this.f16372a.f16359e;
            }
            rect.bottom = this.f16372a.f16359e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/icon/IconSelectFragment$initTitle$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$f */
    public static final class C5834f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ IconSelectFragment f16373a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5834f(IconSelectFragment dVar) {
            this.f16373a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f16373a.mo23418b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "invoke", "com/bytedance/ee/bear/document/icon/IconSelectFragment$loadIconInfoIfNeed$1$errorHandler$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$h */
    public static final class C5836h extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Function1 $onError$inlined;
        final /* synthetic */ IconSelectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5836h(IconSelectFragment dVar, Function1 function1) {
            super(1);
            this.this$0 = dVar;
            this.$onError$inlined = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            C7692e eVar = this.this$0.f16357c;
            if (eVar != null) {
                eVar.mo30160a(th);
            }
            C13479a.m54759a("IconSelectFragment", "error in fetching icon list", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "iconList", "", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "invoke", "com/bytedance/ee/bear/document/icon/IconSelectFragment$loadIconInfoIfNeed$1$1$1", "com/bytedance/ee/bear/document/icon/IconSelectFragment$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$i */
    public static final class C5837i extends Lambda implements Function1<List<? extends DocIconNetResult.Icon>, Unit> {
        final /* synthetic */ Function1 $onError$inlined;
        final /* synthetic */ String $token$inlined;
        final /* synthetic */ IconSelectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5837i(String str, IconSelectFragment dVar, Function1 function1) {
            super(1);
            this.$token$inlined = str;
            this.this$0 = dVar;
            this.$onError$inlined = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DocIconNetResult.Icon> list) {
            invoke(list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<? extends DocIconNetResult.Icon> list) {
            Intrinsics.checkParameterIsNotNull(list, "iconList");
            IconSelectFragment.m23463b(this.this$0).getIconInfoList().mo5929b((List<DocIconNetResult.Icon>) list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/icon/IconSelectFragment$registerObservers$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "onChange", "", "icon", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$j */
    public static final class C5838j extends AbstractC13687a<IconInfo> {

        /* renamed from: a */
        final /* synthetic */ IconSelectFragment f16375a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5838j(IconSelectFragment dVar) {
            this.f16375a = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(IconInfo iconInfo) {
            if (IconInfo.isEmpty(iconInfo)) {
                IconSelectFragment.m23458a(this.f16375a).mo23398a((IconInfo) null);
            } else {
                IconSelectFragment.m23458a(this.f16375a).mo23398a(iconInfo);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/document/icon/IconSelectFragment$registerObservers$2", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "onChange", "", "iconList", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$k */
    public static final class C5839k extends AbstractC13687a<List<? extends DocIconNetResult.Icon>> {

        /* renamed from: a */
        final /* synthetic */ IconSelectFragment f16376a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5839k(IconSelectFragment dVar) {
            this.f16376a = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(List<? extends DocIconNetResult.Icon> list) {
            if (list != null) {
                C7692e eVar = this.f16376a.f16357c;
                if (eVar != null) {
                    eVar.mo30163g();
                }
                this.f16376a.f16360f = true;
                IconSelectFragment.m23458a(this.f16376a).mo23400a(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/icon/IconSelectFragment$registerObservers$3", "Lcom/bytedance/ee/util/observer/DiffObserver;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChange", "", "state", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$l */
    public static final class C5840l extends AbstractC13687a<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ IconSelectFragment f16377a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5840l(IconSelectFragment dVar) {
            this.f16377a = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(ConnectionService.NetworkState networkState) {
            boolean z;
            C7692e eVar;
            if (networkState != null) {
                z = networkState.mo20041b();
            } else {
                z = false;
            }
            if (z) {
                IconSelectFragment.m23461a(this.f16377a, null, 1, null);
            } else if (!this.f16377a.f16360f && (eVar = this.f16377a.f16357c) != null) {
                eVar.mo30160a((Throwable) new IOException("no network"));
            }
        }
    }

    /* renamed from: a */
    public final void mo23415a(DocIconNetResult.Icon icon) {
        m23460a(icon, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/icon/IconSelectFragment$initTitle$2", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.d$g */
    public static final class C5835g extends BaseTitleBar.C11804e {

        /* renamed from: a */
        final /* synthetic */ IconSelectFragment f16374a;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            super.mo16854a(view);
            this.f16374a.mo23414a();
            this.f16374a.mo23418b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5835g(IconSelectFragment dVar, CharSequence charSequence, int i) {
            super(charSequence, i);
            this.f16374a = dVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IconImageAdapter m23458a(IconSelectFragment dVar) {
        IconImageAdapter bVar = dVar.f16355a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageAdapter");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IconViewModel m23463b(IconSelectFragment dVar) {
        IconViewModel eVar = dVar.f16356b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return eVar;
    }

    /* renamed from: b */
    private final Config m23464b(String str) {
        Context context = getContext();
        if (context != null) {
            return C7689c.m30765a(new C5830b(context, str));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo23417a(String str) {
        this.f16368o = str;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, IconViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…conViewModel::class.java)");
        this.f16356b = (IconViewModel) a;
        this.f16358d = m23469f();
        int g = m23470g();
        this.f16359e = g;
        if (g < C13749l.m55738a(4)) {
            this.f16358d--;
            this.f16359e = m23470g();
        }
    }

    /* renamed from: a */
    private final void m23459a(View view) {
        CharSequence charSequence;
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.doc_icon_select_title_bar);
        baseTitleBar.setDividerVisible(false);
        baseTitleBar.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        baseTitleBar.setLeftClickListener(new C5834f(this));
        baseTitleBar.setTitle(R.string.Doc_Doc_ChooseIcon);
        Context context = getContext();
        if (context == null || (charSequence = context.getText(R.string.Doc_Doc_IconRandom)) == null) {
        }
        baseTitleBar.mo45070a((BaseTitleBar.AbstractC11800a) new C5835g(this, charSequence, R.color.doc_icon_random_text_selector));
    }

    /* renamed from: b */
    private final void m23465b(View view) {
        IconImageAdapter bVar = new IconImageAdapter();
        this.f16355a = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageAdapter");
        }
        bVar.mo23401a(new C5832d(this));
        View findViewById = view.findViewById(R.id.rv_icon_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.rv_icon_container)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f16361h = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f16358d));
        RecyclerView recyclerView2 = this.f16361h;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        IconImageAdapter bVar2 = this.f16355a;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageAdapter");
        }
        recyclerView2.setAdapter(bVar2);
        C5833e eVar = new C5833e(this);
        RecyclerView recyclerView3 = this.f16361h;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        recyclerView3.addItemDecoration(eVar);
    }

    /* renamed from: c */
    private final void m23466c(View view) {
        C7692e eVar;
        EmptyView emptyView = (EmptyView) view.findViewById(R.id.emptyView);
        Intrinsics.checkExpressionValueIsNotNull(emptyView, "emptyView");
        emptyView.setConfig(m23464b(m23467d().mo17252c()));
        Context context = view.getContext();
        IconSelectFragment dVar = this;
        EmptyView emptyView2 = emptyView;
        RecyclerView recyclerView = this.f16361h;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        C7690d dVar2 = new C7690d(context, dVar, emptyView2, recyclerView);
        this.f16367n = dVar2;
        if (dVar2 != null) {
            eVar = dVar2.mo30157a();
        } else {
            eVar = null;
        }
        this.f16357c = eVar;
        emptyView.setOnRetryListener(new C5831c(this));
    }

    /* renamed from: a */
    private final void m23462a(Function1<? super Throwable, Unit> function1) {
        String str;
        C5836h hVar;
        if (!this.f16360f && (str = this.f16368o) != null) {
            C7692e eVar = this.f16357c;
            if (eVar != null) {
                eVar.mo30162f();
            }
            if (function1 != null) {
                hVar = function1;
            } else {
                hVar = new C5836h(this, function1);
            }
            Disposable disposable = this.f16363j;
            if (disposable != null) {
                disposable.dispose();
            }
            IconListFetcher cVar = new IconListFetcher((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));
            cVar.mo23404a(str);
            cVar.mo23405a(new C5837i(str, this, function1));
            this.f16363j = cVar.mo23406b(hVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            IStatusBar a = StatusBarManager.m55628a(activity);
            this.f16362i = a;
            if (a != null) {
                a.mo50687a();
            }
            IStatusBar aVar = this.f16362i;
            if (aVar != null) {
                aVar.mo50690b(R.color.space_kit_n00, true);
            }
        }
        m23459a(view);
        m23465b(view);
        m23466c(view);
        m23471h();
    }

    /* renamed from: a */
    private final void m23460a(DocIconNetResult.Icon icon, boolean z) {
        if (icon != null) {
            if (z) {
                IconEventReport aVar = this.f16369p;
                if (aVar != null) {
                    aVar.mo23394b(Integer.valueOf(icon.id), null);
                }
            } else if (TextUtils.equals(icon.key, "noneIconKey")) {
                IconEventReport aVar2 = this.f16369p;
                if (aVar2 != null) {
                    aVar2.mo23395c();
                }
            } else {
                IconEventReport aVar3 = this.f16369p;
                if (aVar3 != null) {
                    aVar3.mo23392a(Integer.valueOf(icon.id), (String) null);
                }
            }
            IconViewModel eVar = this.f16356b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            eVar.setIcon(icon);
            mo23418b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.doc_icon_select_fragment, viewGroup, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.document.icon.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m23461a(IconSelectFragment dVar, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        dVar.m23462a(function1);
    }
}
