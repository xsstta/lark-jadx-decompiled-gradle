package com.bytedance.ee.bear.templates.scene;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/SceneModel;", "Lcom/bytedance/ee/bear/templates/scene/ISceneModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "getNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "netService$delegate", "Lkotlin/Lazy;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "topicID", "", "create", "", "destroy", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/scene/TopicDataResult;", "gotoPreview", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "loadData", "Lio/reactivex/Flowable;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.scene.g */
public final class SceneModel implements ISceneModel {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31289a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SceneModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SceneModel.class), "netService", "getNetService()Lcom/bytedance/ee/bear/contract/NetService;"))};

    /* renamed from: b */
    private final Lazy f31290b = LazyKt.lazy(C11618c.INSTANCE);

    /* renamed from: c */
    private final Lazy f31291c = LazyKt.lazy(C11617b.INSTANCE);

    /* renamed from: d */
    private final FragmentActivity f31292d;

    /* renamed from: b */
    private final NetService m48258b() {
        Lazy lazy = this.f31291c;
        KProperty kProperty = f31289a[1];
        return (NetService) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public NetService.AbstractC5074c<TopicDataResult> mo44609a() {
        return new SceneParser();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.g$b */
    static final class C11617b extends Lambda implements Function0<NetService> {
        public static final C11617b INSTANCE = new C11617b();

        C11617b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetService invoke() {
            return (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.g$c */
    static final class C11618c extends Lambda implements Function0<C10917c> {
        public static final C11618c INSTANCE = new C11618c();

        C11618c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/scene/TopicDataResult;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.g$a */
    public static final class C11616a<T, R> implements Function<Throwable, TopicDataResult> {

        /* renamed from: a */
        public static final C11616a f31293a = new C11616a();

        C11616a() {
        }

        /* renamed from: a */
        public final TopicDataResult apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new TopicDataResult();
        }
    }

    public SceneModel(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f31292d = fragmentActivity;
    }

    /* renamed from: a */
    public NetService.C5076e mo44610a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "topicID");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/topic_template_list/");
        fVar.mo20145a("topic_id", str);
        fVar.mo20145a("platform", "mobile");
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_docx", false)) {
            fVar.mo20145a("docx_template", "1");
        }
        fVar.mo20143a(2);
        return fVar;
    }

    /* renamed from: b */
    public AbstractC68307f<TopicDataResult> mo44612b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "topicID");
        AbstractC68307f<TopicDataResult> f = m48258b().mo20117a(mo44609a()).mo20141a(mo44610a(str)).mo238029f(C11616a.f31293a);
        Intrinsics.checkExpressionValueIsNotNull(f, "netService.createPuller<…esult()\n                }");
        return f;
    }

    /* renamed from: a */
    public void mo44611a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        StringBuilder sb = new StringBuilder();
        C6313i a = C6313i.m25327a();
        C8275a b = C8275a.m34052b(templateV4.getObjType());
        Intrinsics.checkExpressionValueIsNotNull(b, "DocumentType.getDocumentType(template.objType)");
        sb.append(a.mo25382a(b.mo32553a(), templateV4.getObjToken(), ""));
        sb.append("?from=template_preview&collectionId=");
        sb.append(templateV4.getCollectionId());
        String sb2 = sb.toString();
        RouteBean routeBean = new RouteBean();
        routeBean.mo40620g(1);
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(sb2, routeBean);
    }
}
