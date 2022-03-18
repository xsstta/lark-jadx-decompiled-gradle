package com.bytedance.ee.lark.infra.foundation.dependency;

import com.bytedance.ee.lark.infra.network.p622a.p623a.C12798b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\nH&¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/lark/infra/foundation/dependency/INetworkDependency;", "", "appendGadgetNetworkCommandParams", "", "monitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getGadgetMonitor", "name", "", "code", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getNetBusOkhttpClient", "Lokhttp3/OkHttpClient;", "getNetworkConfig", "Lcom/bytedance/ee/lark/infra/network/miniapp/net/NetworkTimeout;", "getPlatformSessionByAppContext", "", "getRequestReferer", "getRequestUa", "getTmaDeviceId", "ECOInfra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.lark.infra.foundation.a.c */
public interface INetworkDependency {
    /* renamed from: a */
    OPMonitor mo48305a(String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext);

    /* renamed from: a */
    String mo48306a();

    /* renamed from: a */
    String mo48307a(IAppContext iAppContext);

    /* renamed from: a */
    void mo48308a(OPMonitor oPMonitor, IAppContext iAppContext);

    /* renamed from: b */
    String mo48309b(IAppContext iAppContext);

    /* renamed from: b */
    OkHttpClient mo48310b();

    /* renamed from: c */
    C12798b mo48311c(IAppContext iAppContext);

    /* renamed from: d */
    Map<String, String> mo48312d(IAppContext iAppContext);
}
