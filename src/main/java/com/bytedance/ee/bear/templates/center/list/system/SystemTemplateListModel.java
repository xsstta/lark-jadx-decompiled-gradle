package com.bytedance.ee.bear.templates.center.list.system;

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
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J0\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u000eH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J>\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J.\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006/"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListModel;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "systemTemplateCacheKey", "", "getSystemTemplateCacheKey", "()Ljava/lang/String;", "systemTemplateCacheKey$delegate", "buildAllRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "filterType", "", "buildBaseRequest", "path", "buildMoreRequest", "categoryId", "", "pageNumber", "buildRequest", "lastIndex", "isLoadMore", "", "enableDocx", "getCacheKey", "getFilterTypeLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", ShareHitPoint.f121868c, "cacheKey", "needCache", "loadMore", "Lio/reactivex/Flowable;", "switchDocToDocXFilterType", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.d.b */
public final class SystemTemplateListModel extends BaseTemplateListModel {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f30976c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SystemTemplateListModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SystemTemplateListModel.class), "systemTemplateCacheKey", "getSystemTemplateCacheKey()Ljava/lang/String;"))};

    /* renamed from: d */
    public static final Companion f30977d = new Companion(null);

    /* renamed from: e */
    private final Lazy f30978e = LazyKt.lazy(C11511b.INSTANCE);

    /* renamed from: f */
    private final Lazy f30979f = LazyKt.lazy(C11512c.INSTANCE);

    /* renamed from: g */
    private final FragmentActivity f30980g;

    /* renamed from: f */
    private final String m47919f() {
        Lazy lazy = this.f30979f;
        KProperty kProperty = f30976c[1];
        return (String) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListModel$Companion;", "", "()V", "SYSTEM_TEMPLATE_API_PATH_V2", "", "SYSTEM_TEMPLATE_CACHE_KEY_PREFIX", "SYSTEM_TEMPLATE_TAB_MORE_API_PATH", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.b$a */
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
        return this.f30980g;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: d */
    public String mo44202d() {
        return m47919f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.b$b */
    static final class C11511b extends Lambda implements Function0<C10917c> {
        public static final C11511b INSTANCE = new C11511b();

        C11511b() {
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
        return mo44140b().getSystemFilterLiveData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.b$c */
    static final class C11512c extends Lambda implements Function0<String> {
        public static final C11512c INSTANCE = new C11512c();

        C11512c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str;
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            if (f == null || (str = f.f14584a) == null) {
                str = "";
            }
            return "system_template_" + str.hashCode();
        }
    }

    /* renamed from: g */
    private final boolean m47920g() {
        if (!mo44140b().entryFormCreateNew() || (mo44140b().getInitFilterType() != 2 && mo44140b().getInitFilterType() != 22)) {
            return C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false);
        }
        if (mo44140b().getInitFilterType() == 22) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemTemplateListModel(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f30980g = fragmentActivity;
    }

    /* renamed from: b */
    private final NetService.C5076e m47917b(int i) {
        NetService.C5076e b = m47918b("space/api/platform/template/sys_list_v2", i);
        if (mo44140b().entryFormCreateNew()) {
            b.mo20145a("user_recommend", "1");
        }
        return b;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListModel
    /* renamed from: a */
    public boolean mo44139a(int i) {
        if (i != 2) {
            return false;
        }
        if (!mo44140b().entryFormCreateNew() || mo44140b().getInitFilterType() != 2) {
            return C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false);
        }
        return false;
    }

    /* renamed from: b */
    private final NetService.C5076e m47918b(String str, int i) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20145a("template_collection", "1");
        fVar.mo20145a("platform", "mobile");
        fVar.mo20145a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "4");
        if (i != -1) {
            fVar.mo20145a("obj_type", String.valueOf(i));
        }
        if (m47920g()) {
            fVar.mo20145a("docx_template", "1");
        }
        return fVar;
    }

    /* renamed from: a */
    private final NetService.C5076e m47916a(int i, long j, int i2) {
        NetService.C5076e b = m47918b("space/api/platform/template/category/template_list", i);
        b.mo20145a("category_id", String.valueOf(j));
        b.mo20145a("page_size", "30");
        b.mo20145a("page_number", String.valueOf(i2));
        return b;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListModel
    /* renamed from: a */
    public AbstractC68307f<TemplateGroupTab> mo44136a(String str, int i, long j, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "lastIndex");
        if (j == -1) {
            C13479a.m54758a("SystemTemplateListModel", "loadMore()...but The categoryId is DEFAULT_CATEGORY_ID, return directly");
            AbstractC68307f<TemplateGroupTab> a = AbstractC68307f.m265083a(new TemplateGroupTab(2, null, false, false, null, null, null, 0, 242, null));
            Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(TemplateGr… false, hasMore = false))");
            return a;
        }
        String str2 = mo44202d() + '-' + j + '-' + i + '-' + i2;
        AbstractC68307f<TemplateGroupTab> a2 = AbstractC68307f.m265091a(mo44137a(str2, i, j, true), mo44138a(str2, str, i, true, j, i2)).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.concat(cacheFlo…rSchedulers.mainThread())");
        return a2;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public NetService.C5076e mo44201a(String str, int i, boolean z, long j, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "lastIndex");
        if (z) {
            return m47916a(i, j, i2);
        }
        return m47917b(i);
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public NetService.AbstractC5074c<TemplateGroupTab> mo44200a(int i, int i2, String str, boolean z, boolean z2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        if (z2) {
            return new SystemTemplateMoreParser(i, str, z, j);
        }
        return new SystemTemplateParserV2(mo44141c(), i, i2, str, z, mo44140b().getEnterSource());
    }
}
