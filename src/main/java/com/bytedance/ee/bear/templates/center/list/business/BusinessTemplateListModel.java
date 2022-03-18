package com.bytedance.ee.bear.templates.center.list.business;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListModel;
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
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J>\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/business/BusinessTemplateListModel;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "businessTemplateCacheKey", "", "getBusinessTemplateCacheKey", "()Ljava/lang/String;", "businessTemplateCacheKey$delegate", "Lkotlin/Lazy;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "lastIndex", "filterType", "", "isLoadMore", "", "categoryId", "", "pageNumber", "getCacheKey", "getFilterTypeLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", ShareHitPoint.f121868c, "cacheKey", "needCache", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.b.b */
public final class BusinessTemplateListModel extends BaseTemplateListModel {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f30937c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BusinessTemplateListModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BusinessTemplateListModel.class), "businessTemplateCacheKey", "getBusinessTemplateCacheKey()Ljava/lang/String;"))};

    /* renamed from: d */
    public static final Companion f30938d = new Companion(null);

    /* renamed from: e */
    private final Lazy f30939e = LazyKt.lazy(C11505c.INSTANCE);

    /* renamed from: f */
    private final Lazy f30940f = LazyKt.lazy(C11504b.INSTANCE);

    /* renamed from: g */
    private final FragmentActivity f30941g;

    /* renamed from: f */
    private final String m47864f() {
        Lazy lazy = this.f30940f;
        KProperty kProperty = f30937c[1];
        return (String) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/business/BusinessTemplateListModel$Companion;", "", "()V", "BUSINESS_TEMPLATE_API_PATH", "", "BUSINESS_TEMPLATE_CACHE_KEY_PREFIX", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListModel
    /* renamed from: c */
    public FragmentActivity mo44141c() {
        return this.f30941g;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: d */
    public String mo44202d() {
        return m47864f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.b.b$c */
    static final class C11505c extends Lambda implements Function0<C10917c> {
        public static final C11505c INSTANCE = new C11505c();

        C11505c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: e */
    public LiveData<C8275a> mo44203e() {
        return mo44140b().getBusinessFilterLiveData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.b.b$b */
    static final class C11504b extends Lambda implements Function0<String> {
        public static final C11504b INSTANCE = new C11504b();

        C11504b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str;
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            if (f == null || (str = f.f14584a) == null) {
                str = "";
            }
            return "business_template_" + str.hashCode();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessTemplateListModel(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f30941g = fragmentActivity;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public NetService.C5076e mo44201a(String str, int i, boolean z, long j, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "lastIndex");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/co_list/");
        if (i != -1) {
            fVar.mo20145a("obj_type", String.valueOf(i));
        }
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
            fVar.mo20145a("docx_template", "1");
        }
        return fVar;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public NetService.AbstractC5074c<TemplateGroupTab> mo44200a(int i, int i2, String str, boolean z, boolean z2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        return new BusinessTemplateParser(i, str, z);
    }
}
