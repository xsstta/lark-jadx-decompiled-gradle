package com.bytedance.ee.bear.templates.center.list.custom;

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
import com.bytedance.ee.log.C13479a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\nH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J>\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010*\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006/"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListModel;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "currentDataType", "", "customTemplateCacheKey", "", "getCustomTemplateCacheKey", "()Ljava/lang/String;", "customTemplateCacheKey$delegate", "Lkotlin/Lazy;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "lastIndex", "filterType", "isLoadMore", "", "categoryId", "", "pageNumber", "create", "", "destroy", "getCacheKey", "getFilterTypeLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", ShareHitPoint.f121868c, "cacheKey", "needCache", "loadMore", "Lio/reactivex/Flowable;", "setDataType", "dataType", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.c.b */
public final class CustomTemplateListModel extends BaseTemplateListModel {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f30954c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CustomTemplateListModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CustomTemplateListModel.class), "customTemplateCacheKey", "getCustomTemplateCacheKey()Ljava/lang/String;"))};

    /* renamed from: d */
    public static final Companion f30955d = new Companion(null);

    /* renamed from: e */
    private final Lazy f30956e = LazyKt.lazy(C11508c.INSTANCE);

    /* renamed from: f */
    private final Lazy f30957f = LazyKt.lazy(C11507b.INSTANCE);

    /* renamed from: g */
    private int f30958g;

    /* renamed from: h */
    private final FragmentActivity f30959h;

    /* renamed from: f */
    private final String m47887f() {
        Lazy lazy = this.f30957f;
        KProperty kProperty = f30954c[1];
        return (String) lazy.getValue();
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListModel$Companion;", "", "()V", "CUSTOM_TEMPLATE_API_PATH", "", "CUSTOM_TEMPLATE_CACHE_KEY_PREFIX", "DATA_TYPE_ALL", "", "DATA_TYPE_OWN", "DATA_TYPE_SHARE", "PAGE_COUNT", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.c.b$a */
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
        return this.f30959h;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: d */
    public String mo44202d() {
        return m47887f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.c.b$c */
    static final class C11508c extends Lambda implements Function0<C10917c> {
        public static final C11508c INSTANCE = new C11508c();

        C11508c() {
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
        return mo44140b().getCustomFilterLiveData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.c.b$b */
    static final class C11507b extends Lambda implements Function0<String> {
        public static final C11507b INSTANCE = new C11507b();

        C11507b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str;
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            if (f == null || (str = f.f14584a) == null) {
                str = "";
            }
            return "custom_template_" + str.hashCode();
        }
    }

    /* renamed from: b */
    public final void mo44214b(int i) {
        this.f30958g = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTemplateListModel(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f30959h = fragmentActivity;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListModel
    /* renamed from: a */
    public AbstractC68307f<TemplateGroupTab> mo44136a(String str, int i, long j, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "lastIndex");
        String str2 = str;
        boolean z2 = true;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str3 = "0";
            if (!Intrinsics.areEqual(str, str3)) {
                if (str2.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    str3 = str;
                }
                return BaseTemplateListModel.m47737a(this, mo44202d() + '_' + str3 + '_' + i, str, i, true, 0, 0, 48, null);
            }
        }
        C13479a.m54758a("CustomTemplateListModel", "loadMore()...but index is empty or is 0, return directly");
        AbstractC68307f<TemplateGroupTab> a = AbstractC68307f.m265083a(new TemplateGroupTab(2, null, false, false, null, null, null, 0, 242, null));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(TemplateGr… false, hasMore = false))");
        return a;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public NetService.C5076e mo44201a(String str, int i, boolean z, long j, int i2) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "lastIndex");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/custom_list/");
        if (i != -1) {
            fVar.mo20145a("obj_type", String.valueOf(i));
        }
        fVar.mo20145a("page_count", String.valueOf(24));
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str = "0";
        }
        fVar.mo20145a("share_index", str);
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
            fVar.mo20145a("docx_template", "1");
        }
        int i3 = this.f30958g;
        if (i3 != 0 && z) {
            fVar.mo20145a("data_type", String.valueOf(i3));
        }
        return fVar;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public NetService.AbstractC5074c<TemplateGroupTab> mo44200a(int i, int i2, String str, boolean z, boolean z2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        return new CustomTemplateParser(mo44141c(), i, str, z, z2, !Intrinsics.areEqual(mo44203e().mo5927b(), C8275a.f22369b));
    }
}
