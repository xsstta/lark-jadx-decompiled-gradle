package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.passport.infra.base.network.C49085f;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.C49349b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;

public class VerifyPwdRequest extends BaseLoginHttpRequest<VerifyPwdData> {
    private final String mPwd;
    private final RsaInfo mRsa;

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/verify_pwd";
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return new AbstractC49348a() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.VerifyPwdRequest.C645061 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                return C49349b.C49350a.f123865p;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                return C49349b.C49350a.f123866q;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                return C49349b.C49350a.f123867r;
            }
        };
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public void retryRequest(AbstractC49342a<V2ResponseModel<VerifyPwdData>> aVar) {
        VerifyPwdRequest verifyPwdRequest = new VerifyPwdRequest(this.mPwd, this.mRsa);
        verifyPwdRequest.setUniContext(this.mUniContext);
        verifyPwdRequest.request2(aVar);
    }

    public VerifyPwdRequest(String str, RsaInfo rsaInfo) {
        this.mPwd = str;
        this.mRsa = rsaInfo;
        C49085f.m193498a(this, str, rsaInfo);
        this.mCaptchaType = "verify_pwd";
    }
}
