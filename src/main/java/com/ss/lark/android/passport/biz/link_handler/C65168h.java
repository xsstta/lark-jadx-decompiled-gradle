package com.ss.lark.android.passport.biz.link_handler;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.passport.infra.entity.SwitchEntity;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;

/* renamed from: com.ss.lark.android.passport.biz.link_handler.h */
public class C65168h extends PassportAppLinkHandler {
    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(final Context context, AppLink appLink) {
        if (context == null) {
            return false;
        }
        final String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("userId");
        if (TextUtils.isEmpty(queryParameter)) {
            mo224384b().mo171471d("SwitchTenantAppLinkHandler", "userId is null");
            return false;
        }
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser == null || !foregroundUser.userId.equals(queryParameter)) {
            PassportLog b = mo224384b();
            b.mo171465b("SwitchTenantAppLinkHandler", "Applink userId is:" + queryParameter);
            ServiceFinder.m193752g().getLastTopActivity(new IGetDataCallback<Activity>() {
                /* class com.ss.lark.android.passport.biz.link_handler.C65168h.C651691 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C65168h.this.mo224384b().mo171471d("SwitchTenantAppLinkHandler", "getTopActivity error");
                }

                /* renamed from: a */
                public void onSuccess(Activity activity) {
                    ServiceFinder.m193753h().switchUser(activity, new SwitchEntity(queryParameter, 5, true), new IGetDataCallback<C49382d>() {
                        /* class com.ss.lark.android.passport.biz.link_handler.C65168h.C651691.C651701 */

                        /* renamed from: a */
                        public void onSuccess(C49382d dVar) {
                            C65168h.this.mo224384b().mo171465b("SwitchTenantAppLinkHandler", "getAppLinkHandlers, SwitchUser onSuccess");
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("new", true);
                            ServiceFinder.m193752g().onLoginCallback(context, ServiceFinder.m193744a().getForegroundUser(), bundle);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            PassportLog b = C65168h.this.mo224384b();
                            b.mo171471d("SwitchTenantAppLinkHandler", "getAppLinkHandlers, SwitchUser onError" + errorResult.toString());
                        }
                    });
                }
            });
            return false;
        }
        mo224384b().mo171471d("SwitchTenantAppLinkHandler", "foregroundUser userId equals applink userId");
        return false;
    }
}
