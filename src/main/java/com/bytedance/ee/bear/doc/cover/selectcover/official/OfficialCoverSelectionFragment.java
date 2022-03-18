package com.bytedance.ee.bear.doc.cover.selectcover.official;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1142af;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.doc.cover.CoverViewModel;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverData;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.huawei.hms.site.ActivityC23764o;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverSelectionFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "mCoverContainer", "Landroid/view/View;", "mCoverSeriesAdapter", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverSeriesAdapter;", "mCoverSeriesRV", "Landroidx/recyclerview/widget/RecyclerView;", "mCoverViewModel", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel;", "mDisposable", "Lio/reactivex/disposables/Disposable;", "mDocViewModel", "Lcom/bytedance/ee/bear/document/DocViewModel;", "mEmptyState", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceEmptyState;", "mLoadFailedView", "mLoadingView", "fetchRemoteCoverData", "", "initView", "rootView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "renderCoverData", "switchViewState", "isLoading", "", "isLoadFailed", "Companion", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.e */
public final class OfficialCoverSelectionFragment extends C7667e {

    /* renamed from: c */
    public static final Companion f15448c = new Companion(null);

    /* renamed from: a */
    public CoverViewModel f15449a;

    /* renamed from: b */
    public CoverSeriesAdapter f15450b;

    /* renamed from: d */
    private DocViewModel f15451d;

    /* renamed from: e */
    private View f15452e;

    /* renamed from: f */
    private View f15453f;

    /* renamed from: g */
    private SpaceEmptyState f15454g;

    /* renamed from: h */
    private View f15455h;

    /* renamed from: i */
    private RecyclerView f15456i;

    /* renamed from: j */
    private Disposable f15457j;

    /* renamed from: k */
    private HashMap f15458k;

    /* renamed from: b */
    public void mo21620b() {
        HashMap hashMap = this.f15458k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverSelectionFragment$Companion;", "", "()V", "TAG", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverSelectionFragment$fetchRemoteCoverData$1", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$IFetchCoverListener;", "onFailure", "", "throwable", "", "onSuccess", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.e$b */
    public static final class C5405b implements CoverViewModel.IFetchCoverListener {

        /* renamed from: a */
        final /* synthetic */ OfficialCoverSelectionFragment f15459a;

        @Override // com.bytedance.ee.bear.doc.cover.CoverViewModel.IFetchCoverListener
        /* renamed from: a */
        public void mo21506a() {
            C13479a.m54772d("DocCover_OfficialCoverSelectionFragment", "fetchRemoteCoverData()... success");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5405b(OfficialCoverSelectionFragment eVar) {
            this.f15459a = eVar;
        }

        @Override // com.bytedance.ee.bear.doc.cover.CoverViewModel.IFetchCoverListener
        /* renamed from: a */
        public void mo21507a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54775e("DocCover_OfficialCoverSelectionFragment", "fetchRemoteCoverData()... failed, error = " + th.getMessage());
            this.f15459a.mo21619a(false, true);
        }
    }

    /* renamed from: c */
    private final void m21975c() {
        CoverViewModel aVar = this.f15449a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        aVar.getCoverSeriesList().mo5923a(this, new C5409f(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Disposable disposable;
        super.onDestroyView();
        Disposable disposable2 = this.f15457j;
        if (!(disposable2 == null || disposable2.isDisposed() || (disposable = this.f15457j) == null)) {
            disposable.dispose();
        }
        mo21620b();
    }

    /* renamed from: a */
    public final void mo21618a() {
        C13479a.m54764b("DocCover_OfficialCoverSelectionFragment", "fetchRemoteCoverData()...");
        mo21619a(true, false);
        CoverViewModel aVar = this.f15449a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        if (aVar.isCoverDataNotExist()) {
            CoverViewModel aVar2 = this.f15449a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
            }
            if (!aVar2.isRemoteLoading()) {
                CoverViewModel aVar3 = this.f15449a;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
                }
                DocViewModel docViewModel = this.f15451d;
                if (docViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDocViewModel");
                }
                String token = docViewModel.getToken();
                Intrinsics.checkExpressionValueIsNotNull(token, "mDocViewModel.token");
                DocViewModel docViewModel2 = this.f15451d;
                if (docViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDocViewModel");
                }
                aVar3.fetchOfficialCoverData(token, docViewModel2.getDocumentTypeValue(), new C5405b(this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverSelectionFragment$initView$1", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OnOfficialCoverClickListener;", "onClick", "", "coverToken", "", "mimeType", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.e$c */
    public static final class C5406c implements OnOfficialCoverClickListener {

        /* renamed from: a */
        final /* synthetic */ OfficialCoverSelectionFragment f15460a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5406c(OfficialCoverSelectionFragment eVar) {
            this.f15460a = eVar;
        }

        @Override // com.bytedance.ee.bear.doc.cover.selectcover.official.OnOfficialCoverClickListener
        /* renamed from: a */
        public void mo21621a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "coverToken");
            OfficialCoverSelectionFragment.m21972a(this.f15460a).selectOfficialCover(2, str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.e$d */
    public static final class View$OnClickListenerC5407d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OfficialCoverSelectionFragment f15461a;

        View$OnClickListenerC5407d(OfficialCoverSelectionFragment eVar) {
            this.f15461a = eVar;
        }

        public final void onClick(View view) {
            this.f15461a.mo21618a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverSelectionFragment$onViewCreated$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", ActivityC23764o.f58839a, "(Ljava/lang/Boolean;)V", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.e$e */
    public static final class C5408e extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OfficialCoverSelectionFragment f15462a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5408e(OfficialCoverSelectionFragment eVar) {
            this.f15462a = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            C13479a.m54772d("DocCover_OfficialCoverSelectionFragment", "isEnterAnimationShowing = " + bool);
            if (Intrinsics.areEqual((Object) false, (Object) bool)) {
                this.f15462a.mo21618a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverSelectionFragment$renderCoverData$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverSeries;", "onChange", "", "coverSeries", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.e$f */
    public static final class C5409f extends AbstractC13687a<List<? extends OfficialCoverData.CoverSeries>> {

        /* renamed from: a */
        final /* synthetic */ OfficialCoverSelectionFragment f15463a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5409f(OfficialCoverSelectionFragment eVar) {
            this.f15463a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ee.util.p708k.AbstractC13687a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo18510a(List<? extends OfficialCoverData.CoverSeries> list) {
            mo21624a((List<OfficialCoverData.CoverSeries>) list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo21624a(List<OfficialCoverData.CoverSeries> list) {
            if (list != null && (!list.isEmpty())) {
                C13479a.m54764b("DocCover_OfficialCoverSelectionFragment", "renderCoverData()...");
                this.f15463a.mo21619a(false, false);
                OfficialCoverSelectionFragment.m21974b(this.f15463a).mo21613a(list);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CoverViewModel m21972a(OfficialCoverSelectionFragment eVar) {
        CoverViewModel aVar = eVar.f15449a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CoverSeriesAdapter m21974b(OfficialCoverSelectionFragment eVar) {
        CoverSeriesAdapter cVar = eVar.f15450b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverSeriesAdapter");
        }
        return cVar;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OfficialCoverSelectionFragment eVar = this;
        AbstractC1142af a = C4950k.m20474a(eVar, DocViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…DocViewModel::class.java)");
        this.f15451d = (DocViewModel) a;
        AbstractC1142af a2 = C4950k.m20474a(eVar, CoverViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "PluginViewModelProviders…verViewModel::class.java)");
        this.f15449a = (CoverViewModel) a2;
    }

    /* renamed from: a */
    private final void m21973a(View view) {
        View findViewById = view.findViewById(R.id.loading_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.loading_layout)");
        this.f15452e = findViewById;
        View findViewById2 = view.findViewById(R.id.load_failed_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.load_failed_layout)");
        this.f15453f = findViewById2;
        View findViewById3 = view.findViewById(R.id.cover_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.cover_container)");
        this.f15455h = findViewById3;
        View findViewById4 = view.findViewById(R.id.cover_series_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.cover_series_rv)");
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        this.f15456i = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverSeriesRV");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CoverSeriesAdapter cVar = new CoverSeriesAdapter();
        this.f15450b = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverSeriesAdapter");
        }
        String c = C4484g.m18494b().mo17252c();
        Intrinsics.checkExpressionValueIsNotNull(c, "SdkLocaleServiceWrapper.…tance().provideLanguage()");
        cVar.mo21612a(c);
        CoverSeriesAdapter cVar2 = this.f15450b;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverSeriesAdapter");
        }
        cVar2.mo21611a(new C5406c(this));
        RecyclerView recyclerView2 = this.f15456i;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverSeriesRV");
        }
        CoverSeriesAdapter cVar3 = this.f15450b;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverSeriesAdapter");
        }
        recyclerView2.setAdapter(cVar3);
        View findViewById5 = view.findViewById(R.id.empty_state);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.empty_state)");
        this.f15454g = (SpaceEmptyState) findViewById5;
        String string = getString(R.string.CreationMobile_Docs_DocCover_UnableToLoad_Tooltip);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Creat…ver_UnableToLoad_Tooltip)");
        String string2 = getString(R.string.CreationMobile_Docs_DocCover_ClickToReload_Button);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.Creat…ver_ClickToReload_Button)");
        SpannableString spannableString = new SpannableString(string + string2);
        spannableString.setSpan(new UDEmptyState.OperableTextSpan(new View$OnClickListenerC5407d(this)), string.length(), string.length() + string2.length(), 33);
        SpaceEmptyState spaceEmptyState = this.f15454g;
        if (spaceEmptyState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyState");
        }
        spaceEmptyState.setDesc(spannableString);
    }

    /* renamed from: a */
    public final void mo21619a(boolean z, boolean z2) {
        int i;
        int i2;
        View view = this.f15452e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
        }
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f15453f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadFailedView");
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        View view3 = this.f15455h;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverContainer");
        }
        if (z || z2) {
            i3 = 8;
        }
        view3.setVisibility(i3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m21973a(view);
        CoverViewModel aVar = this.f15449a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        if (aVar.isCoverDataNotExist()) {
            CoverViewModel aVar2 = this.f15449a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
            }
            aVar2.isEnterAnimationShowing().mo5923a(this, new C5408e(this));
        }
        m21975c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.doc_cover_official_selection_fragment, viewGroup, false);
    }
}
