package com.ss.android.lark.http.okhttp;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.http.base.BaseRequest;
import com.ss.android.lark.http.model.ErrorResult;
import com.ss.android.lark.http.model.http.AbstractC38765a;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpParams;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.p1953b.C38762c;
import com.ss.android.lark.http.p1953b.C38763d;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public abstract class BaseOkHttpRequest<T> extends BaseRequest<T> {
    private static final String TAG = "com.ss.android.lark.http.okhttp.BaseOkHttpRequest";
    private HttpHeaders mHttpHeaders = new HttpHeaders();
    private HttpParams mHttpParams = new HttpParams();

    public abstract String getBaseUrl();

    public abstract String getHttpTag();

    public abstract AbstractC38775a getResponseFilter();

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpHeaders getHeaders() {
        return this.mHttpHeaders;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpParams getHttpParams() {
        return this.mHttpParams;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public String getUrl() {
        return buildUrl();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.http.okhttp.BaseOkHttpRequest$2 */
    public static /* synthetic */ class C387742 {

        /* renamed from: a */
        static final /* synthetic */ int[] f99709a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.http.model.http.HttpMethod[] r0 = com.ss.android.lark.http.model.http.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.http.okhttp.BaseOkHttpRequest.C387742.f99709a = r0
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.http.okhttp.BaseOkHttpRequest.C387742.f99709a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.http.okhttp.BaseOkHttpRequest.C387742.<clinit>():void");
        }
    }

    private String buildUrl() {
        return C38763d.m153061a(getBaseUrl() + getPath(), this.mHttpParams.urlParamsMap);
    }

    public RequestBody buildBody() {
        HttpRequestBody requestBody = getRequestBody();
        if (requestBody == null) {
            return null;
        }
        try {
            return RequestBody.create(MediaType.parse(requestBody.getMediaType()), requestBody.getContent());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Request buildRequest() {
        if (TextUtils.isEmpty(getPath())) {
            return null;
        }
        Request.Builder url = new Request.Builder().url(buildUrl());
        HttpHeaders buildHeaders = buildHeaders(this.mHttpHeaders);
        if (!buildHeaders.isEmpty()) {
            for (String str : buildHeaders.getNames()) {
                url.addHeader(str, buildHeaders.get(str));
            }
        }
        int i = C387742.f99709a[getMethod().ordinal()];
        if (i == 1) {
            url.get();
        } else if (i == 2) {
            url.post(buildBody());
        }
        return url.build();
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpHeaders buildHeaders(HttpHeaders httpHeaders) {
        httpHeaders.put("X-Request-ID", C38762c.m153059a());
        return httpHeaders;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public void request(final AbstractC38765a<T> aVar) {
        OkHttpClient a = C38776b.m153085a();
        final Request buildRequest = buildRequest();
        a.newCall(buildRequest).enqueue(new Callback() {
            /* class com.ss.android.lark.http.okhttp.BaseOkHttpRequest.C387731 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                AbstractC38765a aVar = aVar;
                if (aVar != null) {
                    aVar.mo50780a(new ErrorResult(-1, 0, iOException.getMessage()));
                }
                BaseOkHttpRequest.this.logRequest(buildRequest, 0, iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                int code = response.code();
                BaseOkHttpRequest.this.logRequest(buildRequest, code, null);
                try {
                    AbstractC38775a responseFilter = BaseOkHttpRequest.this.getResponseFilter();
                    if (responseFilter != null) {
                        Request request = buildRequest;
                        ErrorResult a = responseFilter.mo142134a(request, response, request.url().url().toString());
                        if (a != null) {
                            aVar.mo50780a(a);
                            return;
                        }
                    }
                    String string = response.body().string();
                    BaseOkHttpRequest.this.processResponse(aVar, code, string, JSONObject.parseObject(string));
                } catch (Exception e) {
                    AbstractC38765a aVar = aVar;
                    aVar.mo50780a(new ErrorResult(-1, code, "http code:" + code + " " + e.getMessage()));
                } catch (Throwable th) {
                    AbstractC38765a aVar2 = aVar;
                    aVar2.mo50780a(new ErrorResult(-1, code, "http code:" + code + " " + th.getMessage()));
                }
            }
        });
    }

    private String buildErrorResponseData(BaseOkHttpRequest baseOkHttpRequest, String str) {
        if (baseOkHttpRequest == null) {
            return str;
        }
        String str2 = baseOkHttpRequest.getHeaders().get("X-Request-ID");
        String url = baseOkHttpRequest.getUrl();
        return "X-Request-ID:" + str2 + ", " + "url:" + url + ", " + "responseBody:" + str;
    }

    public void logRequest(Request request, int i, Throwable th) {
        StringBuilder sb = new StringBuilder("X-Request-ID");
        sb.append(":");
        sb.append(request.header("X-Request-ID"));
        sb.append(", request url:");
        sb.append(request.url().toString());
        sb.append(", statusCode:" + i);
        if (th == null) {
            Log.i(getHttpTag(), sb.toString());
        } else {
            Log.e(getHttpTag(), sb.toString(), th);
        }
    }

    public void processResponse(AbstractC38765a<T> aVar, int i, String str, JSONObject jSONObject) {
        String str2;
        int i2 = -2;
        int i3 = -3;
        if (i >= 400) {
            String string = jSONObject.getString("message");
            if (TextUtils.isEmpty(string)) {
                string = "http status code:" + i + " get verify code fail";
            } else {
                i2 = -3;
            }
            aVar.mo50780a(new ErrorResult(i2, i, string));
        } else if (i == 200) {
            T t = null;
            try {
                t = getObjectConverter().mo107503b(str);
            } catch (Exception unused) {
                aVar.mo50780a(new ErrorResult(-1, i, buildErrorResponseData(this, str)));
            }
            T t2 = t;
            if (t2 == null || !t2.isSuccess()) {
                if (t2 == null) {
                    i3 = -1;
                }
                if (t2 == null) {
                    str2 = "base model is null";
                } else {
                    str2 = t2.getErrorMessage();
                }
                ErrorResult errorResult = new ErrorResult(i3, i, str2);
                errorResult.setResponseModel(t2);
                aVar.mo50780a(errorResult);
                return;
            }
            aVar.mo50782a(t);
        } else {
            String string2 = jSONObject.getString("message");
            if (TextUtils.isEmpty(string2)) {
                string2 = "http status code:" + i + " get verify code fail";
            } else {
                i2 = -3;
            }
            aVar.mo50780a(new ErrorResult(i2, i, string2));
        }
    }
}
