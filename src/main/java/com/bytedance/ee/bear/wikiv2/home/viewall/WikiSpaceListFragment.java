package com.bytedance.ee.bear.wikiv2.home.viewall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository;
import com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView;
import com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListViewModel;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.searchv2.C12360b;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract;
import com.bytedance.ee.util.p718t.C13727b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.p3459a.C68326a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0003J\b\u0010\u000e\u001a\u00020\fH\u0002J.\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\"\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010&\u001a\u00020\fH\u0016J\u001a\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006,"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "titleBarHeight", "", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindListener", "", "bindView", "initView", "navigation", "spaceId", "", "wikiToken", "spaceName", "wikiDocument", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "setTitleBarVisible", "visible", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a */
public final class WikiSpaceListFragment extends C7667e {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33028a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiSpaceListFragment.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel;"))};

    /* renamed from: b */
    public static final Companion f33029b = new Companion(null);

    /* renamed from: c */
    private int f33030c;

    /* renamed from: d */
    private final Lazy f33031d = LazyKt.lazy(new C12306g(this));

    /* renamed from: e */
    private HashMap f33032e;

    /* renamed from: a */
    public View mo46925a(int i) {
        if (this.f33032e == null) {
            this.f33032e = new HashMap();
        }
        View view = (View) this.f33032e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33032e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final WikiSpaceListViewModel mo46926a() {
        Lazy lazy = this.f33031d;
        KProperty kProperty = f33028a[0];
        return (WikiSpaceListViewModel) lazy.getValue();
    }

    /* renamed from: b */
    public void mo46929b() {
        HashMap hashMap = this.f33032e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46929b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListFragment$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo46926a().loadSpaceList();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListFragment$bindListener$2", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;", "onEnterSearch", "", "onExitSearch", "onSearchItemClick", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a$c */
    public static final class C12299c implements WikiSearchView2.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33034a;

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46930a() {
            this.f33034a.mo46928a(false);
            FrameLayout frameLayout = (FrameLayout) this.f33034a.mo46925a(R.id.content_layout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "content_layout");
            frameLayout.setVisibility(8);
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: b */
        public void mo46932b() {
            this.f33034a.mo46928a(true);
            FrameLayout frameLayout = (FrameLayout) this.f33034a.mo46925a(R.id.content_layout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "content_layout");
            frameLayout.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12299c(WikiSpaceListFragment aVar) {
            this.f33034a = aVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46931a(C12360b bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "wikiSearchResult");
            WikiSpaceListFragment aVar = this.f33034a;
            String str = bVar.f33160e;
            Intrinsics.checkExpressionValueIsNotNull(str, "wikiSearchResult.spaceId");
            String str2 = bVar.f33161f;
            String str3 = bVar.f33164i;
            WikiSpaceListViewModel a = this.f33034a.mo46926a();
            String str4 = bVar.f33160e;
            Intrinsics.checkExpressionValueIsNotNull(str4, "wikiSearchResult.spaceId");
            aVar.mo46927a(str, str2, str3, a.getWikiSpace(str4));
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (((WikiSearchView2) mo46925a(R.id.search_view)).mo47061i() || super.onBackPressed()) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a$g */
    static final class C12306g extends Lambda implements Function0<WikiSpaceListViewModel> {
        final /* synthetic */ WikiSpaceListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12306g(WikiSpaceListFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WikiSpaceListViewModel invoke() {
            WikiSpaceListArgs wikiSpaceListArgs;
            WikiSpaceListViewModel.Companion aVar = WikiSpaceListViewModel.Companion;
            WikiSpaceListFragment aVar2 = this.this$0;
            WikiSpaceListFragment aVar3 = aVar2;
            Bundle arguments = aVar2.getArguments();
            if (arguments != null) {
                wikiSpaceListArgs = (WikiSpaceListArgs) arguments.getParcelable(WikiSpaceListArgs.class.getName());
            } else {
                wikiSpaceListArgs = null;
            }
            if (wikiSpaceListArgs == null) {
                Intrinsics.throwNpe();
            }
            return aVar.mo46943a(aVar3, wikiSpaceListArgs);
        }
    }

    /* renamed from: c */
    private final void m51274c() {
        ((WikiSearchView2) mo46925a(R.id.search_view)).mo47044a((Fragment) this);
        ((WikiSearchView2) mo46925a(R.id.search_view)).setInputHint(R.string.Doc_Wiki_SearchWorkspace);
        ((WikiSearchView2) mo46925a(R.id.search_view)).setSubmodule("wiki_all_space");
    }

    /* renamed from: e */
    private final void m51276e() {
        ((WikiSpaceListRvView) mo46925a(R.id.recycler_view)).setViewDelegate(new C12298b(this));
        ((WikiSearchView2) mo46925a(R.id.search_view)).setViewDelegate(new C12299c(this));
    }

    /* renamed from: d */
    private final void m51275d() {
        mo46926a().getTitle().mo5923a(getViewLifecycleOwner(), new C12300d(this));
        mo46926a().getSpaceList().mo5923a(getViewLifecycleOwner(), new C12301e(this));
        C5084ad.m20847d().mo20037a().mo5923a(getViewLifecycleOwner(), new C12302f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListFragment$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$ViewDelegate;", "onSpaceItemClick", "", "space", "Lcom/bytedance/ee/bear/list/cache/WikiSpace;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a$b */
    public static final class C12298b implements WikiSpaceListRvView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33033a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12298b(WikiSpaceListFragment aVar) {
            this.f33033a = aVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView.ViewDelegate
        /* renamed from: a */
        public void mo46924a(C8213o oVar, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(oVar, "space");
            WikiSpaceListFragment aVar = this.f33033a;
            String a = oVar.mo32176a();
            Intrinsics.checkExpressionValueIsNotNull(a, "space.spaceId");
            aVar.mo46927a(a, oVar.mo32198i(), oVar.mo32184c(), C8213o.m33654a(oVar));
            List<Document> b = this.f33033a.mo46926a().getSpaceList().mo5927b();
            if (b != null) {
                i2 = b.size();
            } else {
                i2 = 0;
            }
            C12237b.m50898a("select_space", "all_workspaces", i2, i);
            if (this.f33033a.mo46926a().getArgs().getPageMode() == 0) {
                WikiReportV2.m50927d("workspace", "ccm_wiki_tree_view");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a$d */
    public static final class C12300d<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33035a;

        C12300d(WikiSpaceListFragment aVar) {
            this.f33035a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            ((BaseTitleBar) this.f33035a.mo46925a(R.id.title_bar)).setTitle(num.intValue());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo46926a().getArgs().getPageMode() == 0) {
            WikiReportV2.m50917b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "networkState", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a$f */
    public static final class C12302f<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33037a;

        C12302f(WikiSpaceListFragment aVar) {
            this.f33037a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(final ConnectionService.NetworkState networkState) {
            if (networkState != null) {
                WikiSpaceRepository.m51026a(networkState).mo237985a(C11678b.m48481e()).mo238005b(new Consumer<List<? extends String>>(this) {
                    /* class com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListFragment.C12302f.C123031 */

                    /* renamed from: a */
                    final /* synthetic */ C12302f f33038a;

                    {
                        this.f33038a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(List<String> list) {
                        Intrinsics.checkExpressionValueIsNotNull(list, "cacheRelationIds");
                        ((WikiSpaceListRvView) this.f33038a.f33037a.mo46925a(R.id.recycler_view)).setCacheRelationIds(list);
                    }
                }).mo238015c(new AbstractC68309a(this) {
                    /* class com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListFragment.C12302f.C123042 */

                    /* renamed from: a */
                    final /* synthetic */ C12302f f33039a;

                    {
                        this.f33039a = r1;
                    }

                    @Override // io.reactivex.functions.AbstractC68309a
                    public final void run() {
                        ((WikiSpaceListRvView) this.f33039a.f33037a.mo46925a(R.id.recycler_view)).setEnable(networkState.mo20041b());
                        ((WikiSpaceListRvView) this.f33039a.f33037a.mo46925a(R.id.recycler_view)).mo46908a();
                    }
                }).mo238001b(C68326a.m265193b(), C123053.f33041a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "spaceList", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.a$e */
    public static final class C12301e<T> implements AbstractC1178x<List<? extends Document>> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListFragment f33036a;

        C12301e(WikiSpaceListFragment aVar) {
            this.f33036a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends Document> list) {
            if (CollectionUtils.isEmpty(list)) {
                WikiSpaceListRvView wikiSpaceListRvView = (WikiSpaceListRvView) this.f33036a.mo46925a(R.id.recycler_view);
                Intrinsics.checkExpressionValueIsNotNull(wikiSpaceListRvView, "recycler_view");
                wikiSpaceListRvView.setVisibility(8);
                SpaceEmptyState spaceEmptyState = (SpaceEmptyState) this.f33036a.mo46925a(R.id.empty_view);
                Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "empty_view");
                spaceEmptyState.setVisibility(0);
                return;
            }
            ArrayList<C8213o> b = C8213o.m33657b((List<Document>) list);
            Intrinsics.checkExpressionValueIsNotNull(b, "WikiSpace.docsToWikiSpace(spaceList)");
            ((WikiSpaceListRvView) this.f33036a.mo46925a(R.id.recycler_view)).setData(b);
            WikiSpaceListRvView wikiSpaceListRvView2 = (WikiSpaceListRvView) this.f33036a.mo46925a(R.id.recycler_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiSpaceListRvView2, "recycler_view");
            wikiSpaceListRvView2.setVisibility(0);
            SpaceEmptyState spaceEmptyState2 = (SpaceEmptyState) this.f33036a.mo46925a(R.id.empty_view);
            Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState2, "empty_view");
            spaceEmptyState2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo46928a(boolean z) {
        int i;
        if (this.f33030c <= 0) {
            BaseTitleBar baseTitleBar = (BaseTitleBar) mo46925a(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(baseTitleBar, "title_bar");
            this.f33030c = baseTitleBar.getHeight();
        }
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = this.f33030c;
        }
        if (z) {
            i2 = this.f33030c;
        }
        C13727b.m55679a((View) ((BaseTitleBar) mo46925a(R.id.title_bar)), i, i2, (int) LocationRequest.PRIORITY_HD_ACCURACY).start();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m51274c();
        m51275d();
        m51276e();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_space_list_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && (activity = getActivity()) != null) {
            activity.setResult(i2, intent);
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo46927a(String str, String str2, String str3, WikiDocument wikiDocument) {
        WikiTreeActivityContract wikiTreeActivityContract = new WikiTreeActivityContract();
        wikiTreeActivityContract.setSpaceId(str);
        wikiTreeActivityContract.setDocumentToken(str2);
        wikiTreeActivityContract.setDocumentName(str3);
        wikiTreeActivityContract.setWikiDocument(wikiDocument);
        wikiTreeActivityContract.setPageMode(mo46926a().getArgs().getPageMode());
        wikiTreeActivityContract.setCreateDocumentType(mo46926a().getArgs().getCreateDocumentType());
        wikiTreeActivityContract.setSrcToken(mo46926a().getArgs().getSrcToken());
        wikiTreeActivityContract.setSrcObjType(mo46926a().getArgs().getSrcObjType());
        wikiTreeActivityContract.setSrcParentToken(mo46926a().getArgs().getSrcParentToken());
        wikiTreeActivityContract.setSrcIsLock(mo46926a().getArgs().getSrcIsLock());
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/wikiv2/treehome/activity").mo17311a(WikiTreeActivityContract.class.getName(), (Parcelable) wikiTreeActivityContract).mo17318b(0).mo17317a();
    }
}
