package com.bytedance.ee.bear.templates.center;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.MainViewPager;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.homepage.widget.CompatDrawableTextView;
import com.bytedance.ee.bear.list.sort.C8777j;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.center.C11455b;
import com.bytedance.ee.bear.templates.center.TemplateCenterContract;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020$H\u0002J\u0018\u00100\u001a\u00020$2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0019H\u0016J\b\u00104\u001a\u00020$H\u0002J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0002J\u0012\u0010;\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterView;", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterContract$IView;", "Lcom/bytedance/ee/bear/templates/center/TabIndicatorAdapter$TabSelectedListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "rootView", "Landroid/view/View;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/FragmentManager;Landroid/view/View;)V", "connectServiceContext", "Lcom/bytedance/ee/bear/contract/ConnectionService;", "getConnectServiceContext", "()Lcom/bytedance/ee/bear/contract/ConnectionService;", "connectServiceContext$delegate", "Lkotlin/Lazy;", "filterView", "Lcom/bytedance/ee/bear/list/homepage/widget/CompatDrawableTextView;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "tab2s", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "tabIndicatorAdapter", "Lcom/bytedance/ee/bear/templates/center/TabIndicatorAdapter;", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "viewDelegate", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterContract$IView$IViewDelegate;", "create", "", "destroy", "initFilterView", "initIndicator", "initLastTab", "initSearchView", "initTitleBar", "initView", "initViewPager", "isConnected", "", "onFilterClick", "onTabSelected", "index", "", "tab", "resetFilterView", "setFilterStatus", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "setFilterViewDesc", "desc", "", "setViewDelegate", "updateFilterVisible", "visible", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.g */
public final class TemplateCenterView implements C11455b.AbstractC11458a, TemplateCenterContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30831a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterView.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterView.class), "connectServiceContext", "getConnectServiceContext()Lcom/bytedance/ee/bear/contract/ConnectionService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterView.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: b */
    public TemplateCenterContract.IView.IViewDelegate f30832b;

    /* renamed from: c */
    public final FragmentActivity f30833c;

    /* renamed from: d */
    private CompatDrawableTextView f30834d;

    /* renamed from: e */
    private final Lazy f30835e = LazyKt.lazy(C11471f.INSTANCE);

    /* renamed from: f */
    private final Lazy f30836f = LazyKt.lazy(C11466a.INSTANCE);

    /* renamed from: g */
    private final Lazy f30837g = LazyKt.lazy(new C11472g(this));

    /* renamed from: h */
    private final ArrayList<Tab2> f30838h = new ArrayList<>();

    /* renamed from: i */
    private C11455b f30839i;

    /* renamed from: j */
    private final FragmentManager f30840j;

    /* renamed from: k */
    private final View f30841k;

    /* renamed from: b */
    private final ConnectionService m47705b() {
        Lazy lazy = this.f30836f;
        KProperty kProperty = f30831a[1];
        return (ConnectionService) lazy.getValue();
    }

    /* renamed from: c */
    private final TemplateCenterViewModel m47706c() {
        Lazy lazy = this.f30837g;
        KProperty kProperty = f30831a[2];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m47707d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/ConnectionService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.g$a */
    static final class C11466a extends Lambda implements Function0<ConnectionService> {
        public static final C11466a INSTANCE = new C11466a();

        C11466a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConnectionService invoke() {
            return C5084ad.m20847d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.g$f */
    static final class C11471f extends Lambda implements Function0<C10917c> {
        public static final C11471f INSTANCE = new C11471f();

        C11471f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.g$g */
    static final class C11472g extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ TemplateCenterView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11472g(TemplateCenterView gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.f30833c).mo6005a(TemplateCenterViewModel.class);
        }
    }

    /* renamed from: e */
    private final void m47708e() {
        HashMap hashMap = new HashMap();
        hashMap.put("module", "template");
        ((BaseTitleBar) this.f30841k.findViewById(R.id.titleBar)).setTag(R.id.title_bar_common_params, hashMap);
    }

    /* renamed from: h */
    private final boolean m47711h() {
        ConnectionService.NetworkState b = m47705b().mo20038b();
        if (b != null) {
            return b.mo20041b();
        }
        return false;
    }

    /* renamed from: l */
    private final void m47715l() {
        C11455b bVar = this.f30839i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabIndicatorAdapter");
        }
        bVar.mo44010a(TemplateCenterViewModel.Companion.mo44061a());
    }

    /* renamed from: d */
    private final void m47707d() {
        m47708e();
        m47709f();
        m47710g();
        m47713j();
        m47714k();
        m47715l();
        TemplateReportV2.f31015b.mo44236a(TemplateCenterViewModel.Companion.mo44061a(), m47706c().getEnterSource());
    }

    /* renamed from: f */
    private final void m47709f() {
        Drawable a = C13747j.m55724a(this.f30841k.getContext(), (int) R.drawable.ud_icon_search_outlined, (int) R.color.facade_selector_icon_n1);
        ((BaseTitleBar) this.f30841k.findViewById(R.id.titleBar)).mo45070a(new C11470e(this, a, a));
    }

    /* renamed from: i */
    private final void m47712i() {
        int a = C13749l.m55738a(22);
        CompatDrawableTextView compatDrawableTextView = this.f30834d;
        if (compatDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        ViewGroup.LayoutParams layoutParams = compatDrawableTextView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = a;
            layoutParams2.width = a;
            CompatDrawableTextView compatDrawableTextView2 = this.f30834d;
            if (compatDrawableTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView2.setLayoutParams(layoutParams2);
            Drawable drawable = this.f30833c.getDrawable(R.drawable.ud_icon_filter_outlined);
            CompatDrawableTextView compatDrawableTextView3 = this.f30834d;
            if (compatDrawableTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView3.setBackgroundDrawable(drawable);
            CompatDrawableTextView compatDrawableTextView4 = this.f30834d;
            if (compatDrawableTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            C13747j.m55726a(compatDrawableTextView4, (int) R.color.facade_selector_icon_n1);
            CompatDrawableTextView compatDrawableTextView5 = this.f30834d;
            if (compatDrawableTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView5.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            CompatDrawableTextView compatDrawableTextView6 = this.f30834d;
            if (compatDrawableTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView6.setText("");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: j */
    private final void m47713j() {
        C69619a aVar = new C69619a(this.f30833c);
        this.f30838h.add(Tab2.SYSTEM);
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_optimization_v4_custom", false)) {
            this.f30838h.add(Tab2.CUSTOM);
        }
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_optimization_v4_business", false)) {
            this.f30838h.add(Tab2.BUSNISS);
        }
        C11455b bVar = new C11455b(this.f30833c, (MagicIndicator) this.f30841k.findViewById(R.id.groupIndicator), this.f30838h, this);
        this.f30839i = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabIndicatorAdapter");
        }
        aVar.setAdapter(bVar);
        aVar.setAdjustMode(true);
        MagicIndicator magicIndicator = (MagicIndicator) this.f30841k.findViewById(R.id.groupIndicator);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "rootView.groupIndicator");
        magicIndicator.setNavigator(aVar);
    }

    /* renamed from: k */
    private final void m47714k() {
        ((MainViewPager) this.f30841k.findViewById(R.id.viewPager)).setCanScroll(false);
        MainViewPager mainViewPager = (MainViewPager) this.f30841k.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "rootView.viewPager");
        mainViewPager.setAdapter(new TabAdapter(this.f30833c, this.f30840j, this.f30838h));
        MainViewPager mainViewPager2 = (MainViewPager) this.f30841k.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager2, "rootView.viewPager");
        mainViewPager2.setOffscreenPageLimit(this.f30838h.size());
    }

    /* renamed from: a */
    public final void mo44020a() {
        if (m47711h()) {
            Bundle bundle = new Bundle();
            bundle.putString("key_module", "home");
            bundle.putString("key_token", "template_v4");
            bundle.putBoolean("key_sort_asc_enable", false);
            bundle.putInt("key_default_type_pos", m47706c().getCurrentTabFilterIndex());
            bundle.putBoolean("key_reset_enable", false);
            bundle.putBoolean("key_sort_filter_enable", false);
            C8140a.m32491a(this.f30833c, C8777j.class, bundle);
            return;
        }
        Toast.showFailureText(this.f30833c, (int) R.string.Doc_Facade_Offline);
    }

    /* renamed from: g */
    private final void m47710g() {
        int a = C13749l.m55738a(8);
        int a2 = C13749l.m55738a(16);
        int a3 = C13749l.m55738a(22);
        CompatDrawableTextView compatDrawableTextView = new CompatDrawableTextView(this.f30833c);
        this.f30834d = compatDrawableTextView;
        if (compatDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a3, a3);
        layoutParams.leftMargin = a;
        layoutParams.rightMargin = a2;
        Drawable drawable = this.f30833c.getDrawable(R.drawable.ud_icon_filter_outlined);
        CompatDrawableTextView compatDrawableTextView2 = this.f30834d;
        if (compatDrawableTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView2.setBackgroundDrawable(drawable);
        CompatDrawableTextView compatDrawableTextView3 = this.f30834d;
        if (compatDrawableTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView3.setPadding(a, 0, a, 0);
        CompatDrawableTextView compatDrawableTextView4 = this.f30834d;
        if (compatDrawableTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView4.setTextColor(this.f30833c.getResources().getColor(R.color.primary_pri_500));
        CompatDrawableTextView compatDrawableTextView5 = this.f30834d;
        if (compatDrawableTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView5.setGravity(16);
        CompatDrawableTextView compatDrawableTextView6 = this.f30834d;
        if (compatDrawableTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        compatDrawableTextView6.setOnClickListener(new C11467b(this, LocationRequest.PRIORITY_INDOOR));
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f30841k.findViewById(R.id.titleBar);
        CompatDrawableTextView compatDrawableTextView7 = this.f30834d;
        if (compatDrawableTextView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        baseTitleBar.mo45088c(compatDrawableTextView7, layoutParams);
        AbstractC1142af a4 = aj.m5366a(this.f30833c).mo6005a(C8786n.class);
        Intrinsics.checkExpressionValueIsNotNull(a4, "ViewModelProviders.of(ac…terViewModel::class.java)");
        ((C8786n) a4).getSortStrategyLiveData().mo5923a(this.f30833c, new C11468c(this));
        m47706c().getCurrentTabFilterStatus().mo5923a(this.f30833c, new C11469d(this));
    }

    /* renamed from: a */
    public void setViewDelegate(TemplateCenterContract.IView.IViewDelegate aVar) {
        this.f30832b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/center/TemplateCenterView$initFilterView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.g$b */
    public static final class C11467b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ TemplateCenterView f30842a;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f30842a.mo44020a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11467b(TemplateCenterView gVar, int i) {
            super(i);
            this.f30842a = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.g$d */
    public static final class C11469d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TemplateCenterView f30844a;

        C11469d(TemplateCenterView gVar) {
            this.f30844a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            boolean z;
            TemplateCenterView gVar = this.f30844a;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            gVar.mo44023a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/center/TemplateCenterView$initSearchView$1", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.g$e */
    public static final class C11470e extends BaseTitleBar.C11803d {

        /* renamed from: a */
        final /* synthetic */ TemplateCenterView f30845a;

        /* renamed from: b */
        final /* synthetic */ Drawable f30846b;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            super.mo16854a(view);
            TemplateCenterContract.IView.IViewDelegate aVar = this.f30845a.f30832b;
            if (aVar != null) {
                aVar.mo44012a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11470e(TemplateCenterView gVar, Drawable drawable, Drawable drawable2) {
            super(drawable2);
            this.f30845a = gVar;
            this.f30846b = drawable;
        }
    }

    /* renamed from: a */
    public final void mo44023a(boolean z) {
        int i;
        CompatDrawableTextView compatDrawableTextView = this.f30834d;
        if (compatDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        compatDrawableTextView.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "folderSortStrategy", "Lcom/bytedance/ee/bear/list/cache/FolderSortStrategy;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.g$c */
    public static final class C11468c<T> implements AbstractC1178x<FolderSortStrategy> {

        /* renamed from: a */
        final /* synthetic */ TemplateCenterView f30843a;

        C11468c(TemplateCenterView gVar) {
            this.f30843a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(FolderSortStrategy folderSortStrategy) {
            Intrinsics.checkParameterIsNotNull(folderSortStrategy, "folderSortStrategy");
            if (Intrinsics.areEqual(folderSortStrategy.mo31545a(), "template_v4")) {
                C8275a b = C8275a.m34052b(folderSortStrategy.mo31554d());
                TemplateCenterView gVar = this.f30843a;
                Intrinsics.checkExpressionValueIsNotNull(b, "documentType");
                gVar.mo44021a(b);
            }
        }
    }

    /* renamed from: a */
    public final void mo44021a(C8275a aVar) {
        m47706c().saveCurrentTabFilter(aVar);
        if (Intrinsics.areEqual(aVar, C8275a.f22369b)) {
            m47712i();
            return;
        }
        String a = C8292f.m34129a(this.f30833c, aVar.mo32555b());
        Intrinsics.checkExpressionValueIsNotNull(a, "DocumentUtils.getTypeName(activity, type.value)");
        m47704a(a);
    }

    /* renamed from: a */
    private final void m47704a(String str) {
        CompatDrawableTextView compatDrawableTextView = this.f30834d;
        if (compatDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterView");
        }
        ViewGroup.LayoutParams layoutParams = compatDrawableTextView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = C13749l.m55738a(24);
            layoutParams2.width = -2;
            CompatDrawableTextView compatDrawableTextView2 = this.f30834d;
            if (compatDrawableTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView2.setLayoutParams(layoutParams2);
            CompatDrawableTextView compatDrawableTextView3 = this.f30834d;
            if (compatDrawableTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView3.setBackgroundResource(R.drawable.list_filter_menu_bg_blue);
            CompatDrawableTextView compatDrawableTextView4 = this.f30834d;
            if (compatDrawableTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            C13747j.m55726a(compatDrawableTextView4, (int) R.color.primary_pri_100);
            CompatDrawableTextView compatDrawableTextView5 = this.f30834d;
            if (compatDrawableTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView5.setCompoundDrawablePadding(C13749l.m55738a(3));
            Drawable a = C13747j.m55724a(this.f30833c, (int) R.drawable.list_filter_icon_white, (int) R.color.primary_pri_500);
            CompatDrawableTextView compatDrawableTextView6 = this.f30834d;
            if (compatDrawableTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView6.setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
            CompatDrawableTextView compatDrawableTextView7 = this.f30834d;
            if (compatDrawableTextView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterView");
            }
            compatDrawableTextView7.setText(str);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // com.bytedance.ee.bear.templates.center.C11455b.AbstractC11458a
    /* renamed from: a */
    public void mo44011a(int i, Tab2 tab2) {
        Intrinsics.checkParameterIsNotNull(tab2, "tab");
        m47706c().setCurrentTab(tab2);
        TemplateCenterContract.IView.IViewDelegate aVar = this.f30832b;
        if (aVar != null) {
            aVar.mo44013a(i, tab2);
        }
        MainViewPager mainViewPager = (MainViewPager) this.f30841k.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "rootView.viewPager");
        mainViewPager.setCurrentItem(i);
        mo44023a(m47706c().getCurrentTabFilterStatusValue());
        mo44021a(m47706c().getCurrentTabFilter());
        TemplateCenterViewModel.Companion.mo44062a(i);
    }

    public TemplateCenterView(FragmentActivity fragmentActivity, FragmentManager fragmentManager, View view) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f30833c = fragmentActivity;
        this.f30840j = fragmentManager;
        this.f30841k = view;
    }
}
