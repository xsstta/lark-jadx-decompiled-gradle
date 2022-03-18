package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import android.text.TextUtils;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.passport.infra.base.network.C49085f;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.C49349b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SetPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;

public class SetPwdRequest extends BaseLoginHttpRequest<SetPwdData> {
    private String KEY_SOURCE_TYPE = "source_type";
    private final String mPwd;
    private final RsaInfo mRsa;
    private int mSourceType;

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/set_pwd";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public boolean isNeedPassportToken() {
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return new AbstractC49348a() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.SetPwdRequest.C645031 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                return C49349b.C49350a.f123828E;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                return C49349b.C49350a.f123829F;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                return C49349b.C49350a.f123830G;
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest
    public boolean isAfterLoginStatus() {
        return ServiceFinder.m193748c().isLogin();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public void retryRequest(AbstractC49342a<V2ResponseModel<SetPwdData>> aVar) {
        SetPwdRequest setPwdRequest = new SetPwdRequest(this.mPwd, this.mRsa, this.mSourceType);
        setPwdRequest.setUniContext(this.mUniContext);
        setPwdRequest.request2(aVar);
    }

    public SetPwdRequest(String str, RsaInfo rsaInfo, int i) {
        this.mPwd = str;
        this.mRsa = rsaInfo;
        this.mSourceType = i;
        C49085f.m193498a(this, !TextUtils.isEmpty(str) ? str.trim() : str, rsaInfo);
        this.mCaptchaType = "set_pwd";
        mRequestBody.put(this.KEY_SOURCE_TYPE, Integer.valueOf(this.mSourceType));
    }
}
