package com.ss.lark.android.passport.biz.compat.v1.p3213a;

import android.content.Context;
import android.content.Intent;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.base.statistics.LoginHitPoint;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49218u;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64493b;
import com.ss.lark.android.passport.biz.feature.login.LoginClearTaskActivity;
import com.ss.lark.android.passport.biz.feature.login_input.LoginInputActivity;

/* renamed from: com.ss.lark.android.passport.biz.compat.v1.a.a */
public class C64474a {
    /* renamed from: a */
    public static void m253354a(Context context, SigninParams signinParams, UniContext uniContext, PassportLog passportLog) {
        if (signinParams.isRegister()) {
            m253356c(context, signinParams, uniContext, passportLog);
        } else {
            m253355b(context, signinParams, uniContext, passportLog);
        }
    }

    /* renamed from: c */
    private static void m253356c(final Context context, final SigninParams signinParams, final UniContext uniContext, final PassportLog passportLog) {
        LoginHitPoint.f123304a.mo171394a();
        C49096b.m193580b();
        C64493b.m253416a(new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.compat.v1.p3213a.C64474a.C644751 */

            /* renamed from: a */
            public void mo145179a(String str) {
                C64474a.m253355b(context, signinParams, uniContext, passportLog);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                String str;
                if (networkErrorResult != null) {
                    str = networkErrorResult.getErrorMessage();
                } else {
                    str = "";
                }
                passportLog.mo171471d("openCreateTeam-getDeviceId", str);
                C49266a.m194149b();
                C49266a.m194146a(context, (int) R.string.Lark_Passport_LoginInitNetworkError);
            }
        });
    }

    /* renamed from: b */
    public static void m253355b(Context context, SigninParams signinParams, UniContext uniContext, PassportLog passportLog) {
        passportLog.mo171465b("LoginLauncher", "LoginLauncher doLogin");
        if (context != null) {
            Intent a = m253352a(context, "", signinParams.isClearTask(), uniContext, passportLog);
            a.putExtra("tag_signin_params", signinParams);
            if (signinParams.isRegister()) {
                passportLog.mo171465b("LoginLauncher", "doLogin but is register");
            }
            C49218u.m194042a(context, a, passportLog);
        }
    }

    /* renamed from: a */
    private static Intent m253352a(Context context, String str, boolean z, UniContext uniContext, PassportLog passportLog) {
        return m253353a(context, str, z, true, true, uniContext, passportLog);
    }

    /* renamed from: a */
    private static Intent m253353a(Context context, String str, boolean z, boolean z2, boolean z3, UniContext uniContext, PassportLog passportLog) {
        if (z) {
            passportLog.mo171465b("LoginLauncher", "getStartIntent LoginClearTaskActivity");
            Intent intent = new Intent(context, LoginClearTaskActivity.class);
            intent.putExtra("key_of_uni_context", uniContext);
            intent.addFlags(268468224);
            return intent;
        }
        passportLog.mo171465b("LoginLauncher", "getStartIntent LoginInputActivity");
        Intent intent2 = new Intent(context, LoginInputActivity.class);
        intent2.putExtra("key_of_uni_context", uniContext);
        intent2.addFlags(67141632);
        return intent2;
    }
}
