package com.ss.lark.android.passport.biz.router;

import com.ss.android.lark.passport.infra.base.router.C49089c;
import com.ss.android.lark.passport.infra.base.router.C49094g;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.lark.android.passport.biz.compat.split_flow_page.SplitFlowAction;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.p3219b.C64604a;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.p3219b.C64605b;
import com.ss.lark.android.passport.biz.feature.company_login.C64700b;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.C64816c;
import com.ss.lark.android.passport.biz.feature.router.EnterAppAction;
import com.ss.lark.android.passport.biz.feature.router.GetAuthUrlAction;
import com.ss.lark.android.passport.biz.feature.router.ResetOTPAction;
import com.ss.lark.android.passport.biz.feature.router.VerifyIdentityEntryAction;

/* renamed from: com.ss.lark.android.passport.biz.router.d */
public class C65190d extends C49094g {

    /* renamed from: b */
    public static volatile C65190d f164147b;

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d, com.ss.android.lark.passport.infra.base.router.C49094g
    /* renamed from: c */
    public String mo171383c() {
        return "DefaultNormalRouterAction";
    }

    /* renamed from: a */
    public static C65190d m256021a() {
        if (f164147b == null) {
            synchronized (C65190d.class) {
                if (f164147b == null) {
                    f164147b = new C65190d();
                }
            }
        }
        return f164147b;
    }

    private C65190d() {
        mo171388a("join_by_scan", new C64816c(), RouterScene.ALL.value, new int[0]);
        mo171388a("idp_authentication", new C64700b(), RouterScene.ALL.value, new int[0]);
        mo171388a("enter_app", EnterAppAction.f163123b, RouterScene.ALL.value, new int[0]);
        mo171388a("account_appeal", new C65185a(), RouterScene.ALL.value, new int[0]);
        mo171388a("create_team_prepare", new C65187c(), RouterScene.ALL.value, new int[0]);
        mo171388a("show_dialog", new ShowDialogAction(), RouterScene.ALL.value, new int[0]);
        mo171388a("close_all", new C65186b(), RouterScene.ALL.value, new int[0]);
        mo171388a("clear_page_stack", new C49089c(), RouterScene.ALL.value, new int[0]);
        mo171388a("new_verify_identity", VerifyIdentityEntryAction.f163151b, RouterScene.ALL.value, new int[0]);
        mo171388a("verify_code", VerifyIdentityEntryAction.f163151b, RouterScene.ALL.value, new int[0]);
        mo171388a("verify_identity_new", VerifyIdentityEntryAction.f163151b, RouterScene.ALL.value, new int[0]);
        mo171388a("recover_account_choose", SplitFlowAction.f162761b, RouterScene.ALL.value, new int[0]);
        mo171388a("reset_otp", ResetOTPAction.f163150b, RouterScene.ALL.value, new int[0]);
        mo171388a("get_auth_url", GetAuthUrlAction.f163145b, RouterScene.ALL.value, new int[0]);
        mo171388a("account_management", new C64604a(), RouterScene.ACCOUNT_MANAGER.value, new int[0]);
        mo171388a("modify_contact", new C64605b(), RouterScene.ACCOUNT_MANAGER.value, new int[0]);
        mo171388a("idp_authentication", new C65192f(), RouterScene.SWITCH_USER.value, new int[0]);
    }
}
