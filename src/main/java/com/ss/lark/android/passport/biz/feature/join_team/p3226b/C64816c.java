package com.ss.lark.android.passport.biz.feature.join_team.p3226b;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinQrCodeInfo;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64809b;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64810c;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64813d;

@RouterAnno(name = "join_by_scan")
/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.c */
public class C64816c extends AbstractC49088b {

    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.c$a */
    public interface AbstractC64817a {
        /* renamed from: a */
        C64805a.AbstractC64806a mo223695a();

        /* renamed from: a */
        C64805a.AbstractC64807b mo223696a(Context context);

        /* renamed from: a */
        C64810c mo223697a(AbstractC49407b bVar, C64805a.AbstractC64806a aVar, C64805a.AbstractC64807b bVar2, String str);
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "TenantCodeQrcodeAction";
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.c$b */
    public static class C64818b implements AbstractC64817a {

        /* renamed from: a */
        protected UniContext f163414a;

        @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.C64816c.AbstractC64817a
        /* renamed from: a */
        public C64805a.AbstractC64806a mo223695a() {
            return new C64809b();
        }

        public C64818b(UniContext uniContext) {
            this.f163414a = uniContext;
        }

        @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.C64816c.AbstractC64817a
        /* renamed from: a */
        public C64805a.AbstractC64807b mo223696a(Context context) {
            return new C64813d(context);
        }

        @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.C64816c.AbstractC64817a
        /* renamed from: a */
        public C64810c mo223697a(AbstractC49407b bVar, C64805a.AbstractC64806a aVar, C64805a.AbstractC64807b bVar2, String str) {
            return new C64810c(bVar, aVar, bVar2, str, this.f163414a, PassportLog.f123351c.mo171474a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC64817a mo223694a(UniContext uniContext) {
        return new C64818b(uniContext);
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        if (jSONObject == null) {
            this.f123291a.mo171471d("n_page_scan_qrcode", "action run return for null stepInfo");
            return;
        }
        JoinQrCodeInfo joinQrCodeInfo = (JoinQrCodeInfo) C49202p.m193967a(jSONObject, JoinQrCodeInfo.class);
        if (joinQrCodeInfo == null) {
            PassportLog passportLog = this.f123291a;
            passportLog.mo171471d("n_page_scan_qrcode", "action run return for null JoinQrCodeInfo: " + jSONObject.toJSONString());
            return;
        }
        if ((context instanceof Activity) && KeyboardUtils.isSoftShowing((Activity) context)) {
            this.f123291a.mo171465b("n_page_scan_qrcode", "hideKeyboard");
            KeyboardUtils.hideKeyboard(context);
        }
        this.f123291a.mo171465b("n_page_scan_qrcode", "start QRCodeScanActivity");
        ServiceFinder.m193752g().startScanQRCodeActivity(context, new int[]{0}, new C64815b(mo223694a(uniContext), joinQrCodeInfo), new C64801a(joinQrCodeInfo, "", uniContext));
    }
}
