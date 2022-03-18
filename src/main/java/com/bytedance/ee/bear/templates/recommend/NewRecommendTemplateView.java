package com.bytedance.ee.bear.templates.recommend;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadFailCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.loadstateview.LoadingCategory;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.LayoutType;
import com.bytedance.ee.bear.templates.TemplateAdapter;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0012\u0010 \u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J \u0010&\u001a\u00020\u001a2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateView;", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", "showTitleBg", "", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;Z)V", "adapter", "Lcom/bytedance/ee/bear/templates/TemplateAdapter;", "getContext", "()Landroid/content/Context;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "loadStateViewDispatcher", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateViewDispatcher;", "mLoadingDialog", "Lcom/bytedance/ee/bear/bizwidget/LoadingDialog;", "getRootView", "()Landroid/view/View;", "viewDelegate", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView$IViewDelegate;", "create", "", "destroy", "hideCreateLoading", "hideDataLoading", "isEmpty", "initView", "setViewDelegate", "showCreateLoading", "showDataLoading", "showLoadFailed", "throwable", "", "showTemplates", "templates", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "Lkotlin/collections/ArrayList;", "updateEnable", "enable", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.recommend.e */
public final class NewRecommendTemplateView implements NewRecommendTemplateContract.IView {

    /* renamed from: b */
    public static final Companion f31251b = new Companion(null);

    /* renamed from: a */
    public NewRecommendTemplateContract.IView.IViewDelegate f31252a;

    /* renamed from: c */
    private TemplateAdapter f31253c;

    /* renamed from: d */
    private C8594b f31254d;

    /* renamed from: e */
    private C4878c f31255e;

    /* renamed from: f */
    private final Context f31256f;

    /* renamed from: g */
    private final LifecycleOwner f31257g;

    /* renamed from: h */
    private final View f31258h;

    /* renamed from: i */
    private final boolean f31259i;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.e$b */
    public static final class View$OnClickListenerC11606b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC11606b f31260a = new View$OnClickListenerC11606b();

        View$OnClickListenerC11606b() {
        }

        public final void onClick(View view) {
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateView$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/templates/recommend/NewRecommendTemplateView$initView$3", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "onTemplateClicked", "", "position", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.e$d */
    public static final class C11608d implements TemplateAdapter.TemplateClickListener {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplateView f31262a;

        @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
        /* renamed from: a */
        public void mo43996a() {
            TemplateAdapter.TemplateClickListener.C11450a.m47658a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11608d(NewRecommendTemplateView eVar) {
            this.f31262a = eVar;
        }

        @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
        /* renamed from: a */
        public void mo43998a(TemplateV4 templateV4) {
            Intrinsics.checkParameterIsNotNull(templateV4, "template");
            TemplateAdapter.TemplateClickListener.C11450a.m47659a(this, templateV4);
        }

        @Override // com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
        /* renamed from: a */
        public void mo43997a(int i, TemplateV4 templateV4) {
            Intrinsics.checkParameterIsNotNull(templateV4, "template");
            C13479a.m54764b("NewRecommendTemplateView", "onTemplateClick()...");
            NewRecommendTemplateContract.IView.IViewDelegate aVar = this.f31262a.f31252a;
            if (aVar != null) {
                aVar.mo44552a(i, templateV4);
            }
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m48206d();
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IView
    /* renamed from: c */
    public void mo44550c() {
        C13479a.m54764b("NewRecommendTemplateView", "hideCreateLoading()...");
        C4878c cVar = this.f31255e;
        if (cVar != null) {
            cVar.mo19130b();
        }
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IView
    /* renamed from: b */
    public void mo44549b() {
        C13479a.m54764b("NewRecommendTemplateView", "showCreateLoading()...");
        if (this.f31255e == null) {
            C4878c cVar = new C4878c(this.f31256f);
            this.f31255e = cVar;
            if (cVar != null) {
                cVar.mo19131b(R.string.Doc_List_TemplateClickLoadingToast);
            }
        }
        C4878c cVar2 = this.f31255e;
        if (cVar2 != null) {
            cVar2.mo19132c();
        }
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IView
    /* renamed from: a */
    public void mo44546a() {
        C13479a.m54764b("NewRecommendTemplateView", "showDataLoading()...");
        RecyclerView recyclerView = (RecyclerView) this.f31258h.findViewById(R.id.templates);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templates");
        recyclerView.setVisibility(8);
        C8594b bVar = this.f31254d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33503a();
    }

    /* renamed from: d */
    private final void m48206d() {
        LayoutType layoutType;
        ((TextView) this.f31258h.findViewById(R.id.innerTitle)).setOnClickListener(View$OnClickListenerC11606b.f31260a);
        if (this.f31259i) {
            ((TextView) this.f31258h.findViewById(R.id.innerTitle)).setBackgroundColor(this.f31256f.getResources().getColor(R.color.bg_body_overlay));
        } else {
            ((TextView) this.f31258h.findViewById(R.id.innerTitle)).setBackgroundColor(this.f31256f.getResources().getColor(R.color.bg_body));
        }
        ((TextView) this.f31258h.findViewById(R.id.allTemplates)).setOnClickListener(new C11607c(this));
        RecyclerView recyclerView = (RecyclerView) this.f31258h.findViewById(R.id.templates);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templates");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f31256f, 0, false));
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.template_optimization_v5", false);
        C13479a.m54764b("NewRecommendTemplateView", "v5 fg = " + a);
        if (a) {
            layoutType = LayoutType.TYPE_RECOMMEND2;
        } else {
            layoutType = LayoutType.TYPE_RECOMMEND;
        }
        TemplateAdapter cVar = new TemplateAdapter(this.f31257g, layoutType, new C10917c(new C10929e()), null, 0, 24, null);
        this.f31253c = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        cVar.mo43990a(new C11608d(this));
        RecyclerView recyclerView2 = (RecyclerView) this.f31258h.findViewById(R.id.templates);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.templates");
        TemplateAdapter cVar2 = this.f31253c;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(cVar2);
        C8594b bVar = new C8594b((LoadStateView) this.f31258h.findViewById(R.id.loadStateView), Looper.getMainLooper());
        this.f31254d = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33512a(false, EmptyCategory.f23250n, LoadingCategory.CATEGORY_TEMPLATE);
    }

    /* renamed from: a */
    public void setViewDelegate(NewRecommendTemplateContract.IView.IViewDelegate aVar) {
        this.f31252a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/recommend/NewRecommendTemplateView$initView$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.e$c */
    public static final class C11607c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplateView f31261a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11607c(NewRecommendTemplateView eVar) {
            this.f31261a = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            C13479a.m54764b("NewRecommendTemplateView", "onMoreClick()...");
            NewRecommendTemplateContract.IView.IViewDelegate aVar = this.f31261a.f31252a;
            if (aVar != null) {
                aVar.mo44551a();
            }
        }
    }

    /* renamed from: a */
    private final void m48205a(boolean z) {
        C13479a.m54764b("NewRecommendTemplateView", "hideDataLoading()...");
        if (z) {
            C8594b bVar = this.f31254d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
            }
            bVar.mo33515c();
            return;
        }
        C8594b bVar2 = this.f31254d;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33513b();
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IView
    /* renamed from: a */
    public void mo44547a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        C13479a.m54758a("NewRecommendTemplateView", "showLoadFailed()...throwable = " + th);
        RecyclerView recyclerView = (RecyclerView) this.f31258h.findViewById(R.id.templates);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templates");
        recyclerView.setVisibility(8);
        C8594b bVar = this.f31254d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33507a(LoadFailCategory.CATEGORY_TEMPLATE_FAILED);
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IView
    /* renamed from: a */
    public void mo44548a(ArrayList<TemplateV4> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "templates");
        C13479a.m54764b("NewRecommendTemplateView", "showTemplates()...");
        RecyclerView recyclerView = (RecyclerView) this.f31258h.findViewById(R.id.templates);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.templates");
        recyclerView.setVisibility(0);
        TemplateAdapter cVar = this.f31253c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        cVar.mo43991a(arrayList);
        m48205a(arrayList.isEmpty());
    }

    public NewRecommendTemplateView(Context context, LifecycleOwner lifecycleOwner, View view, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f31256f = context;
        this.f31257g = lifecycleOwner;
        this.f31258h = view;
        this.f31259i = z;
    }
}
