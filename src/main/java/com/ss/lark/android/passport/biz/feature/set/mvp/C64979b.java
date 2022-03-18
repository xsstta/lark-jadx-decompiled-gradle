package com.ss.lark.android.passport.biz.feature.set.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.util.C49187f;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.entity.PwdSetPwdStepInfo;
import com.ss.lark.android.passport.biz.feature.LoginApi;
import com.ss.lark.android.passport.biz.feature.set.mvp.C64975a;

/* renamed from: com.ss.lark.android.passport.biz.feature.set.mvp.b */
public class C64979b extends C49020a implements C64975a.AbstractC64976a {

    /* renamed from: c */
    private final PwdSetPwdStepInfo f163716c;

    public C64979b(PwdSetPwdStepInfo pwdSetPwdStepInfo) {
        this.f163716c = pwdSetPwdStepInfo;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64976a
    /* renamed from: a */
    public void mo224005a(AbstractC49352d<BaseStepData> dVar) {
        mo171171a(LoginApi.m253954a((String) null, this.f163716c.flowType, this.f163716c.usePackageDomain, C49187f.m193935a(dVar, BaseStepData.class)));
    }

    @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64976a
    /* renamed from: a */
    public void mo224006a(String str, AbstractC49352d<BaseStepData> dVar) {
        RsaInfo rsaInfo;
        String str2;
        PwdSetPwdStepInfo pwdSetPwdStepInfo = this.f163716c;
        if (pwdSetPwdStepInfo != null) {
            str2 = pwdSetPwdStepInfo.flowType;
            rsaInfo = this.f163716c.rsaInfo;
        } else {
            str2 = "";
            rsaInfo = null;
        }
        mo171171a(LoginApi.m253952a(str2, str, rsaInfo, this.f163716c.usePackageDomain, C49187f.m193935a(dVar, BaseStepData.class)));
    }
}
