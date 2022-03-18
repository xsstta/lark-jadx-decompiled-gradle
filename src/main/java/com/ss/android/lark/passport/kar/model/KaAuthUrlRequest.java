package com.ss.android.lark.passport.kar.model;

import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.C49349b;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;

public class KaAuthUrlRequest extends BaseLoginHttpRequest<KaAuthUrlResponse> {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/authentication/idp/v3/m/auth_url";
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return new AbstractC49348a() {
            /* class com.ss.android.lark.passport.kar.model.KaAuthUrlRequest.C493181 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                return C49349b.C49350a.f123874y;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                return C49349b.C49350a.f123875z;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                return C49349b.C49350a.f123824A;
            }
        };
    }

    public KaAuthUrlRequest(String str) {
        this.mHttpMethod = HttpMethod.GET;
        this.mQueryParams.put("alias_code", str);
        this.mQueryParams.put("app_id", "1");
        this.mCaptchaType = "idp_auth_url";
    }
}
