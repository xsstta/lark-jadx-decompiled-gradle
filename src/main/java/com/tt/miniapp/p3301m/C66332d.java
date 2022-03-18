package com.tt.miniapp.p3301m;

import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12825c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12826d;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapp.net.p3308a.C66498a;
import com.tt.option.p3392m.AbstractC67655b;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.tt.miniapp.m.d */
public class C66332d implements AbstractC67655b {
    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12827e convertMetaRequest(C12827e eVar) {
        return eVar;
    }

    /* renamed from: a */
    private OkHttpClient m259457a(C12827e eVar) {
        OkHttpClient a = C66517e.m259917a();
        if (eVar != null) {
            return a.newBuilder().readTimeout(eVar.mo48453p(), TimeUnit.MILLISECONDS).writeTimeout(eVar.mo48452o(), TimeUnit.MILLISECONDS).connectTimeout(eVar.mo48451n(), TimeUnit.MILLISECONDS).build();
        }
        return a;
    }

    /* renamed from: a */
    private void m259458a(Map<String, String> map, Request.Builder builder) {
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.removeHeader(entry.getKey());
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doGet(C12827e eVar, IAppContext iAppContext) throws Exception {
        OkHttpClient a = m259457a(eVar);
        Request.Builder builder = new Request.Builder();
        m259458a(eVar.mo48449l(), builder);
        builder.url(eVar.mo48450m());
        Response execute = a.newCall(builder.build()).execute();
        C12830f fVar = new C12830f(iAppContext);
        if (execute != null) {
            fVar.mo48459a(execute.code());
            fVar.mo48460a(execute.message());
            if (execute.body() != null) {
                fVar.mo48464b(execute.body().string());
            }
        }
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doPostBody(C12827e eVar, IAppContext iAppContext) throws Exception {
        OkHttpClient a = m259457a(eVar);
        Request.Builder builder = new Request.Builder();
        m259458a(eVar.mo48449l(), builder);
        builder.post(RequestBody.create(MediaType.parse("application/json"), eVar.mo48444g()));
        builder.url(eVar.mo48450m());
        Response execute = a.newCall(builder.build()).execute();
        C12830f fVar = new C12830f(iAppContext);
        if (execute != null) {
            fVar.mo48459a(execute.code());
            fVar.mo48460a(execute.message());
            if (execute.body() != null) {
                fVar.mo48464b(execute.body().string());
            }
        }
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doPostUrlEncoded(C12827e eVar, IAppContext iAppContext) throws Exception {
        OkHttpClient a = m259457a(eVar);
        Request.Builder builder = new Request.Builder();
        m259458a(eVar.mo48449l(), builder);
        builder.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), eVar.mo48447j()));
        builder.url(eVar.mo48450m());
        Response execute = a.newCall(builder.build()).execute();
        C12830f fVar = new C12830f(iAppContext);
        if (execute != null) {
            fVar.mo48459a(execute.code());
            fVar.mo48460a(execute.message());
            if (execute.body() != null) {
                fVar.mo48464b(execute.body().string());
            }
        }
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doRequest(C12827e eVar, IAppContext iAppContext) throws Exception {
        OkHttpClient a = m259457a(eVar);
        Request.Builder builder = new Request.Builder();
        m259458a(eVar.mo48449l(), builder);
        byte[] h = eVar.mo48445h();
        if (h == null) {
            h = new byte[0];
        }
        RequestBody create = RequestBody.create(MediaType.parse(eVar.mo48446i()), h);
        if (!"GET".equals(eVar.mo48454q())) {
            if ("POST".equals(eVar.mo48454q())) {
                builder.post(create);
            } else if ("PUT".equals(eVar.mo48454q())) {
                builder.put(create);
            } else if ("DELETE".equals(eVar.mo48454q())) {
                builder.delete(create);
            } else {
                builder.method(eVar.mo48454q(), create);
            }
        }
        builder.url(eVar.mo48450m());
        Response execute = a.newCall(builder.build()).execute();
        C12830f fVar = new C12830f(iAppContext);
        if (execute != null) {
            fVar.mo48459a(execute.code());
            Headers headers = execute.headers();
            if (headers != null) {
                ArrayList<C12826d> h2 = fVar.mo48470h();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    h2.add(new C12826d(headers.name(i), headers.value(i)));
                }
            }
            fVar.mo48460a(execute.message());
            if (execute.body() != null) {
                fVar.mo48462a(execute.body().bytes());
            }
        }
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f postMultiPart(C12827e eVar, IAppContext iAppContext) throws Exception {
        OkHttpClient a = m259457a(eVar);
        Request.Builder builder = new Request.Builder();
        m259458a(eVar.mo48449l(), builder);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (Map.Entry<String, Object> entry : eVar.mo48443f().entrySet()) {
            type.addFormDataPart(entry.getKey(), entry.getValue().toString());
        }
        for (Map.Entry<String, C12827e.C12829b> entry2 : eVar.mo48448k().entrySet()) {
            C12827e.C12829b value = entry2.getValue();
            type.addFormDataPart(entry2.getKey(), value.mo48457a().getName(), RequestBody.create(MediaType.parse(value.mo48458b()), value.mo48457a()));
        }
        builder.post(type.build());
        builder.url(eVar.mo48450m());
        Response execute = a.newCall(builder.build()).execute();
        C12830f fVar = new C12830f(iAppContext);
        if (execute != null) {
            fVar.mo48459a(execute.code());
            fVar.mo48460a(execute.message());
            if (execute.body() != null) {
                fVar.mo48464b(execute.body().string());
            }
        }
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12825c downloadFile(C12824b bVar, final AbstractC67655b.AbstractC67656a aVar, IAppContext iAppContext) {
        File file = new File(bVar.mo48419c());
        if (!file.exists()) {
            file.mkdirs();
        }
        final C12825c cVar = new C12825c(iAppContext);
        cVar.mo48422a(C66498a.m259867a(bVar.mo48450m(), bVar.mo48449l(), bVar.mo48419c(), bVar.mo48420d(), new AbstractC12795a() {
            /* class com.tt.miniapp.p3301m.C66332d.C663331 */

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48353a(Response response) {
                if (response != null) {
                    cVar.mo48459a(response.code());
                    cVar.mo48460a(response.message());
                }
                aVar.mo49677a(100, -1, -1);
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48352a(String str, Throwable th) {
                cVar.mo48460a(str);
                cVar.mo48461a(th);
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48351a(int i, long j, long j2) {
                aVar.mo49677a(i, j, j2);
            }
        }, null, iAppContext));
        return cVar;
    }
}
