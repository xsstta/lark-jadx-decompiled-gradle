package com.ss.lark.android.passport.biz;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.compat.v1.p3213a.C64474a;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil;

/* renamed from: com.ss.lark.android.passport.biz.b */
public class C64340b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.b$a */
    public static final class C64342a {

        /* renamed from: a */
        public static final C64340b f162591a = new C64340b();
    }

    private C64340b() {
    }

    /* renamed from: a */
    public static C64340b m252955a() {
        return C64342a.f162591a;
    }

    /* renamed from: b */
    public Context mo222860b() {
        return LarkContext.getApplication();
    }

    /* renamed from: d */
    public void mo222862d() {
        OneKeyAuthUtil.f163513a.mo223825b();
    }

    /* renamed from: c */
    public Activity mo222861c() {
        return ServiceFinder.m193752g().getTopActivity();
    }

    /* renamed from: a */
    public void mo222859a(Context context, SigninParams signinParams, UniContext uniContext) {
        C49032c.m193132a().mo171194a(context);
        PassportLog a = PassportLog.f123351c.mo171474a();
        if (signinParams == null) {
            signinParams = SigninParams.DEFAULT;
        }
        if ("SSO".equals(ServiceFinder.m193752g().getLoginTypeChannel())) {
            ServiceFinder.m193763r().getKaIdp().mo171891a(context, signinParams.isClearTask());
        } else if ("STANDARD".equals(ServiceFinder.m193752g().getLoginTypeChannel())) {
            C64474a.m253354a(context, signinParams, uniContext, a);
        } else {
            C64474a.m253354a(context, signinParams, uniContext, a);
        }
        a.mo171465b("SigninSDK", "SigninManager signIn status:" + ServiceFinder.m193748c().isLogin());
    }
}
