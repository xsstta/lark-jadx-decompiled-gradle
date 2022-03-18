package com.ss.android.lark.integrator.passport.lazy.init;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.http.model.BaseResponseModel;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.passport.biz_variant.BdTuringHelper;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.IResponseModel;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49355c;
import com.ss.android.lark.passport.signinsdk_api.base.http.C49353a;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.LinkedHashMap;
import okio.ByteString;

/* renamed from: com.ss.android.lark.integrator.passport.lazy.init.e */
public class C39985e implements AbstractC49354b {

    /* renamed from: a */
    public static final PassportLog f101702a = PassportLog.f123351c.mo171474a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.passport.lazy.init.e$4 */
    public static /* synthetic */ class C399894 {

        /* renamed from: a */
        static final /* synthetic */ int[] f101716a;

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
                com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399894.f101716a = r0
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399894.f101716a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399894.f101716a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.PATCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399894.f101716a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.DELETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399894.<clinit>():void");
        }
    }

    /* renamed from: a */
    private boolean m158621a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == null || jSONObject.getIntValue("code") != 4233) {
            return false;
        }
        BdTuringHelper.m192816a(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
        return true;
    }

    /* renamed from: a */
    private SendHttpRequest.C15253a m158619a(IRequest iRequest) {
        if (!TextUtils.isEmpty(iRequest.getPath())) {
            SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
            aVar.mo55528a(iRequest.getUrl());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HttpHeaders buildHeaders = iRequest.buildHeaders(iRequest.getHeaders());
            if (!buildHeaders.isEmpty()) {
                for (String str : buildHeaders.getNames()) {
                    linkedHashMap.put(str, buildHeaders.get(str));
                }
            }
            aVar.mo55529a(linkedHashMap);
            aVar.f40436f = linkedHashMap.get("X-Request-ID");
            int i = C399894.f101716a[iRequest.getMethod().ordinal()];
            if (i == 1) {
                aVar.mo55526a(SendHttpRequest.Method.GET);
            } else if (i == 2) {
                HttpRequestBody requestBody = iRequest.getRequestBody();
                if (requestBody != null && !TextUtils.isEmpty(requestBody.getContent())) {
                    aVar.mo55530a(ByteString.of(requestBody.getContent().getBytes()));
                } else if (iRequest.canLog()) {
                    f101702a.mo171468c("SdkHttpExecutor", "post body is null or getContent is empty");
                }
                aVar.mo55526a(SendHttpRequest.Method.POST);
            } else if (i == 3) {
                aVar.mo55526a(SendHttpRequest.Method.PATCH);
            } else if (i == 4) {
                HttpRequestBody requestBody2 = iRequest.getRequestBody();
                if (requestBody2 != null && !TextUtils.isEmpty(requestBody2.getContent())) {
                    aVar.mo55530a(ByteString.of(requestBody2.getContent().getBytes()));
                } else if (iRequest.canLog()) {
                    f101702a.mo171468c("SdkHttpExecutor", "delete body is null or getContent is empty");
                }
                aVar.mo55526a(SendHttpRequest.Method.DELETE);
            }
            return aVar;
        } else if (!iRequest.canLog()) {
            return null;
        } else {
            f101702a.mo171465b("SdkHttpExecutor", "url is empty");
            return null;
        }
    }

    /* renamed from: a */
    private String m158620a(IRequest iRequest, String str) {
        if (iRequest == null) {
            return str;
        }
        HttpHeaders headers = iRequest.getHeaders();
        String str2 = headers.get("X-Request-ID");
        String str3 = headers.get("X-Passport-Unit");
        String url = iRequest.getUrl();
        return "X-Request-ID:" + str2 + ", request unit:" + str3 + ", url:" + url + ", " + "responseBody:" + str;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b
    /* renamed from: a */
    public <D, T extends IRequest<D>> void mo145177a(final T t, final AbstractC49352d<D> dVar) {
        final AbstractC49348a monitorCodeCreator = t.getMonitorCodeCreator();
        final UniContext uniContext = t.getUniContext();
        if (!(monitorCodeCreator == null || uniContext == null)) {
            MonitorUtil.m193712a(monitorCodeCreator.mo171971a()).addCategoryValue("cp", uniContext.getCp()).addCategoryValue("x_request_id", t.getHeaders().headersMap.get("X-Request-ID")).flush();
        }
        final SendHttpRequest.C15253a a = m158619a(t);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final C399861 r12 = new AbstractC49352d<D>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399861 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                C39985e.this.mo145176a(t, a, networkErrorResult, elapsedRealtime);
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
                AbstractC49348a aVar = monitorCodeCreator;
                if (aVar != null && uniContext != null) {
                    OPMonitor addCategoryValue = MonitorUtil.m193712a(aVar.mo171973c()).setResultTypeFail().addCategoryValue("x_request_id", t.getHeaders().headersMap.get("X-Request-ID")).addCategoryValue("cp", uniContext.getCp());
                    if (networkErrorResult != null) {
                        addCategoryValue.addCategoryValue("biz_code", Integer.valueOf(networkErrorResult.getBizCode())).addCategoryValue("error_code", Integer.valueOf(networkErrorResult.getErrorCode())).addCategoryValue("error_msg", networkErrorResult.getErrorMessage());
                        if (networkErrorResult.getThrowable() != null) {
                            addCategoryValue.setError(networkErrorResult.getThrowable());
                        }
                    }
                    addCategoryValue.flush();
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145179a(D d) {
                if (t.canLog()) {
                    PassportLog passportLog = C39985e.f101702a;
                    passportLog.mo171465b("SdkHttpExecutor", t.getHttpTag() + " request success");
                }
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a((Object) d);
                }
                AbstractC49348a aVar = monitorCodeCreator;
                if (aVar != null && uniContext != null) {
                    MonitorUtil.m193712a(aVar.mo171972b()).setResultTypeSuccess().addCategoryValue("x_request_id", t.getHeaders().headersMap.get("X-Request-ID")).addCategoryValue("cp", uniContext.getCp()).flush();
                }
            }
        };
        if (a == null) {
            r12.mo145178a(new NetworkErrorResult(-1, "builder is null"));
        } else {
            SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, a, new IGetDataCallback<SendHttpResponse>() {
                /* class com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399872 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    String str;
                    AbstractC49352d dVar = r12;
                    int errorCode = errorResult.getErrorCode();
                    if (TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        str = "";
                    } else {
                        str = errorResult.getDisplayMsg();
                    }
                    dVar.mo145178a(new NetworkErrorResult(errorCode, str));
                }

                /* renamed from: a */
                public void onSuccess(SendHttpResponse sendHttpResponse) {
                    NetworkErrorResult a;
                    C39985e.this.mo145175a(t, a, sendHttpResponse.http_status_code.intValue(), (Throwable) null, elapsedRealtime);
                    try {
                        t.onProcessResponseHeaders(sendHttpResponse.headers);
                        AbstractC49355c responseFilter = t.getResponseFilter();
                        if (responseFilter == null || (a = responseFilter.mo172168a(new C49353a(sendHttpResponse.http_status_code.intValue(), sendHttpResponse.headers.get("Suite-Session-Key"), new String(sendHttpResponse.body.toByteArray()), a.f40431a))) == null) {
                            String str = new String(sendHttpResponse.body.toByteArray());
                            C39985e.this.mo145174a(t, sendHttpResponse.http_status_code.intValue(), str, JSONObject.parseObject(str), r12);
                            return;
                        }
                        r12.mo145178a(a);
                    } catch (Throwable th) {
                        NetworkErrorResult networkErrorResult = new NetworkErrorResult(-1, "http code:" + sendHttpResponse.http_status_code + " " + th.getMessage());
                        if (sendHttpResponse.status == SendHttpResponse.Status.Timeout) {
                            networkErrorResult.setErrorType(-6);
                        }
                        networkErrorResult.setThrowable(th);
                        r12.mo145178a(networkErrorResult);
                    }
                }
            }, new SdkSender.IParser<SendHttpResponse>() {
                /* class com.ss.android.lark.integrator.passport.lazy.init.C39985e.C399883 */

                /* renamed from: a */
                public SendHttpResponse parse(byte[] bArr) throws IOException {
                    return SendHttpResponse.ADAPTER.decode(bArr);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo145176a(IRequest iRequest, SendHttpRequest.C15253a aVar, NetworkErrorResult networkErrorResult, long j) {
        String str;
        if (iRequest.canLog()) {
            StringBuilder sb = new StringBuilder(iRequest.getHttpTag());
            sb.append(" ");
            sb.append("X-Request-ID");
            sb.append(":");
            String str2 = "null";
            if (aVar != null) {
                str = aVar.f40433c.get("X-Request-ID");
            } else {
                str = str2;
            }
            sb.append(str);
            sb.append(", request unit:");
            if (aVar != null) {
                str2 = aVar.f40433c.get("X-Passport-Unit");
            }
            sb.append(str2);
            sb.append(", request url:");
            sb.append(aVar.f40431a);
            sb.append(", code:");
            sb.append(networkErrorResult.getErrorCode());
            sb.append(", msg:");
            sb.append(networkErrorResult.getErrorMessage());
            sb.append(", spend_time:");
            sb.append(SystemClock.elapsedRealtime() - j);
            f101702a.mo171471d("SdkHttpExecutor", sb.toString());
        }
    }

    /* renamed from: a */
    public <D> void mo145174a(IRequest<D> iRequest, int i, String str, JSONObject jSONObject, AbstractC49352d<D> dVar) {
        boolean z;
        int a = C49069a.m193378a(jSONObject, iRequest.getUniContext());
        int i2 = -2;
        String str2 = "jsonBody is null";
        if (i >= 400) {
            if (jSONObject != null) {
                str2 = jSONObject.getString("message");
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "empty error message";
            } else {
                i2 = i;
            }
            dVar.mo145178a(new NetworkErrorResult(i2, "http status code:" + i + " " + str2, a));
        } else if (i == 200) {
            D d = null;
            try {
                d = iRequest.getObjectConverter().mo107503b(str);
            } catch (Exception e) {
                if (iRequest.canLog()) {
                    PassportLog passportLog = f101702a;
                    passportLog.mo171462a("SdkHttpExecutor", iRequest.getName() + " convertResponse(body) error", e);
                }
            }
            if (m158621a(jSONObject)) {
                dVar.mo145178a(new NetworkErrorResult(jSONObject.getIntValue("code"), jSONObject.getString("message"), a));
            } else if (d instanceof BaseResponseModel) {
                D d2 = d;
                if (d2.getErrorCode() == 2006 || d2.getErrorCode() == 2008) {
                    z = true;
                } else {
                    z = false;
                }
                if (d2.isSuccess() || z) {
                    dVar.mo145179a(d);
                } else {
                    dVar.mo145178a(new NetworkErrorResult(d2.getErrorCode(), d2.getErrorMessage(), a));
                }
            } else if (d instanceof IResponseModel) {
                D d3 = d;
                if (!d3.isSuccess()) {
                    dVar.mo145178a(new NetworkErrorResult(d3.getCode(), d3.getMessage(), a));
                } else {
                    dVar.mo145179a(d);
                }
            } else {
                dVar.mo145178a(new NetworkErrorResult(-12, m158620a(iRequest, str), a));
            }
        } else {
            if (jSONObject != null) {
                str2 = jSONObject.getString("message");
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "get verify code fail";
            } else {
                i2 = i;
            }
            dVar.mo145178a(new NetworkErrorResult(i2, "http status code: " + i + " " + str2, a));
        }
    }

    /* renamed from: a */
    public void mo145175a(IRequest iRequest, SendHttpRequest.C15253a aVar, int i, Throwable th, long j) {
        String str;
        if (iRequest.canLog()) {
            StringBuilder sb = new StringBuilder(iRequest.getHttpTag());
            sb.append(" ");
            sb.append("X-Request-ID");
            sb.append(":");
            String str2 = "null";
            if (aVar != null) {
                str = aVar.f40433c.get("X-Request-ID");
            } else {
                str = str2;
            }
            sb.append(str);
            sb.append(", request unit:");
            if (aVar != null) {
                str2 = aVar.f40433c.get("X-Passport-Unit");
            }
            sb.append(str2);
            sb.append(", spend_time:");
            sb.append(SystemClock.elapsedRealtime() - j);
            sb.append(", statusCode:");
            sb.append(i);
            if (th != null) {
                sb.append(", error=");
                sb.append(th.toString());
            }
            String sb2 = sb.toString();
            if (th == null) {
                f101702a.mo171465b("SdkHttpExecutor", sb2);
            } else {
                f101702a.mo171471d("SdkHttpExecutor", sb2);
            }
        }
    }
}
