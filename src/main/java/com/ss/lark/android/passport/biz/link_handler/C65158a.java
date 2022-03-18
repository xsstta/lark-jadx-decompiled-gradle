package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.lark.android.passport.biz.feature.TeamConversionApi;
import com.ss.lark.android.passport.biz.widget.C65297d;

/* renamed from: com.ss.lark.android.passport.biz.link_handler.a */
public class C65158a extends PassportAppLinkHandler {
    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        User foregroundUser = ((IUserListService) ServiceFinder.m193746a(IUserListService.class)).getForegroundUser();
        if (foregroundUser == null || !foregroundUser.isExcludeLogin()) {
            TeamConversionApi.m254370a(context, mo224384b(), "", null);
            return true;
        }
        new C65297d().mo224649a(foregroundUser, mo224384b());
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("DispatchNextLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("DispatchNextLinkHandler", "canOpen invalid parameter");
        return false;
    }
}
