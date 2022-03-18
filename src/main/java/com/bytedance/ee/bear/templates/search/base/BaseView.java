package com.bytedance.ee.bear.templates.search.base;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadFailCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.loadstateview.LoadingCategory;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.templates.TemplateAdapter;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryIndicatorAdapter;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.CategoryTabAdapter;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.templates.search.base.ISearchListView;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ \u0010+\u001a\u00020,2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00170.j\b\u0012\u0004\u0012\u00020\u0017`/H\u0016J\b\u00100\u001a\u00020,H\u0016J\b\u00101\u001a\u00020,H\u0016J\n\u00102\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020,H\u0016J\b\u00108\u001a\u00020,H\u0002J\b\u00109\u001a\u00020,H\u0002J\b\u0010:\u001a\u00020,H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0017H\u0002J\u0018\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020\nH\u0016J\u0010\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020<H\u0016J\u0016\u0010E\u001a\u00020,2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002J\u0012\u0010J\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020,2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010O\u001a\u00020,H\u0016J\b\u0010P\u001a\u00020,H\u0016J\u0010\u0010Q\u001a\u00020,2\u0006\u0010R\u001a\u00020SH\u0016J\u000e\u0010T\u001a\u00020,2\u0006\u0010=\u001a\u00020\u0017J\u0010\u0010U\u001a\u00020,2\u0006\u0010V\u001a\u00020<H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8DX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BaseView;", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", ShareHitPoint.f121869d, "", "(Landroidx/fragment/app/FragmentActivity;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;I)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "categoryIndicatorAdapter", "Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter;", "categoryTabAdapter", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "getCategoryTabAdapter", "()Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "setCategoryTabAdapter", "(Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;)V", "curCategoryTab", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "currentIndicatorPos", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "loadStateViewDispatcher", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateViewDispatcher;", "loadingDialog", "Lcom/bytedance/ee/bear/bizwidget/LoadingDialog;", "getRootView", "()Landroid/view/View;", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "Lkotlin/Lazy;", "getType", "()I", "viewDelegate", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListView$IViewDelegate;", "addTemplateGroup", "", "categoryTabList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "create", "destroy", "getCurrentCategoryTab", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "getTab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "hideCreateLoading", "initCategoryIndicator", "initLoadStateView", "initTempGroup", "isCategoryTabEmpty", "", "categoryTab", "onTemplateClicked", "position", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "onTemplateDelete", "scrollToTargetCategory", "index", "setLoadMoreEnable", "enable", "categoryList", "", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "setViewDelegate", "showCategoryIndicator", "templateGroupTab", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "showCategoryTab", "showCreateLoading", "showDataLoading", "showLoadingFailed", "throwable", "", "showSingleCategoryTab", "visiableToUser", "visiable", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a.e */
public final class BaseView implements TemplateAdapter.TemplateClickListener, ISearchListView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31347a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseView.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: f */
    public static final Companion f31348f = new Companion(null);

    /* renamed from: b */
    public ISearchListView.IViewDelegate f31349b;

    /* renamed from: c */
    public CategoryIndicatorAdapter f31350c;

    /* renamed from: d */
    protected CategoryTabAdapter f31351d;

    /* renamed from: e */
    public int f31352e;

    /* renamed from: g */
    private C8594b f31353g;

    /* renamed from: h */
    private CategoryTab f31354h;

    /* renamed from: i */
    private C4878c f31355i;

    /* renamed from: j */
    private final Lazy f31356j = LazyKt.lazy(new C11648f(this));

    /* renamed from: k */
    private final FragmentActivity f31357k;

    /* renamed from: l */
    private final LifecycleOwner f31358l;

    /* renamed from: m */
    private final View f31359m;

    /* renamed from: n */
    private final int f31360n;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final TemplateCenterViewModel mo44672d() {
        Lazy lazy = this.f31356j;
        KProperty kProperty = f31347a[0];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BaseView$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43996a() {
        TemplateAdapter.TemplateClickListener.C11450a.m47658a(this);
    }

    /* renamed from: c */
    public Tab2 mo44671c() {
        return Tab2.SYSTEM;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: e */
    public CategoryTab mo44673e() {
        return this.f31354h;
    }

    /* renamed from: i */
    public final FragmentActivity mo44677i() {
        return this.f31357k;
    }

    /* renamed from: j */
    public final View mo44678j() {
        return this.f31359m;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: a */
    public void mo44668a(boolean z) {
        if (z) {
            mo44672d().getSearchContent().mo5922a(this.f31358l);
            mo44672d().getSearchContent().mo5923a(this.f31358l, new C11649g(this));
            return;
        }
        mo44672d().getSearchContent().mo5922a(this.f31358l);
    }

    /* renamed from: b */
    public EmptyCategory mo44669b() {
        EmptyCategory emptyCategory = EmptyCategory.f23256t;
        Intrinsics.checkExpressionValueIsNotNull(emptyCategory, "EmptyCategory.EMPTY_CATEGORY_TEMPLATE_SEARCH");
        return emptyCategory;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTouchEvent"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.e$c */
    public static final class C11645c implements LoadStateView.AbstractC8574f {

        /* renamed from: a */
        final /* synthetic */ BaseView f31362a;

        C11645c(BaseView eVar) {
            this.f31362a = eVar;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
        public final void onTouchEvent() {
            ISearchListView.IViewDelegate aVar = this.f31362a.f31349b;
            if (aVar != null) {
                aVar.mo44642e();
            }
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m48313k();
        m48314l();
        m48315m();
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: f */
    public void mo44674f() {
        C8594b bVar = this.f31353g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33503a();
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: h */
    public void mo44676h() {
        C13479a.m54764b("BaseTemplateListView", "hideCreateLoading()...");
        C4878c cVar = this.f31355i;
        if (cVar != null) {
            cVar.mo19130b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.e$f */
    static final class C11648f extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BaseView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11648f(BaseView eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.mo44677i()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    /* renamed from: k */
    private final void m48313k() {
        C8594b bVar = new C8594b((LoadStateView) this.f31359m.findViewById(R.id.loadStateView), Looper.getMainLooper());
        this.f31353g = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33512a(false, mo44669b(), LoadingCategory.CATEGORY_TEMPLATE);
        C8594b bVar2 = this.f31353g;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33509a(new C11645c(this));
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: g */
    public void mo44675g() {
        C13479a.m54764b("BaseTemplateListView", "showCreateLoading()...");
        if (this.f31355i == null) {
            C4878c cVar = new C4878c(this.f31357k);
            this.f31355i = cVar;
            if (cVar != null) {
                cVar.mo19131b(R.string.Doc_List_TemplateClickLoadingToast);
            }
        }
        C4878c cVar2 = this.f31355i;
        if (cVar2 != null) {
            cVar2.mo19132c();
        }
    }

    /* renamed from: l */
    private final void m48314l() {
        this.f31350c = new CategoryIndicatorAdapter();
        RecyclerView recyclerView = (RecyclerView) this.f31359m.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.categoryIndicator");
        CategoryIndicatorAdapter bVar = this.f31350c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
        }
        recyclerView.setAdapter(bVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f31359m.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.categoryIndicator");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f31357k, 0, false));
        CategoryIndicatorAdapter bVar2 = this.f31350c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
        }
        bVar2.mo70668a((BaseQuickAdapter.AbstractC20911a) new C11644b(this));
        RecyclerView recyclerView3 = (RecyclerView) this.f31359m.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rootView.categoryIndicator");
        recyclerView3.setVisibility(8);
    }

    /* renamed from: m */
    private final void m48315m() {
        this.f31351d = new CategoryTabAdapter(this.f31358l, this, "ccm_template_search_result_view_click", this.f31360n);
        RecyclerView recyclerView = (RecyclerView) this.f31359m.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
        CategoryTabAdapter cVar = this.f31351d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f31359m.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.templateGroupList");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f31357k, 1, false));
        ((RecyclerView) this.f31359m.findViewById(R.id.templateGroupList)).addOnScrollListener(new C11646d(this));
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f31359m.findViewById(R.id.refreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.refreshLayout");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(this.f31357k));
        ((SmartRefreshLayout) this.f31359m.findViewById(R.id.refreshLayout)).mo96368b(new C11647e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/templates/search/base/BaseView$initTempGroup$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.e$d */
    public static final class C11646d extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ BaseView f31363a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11646d(BaseView eVar) {
            this.f31363a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                C10548d.m43696a((Context) this.f31363a.mo44677i());
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ISearchListView.IViewDelegate aVar) {
        this.f31349b = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.e$e */
    public static final class C11647e implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ BaseView f31364a;

        C11647e(BaseView eVar) {
            this.f31364a = eVar;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            ISearchListView.IViewDelegate aVar = this.f31364a.f31349b;
            if (aVar != null) {
                aVar.mo44641d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.e$g */
    public static final class C11649g<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ BaseView f31365a;

        C11649g(BaseView eVar) {
            this.f31365a = eVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            ISearchListView.IViewDelegate aVar = this.f31365a.f31349b;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "it");
                aVar.mo44637a(str);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CategoryIndicatorAdapter m48310a(BaseView eVar) {
        CategoryIndicatorAdapter bVar = eVar.f31350c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
        }
        return bVar;
    }

    /* renamed from: a */
    private final void m48311a(List<Category> list) {
        for (Category category : list) {
            if (category.getHasMore()) {
                mo44670b(true);
                return;
            }
        }
        mo44670b(false);
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: b */
    public void mo44670b(boolean z) {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f31359m.findViewById(R.id.refreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.refreshLayout");
        smartRefreshLayout.mo96415m(z);
        ((SmartRefreshLayout) this.f31359m.findViewById(R.id.refreshLayout)).mo96416n();
    }

    /* renamed from: b */
    private final boolean m48312b(CategoryTab categoryTab) {
        for (Category category : categoryTab.getCategoryList()) {
            if (!category.getTemplates().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43998a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        ISearchListView.IViewDelegate aVar = this.f31349b;
        if (aVar != null) {
            aVar.mo44634a(templateV4);
        }
    }

    /* renamed from: a */
    public final void mo44663a(CategoryTab categoryTab) {
        Intrinsics.checkParameterIsNotNull(categoryTab, "categoryTab");
        this.f31354h = categoryTab;
        if (!m48312b(categoryTab) || categoryTab.getCategoryList().size() > 1) {
            C8594b bVar = this.f31353g;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar.mo33513b();
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f31359m.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout, "rootView.content");
            coordinatorLayout.setVisibility(0);
            CategoryTabAdapter cVar = this.f31351d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
            }
            cVar.mo70690f(categoryTab.getCategoryList());
        } else {
            C13479a.m54764b("BaseTemplateListView", "showSingleCategoryTab().. isEmpty");
            CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) this.f31359m.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout2, "rootView.content");
            coordinatorLayout2.setVisibility(8);
            C8594b bVar2 = this.f31353g;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar2.mo33515c();
        }
        m48311a(categoryTab.getCategoryList());
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: a */
    public void mo44664a(TemplateGroupTab templateGroupTab) {
        CategoryTab categoryTab;
        Intrinsics.checkParameterIsNotNull(templateGroupTab, "templateGroupTab");
        ArrayList<CategoryTab> categoryTabList = templateGroupTab.getCategoryTabList();
        boolean z = false;
        if (categoryTabList.isEmpty()) {
            C13479a.m54764b("BaseTemplateListView", "showCategoryTab().. isEmpty");
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f31359m.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout, "rootView.content");
            coordinatorLayout.setVisibility(8);
            String b = mo44672d().getSearchContent().mo5927b();
            if (b != null) {
                if (b.length() == 0) {
                    z = true;
                }
                if (z) {
                    C8594b bVar = this.f31353g;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
                    }
                    bVar.mo33513b();
                    return;
                }
            }
            C8594b bVar2 = this.f31353g;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar2.mo33515c();
            return;
        }
        mo44672d().showFilter(mo44671c());
        if (this.f31352e >= categoryTabList.size()) {
            categoryTab = categoryTabList.get(0);
        } else {
            categoryTab = categoryTabList.get(this.f31352e);
        }
        Intrinsics.checkExpressionValueIsNotNull(categoryTab, "if (currentIndicatorPos …ntIndicatorPos]\n        }");
        mo44663a(categoryTab);
        if (categoryTab.getCategoryList().isEmpty() || categoryTab.getCategoryList().get(0).getTemplates().isEmpty()) {
            z = true;
        }
        TemplateReport.f31011b.mo44228a(!z);
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: a */
    public void mo44666a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        C8594b bVar = this.f31353g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33507a(LoadFailCategory.CATEGORY_TEMPLATE_FAILED);
        RecyclerView recyclerView = (RecyclerView) this.f31359m.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.categoryIndicator");
        recyclerView.setVisibility(8);
        View findViewById = this.f31359m.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.divider");
        findViewById.setVisibility(8);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f31359m.findViewById(R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout, "rootView.content");
        coordinatorLayout.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView
    /* renamed from: a */
    public void mo44667a(ArrayList<CategoryTab> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "categoryTabList");
        CategoryTabAdapter cVar = this.f31351d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
        }
        List<Category> b = cVar.mo70673b();
        Intrinsics.checkExpressionValueIsNotNull(b, "categoryTabAdapter.data");
        if (!b.isEmpty()) {
            boolean z = false;
            Iterator<CategoryTab> it = arrayList.iterator();
            while (it.hasNext()) {
                List<Category> categoryList = it.next().getCategoryList();
                for (Category category : b) {
                    for (Category category2 : categoryList) {
                        if (Intrinsics.areEqual(category.getName().toString(), category2.getName().toString()) && (!category2.getTemplates().isEmpty())) {
                            category.getTemplates().addAll(category2.getTemplates());
                            category.setHasMore(category2.getHasMore());
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                CategoryTabAdapter cVar2 = this.f31351d;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
                }
                cVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43997a(int i, TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        ISearchListView.IViewDelegate aVar = this.f31349b;
        if (aVar != null) {
            aVar.mo44639b(templateV4);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u000128\u0010\u0002\u001a4\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "kotlin.jvm.PlatformType", "Lcom/chad/library/adapter/base/BaseViewHolder;", "<anonymous parameter 1>", "Landroid/view/View;", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.e$b */
    public static final class C11644b implements BaseQuickAdapter.AbstractC20911a {

        /* renamed from: a */
        final /* synthetic */ BaseView f31361a;

        C11644b(BaseView eVar) {
            this.f31361a = eVar;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
        public final void onItemClick(BaseQuickAdapter<Object, C20923c> baseQuickAdapter, View view, int i) {
            Intrinsics.checkExpressionValueIsNotNull(baseQuickAdapter, "adapter");
            Object obj = baseQuickAdapter.mo70673b().get(i);
            if (obj != null) {
                BaseView.m48310a(this.f31361a).mo33373b(i);
                this.f31361a.mo44663a((CategoryTab) obj);
                this.f31361a.f31352e = i;
                ((RecyclerView) this.f31361a.mo44678j().findViewById(R.id.templateGroupList)).scrollToPosition(0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.templates.center.list.CategoryTab");
        }
    }

    public BaseView(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, View view, int i) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f31357k = fragmentActivity;
        this.f31358l = lifecycleOwner;
        this.f31359m = view;
        this.f31360n = i;
    }
}
