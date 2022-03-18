package com.bytedance.ee.bear.net;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.bear.net.k */
class C10290k implements Callback {

    /* renamed from: a */
    private C10291l f27773a;

    /* renamed from: b */
    private AbstractC10297r f27774b;

    /* renamed from: a */
    private String m42893a(Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private RequestBody m42894a(String str) {
        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39305a(AbstractC10289j jVar) {
        this.f27773a.mo39306a().newCall(m42896b(jVar)).enqueue(this);
    }

    /* renamed from: b */
    private Request m42896b(AbstractC10289j jVar) {
        Request.Builder builder = new Request.Builder();
        builder.url(jVar.mo39257a());
        if (jVar.mo39258b() == 1) {
            builder.post(m42895a(jVar.mo39259c(), jVar.mo39261e()));
        } else if (jVar.mo39258b() == 2) {
            builder.get();
        }
        Map<String, String> d = jVar.mo39260d();
        if (d != null) {
            for (Map.Entry<String, String> entry : d.entrySet()) {
                builder.header(entry.getKey(), entry.getValue());
            }
        }
        if (!TextUtils.isEmpty(jVar.mo39262f())) {
            builder.post(m42894a(jVar.mo39262f()));
        }
        return builder.build();
    }

    C10290k(C10291l lVar, AbstractC10297r rVar) {
        this.f27774b = rVar;
        this.f27773a = lVar;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        this.f27774b.mo39256a(iOException);
    }

    /* renamed from: a */
    private RequestBody m42895a(Map<String, String> map, Map<String, List<String>> map2) {
        FormBody.Builder builder = new FormBody.Builder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.add(entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null) {
            for (String str : map2.keySet()) {
                List<String> list = map2.get(str);
                if (map != null) {
                    for (String str2 : list) {
                        builder.add(str, str2);
                    }
                }
            }
        }
        return builder.build();
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        String str;
        int code = response.code();
        this.f27774b.mo39254a(code);
        if (call.request() != null) {
            str = String.valueOf(call.request().url());
        } else {
            str = "";
        }
        String a = m42893a(response);
        C13479a.m54772d("OkHttpDataLoader", "onResponse() url = " + str + ", code = " + code + ", responseStr = " + a + ", responseHeaders = " + response.headers());
        if (TextUtils.isEmpty(a) || code != 200) {
            this.f27774b.mo39256a(new HttpException(code, a));
        } else {
            this.f27774b.mo39255a(new C10292m(str, a, response.headers().toMultimap()));
        }
    }
}
