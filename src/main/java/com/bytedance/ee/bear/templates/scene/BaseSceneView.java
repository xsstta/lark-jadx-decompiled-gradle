package com.bytedance.ee.bear.templates.scene;

import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadFailCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.loadstateview.LoadingCategory;
import com.bytedance.ee.bear.templates.TemplateAdapter;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.CategoryTabAdapter;
import com.bytedance.ee.bear.templates.scene.ISceneView;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020%2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u00105\u001a\u00020%2\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020%H\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8DX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/BaseSceneView;", "Lcom/bytedance/ee/bear/templates/scene/ISceneView;", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", "topicId", "", "(Landroidx/fragment/app/FragmentActivity;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;Ljava/lang/String;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "categoryTabAdapter", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "getCategoryTabAdapter", "()Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "setCategoryTabAdapter", "(Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "loadStateViewDispatcher", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateViewDispatcher;", "getRootView", "()Landroid/view/View;", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "Lkotlin/Lazy;", "getTopicId", "()Ljava/lang/String;", "viewDelegate", "Lcom/bytedance/ee/bear/templates/scene/ISceneView$IViewDelegate;", "create", "", "destroy", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "initLoadStateView", "initTempGroup", "isCategoryTabEmpty", "", "categoryTab", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "onTemplateClicked", "position", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "setViewDelegate", "showData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/templates/scene/TopicDataResult;", "showDataLoading", "showLoadingFailed", "throwable", "", "showSingleCategoryTab", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.scene.c */
public final class BaseSceneView implements TemplateAdapter.TemplateClickListener, ISceneView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31274a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseSceneView.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: d */
    public static final Companion f31275d = new Companion(null);

    /* renamed from: b */
    public ISceneView.IViewDelegate f31276b;

    /* renamed from: c */
    protected CategoryTabAdapter f31277c;

    /* renamed from: e */
    private C8594b f31278e;

    /* renamed from: f */
    private final Lazy f31279f = LazyKt.lazy(new C11615d(this));

    /* renamed from: g */
    private final FragmentActivity f31280g;

    /* renamed from: h */
    private final LifecycleOwner f31281h;

    /* renamed from: i */
    private final View f31282i;

    /* renamed from: j */
    private final String f31283j;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final TemplateCenterViewModel mo44602c() {
        Lazy lazy = this.f31279f;
        KProperty kProperty = f31274a[0];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    @Override // com.bytedance.ee.bear.templates.scene.ISceneView
    /* renamed from: d */
    public void mo44603d() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/BaseSceneView$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.c$a */
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

    /* renamed from: e */
    public final FragmentActivity mo44604e() {
        return this.f31280g;
    }

    /* renamed from: f */
    public final LifecycleOwner mo44605f() {
        return this.f31281h;
    }

    /* renamed from: b */
    public EmptyCategory mo44601b() {
        EmptyCategory emptyCategory = EmptyCategory.f23251o;
        Intrinsics.checkExpressionValueIsNotNull(emptyCategory, "EmptyCategory.EMPTY_CATEGORY_TEMPLATE_SYSTEM");
        return emptyCategory;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTouchEvent"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.c$c */
    public static final class C11614c implements LoadStateView.AbstractC8574f {

        /* renamed from: a */
        final /* synthetic */ BaseSceneView f31285a;

        C11614c(BaseSceneView cVar) {
            this.f31285a = cVar;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
        public final void onTouchEvent() {
            ISceneView.IViewDelegate aVar = this.f31285a.f31276b;
            if (aVar != null) {
                aVar.mo44592b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.c$d */
    static final class C11615d extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BaseSceneView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11615d(BaseSceneView cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            LifecycleOwner f = this.this$0.mo44605f();
            if (f != null) {
                return (TemplateCenterViewModel) aj.m5364a((Fragment) f).mo6005a(TemplateCenterViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }
    }

    /* renamed from: g */
    private final void m48233g() {
        C8594b bVar = new C8594b((LoadStateView) this.f31282i.findViewById(R.id.loadStateView), Looper.getMainLooper());
        this.f31278e = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33512a(false, mo44601b(), LoadingCategory.CATEGORY_TEMPLATE);
        C8594b bVar2 = this.f31278e;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33509a(new C11614c(this));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m48233g();
        m48234h();
        ISceneView.IViewDelegate aVar = this.f31276b;
        if (aVar != null) {
            aVar.mo44591a(this.f31283j);
        }
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f31282i.findViewById(R.id.titleBar);
        Intrinsics.checkExpressionValueIsNotNull(baseTitleBar, "rootView.titleBar");
        baseTitleBar.getLeftImage().setOnClickListener(new View$OnClickListenerC11613b(this));
    }

    /* renamed from: h */
    private final void m48234h() {
        this.f31277c = new CategoryTabAdapter(this.f31281h, this, "ccm_template_banner_view_click", 0, 8, null);
        RecyclerView recyclerView = (RecyclerView) this.f31282i.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
        CategoryTabAdapter cVar = this.f31277c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f31282i.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.templateGroupList");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f31280g, 1, false));
    }

    /* renamed from: a */
    public void setViewDelegate(ISceneView.IViewDelegate aVar) {
        this.f31276b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.c$b */
    static final class View$OnClickListenerC11613b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSceneView f31284a;

        View$OnClickListenerC11613b(BaseSceneView cVar) {
            this.f31284a = cVar;
        }

        public final void onClick(View view) {
            this.f31284a.mo44604e().getSupportFragmentManager().popBackStack();
        }
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43998a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        TemplateAdapter.TemplateClickListener.C11450a.m47659a(this, templateV4);
    }

    /* renamed from: b */
    private final boolean m48232b(CategoryTab categoryTab) {
        for (Category category : categoryTab.getCategoryList()) {
            if (!category.getTemplates().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.templates.scene.ISceneView
    /* renamed from: a */
    public void mo44600a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        C8594b bVar = this.f31278e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33507a(LoadFailCategory.CATEGORY_TEMPLATE_FAILED);
        View findViewById = this.f31282i.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.divider");
        findViewById.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f31282i.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
        recyclerView.setVisibility(8);
    }

    /* renamed from: a */
    private final void m48231a(CategoryTab categoryTab) {
        if (!m48232b(categoryTab) || categoryTab.getCategoryList().size() > 1) {
            C8594b bVar = this.f31278e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar.mo33513b();
            RecyclerView recyclerView = (RecyclerView) this.f31282i.findViewById(R.id.templateGroupList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
            recyclerView.setVisibility(0);
            CategoryTabAdapter cVar = this.f31277c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
            }
            cVar.mo70690f(categoryTab.getCategoryList());
            return;
        }
        C13479a.m54764b("BaseTopicView", "showSingleCategoryTab().. isEmpty");
        RecyclerView recyclerView2 = (RecyclerView) this.f31282i.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.templateGroupList");
        recyclerView2.setVisibility(8);
        C8594b bVar2 = this.f31278e;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33515c();
    }

    @Override // com.bytedance.ee.bear.templates.scene.ISceneView
    /* renamed from: a */
    public void mo44598a(TopicDataResult topicDataResult) {
        Intrinsics.checkParameterIsNotNull(topicDataResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        List<TemplateV4> templates = ((TopicData) topicDataResult.data).getTemplates();
        if (templates == null) {
            Intrinsics.throwNpe();
        }
        Category category = new Category(null, false, templates, 0, false, null, null, SmActions.ACTION_CALLING_ENTRY, null);
        boolean z = false;
        CategoryTab categoryTab = new CategoryTab(null, CollectionsKt.mutableListOf(category), 0, 0, 13, null);
        ((TopicData) topicDataResult.data).getTemplates();
        if (category.getTemplates().isEmpty()) {
            C13479a.m54764b("BaseTopicView", "showCategoryTab().. isEmpty");
            RecyclerView recyclerView = (RecyclerView) this.f31282i.findViewById(R.id.templateGroupList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
            recyclerView.setVisibility(8);
            mo44602c().hideFilter(Tab2.SYSTEM);
            String b = mo44602c().getSearchContent().mo5927b();
            if (b != null) {
                if (b.length() == 0) {
                    z = true;
                }
                if (z) {
                    C8594b bVar = this.f31278e;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
                    }
                    bVar.mo33513b();
                    return;
                }
            }
            C8594b bVar2 = this.f31278e;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar2.mo33515c();
            return;
        }
        mo44602c().showFilter(Tab2.SYSTEM);
        m48231a(categoryTab);
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43997a(int i, TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        ISceneView.IViewDelegate aVar = this.f31276b;
        if (aVar != null) {
            aVar.mo44590a(templateV4);
        }
    }

    public BaseSceneView(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, View view, String str) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "topicId");
        this.f31280g = fragmentActivity;
        this.f31281h = lifecycleOwner;
        this.f31282i = view;
        this.f31283j = str;
    }
}
