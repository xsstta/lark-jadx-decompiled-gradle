package com.bytedance.ee.lark.infra.network.larkbrand.net;

import com.bytedance.ee.eenet.AbstractC12610a;
import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.eenet.httpclient.C12618c;
import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.eenet.util.HttpChannel;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.foundation.utils.C12788f;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.network.p633e.C12834a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.pb.basic.v1.SetEnvRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.larkbrand.net.a */
public class C12837a {

    /* renamed from: a */
    public static boolean f34291a = false;

    /* renamed from: b */
    private static AtomicReference<AbstractC12625f> f34292b = new AtomicReference<>(null);

    /* renamed from: c */
    private static final List<Interceptor> f34293c = new ArrayList();

    /* renamed from: a */
    public static void m53022a(List<Interceptor> list) {
        f34293c.addAll(list);
    }

    /* renamed from: a */
    private static void m53023a(Map<String, String> map, Request.Builder builder) {
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.removeHeader(entry.getKey());
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public static AbstractC12625f m53013a() {
        m53026b();
        return f34292b.get();
    }

    /* renamed from: b */
    private static void m53026b() {
        if (DependencyMgr.m52809a().mo48304e() == null) {
            AppBrandLogger.m52830i("MiniHttpClient", "applicationcontext is null");
        }
        OkHttpClient.Builder connectTimeout = DependencyMgr.m52811b().mo48310b().newBuilder().readTimeout(15000, TimeUnit.MILLISECONDS).writeTimeout(15000, TimeUnit.MILLISECONDS).connectTimeout(15000, TimeUnit.MILLISECONDS);
        List<Interceptor> list = f34293c;
        if (!list.isEmpty()) {
            for (Interceptor interceptor : list) {
                connectTimeout.addNetworkInterceptor(interceptor);
            }
        }
        OkHttpClient build = connectTimeout.build();
        if (DependencyMgr.m52809a().mo48304e() != null && C12788f.m52855a(C12788f.m52856b(DependencyMgr.m52809a().mo48304e()))) {
            if (f34292b.get() == null) {
                C12617b.m52358a();
                if (!C12782a.m52839b("force_net_okhttp", false)) {
                    AppBrandLogger.m52830i("MiniHttpClient", "current channel: rust channel", Boolean.valueOf(f34291a));
                    C12617b.m52359a(new AbstractC12610a() {
                        /* class com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a.C128381 */

                        @Override // com.bytedance.ee.eenet.AbstractC12610a
                        /* renamed from: a */
                        public boolean mo23877a() {
                            return C12837a.f34291a;
                        }
                    });
                    C12617b.m52360a(HttpChannel.RustChannel);
                } else {
                    C12617b.m52360a(HttpChannel.OkHttpChannel);
                    AppBrandLogger.m52830i("MiniHttpClient", "current channel: okhttp");
                }
                f34292b.compareAndSet(null, C12617b.m52357a(build));
            }
            AppBrandLogger.m52830i("MiniHttpClient", "current channel: ", C12617b.m52367d().toString(), "rust init:", Boolean.valueOf(f34291a));
        } else if (f34292b.get() == null) {
            f34292b.set(C12617b.m52366c(build.newBuilder()));
            AppBrandLogger.m52830i("MiniHttpClient", "not mini process set current channel :ok http ");
        } else if (f34292b.get() instanceof C12618c) {
            f34292b.set(C12617b.m52366c(build.newBuilder()));
            AppBrandLogger.m52830i("MiniHttpClient", "not mini process and not ok http channel,force change ok http!");
        } else {
            AppBrandLogger.m52830i("MiniHttpClient", "not mini process and already ok http channel!");
        }
    }

    /* renamed from: a */
    public static void m53024a(boolean z) {
        f34291a = z;
    }

    /* renamed from: a */
    public static void m53021a(final int i) {
        SetEnvRequest.C15268a a = new SetEnvRequest.C15268a().mo55574a(InitSDKRequest.EnvType.fromValue(i));
        String a2 = C53234a.m205877a();
        AppBrandLogger.m52830i("MiniHttpClient", "StoreRust setEnv env = " + i, ", contextId = " + a2);
        SdkSender.asynSendRequestNonWrap(Command.SET_ENV, a, a2, new IGetDataCallback<String>() {
            /* class com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a.C128392 */

            /* renamed from: a */
            public void onSuccess(String str) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppBrandLogger.m52830i("MiniHttpClient", "StoreRust setEnv env = " + i, ",err = " + errorResult.toString());
            }
        }, new SdkSender.IParser<String>() {
            /* class com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a.C128403 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }

    /* renamed from: a */
    public static Response m53020a(Request.Builder builder, Map<String, String> map, IAppContext iAppContext) throws IOException {
        m53026b();
        return m53019a((Call) null, builder, map, iAppContext);
    }

    /* renamed from: a */
    public static String m53017a(String str, Map<String, String> map, JSONObject jSONObject, IAppContext iAppContext) throws IOException {
        return m53018a(str, map, jSONObject, iAppContext, false);
    }

    /* renamed from: a */
    public static Response m53019a(Call call, Request.Builder builder, Map<String, String> map, IAppContext iAppContext) throws IOException {
        Response response;
        m53026b();
        System.currentTimeMillis();
        m53023a(map, builder);
        builder.addHeader("called_from", "miniapp");
        Request build = builder.build();
        try {
            for (String str : build.headers().names()) {
                if ("Cookie".equalsIgnoreCase(str)) {
                    C12834a.m53003a(build.url().toString(), build.header(str));
                }
            }
            AppBrandLogger.m52830i("MiniHttpClient", "method ", build.method(), "url:", build.url().toString());
            if (call != null) {
                response = call.execute();
            } else {
                response = f34292b.get().mo47928a().mo47919a().newCall(build).execute();
            }
            int code = response.code();
            C12834a.m53002a(iAppContext, build, response);
            AppBrandLogger.m52830i("MiniHttpClient", "mini request success", "url", build.url().toString(), "http code:", Integer.valueOf(code));
            AppBrandLogger.m52830i("MiniHttpClient", "mini request success", Integer.valueOf(code), build.url());
            return response;
        } catch (RustIOException e) {
            AppBrandLogger.m52829e("MiniHttpClient", "mini request fail", Integer.valueOf(e.getRustSdkErrorCode()), build.url(), e);
            throw e;
        } catch (IOException e2) {
            AppBrandLogger.m52829e("MiniHttpClient", "mini request fail", -1, build.url(), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0112, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0114, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0115, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0129, code lost:
        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e("MiniHttpClient", "mini request fail", java.lang.Integer.valueOf(r0.getRustSdkErrorCode()), r16, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0128 A[ExcHandler: RustIOException (r0v1 'e' com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0022] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f m53014a(java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, com.ss.android.lark.optrace.api.TracingCoreSpan r18, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r19) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a.m53014a(java.lang.String, java.util.Map, com.ss.android.lark.optrace.api.TracingCoreSpan, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):com.bytedance.ee.lark.infra.network.c.a.f");
    }

    /* renamed from: b */
    public static C12830f m53025b(String str, Map<String, String> map, JSONObject jSONObject, IAppContext iAppContext, boolean z) throws IOException {
        return m53016a(str, map, jSONObject, null, iAppContext, z);
    }

    /* renamed from: a */
    public static C12830f m53015a(String str, Map<String, String> map, JSONObject jSONObject, TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) throws IOException {
        return m53016a(str, map, jSONObject, tracingCoreSpan, iAppContext, false);
    }

    /* renamed from: a */
    public static String m53018a(String str, Map<String, String> map, JSONObject jSONObject, IAppContext iAppContext, boolean z) throws IOException {
        return m53025b(str, map, jSONObject, iAppContext, z).mo48466d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0197, code lost:
        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e("MiniHttpClient", "mini request fail", "errorcode:", java.lang.Integer.valueOf(r0.getRustSdkErrorCode()), r17, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        r2 = 4;
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0032 A[ExcHandler: RustIOException (r0v15 'e' com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException A[CUSTOM_DECLARE]), Splitter:B:2:0x0026] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f m53016a(java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, org.json.JSONObject r19, com.ss.android.lark.optrace.api.TracingCoreSpan r20, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r21, boolean r22) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a.m53016a(java.lang.String, java.util.Map, org.json.JSONObject, com.ss.android.lark.optrace.api.TracingCoreSpan, com.bytedance.ee.lark.infra.sandbox.context.IAppContext, boolean):com.bytedance.ee.lark.infra.network.c.a.f");
    }
}
