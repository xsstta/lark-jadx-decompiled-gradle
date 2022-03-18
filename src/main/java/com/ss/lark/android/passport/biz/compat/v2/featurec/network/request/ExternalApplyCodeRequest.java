package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import android.util.SparseArray;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.ApplyCodeErrorData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;

public class ExternalApplyCodeRequest extends BaseLoginHttpRequest<ApplyCodeData> {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/otp/apply_code";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest
    public boolean isGlobalScene() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public boolean isNeedVerifyToken() {
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public SparseArray<Class> onResponseDataClass() {
        return new SparseArray<Class>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.ExternalApplyCodeRequest.C644991 */

            {
                put(4206, ApplyCodeErrorData.class);
            }
        };
    }

    public ExternalApplyCodeRequest(int i, int i2, String str, String str2) {
        mRequestBody.put("code_type", Integer.valueOf(i));
        mRequestBody.put("source_type", Integer.valueOf(i2));
        mRequestBody.put("contact", str);
        mRequestBody.put("scope", str2);
        this.mCaptchaType = "apply_code";
    }
}
