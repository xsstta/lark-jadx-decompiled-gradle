package com.tt.miniapp.net.p3308a;

import com.bytedance.ee.lark.infra.cookie.p618c.C12760a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.larkbrand.net.p634a.C12841a;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.impl.business.api.diagnose.entity.C67893b;
import com.tt.refer.impl.business.api.diagnose.entity.C67894c;
import java.io.File;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.tt.miniapp.net.a.a */
public final class C66498a {
    /* renamed from: a */
    private static OkHttpClient m259870a() {
        return C66517e.m259917a();
    }

    /* renamed from: a */
    private static String m259869a(Map<String, String> map, Request.Builder builder) {
        String str = "";
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.removeHeader(entry.getKey());
                builder.addHeader(entry.getKey(), entry.getValue());
                if (entry.getKey().equalsIgnoreCase(ConvertOfficeToSpaceService.f88309g)) {
                    str = entry.getValue();
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized File m259867a(String str, Map<String, String> map, String str2, String str3, AbstractC12796b bVar, AbstractC12797c cVar, IAppContext iAppContext) {
        File file;
        String str4;
        synchronized (C66498a.class) {
            try {
                Request.Builder url = new Request.Builder().url(str);
                OPTrace a = C12805d.m52894a(AppbrandContext.getInst().getTracing(), true, iAppContext);
                C12793a.m52873a(url, iAppContext, a);
                String a2 = m259869a(map, url);
                Request build = url.build();
                Call newCall = m259870a().newBuilder().addInterceptor(new C12760a(a2)).build().newCall(build);
                String a3 = C12843b.m53044a(C12841a.m53030a().mo48476a(iAppContext.getAppId()), newCall.request().headers());
                long currentTimeMillis = System.currentTimeMillis();
                LarkInnerEventHelper.mpRequestDownloadStart(a, newCall.request().method(), newCall.request().url().encodedPath(), newCall.request().url().host(), a3, iAppContext);
                if (C67893b.m264178a(iAppContext).mo235551a()) {
                    String method = build.method();
                    Headers headers = build.headers();
                    if (a != null) {
                        str4 = a.getRequestId();
                    } else {
                        str4 = "";
                    }
                    C67893b.m264178a(iAppContext).mo235549a(iAppContext, new C67894c(str, method, headers, "", str4));
                }
                try {
                    Response execute = newCall.execute();
                    if (execute == null) {
                        LarkInnerEventHelper.mpRequestDownloadResult(a, newCall.request().method(), newCall.request().url().encodedPath(), newCall.request().url().host(), "fail", "download", 80004, "response is null", null, System.currentTimeMillis() - currentTimeMillis, -1, -1, a3, null, iAppContext);
                    }
                    file = new File(str2, str3);
                    if (execute != null) {
                        file = m259868a(execute, file, bVar, cVar, newCall, a, currentTimeMillis, iAppContext);
                    } else if (file.exists()) {
                        file.delete();
                    }
                } catch (Exception e) {
                    String method2 = newCall.request().method();
                    String encodedPath = newCall.request().url().encodedPath();
                    String host = newCall.request().url().host();
                    LarkInnerEventHelper.mpRequestDownloadResult(a, method2, encodedPath, host, "fail", "download", 80001, "download error: " + e.getMessage(), null, System.currentTimeMillis() - currentTimeMillis, -1, -1, a3, null, iAppContext);
                    throw e;
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "tma_DownloadManager", e2.getStackTrace());
                if (bVar != null) {
                    bVar.mo48352a("sync download fail " + e2.getMessage(), e2);
                }
                return null;
            }
        }
        return file;
    }

    /* renamed from: a */
    public static synchronized void m259872a(String str, Map<String, String> map, String str2, String str3, String str4, String str5, AbstractC12796b bVar, IAppContext iAppContext) {
        synchronized (C66498a.class) {
            m259871a(str, map, str2, str3, str4, str5, bVar, null, false, C12805d.m52895a((TracingCoreSpan) AppbrandContext.getInst().getTracing(), true, iAppContext), iAppContext);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0383 A[SYNTHETIC, Splitter:B:126:0x0383] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x038b A[Catch:{ IOException -> 0x0387 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0432 A[SYNTHETIC, Splitter:B:146:0x0432] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x043a A[Catch:{ IOException -> 0x0436 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0221 A[SYNTHETIC, Splitter:B:85:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m259868a(okhttp3.Response r33, java.io.File r34, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b r35, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c r36, okhttp3.Call r37, com.ss.android.lark.optrace.api.TracingCoreSpan r38, long r39, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r41) {
        /*
        // Method dump skipped, instructions count: 1241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.net.p3308a.C66498a.m259868a(okhttp3.Response, java.io.File, com.bytedance.ee.lark.infra.network.a.a.a.b, com.bytedance.ee.lark.infra.network.a.a.a.c, okhttp3.Call, com.ss.android.lark.optrace.api.TracingCoreSpan, long, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):java.io.File");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x022c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m259871a(java.lang.String r26, java.util.Map<java.lang.String, java.lang.String> r27, java.lang.String r28, java.lang.String r29, final java.lang.String r30, final java.lang.String r31, final com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b r32, final com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c r33, boolean r34, final com.ss.android.lark.optrace.api.TracingCoreSpan r35, final com.bytedance.ee.lark.infra.sandbox.context.IAppContext r36) {
        /*
        // Method dump skipped, instructions count: 580
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.net.p3308a.C66498a.m259871a(java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ee.lark.infra.network.a.a.a.b, com.bytedance.ee.lark.infra.network.a.a.a.c, boolean, com.ss.android.lark.optrace.api.TracingCoreSpan, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):void");
    }
}
