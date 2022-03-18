package com.bytedance.ee.bear.templates.center;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.center.TemplateCenterContract;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
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
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u0001\"B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u0000H\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterContract$IModel;", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterContract$IView;", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterContract$IView$IViewDelegate;", "model", "view", "context", "Landroid/content/Context;", "(Lcom/bytedance/ee/bear/templates/center/TemplateCenterContract$IModel;Lcom/bytedance/ee/bear/templates/center/TemplateCenterContract$IView;Landroid/content/Context;)V", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "analyticService$delegate", "Lkotlin/Lazy;", "localeService", "Lcom/bytedance/ee/bear/contract/LocaleService;", "getLocaleService", "()Lcom/bytedance/ee/bear/contract/LocaleService;", "localeService$delegate", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "createViewDelegate", "onSearchIconClicked", "", "onTabSelected", "index", "", "tab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.f */
public final class TemplateCenterPresenter extends BasePresenter<TemplateCenterContract.IModel, TemplateCenterContract.IView, TemplateCenterContract.IView.IViewDelegate> implements TemplateCenterContract.IView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30823a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterPresenter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterPresenter.class), "analyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterPresenter.class), "localeService", "getLocaleService()Lcom/bytedance/ee/bear/contract/LocaleService;"))};

    /* renamed from: b */
    public static final Companion f30824b = new Companion(null);

    /* renamed from: c */
    private final Lazy f30825c = LazyKt.lazy(C11465d.INSTANCE);

    /* renamed from: d */
    private final Lazy f30826d = LazyKt.lazy(C11463b.INSTANCE);

    /* renamed from: e */
    private final Lazy f30827e = LazyKt.lazy(C11464c.INSTANCE);

    /* renamed from: f */
    private final TemplateCenterContract.IModel f30828f;

    /* renamed from: g */
    private final TemplateCenterContract.IView f30829g;

    /* renamed from: h */
    private final Context f30830h;

    /* renamed from: c */
    private final AbstractC5233x m47699c() {
        Lazy lazy = this.f30826d;
        KProperty kProperty = f30823a[1];
        return (AbstractC5233x) lazy.getValue();
    }

    /* renamed from: d */
    private final ao m47700d() {
        Lazy lazy = this.f30827e;
        KProperty kProperty = f30823a[2];
        return (ao) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public TemplateCenterPresenter createViewDelegate() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterPresenter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.f$b */
    static final class C11463b extends Lambda implements Function0<AbstractC5233x> {
        public static final C11463b INSTANCE = new C11463b();

        C11463b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/LocaleService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.f$c */
    static final class C11464c extends Lambda implements Function0<ao> {
        public static final C11464c INSTANCE = new C11464c();

        C11464c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ao invoke() {
            return C4484g.m18494b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.f$d */
    static final class C11465d extends Lambda implements Function0<C10917c> {
        public static final C11465d INSTANCE = new C11465d();

        C11465d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.TemplateCenterContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo44012a() {
        C13479a.m54764b("TemplateCenterPresenter", "onSearchIconClicked");
        Context context = this.f30830h;
        if (context instanceof TemplateCenterActivity) {
            ((TemplateCenterActivity) context).mo44003a();
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.TemplateCenterContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo44013a(int i, Tab2 tab2) {
        Intrinsics.checkParameterIsNotNull(tab2, "tab");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, this.f30830h.getString(tab2.getValue()));
            jSONObject.put("lang", m47700d().mo17252c());
            m47699c().mo21080a("click_template_primary_tab", jSONObject);
            if (tab2 == Tab2.CUSTOM) {
                TemplateReportV2.f31015b.mo44254e();
                TemplateReportV2.f31015b.mo44240a("ccm_template_usercenter_view_click");
            } else if (tab2 == Tab2.BUSNISS) {
                TemplateReportV2.f31015b.mo44257f();
                TemplateReportV2.f31015b.mo44240a("ccm_template_enterprisecenter_view_click");
            } else {
                TemplateReportV2.f31015b.mo44251d();
                TemplateReportV2.f31015b.mo44240a("ccm_template_systemcenter_view_click");
            }
            TemplateReportV2.m47967a(TemplateReportV2.f31015b, i, (String) null, 2, (Object) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateCenterPresenter(TemplateCenterContract.IModel aVar, TemplateCenterContract.IView bVar, Context context) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f30828f = aVar;
        this.f30829g = bVar;
        this.f30830h = context;
    }
}
