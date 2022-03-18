package com.bytedance.ee.bear.templates.center.list.base;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.thread.C11678b;
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
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0016J2\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010-\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201H\u0004JD\u00102\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010-\u001a\u00020$2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020+H\u0004J.\u00104\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020/2\u0006\u00103\u001a\u00020+H\u0016J\u0010\u00105\u001a\u0002012\u0006\u0010*\u001a\u00020+H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188DX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListModel;", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "cacheService", "Lcom/bytedance/ee/bear/contract/CacheService;", "getCacheService", "()Lcom/bytedance/ee/bear/contract/CacheService;", "cacheService$delegate", "Lkotlin/Lazy;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "getNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "netService$delegate", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "create", "", "createTemplate", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "", "module", "destroy", "loadData", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "lastIndex", "filterType", "", "loadFromCache", "cacheKey", "categoryId", "", "isLoadMore", "", "loadFromNet", "pageNumber", "loadMore", "switchDocToDocXFilterType", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.a.b */
public abstract class BaseTemplateListModel implements IBaseTemplateListModel {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30859a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTemplateListModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTemplateListModel.class), "cacheService", "getCacheService()Lcom/bytedance/ee/bear/contract/CacheService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTemplateListModel.class), "netService", "getNetService()Lcom/bytedance/ee/bear/contract/NetService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTemplateListModel.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: c */
    private final Lazy f30860c = LazyKt.lazy(C11480f.INSTANCE);

    /* renamed from: d */
    private final Lazy f30861d = LazyKt.lazy(C11475a.INSTANCE);

    /* renamed from: e */
    private final Lazy f30862e = LazyKt.lazy(C11479e.INSTANCE);

    /* renamed from: f */
    private final Lazy f30863f = LazyKt.lazy(new C11481g(this));

    /* renamed from: g */
    private final FragmentActivity f30864g;

    /* renamed from: f */
    private final C10917c m47738f() {
        Lazy lazy = this.f30860c;
        KProperty kProperty = f30859a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: g */
    private final NetService m47739g() {
        Lazy lazy = this.f30862e;
        KProperty kProperty = f30859a[2];
        return (NetService) lazy.getValue();
    }

    /* renamed from: a */
    public final AbstractC5082ab mo44133a() {
        Lazy lazy = this.f30861d;
        KProperty kProperty = f30859a[1];
        return (AbstractC5082ab) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final TemplateCenterViewModel mo44140b() {
        Lazy lazy = this.f30863f;
        KProperty kProperty = f30859a[3];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: c */
    public FragmentActivity mo44141c() {
        return this.f30864g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC68307f<TemplateGroupTab> mo44138a(String str, String str2, int i, boolean z, long j, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        Intrinsics.checkParameterIsNotNull(str2, "lastIndex");
        AbstractC68307f<TemplateGroupTab> f = m47739g().mo20117a(mo44200a(2, i, str, true, z, j)).mo20141a(mo44201a(str2, i, z, j, i2)).mo238029f(C11478d.f30871a);
        Intrinsics.checkExpressionValueIsNotNull(f, "netService.createPuller<…rrayListOf(), err = it) }");
        return f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/CacheService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.b$a */
    static final class C11475a extends Lambda implements Function0<AbstractC5082ab> {
        public static final C11475a INSTANCE = new C11475a();

        C11475a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5082ab invoke() {
            return (AbstractC5082ab) KoinJavaComponent.m268613a(AbstractC5082ab.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.b$e */
    static final class C11479e extends Lambda implements Function0<NetService> {
        public static final C11479e INSTANCE = new C11479e();

        C11479e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetService invoke() {
            return (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.b$f */
    static final class C11480f extends Lambda implements Function0<C10917c> {
        public static final C11480f INSTANCE = new C11480f();

        C11480f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.b$g */
    static final class C11481g extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BaseTemplateListModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11481g(BaseTemplateListModel bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.mo44141c()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.b$c */
    public static final class C11477c<T, R> implements Function<Throwable, TemplateGroupTab> {

        /* renamed from: a */
        public static final C11477c f30870a = new C11477c();

        C11477c() {
        }

        /* renamed from: a */
        public final TemplateGroupTab apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new TemplateGroupTab(1, new ArrayList(), false, false, null, th, null, 0, 220, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.b$d */
    public static final class C11478d<T, R> implements Function<Throwable, TemplateGroupTab> {

        /* renamed from: a */
        public static final C11478d f30871a = new C11478d();

        C11478d() {
        }

        /* renamed from: a */
        public final TemplateGroupTab apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new TemplateGroupTab(2, new ArrayList(), false, false, null, th, null, 0, 220, null);
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public boolean mo44139a(int i) {
        if (i != 2 || !C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
            return false;
        }
        return true;
    }

    public BaseTemplateListModel(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f30864g = fragmentActivity;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.b$b */
    public static final class C11476b<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListModel f30865a;

        /* renamed from: b */
        final /* synthetic */ int f30866b;

        /* renamed from: c */
        final /* synthetic */ String f30867c;

        /* renamed from: d */
        final /* synthetic */ boolean f30868d;

        /* renamed from: e */
        final /* synthetic */ long f30869e;

        C11476b(BaseTemplateListModel bVar, int i, String str, boolean z, long j) {
            this.f30865a = bVar;
            this.f30866b = i;
            this.f30867c = str;
            this.f30868d = z;
            this.f30869e = j;
        }

        /* renamed from: a */
        public final AbstractC68307f<TemplateGroupTab> apply(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "it");
            String str2 = (String) this.f30865a.mo44133a().mo20177a(str);
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
            return AbstractC68307f.m265083a(this.f30865a.mo44200a(1, this.f30866b, this.f30867c, false, this.f30868d, this.f30869e).parse(str2));
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public AbstractC68307f<TemplateGroupTab> mo44135a(String str, int i) {
        boolean z;
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "lastIndex");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = "0";
        } else {
            str2 = str;
        }
        String str3 = mo44202d() + '_' + str2 + '_' + i;
        AbstractC68307f<TemplateGroupTab> a = AbstractC68307f.m265091a(m47736a(this, str3, i, 0, false, 12, null), m47737a(this, str3, str, i, false, 0, 0, 56, null)).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.concat(cacheFlo…rSchedulers.mainThread())");
        return a;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo44134a(TemplateV4 templateV4, String str, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        Intrinsics.checkParameterIsNotNull(str, "parentToken");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        DocumentCreateHelper documentCreateHelper = new DocumentCreateHelper(m47738f());
        String objToken = templateV4.getObjToken();
        int objType = templateV4.getObjType();
        if (templateV4.getSource() == 1) {
            z = true;
        } else {
            z = false;
        }
        AbstractC68307f<DocumentCreateInfo> a = documentCreateHelper.mo31351a(objToken, objType, str, true, str2, z, "templatecenter_normalcreate");
        Intrinsics.checkExpressionValueIsNotNull(a, "createHelper.startCreate…ATE_CENTER_NORMAL_CREATE)");
        return a;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel
    /* renamed from: a */
    public AbstractC68307f<TemplateGroupTab> mo44136a(String str, int i, long j, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "lastIndex");
        AbstractC68307f<TemplateGroupTab> a = AbstractC68307f.m265083a(new TemplateGroupTab(2, new ArrayList(), false, false, null, null, null, 0, 220, null));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(TemplateGr…rayListOf(), err = null))");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC68307f<TemplateGroupTab> mo44137a(String str, int i, long j, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        AbstractC68307f<TemplateGroupTab> f = AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238014c(new C11476b(this, i, str, z, j)).mo238029f(C11477c.f30870a);
        Intrinsics.checkExpressionValueIsNotNull(f, "Flowable.just(cacheKey)\n…rrayListOf(), err = it) }");
        return f;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m47736a(BaseTemplateListModel bVar, String str, int i, long j, boolean z, int i2, Object obj) {
        boolean z2;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                j = -1;
            }
            if ((i2 & 8) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            return bVar.mo44137a(str, i, j, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFromCache");
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m47737a(BaseTemplateListModel bVar, String str, String str2, int i, boolean z, long j, int i2, int i3, Object obj) {
        boolean z2;
        long j2;
        int i4;
        if (obj == null) {
            if ((i3 & 8) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i3 & 16) != 0) {
                j2 = -1;
            } else {
                j2 = j;
            }
            if ((i3 & 32) != 0) {
                i4 = 0;
            } else {
                i4 = i2;
            }
            return bVar.mo44138a(str, str2, i, z2, j2, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFromNet");
    }
}
