package com.bytedance.ee.bear.wikiv2.searchv2;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.searchv2.C12361c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.bytedance.ee.util.p718t.C13742g;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \\2\u00020\u0001:\u0004\\]^_B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u00103\u001a\u00020\u0016H\u0002J\u001c\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010 2\b\u0010%\u001a\u0004\u0018\u00010 H\u0002J\b\u00107\u001a\u000205H\u0002J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u000205H\u0002J\b\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u000205H\u0002J\b\u0010>\u001a\u000205H\u0002J\u0010\u0010?\u001a\u0002052\u0006\u00106\u001a\u00020 H\u0002J\b\u0010@\u001a\u000205H\u0002J\u0016\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020\u00142\u0006\u0010%\u001a\u00020 J\u001a\u0010C\u001a\u0002052\u0006\u0010B\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020 H\u0002J\u000e\u0010D\u001a\u0002052\u0006\u0010B\u001a\u00020\u0014J\b\u0010E\u001a\u000205H\u0002J\b\u0010F\u001a\u000205H\u0002J\b\u0010G\u001a\u000205H\u0002J\b\u0010H\u001a\u000205H\u0014J\u0006\u0010I\u001a\u00020\nJ\u0006\u0010J\u001a\u000205J\b\u0010K\u001a\u000205H\u0002J\u0018\u0010L\u001a\u0002052\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\nH\u0002J\b\u0010P\u001a\u000205H\u0002J\b\u0010Q\u001a\u000205H\u0002J\b\u0010R\u001a\u000205H\u0002J\u0010\u0010S\u001a\u0002052\b\b\u0001\u0010T\u001a\u00020NJ\b\u0010U\u001a\u000205H\u0002J\b\u0010V\u001a\u000205H\u0002J\b\u0010W\u001a\u000205H\u0002J\u0018\u0010X\u001a\u0002052\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010ZH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010(\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X.¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "forSpaceSearch", "", "<set-?>", "isSearching", "()Z", "khObserver", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$KHObserver;", "khProvider", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "lazyInit", "lifecycleOwner", "Landroidx/fragment/app/Fragment;", "searchAdapter", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;", "getSearchAdapter", "()Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;", "searchAdapter$delegate", "Lkotlin/Lazy;", "searchContentContainer", "Landroid/view/View;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", ShareHitPoint.f121868c, "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "spaceId", "getSpaceId", "setSpaceId", "submodule", "getSubmodule", "setSubmodule", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;)V", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchViewModel;", "_getSearchAdapter", "_searchApi", "", "queryKey", "bindListener", "bindView", "owner", "Landroidx/lifecycle/LifecycleOwner;", "clearInputFocus", "clearSearchResult", "doClickCancel", "doClickInput", "doSearch", "hideKeyBoard", "init", "fragment", "init2", "initForSpaceSearch", "lazyInitContent", "observeInput", "onClear", "onDetachedFromWindow", "onEndInput", "onPrepareInput", "requestInputFocus", "resetPlaceHolderLocation", "keyboardHeight", "", "doAnim", "setContentResult", "setEmptyResult", "setEndInput", "setInputHint", "resid", "setLoadingResult", "setPrepareInput", "showKeyBoard", "showSearchResult", "searchResultList", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "Companion", "KHObserver", "NetworkStateObserver", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSearchView2 extends LinearLayout {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33123a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiSearchView2.class), "searchAdapter", "getSearchAdapter()Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;"))};

    /* renamed from: e */
    public static final Companion f33124e = new Companion(null);

    /* renamed from: b */
    public String f33125b;

    /* renamed from: c */
    public WikiSearchViewModel f33126c;

    /* renamed from: d */
    public boolean f33127d;

    /* renamed from: f */
    private final C10917c f33128f = new C10917c(new C10929e());

    /* renamed from: g */
    private final Lazy f33129g = LazyKt.lazy(new C12358q(this));

    /* renamed from: h */
    private Fragment f33130h;

    /* renamed from: i */
    private boolean f33131i;

    /* renamed from: j */
    private final C68289a f33132j = new C68289a();

    /* renamed from: k */
    private View f33133k;

    /* renamed from: l */
    private ViewDelegate f33134l;

    /* renamed from: m */
    private boolean f33135m;

    /* renamed from: n */
    private AbstractC10550f f33136n;

    /* renamed from: o */
    private KHObserver f33137o;

    /* renamed from: p */
    private String f33138p = "wiki_pages";

    /* renamed from: q */
    private String f33139q = "wiki_pages_view";

    /* renamed from: r */
    private HashMap f33140r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;", "", "onEnterSearch", "", "onExitSearch", "onSearchItemClick", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$d */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo46930a();

        /* renamed from: a */
        void mo46931a(C12360b bVar, int i);

        /* renamed from: b */
        void mo46932b();
    }

    /* renamed from: a */
    public View mo47042a(int i) {
        if (this.f33140r == null) {
            this.f33140r = new HashMap();
        }
        View view = (View) this.f33140r.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33140r.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C12361c getSearchAdapter() {
        Lazy lazy = this.f33129g;
        KProperty kProperty = f33123a[0];
        return (C12361c) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo47048a() {
        return this.f33135m;
    }

    public final String getSource() {
        return this.f33139q;
    }

    public final String getSubmodule() {
        return this.f33138p;
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33134l;
    }

    /* renamed from: h */
    public final void mo47060h() {
        mo47050c();
    }

    /* renamed from: a */
    public final void mo47047a(List<? extends C12360b> list) {
        SpaceEditText spaceEditText = (SpaceEditText) mo47042a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
        String valueOf = String.valueOf(spaceEditText.getText());
        if (TextUtils.isEmpty(valueOf)) {
            C13479a.m54764b("Wiki_WikiSearchView2", "showSearchResult, empty query, setPrepareInput. ");
            mo47051d();
        } else if (!CollectionUtils.isEmpty(list) || getSearchAdapter().mo47083b()) {
            C13479a.m54764b("Wiki_WikiSearchView2", "showSearchResult, setContentResult, query: " + valueOf.length());
            m51416p();
            getSearchAdapter().mo47082a((List<C12360b>) list);
            if (list == null) {
                Intrinsics.throwNpe();
            }
            boolean z = ((C12360b) list.get(0)).f33159d;
            C13479a.m54764b("Wiki_WikiSearchView2", "showSearchResult, isEnableLoadmore= " + z);
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47042a(R.id.content_view);
            Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
            smartRefreshLayout.mo96415m(z);
        } else {
            C13479a.m54764b("Wiki_WikiSearchView2", "showSearchResult, empty result, setEmptyResult, query: " + valueOf.length());
            m51415o();
        }
    }

    /* renamed from: a */
    public final void mo47046a(String str) {
        m51417q();
        ImageView imageView = (ImageView) mo47042a(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "clear");
        imageView.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("Wiki_WikiSearchView2", "doSearch, input empty, setPrepareInput. ");
            mo47051d();
            return;
        }
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        if (b.mo20041b()) {
            C13479a.m54764b("Wiki_WikiSearchView2", "doSearch, network connected, do search. ");
            m51414n();
            String str2 = this.f33125b;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spaceId");
            }
            m51408a(str, str2);
            return;
        }
        C13479a.m54764b("Wiki_WikiSearchView2", "doSearch, network unavailable, setEmptyResult. ");
        m51415o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$lazyInitContent$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$k */
    public static final class C12351k extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33149a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$k$a */
        static final class RunnableC12352a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12351k f33150a;

            RunnableC12352a(C12351k kVar) {
                this.f33150a = kVar;
            }

            public final void run() {
                this.f33150a.f33149a.mo47052e();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12351k(WikiSearchView2 wikiSearchView2) {
            this.f33149a = wikiSearchView2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 1) {
                C13742g.m55706a(new RunnableC12352a(this), 200);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResultAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$q */
    static final class C12358q extends Lambda implements Function0<C12361c> {
        final /* synthetic */ WikiSearchView2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12358q(WikiSearchView2 wikiSearchView2) {
            super(0);
            this.this$0 = wikiSearchView2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C12361c invoke() {
            return this.this$0.mo47053f();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m51420t();
    }

    /* renamed from: q */
    private final void m51417q() {
        getSearchAdapter().mo47080a();
        getSearchAdapter().notifyDataSetChanged();
    }

    /* renamed from: r */
    private final void m51418r() {
        m51419s();
        C10548d.m43703b((SpaceEditText) mo47042a(R.id.input));
    }

    /* renamed from: e */
    public final void mo47052e() {
        C10548d.m43697a(this);
        mo47054g();
    }

    public final String getSpaceId() {
        String str = this.f33125b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spaceId");
        }
        return str;
    }

    /* renamed from: i */
    public final boolean mo47061i() {
        if (!this.f33135m) {
            return false;
        }
        mo47049b();
        return true;
    }

    /* renamed from: t */
    private final void m51420t() {
        AbstractC10550f fVar = this.f33136n;
        if (fVar != null) {
            fVar.mo39928b(this.f33137o);
        }
        this.f33132j.mo237935a();
    }

    /* renamed from: c */
    public final void mo47050c() {
        C13479a.m54764b("Wiki_WikiSearchView2", "input click. ");
        m51411k();
        mo47051d();
        ViewDelegate dVar = this.f33134l;
        if (dVar != null) {
            dVar.mo46930a();
        }
        C12237b.m50900a(this.f33138p, this.f33139q, "search_button");
    }

    /* renamed from: f */
    public final C12361c mo47053f() {
        if (this.f33131i) {
            return new C12368e();
        }
        return new C12361c();
    }

    /* renamed from: g */
    public final void mo47054g() {
        SpaceEditText spaceEditText = (SpaceEditText) mo47042a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
        spaceEditText.setFocusableInTouchMode(true);
        ((SpaceEditText) mo47042a(R.id.input)).clearFocus();
    }

    /* renamed from: l */
    private final void m51412l() {
        this.f33132j.mo237937a(C13716b.m55614a((SpaceEditText) mo47042a(R.id.input)).debounce(300, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).subscribe(new C12354m(this), C12355n.f33153a));
    }

    /* renamed from: n */
    private final void m51414n() {
        BearLottieView bearLottieView = (BearLottieView) mo47042a(R.id.loading_view);
        bearLottieView.playAnimation();
        bearLottieView.setVisibility(0);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47042a(R.id.content_view);
        smartRefreshLayout.setVisibility(8);
        smartRefreshLayout.mo96416n();
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47042a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(8);
    }

    /* renamed from: o */
    private final void m51415o() {
        BearLottieView bearLottieView = (BearLottieView) mo47042a(R.id.loading_view);
        bearLottieView.cancelAnimation();
        bearLottieView.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47042a(R.id.content_view);
        smartRefreshLayout.setVisibility(8);
        smartRefreshLayout.mo96416n();
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47042a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(0);
    }

    /* renamed from: p */
    private final void m51416p() {
        BearLottieView bearLottieView = (BearLottieView) mo47042a(R.id.loading_view);
        bearLottieView.cancelAnimation();
        bearLottieView.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47042a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
        smartRefreshLayout.setVisibility(0);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47042a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(8);
    }

    /* renamed from: s */
    private final void m51419s() {
        SpaceEditText spaceEditText = (SpaceEditText) mo47042a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
        spaceEditText.setFocusableInTouchMode(true);
        SpaceEditText spaceEditText2 = (SpaceEditText) mo47042a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText2, "input");
        spaceEditText2.setFocusable(true);
        ((SpaceEditText) mo47042a(R.id.input)).requestFocus();
    }

    /* renamed from: b */
    public final void mo47049b() {
        C13479a.m54764b("Wiki_WikiSearchView2", "cancel click. ");
        m51413m();
        ViewDelegate dVar = this.f33134l;
        if (dVar != null) {
            dVar.mo46932b();
        }
    }

    /* renamed from: j */
    private final void m51410j() {
        ((ImageView) mo47042a(R.id.clear)).setOnClickListener(new View$OnClickListenerC12345e(this));
        ((TextView) mo47042a(R.id.cancel)).setOnClickListener(new View$OnClickListenerC12346f(this));
        ((SpaceEditText) mo47042a(R.id.input)).setOnEditorActionListener(new C12347g(this));
        ((SpaceEditText) mo47042a(R.id.input)).setOnFocusChangeListener(new View$OnFocusChangeListenerC12348h(this));
    }

    /* renamed from: m */
    private final void m51413m() {
        this.f33135m = false;
        mo47052e();
        ((SpaceEditText) mo47042a(R.id.input)).setText("");
        ImageView imageView = (ImageView) mo47042a(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "clear");
        imageView.setVisibility(8);
        TextView textView = (TextView) mo47042a(R.id.cancel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancel");
        textView.setVisibility(8);
        BearLottieView bearLottieView = (BearLottieView) mo47042a(R.id.loading_view);
        bearLottieView.cancelAnimation();
        bearLottieView.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47042a(R.id.content_view);
        smartRefreshLayout.setVisibility(8);
        smartRefreshLayout.mo96416n();
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47042a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(8);
        m51417q();
    }

    /* renamed from: k */
    private final void m51411k() {
        if (this.f33127d) {
            C13479a.m54764b("Wiki_WikiSearchView2", "lazyInitContent, viewStub has been initialized, return. ");
            return;
        }
        View inflate = ((ViewStub) findViewById(R.id.view_stub)).inflate();
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view_stub.inflate()");
        this.f33133k = inflate;
        this.f33127d = true;
        getSearchAdapter().mo47081a(new C12350j(this));
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) mo47042a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(baseRecyclerView, "recycler");
        baseRecyclerView.setAdapter(getSearchAdapter());
        BaseRecyclerView baseRecyclerView2 = (BaseRecyclerView) mo47042a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(baseRecyclerView2, "recycler");
        baseRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        ((BaseRecyclerView) mo47042a(R.id.recycler)).addOnScrollListener(new C12351k(this));
        ((SmartRefreshLayout) mo47042a(R.id.content_view)).mo96368b(new C12353l(this));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((SmartRefreshLayout) mo47042a(R.id.content_view)).mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47042a(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "content_view");
        smartRefreshLayout.mo96415m(false);
        m51412l();
    }

    /* renamed from: d */
    public final void mo47051d() {
        this.f33135m = true;
        SpaceEditText spaceEditText = (SpaceEditText) mo47042a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
        if (!TextUtils.isEmpty(String.valueOf(spaceEditText.getText()))) {
            ((SpaceEditText) mo47042a(R.id.input)).setText("");
        }
        ImageView imageView = (ImageView) mo47042a(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "clear");
        imageView.setVisibility(8);
        TextView textView = (TextView) mo47042a(R.id.cancel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancel");
        textView.setVisibility(0);
        BearLottieView bearLottieView = (BearLottieView) mo47042a(R.id.loading_view);
        bearLottieView.cancelAnimation();
        bearLottieView.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo47042a(R.id.content_view);
        smartRefreshLayout.setVisibility(8);
        smartRefreshLayout.mo96416n();
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47042a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        spaceEmptyState.setVisibility(8);
        m51418r();
    }

    public final void setViewDelegate(ViewDelegate dVar) {
        this.f33134l = dVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$KHObserver;", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "(Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2;)V", "onKeyboardHeightChanged", "", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "keyboardHeight", "", "orientation", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$b */
    public final class KHObserver implements AbstractC10549e {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public KHObserver() {
        }

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(fVar, "khp");
            C13479a.m54764b("Wiki_WikiSearchView2", "KeyboardHeightObserver, onChanged, kh: " + i);
            if (fVar.mo39935i()) {
                ((SpaceEditText) WikiSearchView2.this.mo47042a(R.id.input)).requestFocus();
            } else {
                C13479a.m54764b("Wiki_WikiSearchView2", "KeyboardHeightObserver, keyboard dismiss, clearInputFocus.");
                WikiSearchView2.this.mo47054g();
            }
            if (WikiSearchView2.this.f33127d) {
                WikiSearchView2.this.mo47043a(i, true);
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$NetworkStateObserver;", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "(Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2;)V", "onChanged", "", "networkState", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$c */
    public final class NetworkStateObserver implements AbstractC1178x<ConnectionService.NetworkState> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public NetworkStateObserver() {
        }

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            boolean z;
            if (networkState == null || !networkState.mo20041b()) {
                z = false;
            } else {
                z = true;
            }
            C13479a.m54764b("Wiki_WikiSearchView2", "NetworkStateObserver, onChanged, lazyInit: " + WikiSearchView2.this.f33127d + ", connect: " + z);
            if (z && WikiSearchView2.this.f33127d) {
                SpaceEditText spaceEditText = (SpaceEditText) WikiSearchView2.this.mo47042a(R.id.input);
                Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
                String valueOf = String.valueOf(spaceEditText.getText());
                if (!TextUtils.isEmpty(valueOf) && !WikiSearchView2.this.getSearchAdapter().mo47083b()) {
                    WikiSearchView2.this.mo47046a(valueOf);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$f */
    public static final class View$OnClickListenerC12346f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33144a;

        View$OnClickListenerC12346f(WikiSearchView2 wikiSearchView2) {
            this.f33144a = wikiSearchView2;
        }

        public final void onClick(View view) {
            this.f33144a.mo47049b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$n */
    public static final class C12355n<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12355n f33153a = new C12355n();

        C12355n() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54765b("Wiki_WikiSearchView2", "onTextChanged err. ", th);
        }
    }

    public final void setSource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33139q = str;
    }

    public final void setSpaceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33125b = str;
    }

    public final void setSubmodule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33138p = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$l */
    public static final class C12353l implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33151a;

        C12353l(WikiSearchView2 wikiSearchView2) {
            this.f33151a = wikiSearchView2;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            WikiSearchView2.m51405a(this.f33151a).loadmore();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$p */
    public static final class C12357p extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ WikiSearchView2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12357p(WikiSearchView2 wikiSearchView2) {
            super(1);
            this.this$0 = wikiSearchView2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            BearLottieView bearLottieView = (BearLottieView) this.this$0.mo47042a(R.id.loading_view);
            Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "loading_view");
            ViewGroup.LayoutParams layoutParams = bearLottieView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = i;
                BearLottieView bearLottieView2 = (BearLottieView) this.this$0.mo47042a(R.id.loading_view);
                Intrinsics.checkExpressionValueIsNotNull(bearLottieView2, "loading_view");
                bearLottieView2.setLayoutParams(layoutParams2);
                SpaceEmptyState spaceEmptyState = (SpaceEmptyState) this.this$0.mo47042a(R.id.wiki_search_no_result_empty_state);
                Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
                ViewGroup.LayoutParams layoutParams3 = spaceEmptyState.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = i;
                    SpaceEmptyState spaceEmptyState2 = (SpaceEmptyState) this.this$0.mo47042a(R.id.wiki_search_no_result_empty_state);
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
    public static final /* synthetic */ WikiSearchViewModel m51405a(WikiSearchView2 wikiSearchView2) {
        WikiSearchViewModel dVar = wikiSearchView2.f33126c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return dVar;
    }

    public final void setInputHint(int i) {
        ((SpaceEditText) mo47042a(R.id.input)).setHint(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$e */
    public static final class View$OnClickListenerC12345e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33143a;

        View$OnClickListenerC12345e(WikiSearchView2 wikiSearchView2) {
            this.f33143a = wikiSearchView2;
        }

        public final void onClick(View view) {
            C13479a.m54764b("Wiki_WikiSearchView2", "clear click. ");
            this.f33143a.mo47051d();
            WikiSearchView2.m51405a(this.f33143a).cancelSearch();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$i */
    public static final class C12349i<T> implements AbstractC1178x<List<? extends C12360b>> {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33147a;

        C12349i(WikiSearchView2 wikiSearchView2) {
            this.f33147a = wikiSearchView2;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends C12360b> list) {
            ((SmartRefreshLayout) this.f33147a.mo47042a(R.id.content_view)).mo96416n();
            this.f33147a.mo47047a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$o */
    public static final class C12356o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f33154a;

        C12356o(Function1 function1) {
            this.f33154a = function1;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Function1 function1 = this.f33154a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                function1.invoke((Integer) animatedValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "charSequence", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$m */
    public static final class C12354m<T> implements Consumer<CharSequence> {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33152a;

        C12354m(WikiSearchView2 wikiSearchView2) {
            this.f33152a = wikiSearchView2;
        }

        /* renamed from: a */
        public final void accept(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "charSequence");
            SpaceEditText spaceEditText = (SpaceEditText) this.f33152a.mo47042a(R.id.input);
            Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
            if (spaceEditText.isFocused()) {
                C13479a.m54764b("Wiki_WikiSearchView2", "onTextChanged, query: " + charSequence);
                this.f33152a.mo47046a(charSequence.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m51406a(LifecycleOwner lifecycleOwner) {
        WikiSearchViewModel dVar = this.f33126c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        dVar.getSearchResultList().mo5923a(lifecycleOwner, new C12349i(this));
        C5084ad.m20847d().mo20037a().mo5923a(lifecycleOwner, new NetworkStateObserver());
        Fragment fragment = this.f33130h;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifecycleOwner");
        }
        Context context = fragment.getContext();
        if (context instanceof Activity) {
            this.f33136n = AbstractC10550f.AbstractC10551a.m43717b((Activity) context);
            this.f33137o = new KHObserver();
            AbstractC10550f fVar = this.f33136n;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            fVar.mo39924a(this.f33137o);
        }
    }

    /* renamed from: a */
    public final void mo47044a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        m51407a(this, fragment, null, 2, null);
        this.f33131i = true;
    }

    /* renamed from: b */
    private final void m51409b(Fragment fragment, String str) {
        this.f33130h = fragment;
        this.f33126c = WikiSearchViewModel.Companion.mo47090a(fragment);
        this.f33125b = str;
        m51406a((LifecycleOwner) fragment);
        m51410j();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$h */
    public static final class View$OnFocusChangeListenerC12348h implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33146a;

        View$OnFocusChangeListenerC12348h(WikiSearchView2 wikiSearchView2) {
            this.f33146a = wikiSearchView2;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                SpaceEditText spaceEditText = (SpaceEditText) this.f33146a.mo47042a(R.id.input);
                Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
                if (TextUtils.isEmpty(String.valueOf(spaceEditText.getText()))) {
                    this.f33146a.mo47050c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "kotlin.jvm.PlatformType", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$j */
    public static final class C12350j implements C12361c.AbstractC12363a {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33148a;

        C12350j(WikiSearchView2 wikiSearchView2) {
            this.f33148a = wikiSearchView2;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.C12361c.AbstractC12363a
        /* renamed from: a */
        public final void mo47074a(C12360b bVar, int i) {
            ViewDelegate viewDelegate = this.f33148a.getViewDelegate();
            if (viewDelegate != null) {
                Intrinsics.checkExpressionValueIsNotNull(bVar, "wikiSearchResult");
                viewDelegate.mo46931a(bVar, i);
            }
            C12237b.m50900a(this.f33148a.getSubmodule(), this.f33148a.getSource(), "click_search_item");
            C12237b.m50896a(i, C13598b.m55197d(bVar.f33161f));
        }
    }

    public WikiSearchView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.wiki_searchv2_view, this);
    }

    /* renamed from: a */
    private final void m51408a(String str, String str2) {
        if (this.f33131i) {
            WikiSearchViewModel dVar = this.f33126c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            WikiSearchViewModel.searchSpace$default(dVar, str, 0, 2, null);
            return;
        }
        WikiSearchViewModel dVar2 = this.f33126c;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        dVar2.search(str, str2);
    }

    /* renamed from: a */
    public final void mo47043a(int i, boolean z) {
        int i2;
        View view = this.f33133k;
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
        C12357p pVar = new C12357p(this);
        C13479a.m54764b("Wiki_WikiSearchView2", "resetPlaceHolderLocation, margin: " + i2);
        if (!z) {
            pVar.invoke(Integer.valueOf(i2));
            return;
        }
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo47042a(R.id.wiki_search_no_result_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "wiki_search_no_result_empty_state");
        ViewGroup.LayoutParams layoutParams = spaceEmptyState.getLayoutParams();
        if (layoutParams != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(((FrameLayout.LayoutParams) layoutParams).topMargin, i2);
            ofInt.addUpdateListener(new C12356o(pVar));
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "valueAnimator");
            ofInt.setDuration((long) LocationRequest.PRIORITY_HD_ACCURACY);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo47045a(Fragment fragment, String str) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        m51409b(fragment, str);
        this.f33131i = false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "textView", "Landroid/widget/TextView;", "actionId", "", "keyEvent", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2$g */
    public static final class C12347g implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchView2 f33145a;

        C12347g(WikiSearchView2 wikiSearchView2) {
            this.f33145a = wikiSearchView2;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return true;
            }
            C13479a.m54764b("Wiki_WikiSearchView2", "keyboard search click. ");
            this.f33145a.mo47052e();
            return true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m51407a(WikiSearchView2 wikiSearchView2, Fragment fragment, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        wikiSearchView2.m51409b(fragment, str);
    }
}
