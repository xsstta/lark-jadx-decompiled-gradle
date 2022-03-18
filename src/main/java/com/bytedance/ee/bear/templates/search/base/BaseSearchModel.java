package com.bytedance.ee.bear.templates.search.base;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.templates.search.base.ISearchListModel;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J&\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020!0\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BaseSearchModel;", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListModel;", "()V", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "getNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "netService$delegate", "Lkotlin/Lazy;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "offset", "", "searchKey", "", "buffer", "create", "", "createTemplate", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "module", "destroy", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "isLoadMore", "", "loadFromNet", "loadMore", "loadSearchData", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a.c */
public abstract class BaseSearchModel implements ISearchListModel {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31340a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseSearchModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseSearchModel.class), "netService", "getNetService()Lcom/bytedance/ee/bear/contract/NetService;"))};

    /* renamed from: b */
    private final Lazy f31341b = LazyKt.lazy(C11642d.INSTANCE);

    /* renamed from: c */
    private final Lazy f31342c = LazyKt.lazy(C11641c.INSTANCE);

    /* renamed from: b */
    private final C10917c mo44686b() {
        Lazy lazy = this.f31341b;
        KProperty kProperty = f31340a[0];
        return (C10917c) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final NetService mo44655a() {
        Lazy lazy = this.f31342c;
        KProperty kProperty = f31340a[1];
        return (NetService) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.c$c */
    static final class C11641c extends Lambda implements Function0<NetService> {
        public static final C11641c INSTANCE = new C11641c();

        C11641c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetService invoke() {
            return (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.c$d */
    static final class C11642d extends Lambda implements Function0<C10917c> {
        public static final C11642d INSTANCE = new C11642d();

        C11642d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.c$a */
    public static final class C11639a<T, R> implements Function<Throwable, TemplateGroupTab> {

        /* renamed from: a */
        public static final C11639a f31343a = new C11639a();

        C11639a() {
        }

        /* renamed from: a */
        public final TemplateGroupTab apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new TemplateGroupTab(2, new ArrayList(), false, false, null, th, null, 0, 220, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.c$b */
    static final class C11640b<T, R> implements Function<Throwable, TemplateGroupTab> {

        /* renamed from: a */
        public static final C11640b f31344a = new C11640b();

        C11640b() {
        }

        /* renamed from: a */
        public final TemplateGroupTab apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new TemplateGroupTab(2, new ArrayList(), false, false, null, th, null, 0, 220, null);
        }
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListModel
    /* renamed from: a */
    public AbstractC68307f<TemplateGroupTab> mo44657a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        AbstractC68307f<TemplateGroupTab> f = mo44655a().mo20117a(mo44653a(str, false)).mo20141a(ISearchListModel.C11650a.m48340a(this, 0, str, null, 4, null)).mo238029f(C11640b.f31344a);
        Intrinsics.checkExpressionValueIsNotNull(f, "netService.createPuller<…r = it)\n                }");
        return f;
    }

    /* renamed from: a */
    public NetService.AbstractC5074c<TemplateGroupTab> mo44653a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        return new BaseSearchParser(str);
    }

    /* renamed from: c */
    private final AbstractC68307f<TemplateGroupTab> m48299c(int i, String str, String str2) {
        AbstractC68307f<TemplateGroupTab> f = mo44655a().mo20117a(mo44653a(str, true)).mo20141a(mo44654a(i, str, str2)).mo238029f(C11639a.f31343a);
        Intrinsics.checkExpressionValueIsNotNull(f, "netService.createPuller<…rrayListOf(), err = it) }");
        return f;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListModel
    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo44656a(TemplateV4 templateV4, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        Intrinsics.checkParameterIsNotNull(str, "parentToken");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        AbstractC68307f<DocumentCreateInfo> a = new DocumentCreateHelper(mo44686b()).mo31351a(templateV4.getObjToken(), templateV4.getObjType(), str, false, str2, true, "templatecenter_searchresult");
        Intrinsics.checkExpressionValueIsNotNull(a, "createHelper.startCreate…ATE_CENTER_SEARCH_RESULT)");
        return a;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListModel
    /* renamed from: b */
    public AbstractC68307f<TemplateGroupTab> mo44658b(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        Intrinsics.checkParameterIsNotNull(str2, "buffer");
        if (i != 0 && !StringsKt.isBlank(str)) {
            return m48299c(i, str, str2);
        }
        C13479a.m54758a("BaseSearchModel", "loadMore()...but offset is 0, return directly");
        AbstractC68307f<TemplateGroupTab> a = AbstractC68307f.m265083a(new TemplateGroupTab(2, null, false, false, null, null, null, 0, 242, null));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(TemplateGr… false, hasMore = false))");
        return a;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListModel
    /* renamed from: a */
    public NetService.C5076e mo44654a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        Intrinsics.checkParameterIsNotNull(str2, "buffer");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/search/");
        fVar.mo20145a("offset", String.valueOf(i));
        fVar.mo20145a("page_count", "30");
        fVar.mo20145a("keyword", str);
        fVar.mo20145a("buffer", str2);
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
            fVar.mo20145a("docx_template", "1");
        }
        fVar.mo20143a(2);
        return fVar;
    }
}
