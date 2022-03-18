package com.ss.lark.android.passport.biz.feature.create_team.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.GetPassportConfigData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.TenantCreateStepInfo;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.create_team.mvp.a */
public class C64762a extends C49020a implements C64767c.AbstractC64768a {

    /* renamed from: c */
    GetPassportConfigData.ConfigBean f163327c = PassportConfigCenter.f123034a.mo171113d();
    @RouterFieldAnno

    /* renamed from: d */
    private TenantCreateStepInfo f163328d;

    @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64768a
    /* renamed from: g */
    public TenantCreateStepInfo mo223634g() {
        return this.f163328d;
    }

    @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64768a
    /* renamed from: h */
    public List<TenantCreateStepInfo.CommonList> mo223635h() {
        return this.f163328d.staffSizeList;
    }

    @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64768a
    /* renamed from: i */
    public List<TenantCreateStepInfo.IndustryTypeList> mo223636i() {
        return this.f163328d.industryTypeList;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    /* renamed from: a */
    public void mo171169a() {
        boolean z;
        super.mo171169a();
        PassportLog passportLog = this.f123075b;
        StringBuilder sb = new StringBuilder();
        sb.append("init ");
        if (this.f163328d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        passportLog.mo171465b("CreateTeamModel", sb.toString());
    }

    public C64762a(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64768a
    /* renamed from: a */
    public void mo223633a(String str, String str2, String str3, UniContext uniContext, ICallback aVar) {
        String str4;
        this.f123075b.mo171465b("CreateTeamModel", "start tenantPrepare");
        TenantCreateStepInfo tenantCreateStepInfo = this.f163328d;
        if (tenantCreateStepInfo != null) {
            str4 = tenantCreateStepInfo.flowType;
        } else {
            str4 = "";
        }
        mo171171a(FeatureCApi.m253702a(str4, str3, str, str2, this.f163328d.usePackageDomain, UniContext.CONTEXT_GLOBAL, aVar));
    }
}
