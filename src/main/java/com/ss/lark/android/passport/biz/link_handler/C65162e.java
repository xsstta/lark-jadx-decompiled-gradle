package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.TeamConversionApi;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import com.ss.lark.android.passport.biz.widget.C65297d;

/* renamed from: com.ss.lark.android.passport.biz.link_handler.e */
public class C65162e extends PassportAppLinkHandler {
    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return true;
    }

    /* renamed from: a */
    private void m255945a(final Context context) {
        final UDDialogUtils.DialogWrapper b = UDDialogUtils.m193821b(ServiceFinder.m193748c().getTopActivity());
        final UniContext uniContext = UniContext.CONTEXT_GLOBAL;
        TeamConversionApi.m254371a(uniContext, mo224384b(), new AbstractC49352d<UserOperationCenterInfo>() {
            /* class com.ss.lark.android.passport.biz.link_handler.C65162e.C651631 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                b.mo171634b();
                PassportLog b = C65162e.this.mo224384b();
                b.mo171471d("PersonalUseLinkHandler", "getDispatch Error " + networkErrorResult.getErrorMessage());
            }

            /* renamed from: a */
            public void mo145179a(UserOperationCenterInfo userOperationCenterInfo) {
                b.mo171634b();
                if (userOperationCenterInfo == null || userOperationCenterInfo.personalStep == null) {
                    C65162e.this.mo224384b().mo171471d("PersonalUseLinkHandler", "getDispatch Error: stepInfo is Null");
                } else {
                    C49092f.m193529a(context, userOperationCenterInfo.personalStep, RouterScene.ALL.value, uniContext, C65162e.this.mo224384b(), (AbstractC49336a) null);
                }
            }
        });
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (appLink == null) {
            return false;
        }
        User foregroundUser = ((IUserListService) ServiceFinder.m193746a(IUserListService.class)).getForegroundUser();
        if (foregroundUser == null || !foregroundUser.isExcludeLogin()) {
            C49096b.m193591f(Uri.parse(appLink.mo103435a()).getQueryParameter(ShareHitPoint.f121868c));
            m255945a(context);
            return true;
        }
        new C65297d().mo224649a(foregroundUser, mo224384b());
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("PersonalUseLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("PersonalUseLinkHandler", "canOpen invalid parameter");
        return false;
    }
}
