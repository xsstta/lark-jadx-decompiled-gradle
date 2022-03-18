package com.bytedance.ee.lark.infra.network.p633e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.eenet.p598a.C12611a;
import com.bytedance.ee.eenet.util.HttpChannel;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.TracingCoreSpan;

/* renamed from: com.bytedance.ee.lark.infra.network.e.c */
public class C12836c {
    /* renamed from: a */
    public static void m53008a(String str, String str2, OPTrace oPTrace, int i, IAppContext iAppContext) {
        boolean z;
        OPMonitor reportPlatform = DependencyMgr.m52811b().mo48305a("mp_request_invoke_result", null, iAppContext).reportPlatform(6);
        DependencyMgr.m52811b().mo48308a(reportPlatform, iAppContext);
        OPMonitor addCategoryValue = reportPlatform.addCategoryValue("result_type", str).addCategoryValue("http_code", str2).addCategoryValue("channel", "native");
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        addCategoryValue.addCategoryValue("is_prefetch", Boolean.valueOf(z));
        if (oPTrace != null) {
            reportPlatform.tracing(oPTrace);
            if (!TextUtils.isEmpty(oPTrace.getRequestId())) {
                reportPlatform.addCategoryValue("request_id", oPTrace.getRequestId());
            }
        } else {
            AppBrandLogger.m52829e("NetworkMonitorUtil", " span is null");
        }
        reportPlatform.flush();
    }

    /* renamed from: a */
    public static void m53009a(String str, String str2, OPTrace oPTrace, boolean z, IAppContext iAppContext) {
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str2);
            String encodedPath = parse.getEncodedPath();
            String host = parse.getHost();
            OPMonitor reportPlatform = DependencyMgr.m52811b().mo48305a("mp_request_invoke_start", null, iAppContext).reportPlatform(6);
            DependencyMgr.m52811b().mo48308a(reportPlatform, iAppContext);
            reportPlatform.addCategoryValue("method", str).addCategoryValue("path", encodedPath).addCategoryValue("domain", host).addCategoryValue("use_prefetch", Boolean.valueOf(z));
            if (oPTrace != null) {
                reportPlatform.tracing(oPTrace);
                if (!TextUtils.isEmpty(oPTrace.getRequestId())) {
                    reportPlatform.addCategoryValue("request_id", oPTrace.getRequestId());
                }
            } else {
                AppBrandLogger.m52829e("NetworkMonitorUtil", " span is null");
            }
            reportPlatform.flush();
        }
    }

    /* renamed from: a */
    public static void m53010a(String str, String str2, String str3, String str4, long j, TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) {
        OPMonitor reportPlatform = DependencyMgr.m52811b().mo48305a("mp_request_start", null, iAppContext).reportPlatform(6);
        DependencyMgr.m52811b().mo48308a(reportPlatform, iAppContext);
        reportPlatform.addCategoryValue("method", str).addCategoryValue("path", str2).addCategoryValue("domain", str3).addCategoryValue("page_path", str4).addCategoryValue("request_body_length", Long.valueOf(j));
        if (tracingCoreSpan != null) {
            reportPlatform.addCategoryValue("trace_id", tracingCoreSpan.getTracingID());
            if (!TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                reportPlatform.addCategoryValue("request_id", tracingCoreSpan.getRequestId());
            }
        } else {
            AppBrandLogger.m52829e("NetworkMonitorUtil", " span is null");
        }
        reportPlatform.flush();
    }

    /* renamed from: a */
    public static void m53011a(boolean z, long j, int i, C12611a aVar, String str, long j2, String str2, String str3, TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) {
        String str4;
        OPMonitor a = m53007a(z, aVar.f33782r, str, aVar.f33776l, "", System.currentTimeMillis() - j, i, j2, str2, str3, tracingCoreSpan, iAppContext);
        OPMonitor addCategoryValue = a.addCategoryValue("dns", Integer.valueOf(aVar.f33765a)).addCategoryValue("ssl", Integer.valueOf(aVar.f33771g)).addCategoryValue("connection", Integer.valueOf(aVar.f33766b));
        if (HttpChannel.RustChannel.toString().equals(aVar.f33779o)) {
            str4 = "rust";
        } else {
            str4 = "native";
        }
        addCategoryValue.addCategoryValue("channel", str4);
        a.flush();
    }

    /* renamed from: a */
    public static OPMonitor m53007a(boolean z, String str, String str2, String str3, String str4, long j, int i, long j2, String str5, String str6, TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) {
        String str7;
        OPMonitor reportPlatform = DependencyMgr.m52811b().mo48305a("mp_request_result", null, iAppContext).reportPlatform(6);
        DependencyMgr.m52811b().mo48308a(reportPlatform, iAppContext);
        if (z) {
            str7 = "success";
        } else {
            str7 = "fail";
        }
        reportPlatform.addCategoryValue("result_type", str7).addCategoryValue("method", str).addCategoryValue("path", str2).addCategoryValue("domain", str3).addCategoryValue("page_path", str4).addCategoryValue("from_request_start_duration", Long.valueOf(j)).addCategoryValue("http_code", Integer.valueOf(i)).addCategoryValue("response_body_length", Long.valueOf(j2)).addCategoryValue("channel", "native");
        if (!TextUtils.isEmpty(str5)) {
            reportPlatform.addCategoryValue("request_header", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            reportPlatform.addCategoryValue("response_header", str6);
        }
        if (tracingCoreSpan != null) {
            reportPlatform.addCategoryValue("trace_id", tracingCoreSpan.getTracingID());
            if (!TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                reportPlatform.addCategoryValue("request_id", tracingCoreSpan.getRequestId());
            }
        } else {
            AppBrandLogger.m52829e("NetworkMonitorUtil", " span is null");
        }
        return reportPlatform;
    }

    /* renamed from: a */
    public static void m53012a(boolean z, String str, String str2, String str3, String str4, String str5, long j, int i, long j2, String str6, String str7, TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) {
        OPMonitor a = m53007a(z, str, str2, str3, str4, j, i, j2, str6, str7, tracingCoreSpan, iAppContext);
        a.setErrorMessage(str5);
        a.flush();
    }
}
