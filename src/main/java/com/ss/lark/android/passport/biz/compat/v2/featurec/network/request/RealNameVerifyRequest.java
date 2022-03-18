package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import android.text.TextUtils;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.C49349b;
import com.ss.lark.android.passport.biz.account.C64291a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.C64521h;
import java.util.Map;

public class RealNameVerifyRequest extends BaseLoginHttpRequest<BaseStepData> {
    private static final PassportLog log = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/recover/operator";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest
    public boolean isGlobalScene() {
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return new AbstractC49348a() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.RealNameVerifyRequest.C645001 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                return C49349b.C49350a.ac;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                return C49349b.C49350a.ad;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                return C49349b.C49350a.ae;
            }
        };
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest
    public void onProcessResponseHeaders(Map<String, String> map) {
        super.onProcessResponseHeaders(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if ("X-Passport-Token".equalsIgnoreCase(entry.getKey())) {
                String value = entry.getValue();
                if (!TextUtils.isEmpty(value) && !isCancelable()) {
                    PassportLog passportLog = log;
                    passportLog.mo171465b("RealNameVerifyRequest", "token: " + value);
                    C49216a.m194036a().mo171740a("X-Passport-Token", value);
                }
            }
        }
    }

    public RealNameVerifyRequest(String str, String str2, int i, RsaInfo rsaInfo) {
        this.mHttpMethod = HttpMethod.POST;
        String a = C64521h.m253487a(str, rsaInfo);
        String a2 = C64521h.m253487a(str2, rsaInfo);
        mRequestBody.put("name", a);
        mRequestBody.put("identity", a2);
        mRequestBody.put("source_type", Integer.valueOf(i));
        mRequestBody.put("rsa_token", rsaInfo.rsaToken);
        this.mCaptchaType = "operator";
        String a3 = C49216a.m194036a().mo171739a("X-Passport-Token");
        if (!TextUtils.isEmpty(a3)) {
            this.mHeaders.put("X-Passport-Token", a3);
        }
        String a4 = C64291a.m252803a();
        if (!TextUtils.isEmpty(a4)) {
            this.mHeaders.put("Suite-Session-Key", a4);
        }
    }
}
