package com.ss.lark.android.passport.biz.compat.v1.http;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.http.model.BaseResponseModel;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.IResponseModel;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49355c;
import com.ss.android.lark.passport.signinsdk_api.base.http.C49353a;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.lark.android.passport.biz.base.p3209b.C64345a;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.ss.lark.android.passport.biz.compat.v1.http.a */
public class C64478a implements AbstractC49354b {

    /* renamed from: a */
    public static final String f162808a = "com.ss.lark.android.passport.biz.compat.v1.http.a";

    /* renamed from: b */
    public final PassportLog f162809b = PassportLog.f123351c.mo171474a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.lark.android.passport.biz.compat.v1.http.a$3 */
    public static /* synthetic */ class C644813 {

        /* renamed from: a */
        static final /* synthetic */ int[] f162820a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.http.model.http.HttpMethod[] r0 = com.ss.android.lark.http.model.http.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.lark.android.passport.biz.compat.v1.http.C64478a.C644813.f162820a = r0
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.lark.android.passport.biz.compat.v1.http.C64478a.C644813.f162820a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.lark.android.passport.biz.compat.v1.http.C64478a.C644813.f162820a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.DELETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.lark.android.passport.biz.compat.v1.http.C64478a.C644813.f162820a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.PATCH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.compat.v1.http.C64478a.C644813.<clinit>():void");
        }
    }

    /* renamed from: a */
    public RequestBody mo223085a(IRequest iRequest) {
        HttpRequestBody requestBody = iRequest.getRequestBody();
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

    /* renamed from: a */
    public Map<String, String> mo223084a(Headers headers) {
        HashMap hashMap = new HashMap();
        if (headers != null) {
            for (String str : headers.names()) {
                hashMap.put(str, headers.get(str));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private Request m253366b(IRequest iRequest) {
        if (TextUtils.isEmpty(iRequest.getPath())) {
            return null;
        }
        Request.Builder url = new Request.Builder().url(iRequest.getUrl());
        HttpHeaders buildHeaders = iRequest.buildHeaders(iRequest.getHeaders());
        if (!buildHeaders.isEmpty()) {
            for (String str : buildHeaders.getNames()) {
                try {
                    url.addHeader(str, buildHeaders.get(str));
                } catch (Exception e) {
                    if (iRequest.canLog()) {
                        PassportLog passportLog = this.f162809b;
                        String str2 = f162808a;
                        passportLog.mo171462a(str2, iRequest.getName() + " add header exception: " + str + ContainerUtils.KEY_VALUE_DELIMITER + buildHeaders.get(str), e);
                    }
                }
            }
        }
        int i = C644813.f162820a[iRequest.getMethod().ordinal()];
        if (i == 1) {
            url.get();
        } else if (i == 2) {
            url.post(mo223085a(iRequest));
        } else if (i == 3) {
            url.delete(mo223085a(iRequest));
        } else if (i == 4) {
            url.patch(mo223085a(iRequest));
        }
        return url.build();
    }

    /* renamed from: a */
    private String m253365a(IRequest iRequest, String str) {
        if (iRequest == null) {
            return str;
        }
        HttpHeaders headers = iRequest.getHeaders();
        String str2 = headers.get("X-Request-ID");
        String str3 = headers.get("X-Passport-Unit");
        String url = iRequest.getUrl();
        return "X-Request-ID:" + str2 + ", " + "unit: " + str3 + ", url:" + url + ", " + "responseBody:" + str;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b
    /* renamed from: a */
    public <D, T extends IRequest<D>> void mo145177a(final T t, final AbstractC49352d<D> dVar) {
        OkHttpClient a = C64345a.m252966a();
        final Request b = m253366b(t);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final C644791 r11 = new AbstractC49352d<D>() {
            /* class com.ss.lark.android.passport.biz.compat.v1.http.C64478a.C644791 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                if (t.canLog()) {
                    C64478a.this.mo223087a(t, b, networkErrorResult, elapsedRealtime);
                }
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145179a(D d) {
                if (t.canLog()) {
                    PassportLog passportLog = C64478a.this.f162809b;
                    String str = C64478a.f162808a;
                    passportLog.mo171465b(str, t.getHttpTag() + " request success");
                }
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a((Object) d);
                }
            }
        };
        a.newCall(b).enqueue(new Callback() {
            /* class com.ss.lark.android.passport.biz.compat.v1.http.C64478a.C644802 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                NetworkErrorResult networkErrorResult = new NetworkErrorResult(-1, iOException.toString());
                if (iOException != null && (iOException instanceof SocketTimeoutException)) {
                    networkErrorResult.setErrorType(-6);
                }
                r11.mo145178a(networkErrorResult);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                NetworkErrorResult a;
                int code = response.code();
                if (t.canLog()) {
                    C64478a.this.mo223086a(t, b, code, null, elapsedRealtime);
                }
                try {
                    t.onProcessResponseHeaders(C64478a.this.mo223084a(response.headers()));
                    String string = response.body().string();
                    AbstractC49355c responseFilter = t.getResponseFilter();
                    if (responseFilter == null || (a = responseFilter.mo172168a(new C49353a(response.code(), b.headers().get("Suite-Session-Key"), string, b.url().url().toString()))) == null) {
                        C64478a.this.mo223088a(b, t, r11, code, string, JSONObject.parseObject(string));
                    } else {
                        r11.mo145178a(a);
                    }
                } catch (Throwable th) {
                    AbstractC49352d dVar = r11;
                    dVar.mo145178a(new NetworkErrorResult(-1, "http code:" + code + " " + th.getMessage()));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo223087a(IRequest iRequest, Request request, NetworkErrorResult networkErrorResult, long j) {
        this.f162809b.mo171471d(f162808a, "X-Request-ID" + ":" + request.header("X-Request-ID") + ", request unit:" + request.header("X-Passport-Unit") + ", request url:" + request.url() + ", code:" + networkErrorResult.getErrorCode() + ", msg:" + networkErrorResult.getErrorMessage() + ", spend_time=" + (SystemClock.elapsedRealtime() - j));
    }

    /* renamed from: a */
    public void mo223086a(IRequest iRequest, Request request, int i, Throwable th, long j) {
        StringBuilder sb = new StringBuilder(iRequest.getHttpTag());
        sb.append(" ");
        sb.append("X-Request-ID");
        sb.append(":");
        sb.append(request.header("X-Request-ID"));
        sb.append(", request unit:");
        sb.append(request.header("X-Passport-Unit"));
        sb.append(", request url:");
        sb.append(request.url());
        sb.append(", statusCode:");
        sb.append(i);
        sb.append(", spend_time=");
        sb.append(SystemClock.elapsedRealtime() - j);
        if (th != null) {
            sb.append(", error:");
            sb.append(th.toString());
        }
        String sb2 = sb.toString();
        if (th == null) {
            this.f162809b.mo171465b(f162808a, sb2);
        } else {
            this.f162809b.mo171471d(f162808a, sb2);
        }
    }

    /* renamed from: a */
    public <D> void mo223088a(Request request, IRequest<D> iRequest, AbstractC49352d<D> dVar, int i, String str, JSONObject jSONObject) {
        int i2 = -2;
        String str2 = "get verify code fail";
        if (i >= 400) {
            String string = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string)) {
                str2 = string;
                i2 = i;
            }
            dVar.mo145178a(new NetworkErrorResult(i2, "http status code:" + i + " " + str2));
        } else if (i == 200) {
            D d = null;
            try {
                d = iRequest.getObjectConverter().mo107503b(str);
            } catch (Exception e) {
                if (iRequest.canLog()) {
                    PassportLog passportLog = this.f162809b;
                    String str3 = f162808a;
                    passportLog.mo171462a(str3, iRequest.getName() + " processResponse.convertResponse error", e);
                }
            }
            if (d instanceof BaseResponseModel) {
                D d2 = d;
                if (!d2.isSuccess()) {
                    dVar.mo145178a(new NetworkErrorResult(d2.getErrorCode(), d2.getErrorMessage()));
                } else {
                    dVar.mo145179a(d);
                }
            } else if (d instanceof IResponseModel) {
                D d3 = d;
                if (!d3.isSuccess()) {
                    dVar.mo145178a(new NetworkErrorResult(d3.getCode(), d3.getMessage()));
                } else {
                    dVar.mo145179a(d);
                }
            } else {
                dVar.mo145178a(new NetworkErrorResult(-1, m253365a(iRequest, str)));
            }
        } else {
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string2)) {
                str2 = string2;
                i2 = i;
            }
            dVar.mo145178a(new NetworkErrorResult(i2, "http status code: " + i + " " + str2));
        }
    }
}
