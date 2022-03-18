package com.ss.lark.android.passport.biz.feature.company_login;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.passport.env.p2419a.C49001c;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.statistics.AuthChannelEnum;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.utils.C65246b;

@RouterAnno(name = "idp_authentication")
/* renamed from: com.ss.lark.android.passport.biz.feature.company_login.b */
public class C64700b extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "IdpAuthAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        boolean z2;
        this.f123291a.mo171465b("n_action_idp_auth", "enter action idp auth");
        if (jSONObject == null) {
            this.f123291a.mo171471d("n_action_idp_auth", "stepInfo is null");
            return;
        }
        String string = jSONObject.getString("channel");
        PassportLog passportLog = this.f123291a;
        passportLog.mo171465b("n_action_idp_auth", "auth channel: " + string);
        boolean isEnableGoogleSdk = ServiceFinder.m193752g().isEnableGoogleSdk();
        PassportLog passportLog2 = this.f123291a;
        passportLog2.mo171465b("n_action_idp_auth", "can try to use google sdk: " + isEnableGoogleSdk);
        if (AuthChannelEnum.fromValue(string) != AuthChannelEnum.TYPE_GOOGLE || !isEnableGoogleSdk) {
            if (AuthChannelEnum.fromValue(string) == AuthChannelEnum.TYPE_GOOGLE && !isEnableGoogleSdk) {
                if (!C26284k.m95186b(LarkContext.getApplication()) || C26284k.m95185a(LarkContext.getApplication())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean isLarkPackage = ServiceFinder.m193748c().isLarkPackage();
                boolean e = C49001c.m192990e();
                StringBuilder sb = new StringBuilder();
                sb.append("cannot use google sdk, ");
                if (z2) {
                    sb.append("using develop package with release mode");
                }
                if (!isLarkPackage) {
                    sb.append("not lark package");
                }
                if (!e) {
                    sb.append("current env is not same to builtin");
                }
                this.f123291a.mo171465b("n_action_idp_auth", sb.toString());
            }
            this.f123291a.mo171465b("n_action_idp_auth", "login by web");
            AbstractC49384b<?> kaIdp = ServiceFinder.m193763r().getKaIdp();
            if (kaIdp != null) {
                kaIdp.mo171890a(context, jSONObject);
            }
        } else {
            this.f123291a.mo171465b("n_action_idp_auth", "try to login by google sdk");
            C65246b.m256133a().mo224501a(context, jSONObject, jSONObject.getString("flow_type"), this.f123291a, true);
        }
        if (aVar != null) {
            aVar.onRouterResult(-100, null);
        }
    }
}
