package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import android.text.TextUtils;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.C49349b;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;

public class VerifyCodeRequest extends BaseLoginHttpRequest<BaseStepData> {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/otp/verify_code";
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return new AbstractC49348a() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.VerifyCodeRequest.C645051 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                return C49349b.C49350a.f123862m;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                return C49349b.C49350a.f123863n;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                return C49349b.C49350a.f123864o;
            }
        };
    }

    public VerifyCodeRequest(String str, int i) {
        mRequestBody.put("code", str);
        mRequestBody.put("source_type", Integer.valueOf(i));
        this.mCaptchaType = "verify_code";
        if (i == 9) {
            String a = C49216a.m194036a().mo171739a("X-Verify-Token");
            if (!TextUtils.isEmpty(a)) {
                this.mHeaders.put("X-Verify-Token", a);
            }
        }
    }
}
