package com.bytedance.ee.bear.templates.topic;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.NiceImageView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.homepage.widget.CompatDrawableTextView;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadFailCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.loadstateview.LoadingCategory;
import com.bytedance.ee.bear.list.sort.C8777j;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.templates.TemplateAdapter;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.CategoryTabAdapter;
import com.bytedance.ee.bear.templates.topic.ITopicView;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0016J\n\u00100\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020.H\u0016J\b\u00104\u001a\u00020.H\u0002J\b\u00105\u001a\u00020.H\u0002J\b\u00106\u001a\u00020.H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0018H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020.H\u0002J\u0018\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020.H\u0002J\u0010\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020\nH\u0002J\u0012\u0010I\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010J\u001a\u00020.H\u0016J\u0010\u0010K\u001a\u00020.2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010L\u001a\u00020.H\u0016J\u0010\u0010M\u001a\u00020.2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020.2\u0006\u00109\u001a\u00020\u0018H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8DX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/BaseTopicView;", "Lcom/bytedance/ee/bear/templates/topic/ITopicView;", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", "topicId", "", "(Landroidx/fragment/app/FragmentActivity;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;Ljava/lang/String;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "categoryTabAdapter", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "getCategoryTabAdapter", "()Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "setCategoryTabAdapter", "(Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;)V", "connectServiceContext", "Lcom/bytedance/ee/bear/contract/ConnectionService;", "kotlin.jvm.PlatformType", "curCategoryTab", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "filterView", "Lcom/bytedance/ee/bear/list/homepage/widget/CompatDrawableTextView;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "loadStateViewDispatcher", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateViewDispatcher;", "loadingDialog", "Lcom/bytedance/ee/bear/bizwidget/LoadingDialog;", "getRootView", "()Landroid/view/View;", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "Lkotlin/Lazy;", "getTopicId", "()Ljava/lang/String;", "viewDelegate", "Lcom/bytedance/ee/bear/templates/topic/ITopicView$IViewDelegate;", "create", "", "destroy", "getCurrentCategoryTab", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "hideCreateLoading", "initFilterView", "initLoadStateView", "initTempGroup", "isCategoryTabEmpty", "", "categoryTab", "loadBannnerIv", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/templates/topic/TopicDataResult;", "onFilterClick", "onTemplateClicked", "position", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "resetFilterView", "setFilterStatus", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "setFilterViewDesc", "desc", "setViewDelegate", "showCreateLoading", "showData", "showDataLoading", "showLoadingFailed", "throwable", "", "showSingleCategoryTab", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.topic.c */
public final class BaseTopicView implements TemplateAdapter.TemplateClickListener, ITopicView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31417a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTopicView.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: d */
    public static final Companion f31418d = new Companion(null);

    /* renamed from: b */
    public ITopicView.IViewDelegate f31419b;

    /* renamed from: c */
    protected CategoryTabAdapter f31420c;

    /* renamed from: e */
    private C8594b f31421e;

    /* renamed from: f */
    private CompatDrawableTextView f31422f;

    /* renamed from: g */
    private C4878c f31423g;

    /* renamed from: h */
    private final ConnectionService f31424h = C5084ad.m20847d();

    /* renamed from: i */
    private CategoryTab f31425i;

    /* renamed from: j */
    private final Lazy f31426j = LazyKt.lazy(new C11669g(this));

    /* renamed from: k */
    private final FragmentActivity f31427k;

    /* renamed from: l */
    private final LifecycleOwner f31428l;

    /* renamed from: m */
    private final View f31429m;

    /* renamed from: n */
    private final String f31430n;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final TemplateCenterViewModel mo44735c() {
        Lazy lazy = this.f31426j;
        KProperty kProperty = f31417a[0];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView
    /* renamed from: e */
    public void mo44737e() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/BaseTopicView$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.c$a */
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

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView
    /* renamed from: d */
    public CategoryTab mo44736d() {
        return this.f31425i;
    }

    /* renamed from: i */
    public final FragmentActivity mo44741i() {
        return this.f31427k;
    }

    /* renamed from: j */
    public final LifecycleOwner mo44742j() {
        return this.f31428l;
    }

    /* renamed from: k */
    public final View mo44743k() {
        return this.f31429m;
    }

    /* renamed from: l */
    public final String mo44744l() {
        return this.f31430n;
    }

    /* renamed from: b */
    public EmptyCategory mo44734b() {
        EmptyCategory emptyCategory = EmptyCategory.f23251o;
        Intrinsics.checkExpressionValueIsNotNull(emptyCategory, "EmptyCategory.EMPTY_CATEGORY_TEMPLATE_SYSTEM");
        return emptyCategory;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTouchEvent"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.c$e */
    public static final class C11667e implements LoadStateView.AbstractC8574f {

        /* renamed from: a */
        final /* synthetic */ BaseTopicView f31434a;

        C11667e(BaseTopicView cVar) {
            this.f31434a = cVar;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
        public final void onTouchEvent() {
            ITopicView.IViewDelegate aVar = this.f31434a.f31419b;
            if (aVar != null) {
                aVar.mo44722c();
            }
        }
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView
    /* renamed from: g */
    public void mo44739g() {
        C13479a.m54764b("BaseTopicView", "hideCreateLoading()...");
        C4878c cVar = this.f31423g;
        if (cVar != null) {
            cVar.mo19130b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.c$g */
    static final class C11669g extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BaseTopicView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11669g(BaseTopicView cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            LifecycleOwner j = this.this$0.mo44742j();
            if (j != null) {
                return (TemplateCenterViewModel) aj.m5364a((Fragment) j).mo6005a(TemplateCenterViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        FolderSortStrategy folderSortStrategy = new FolderSortStrategy();
        folderSortStrategy.mo31547a("");
        ((C8786n) aj.m5366a(this.f31427k).mo6005a(C8786n.class)).setSortStrategy(folderSortStrategy);
    }

    /* renamed from: m */
    private final void m48417m() {
        C8594b bVar = new C8594b((LoadStateView) this.f31429m.findViewById(R.id.loadStateView), Looper.getMainLooper());
        this.f31421e = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33512a(false, mo44734b(), LoadingCategory.CATEGORY_TEMPLATE);
        C8594b bVar2 = this.f31421e;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33509a(new C11667e(this));
    }

    /* renamed from: p */
    private final void m48420p() {
        CompatDrawableTextView compatDrawableTextView = this.f31422f;
        if (compatDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView.setBackgroundResource(R.drawable.ud_icon_filter_outlined);
        CompatDrawableTextView compatDrawableTextView2 = this.f31422f;
        if (compatDrawableTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        CompatDrawableTextView compatDrawableTextView3 = this.f31422f;
        if (compatDrawableTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView3.setText("");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m48417m();
        m48418n();
        m48419o();
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f31429m.findViewById(R.id.titleBar);
        Intrinsics.checkExpressionValueIsNotNull(baseTitleBar, "rootView.titleBar");
        baseTitleBar.getLeftImage().setOnClickListener(new View$OnClickListenerC11664b(this));
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView
    /* renamed from: f */
    public void mo44738f() {
        C13479a.m54764b("BaseTopicView", "showCreateLoading()...");
        if (this.f31423g == null) {
            C4878c cVar = new C4878c(this.f31427k);
            this.f31423g = cVar;
            if (cVar != null) {
                cVar.mo19131b(R.string.Doc_List_TemplateClickLoadingToast);
            }
        }
        C4878c cVar2 = this.f31423g;
        if (cVar2 != null) {
            cVar2.mo19132c();
        }
    }

    /* renamed from: n */
    private final void m48418n() {
        this.f31420c = new CategoryTabAdapter(this.f31428l, this, "ccm_template_banner_view_click", 0, 8, null);
        RecyclerView recyclerView = (RecyclerView) this.f31429m.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
        CategoryTabAdapter cVar = this.f31420c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f31429m.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.templateGroupList");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f31427k, 1, false));
    }

    /* renamed from: h */
    public final void mo44740h() {
        ConnectionService connectionService = this.f31424h;
        Intrinsics.checkExpressionValueIsNotNull(connectionService, "connectServiceContext");
        ConnectionService.NetworkState b = connectionService.mo20038b();
        if (b == null || !b.mo20041b()) {
            Toast.showFailureText(this.f31427k, (int) R.string.Doc_Facade_Offline);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_module", "home");
        bundle.putString("key_token", "template_topic");
        bundle.putBoolean("key_sort_asc_enable", false);
        bundle.putInt("key_default_type_pos", mo44735c().getCurrentTabFilterIndex());
        bundle.putBoolean("key_reset_enable", false);
        bundle.putBoolean("key_sort_filter_enable", false);
        C8140a.m32491a(this.f31427k, C8777j.class, bundle);
    }

    /* renamed from: o */
    private final void m48419o() {
        CompatDrawableTextView compatDrawableTextView = new CompatDrawableTextView(this.f31427k);
        this.f31422f = compatDrawableTextView;
        if (compatDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C13749l.m55738a(24), C13749l.m55738a(24));
        layoutParams.rightMargin = C13749l.m55738a(16);
        layoutParams.height = C13749l.m55738a(24);
        layoutParams.width = -2;
        CompatDrawableTextView compatDrawableTextView2 = this.f31422f;
        if (compatDrawableTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView2.setBackgroundResource(R.drawable.ud_icon_filter_outlined);
        CompatDrawableTextView compatDrawableTextView3 = this.f31422f;
        if (compatDrawableTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView3.setPadding(C13749l.m55738a(8), 0, C13749l.m55738a(8), 0);
        CompatDrawableTextView compatDrawableTextView4 = this.f31422f;
        if (compatDrawableTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView4.setTextColor(this.f31427k.getResources().getColor(R.color.primary_pri_500));
        CompatDrawableTextView compatDrawableTextView5 = this.f31422f;
        if (compatDrawableTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView5.setGravity(16);
        CompatDrawableTextView compatDrawableTextView6 = this.f31422f;
        if (compatDrawableTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView6.setOnClickListener(new View$OnClickListenerC11665c(this));
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f31429m.findViewById(R.id.titleBar);
        CompatDrawableTextView compatDrawableTextView7 = this.f31422f;
        if (compatDrawableTextView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        baseTitleBar.mo45088c(compatDrawableTextView7, layoutParams);
        C8275a b = ((TemplateCenterViewModel) aj.m5366a(this.f31427k).mo6005a(TemplateCenterViewModel.class)).getSystemFilterLiveData().mo5927b();
        if (b == null) {
            b = C8275a.f22369b;
        }
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
            Intrinsics.checkExpressionValueIsNotNull(b, "documentType");
            int b2 = b.mo32555b();
            C8275a aVar = C8275a.f22378k;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOCX");
            if (b2 == aVar.mo32555b()) {
                b = C8275a.f22378k;
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "documentType");
        mo44730a(b);
        ITopicView.IViewDelegate aVar2 = this.f31419b;
        if (aVar2 != null) {
            aVar2.mo44720a(this.f31430n, b.mo32555b());
        }
        AbstractC1142af a = aj.m5366a(this.f31427k).mo6005a(C8786n.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(ac…del::\n        class.java)");
        ((C8786n) a).getSortStrategyLiveData().mo5923a(this.f31428l, new C11666d(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.c$c */
    public static final class View$OnClickListenerC11665c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseTopicView f31432a;

        View$OnClickListenerC11665c(BaseTopicView cVar) {
            this.f31432a = cVar;
        }

        public final void onClick(View view) {
            this.f31432a.mo44740h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J6\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J@\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/templates/topic/BaseTopicView$loadBannnerIv$2$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "p0", "Lcom/bumptech/glide/load/engine/GlideException;", "p1", "", "p2", "Lcom/bumptech/glide/request/target/Target;", "p3", "onResourceReady", "Lcom/bumptech/glide/load/DataSource;", "p4", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.c$f */
    public static final class C11668f implements AbstractC2536f<Drawable> {

        /* renamed from: a */
        final /* synthetic */ BaseTopicView f31435a;

        C11668f(BaseTopicView cVar) {
            this.f31435a = cVar;
        }

        @Override // com.bumptech.glide.request.AbstractC2536f
        /* renamed from: a */
        public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
            NiceImageView niceImageView = (NiceImageView) this.f31435a.mo44743k().findViewById(R.id.bannerIv);
            Intrinsics.checkExpressionValueIsNotNull(niceImageView, "rootView.bannerIv");
            niceImageView.setVisibility(8);
            C13479a.m54759a("BaseTopicView", " load iv fail", glideException);
            return true;
        }

        /* renamed from: a */
        public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
            NiceImageView niceImageView = (NiceImageView) this.f31435a.mo44743k().findViewById(R.id.bannerIv);
            Intrinsics.checkExpressionValueIsNotNull(niceImageView, "rootView.bannerIv");
            niceImageView.setVisibility(0);
            ((NiceImageView) this.f31435a.mo44743k().findViewById(R.id.bannerIv)).setImageDrawable(drawable);
            return true;
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ITopicView.IViewDelegate aVar) {
        this.f31419b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.c$b */
    static final class View$OnClickListenerC11664b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseTopicView f31431a;

        View$OnClickListenerC11664b(BaseTopicView cVar) {
            this.f31431a = cVar;
        }

        public final void onClick(View view) {
            FragmentManager supportFragmentManager = this.f31431a.mo44741i().getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.popBackStack();
            }
        }
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43998a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        TemplateAdapter.TemplateClickListener.C11450a.m47659a(this, templateV4);
    }

    /* renamed from: b */
    private final boolean m48416b(CategoryTab categoryTab) {
        for (Category category : categoryTab.getCategoryList()) {
            if (!category.getTemplates().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo44730a(C8275a aVar) {
        mo44735c().saveCurrentTabFilterForTopic(aVar);
        if (Intrinsics.areEqual(aVar, C8275a.f22369b)) {
            m48420p();
            return;
        }
        String a = C8292f.m34129a(this.f31427k, aVar.mo32555b());
        Intrinsics.checkExpressionValueIsNotNull(a, "DocumentUtils.getTypeName(activity, type.value)");
        m48414a(a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "folderSortStrategy", "Lcom/bytedance/ee/bear/list/cache/FolderSortStrategy;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.c$d */
    public static final class C11666d<T> implements AbstractC1178x<FolderSortStrategy> {

        /* renamed from: a */
        final /* synthetic */ BaseTopicView f31433a;

        C11666d(BaseTopicView cVar) {
            this.f31433a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(FolderSortStrategy folderSortStrategy) {
            Intrinsics.checkParameterIsNotNull(folderSortStrategy, "folderSortStrategy");
            if (Intrinsics.areEqual(folderSortStrategy.mo31545a(), "template_topic")) {
                C8275a b = C8275a.m34052b(folderSortStrategy.mo31554d());
                if (C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "documentType");
                    int b2 = b.mo32555b();
                    C8275a aVar = C8275a.f22378k;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOCX");
                    if (b2 == aVar.mo32555b()) {
                        b = C8275a.f22378k;
                    }
                }
                BaseTopicView cVar = this.f31433a;
                Intrinsics.checkExpressionValueIsNotNull(b, "documentType");
                cVar.mo44730a(b);
                ITopicView.IViewDelegate aVar2 = this.f31433a.f31419b;
                if (aVar2 != null) {
                    aVar2.mo44720a(this.f31433a.mo44744l(), b.mo32555b());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m48413a(CategoryTab categoryTab) {
        this.f31425i = categoryTab;
        if (!m48416b(categoryTab) || categoryTab.getCategoryList().size() > 1) {
            C8594b bVar = this.f31421e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar.mo33513b();
            RecyclerView recyclerView = (RecyclerView) this.f31429m.findViewById(R.id.templateGroupList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
            recyclerView.setVisibility(0);
            CategoryTabAdapter cVar = this.f31420c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryTabAdapter");
            }
            cVar.mo70690f(categoryTab.getCategoryList());
            return;
        }
        C13479a.m54764b("BaseTopicView", "showSingleCategoryTab().. isEmpty");
        RecyclerView recyclerView2 = (RecyclerView) this.f31429m.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.templateGroupList");
        recyclerView2.setVisibility(8);
        C8594b bVar2 = this.f31421e;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33515c();
    }

    /* renamed from: b */
    private final void m48415b(TopicDataResult topicDataResult) {
        String str;
        boolean z;
        C11670f banner = ((TopicData) topicDataResult.data).getBanner();
        if (banner != null && (str = banner.f31436a) != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                str = null;
            }
            if (str != null) {
                ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f31429m.getContext()).mo10432k().mo10395a((Object) new C13664a(str)).mo10401b((AbstractC2536f<Drawable>) new C11668f(this)).mo11144c(C13655e.m55409a() - C13655e.m55411a(24), C13655e.m55411a((int) SmActions.ACTION_ONTHECALL_EXIT))).mo10399a((ImageView) ((NiceImageView) this.f31429m.findViewById(R.id.bannerIv)));
            }
        }
    }

    /* renamed from: a */
    private final void m48414a(String str) {
        CompatDrawableTextView compatDrawableTextView = this.f31422f;
        if (compatDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView.setBackgroundResource(R.drawable.list_filter_menu_bg_blue);
        CompatDrawableTextView compatDrawableTextView2 = this.f31422f;
        if (compatDrawableTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView2.setCompoundDrawablePadding(C57582a.m223600a(3));
        Drawable a = C13747j.m55724a(this.f31427k, (int) R.drawable.list_filter_icon_white, (int) R.color.primary_pri_500);
        CompatDrawableTextView compatDrawableTextView3 = this.f31422f;
        if (compatDrawableTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
        CompatDrawableTextView compatDrawableTextView4 = this.f31422f;
        if (compatDrawableTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView4.setText(str);
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView
    /* renamed from: a */
    public void mo44731a(TopicDataResult topicDataResult) {
        Intrinsics.checkParameterIsNotNull(topicDataResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m48415b(topicDataResult);
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
            RecyclerView recyclerView = (RecyclerView) this.f31429m.findViewById(R.id.templateGroupList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
            recyclerView.setVisibility(8);
            mo44735c().hideFilter(Tab2.SYSTEM);
            String b = mo44735c().getSearchContent().mo5927b();
            if (b != null) {
                if (b.length() == 0) {
                    z = true;
                }
                if (z) {
                    C8594b bVar = this.f31421e;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
                    }
                    bVar.mo33513b();
                    return;
                }
            }
            C8594b bVar2 = this.f31421e;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar2.mo33515c();
            return;
        }
        mo44735c().showFilter(Tab2.SYSTEM);
        m48413a(categoryTab);
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView
    /* renamed from: a */
    public void mo44733a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        C8594b bVar = this.f31421e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33507a(LoadFailCategory.CATEGORY_TEMPLATE_FAILED);
        View findViewById = this.f31429m.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.divider");
        findViewById.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f31429m.findViewById(R.id.templateGroupList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templateGroupList");
        recyclerView.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43997a(int i, TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        ITopicView.IViewDelegate aVar = this.f31419b;
        if (aVar != null) {
            aVar.mo44717a(templateV4);
        }
    }

    public BaseTopicView(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, View view, String str) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "topicId");
        this.f31427k = fragmentActivity;
        this.f31428l = lifecycleOwner;
        this.f31429m = view;
        this.f31430n = str;
    }
}
