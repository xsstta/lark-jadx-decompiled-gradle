package com.larksuite.component.openplatform.infra.network.base;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12867c;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.infra.network.base.g */
public class C25546g extends C12872h {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public C12874a<C12867c> mo48533a(C12878e eVar, C12867c cVar) {
        Map<String, String> b = cVar.mo48505b();
        OPTrace b2 = eVar.mo48553b();
        String requestId = b2.getRequestId();
        AppBrandLogger.m52830i("TraceHeaderInterceptor", "add request logId:" + requestId);
        if (!TextUtils.isEmpty(requestId)) {
            cVar.mo48504a("x-request-id", requestId);
            cVar.mo48504a("x-tt-logid", requestId);
        }
        String str = b.get("x-request-id-op");
        if (!TextUtils.isEmpty(str)) {
            AppBrandLogger.m52831w("TraceHeaderInterceptor", "addCustomRequestId, ", "x-request-id-op", " already exist, value: ", str);
        } else {
            cVar.mo48504a("x-request-id-op", b2.getTracingID());
        }
        return new C12874a<>(cVar);
    }
}
