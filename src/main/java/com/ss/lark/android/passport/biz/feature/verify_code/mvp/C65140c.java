package com.ss.lark.android.passport.biz.feature.verify_code.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.c */
public class C65140c extends C49020a implements C65136b.AbstractC65137a {

    /* renamed from: c */
    VerifyIdentityStepInfo f164055c;

    /* renamed from: d */
    VerifyIdentityStepInfo.VerifyIdentifyBean f164056d;

    /* renamed from: e */
    public String f164057e;

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    public boolean cC_() {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: c */
    public VerifyIdentityStepInfo.VerifyIdentifyBean mo224347c() {
        return this.f164056d;
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    public VerifyIdentityStepInfo cB_() {
        return this.f164055c;
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: e */
    public String mo224350e() {
        return this.f164057e;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m255855i();
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: g */
    public boolean mo224351g() {
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f164055c;
        if (verifyIdentityStepInfo == null || verifyIdentityStepInfo.verifyOtp == null) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public String mo224359h() {
        VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean = this.f164056d;
        if (verifyIdentifyBean != null && verifyIdentifyBean.flowType != null) {
            return this.f164056d.flowType;
        }
        this.f123075b.mo171471d("LoginVerifyCodeModel", "getFlowType no FlowType");
        return "";
    }

    /* renamed from: i */
    private void m255855i() {
        VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean;
        if (this.f164055c != null) {
            if ("otp_code".equals(this.f164057e)) {
                verifyIdentifyBean = this.f164055c.verifyOtp;
            } else if ("backup_phone_code".equals(this.f164057e)) {
                verifyIdentifyBean = this.f164055c.verifyCodeSpare;
            } else {
                verifyIdentifyBean = this.f164055c.verifyCode;
            }
            this.f164056d = verifyIdentifyBean;
            if (verifyIdentifyBean == null) {
                this.f123075b.mo171471d("LoginVerifyCodeModel", "initInfo no verify stepInfo");
                return;
            }
            PassportLog passportLog = this.f123075b;
            passportLog.mo171465b("LoginVerifyCodeModel", "initInfo " + this.f164056d);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: b */
    public void mo224346b(ICallback<ApplyCodeData> aVar) {
        String h = mo224359h();
        if (this.f123074a == null) {
            this.f123074a = UniContext.CONTEXT_START_UP;
        }
        mo171171a(FeatureCApi.m253692a(0, h, this.f123074a, this.f164055c.usePackageDomain, true, aVar));
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: a */
    public void mo224343a(ICallback<ApplyCodeData> aVar) {
        String h = mo224359h();
        if (this.f123074a == null) {
            this.f123074a = UniContext.CONTEXT_START_UP;
        }
        mo171171a(FeatureCApi.m253692a(0, h, this.f123074a, this.f164055c.usePackageDomain, false, aVar));
    }

    public C65140c(VerifyIdentityStepInfo verifyIdentityStepInfo, String str) {
        this.f164055c = verifyIdentityStepInfo;
        this.f164057e = str;
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: a */
    public void mo224342a(int i, final AbstractC49352d<BaseStepData> dVar) {
        mo171171a(FeatureCApi.Retrieve.m253717a(mo224359h(), i, this.f123074a, this.f164055c.usePackageDomain, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65140c.C651411 */

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

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: a */
    public void mo224344a(String str, ICallback<BaseStepData> aVar) {
        mo171171a(FeatureCApi.m253699a(str, mo224359h(), this.f123074a, this.f164055c.usePackageDomain, aVar));
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65137a
    /* renamed from: a */
    public void mo224345a(String str, boolean z, ICallback<BaseStepData> aVar) {
        String h = mo224359h();
        if (this.f123074a == null) {
            this.f123074a = UniContext.CONTEXT_EMPTY;
        }
        mo171171a(FeatureCApi.m253700a(str, h, this.f123074a, this.f164055c.usePackageDomain, z, aVar));
    }
}
