package com.ss.android.lark.security;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49403r;
import com.ss.android.lark.security.account.C54058a;
import com.ss.android.lark.security.api.CheckSecurityPwdStep;
import com.ss.android.lark.security.api.SecurityApi;
import com.ss.android.lark.security.set.SetSecurityPasswordActivity;

/* renamed from: com.ss.android.lark.security.a */
public class C54055a {

    /* renamed from: a */
    public static C54055a f133856a;

    /* renamed from: b */
    public void mo185056b() {
    }

    /* renamed from: c */
    public void mo185057c() {
    }

    /* renamed from: a */
    public void mo185052a() {
        ServiceFinder.m193748c().registerRouterPage(SetSecurityPasswordActivity.class, RouterScene.ALL.value, new int[0]);
    }

    /* renamed from: a */
    public void mo185053a(Context context) {
        ServiceFinder.m193748c().openSecurityPasswordSettingPage(context);
    }

    /* renamed from: a */
    public void mo185055a(final AbstractC49403r rVar) {
        SecurityApi.m209800a(null, new IGetDataCallback<CheckSecurityPwdStep>() {
            /* class com.ss.android.lark.security.C54055a.C540561 */

            /* renamed from: a */
            public void onSuccess(CheckSecurityPwdStep checkSecurityPwdStep) {
                AbstractC49403r rVar = rVar;
                if (rVar != null) {
                    rVar.onResult(checkSecurityPwdStep.isOpen());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC49403r rVar = rVar;
                if (rVar != null) {
                    rVar.onResult(false);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo185054a(Context context, String str, String str2, AbstractC49402q qVar) {
        C54058a.m209797a().mo185063a(context, str, str2, qVar);
    }
}
