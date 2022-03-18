package com.bytedance.ee.bear.templates.banner;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.banner.TemplateBannerContract;
import io.reactivex.AbstractC68307f;
import java.io.Serializable;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerModel;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IModel;", "()V", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "create", "", "destroy", "fetchBannerData", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/templates/banner/BannerDataResult;", "loadFromNet", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.banner.d */
public final class TemplateBannerModel implements TemplateBannerContract.IModel {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30769a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateBannerModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    private final Lazy f30770b = LazyKt.lazy(C11444b.INSTANCE);

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.templates.banner.TemplateBannerContract.IModel
    /* renamed from: a */
    public AbstractC68307f<BannerDataResult> mo43974a() {
        return m47630c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.d$b */
    static final class C11444b extends Lambda implements Function0<C10917c> {
        public static final C11444b INSTANCE = new C11444b();

        C11444b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* renamed from: c */
    private final AbstractC68307f<BannerDataResult> m47630c() {
        AbstractC68307f<BannerDataResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(C11443a.f30771a).mo20141a(m47629b());
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…   }.pull(buildRequest())");
        return a;
    }

    /* renamed from: b */
    private final NetService.C5076e m47629b() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/template_banner/");
        fVar.mo20145a("scene", "tc");
        fVar.mo20145a("platform", "mobile");
        fVar.mo20145a("template_collection", "1");
        fVar.mo20143a(2);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/banner/BannerDataResult;", "json", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.d$a */
    public static final class C11443a<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<BannerDataResult> {

        /* renamed from: a */
        public static final C11443a f30771a = new C11443a();

        C11443a() {
        }

        /* renamed from: a */
        public final BannerDataResult parse(String str) {
            return new TemplateBannerParser(2).parse(str);
        }
    }
}
