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

/* renamed from: com.ss.lark.android.passport.biz.link_handler.j */
public class C65173j extends PassportAppLinkHandler {
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

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("UpgradeTeamLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("UpgradeTeamLinkHandler", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(final Context context, AppLink appLink) {
        if (appLink == null) {
            return false;
        }
        User foregroundUser = ((IUserListService) ServiceFinder.m193746a(IUserListService.class)).getForegroundUser();
        if (foregroundUser == null || !foregroundUser.isExcludeLogin()) {
            final String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter(ShareHitPoint.f121868c);
            final UDDialogUtils.DialogWrapper b = UDDialogUtils.m193821b(ServiceFinder.m193748c().getTopActivity());
            final UniContext uniContext = UniContext.CONTEXT_GLOBAL;
            TeamConversionApi.m254371a(uniContext, mo224384b(), new AbstractC49352d<UserOperationCenterInfo>() {
                /* class com.ss.lark.android.passport.biz.link_handler.C65173j.C651741 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    b.mo171634b();
                    PassportLog b = C65173j.this.mo224384b();
                    b.mo171471d("UpgradeTeamLinkHandler", "getDispatch Error " + networkErrorResult.getErrorMessage());
                }

                /* renamed from: a */
                public void mo145179a(UserOperationCenterInfo userOperationCenterInfo) {
                    b.mo171634b();
                    C49096b.m193593g(queryParameter);
                    if (userOperationCenterInfo == null || userOperationCenterInfo.createTeam == null) {
                        C65173j.this.mo224384b().mo171471d("UpgradeTeamLinkHandler", "getDispatch Error: userOperationCenterInfo is Null");
                    } else {
                        C49092f.m193529a(context, userOperationCenterInfo.createTeam, RouterScene.ALL.value, uniContext, C65173j.this.mo224384b(), (AbstractC49336a) null);
                    }
                }
            });
            return true;
        }
        new C65297d().mo224649a(foregroundUser, mo224384b());
        return false;
    }
}
