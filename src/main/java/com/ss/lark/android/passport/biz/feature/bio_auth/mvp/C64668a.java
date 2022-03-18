package com.ss.lark.android.passport.biz.feature.bio_auth.mvp;

import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.BioStepInfo;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c;

/* renamed from: com.ss.lark.android.passport.biz.feature.bio_auth.mvp.a */
public class C64668a extends C49020a implements C64675c.AbstractC64676a {
    @RouterFieldAnno

    /* renamed from: c */
    private BioStepInfo f163165c;

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: g */
    public BioStepInfo mo223468g() {
        if (this.f163165c == null) {
            this.f163165c = new BioStepInfo();
        }
        return this.f163165c;
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: h */
    public String mo223469h() {
        BioStepInfo bioStepInfo = this.f163165c;
        if (bioStepInfo != null) {
            return bioStepInfo.mFlowType;
        }
        return "login";
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: i */
    public String mo223470i() {
        BioStepInfo bioStepInfo = this.f163165c;
        if (bioStepInfo != null) {
            return bioStepInfo.name;
        }
        return "";
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: j */
    public String mo223471j() {
        BioStepInfo bioStepInfo = this.f163165c;
        if (bioStepInfo != null) {
            return bioStepInfo.idCode;
        }
        return "";
    }

    public C64668a(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: a */
    public boolean mo223465a(String str) {
        if (!TextUtils.isEmpty(mo223470i()) || !TextUtils.isEmpty(mo223471j())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: b */
    public String mo223466b(String str) {
        str.hashCode();
        if (str.equals("retrieve:op_three_and_bio_active") || str.equals("bio_bind")) {
            return "0";
        }
        return "1";
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: a */
    public void mo223464a(String str, ICallback<BaseStepData> aVar) {
        mo171171a(FeatureCApi.m253709b(str, this.f123074a, this.f163165c.usePackageDomain, aVar));
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64676a
    /* renamed from: b */
    public void mo223467b(String str, ICallback<BaseStepData> aVar) {
        mo171171a(FeatureCApi.m253696a(str, this.f123074a, this.f163165c.usePackageDomain, aVar));
    }
}
