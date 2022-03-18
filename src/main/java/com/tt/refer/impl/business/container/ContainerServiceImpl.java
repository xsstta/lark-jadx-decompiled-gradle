package com.tt.refer.impl.business.container;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.tt.refer.abs.container.background.IForeBackgroundService;
import com.tt.refer.common.base.AbstractC67743a;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tt/refer/impl/business/container/ContainerServiceImpl;", "Lcom/tt/refer/common/base/BaseDependencyService;", "Lcom/tt/refer/abs/container/IContainerModuleService$Dependency;", "Lcom/tt/refer/abs/container/IContainerModuleService;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "foreBackgroundDelegate", "Lcom/tt/refer/impl/business/container/ForeBackgroundService;", "clearListener", "", "createDependency", "isBackground", "", "onBackGround", "onForeGround", "registerForeBackgroundListener", "listener", "Lcom/tt/refer/abs/container/background/IForeBackgroundService$ForeBackgroundListener;", "release", "unregister", "unregisterForeBackgroundListener", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.c.a */
public final class ContainerServiceImpl extends AbstractC67743a<AbstractC67720a.AbstractC67721a> implements AbstractC67720a {

    /* renamed from: a */
    public static final Companion f171017a = new Companion(null);

    /* renamed from: b */
    private final ForeBackgroundService f171018b = new ForeBackgroundService(5000);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/refer/impl/business/container/ContainerServiceImpl$Companion;", "", "()V", "STAY_BACKGROUND_LIMIT_TIME", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tt/refer/impl/business/container/ContainerServiceImpl$createDependency$1", "Lcom/tt/refer/abs/container/IContainerModuleService$Dependency;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.c.a$b */
    public static final class C67901b implements AbstractC67720a.AbstractC67721a {
        C67901b() {
        }
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67439g
    /* renamed from: b */
    public void mo50164b() {
        mo235075e();
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: d */
    public boolean mo235074d() {
        return this.f171018b.mo235074d();
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: e */
    public void mo235075e() {
        this.f171018b.mo235075e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AbstractC67720a.AbstractC67721a mo235129h() {
        return new C67901b();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: a */
    public void mo235070a() {
        this.f171018b.mo235070a();
        LKEvent.C25888a a = new LKEvent.C25888a().mo92168a("onForeGround");
        IAppContext iAppContext = this.f170082d;
        Intrinsics.checkExpressionValueIsNotNull(iAppContext, "appContext");
        C25529d.m91152b(this.f170082d, a.mo92162a(iAppContext.getCurrentActivity()).mo92171a());
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: c */
    public void mo235073c() {
        this.f171018b.mo235073c();
        LKEvent.C25888a a = new LKEvent.C25888a().mo92168a("onBackGround");
        IAppContext iAppContext = this.f170082d;
        Intrinsics.checkExpressionValueIsNotNull(iAppContext, "appContext");
        C25529d.m91152b(this.f170082d, a.mo92162a(iAppContext.getCurrentActivity()).mo92171a());
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: a */
    public void mo235071a(IForeBackgroundService.ForeBackgroundListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f171018b.mo235071a(aVar);
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: b */
    public void mo235072b(IForeBackgroundService.ForeBackgroundListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f171018b.mo235072b(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContainerServiceImpl(IAppContext iAppContext) {
        super(iAppContext);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }
}
