package com.bytedance.ee.lark.infra.network.p622a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import okhttp3.Request;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a */
public class C12793a {
    /* renamed from: a */
    public static void m52872a(Request.Builder builder, long j) {
        builder.addHeader("EENet-Rust-Request-Timeout", String.valueOf(j));
    }

    /* renamed from: a */
    public static void m52874a(Request.Builder builder, TracingCoreSpan tracingCoreSpan) {
        if (builder == null) {
            AppBrandLogger.m52829e("tma_RequestInceptUtil", "addCustomRequestId, builder is null");
            return;
        }
        if (tracingCoreSpan == null) {
            TracingCoreSpan c = DependencyMgr.m52809a().mo48302c();
            if (c == null) {
                AppBrandLogger.m52829e("tma_RequestInceptUtil", "addCustomRequestId, span is null");
                return;
            }
            tracingCoreSpan = c.generateSpan();
        }
        if (tracingCoreSpan == null) {
            AppBrandLogger.m52829e("tma_RequestInceptUtil", "addCustomRequestId, generate span is null");
            return;
        }
        String requestId = tracingCoreSpan.getRequestId();
        AppBrandLogger.m52830i("tma_RequestInceptUtil", "post request logId:" + requestId);
        if (!TextUtils.isEmpty(requestId)) {
            builder.removeHeader("x-request-id");
            builder.addHeader("x-request-id", requestId);
            builder.removeHeader("x-tt-logid");
            builder.addHeader("x-tt-logid", requestId);
        }
        try {
            String header = builder.build().header("x-request-id-op");
            if (!TextUtils.isEmpty(header)) {
                AppBrandLogger.m52831w("tma_RequestInceptUtil", "addCustomRequestId, ", "x-request-id-op", " already exist, value: ", header);
                return;
            }
        } catch (Throwable th) {
            AppBrandLogger.m52829e("tma_RequestInceptUtil", "addCustomRequestId, error: " + th.getMessage(), th);
        }
        builder.addHeader("x-request-id-op", tracingCoreSpan.getTracingID());
        AppBrandLogger.m52830i("tma_RequestInceptUtil", "addCustomRequestId, ", "x-request-id-op", ": ", tracingCoreSpan.getTracingID());
    }

    /* renamed from: a */
    public static void m52873a(Request.Builder builder, IAppContext iAppContext, TracingCoreSpan tracingCoreSpan) {
        builder.removeHeader("User-Agent");
        String a = DependencyMgr.m52811b().mo48307a(iAppContext);
        AppBrandLogger.m52828d("tma_RequestInceptUtil", "custom UA = ", a);
        builder.addHeader("User-Agent", a);
        builder.addHeader("referer", DependencyMgr.m52811b().mo48309b(iAppContext));
        m52874a(builder, tracingCoreSpan);
    }
}
