package com.ss.lark.android.passport.biz.feature.accountandsecurity.p3218a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.passport.infra.service.IKaService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.C64601b;
import com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler;

/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.a.b */
public class C64600b extends PassportAppLinkHandler {
    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        AbstractC49384b<?> kaIdp = ((IKaService) ServiceFinder.m193746a(IKaService.class)).getKaIdp();
        if (kaIdp == null || kaIdp.mo171895d() == null) {
            C64601b.m253843a().mo223366c(context);
            return true;
        }
        kaIdp.mo171895d().mo171962a(context);
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("PasswordSettingHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("PasswordSettingHandler", "canOpen invalid parameter");
        return false;
    }
}
