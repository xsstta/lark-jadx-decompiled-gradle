package com.bytedance.ee.bear.templates.center.list.base;

import android.os.Looper;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
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
import com.bytedance.ee.bear.templates.TemplateAdapter;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryIndicatorAdapter;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.CategoryTabAdapter;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001cB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ0\u0010:\u001a\u00020;2\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u00190=j\b\u0012\u0004\u0012\u00020\u0019`>2\u0006\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u001fH\u0016J\b\u0010A\u001a\u00020;H\u0016J\b\u0010B\u001a\u00020;H\u0016J\n\u0010C\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020;H\u0016J\b\u0010G\u001a\u00020;H\u0002J\b\u0010H\u001a\u00020;H\u0002J\b\u0010I\u001a\u00020;H\u0002J\u0010\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u00020\u0019H\u0002J\u0006\u0010L\u001a\u00020;J\u0018\u0010M\u001a\u00020;2\u0006\u0010N\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020;2\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010R\u001a\u00020;2\u0006\u0010S\u001a\u00020\u001fH\u0016J\u0010\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020-H\u0016J\u0016\u0010T\u001a\u00020;2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020X0WH\u0002J\u0012\u0010Y\u001a\u00020;2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010,\u001a\u00020;2\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010\\\u001a\u00020;2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010]\u001a\u00020;H\u0016J\b\u0010^\u001a\u00020;H\u0016J\u0010\u0010_\u001a\u00020;2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020;2\u0006\u0010K\u001a\u00020\u0019H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00102\u001a\u0002038DX\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListView;", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView;", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "categoryIndicatorAdapter", "Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter;", "getCategoryIndicatorAdapter", "()Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter;", "setCategoryIndicatorAdapter", "(Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter;)V", "categoryTabAdapter", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "getCategoryTabAdapter", "()Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "setCategoryTabAdapter", "(Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;)V", "curCategoryTab", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "getCurCategoryTab", "()Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "setCurCategoryTab", "(Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;)V", "currentIndicatorPos", "", "getCurrentIndicatorPos", "()I", "setCurrentIndicatorPos", "(I)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "loadStateViewDispatcher", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateViewDispatcher;", "loadingDialog", "Lcom/bytedance/ee/bear/bizwidget/LoadingDialog;", "getRootView", "()Landroid/view/View;", "showCategoryIndicator", "", "getShowCategoryIndicator", "()Z", "setShowCategoryIndicator", "(Z)V", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "Lkotlin/Lazy;", "viewDelegate", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView$IViewDelegate;", "addTemplateGroup", "", "categoryTabList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pageNumber", ShareHitPoint.f121868c, "create", "destroy", "getCurrentCategoryTab", "getEmptyClickListener", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateView$EmptyStateHandler;", "hideCreateLoading", "initCategoryIndicator", "initLoadStateView", "initTempGroup", "isCategoryTabEmpty", "categoryTab", "loadCategoryTab", "onTemplateClicked", "position", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "onTemplateDelete", "scrollToTargetCategory", "index", "setLoadMoreEnable", "enable", "categoryList", "", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "setViewDelegate", "templateGroupTab", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "showCategoryTab", "showCreateLoading", "showDataLoading", "showLoadingFailed", "throwable", "", "showSingleCategoryTab", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.a.d */
public abstract class BaseTemplateListView implements TemplateAdapter.TemplateClickListener, IBaseTemplateListView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30914a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTemplateListView.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: e */
    public static final Companion f30915e = new Companion(null);

    /* renamed from: b */
    public IBaseTemplateListView.IViewDelegate f30916b;

    /* renamed from: c */
    protected CategoryIndicatorAdapter f30917c;

    /* renamed from: d */
    protected CategoryTabAdapter f30918d;

    /* renamed from: f */
    private C8594b f30919f;

    /* renamed from: g */
    private int f30920g;

    /* renamed from: h */
    private C4878c f30921h;

    /* renamed from: i */
    private CategoryTab f30922i;

    /* renamed from: j */
    private boolean f30923j;

    /* renamed from: k */
    private final Lazy f30924k = LazyKt.lazy(new C11501f(this));

    /* renamed from: l */
    private final FragmentActivity f30925l;

    /* renamed from: m */
    private final LifecycleOwner f30926m;

    /* renamed from: n */
    private final View f30927n;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final TemplateCenterViewModel mo44191f() {
        Lazy lazy = this.f30924k;
        KProperty kProperty = f30914a[0];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListView$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/center/list/base/BaseTemplateListView$getEmptyClickListener$1", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateView$EmptyStateHandler;", "onMasterButtonTouchEvent", "", "onMasterTextTouchEvent", "onSlaveButtonTouchEvent", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.d$b */
    public static final class C11497b implements LoadStateView.AbstractC8570b {
        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
        /* renamed from: a */
        public void mo32735a() {
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
        /* renamed from: b */
        public void mo32736b() {
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
        /* renamed from: c */
        public void mo32737c() {
        }

        C11497b() {
        }
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43996a() {
        TemplateAdapter.TemplateClickListener.C11450a.m47658a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo44189d() {
        return this.f30920g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo44190e() {
        return this.f30923j;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: h */
    public CategoryTab mo44193h() {
        return this.f30922i;
    }

    /* renamed from: m */
    public final FragmentActivity mo44198m() {
        return this.f30925l;
    }

    /* renamed from: n */
    public final View mo44199n() {
        return this.f30927n;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: a */
    public void mo44184a(boolean z) {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f30927n.findViewById(R.id.refreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.refreshLayout");
        smartRefreshLayout.mo96415m(z);
        ((SmartRefreshLayout) this.f30927n.findViewById(R.id.refreshLayout)).mo96416n();
    }

    /* renamed from: g */
    public final void mo44192g() {
        IBaseTemplateListView.IViewDelegate bVar = this.f30916b;
        if (bVar != null) {
            bVar.mo44157e();
        }
    }

    /* renamed from: l */
    public LoadStateView.AbstractC8570b mo44197l() {
        return new C11497b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTouchEvent"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.d$d */
    public static final class C11499d implements LoadStateView.AbstractC8574f {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListView f30929a;

        C11499d(BaseTemplateListView dVar) {
            this.f30929a = dVar;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
        public final void onTouchEvent() {
            IBaseTemplateListView.IViewDelegate bVar = this.f30929a.f30916b;
            if (bVar != null) {
                bVar.mo44160h();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final CategoryIndicatorAdapter mo44185b() {
        CategoryIndicatorAdapter bVar = this.f30917c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final CategoryTabAdapter mo44188c() {
        CategoryTabAdapter cVar = this.f30918d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
        }
        return cVar;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m47794s();
        m47795t();
        m47796u();
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: i */
    public void mo44194i() {
        C8594b bVar = this.f30919f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33503a();
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: k */
    public void mo44196k() {
        C13479a.m54764b("BaseTemplateListView", "hideCreateLoading()...");
        C4878c cVar = this.f30921h;
        if (cVar != null) {
            cVar.mo19130b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.d$f */
    static final class C11501f extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BaseTemplateListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11501f(BaseTemplateListView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.mo44198m()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: j */
    public void mo44195j() {
        C13479a.m54764b("BaseTemplateListView", "showCreateLoading()...");
        if (this.f30921h == null) {
            C4878c cVar = new C4878c(this.f30925l);
            this.f30921h = cVar;
            if (cVar != null) {
                cVar.mo19131b(R.string.Doc_List_TemplateClickLoadingToast);
            }
        }
        C4878c cVar2 = this.f30921h;
        if (cVar2 != null) {
            cVar2.mo19132c();
        }
    }

    /* renamed from: s */
    private final void m47794s() {
        C8594b bVar = new C8594b((LoadStateView) this.f30927n.findViewById(R.id.loadStateView), Looper.getMainLooper());
        this.f30919f = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33512a(false, mo44204o(), LoadingCategory.CATEGORY_TEMPLATE);
        C8594b bVar2 = this.f30919f;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33509a(new C11499d(this));
        C8594b bVar3 = this.f30919f;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar3.mo33508a(mo44197l());
    }

    /* renamed from: t */
    private final void m47795t() {
        this.f30917c = new CategoryIndicatorAdapter();
        RecyclerView recyclerView = (RecyclerView) this.f30927n.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.categoryIndicator");
        CategoryIndicatorAdapter bVar = this.f30917c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
        }
        recyclerView.setAdapter(bVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f30927n.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.categoryIndicator");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f30925l, 0, false));
        CategoryIndicatorAdapter bVar2 = this.f30917c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
        }
        bVar2.mo70668a((BaseQuickAdapter.AbstractC20911a) new C11498c(this));
        RecyclerView recyclerView3 = (RecyclerView) this.f30927n.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rootView.categoryIndicator");
        recyclerView3.setVisibility(8);
        View findViewById = this.f30927n.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.divider");
        findViewById.setVisibility(8);
    }

    /* renamed from: u */
    private final void m47796u() {
        this.f30918d = new CategoryTabAdapter(this.f30926m, this, null, mo44205p(), 4, null);
        RecyclerView recyclerView = (RecyclerView) this.f30927n.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
        CategoryTabAdapter cVar = this.f30918d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f30927n.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.templateGroupList");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f30925l, 1, false));
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f30927n.findViewById(R.id.refreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.refreshLayout");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(this.f30925l));
        ((SmartRefreshLayout) this.f30927n.findViewById(R.id.refreshLayout)).mo96368b(new C11500e(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44178a(int i) {
        this.f30920g = i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.d$e */
    public static final class C11500e implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListView f30930a;

        C11500e(BaseTemplateListView dVar) {
            this.f30930a = dVar;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            IBaseTemplateListView.IViewDelegate bVar = this.f30930a.f30916b;
            if (bVar != null) {
                bVar.mo44158f();
            }
        }
    }

    /* renamed from: a */
    private final void m47792a(List<Category> list) {
        for (Category category : list) {
            if (category.getHasMore()) {
                mo44184a(true);
                return;
            }
        }
        mo44184a(false);
    }

    /* renamed from: b */
    private final boolean m47793b(CategoryTab categoryTab) {
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
        IBaseTemplateListView.IViewDelegate bVar = this.f30916b;
        if (bVar != null) {
            bVar.mo44148a(templateV4);
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: a */
    public void mo44179a(CategoryTab categoryTab) {
        Intrinsics.checkParameterIsNotNull(categoryTab, "categoryTab");
        this.f30922i = categoryTab;
        if (!m47793b(categoryTab) || categoryTab.getCategoryList().size() > 1) {
            C8594b bVar = this.f30919f;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar.mo33513b();
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f30927n.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout, "rootView.content");
            coordinatorLayout.setVisibility(0);
            CategoryTabAdapter cVar = this.f30918d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
            }
            cVar.mo70690f(categoryTab.getCategoryList());
        } else {
            C13479a.m54764b("BaseTemplateListView", "showSingleCategoryTab().. isEmpty");
            CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) this.f30927n.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout2, "rootView.content");
            coordinatorLayout2.setVisibility(8);
            C8594b bVar2 = this.f30919f;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar2.mo33506a(EmptyCategory.f23254r);
            C8594b bVar3 = this.f30919f;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar3.mo33515c();
        }
        m47792a(categoryTab.getCategoryList());
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: b */
    public void mo44186b(int i) {
        if (i >= 0) {
            CategoryIndicatorAdapter bVar = this.f30917c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
            }
            if (i < bVar.getItemCount()) {
                CategoryIndicatorAdapter bVar2 = this.f30917c;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
                }
                Object obj = bVar2.mo70673b().get(i);
                if (obj != null) {
                    CategoryTab categoryTab = (CategoryTab) obj;
                    CategoryIndicatorAdapter bVar3 = this.f30917c;
                    if (bVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
                    }
                    bVar3.mo33373b(i);
                    ((RecyclerView) this.f30927n.findViewById(R.id.categoryIndicator)).scrollToPosition(i);
                    mo44179a(categoryTab);
                    IBaseTemplateListView.IViewDelegate bVar4 = this.f30916b;
                    if (bVar4 != null) {
                        bVar4.mo44151a(categoryTab);
                    }
                    this.f30920g = i;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.templates.center.list.CategoryTab");
            }
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: a */
    public void mo44180a(TemplateGroupTab templateGroupTab) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(templateGroupTab, "templateGroupTab");
        ArrayList<CategoryTab> categoryTabList = templateGroupTab.getCategoryTabList();
        int i = 0;
        this.f30923j = false;
        Iterator<CategoryTab> it = categoryTabList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            if (it.next().getCategoryTabName().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f30923j = true;
            }
        }
        if (!this.f30923j || !templateGroupTab.getHasData()) {
            z = false;
        }
        this.f30923j = z;
        RecyclerView recyclerView = (RecyclerView) this.f30927n.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.categoryIndicator");
        if (!this.f30923j) {
            i = 8;
        }
        recyclerView.setVisibility(i);
        View findViewById = this.f30927n.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.divider");
        findViewById.setVisibility(8);
        CategoryIndicatorAdapter bVar = this.f30917c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryIndicatorAdapter");
        }
        bVar.mo70690f(categoryTabList);
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: b */
    public void mo44187b(TemplateGroupTab templateGroupTab) {
        CategoryTab categoryTab;
        EmptyCategory emptyCategory;
        Intrinsics.checkParameterIsNotNull(templateGroupTab, "templateGroupTab");
        ArrayList<CategoryTab> categoryTabList = templateGroupTab.getCategoryTabList();
        if (categoryTabList.isEmpty()) {
            C13479a.m54764b("BaseTemplateListView", "showCategoryTab().. isEmpty");
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f30927n.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout, "rootView.content");
            coordinatorLayout.setVisibility(8);
            if (mo44206q()) {
                emptyCategory = mo44204o();
            } else {
                emptyCategory = EmptyCategory.f23251o;
            }
            if (mo44206q()) {
                mo44191f().hideFilter(mo44207r());
            } else {
                mo44191f().showFilter(mo44207r());
            }
            C8594b bVar = this.f30919f;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar.mo33506a(emptyCategory);
            C8594b bVar2 = this.f30919f;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar2.mo33515c();
            return;
        }
        mo44191f().showFilter(mo44207r());
        if (this.f30920g >= categoryTabList.size()) {
            categoryTab = categoryTabList.get(0);
        } else {
            categoryTab = categoryTabList.get(this.f30920g);
        }
        Intrinsics.checkExpressionValueIsNotNull(categoryTab, "if (currentIndicatorPos …ntIndicatorPos]\n        }");
        mo44179a(categoryTab);
    }

    /* renamed from: a */
    public void setViewDelegate(IBaseTemplateListView.IViewDelegate bVar) {
        this.f30916b = bVar;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: a */
    public void mo44182a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        C8594b bVar = this.f30919f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33507a(LoadFailCategory.CATEGORY_TEMPLATE_FAILED);
        RecyclerView recyclerView = (RecyclerView) this.f30927n.findViewById(R.id.categoryIndicator);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.categoryIndicator");
        recyclerView.setVisibility(8);
        View findViewById = this.f30927n.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.divider");
        findViewById.setVisibility(8);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f30927n.findViewById(R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout, "rootView.content");
        coordinatorLayout.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43997a(int i, TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        IBaseTemplateListView.IViewDelegate bVar = this.f30916b;
        if (bVar != null) {
            bVar.mo44154b(templateV4);
        }
    }

    public BaseTemplateListView(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, View view) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f30925l = fragmentActivity;
        this.f30926m = lifecycleOwner;
        this.f30927n = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u000128\u0010\u0002\u001a4\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "kotlin.jvm.PlatformType", "Lcom/chad/library/adapter/base/BaseViewHolder;", "<anonymous parameter 1>", "Landroid/view/View;", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.d$c */
    public static final class C11498c implements BaseQuickAdapter.AbstractC20911a {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListView f30928a;

        C11498c(BaseTemplateListView dVar) {
            this.f30928a = dVar;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
        public final void onItemClick(BaseQuickAdapter<Object, C20923c> baseQuickAdapter, View view, int i) {
            this.f30928a.mo44191f().getCategoryIndex().mo5929b(Integer.valueOf(i));
            Intrinsics.checkExpressionValueIsNotNull(baseQuickAdapter, "adapter");
            Object obj = baseQuickAdapter.mo70673b().get(i);
            if (obj != null) {
                CategoryTab categoryTab = (CategoryTab) obj;
                this.f30928a.mo44185b().mo33373b(i);
                this.f30928a.mo44179a(categoryTab);
                IBaseTemplateListView.IViewDelegate bVar = this.f30928a.f30916b;
                if (bVar != null) {
                    bVar.mo44151a(categoryTab);
                }
                this.f30928a.mo44178a(i);
                ((RecyclerView) this.f30928a.mo44199n().findViewById(R.id.templateGroupList)).scrollToPosition(0);
                TemplateReportV2.f31015b.mo44250c(categoryTab.getCategoryTabName().toString());
                TemplateReportV2.f31015b.mo44258f(TemplateReportV2.f31015b.mo44245b());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.templates.center.list.CategoryTab");
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: a */
    public void mo44183a(ArrayList<CategoryTab> arrayList, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "categoryTabList");
        CategoryTabAdapter cVar = this.f30918d;
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
                        if (Intrinsics.areEqual(category.getName(), category2.getName()) && (!category2.getTemplates().isEmpty())) {
                            category.getTemplates().addAll(category2.getTemplates());
                            category.setHasMore(category2.getHasMore());
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                CategoryTabAdapter cVar2 = this.f30918d;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
                }
                cVar2.notifyDataSetChanged();
            }
        }
    }
}
