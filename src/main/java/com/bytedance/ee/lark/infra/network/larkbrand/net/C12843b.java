package com.bytedance.ee.lark.infra.network.larkbrand.net;

import android.text.TextUtils;
import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
import com.bytedance.ee.eenet.p598a.C12611a;
import com.bytedance.ee.eenet.p599b.AbstractC12612a;
import com.bytedance.ee.eenet.p599b.C12613b;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.StringUtil;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.larkbrand.net.b */
public class C12843b {

    /* renamed from: a */
    public static ThreadLocal<C12611a> f34296a = new ThreadLocal<>();

    /* renamed from: b */
    private static boolean f34297b;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0129  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.Response m53045a(okhttp3.Call r27, okhttp3.Request.Builder r28, com.ss.android.lark.optrace.api.TracingCoreSpan r29, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r30) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b.m53045a(okhttp3.Call, okhttp3.Request$Builder, com.ss.android.lark.optrace.api.TracingCoreSpan, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):okhttp3.Response");
    }

    /* renamed from: a */
    private static void m53046a() {
        if (!f34297b) {
            C12613b.m52341a(new AbstractC12612a() {
                /* class com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b.C128463 */

                @Override // com.bytedance.ee.eenet.p599b.AbstractC12612a
                /* renamed from: a */
                public void mo23874a(long j, long j2, C12611a aVar) {
                    C12843b.f34296a.set(aVar);
                }

                @Override // com.bytedance.ee.eenet.p599b.AbstractC12612a
                /* renamed from: a */
                public void mo23875a(long j, long j2, C12611a aVar, Throwable th) {
                    C12843b.f34296a.set(aVar);
                }
            });
            f34297b = true;
        }
    }

    /* renamed from: a */
    public static String m53044a(List<String> list, Headers headers) {
        JSONObject jSONObject = new JSONObject();
        if (list != null && list.size() > 0 && headers != null && headers.size() > 0) {
            try {
                for (String str : headers.names()) {
                    for (String str2 : list) {
                        if (str2.equalsIgnoreCase(str)) {
                            JSONObject jSONObject2 = new JSONObject();
                            StringBuilder sb = new StringBuilder();
                            List<String> values = headers.values(str2);
                            for (int i = 0; i < values.size(); i++) {
                                String str3 = values.get(i);
                                if (!TextUtils.isEmpty(str3)) {
                                    String a = StringUtil.m52868a(str3, 2, '*', new char[]{'/', '.', '-', '_'});
                                    if (i > 0) {
                                        sb.append(";");
                                    }
                                    sb.append(a);
                                }
                            }
                            jSONObject2.put(str2, sb.toString());
                        }
                    }
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_RequestUtil", "get header kv err", e);
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static AbstractC12625f m53036a(long j, long j2, long j3) {
        return m53037a(j, j2, j3, (IAppContext) null);
    }

    /* renamed from: a */
    public static Observable<String> m53038a(String str, Map<String, String> map, JSONObject jSONObject, IAppContext iAppContext) {
        return m53039a(str, map, jSONObject, iAppContext, false);
    }

    /* renamed from: a */
    public static AbstractC12625f m53037a(long j, long j2, long j3, IAppContext iAppContext) {
        return C12837a.m53013a().mo47928a().mo47920b(j, TimeUnit.MILLISECONDS).mo47922c(j2, TimeUnit.MILLISECONDS).mo47915a(j3, TimeUnit.MILLISECONDS).mo47919a();
    }

    /* renamed from: a */
    public static String m53043a(String str, Map<String, String> map, String str2, IAppContext iAppContext) throws Exception {
        return C12837a.m53017a(str, map, new JSONObject(str2), iAppContext);
    }

    /* renamed from: a */
    public static Observable<String> m53039a(final String str, final Map<String, String> map, final JSONObject jSONObject, final IAppContext iAppContext, final boolean z) {
        return Observable.just(str).map(new Function<String, String>() {
            /* class com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b.C128452 */

            /* renamed from: a */
            public String apply(String str) throws Exception {
                return C12837a.m53018a(str, map, jSONObject, iAppContext, z);
            }
        }).subscribeOn(C68279a.m265023b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        if (r22 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b8, code lost:
        r22.mo48353a(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0104, code lost:
        if (r22 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
        return r21;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1 A[SYNTHETIC, Splitter:B:60:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9 A[Catch:{ IOException -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010c A[SYNTHETIC, Splitter:B:72:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0114 A[Catch:{ IOException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0121  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File m53042a(okhttp3.Response r20, java.io.File r21, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b r22, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c r23, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r24) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b.m53042a(okhttp3.Response, java.io.File, com.bytedance.ee.lark.infra.network.a.a.a.b, com.bytedance.ee.lark.infra.network.a.a.a.c, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):java.io.File");
    }

    /* renamed from: a */
    public static Observable<C12830f> m53040a(final String str, final Map<String, String> map, final JSONObject jSONObject, final TracingCoreSpan tracingCoreSpan, final IAppContext iAppContext, final boolean z) {
        return Observable.just(str).map(new Function<String, C12830f>() {
            /* class com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b.C128441 */

            /* renamed from: a */
            public C12830f apply(String str) throws Exception {
                return C12837a.m53016a(str, map, jSONObject, tracingCoreSpan, iAppContext, z);
            }
        }).subscribeOn(C68279a.m265023b());
    }

    /* renamed from: a */
    public static File m53041a(String str, Map<String, String> map, String str2, String str3, AbstractC12796b bVar, AbstractC12797c cVar, IAppContext iAppContext) {
        Request.Builder url = new Request.Builder().url(str);
        C12793a.m52873a(url, iAppContext, C12805d.m52895a(DependencyMgr.m52809a().mo48302c(), true, iAppContext));
        try {
            Response a = C12837a.m53020a(url, map, iAppContext);
            File file = new File(str2, str3);
            if (a != null) {
                return m53042a(a, file, bVar, cVar, iAppContext);
            }
            if (!file.exists()) {
                return file;
            }
            file.delete();
            return file;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_RequestUtil", e.getStackTrace());
            if (bVar == null) {
                return null;
            }
            bVar.mo48352a(e.getMessage(), e);
            return null;
        }
    }
}
