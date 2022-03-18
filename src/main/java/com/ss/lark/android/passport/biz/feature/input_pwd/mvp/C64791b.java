package com.ss.lark.android.passport.biz.feature.input_pwd.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.input_pwd.PwdVerifyStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.b */
public class C64791b extends C49020a implements C64787a.AbstractC64788a {

    /* renamed from: c */
    private final VerifyIdentityStepInfo f163375c;

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64788a
    public VerifyIdentityStepInfo cm_() {
        return this.f163375c;
    }

    public C64791b(VerifyIdentityStepInfo verifyIdentityStepInfo) {
        this.f163375c = verifyIdentityStepInfo;
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64788a
    /* renamed from: a */
    public void mo223670a(int i, final AbstractC49352d<BaseStepData> dVar) {
        String str;
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f163375c;
        if (verifyIdentityStepInfo == null || verifyIdentityStepInfo.verifyPwd == null) {
            str = null;
        } else {
            str = this.f163375c.verifyPwd.flowType;
        }
        PwdVerifyStatisticsHelper.m254424b(str);
        mo171171a(FeatureCApi.Retrieve.m253717a(str, i, this.f123074a, this.f163375c.usePackageDomain, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64791b.C647921 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                dVar.mo145179a(responseModel.getData());
            }
        }));
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64788a
    /* renamed from: a */
    public void mo223671a(String str, ICallback<VerifyPwdData> aVar) {
        RsaInfo rsaInfo;
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f163375c;
        if (verifyIdentityStepInfo == null || verifyIdentityStepInfo.verifyPwd == null) {
            rsaInfo = null;
        } else {
            rsaInfo = this.f163375c.verifyPwd.rsaInfo;
        }
        mo171171a(FeatureCApi.m253698a(this.f163375c.verifyPwd.flowType, str, rsaInfo, this.f123074a, this.f163375c.usePackageDomain, aVar));
    }
}
