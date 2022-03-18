package com.bytedance.ee.bear.templates.recommend;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract;
import com.bytedance.ee.bear.thread.C11678b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
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
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001fH\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001fH\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001fH\u0016J\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateModel;", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IModel;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey$delegate", "Lkotlin/Lazy;", "cacheService", "Lcom/bytedance/ee/bear/contract/CacheService;", "getCacheService", "()Lcom/bytedance/ee/bear/contract/CacheService;", "cacheService$delegate", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "getNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "netService$delegate", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "templateSelectViewModel", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateViewModel;", "create", "", "createTemplate", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "module", "destroy", "loadFromCache", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "loadFromNet", "loadRecommendTemplates", "setSelectedTemplate", "fromRecommend", "", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.recommend.c */
public final class NewRecommendTemplateModel implements NewRecommendTemplateContract.IModel {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31221a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewRecommendTemplateModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewRecommendTemplateModel.class), "cacheService", "getCacheService()Lcom/bytedance/ee/bear/contract/CacheService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewRecommendTemplateModel.class), "netService", "getNetService()Lcom/bytedance/ee/bear/contract/NetService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewRecommendTemplateModel.class), "cacheKey", "getCacheKey()Ljava/lang/String;"))};

    /* renamed from: b */
    public static final Companion f31222b = new Companion(null);

    /* renamed from: c */
    private final Lazy f31223c = LazyKt.lazy(C11598i.INSTANCE);

    /* renamed from: d */
    private final Lazy f31224d = LazyKt.lazy(C11592c.INSTANCE);

    /* renamed from: e */
    private final Lazy f31225e = LazyKt.lazy(C11597h.INSTANCE);

    /* renamed from: f */
    private final Lazy f31226f = LazyKt.lazy(C11591b.INSTANCE);

    /* renamed from: g */
    private NewRecommendTemplateViewModel f31227g;

    /* renamed from: h */
    private final Fragment f31228h;

    /* renamed from: d */
    private final C10917c m48174d() {
        Lazy lazy = this.f31223c;
        KProperty kProperty = f31221a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: e */
    private final NetService m48175e() {
        Lazy lazy = this.f31225e;
        KProperty kProperty = f31221a[2];
        return (NetService) lazy.getValue();
    }

    /* renamed from: b */
    public final AbstractC5082ab mo44555b() {
        Lazy lazy = this.f31224d;
        KProperty kProperty = f31221a[1];
        return (AbstractC5082ab) lazy.getValue();
    }

    /* renamed from: c */
    public final String mo44556c() {
        Lazy lazy = this.f31226f;
        KProperty kProperty = f31221a[3];
        return (String) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateModel$Companion;", "", "()V", "DOCS_RECOMMEND_TEMPLATES", "", "RECOMMEND_TEMPLATE_API_PATH", "TAG", "VERSION", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/CacheService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$c */
    static final class C11592c extends Lambda implements Function0<AbstractC5082ab> {
        public static final C11592c INSTANCE = new C11592c();

        C11592c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5082ab invoke() {
            return (AbstractC5082ab) KoinJavaComponent.m268613a(AbstractC5082ab.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$h */
    static final class C11597h extends Lambda implements Function0<NetService> {
        public static final C11597h INSTANCE = new C11597h();

        C11597h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetService invoke() {
            return (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$i */
    static final class C11598i extends Lambda implements Function0<C10917c> {
        public static final C11598i INSTANCE = new C11598i();

        C11598i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IModel
    /* renamed from: a */
    public AbstractC68307f<RecommendTemplates> mo44543a() {
        AbstractC68307f<RecommendTemplates> a = AbstractC68307f.m265091a(m48176f(), m48177g()).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.concat(cacheFlo…rSchedulers.mainThread())");
        return a;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        FragmentActivity activity = this.f31228h.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        this.f31227g = (NewRecommendTemplateViewModel) aj.m5366a(activity).mo6005a(NewRecommendTemplateViewModel.class);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$b */
    static final class C11591b extends Lambda implements Function0<String> {
        public static final C11591b INSTANCE = new C11591b();

        C11591b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str;
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            if (f == null || (str = f.f14584a) == null) {
                str = "";
            }
            return "docs_recommend_templates_v4_" + str.hashCode();
        }
    }

    /* renamed from: f */
    private final AbstractC68307f<RecommendTemplates> m48176f() {
        AbstractC68307f<RecommendTemplates> f = AbstractC68307f.m265083a(mo44556c()).mo237985a(C11678b.m48479c()).mo238014c(new C11593d(this)).mo238029f(C11594e.f31230a);
        Intrinsics.checkExpressionValueIsNotNull(f, "Flowable.just(cacheKey)\n…(), it)\n                }");
        return f;
    }

    /* renamed from: g */
    private final AbstractC68307f<RecommendTemplates> m48177g() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/obj_template/recommend/");
        fVar.mo20145a("platform", "mobile");
        fVar.mo20145a("scene", "new_entry");
        fVar.mo20145a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "4");
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
            fVar.mo20145a("docx_template", "1");
        }
        fVar.mo20143a(2);
        AbstractC68307f<RecommendTemplates> f = m48175e().mo20117a(new C11595f(this)).mo20141a(fVar).mo238029f(C11596g.f31232a);
        Intrinsics.checkExpressionValueIsNotNull(f, "netService.createPuller<…rrayList(), it)\n        }");
        return f;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$e */
    public static final class C11594e<T, R> implements Function<Throwable, RecommendTemplates> {

        /* renamed from: a */
        public static final C11594e f31230a = new C11594e();

        C11594e() {
        }

        /* renamed from: a */
        public final RecommendTemplates apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new RecommendTemplates(1, new ArrayList(), th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$f */
    public static final class C11595f<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<RecommendTemplates> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplateModel f31231a;

        C11595f(NewRecommendTemplateModel cVar) {
            this.f31231a = cVar;
        }

        /* renamed from: a */
        public final RecommendTemplates parse(String str) {
            RecommendTemplates a = RecommendTemplates.Companion.mo44542a(2, str);
            if (a.code == 0) {
                this.f31231a.mo44555b().mo20178a(this.f31231a.mo44556c(), str);
            }
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$g */
    public static final class C11596g<T, R> implements Function<Throwable, RecommendTemplates> {

        /* renamed from: a */
        public static final C11596g f31232a = new C11596g();

        C11596g() {
        }

        /* renamed from: a */
        public final RecommendTemplates apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new RecommendTemplates(2, new ArrayList(), th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.c$d */
    public static final class C11593d<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplateModel f31229a;

        C11593d(NewRecommendTemplateModel cVar) {
            this.f31229a = cVar;
        }

        /* renamed from: a */
        public final AbstractC68307f<RecommendTemplates> apply(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "it");
            String str2 = (String) this.f31229a.mo44555b().mo20177a(str);
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return AbstractC68307f.m265097b();
            }
            return AbstractC68307f.m265083a(RecommendTemplates.Companion.mo44542a(1, str2));
        }
    }

    public NewRecommendTemplateModel(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f31228h = fragment;
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IModel
    /* renamed from: a */
    public void mo44545a(TemplateV4 templateV4, boolean z) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        NewRecommendTemplateViewModel fVar = this.f31227g;
        if (fVar != null) {
            fVar.setSelectedTemplate(templateV4, z);
        }
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IModel
    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo44544a(TemplateV4 templateV4, String str, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        Intrinsics.checkParameterIsNotNull(str, "parentToken");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        DocumentCreateHelper documentCreateHelper = new DocumentCreateHelper(m48174d());
        String objToken = templateV4.getObjToken();
        int objType = templateV4.getObjType();
        if (templateV4.getSource() == 1) {
            z = true;
        } else {
            z = false;
        }
        AbstractC68307f<DocumentCreateInfo> a = documentCreateHelper.mo31351a(objToken, objType, str, true, str2, z, null);
        Intrinsics.checkExpressionValueIsNotNull(a, "createHelper.startCreate…emplate.source == 1,null)");
        return a;
    }
}
