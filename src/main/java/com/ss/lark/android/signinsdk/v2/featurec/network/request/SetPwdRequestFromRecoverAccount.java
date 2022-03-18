package com.ss.lark.android.signinsdk.v2.featurec.network.request;

import android.text.TextUtils;
import com.ss.android.lark.passport.infra.base.network.C49085f;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SetPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;

public class SetPwdRequestFromRecoverAccount extends BaseLoginHttpRequest<SetPwdData> {
    protected String mPwd;
    protected RsaInfo mRsa;

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/recover/application/modify_pwd";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public boolean isNeedPassportToken() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest
    public boolean isAfterLoginStatus() {
        return ServiceFinder.m193748c().isLogin();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public void retryRequest(AbstractC49342a<V2ResponseModel<SetPwdData>> aVar) {
        SetPwdRequestFromRecoverAccount setPwdRequestFromRecoverAccount = new SetPwdRequestFromRecoverAccount(this.mPwd, this.mRsa);
        setPwdRequestFromRecoverAccount.setUniContext(this.mUniContext);
        setPwdRequestFromRecoverAccount.request2(aVar);
    }

    public SetPwdRequestFromRecoverAccount(String str, RsaInfo rsaInfo) {
        this.mPwd = str;
        this.mRsa = rsaInfo;
        C49085f.m193498a(this, !TextUtils.isEmpty(str) ? str.trim() : str, rsaInfo);
        this.mCaptchaType = "set_pwd";
    }
}
