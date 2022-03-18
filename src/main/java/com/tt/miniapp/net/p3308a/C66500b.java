package com.tt.miniapp.net.p3308a;

import android.util.Log;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.cookie.p618c.C12760a;
import com.bytedance.ee.lark.infra.cookie.p620e.C12763a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.larkbrand.net.p634a.C12841a;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.network.p622a.p623a.AbstractC12794a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.p3371e.C67515e;
import com.tt.refer.impl.business.api.diagnose.entity.C67893b;
import com.tt.refer.impl.business.api.diagnose.entity.C67894c;
import com.tt.refer.impl.business.api.diagnose.entity.C67895d;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.AbstractC69698d;
import okio.AbstractC69723u;
import okio.C69694c;
import okio.C69705k;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.a.b */
public final class C66500b {

    /* renamed from: com.tt.miniapp.net.a.b$a */
    public interface AbstractC66503a<T> {
        /* renamed from: a */
        void mo232075a(int i);

        /* renamed from: a */
        void mo232076a(int i, String str, String str2);

        /* renamed from: a */
        void mo232077a(long j, long j2);
    }

    /* renamed from: a */
    private static SparseArray<SoftReference<Call>> m259874a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().mo234310d();
    }

    /* renamed from: a */
    public static void m259876a(int i, IAppContext iAppContext) {
        Call call;
        SparseArray<SoftReference<Call>> a = m259874a(iAppContext);
        if (a.get(i) != null && (call = a.get(i).get()) != null) {
            call.cancel();
        }
    }

    /* renamed from: a */
    public static <T> void m259878a(long j, long j2, AbstractC66503a<T> aVar) {
        if (aVar != null) {
            aVar.mo232077a(j, j2);
        }
    }

    /* renamed from: a */
    public static void m259879a(AbstractC66503a aVar, Call call, int i, IAppContext iAppContext) {
        if (aVar != null) {
            if (call == null || !call.isCanceled()) {
                aVar.mo232075a(1000);
            } else {
                aVar.mo232075a(CommonCode.StatusCode.API_CLIENT_EXPIRED);
            }
            m259874a(iAppContext).remove(i);
        }
    }

    /* renamed from: a */
    public static void m259877a(int i, String str, String str2, AbstractC66503a aVar, int i2) {
        if (aVar != null) {
            aVar.mo232076a(i, str, str2);
        }
    }

    /* renamed from: a */
    public static <T> RequestBody m259875a(final IAppContext iAppContext, final MediaType mediaType, final File file, final AbstractC66503a<T> aVar, final int i) {
        return new RequestBody() {
            /* class com.tt.miniapp.net.p3308a.C66500b.C665022 */

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return file.length();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(AbstractC69698d dVar) throws IOException {
                try {
                    AbstractC69723u a = C69705k.m267595a(file);
                    C69694c cVar = new C69694c();
                    long contentLength = contentLength();
                    long j = 0;
                    while (true) {
                        long read = a.read(cVar, 2048);
                        if (read != -1) {
                            dVar.write(cVar, read);
                            j += read;
                            C66500b.m259878a(contentLength, j, aVar);
                        } else {
                            return;
                        }
                    }
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_UploadManager", e.getStackTrace());
                    C66500b.m259879a(aVar, null, i, iAppContext);
                }
            }
        };
    }

    /* renamed from: a */
    public static <T> void m259880a(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, final AbstractC66503a<T> aVar, final int i, final TracingCoreSpan tracingCoreSpan, final IAppContext iAppContext) {
        String str2;
        long j;
        String str3;
        try {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            builder.setType(MultipartBody.FORM);
            ArrayList arrayList = new ArrayList();
            final int i2 = 0;
            for (String str4 : hashMap2.keySet()) {
                Object obj = hashMap2.get(str4);
                if (!(obj instanceof File)) {
                    builder.addFormDataPart(str4, obj.toString());
                } else {
                    File file = (File) obj;
                    i2 = (int) (((long) i2) + file.length());
                    arrayList.add(MultipartBody.Part.createFormData(str4, file.getName(), m259875a(iAppContext, MediaType.parse("application/octet-stream"), file, aVar, i)));
                }
            }
            AppBrandLogger.m52830i("tma_UploadManager", "upload param keys:", hashMap2.keySet());
            if (!arrayList.isEmpty()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    builder.addPart((MultipartBody.Part) arrayList.get(i3));
                }
            }
            MultipartBody build = builder.build();
            Request.Builder url = new Request.Builder().url(str);
            String str5 = "";
            if (hashMap != null) {
                str2 = str5;
                for (String str6 : hashMap.keySet()) {
                    String str7 = hashMap.get(str6);
                    url.addHeader(str6, str7);
                    if (str6.equalsIgnoreCase(ConvertOfficeToSpaceService.f88309g)) {
                        str2 = str7;
                    }
                }
            } else {
                str2 = str5;
            }
            C12793a.m52873a(url, iAppContext, tracingCoreSpan);
            Request build2 = url.post(build).build();
            AppConfig appConfig = AppbrandApplicationImpl.getInst(iAppContext).getAppConfig();
            if (appConfig != null) {
                j = appConfig.mo230046g().f34174b;
            } else {
                j = 60000;
            }
            OkHttpClient.Builder newBuilder = C66517e.m259917a().newBuilder();
            if (C12763a.m52781a(iAppContext.getAppId())) {
                AppCookieJarMgr aVar2 = AppCookieJarMgr.f34120a;
                CookieJar a = AppCookieJarMgr.m52756a(iAppContext, C67515e.m262603a(iAppContext));
                if (a != null) {
                    newBuilder.cookieJar(a);
                } else {
                    Object[] objArr = new Object[2];
                    objArr[0] = "cookie jar is null! app id:";
                    if (iAppContext.getAppId() != null) {
                        str3 = iAppContext.getAppId();
                    } else {
                        str3 = str5;
                    }
                    objArr[1] = str3;
                    AppBrandLogger.m52829e("tma_UploadManager", objArr);
                }
            }
            Call newCall = newBuilder.addInterceptor(new C12760a(str2)).connectTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).build().newCall(build2);
            final long currentTimeMillis = System.currentTimeMillis();
            LarkInnerEventHelper.mpRequestUploadStart(tracingCoreSpan, newCall.request().method(), newCall.request().url().encodedPath(), newCall.request().url().host(), iAppContext);
            List<String> a2 = C12841a.m53030a().mo48476a(iAppContext.getAppId());
            final List<String> b = C12841a.m53030a().mo48478b(iAppContext.getAppId());
            final String a3 = C12843b.m53044a(a2, newCall.request().headers());
            if (C67893b.m264178a(iAppContext).mo235551a()) {
                String httpUrl = build2.url().toString();
                String method = build2.method();
                Headers headers = build2.headers();
                if (tracingCoreSpan != null) {
                    str5 = tracingCoreSpan.getRequestId();
                }
                C67893b.m264178a(iAppContext).mo235549a(iAppContext, new C67894c(httpUrl, method, headers, "", str5));
            }
            AppBrandLogger.m52830i("tma_UploadManager", "upload file http request start");
            newCall.enqueue(new AbstractC12794a() {
                /* class com.tt.miniapp.net.p3308a.C66500b.C665011 */

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    AppBrandLogger.m52829e("tma_UploadManager", "onFailure ", Log.getStackTraceString(iOException));
                    C66500b.m259879a(aVar, call, i, iAppContext);
                    TracingCoreSpan tracingCoreSpan = tracingCoreSpan;
                    String method = call.request().method();
                    String encodedPath = call.request().url().encodedPath();
                    String host = call.request().url().host();
                    LarkInnerEventHelper.mpRequestUploadResult(tracingCoreSpan, method, encodedPath, host, "fail", "upload", 70001, "upload error: " + iOException.getMessage(), null, System.currentTimeMillis() - currentTimeMillis, -1, (long) i2, a3, null, iAppContext);
                }

                @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.AbstractC12794a
                /* renamed from: a */
                public void mo48350a(Call call, Response response) throws IOException {
                    String str;
                    Exception e;
                    String a = C12843b.m53044a(b, response.headers());
                    if (response.body() == null) {
                        AppBrandLogger.m52829e("tma_UploadManager", "upload success but response.body() == null");
                        C66500b.m259879a(aVar, call, i, iAppContext);
                        LarkInnerEventHelper.mpRequestUploadResult(tracingCoreSpan, call.request().method(), call.request().url().encodedPath(), call.request().url().host(), "fail", "upload", 70002, "response body is null", null, System.currentTimeMillis() - currentTimeMillis, response.code(), (long) i2, a3, a, iAppContext);
                        return;
                    }
                    String string = response.body().string();
                    Headers headers = response.headers();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (headers != null && headers.size() > 0) {
                            int size = headers.size();
                            for (int i = 0; i < size; i++) {
                                jSONObject.put(headers.name(i), headers.value(i));
                            }
                        }
                        AppBrandLogger.m52830i("tma_UploadManager", "upload success:code:", Integer.valueOf(response.code()));
                        C66500b.m259877a(response.code(), string, jSONObject.toString(), aVar, i);
                        str = "tma_UploadManager";
                        try {
                            LarkInnerEventHelper.mpRequestUploadResult(tracingCoreSpan, call.request().method(), call.request().url().encodedPath(), call.request().url().host(), "success", "upload", 0, null, null, System.currentTimeMillis() - currentTimeMillis, response.code(), (long) i2, a3, a, iAppContext);
                            if (C67893b.m264178a(iAppContext).mo235551a()) {
                                C67893b.m264178a(iAppContext).mo235550a(iAppContext, new C67895d(call.request().url().toString(), response.code(), response.headers(), string));
                            }
                        } catch (Exception e2) {
                            e = e2;
                            AppBrandLogger.stacktrace(6, str, e.getStackTrace());
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str = "tma_UploadManager";
                        AppBrandLogger.stacktrace(6, str, e.getStackTrace());
                    }
                }
            });
            m259874a(iAppContext).put(i, new SoftReference<>(newCall));
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_UploadManager", e.getStackTrace());
            m259879a(aVar, null, i, iAppContext);
        }
    }
}
