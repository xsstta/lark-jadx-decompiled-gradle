package com.larksuite.framework.http.p1186a;

import android.text.TextUtils;
import com.larksuite.framework.http.p1188c.AbstractC25998b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.response.AbstractC26016b;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.http.response.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Response;

/* renamed from: com.larksuite.framework.http.a.b */
public class C25984b {

    /* renamed from: com.larksuite.framework.http.a.b$a */
    public static class C25986a<T> {

        /* renamed from: a */
        T f64333a;

        /* renamed from: b */
        ErrorResult f64334b;

        public C25986a(ErrorResult errorResult) {
            this.f64334b = errorResult;
        }

        public C25986a(T t) {
            this.f64333a = t;
        }
    }

    /* renamed from: a */
    private static Map<String, String> m94075a(Response response) {
        HashMap hashMap = new HashMap();
        Headers headers = response.headers();
        if (headers != null) {
            for (String str : headers.names()) {
                List<String> values = headers.values(str);
                if (CollectionUtils.isNotEmpty(values)) {
                    hashMap.put(str, values.get(0));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m94074a(C26010a aVar, String str) {
        if (aVar == null) {
            return str;
        }
        String str2 = aVar.mo92486h().get("X-BaseRequest-ID");
        String c = aVar.mo92480c();
        return "X-BaseRequest-ID" + str2 + ", " + "url:" + c + ", " + "responseBody:" + str;
    }

    /* renamed from: a */
    public static void m94076a(C26010a aVar, int i, String str) {
        StringBuilder sb = new StringBuilder("X-BaseRequest-ID");
        sb.append(":");
        sb.append(aVar.mo92486h().get("X-BaseRequest-ID"));
        sb.append(", request url:");
        sb.append(aVar.mo92480c());
        sb.append(", statusCode:" + i);
        if (str == null) {
            Log.m165389i(aVar.mo92485g(), sb.toString());
        } else {
            Log.m165384e(aVar.mo92485g(), sb.toString(), new RuntimeException(str));
        }
    }

    /* renamed from: a */
    public static <T> C25986a<T> m94073a(Class<T> cls, String str, C26010a<T> aVar, final Response response) {
        ErrorResult a;
        int code = response.code();
        BaseResponse baseResponse = new BaseResponse(response.code(), m94075a(response), new BaseResponse.AbstractC26013a() {
            /* class com.larksuite.framework.http.p1186a.C25984b.C259851 */

            @Override // com.larksuite.framework.http.response.BaseResponse.AbstractC26013a
            /* renamed from: a */
            public String mo92409a() throws IOException {
                return response.body().string();
            }

            @Override // com.larksuite.framework.http.response.BaseResponse.AbstractC26013a
            /* renamed from: b */
            public InputStream mo92410b() {
                return response.body().byteStream();
            }

            @Override // com.larksuite.framework.http.response.BaseResponse.AbstractC26013a
            /* renamed from: c */
            public byte[] mo92411c() throws IOException {
                return response.body().bytes();
            }
        });
        AbstractC26016b j = aVar.mo92488j();
        if (j != null && (a = j.mo92520a(str, baseResponse)) != null) {
            return new C25986a<>(a);
        }
        if (code < C25987c.f64335a || code >= C25987c.f64338d) {
            String str2 = null;
            try {
                str2 = baseResponse.message();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int i = -3;
            if (TextUtils.isEmpty(str2)) {
                str2 = "http status code:" + code + " server error";
                i = -2;
            }
            return new C25986a<>(new ErrorResult(i, code, str2));
        }
        if (cls != BaseResponse.class) {
            try {
                AbstractC25998b<T> d = aVar.mo92481d();
                if (d != null) {
                    baseResponse = d.mo92426a(baseResponse.message());
                }
            } catch (Throwable th) {
                return new C25986a<>(new ErrorResult(-1, code, m94074a(aVar, th.getMessage())));
            }
        }
        return new C25986a<>(baseResponse);
    }
}
