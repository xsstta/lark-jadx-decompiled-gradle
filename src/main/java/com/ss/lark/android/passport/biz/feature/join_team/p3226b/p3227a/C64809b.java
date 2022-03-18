package com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.util.C49187f;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinQrCodeInfo;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.a.b */
public class C64809b extends C49020a implements C64805a.AbstractC64806a {

    /* renamed from: c */
    private JoinQrCodeInfo f163399c;

    @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a.AbstractC64806a
    /* renamed from: a */
    public void mo223685a(JoinQrCodeInfo joinQrCodeInfo) {
        this.f163399c = joinQrCodeInfo;
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a.AbstractC64806a
    /* renamed from: a */
    public void mo223684a(UniContext uniContext, String str, AbstractC49352d<BaseStepData> dVar) {
        String str2;
        JoinQrCodeInfo joinQrCodeInfo = this.f163399c;
        if (joinQrCodeInfo != null) {
            str2 = joinQrCodeInfo.flowType;
        } else {
            str2 = null;
        }
        mo171171a(FeatureCApi.Tenant.m253721a(this.f123074a, str2, str, this.f163399c.usePackageDomain, C49187f.m193935a(dVar, BaseStepData.class)));
    }
}
