package com.bytedance.ee.bear.wikiv2.searchv2.enh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.searchv2.C12360b;
import com.bytedance.ee.bear.wikiv2.searchv2.C12361c;
import com.bytedance.ee.bear.wikiv2.searchv2.C12368e;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchViewModel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13742g;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 M2\u00020\u0001:\u0003MNOB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u00100\u001a\u00020\u0013H\u0002J\u001c\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u00104\u001a\u0002022\u0006\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u000202J\b\u00108\u001a\u000202H\u0002J\u0016\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001bJ\u001a\u0010;\u001a\u0002022\u0006\u0010:\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001bH\u0002J\u0016\u0010<\u001a\u0002022\u0006\u0010:\u001a\u00020\u00112\u0006\u0010=\u001a\u00020$J\b\u0010>\u001a\u000202H\u0002J\b\u0010?\u001a\u000202H\u0002J\b\u0010@\u001a\u000202H\u0014J\u0018\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020\nH\u0002J\u000e\u0010D\u001a\u0002022\u0006\u00103\u001a\u00020\u001bJ\b\u0010E\u001a\u000202H\u0002J\b\u0010F\u001a\u000202H\u0002J\b\u0010G\u001a\u000202H\u0002J\b\u0010H\u001a\u000202H\u0002J\u0018\u0010I\u001a\u0002022\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010KH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001c\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X.¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "forSpaceSearch", "", "khObserver", "Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$KHObserver;", "khProvider", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "lazyInit", "lifecycleOwner", "Landroidx/fragment/app/Fragment;", "searchAdapter", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;", "getSearchAdapter", "()Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;", "searchAdapter$delegate", "Lkotlin/Lazy;", "searchContentContainer", "Landroid/view/View;", ShareHitPoint.f121868c, "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "spaceId", "getSpaceId", "setSpaceId", "spaceType", "", "submodule", "getSubmodule", "setSubmodule", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$ViewDelegate;)V", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchViewModel;", "_getSearchAdapter", "_searchApi", "", "queryKey", "bindView", "owner", "Landroidx/lifecycle/LifecycleOwner;", "clear", "clearSearchResult", "init", "fragment", "init2", "initForSpaceSearch", "space_type", "lazyInitContent", "onClear", "onDetachedFromWindow", "resetPlaceHolderLocation", "keyboardHeight", "doAnim", "search", "setContentResult", "setEmptyResult", "setLoadingResult", "setNoneResult", "showSearchResult", "searchResultList", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "Companion", "KHObserver", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSearchListView extends LinearLayout {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33189a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiSearchListView.class), "searchAdapter", "getSearchAdapter()Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;"))};

    /* renamed from: e */
    public static final Companion f33190e = new Companion(null);

    /* renamed from: b */
    public String f33191b;

    /* renamed from: c */
    public WikiSearchViewModel f33192c;

    /* renamed from: d */
    public boolean f33193d;

    /* renamed from: f */
    private final Lazy f33194f = LazyKt.lazy(new C12377j(this));

    /* renamed from: g */
    private Fragment f33195g;

    /* renamed from: h */
    private boolean f33196h;

    /* renamed from: i */
    private int f33197i = -1;

    /* renamed from: j */
    private final C68289a f33198j = new C68289a();

    /* renamed from: k */
    private View f33199k;

    /* renamed from: l */
    private ViewDelegate f33200l;

    /* renamed from: m */
    private AbstractC10550f f33201m;

    /* renamed from: n */
    private KHObserver f33202n;

    /* renamed from: o */
    private String f33203o = "wiki_pages";

    /* renamed from: p */
    private String f33204p = "wiki_pages_view";

    /* renamed from: q */
    private HashMap f33205q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$ViewDelegate;", "", "onSearchItemClick", "", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$c */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo46992a(C12360b bVar, int i);
    }

    private final C12361c getSearchAdapter() {
        Lazy lazy = this.f33194f;
        KProperty kProperty = f33189a[0];
        return (C12361c) lazy.getValue();
    }

    /* renamed from: a */
    public View mo47094a(int i) {
        if (this.f33205q == null) {
            this.f33205q = new HashMap();
        }
        View view = (View) this.f33205q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33205q.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getSource() {
        return this.f33204p;
    }

    public final String getSubmodule() {
        return this.f33203o;
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33200l;
    }

    /* renamed from: a */
    public final void mo47099a(List<? extends C12360b> list) {
        if (!CollectionUtils.isEmpty(list) || getSearchAdapter().mo47083b()) {
            C13479a.m54764b("WikiSearchListView", "showSearchResult, setContentResult");
            m51469g();
            getSearchAdapter().mo47082a((List<C12360b>) list);
            if (list == null) {
                Intrinsics.throwNpe();
            }
            boolean z = ((C12360b) list.get(0)).f33159d;
            C13479a.m54764b("WikiSearchListView", "showSearchResult, isEnableLoadmore= " + z);
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47094a(R.id.content_view);
            Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
            smartRefreshLayout.mo96415m(z);
            return;
        }
        C13479a.m54764b("WikiSearchListView", "showSearchResult, empty result, setEmptyResult");
        m51468f();
    }

    /* renamed from: a */
    public final void mo47098a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        m51465c();
        m51470h();
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("WikiSearchListView", "doSearch, input empty, setPrepareInput. ");
            m51466d();
            return;
        }
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        if (b.mo20041b()) {
            C13479a.m54764b("WikiSearchListView", "doSearch, network connected, do search. ");
            m51467e();
            String str2 = this.f33191b;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spaceId");
            }
            m51464a(str, str2);
            return;
        }
        C13479a.m54764b("WikiSearchListView", "doSearch, network unavailable, setEmptyResult. ");
        m51468f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$j */
    static final class C12377j extends Lambda implements Function0<C12361c> {
        final /* synthetic */ WikiSearchListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12377j(WikiSearchListView wikiSearchListView) {
            super(0);
            this.this$0 = wikiSearchListView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C12361c invoke() {
            return this.this$0.mo47100b();
        }
    }

    /* renamed from: a */
    public final void mo47095a() {
        if (this.f33193d) {
            m51470h();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m51471i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$lazyInitContent$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$f */
    public static final class C12372f extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchListView f33209a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$f$a */
        static final class RunnableC12373a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12372f f33210a;

            RunnableC12373a(C12372f fVar) {
                this.f33210a = fVar;
            }

            public final void run() {
                C10548d.m43697a(this.f33210a.f33209a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12372f(WikiSearchListView wikiSearchListView) {
            this.f33209a = wikiSearchListView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 1) {
                C13742g.m55706a(new RunnableC12373a(this), 200);
            }
        }
    }

    /* renamed from: h */
    private final void m51470h() {
        getSearchAdapter().mo47080a();
        getSearchAdapter().notifyDataSetChanged();
    }

    public final String getSpaceId() {
        String str = this.f33191b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spaceId");
        }
        return str;
    }

    /* renamed from: i */
    private final void m51471i() {
        AbstractC10550f fVar = this.f33201m;
        if (fVar != null) {
            fVar.mo39928b(this.f33202n);
        }
        this.f33198j.mo237935a();
    }

    /* renamed from: b */
    public final C12361c mo47100b() {
        if (this.f33196h) {
            return new C12368e();
        }
        return new C12361c();
    }

    /* renamed from: d */
    private final void m51466d() {
        BearLottieView bearLottieView = (BearLottieView) mo47094a(R.id.loading_view);
        bearLottieView.cancelAnimation();
        bearLottieView.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47094a(R.id.content_view);
        smartRefreshLayout.setVisibility(8);
        smartRefreshLayout.mo96416n();
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47094a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(8);
        m51470h();
    }

    /* renamed from: e */
    private final void m51467e() {
        BearLottieView bearLottieView = (BearLottieView) mo47094a(R.id.loading_view);
        bearLottieView.playAnimation();
        bearLottieView.setVisibility(0);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47094a(R.id.content_view);
        smartRefreshLayout.setVisibility(8);
        smartRefreshLayout.mo96416n();
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47094a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(8);
    }

    /* renamed from: f */
    private final void m51468f() {
        BearLottieView bearLottieView = (BearLottieView) mo47094a(R.id.loading_view);
        bearLottieView.cancelAnimation();
        bearLottieView.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47094a(R.id.content_view);
        smartRefreshLayout.setVisibility(8);
        smartRefreshLayout.mo96416n();
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47094a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(0);
    }

    /* renamed from: g */
    private final void m51469g() {
        BearLottieView bearLottieView = (BearLottieView) mo47094a(R.id.loading_view);
        bearLottieView.cancelAnimation();
        bearLottieView.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47094a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
        smartRefreshLayout.setVisibility(0);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47094a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(8);
    }

    /* renamed from: c */
    private final void m51465c() {
        if (this.f33193d) {
            C13479a.m54764b("WikiSearchListView", "lazyInitContent, viewStub has been initialized, return. ");
            return;
        }
        this.f33199k = this;
        this.f33193d = true;
        getSearchAdapter().mo47081a(new C12371e(this));
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) mo47094a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(baseRecyclerView, "recycler");
        baseRecyclerView.setAdapter(getSearchAdapter());
        BaseRecyclerView baseRecyclerView2 = (BaseRecyclerView) mo47094a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(baseRecyclerView2, "recycler");
        baseRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        ((BaseRecyclerView) mo47094a(R.id.recycler)).addOnScrollListener(new C12372f(this));
        ((SmartRefreshLayout) mo47094a(R.id.content_view)).mo96368b(new C12374g(this));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((SmartRefreshLayout) mo47094a(R.id.content_view)).mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47094a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
        smartRefreshLayout.mo96415m(false);
    }

    public final void setViewDelegate(ViewDelegate cVar) {
        this.f33200l = cVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView$KHObserver;", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "(Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchListView;)V", "onKeyboardHeightChanged", "", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "keyboardHeight", "", "orientation", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$b */
    public final class KHObserver implements AbstractC10549e {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public KHObserver() {
        }

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(fVar, "khp");
            C13479a.m54764b("WikiSearchListView", "KeyboardHeightObserver, onChanged, kh: " + i);
            if (WikiSearchListView.this.f33193d) {
                WikiSearchListView.this.mo47096a(i, true);
            }
        }
    }

    public final void setSource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33204p = str;
    }

    public final void setSpaceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33191b = str;
    }

    public final void setSubmodule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33203o = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$g */
    public static final class C12374g implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ WikiSearchListView f33211a;

        C12374g(WikiSearchListView wikiSearchListView) {
            this.f33211a = wikiSearchListView;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            WikiSearchListView.m51460a(this.f33211a).loadmore();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$i */
    public static final class C12376i extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ WikiSearchListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12376i(WikiSearchListView wikiSearchListView) {
            super(1);
            this.this$0 = wikiSearchListView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            BearLottieView bearLottieView = (BearLottieView) this.this$0.mo47094a(R.id.loading_view);
            Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "loading_view");
            ViewGroup.LayoutParams layoutParams = bearLottieView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = i;
                BearLottieView bearLottieView2 = (BearLottieView) this.this$0.mo47094a(R.id.loading_view);
                Intrinsics.checkExpressionValueIsNotNull(bearLottieView2, "loading_view");
                bearLottieView2.setLayoutParams(layoutParams2);
                SpaceEmptyState spaceEmptyState = (SpaceEmptyState) this.this$0.mo47094a(R.id.wiki_search_no_result_empty_state);
                Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
                ViewGroup.LayoutParams layoutParams3 = spaceEmptyState.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = i;
                    SpaceEmptyState spaceEmptyState2 = (SpaceEmptyState) this.this$0.mo47094a(R.id.wiki_search_no_result_empty_state);
                    Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState2, "wiki_search_no_result_empty_state");
                    spaceEmptyState2.setLayoutParams(layoutParams4);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ WikiSearchViewModel m51460a(WikiSearchListView wikiSearchListView) {
        WikiSearchViewModel dVar = wikiSearchListView.f33192c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$d */
    public static final class C12370d<T> implements AbstractC1178x<List<? extends C12360b>> {

        /* renamed from: a */
        final /* synthetic */ WikiSearchListView f33207a;

        C12370d(WikiSearchListView wikiSearchListView) {
            this.f33207a = wikiSearchListView;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends C12360b> list) {
            ((SmartRefreshLayout) this.f33207a.mo47094a(R.id.content_view)).mo96416n();
            this.f33207a.mo47099a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$h */
    public static final class C12375h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f33212a;

        C12375h(Function1 function1) {
            this.f33212a = function1;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Function1 function1 = this.f33212a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                function1.invoke((Integer) animatedValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    private final void m51462a(LifecycleOwner lifecycleOwner) {
        WikiSearchViewModel dVar = this.f33192c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        dVar.getSearchResultList().mo5923a(lifecycleOwner, new C12370d(this));
        Fragment fragment = this.f33195g;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifecycleOwner");
        }
        Context context = fragment.getContext();
        if (context instanceof Activity) {
            this.f33201m = AbstractC10550f.AbstractC10551a.m43717b((Activity) context);
            this.f33202n = new KHObserver();
            AbstractC10550f fVar = this.f33201m;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            fVar.mo39924a(this.f33202n);
        }
    }

    /* renamed from: a */
    private final void m51461a(Fragment fragment, String str) {
        this.f33195g = fragment;
        this.f33192c = WikiSearchViewModel.Companion.mo47090a(fragment);
        this.f33191b = str;
        m51462a(fragment);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "kotlin.jvm.PlatformType", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchListView$e */
    public static final class C12371e implements C12361c.AbstractC12363a {

        /* renamed from: a */
        final /* synthetic */ WikiSearchListView f33208a;

        C12371e(WikiSearchListView wikiSearchListView) {
            this.f33208a = wikiSearchListView;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.C12361c.AbstractC12363a
        /* renamed from: a */
        public final void mo47074a(C12360b bVar, int i) {
            ViewDelegate viewDelegate = this.f33208a.getViewDelegate();
            if (viewDelegate != null) {
                Intrinsics.checkExpressionValueIsNotNull(bVar, "wikiSearchResult");
                viewDelegate.mo46992a(bVar, i);
            }
            C12237b.m50900a(this.f33208a.getSubmodule(), this.f33208a.getSource(), "click_search_item");
            C12237b.m50896a(i, C13598b.m55197d(bVar.f33161f));
        }
    }

    public WikiSearchListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.wiki_searchv2_content_layout, this);
    }

    /* renamed from: a */
    private final void m51464a(String str, String str2) {
        if (this.f33196h) {
            WikiSearchViewModel dVar = this.f33192c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            dVar.searchSpace(str, this.f33197i);
            return;
        }
        WikiSearchViewModel dVar2 = this.f33192c;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        dVar2.search(str, str2);
    }

    /* renamed from: a */
    public final void mo47096a(int i, boolean z) {
        int i2;
        View view = this.f33199k;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchContentContainer");
        }
        int height = view.getHeight();
        int i3 = height - i;
        if (i3 < 0) {
            i2 = (height - getResources().getDimensionPixelSize(R.dimen.wiki_search_no_result_image_height)) / 2;
        } else {
            i2 = (i3 - getResources().getDimensionPixelSize(R.dimen.wiki_search_no_result_image_height)) / 2;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        C12376i iVar = new C12376i(this);
        C13479a.m54764b("WikiSearchListView", "resetPlaceHolderLocation, margin: " + i2);
        if (!z) {
            iVar.invoke(Integer.valueOf(i2));
            return;
        }
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47094a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        ViewGroup.LayoutParams layoutParams = spaceEmptyState.getLayoutParams();
        if (layoutParams != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(((FrameLayout.LayoutParams) layoutParams).topMargin, i2);
            ofInt.addUpdateListener(new C12375h(iVar));
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "valueAnimator");
            ofInt.setDuration((long) LocationRequest.PRIORITY_HD_ACCURACY);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo47097a(Fragment fragment, int i) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        m51463a(this, fragment, null, 2, null);
        this.f33197i = i;
        this.f33196h = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m51463a(WikiSearchListView wikiSearchListView, Fragment fragment, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        wikiSearchListView.m51461a(fragment, str);
    }
}
