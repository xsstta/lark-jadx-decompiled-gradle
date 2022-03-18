package com.ss.lark.android.passport.biz.compat.input_pwd.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.b */
public class C64379b extends C49020a implements C64375a.AbstractC64376a {

    /* renamed from: c */
    private VerifyIdentityStepInfo f162660c;

    @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64376a
    public VerifyIdentityStepInfo cb_() {
        return this.f162660c;
    }

    public C64379b(VerifyIdentityStepInfo verifyIdentityStepInfo) {
        this.f162660c = verifyIdentityStepInfo;
    }

    @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64376a
    /* renamed from: a */
    public void mo222929a(String str, AbstractC49352d<V2ResponseModel<VerifyPwdData>> dVar) {
        RsaInfo rsaInfo;
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f162660c;
        if (verifyIdentityStepInfo == null || verifyIdentityStepInfo.verifyPwd == null) {
            rsaInfo = null;
        } else {
            rsaInfo = this.f162660c.verifyPwd.rsaInfo;
        }
        mo171171a(C64483a.m253375a().mo223131a(str, rsaInfo, this.f123074a, this.f123075b, dVar));
    }
}
