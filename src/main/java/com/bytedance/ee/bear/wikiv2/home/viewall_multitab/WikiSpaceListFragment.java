package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.wikiv2.home.api.C12256a;
import com.bytedance.ee.bear.wikiv2.home.api.SpaceBean;
import com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListArgs;
import com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView;
import com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceTabViewModel;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.searchv2.C12360b;
import com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0003J\b\u0010\u0017\u001a\u00020\u0015H\u0002J.\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u0015H\u0014J\b\u0010)\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListFragment;", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/LazyFragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "bind", "", "networkState", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "parentViewModel", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "getParentViewModel", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "tab", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/TabEnum;", "bindListener", "", "bindView", "initView", "navigation", "spaceId", "wikiToken", "spaceName", "wikiDocument", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "onAttachData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetachData", "unBind", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d */
public final class WikiSpaceListFragment extends AbstractC12317a {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f33087d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiSpaceListFragment.class), "parentViewModel", "getParentViewModel()Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;"))};

    /* renamed from: e */
    public static final Companion f33088e = new Companion(null);

    /* renamed from: f */
    private TabEnum f33089f = TabEnum.ALL;

    /* renamed from: g */
    private final Lazy f33090g = LazyKt.lazy(new C12324g(this));

    /* renamed from: h */
    private LiveData<ConnectionService.NetworkState> f33091h;

    /* renamed from: i */
    private boolean f33092i;

    /* renamed from: j */
    private HashMap f33093j;

    /* renamed from: a */
    public View mo46986a(int i) {
        if (this.f33093j == null) {
            this.f33093j = new HashMap();
        }
        View view = (View) this.f33093j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33093j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final WikiSpaceTabViewModel mo46988c() {
        Lazy lazy = this.f33090g;
        KProperty kProperty = f33087d[0];
        return (WikiSpaceTabViewModel) lazy.getValue();
    }

    /* renamed from: e */
    public void mo46990e() {
        HashMap hashMap = this.f33093j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.home.viewall_multitab.AbstractC12317a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46990e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListFragment$Companion;", "", "()V", "newInstance", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListFragment;", "spaceType", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WikiSpaceListFragment mo46991a(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("space_type", i);
            WikiSpaceListFragment dVar = new WikiSpaceListFragment();
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wikiv2.home.viewall_multitab.AbstractC12317a
    /* renamed from: b */
    public void mo46983b() {
        C13479a.m54764b(mo46989d(), "onDetachData.");
        m51339i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d$g */
    static final class C12324g extends Lambda implements Function0<WikiSpaceTabViewModel> {
        final /* synthetic */ WikiSpaceListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12324g(WikiSpaceListFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WikiSpaceTabViewModel invoke() {
            WikiSpaceTabViewModel.Companion aVar = WikiSpaceTabViewModel.Companion;
            Fragment requireParentFragment = this.this$0.requireParentFragment();
            Intrinsics.checkExpressionValueIsNotNull(requireParentFragment, "requireParentFragment()");
            return aVar.mo47024a(requireParentFragment);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wikiv2.home.viewall_multitab.AbstractC12317a
    /* renamed from: a */
    public void mo46982a() {
        C13479a.m54764b(mo46989d(), "onAttachData.");
        m51336f();
        m51337g();
        m51338h();
    }

    /* renamed from: d */
    public final String mo46989d() {
        return "WikiSpaceListFragment_" + this.f33089f.name();
    }

    /* renamed from: f */
    private final void m51336f() {
        if (!this.f33092i) {
            WikiSpaceListFragment dVar = this;
            ((WikiSpaceListView) mo46986a(R.id.space_list_view)).mo46968a(dVar, this.f33089f.getSpaceType());
            ((WikiSearchListView) mo46986a(R.id.search_list_view)).mo47097a(dVar, this.f33089f.getSpaceType());
            ((WikiSearchListView) mo46986a(R.id.search_list_view)).setSubmodule("wiki_all_space");
            this.f33092i = true;
        }
    }

    /* renamed from: h */
    private final void m51338h() {
        ((WikiSpaceListView) mo46986a(R.id.space_list_view)).setViewDelegate(new C12319b(this));
        ((WikiSearchListView) mo46986a(R.id.search_list_view)).setViewDelegate(new C12320c(this));
    }

    /* renamed from: g */
    private final void m51337g() {
        mo46988c().getSearching().mo5923a(getViewLifecycleOwner(), new C12321d(this));
        mo46988c().getSearchInput().mo5923a(getViewLifecycleOwner(), new C12322e(this));
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        this.f33091h = a;
        if (a != null) {
            a.mo5923a(getViewLifecycleOwner(), new C12323f(this));
        }
    }

    /* renamed from: i */
    private final void m51339i() {
        mo46988c().getSearching().mo5922a(getViewLifecycleOwner());
        mo46988c().getSearchInput().mo5922a(getViewLifecycleOwner());
        LiveData<ConnectionService.NetworkState> liveData = this.f33091h;
        if (liveData != null) {
            liveData.mo5922a(getViewLifecycleOwner());
        }
        this.f33091h = null;
        ((WikiSpaceListView) mo46986a(R.id.space_list_view)).setViewDelegate(null);
        ((WikiSearchListView) mo46986a(R.id.search_list_view)).setViewDelegate(null);
        ((WikiSearchListView) mo46986a(R.id.search_list_view)).mo47095a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListFragment$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView$ViewDelegate;", "onItemClick", "", "space", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d$b */
    public static final class C12319b implements WikiSpaceListView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33094a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12319b(WikiSpaceListFragment dVar) {
            this.f33094a = dVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView.ViewDelegate
        /* renamed from: a */
        public void mo46975a(SpaceBean spaceBean, int i) {
            Intrinsics.checkParameterIsNotNull(spaceBean, "space");
            WikiSpaceListFragment dVar = this.f33094a;
            String str = spaceBean.space_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "space.space_id");
            dVar.mo46987a(str, "", spaceBean.space_name, C12256a.m51024b(spaceBean));
            C12237b.m50898a("select_space", "all_workspaces", ((WikiSpaceListView) this.f33094a.mo46986a(R.id.space_list_view)).mo46971b(), i);
            WikiSpaceListArgs args = this.f33094a.mo46988c().getArgs();
            if (args != null && args.getPageMode() == 0) {
                WikiReportV2.m50927d("workspace", "ccm_wiki_tree_view");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListFragment$bindListener$2", "Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$ViewDelegate;", "onSearchItemClick", "", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d$c */
    public static final class C12320c implements WikiSearchListView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33095a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12320c(WikiSpaceListFragment dVar) {
            this.f33095a = dVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView.ViewDelegate
        /* renamed from: a */
        public void mo46992a(C12360b bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "wikiSearchResult");
            WikiSpaceListFragment dVar = this.f33095a;
            String str = bVar.f33160e;
            Intrinsics.checkExpressionValueIsNotNull(str, "wikiSearchResult.spaceId");
            dVar.mo46987a(str, "", bVar.f33164i, C12256a.m51021a(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "network", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d$f */
    public static final class C12323f<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33098a;

        C12323f(WikiSpaceListFragment dVar) {
            this.f33098a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            if (networkState != null) {
                ((WikiSpaceListView) this.f33098a.mo46986a(R.id.space_list_view)).setNetworkChange(networkState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d$e */
    public static final class C12322e<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33097a;

        C12322e(WikiSpaceListFragment dVar) {
            this.f33097a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            WikiSearchListView wikiSearchListView = (WikiSearchListView) this.f33097a.mo46986a(R.id.search_list_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiSearchListView, "search_list_view");
            if (wikiSearchListView.getVisibility() == 0) {
                Intrinsics.checkExpressionValueIsNotNull(str, SearchIntents.EXTRA_QUERY);
                ((WikiSearchListView) this.f33097a.mo46986a(R.id.search_list_view)).mo47098a(str);
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33089f = TabEnum.Companion.mo46947a(arguments.getInt("space_type", -1));
        }
        C13479a.m54764b(mo46989d(), "onCreate.");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "inSearching", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.d$d */
    public static final class C12321d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33096a;

        C12321d(WikiSpaceListFragment dVar) {
            this.f33096a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            String d = this.f33096a.mo46989d();
            C13479a.m54764b(d, "searchChange, inSearching: " + bool);
            WikiSearchListView wikiSearchListView = (WikiSearchListView) this.f33096a.mo46986a(R.id.search_list_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiSearchListView, "search_list_view");
            Intrinsics.checkExpressionValueIsNotNull(bool, "inSearching");
            int i2 = 0;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            wikiSearchListView.setVisibility(i);
            WikiSpaceListView wikiSpaceListView = (WikiSpaceListView) this.f33096a.mo46986a(R.id.space_list_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiSpaceListView, "space_list_view");
            if (bool.booleanValue()) {
                i2 = 8;
            }
            wikiSpaceListView.setVisibility(i2);
            if (!bool.booleanValue()) {
                ((WikiSearchListView) this.f33096a.mo46986a(R.id.search_list_view)).mo47095a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_space_list_fragment_v2, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo46987a(String str, String str2, String str3, WikiDocument wikiDocument) {
        boolean z;
        WikiTreeActivityContract wikiTreeActivityContract = new WikiTreeActivityContract();
        wikiTreeActivityContract.setSpaceId(str);
        wikiTreeActivityContract.setDocumentToken(str2);
        wikiTreeActivityContract.setDocumentName(str3);
        wikiTreeActivityContract.setWikiDocument(wikiDocument);
        String d = mo46989d();
        StringBuilder sb = new StringBuilder();
        sb.append("args?=");
        if (mo46988c().getArgs() == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b(d, sb.toString());
        WikiSpaceListArgs args = mo46988c().getArgs();
        if (args != null) {
            wikiTreeActivityContract.setPageMode(args.getPageMode());
            wikiTreeActivityContract.setCreateDocumentType(args.getCreateDocumentType());
            wikiTreeActivityContract.setSrcToken(args.getSrcToken());
            wikiTreeActivityContract.setSrcObjType(args.getSrcObjType());
            wikiTreeActivityContract.setSrcParentToken(args.getSrcParentToken());
            wikiTreeActivityContract.setSrcIsLock(args.getSrcIsLock());
        }
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/wikiv2/treehome/activity").mo17311a(WikiTreeActivityContract.class.getName(), (Parcelable) wikiTreeActivityContract).mo17318b(0).mo17317a();
    }
}
