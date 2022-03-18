package com.bytedance.ee.bear.templates.topic;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/TopicModel;", "Lcom/bytedance/ee/bear/templates/topic/ITopicModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "getNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "netService$delegate", "Lkotlin/Lazy;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "topicID", "", "create", "", "createTemplate", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "module", "destroy", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/topic/TopicDataResult;", ShareHitPoint.f121869d, "", "loadData", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.topic.h */
public final class TopicModel implements ITopicModel {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31444a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TopicModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TopicModel.class), "netService", "getNetService()Lcom/bytedance/ee/bear/contract/NetService;"))};

    /* renamed from: b */
    private final Lazy f31445b = LazyKt.lazy(C11673c.INSTANCE);

    /* renamed from: c */
    private final Lazy f31446c = LazyKt.lazy(C11672b.INSTANCE);

    /* renamed from: d */
    private final FragmentActivity f31447d;

    /* renamed from: a */
    private final C10917c m48458a() {
        Lazy lazy = this.f31445b;
        KProperty kProperty = f31444a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: b */
    private final NetService m48459b() {
        Lazy lazy = this.f31446c;
        KProperty kProperty = f31444a[1];
        return (NetService) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.h$b */
    static final class C11672b extends Lambda implements Function0<NetService> {
        public static final C11672b INSTANCE = new C11672b();

        C11672b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetService invoke() {
            return (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.h$c */
    static final class C11673c extends Lambda implements Function0<C10917c> {
        public static final C11673c INSTANCE = new C11673c();

        C11673c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* renamed from: a */
    public NetService.AbstractC5074c<TopicDataResult> mo44751a(int i) {
        return new TopicParser(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/topic/TopicDataResult;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.h$a */
    static final class C11671a<T, R> implements Function<Throwable, TopicDataResult> {

        /* renamed from: a */
        public static final C11671a f31448a = new C11671a();

        C11671a() {
        }

        /* renamed from: a */
        public final TopicDataResult apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new TopicDataResult();
        }
    }

    public TopicModel(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f31447d = fragmentActivity;
    }

    /* renamed from: a */
    public NetService.C5076e mo44752a(String str) {
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

    /* renamed from: a */
    public AbstractC68307f<TopicDataResult> mo44754a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "topicID");
        AbstractC68307f<TopicDataResult> f = m48459b().mo20117a(mo44751a(i)).mo20141a(mo44752a(str)).mo238029f(C11671a.f31448a);
        Intrinsics.checkExpressionValueIsNotNull(f, "netService.createPuller<…esult()\n                }");
        return f;
    }

    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo44753a(TemplateV4 templateV4, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        Intrinsics.checkParameterIsNotNull(str, "parentToken");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        AbstractC68307f<DocumentCreateInfo> a = new DocumentCreateHelper(m48458a()).mo31351a(templateV4.getObjToken(), templateV4.getObjType(), str, false, str2, true, "templatecenter_normalcreate");
        Intrinsics.checkExpressionValueIsNotNull(a, "createHelper.startCreate…ATE_CENTER_NORMAL_CREATE)");
        return a;
    }
}
