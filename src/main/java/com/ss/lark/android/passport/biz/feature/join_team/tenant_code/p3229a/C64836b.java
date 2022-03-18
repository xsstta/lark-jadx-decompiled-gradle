package com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinTenantCodeInfo;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.tenant_code.a.b */
public class C64836b extends C49020a implements C64832a.AbstractC64833a {
    @RouterFieldAnno

    /* renamed from: c */
    private JoinTenantCodeInfo f163443c;

    @Override // com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a.AbstractC64833a
    public JoinTenantCodeInfo cp_() {
        return this.f163443c;
    }

    public C64836b(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a.AbstractC64833a
    /* renamed from: a */
    public void mo223731a(String str, AbstractC49352d<BaseStepData> dVar) {
        mo171171a(FeatureCApi.Tenant.m253722a(str, this.f163443c.flowType, this.f123074a, this.f163443c.usePackageDomain, dVar));
    }
}
