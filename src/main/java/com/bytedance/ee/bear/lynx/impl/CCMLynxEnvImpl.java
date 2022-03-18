package com.bytedance.ee.bear.lynx.impl;

import android.app.Application;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.lynx.api.CCMLynxEnv;
import com.bytedance.ee.bear.lynx.impl.globalbridge.GlobalBridgeService;
import com.bytedance.ee.bear.lynx.impl.resourceloader.CCMResourceLoaderService;
import com.bytedance.ee.bear.lynx.impl.route.CCMLynxRouteService;
import com.bytedance.ee.bear.lynx.impl.utli.LynxLogger;
import com.bytedance.ee.bear.lynx.impl.utli.LynxResourceConfig;
import com.bytedance.ee.bear.lynx.impl.utli.ServiceDependence;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p701d.C13618f;
import com.bytedance.ies.bullet.service.base.ILoggerConfig;
import com.bytedance.ies.bullet.service.base.ILoggerService;
import com.bytedance.ies.bullet.service.base.IMonitorReportService;
import com.bytedance.ies.bullet.service.base.IReporter;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.IRouterService;
import com.bytedance.ies.bullet.service.base.ISchemaService;
import com.bytedance.ies.bullet.service.base.MonitorConfig;
import com.bytedance.ies.bullet.service.base.impl.ServiceCenter;
import com.bytedance.ies.bullet.service.base.impl.ServiceMap;
import com.bytedance.ies.bullet.service.base.lynx.ILynxKitService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig;
import com.bytedance.ies.bullet.service.monitor.MonitorReportService;
import com.bytedance.ies.bullet.service.schema.SchemaConfig;
import com.bytedance.ies.bullet.service.schema.SchemaService;
import com.bytedance.ies.bullet.x_resloader_dep_downloader.DownloaderDepend;
import com.bytedance.kit.nglynx.LynxKitService;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.lynx.tasm.LynxEnv;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/CCMLynxEnvImpl;", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxEnv;", "()V", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lynxHostService", "Lcom/bytedance/ee/bear/lynx/impl/LynxHostService;", "getLynxHostService", "init", "", "app", "Landroid/app/Application;", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.a */
public final class CCMLynxEnvImpl implements CCMLynxEnv {

    /* renamed from: a */
    public static final Companion f23742a = new Companion(null);

    /* renamed from: b */
    private LynxHostService f23743b;

    /* renamed from: c */
    private final AtomicBoolean f23744c = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/CCMLynxEnvImpl$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/lynx/impl/CCMLynxEnvImpl$init$2", "Lcom/bytedance/ies/bullet/service/base/ILoggerConfig;", "isDebug", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.a$c */
    public static final class C8822c implements ILoggerConfig {
        C8822c() {
        }
    }

    /* renamed from: a */
    public final LynxHostService mo33889a() {
        if (this.f23743b == null) {
            this.f23743b = (LynxHostService) KoinJavaComponent.m268613a(LynxHostService.class, null, null, 6, null);
        }
        LynxHostService dVar = this.f23743b;
        if (dVar != null) {
            return dVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.lynx.impl.LynxHostService");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/lynx/impl/CCMLynxEnvImpl$init$1", "Lcom/bytedance/ies/bullet/service/base/IReporter;", "report", "", "serviceName", "", UpdateKey.STATUS, "", "duration", "Lorg/json/JSONObject;", "logExtra", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.a$b */
    public static final class C8821b implements IReporter {

        /* renamed from: a */
        final /* synthetic */ CCMLynxEnvImpl f23745a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8821b(CCMLynxEnvImpl aVar) {
            this.f23745a = aVar;
        }

        @Override // com.bytedance.ies.bullet.service.base.IReporter
        /* renamed from: a */
        public void mo33890a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f23745a.mo33889a().mo33931a(str, i, jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxEnv
    /* renamed from: a */
    public void mo33880a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "app");
        if (this.f23744c.compareAndSet(false, true)) {
            C13479a.m54764b("ccm-lynx: CCMLynxEnvImpl", "init begin");
            al alVar = (al) ServiceDependence.f23778b.mo33929a(al.class);
            mo33889a().mo33930a();
            CCMResourceLoaderService aVar = new CCMResourceLoaderService(application, alVar.mo17342C());
            ServiceCenter.f37850b.mo52643a().mo52637a("ccm-lynx-bid", new ServiceMap.Builder().mo52647a(ILynxKitService.class, new LynxKitService()).mo52647a(IMonitorReportService.class, new MonitorReportService(new C8821b(this), new MonitorConfig.Builder().mo52676a("CCM-Lynx").mo52677a())).mo52647a(IResourceLoaderService.class, aVar).mo52647a(ISchemaService.class, new SchemaService(new SchemaConfig.Builder().mo52805a("ccm-lynx").mo52806a(LynxResourceConfig.f23772a.mo33923b()).mo52807a())).mo52647a(IRouterService.class, new CCMLynxRouteService(application)).mo52647a(ILoggerService.class, new LynxLogger(new C8822c())).mo52651c());
            String A = alVar.mo17340A();
            if (A == null) {
                A = "";
            }
            String valueOf = String.valueOf(alVar.mo17341B());
            ArrayList<String> b = LynxResourceConfig.f23772a.mo33923b();
            Application application2 = application;
            String a = C13618f.m55265a(application2);
            Intrinsics.checkExpressionValueIsNotNull(a, "PackageUtils.getAppVersionName(app)");
            String a2 = LynxResourceConfig.f23772a.mo33922a();
            String s = alVar.mo17369s();
            Intrinsics.checkExpressionValueIsNotNull(s, "infoProvideService.deviceId");
            aVar.init(new ResourceLoaderConfig(A, a2, b, valueOf, a, s, LynxResourceConfig.f23772a.mo33921a(application2), null, new DownloaderDepend(), null, null, 1664, null));
            GlobalBridgeService.f23780a.mo33933a();
            StringBuilder sb = new StringBuilder();
            sb.append("init end lynx version: ");
            LynxEnv e = LynxEnv.m96123e();
            Intrinsics.checkExpressionValueIsNotNull(e, "LynxEnv.inst()");
            sb.append(e.mo94114s());
            sb.append(", app is debug: ");
            sb.append(C13616d.m55261a());
            C13479a.m54764b("ccm-lynx: CCMLynxEnvImpl", sb.toString());
        }
    }
}
