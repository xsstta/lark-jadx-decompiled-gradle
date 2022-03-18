package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.bear.wikiv2.home.api.SpaceBean;
import com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository;
import com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.p3459a.C68326a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0019J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lifecycleOwner", "Landroidx/fragment/app/Fragment;", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView$ViewDelegate;)V", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListViewModel;", "bindListener", "", "bindView", "checkLoadmoreEnable", "checkRecyclerEnabled", "networkState", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "count", "", "hideLoading", "init", "fragment", "spaceType", "initView", "setNetworkChange", "showContent", "spaceList", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "showFailure", "err", "", "Companion", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSpaceListView extends FrameLayout {

    /* renamed from: b */
    public static final Companion f33065b = new Companion(null);

    /* renamed from: a */
    public WikiSpaceListViewModel f33066a;

    /* renamed from: c */
    private Fragment f33067c;

    /* renamed from: d */
    private ViewDelegate f33068d;

    /* renamed from: e */
    private HashMap f33069e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView$ViewDelegate;", "", "onItemClick", "", "space", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$b */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo46975a(SpaceBean spaceBean, int i);
    }

    /* renamed from: a */
    public View mo46966a(int i) {
        if (this.f33069e == null) {
            this.f33069e = new HashMap();
        }
        View view = (View) this.f33069e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33069e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33068d;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$g */
    public static final class C12314g implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListView f33074a;

        /* renamed from: b */
        final /* synthetic */ ConnectionService.NetworkState f33075b;

        C12314g(WikiSpaceListView wikiSpaceListView, ConnectionService.NetworkState networkState) {
            this.f33074a = wikiSpaceListView;
            this.f33075b = networkState;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            ((WikiSpaceListRvView) this.f33074a.mo46966a(R.id.recycler_view)).setEnable(this.f33075b.mo20041b());
            ((WikiSpaceListRvView) this.f33074a.mo46966a(R.id.recycler_view)).mo46948a();
        }
    }

    /* renamed from: f */
    private final void m51315f() {
        ((WikiSpaceListRvView) mo46966a(R.id.recycler_view)).setViewDelegate(new C12310c(this));
    }

    /* renamed from: b */
    public final int mo46971b() {
        WikiSpaceListViewModel eVar = this.f33066a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return C13657b.m55424c(eVar.getSpaceList().mo5927b());
    }

    /* renamed from: e */
    private final void m51314e() {
        BearLottieView bearLottieView = (BearLottieView) mo46966a(R.id.loading_view);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "loading_view");
        if (bearLottieView.getVisibility() == 0) {
            BearLottieView bearLottieView2 = (BearLottieView) mo46966a(R.id.loading_view);
            Intrinsics.checkExpressionValueIsNotNull(bearLottieView2, "loading_view");
            bearLottieView2.setVisibility(8);
        }
    }

    /* renamed from: c */
    private final void m51312c() {
        BearLottieView bearLottieView = (BearLottieView) mo46966a(R.id.loading_view);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "loading_view");
        bearLottieView.setVisibility(0);
        ((WikiSpaceListRvView) mo46966a(R.id.recycler_view)).setEnable(true);
        ((SmartRefreshLayout) mo46966a(R.id.content_view)).mo96368b(new C12316i(this));
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo46966a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        SmartRefreshLayout smartRefreshLayout2 = (SmartRefreshLayout) mo46966a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout2, "content_view");
        smartRefreshLayout2.mo96415m(false);
    }

    /* renamed from: d */
    private final void m51313d() {
        WikiSpaceListViewModel eVar = this.f33066a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<List<SpaceBean>> spaceList = eVar.getSpaceList();
        Fragment fragment = this.f33067c;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifecycleOwner");
        }
        spaceList.mo5923a(fragment, new C12311d(this));
        WikiSpaceListViewModel eVar2 = this.f33066a;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C1177w<Throwable> failure = eVar2.getFailure();
        Fragment fragment2 = this.f33067c;
        if (fragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifecycleOwner");
        }
        failure.mo5923a(fragment2, new C12312e(this));
    }

    /* renamed from: a */
    public final void mo46967a() {
        boolean z;
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean b2 = b.mo20041b();
        WikiSpaceListViewModel eVar = this.f33066a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        boolean hasmore = eVar.getHasmore();
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo46966a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
        if (!b2 || !hasmore) {
            z = false;
        } else {
            z = true;
        }
        smartRefreshLayout.mo96415m(z);
    }

    public final void setViewDelegate(ViewDelegate bVar) {
        this.f33068d = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListView$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$ViewDelegate;", "onSpaceItemClick", "", "space", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$c */
    public static final class C12310c implements WikiSpaceListRvView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListView f33070a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12310c(WikiSpaceListView wikiSpaceListView) {
            this.f33070a = wikiSpaceListView;
        }

        @Override // com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView.ViewDelegate
        /* renamed from: a */
        public void mo46965a(SpaceBean spaceBean, int i) {
            Intrinsics.checkParameterIsNotNull(spaceBean, "space");
            ViewDelegate viewDelegate = this.f33070a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo46975a(spaceBean, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$h */
    public static final class C12315h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12315h f33076a = new C12315h();

        C12315h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiSpaceListView", "getCachedRelationIds err. ", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$i */
    public static final class C12316i implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListView f33077a;

        C12316i(WikiSpaceListView wikiSpaceListView) {
            this.f33077a = wikiSpaceListView;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            WikiSpaceListView.m51310a(this.f33077a).loadmore();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ WikiSpaceListViewModel m51310a(WikiSpaceListView wikiSpaceListView) {
        WikiSpaceListViewModel eVar = wikiSpaceListView.f33066a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return eVar;
    }

    public final void setNetworkChange(ConnectionService.NetworkState networkState) {
        Intrinsics.checkParameterIsNotNull(networkState, "networkState");
        mo46967a();
        m51311a(networkState);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "spaceList", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$d */
    public static final class C12311d<T> implements AbstractC1178x<List<? extends SpaceBean>> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListView f33071a;

        C12311d(WikiSpaceListView wikiSpaceListView) {
            this.f33071a = wikiSpaceListView;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends SpaceBean> list) {
            WikiSpaceListView wikiSpaceListView = this.f33071a;
            Intrinsics.checkExpressionValueIsNotNull(list, "spaceList");
            wikiSpaceListView.mo46970a(list);
            ((SmartRefreshLayout) this.f33071a.mo46966a(R.id.content_view)).mo96416n();
            this.f33071a.mo46967a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "err", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$e */
    public static final class C12312e<T> implements AbstractC1178x<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListView f33072a;

        C12312e(WikiSpaceListView wikiSpaceListView) {
            this.f33072a = wikiSpaceListView;
        }

        /* renamed from: a */
        public final void onChanged(Throwable th) {
            WikiSpaceListView wikiSpaceListView = this.f33072a;
            Intrinsics.checkExpressionValueIsNotNull(th, "err");
            wikiSpaceListView.mo46969a(th);
            ((SmartRefreshLayout) this.f33072a.mo46966a(R.id.content_view)).mo96416n();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "cacheRelationIds", "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListView$f */
    public static final class C12313f<T> implements Consumer<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListView f33073a;

        C12313f(WikiSpaceListView wikiSpaceListView) {
            this.f33073a = wikiSpaceListView;
        }

        /* renamed from: a */
        public final void accept(List<String> list) {
            Intrinsics.checkExpressionValueIsNotNull(list, "cacheRelationIds");
            ((WikiSpaceListRvView) this.f33073a.mo46966a(R.id.recycler_view)).setCacheRelationIds(list);
        }
    }

    /* renamed from: a */
    private final void m51311a(ConnectionService.NetworkState networkState) {
        WikiSpaceListViewModel eVar = this.f33066a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        if (eVar.hasData()) {
            if (networkState.mo20041b()) {
                WikiSpaceListViewModel eVar2 = this.f33066a;
                if (eVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                if (eVar2.getFromDb()) {
                    WikiSpaceListViewModel eVar3 = this.f33066a;
                    if (eVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    }
                    eVar3.load();
                }
            }
            WikiSpaceRepository.m51026a(networkState).mo237985a(C11678b.m48481e()).mo238005b(new C12313f(this)).mo237995a(new C12314g(this, networkState)).mo238001b(C68326a.m265193b(), C12315h.f33076a);
        }
    }

    /* renamed from: a */
    public final void mo46969a(Throwable th) {
        WikiSpaceListViewModel eVar = this.f33066a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        if (!eVar.hasData()) {
            m51314e();
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo46966a(R.id.content_view);
            Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
            smartRefreshLayout.setVisibility(8);
            ((SpaceEmptyState) mo46966a(R.id.empty_view)).setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
            ((SpaceEmptyState) mo46966a(R.id.empty_view)).setDesc(getContext().getString(R.string.Doc_Wiki_Network_Error));
            SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo46966a(R.id.empty_view);
            Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "empty_view");
            spaceEmptyState.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo46970a(List<? extends SpaceBean> list) {
        m51314e();
        if (!C13657b.m55421a(list)) {
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo46966a(R.id.content_view);
            Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
            smartRefreshLayout.setVisibility(0);
            SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo46966a(R.id.empty_view);
            Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "empty_view");
            spaceEmptyState.setVisibility(8);
            ((WikiSpaceListRvView) mo46966a(R.id.recycler_view)).setData(list);
            return;
        }
        SmartRefreshLayout smartRefreshLayout2 = (SmartRefreshLayout) mo46966a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout2, "content_view");
        smartRefreshLayout2.setVisibility(8);
        ((SpaceEmptyState) mo46966a(R.id.empty_view)).setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_search_failed));
        ((SpaceEmptyState) mo46966a(R.id.empty_view)).setDesc(getContext().getString(R.string.CreationMobile_Wiki_Search_NotFound));
        SpaceEmptyState spaceEmptyState2 = (SpaceEmptyState) mo46966a(R.id.empty_view);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState2, "empty_view");
        spaceEmptyState2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiSpaceListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.wiki_space_list_view, this);
    }

    /* renamed from: a */
    public final void mo46968a(Fragment fragment, int i) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f33067c = fragment;
        this.f33066a = WikiSpaceListViewModel.Companion.mo47004a(fragment, i);
        m51312c();
        m51313d();
        m51315f();
    }
}
