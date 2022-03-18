package com.ss.lark.android.passport.biz.feature.verify_code;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.feature.input_pwd.C64778a;

public class VerifyBaseActivity extends BaseActivity implements IChangePage {

    /* renamed from: h */
    private C64778a f164014h;

    /* renamed from: i */
    private VerifyCodeFragment f164015i;

    /* renamed from: j */
    private VerifyCodeFragment f164016j;

    /* renamed from: k */
    private VerifyCodeFragment f164017k;

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: j */
    public void mo171138j() {
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.IChangePage
    /* renamed from: a */
    public void mo170967a() {
        this.f123052c.mo171465b("InputCodeActivity", "changePwdPage");
        if (this.f164014h != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f164014h).commit();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.IChangePage
    /* renamed from: b */
    public void mo170969b() {
        this.f123052c.mo171465b("InputCodeActivity", "changeOtpPage");
        if (this.f164015i != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f164015i).commit();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.IChangePage
    /* renamed from: c */
    public void mo170970c() {
        this.f123052c.mo171465b("InputCodeActivity", "changeBackupPhonePage");
        if (this.f164017k != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f164017k).commit();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.IChangePage
    /* renamed from: d */
    public void mo224310d() {
        this.f123052c.mo171465b("InputCodeActivity", "changeCodePage = ");
        if (this.f164016j != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f164016j).commit();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("InputCodeActivity", "enterActivity");
        setContentView(R.layout.signin_sdk_activity_input_code);
        this.f164014h = (C64778a) Fragment.instantiate(this, C64778a.class.getName(), null);
        this.f164016j = new VerifyCodeFragment();
        this.f164015i = new VerifyCodeFragment();
        this.f164017k = new VerifyCodeFragment();
        C64778a aVar = this.f164014h;
        if (aVar != null) {
            aVar.mo223657a(this);
        }
        VerifyCodeFragment bVar = this.f164016j;
        if (bVar != null) {
            bVar.mo224311a(this);
            this.f164016j.mo224312a("verify_code");
        }
        VerifyCodeFragment bVar2 = this.f164015i;
        if (bVar2 != null) {
            bVar2.mo224311a(this);
            this.f164015i.mo224312a("otp_code");
        }
        VerifyCodeFragment bVar3 = this.f164017k;
        if (bVar3 != null) {
            bVar3.mo224311a(this);
            this.f164017k.mo224312a("backup_phone_code");
        }
    }

    /* renamed from: a */
    public void mo224309a(VerifyIdentityStepInfo verifyIdentityStepInfo, String str) {
        Fragment fragment;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (verifyIdentityStepInfo == null) {
            this.f123052c.mo171465b("InputCodeActivity", "initFragmentInfo but stepInfo is null");
            beginTransaction.replace(R.id.fragment_container, this.f164016j).commit();
            return;
        }
        PassportLog passportLog = this.f123052c;
        passportLog.mo171465b("InputCodeActivity", "Identify defaultVerifyItem " + verifyIdentityStepInfo.defaultVerifyItem);
        Bundle bundle = new Bundle();
        bundle.putSerializable("verify_step_info", verifyIdentityStepInfo);
        this.f164016j.setArguments(bundle);
        this.f164014h.setArguments(bundle);
        this.f164015i.setArguments(bundle);
        this.f164017k.setArguments(bundle);
        String str2 = verifyIdentityStepInfo.defaultVerifyItem;
        if (str2 == null) {
            str2 = "";
        }
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1948761613:
                if (str2.equals("verify_code")) {
                    c = 0;
                    break;
                }
                break;
            case -1642916469:
                if (str2.equals("verify_code_spare")) {
                    c = 1;
                    break;
                }
                break;
            case -1032682907:
                if (str2.equals("verify_otp")) {
                    c = 2;
                    break;
                }
                break;
            case -1032681865:
                if (str2.equals("verify_pwd")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                fragment = this.f164016j;
                break;
            case 1:
                fragment = this.f164017k;
                break;
            case 2:
                fragment = this.f164015i;
                break;
            case 3:
                fragment = this.f164014h;
                break;
            default:
                this.f123052c.mo171471d("InputCodeActivity", "default verify item not found");
                finish();
                return;
        }
        beginTransaction.replace(R.id.fragment_container, fragment).commit();
    }
}
