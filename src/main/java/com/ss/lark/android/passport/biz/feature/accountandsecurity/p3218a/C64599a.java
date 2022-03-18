package com.ss.lark.android.passport.biz.feature.accountandsecurity.p3218a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.applink.AppLink;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.C64606c;
import com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler;

/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.a.a */
public class C64599a extends PassportAppLinkHandler {
    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        C64606c.m253859a(context);
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("AccountManagerHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("AccountManagerHandler", "canOpen invalid parameter");
        return false;
    }
}
