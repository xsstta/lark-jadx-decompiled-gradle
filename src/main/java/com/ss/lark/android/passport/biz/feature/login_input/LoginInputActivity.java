package com.ss.lark.android.passport.biz.feature.login_input;

import android.os.Bundle;
import com.ss.android.lark.passport.infra.base.architecture.C49018a;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;
import com.ss.lark.android.passport.biz.feature.login_input.mvp.C64883c;
import com.ss.lark.android.passport.biz.feature.login_input.mvp.C64886d;
import com.ss.lark.android.passport.biz.feature.login_input.mvp.LoginInputPresenter;
import com.ss.lark.android.passport.biz.feature.login_register_base.LoginRegisterBaseActivity;

@RouterAnno(name = "login", teaName = "passport_login_view")
public class LoginInputActivity extends LoginRegisterBaseActivity<C64883c, C64886d, LoginInputPresenter> {

    /* renamed from: j */
    private SigninParams f163539j;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: u */
    public String mo171149u() {
        return "n_page_login_input_start";
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.lark.android.passport.biz.feature.login_register_base.LoginRegisterBaseActivity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: q */
    public C49018a.C49019a mo171145q() {
        return new C49018a.C49019a(C49018a.f123068d);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: r */
    public C49018a.C49019a mo171146r() {
        return new C49018a.C49019a(C49018a.f123069e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C64886d mo223839z() {
        return new C64886d(this, this.f163559i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        ((LoginInputPresenter) this.f123050a).mo223846h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public C64883c mo223838y() {
        return new C64883c(getIntent());
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        int[] exitAnimation;
        super.finish();
        SigninParams signinParams = this.f163539j;
        if (signinParams != null && (exitAnimation = signinParams.getExitAnimation()) != null && exitAnimation.length > 0) {
            C49018a.m193088a(this, new C49018a.C49019a(exitAnimation));
        }
    }

    /* renamed from: a */
    private boolean mo170967a() {
        if (ServiceFinder.m193749d().getUserUnit() == null || ServiceFinder.m193749d().getUserUnit().equals("eu_ea") == ServiceFinder.m193748c().isLarkPackage()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        if (!mo170967a()) {
            ServiceFinder.m193752g().onHostEnvClear(null);
        }
        PassportConfigCenter.f123034a.mo171110a((String) null);
        ((LoginInputPresenter) this.f123050a).mo223845g();
        BaseLoginHttpRequest.removeXPassportToken();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.lark.android.passport.biz.feature.login_register_base.LoginRegisterBaseActivity
    public void onCreate(Bundle bundle) {
        int[] enterAnimation;
        super.onCreate(bundle);
        SigninParams signinParams = (SigninParams) getIntent().getSerializableExtra("tag_signin_params");
        this.f163539j = signinParams;
        if (signinParams != null && (enterAnimation = signinParams.getEnterAnimation()) != null && enterAnimation.length > 0) {
            C49018a.m193088a(this, new C49018a.C49019a(enterAnimation));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LoginInputPresenter mo223835a(C64883c cVar, C64886d dVar) {
        return new LoginInputPresenter(this, cVar, dVar, this.f123055f, this.f123052c);
    }
}
