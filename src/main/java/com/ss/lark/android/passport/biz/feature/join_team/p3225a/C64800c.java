package com.ss.lark.android.passport.biz.feature.join_team.p3225a;

import android.content.Context;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinQrCodeInfo;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64809b;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64810c;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.a.c */
public class C64800c extends C64810c {
    public C64800c(Context context, String str, AbstractC49352d<Boolean> dVar, UniContext uniContext, PassportLog passportLog) {
        this(new C64798a(context, dVar), new C64809b(), new C64799b(context, dVar), str, uniContext, passportLog);
    }

    public C64800c(AbstractC49407b bVar, C64805a.AbstractC64806a aVar, C64805a.AbstractC64807b bVar2, String str, UniContext uniContext, PassportLog passportLog) {
        super(bVar, aVar, bVar2, str, uniContext, passportLog);
        JoinQrCodeInfo joinQrCodeInfo = new JoinQrCodeInfo();
        joinQrCodeInfo.flowType = "logged_join";
        aVar.mo223685a(joinQrCodeInfo);
    }
}
