package com.ss.lark.android.passport.biz.compat.verify_code.mvp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a;

/* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.b */
public class C64540b extends C49020a implements C64536a.AbstractC64537a {

    /* renamed from: c */
    VerifyIdentityStepInfo f162937c;

    /* renamed from: d */
    VerifyIdentityStepInfo.VerifyIdentifyBean f162938d;

    /* renamed from: e */
    boolean f162939e;

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    public VerifyIdentityStepInfo.VerifyIdentifyBean cj_() {
        return this.f162938d;
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    public VerifyIdentityStepInfo ck_() {
        return this.f162937c;
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    /* renamed from: h */
    public boolean mo223229h() {
        return this.f162939e;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m253570i();
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    /* renamed from: g */
    public boolean mo223228g() {
        VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean = this.f162938d;
        if (verifyIdentifyBean == null || verifyIdentifyBean.sourceType != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m253571j() {
        if (cj_() == null || !TextUtils.equals("contact_verify", cj_().scope)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    public int cl_() {
        VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean = this.f162938d;
        if (verifyIdentifyBean != null) {
            return verifyIdentifyBean.sourceType;
        }
        this.f123075b.mo171471d("LoginVerifyCodeModel", "getSourceType no sourceType");
        return 2;
    }

    /* renamed from: i */
    private void m253570i() {
        VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean;
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f162937c;
        if (verifyIdentityStepInfo != null) {
            this.f162939e = false;
            if ("forget_verify_code".equals(verifyIdentityStepInfo.type)) {
                this.f162939e = false;
                verifyIdentifyBean = this.f162937c.forgetVerifyCode;
            } else if ("verify_code".equals(this.f162937c.type)) {
                this.f162939e = this.f162937c.isEnableVerifyPwd();
                verifyIdentifyBean = this.f162937c.verifyCode;
            } else {
                this.f162939e = this.f162937c.isEnableVerifyPwd();
                verifyIdentifyBean = this.f162937c.verifyCode;
            }
            this.f162938d = verifyIdentifyBean;
            if (verifyIdentifyBean == null) {
                this.f123075b.mo171471d("LoginVerifyCodeModel", "initInfo no verify stepInfo");
                return;
            }
            PassportLog passportLog = this.f123075b;
            passportLog.mo171465b("LoginVerifyCodeModel", "initInfo enableChange: " + this.f162939e + " sourceType: " + this.f162938d.sourceType);
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    /* renamed from: e */
    public JSONObject mo223227e() {
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f162937c;
        if (verifyIdentityStepInfo == null || verifyIdentityStepInfo.recoverAccountBean == null) {
            return null;
        }
        if (this.f162937c.verifyCode != null && (this.f162937c.recoverAccountBean.get("source_type") == null || ((Integer) this.f162937c.recoverAccountBean.get("source_type")).intValue() == 0)) {
            this.f162937c.recoverAccountBean.put("source_type", Integer.valueOf(this.f162937c.verifyCode.sourceType));
        }
        return new JSONObject(this.f162937c.recoverAccountBean);
    }

    public C64540b(VerifyIdentityStepInfo verifyIdentityStepInfo) {
        this.f162937c = verifyIdentityStepInfo;
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    /* renamed from: a */
    public void mo223221a(AbstractC49352d<V2ResponseModel<ApplyCodeData>> dVar) {
        mo171171a(C64483a.m253375a().mo223125a(0, cl_(), this.f123074a, this.f123075b, dVar));
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    /* renamed from: a */
    public void mo223222a(String str, AbstractC49352d<V2ResponseModel<BaseStepData>> dVar) {
        int i;
        int cl_ = cl_();
        if (m253571j()) {
            i = 9;
        } else {
            i = cl_;
        }
        mo171171a(C64483a.m253375a().mo223129a(str, i, this.f123074a, this.f123075b, dVar));
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64537a
    /* renamed from: a */
    public void mo223223a(String str, String str2, AbstractC49352d<V2ResponseModel<ApplyCodeData>> dVar) {
        mo171171a(C64483a.m253375a().mo223126a(0, 9, str, str2, this.f123074a, this.f123075b, dVar));
    }
}
