package com.ss.lark.android.passport.biz.feature.join_team.p3226b;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49410c;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinQrCodeInfo;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.C64816c;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.b */
public class C64815b implements AbstractC49410c {

    /* renamed from: a */
    private final C64816c.AbstractC64817a f163412a;

    /* renamed from: b */
    private final JoinQrCodeInfo f163413b;

    @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49410c
    /* renamed from: a */
    public boolean mo172453a() {
        return false;
    }

    public C64815b(C64816c.AbstractC64817a aVar, JoinQrCodeInfo joinQrCodeInfo) {
        this.f163412a = aVar;
        this.f163413b = joinQrCodeInfo;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49410c
    /* renamed from: a */
    public boolean mo172454a(String str, AbstractC49407b bVar, int i) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("n_action_scan_qrcode_succ", "result:" + str);
        C64805a.AbstractC64806a a2 = this.f163412a.mo223695a();
        C64805a.AbstractC64807b a3 = this.f163412a.mo223696a(bVar.mo145304a());
        a2.mo223685a(this.f163413b);
        this.f163412a.mo223697a(bVar, a2, a3, str).mo171169a();
        return true;
    }
}
