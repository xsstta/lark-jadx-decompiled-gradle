package com.ss.android.lark.passport.infra.base.network.interceptor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.RequestResult;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/CommonResponseInterceptor;", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/IResponseInterceptor;", "()V", "logError", "", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "passportError", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "processResponse", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/RequestResult;", "requestResult", "processResponseHeaders", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.d */
public final class CommonResponseInterceptor implements IResponseInterceptor {

    /* renamed from: a */
    public static final Companion f123265a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/CommonResponseInterceptor$Companion;", "", "()V", "CODE_200", "", "CODE_400", "CODE_401", "CODE_500", "CODE_600", "TAG", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.d.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo171339a(IRequest eVar, NetworkErrorResult networkErrorResult) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(networkErrorResult, "passportError");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x_request_id", eVar.mo171287f().get("X-Request-ID"));
        PassportLog.f123351c.mo171474a().mo171472d("n_net_error", "{URL:" + eVar.mo171289h() + eVar.mo171284c() + ", ErrorCode:" + networkErrorResult.getErrorCode() + ", ErrorMessage:" + networkErrorResult.getErrorMessage() + ", errorType:" + networkErrorResult.getErrorType() + "}", linkedHashMap);
    }

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IResponseInterceptor
    /* renamed from: a */
    public RequestResult mo171334a(RequestResult fVar, UniContext uniContext) {
        Set<Map.Entry<String, String>> entrySet;
        Intrinsics.checkParameterIsNotNull(fVar, "requestResult");
        Map<String, String> b = fVar.mo172213b();
        if (!(b == null || (entrySet = b.entrySet()) == null)) {
            for (Map.Entry<String, String> entry : entrySet) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (StringsKt.equals("X-Flow-Key", key, true)) {
                    if (!TextUtils.isEmpty(value)) {
                        C49216a.m194036a().mo171740a("X-Flow-Key", value);
                    } else {
                        PassportLog.f123351c.mo171474a().mo171465b("CommonResponseInterceptor", "Resposne Header X-Flow-Key is Empty");
                    }
                }
                if (StringsKt.equals("X-Verify-Token", key, true)) {
                    if (!TextUtils.isEmpty(value)) {
                        C49216a.m194036a().mo171740a("X-Verify-Token", value);
                    } else {
                        PassportLog.f123351c.mo171474a().mo171465b("CommonResponseInterceptor", "Resposne Header X-Verify-Token is Empty");
                    }
                }
                if (StringsKt.equals("X-Proxy-Unit", key, true)) {
                    if (!TextUtils.isEmpty(value)) {
                        C49216a.m194036a().mo171740a("X-Proxy-Unit", value);
                    } else {
                        PassportLog.f123351c.mo171474a().mo171465b("CommonResponseInterceptor", "Response Header X_PROXY_UNIT is Empty");
                    }
                }
            }
        }
        return fVar;
    }

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IResponseInterceptor
    /* renamed from: a */
    public RequestResult mo171333a(IRequest eVar, RequestResult fVar) {
        NetworkErrorResult networkErrorResult;
        NetworkErrorResult networkErrorResult2;
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(fVar, "requestResult");
        if (200 == fVar.mo172214c()) {
            return fVar;
        }
        int c = fVar.mo172214c();
        JSONObject jSONObject = null;
        if (401 == c) {
            try {
                String string = ServiceFinder.m193748c().getApplicationContext().getString(R.string.Lark_Login_SessionExpiredTip);
                Intrinsics.checkExpressionValueIsNotNull(string, "ServiceFinder.getCommonS…_Login_SessionExpiredTip)");
                fVar.mo172211a(new NetworkErrorResult(c, string));
                return fVar;
            } catch (Throwable th) {
                networkErrorResult = new NetworkErrorResult(-6, "http code:" + c + " " + th.getMessage());
            }
        } else {
            int i = -2;
            if (501 <= c && 600 > c) {
                networkErrorResult = new NetworkErrorResult(-2, "http status code:" + c + ' ' + "server error");
                networkErrorResult.setBizCode(C49069a.m193378a(jSONObject, eVar.mo171285d()));
                mo171339a(eVar, networkErrorResult);
                networkErrorResult.setErrorMessage(ServiceFinder.m193748c().getApplicationContext().getString(R.string.Lark_Legacy_NetworkError));
                networkErrorResult.setErrorCode(4401);
                fVar.mo172211a(networkErrorResult);
                return fVar;
            }
            if (TextUtils.isEmpty(fVar.mo172215d())) {
                PassportLog.f123351c.mo171474a().mo171471d("CommonResponseInterceptor", "httpcode:" + c + ",response body is Null");
            } else {
                jSONObject = JSON.parseObject(fVar.mo172215d());
            }
            if (jSONObject == null) {
                PassportLog.f123351c.mo171474a().mo171471d("CommonResponseInterceptor", "httpcode:" + c + ",response jsonBody is Null");
                networkErrorResult = new NetworkErrorResult(-1, "http status code:" + c + ",response jsonBody is Null");
            } else if (400 == c || 500 == c) {
                if (!TextUtils.isEmpty(jSONObject.getString("message"))) {
                    networkErrorResult2 = new NetworkErrorResult(c, jSONObject.getString("message"));
                } else {
                    PassportLog.f123351c.mo171474a().mo171471d("CommonResponseInterceptor", "resposne message is Null");
                    networkErrorResult2 = new NetworkErrorResult(-2, "http status code:" + c);
                }
                networkErrorResult = networkErrorResult2;
            } else {
                String string2 = jSONObject.getString("message");
                Intrinsics.checkExpressionValueIsNotNull(string2, "body.getString(\"message\")");
                if (TextUtils.isEmpty(string2)) {
                    string2 = "get verify code fail";
                } else {
                    i = c;
                }
                networkErrorResult = new NetworkErrorResult(i, "http status code:" + c + ',' + string2);
            }
            networkErrorResult.setBizCode(C49069a.m193378a(jSONObject, eVar.mo171285d()));
            mo171339a(eVar, networkErrorResult);
            networkErrorResult.setErrorMessage(ServiceFinder.m193748c().getApplicationContext().getString(R.string.Lark_Legacy_NetworkError));
            networkErrorResult.setErrorCode(4401);
            fVar.mo172211a(networkErrorResult);
            return fVar;
        }
    }
}
