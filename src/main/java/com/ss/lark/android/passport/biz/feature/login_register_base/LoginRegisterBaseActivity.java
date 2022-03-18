package com.ss.lark.android.passport.biz.feature.login_register_base;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.lark.android.passport.biz.base.ui.BaseUiContainer;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64907b;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64909c;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView;

public abstract class LoginRegisterBaseActivity<M extends AbstractC64907b, V extends LoginRegisterBaseView, P extends AbstractC64909c> extends BaseActivity<P> {

    /* renamed from: h */
    protected BaseUiContainer f163558h;

    /* renamed from: i */
    protected LoginRegisterBaseView.AbstractC64902a f163559i = new LoginRegisterBaseView.AbstractC64902a() {
        /* class com.ss.lark.android.passport.biz.feature.login_register_base.LoginRegisterBaseActivity.C648911 */

        @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AbstractC64902a
        /* renamed from: a */
        public void mo223866a(LoginRegisterBaseView loginRegisterBaseView) {
            ButterKnife.bind(loginRegisterBaseView, LoginRegisterBaseActivity.this);
        }
    };

    /* renamed from: j */
    private V f163560j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract P mo223835a(M m, V v);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract M mo223838y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract V mo223839z();

    /* renamed from: a */
    private void mo170967a() {
        ServiceFinder.m193760o().cleanEnvAndDid(this.f123055f, new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.LoginRegisterBaseActivity.C648922 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                LoginRegisterBaseActivity.this.f123052c.mo171471d("n_action_clean_env", "LoginRegisterBaseActivity, cleanEnvAndDid error");
            }

            /* renamed from: a */
            public void mo145179a(String str) {
                PassportLog passportLog = LoginRegisterBaseActivity.this.f123052c;
                passportLog.mo171465b("n_action_clean_env", "LoginRegisterBaseActivity, cleanEnvAndtDid success, deviceId is:" + str);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((AbstractC64909c) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: b */
    private void mo170969b() {
        V z = mo223839z();
        this.f163560j = z;
        z.mo223877a(this.f163558h);
        this.f123050a = mo223835a(mo223838y(), this.f163560j);
        ((AbstractC64909c) this.f123050a).mo171169a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f163558h = BaseUiContainer.m252995a(this, R.layout.signin_sdk_activity_login_input);
        if (ServiceFinder.m193744a().getForegroundUser() == null) {
            this.f123052c.mo171465b("n_action_clean_env", "LoginRegisterBaseActivity, no foregroundUser, clean Env");
            mo170967a();
        }
        mo170969b();
    }
}
