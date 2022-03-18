package com.ss.android.lark.littleapp.tempinfra.dependency;

import com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12798b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.larksuite.component.openplatform.infra.session.PlatformSessionMgr;
import com.ss.android.lark.littleapp.p2128e.p2130b.C41325a;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.option.p3392m.C67657c;
import com.tt.refer.common.service.net.entity.C67856a;
import com.tt.refer.common.service.net.entity.OpNetworkQualityType;
import com.tt.refer.common.util.C67860d;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/littleapp/tempinfra/dependency/NetworkDependencyImpl;", "Lcom/bytedance/ee/lark/infra/foundation/dependency/INetworkDependency;", "()V", "appendGadgetNetworkCommandParams", "", "monitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getGadgetMonitor", "name", "", "code", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getNetBusOkhttpClient", "Lokhttp3/OkHttpClient;", "getNetworkConfig", "Lcom/bytedance/ee/lark/infra/network/miniapp/net/NetworkTimeout;", "getPlatformSessionByAppContext", "", "getRequestReferer", "getRequestUa", "getTmaDeviceId", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.littleapp.e.a.b */
public final class NetworkDependencyImpl implements INetworkDependency {
    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: a */
    public String mo48306a() {
        String a = C67657c.m263250a();
        Intrinsics.checkExpressionValueIsNotNull(a, "NetRequestUtil.getDeviceId()");
        return a;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: b */
    public OkHttpClient mo48310b() {
        OkHttpClient a = C66517e.m259917a();
        Intrinsics.checkExpressionValueIsNotNull(a, "NetBus.getOkHttpClient()");
        return a;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: d */
    public Map<String, String> mo48312d(IAppContext iAppContext) {
        return PlatformSessionMgr.f62170a.mo88675a(iAppContext);
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: b */
    public String mo48309b(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        String a = C41325a.m163829a(iAppContext);
        Intrinsics.checkExpressionValueIsNotNull(a, "RequestTempUtil.getReque…erer(\n        appContext)");
        return a;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: a */
    public String mo48307a(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        String a = C67070z.m261387a(iAppContext);
        Intrinsics.checkExpressionValueIsNotNull(a, "ToolUtils.getCustomUA(appContext)");
        return a;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: c */
    public C12798b mo48311c(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
        AppConfig appConfig = inst.getAppConfig();
        if (appConfig == null) {
            return new C12798b();
        }
        C12798b g = appConfig.mo230046g();
        Intrinsics.checkExpressionValueIsNotNull(g, "config.networkTimeout");
        return g;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: a */
    public void mo48308a(OPMonitor oPMonitor, IAppContext iAppContext) {
        String str;
        Intrinsics.checkParameterIsNotNull(oPMonitor, "monitor");
        C13377u.m54412a(oPMonitor, iAppContext);
        if (iAppContext != null) {
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
            Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.…              appContext)");
            C66420d foreBackgroundManager = inst.getForeBackgroundManager();
            Intrinsics.checkExpressionValueIsNotNull(foreBackgroundManager, "AppbrandApplicationImpl.…xt).foreBackgroundManager");
            boolean c = foreBackgroundManager.mo231961c();
            OpNetworkQualityType a = C67860d.m263999a(iAppContext);
            if (a != null) {
                str = a.getNetworkQuality();
            } else {
                str = null;
            }
            IBaseService findServiceByInterface = iAppContext.findServiceByInterface(AbstractC67724a.class);
            Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
            int c2 = ((AbstractC67724a) findServiceByInterface).mo50457c();
            IBaseService findServiceByInterface2 = iAppContext.findServiceByInterface(AbstractC67724a.class);
            Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface2, "appContext.findServiceBy…IHostService::class.java)");
            C67856a b = ((AbstractC67724a) findServiceByInterface2).mo50452b();
            if (b != null) {
                oPMonitor.addCategoryValue("nqe_http_rtt", Integer.valueOf(b.mo235494b())).addCategoryValue("nqe_transport_rtt", Integer.valueOf(b.mo235493a())).addCategoryValue("nqe_downstream_throughput", Integer.valueOf(b.mo235495c()));
            }
            oPMonitor.addCategoryValue("nqe_status", Integer.valueOf(c2)).addCategoryValue("is_background", Boolean.valueOf(c)).addCategoryValue("net_status", str);
        }
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.INetworkDependency
    /* renamed from: a */
    public OPMonitor mo48305a(String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        return new C67500a(str, oPMonitorCode, iAppContext);
    }
}
