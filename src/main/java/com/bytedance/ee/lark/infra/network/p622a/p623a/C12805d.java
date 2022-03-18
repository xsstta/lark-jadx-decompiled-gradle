package com.bytedance.ee.lark.infra.network.p622a.p623a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.TracingCoreSpan;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a.d */
public class C12805d {
    /* renamed from: a */
    public static OPTrace m52893a(IAppContext iAppContext) {
        if (iAppContext == null || iAppContext.getTracingSpan() == null) {
            return OPTraceService.m192757a();
        }
        return iAppContext.getTracingSpan();
    }

    /* renamed from: a */
    public static String m52896a(int i) {
        StringBuilder sb = new StringBuilder();
        while (i > 0) {
            int i2 = i % 36;
            i /= 36;
            sb.insert(0, "bqve5m0k467dfrxnghctisu91w8jloa2yp3z".charAt(i2));
        }
        while (sb.length() < 6) {
            sb.insert(0, "bqve5m0k467dfrxnghctisu91w8jloa2yp3z".charAt(0));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m52897b(IAppContext iAppContext) {
        if (iAppContext == null) {
            AppBrandLogger.m52829e("RequestIdUtil", "generateRequest appcontext is null");
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a = DependencyMgr.m52809a().mo48298a(iAppContext);
        String d = DependencyMgr.m52809a().mo48303d();
        String appId = iAppContext.getAppId();
        String md5Hex = CharacterUtils.md5Hex(a + d + appId);
        int a2 = C12806e.m52898a();
        String a3 = m52896a(a2);
        AppBrandLogger.m52828d("RequestIdUtil", md5Hex + " " + a2 + " " + a3);
        return "02" + currentTimeMillis + md5Hex + a3;
    }

    /* renamed from: a */
    public static OPTrace m52894a(OPTrace oPTrace, boolean z, IAppContext iAppContext) {
        OPTrace subTrace = oPTrace.subTrace();
        if (z && TextUtils.isEmpty(subTrace.getRequestId())) {
            String b = m52897b(iAppContext);
            subTrace.setRequestId(b);
            AppBrandLogger.m52830i("RequestIdUtil", " generate requestId ", b);
        }
        return subTrace;
    }

    /* renamed from: a */
    public static TracingCoreSpan m52895a(TracingCoreSpan tracingCoreSpan, boolean z, IAppContext iAppContext) {
        if (tracingCoreSpan == null) {
            AppBrandLogger.m52829e("RequestIdUtil", " tracing span is null");
            return null;
        }
        TracingCoreSpan generateSpan = tracingCoreSpan.generateSpan();
        if (generateSpan == null) {
            AppBrandLogger.m52829e("RequestIdUtil", " generate span is null");
            return null;
        }
        if (z && TextUtils.isEmpty(generateSpan.getRequestId())) {
            String b = m52897b(iAppContext);
            generateSpan.setRequestId(b);
            AppBrandLogger.m52830i("RequestIdUtil", " generate requestId ", b);
        }
        return generateSpan;
    }
}
