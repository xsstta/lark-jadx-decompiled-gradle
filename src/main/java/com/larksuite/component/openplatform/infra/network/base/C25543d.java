package com.larksuite.component.openplatform.infra.network.base;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p633e.C12834a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12880g;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12868d;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.infra.network.base.d */
public class C25543d extends C12872h {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public <T> C12874a<C12868d<T>> mo48535a(C12878e eVar, C12880g gVar, C12868d<T> dVar) {
        String str;
        String str2;
        String str3;
        OPMonitor oPMonitor;
        if (dVar == null) {
            AppBrandLogger.m52829e("MonitorInterceptor", "logResponseHeader, response is null");
            return new C12874a<>(new ECONetworkException(-1, "network response is null"));
        } else if (gVar == null) {
            AppBrandLogger.m52829e("MonitorInterceptor", "logResponseHeader, request is null");
            return new C12874a<>(new ECONetworkException(-1, "network request is null"));
        } else {
            String a = C12834a.m53000a(gVar.mo48564c());
            Map<String, String> a2 = gVar.mo48562a();
            if (a2 != null) {
                str2 = a2.get("x-request-id");
                str = a2.get("x-request-id-op");
            } else {
                str = "";
                str2 = str;
            }
            Map<String, String> c = dVar.mo48511c();
            if (c != null) {
                str3 = c.get("EENet-XRequest-Id");
            } else {
                str3 = "";
            }
            Object a3 = eVar.mo48552a();
            if (a3 instanceof IAppContext) {
                oPMonitor = DependencyMgr.m52811b().mo48305a("mp_network_rust_trace", new OPMonitorCode("client.open_platform.common", 10005, OPMonitorLevel.NORMAL, ""), (IAppContext) a3);
            } else {
                oPMonitor = new OPMonitor("mp_network_rust_trace");
            }
            if (!TextUtils.isEmpty(str)) {
                oPMonitor.tracing(str);
            }
            oPMonitor.addCategoryValue("request_id", str2).addCategoryValue("url", a).addCategoryValue("rust_task_id", str3).addCategoryValue("http_code", Integer.valueOf(dVar.mo48512d())).flush();
            return new C12874a<>(dVar);
        }
    }
}
