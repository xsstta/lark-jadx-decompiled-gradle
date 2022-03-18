package com.ss.lark.android.passport.biz.router;

import com.ss.android.lark.passport.infra.base.router.C49095h;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.lark.android.passport.biz.compat.reset_phone_num.RestPhoneNumActivity;
import com.ss.lark.android.passport.biz.compat.reset_pwd.SetPasswordActivity;
import com.ss.lark.android.passport.biz.compat.split_flow_page.SplitFlowPageActivity;
import com.ss.lark.android.passport.biz.feature.account_center.AccountCenterActivity;
import com.ss.lark.android.passport.biz.feature.account_center.OfficialEmailListActivity;
import com.ss.lark.android.passport.biz.feature.applink_to_idp.ApplinkIdpActivity;
import com.ss.lark.android.passport.biz.feature.auth_type.AuthTypeActivity;
import com.ss.lark.android.passport.biz.feature.bio_auth.BioAuthActivity;
import com.ss.lark.android.passport.biz.feature.company_login.CompanyLoginActivity;
import com.ss.lark.android.passport.biz.feature.create_team.CreateTeamActivity;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.TenantJoinWayActivity;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.TenantCodeActivity;
import com.ss.lark.android.passport.biz.feature.login_input.LoginInputActivity;
import com.ss.lark.android.passport.biz.feature.pending_approve.PendingApproveActivity;
import com.ss.lark.android.passport.biz.feature.real_name.RealNameActivity;
import com.ss.lark.android.passport.biz.feature.set.SetNewPasswordActivity;
import com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountActivity;
import com.ss.lark.android.passport.biz.feature.setname.SetNameActivity;
import com.ss.lark.android.passport.biz.feature.user_info.SetUserInfoActivity;
import com.ss.lark.android.passport.biz.feature.user_item_list.UserListActivity;
import com.ss.lark.android.passport.biz.feature.verify_code.InputCodeActivity;

/* renamed from: com.ss.lark.android.passport.biz.router.e */
public class C65191e extends C49095h {

    /* renamed from: d */
    private static volatile C65191e f164148d;

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d, com.ss.android.lark.passport.infra.base.router.C49095h
    /* renamed from: c */
    public String mo171383c() {
        return "DefaultPageRouterAction";
    }

    /* renamed from: d */
    public static C65191e m256023d() {
        if (f164148d == null) {
            synchronized (C65191e.class) {
                if (f164148d == null) {
                    f164148d = new C65191e();
                }
            }
        }
        return f164148d;
    }

    private C65191e() {
        mo171391a(CreateTeamActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(LoginInputActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(RealNameActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(BioAuthActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(InputCodeActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(SetNameActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(TenantJoinWayActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(TenantCodeActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(PendingApproveActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(CompanyLoginActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(SetUserInfoActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(UserListActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(AccountCenterActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(OfficialEmailListActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(AuthTypeActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(SetNewPasswordActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(RecoverAccountActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(UserListActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(ApplinkIdpActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(SplitFlowPageActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(RestPhoneNumActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(com.ss.lark.android.passport.biz.compat.real_name.RealNameActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(SetPasswordActivity.class, RouterScene.ALL.value, new int[0]);
        mo171391a(com.ss.lark.android.passport.biz.compat.InputCodeActivity.class, RouterScene.ALL.value, new int[0]);
    }
}
