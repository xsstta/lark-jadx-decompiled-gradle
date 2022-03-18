package com.ss.lark.android.passport.biz.feature.login_input.mvp;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49185d;
import com.ss.android.lark.passport.infra.util.ChoosePolicyUtil;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.feature.login_input.LoginStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView;

/* renamed from: com.ss.lark.android.passport.biz.feature.login_input.mvp.d */
public class C64886d extends LoginRegisterBaseView implements AbstractC64881b {
    @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        super.cn_();
        this.f163564d = null;
    }

    /* renamed from: d */
    public void mo223859d() {
        this.ivBack.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView
    /* renamed from: f */
    public boolean mo223861f() {
        return PassportConfigHelper.m193024f();
    }

    @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo223860e();
    }

    /* renamed from: g */
    public void mo223862g() {
        mo223885l();
        LoginStatisticsHelper.m254800b();
        C49092f.m193532a(this.f163563c, "create_team_prepare", (JSONObject) null, RouterScene.ALL.value, mo171187c(), this.f123085b, new AbstractC49336a() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.C64886d.C648904 */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public void onRouterResult(int i, Object obj) {
                PassportLog passportLog = C64886d.this.f123085b;
                passportLog.mo171465b("n_action_login_input_register", "Create team prepare, code is " + i);
                C64886d.this.mo223886m();
            }
        });
    }

    /* renamed from: e */
    public void mo223860e() {
        this.tvTitle.setText(UIHelper.mustacheFormat((int) R.string.Lark_Passport_Newlogin_HomePageTitle, "BrandName", C49185d.m193928b(this.f163563c)));
        this.tvLoginPolicy.setVisibility(8);
        this.llRegisterPolicy.setVisibility(0);
        this.tvRegister.setVisibility(0);
        this.ivBack.setVisibility(8);
        ChoosePolicyUtil.f123476b.mo171690a(this.tvRegister, this.f163563c.getString(R.string.Lark_Passport_Newlogin_HomePageSwitchSignUpButton), this.f163563c.getString(R.string.Lark_Passport_Newlogin_HomePageSwitchSignUpButtonAdd), new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.C64886d.View$OnClickListenerC648893 */

            public void onClick(View view) {
                C64886d.this.mo223862g();
            }
        });
    }

    /* renamed from: b */
    public void mo223858b(boolean z) {
        int i;
        AppCompatTextView appCompatTextView = this.tvChangeLanguage;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        appCompatTextView.setVisibility(i);
    }

    /* renamed from: a */
    public void mo223856a(boolean z) {
        int i;
        if (z) {
            i = R.drawable.signin_sdk_titlebar_close_normal;
        } else {
            i = R.drawable.lkui_navigation_back;
        }
        this.ivBack.setImageResource(i);
    }

    /* renamed from: a */
    public void mo223855a(String str) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f163563c).title("")).message(UDDialogUtils.m193819a(str))).addActionButton(R.id.ud_dialog_btn_secondary, this.f163563c.getString(R.string.Lark_Login_V3_LoginTitle), $$Lambda$d$IDNyTNGrAgwZPelzeCEvJ7Gh36E.INSTANCE)).addActionButton(R.id.ud_dialog_btn_primary, this.f163563c.getString(R.string.Lark_Login_V3_notregtoreg), new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.$$Lambda$d$XbzadPPTLzbvHiCSBjT8jbWx0 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C64886d.this.m254828a(dialogInterface, i);
            }
        })).show();
    }

    /* renamed from: b */
    public void mo223857b(String str) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f163563c).title("")).message(UDDialogUtils.m193819a(str))).addActionButton(R.id.ud_dialog_btn_secondary, this.f163563c.getString(R.string.Lark_Passport_CP_Cancel), new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.C64886d.DialogInterface$OnClickListenerC648882 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        })).addActionButton(R.id.ud_dialog_btn_primary, this.f163563c.getString(R.string.Lark_Login_V3_notregtoreg), new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.C64886d.DialogInterface$OnClickListenerC648871 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C49096b.m193604p();
                C64886d.this.mo223862g();
                dialogInterface.dismiss();
            }
        })).show();
    }

    public C64886d(Activity activity, LoginRegisterBaseView.AbstractC64902a aVar) {
        super(activity, aVar);
        this.f163568h = LoginRegisterBaseView.PageType.LOGIN;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m254828a(DialogInterface dialogInterface, int i) {
        mo223862g();
        dialogInterface.dismiss();
    }
}
