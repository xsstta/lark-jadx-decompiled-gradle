package com.ss.lark.android.passport.biz.compat.login;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.lark.android.passport.biz.account.C64291a;
import com.ss.lark.android.passport.biz.feature.join_team.p3225a.C64800c;

/* renamed from: com.ss.lark.android.passport.biz.compat.login.c */
public class C64388c {

    /* renamed from: com.ss.lark.android.passport.biz.compat.login.c$a */
    private static class C64390a {

        /* renamed from: a */
        public static final C64388c f162673a = new C64388c();
    }

    /* renamed from: a */
    public void mo222942a(Context context) {
    }

    private C64388c() {
    }

    /* renamed from: a */
    public static C64388c m253090a() {
        return C64390a.f162673a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[EDGE_INSN: B:29:0x0059->B:17:0x0059 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m253091a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.compat.login.C64388c.m253091a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public boolean mo222943a(Context context, String str, AbstractC49352d<Boolean> dVar) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("n_action_scan_try_join_team", "qrUrl: " + str);
        if (!ServiceFinder.m193748c().isFgEnable("lark.onboarding.qrcode_jointeam")) {
            PassportLog.f123351c.mo171474a().mo171465b("n_action_qrcode_join_team_fg", "false");
            return false;
        }
        PassportLog.f123351c.mo171474a().mo171465b("n_action_qrcode_join_team_fg", "true");
        if (C64291a.m252811c().isIdp()) {
            PassportLog.f123351c.mo171474a().mo171460a("n_action_foregrounduser_is_Idp");
            return false;
        } else if (ServiceFinder.m193752g().isPrivateKaPkg()) {
            PassportLog.f123351c.mo171474a().mo171460a("n_action_package_is_ka");
            return false;
        } else if (TextUtils.isEmpty(m253091a(str))) {
            PassportLog.f123351c.mo171474a().mo171464b("n_action_tenant_name_empty");
            return false;
        } else {
            PassportLog.f123351c.mo171474a().mo171465b("n_action_scan_try_join_team", "start ");
            new C64800c(context, str, dVar, null, PassportLog.f123351c.mo171474a()).mo171169a();
            return true;
        }
    }
}
