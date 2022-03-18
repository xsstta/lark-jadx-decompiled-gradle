package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import android.util.SparseArray;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.C49349b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.ApplyCodeErrorData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;

public class ApplyCodeRequest extends BaseLoginHttpRequest<ApplyCodeData> {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/otp/apply_code";
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return new AbstractC49348a() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.ApplyCodeRequest.C644982 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                return C49349b.C49350a.f123859j;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                return C49349b.C49350a.f123860k;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                return C49349b.C49350a.f123861l;
            }
        };
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public SparseArray<Class> onResponseDataClass() {
        return new SparseArray<Class>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.ApplyCodeRequest.C644971 */

            {
                put(4206, ApplyCodeErrorData.class);
            }
        };
    }

    public ApplyCodeRequest(int i, int i2) {
        mRequestBody.put("source_type", Integer.valueOf(i2));
        mRequestBody.put("code_type", Integer.valueOf(i));
        this.mCaptchaType = "apply_code";
    }
}
