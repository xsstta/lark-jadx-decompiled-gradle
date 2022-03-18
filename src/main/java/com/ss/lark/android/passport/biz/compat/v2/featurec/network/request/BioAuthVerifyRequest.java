package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;

public class BioAuthVerifyRequest extends BaseLoginHttpRequest<BaseStepData> {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/security/bio_auth/verify";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest
    public boolean isAfterLoginStatus() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public boolean isNeedPassportToken() {
        return true;
    }

    public BioAuthVerifyRequest(int i) {
        this.mHttpMethod = HttpMethod.POST;
        mRequestBody.put("source_type", Integer.valueOf(i));
    }
}
