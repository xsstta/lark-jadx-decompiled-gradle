package com.ss.lark.android.passport.biz.feature.set.mvp;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.entity.PwdSetPwdStepInfo;
import com.ss.lark.android.passport.biz.feature.set.SetPasswordStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.set.mvp.C64975a;
import com.ss.lark.android.passport.biz.widget.password.PasswordEditText;

public class SetNewPasswordView extends AbstractC49023c<C64975a.AbstractC64977b.AbstractC64978a> implements C64975a.AbstractC64977b {

    /* renamed from: c */
    public CommonUiContainer f163702c;

    /* renamed from: d */
    public final Activity f163703d;

    /* renamed from: e */
    public C64975a.AbstractC64977b.AbstractC64978a f163704e;

    /* renamed from: f */
    public final PwdSetPwdStepInfo f163705f;

    /* renamed from: g */
    private DialogC49246b f163706g;
    @BindView(6891)
    PasswordEditText mPwdEditText;
    @BindView(6892)
    PasswordEditText mPwdEditTextAgain;
    @BindView(7040)
    CommonTitleBar mTitle;
    @BindView(7203)
    TextView tvPwdAgainErrorTip;
    @BindView(7204)
    TextView tvPwdErrorTip;

    @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64977b
    /* renamed from: f */
    public void mo223996f() {
        this.mPwdEditText.mo224693f();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m255097j();
        m255101n();
    }

    @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64977b
    /* renamed from: d */
    public void mo223994d() {
        KeyboardUtils.hideKeyboard(this.f163703d);
        this.f163702c.mo222884e();
    }

    @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64977b
    /* renamed from: e */
    public void mo223995e() {
        this.mPwdEditText.mo224691d();
        this.mPwdEditTextAgain.mo224691d();
    }

    /* renamed from: j */
    private void m255097j() {
        m255098k();
        if (this.mPwdEditText.getVisibility() == 0) {
            this.mPwdEditText.mo224694g();
        }
        this.f163702c.mo222876a(false);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        PasswordEditText passwordEditText = this.mPwdEditText;
        if (passwordEditText != null) {
            passwordEditText.mo224690c();
        }
        PasswordEditText passwordEditText2 = this.mPwdEditTextAgain;
        if (passwordEditText2 != null) {
            passwordEditText2.mo224690c();
        }
        mo223998h();
    }

    @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64977b
    /* renamed from: g */
    public void mo223997g() {
        Activity activity = this.f163703d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
            return;
        }
        if (this.f163706g == null) {
            this.f163706g = new DialogC49246b(this.f163703d, true);
        }
        this.f163706g.show();
    }

    @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64977b
    /* renamed from: h */
    public void mo223998h() {
        Activity activity = this.f163703d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
            return;
        }
        DialogC49246b bVar = this.f163706g;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: i */
    public boolean mo223999i() {
        KeyboardUtils.hideKeyboard(this.f163703d);
        PwdSetPwdStepInfo pwdSetPwdStepInfo = this.f163705f;
        if (pwdSetPwdStepInfo == null) {
            return false;
        }
        if (pwdSetPwdStepInfo.skipButtonConfig == null) {
            return this.f163705f.disableBack;
        }
        this.f163704e.mo224007a();
        return true;
    }

    /* renamed from: n */
    private void m255101n() {
        this.mPwdEditText.setTextChangeListener(new PasswordEditText.AbstractC65325e() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.C649693 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65325e
            /* renamed from: a */
            public void mo222922a(String str) {
                boolean z;
                CommonUiContainer commonUiContainer = SetNewPasswordView.this.f163702c;
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(SetNewPasswordView.this.mPwdEditTextAgain.getString())) {
                    z = false;
                } else {
                    z = true;
                }
                commonUiContainer.mo222876a(z);
                SetNewPasswordView setNewPasswordView = SetNewPasswordView.this;
                setNewPasswordView.mo223992a(setNewPasswordView.mPwdEditText, SetNewPasswordView.this.tvPwdErrorTip);
            }
        });
        this.mPwdEditText.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.View$OnClickListenerC649704 */

            public void onClick(View view) {
                SetNewPasswordView.this.mPwdEditTextAgain.mo224693f();
            }
        });
        this.mPwdEditTextAgain.setTextChangeListener(new PasswordEditText.AbstractC65325e() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.C649715 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65325e
            /* renamed from: a */
            public void mo222922a(String str) {
                boolean z;
                CommonUiContainer commonUiContainer = SetNewPasswordView.this.f163702c;
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(SetNewPasswordView.this.mPwdEditText.getString())) {
                    z = false;
                } else {
                    z = true;
                }
                commonUiContainer.mo222876a(z);
                SetNewPasswordView setNewPasswordView = SetNewPasswordView.this;
                setNewPasswordView.mo223992a(setNewPasswordView.mPwdEditTextAgain, SetNewPasswordView.this.tvPwdAgainErrorTip);
            }
        });
        this.mPwdEditTextAgain.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.View$OnClickListenerC649726 */

            public void onClick(View view) {
                SetNewPasswordView.this.mPwdEditText.mo224693f();
            }
        });
        this.mTitle.setTitleClickListener(new CommonTitleBar.AbstractC49239c() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.C649737 */

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: a */
            public void mo171769a() {
                SetPasswordStatisticsHelper.m255093b(SetNewPasswordView.this.f163705f.flowType);
                SetNewPasswordView.this.f163703d.onBackPressed();
            }

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49239c, com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: d */
            public void mo171772d() {
                super.mo171772d();
                SetPasswordStatisticsHelper.m255094c(SetNewPasswordView.this.f163705f.flowType);
                SetNewPasswordView.this.f163704e.mo224007a();
            }
        });
        this.f163702c.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.View$OnClickListenerC649748 */

            public void onClick(View view) {
                String string = SetNewPasswordView.this.mPwdEditText.getString();
                String string2 = SetNewPasswordView.this.mPwdEditTextAgain.getString();
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    UDToast.build(SetNewPasswordView.this.f163703d).mo91637a(R.string.Lark_Settings_PlaceholderOfSetNewPassword).mo91638a(17, 0, 0).mo91656k();
                } else if (!string.equals(string2)) {
                    if (UIUtils.isActivityRunning(SetNewPasswordView.this.f163703d) && KeyboardUtils.isSoftShowing(SetNewPasswordView.this.f163703d)) {
                        KeyboardUtils.hideKeyboard(SetNewPasswordView.this.f163703d);
                    }
                    UDToast.build(SetNewPasswordView.this.f163703d).mo91637a(R.string.Lark_Passport_PSWordNotSameToastPC).mo91638a(17, 0, 0).mo91656k();
                    SetNewPasswordView.this.mo223995e();
                    SetNewPasswordView.this.mPwdEditText.mo224693f();
                    SetNewPasswordView.this.mPwdEditTextAgain.mo224693f();
                } else {
                    SetNewPasswordView.this.f163704e.mo224008a(string2);
                }
            }
        });
    }

    /* renamed from: l */
    private void m255099l() {
        PwdSetPwdStepInfo pwdSetPwdStepInfo = this.f163705f;
        if (pwdSetPwdStepInfo == null || pwdSetPwdStepInfo.pwdConfig == null) {
            this.mPwdEditText.setVisibility(8);
            return;
        }
        String str = this.f163705f.pwdConfig.placeholder;
        this.mPwdEditText.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            str = this.f163703d.getResources().getString(R.string.Lark_Settings_PlaceholderOfSetNewPassword);
        }
        this.mPwdEditText.mo224688a(m255095a(str));
        this.mPwdEditText.setOnInputFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.View$OnFocusChangeListenerC649671 */

            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    SetNewPasswordView setNewPasswordView = SetNewPasswordView.this;
                    setNewPasswordView.mo223993a(setNewPasswordView.mPwdEditText, SetNewPasswordView.this.tvPwdErrorTip, SetNewPasswordView.this.mPwdEditText.getString());
                }
            }
        });
    }

    /* renamed from: m */
    private void m255100m() {
        PwdSetPwdStepInfo pwdSetPwdStepInfo = this.f163705f;
        if (pwdSetPwdStepInfo == null || pwdSetPwdStepInfo.confirmPwdConfig == null) {
            this.mPwdEditTextAgain.setVisibility(8);
            return;
        }
        String str = this.f163705f.confirmPwdConfig.placeholder;
        this.mPwdEditTextAgain.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            str = this.f163703d.getResources().getString(R.string.Lark_Passport_ReEnterNewPSHintPC);
        }
        this.mPwdEditTextAgain.mo224688a(m255095a(str));
        this.mPwdEditTextAgain.setOnInputFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView.View$OnFocusChangeListenerC649682 */

            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    SetNewPasswordView setNewPasswordView = SetNewPasswordView.this;
                    setNewPasswordView.mo223993a(setNewPasswordView.mPwdEditTextAgain, SetNewPasswordView.this.tvPwdAgainErrorTip, SetNewPasswordView.this.mPwdEditTextAgain.getString());
                }
            }
        });
    }

    /* renamed from: k */
    private void m255098k() {
        String str;
        String str2;
        boolean z;
        boolean z2;
        PwdSetPwdStepInfo pwdSetPwdStepInfo = this.f163705f;
        if (pwdSetPwdStepInfo != null) {
            if (TextUtils.isEmpty(pwdSetPwdStepInfo.title)) {
                str = this.f163703d.getResources().getString(R.string.Lark_Settings_TitleOfSetNewPassword);
            } else {
                str = this.f163705f.title;
            }
            this.f163702c.mo222871a((CharSequence) str);
            if (TextUtils.isEmpty(this.f163705f.subTitle)) {
                str2 = this.f163703d.getResources().getString(R.string.Lark_Settings_DescOfSetPassword);
            } else {
                str2 = this.f163705f.subTitle;
            }
            this.f163702c.mo222879b(str2);
            m255099l();
            m255100m();
            this.f163702c.mo222870a(this.f163705f.nextButtonConfig);
            ButtonInfo buttonInfo = this.f163705f.skipButtonConfig;
            CommonTitleBar commonTitleBar = this.mTitle;
            boolean z3 = false;
            if (buttonInfo != null) {
                z = true;
            } else {
                z = false;
            }
            commonTitleBar.setRightTvEnable(z);
            if (buttonInfo != null) {
                this.mTitle.setRithtText(this.f163705f.skipButtonConfig.text);
                TextView rightTextView = this.mTitle.getRightTextView();
                rightTextView.setTypeface(rightTextView.getTypeface(), 1);
            }
            PassportLog passportLog = this.f123085b;
            passportLog.mo171465b("n_page_set_pwd_start", "disableBack: " + this.f163705f.disableBack + ", skipButton: " + buttonInfo);
            if (!this.f163705f.disableBack || buttonInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (buttonInfo != null) {
                z3 = true;
            }
            this.mTitle.mo171755a(z2, z3);
            PassportLog passportLog2 = this.f123085b;
            passportLog2.mo171465b("n_page_set_pwd_start", "showBackButton: " + z2 + ", closeStyle: " + z3);
            this.tvPwdErrorTip.setText(this.f163705f.formatErrorText);
            this.tvPwdAgainErrorTip.setText(this.f163705f.formatErrorText);
        }
    }

    /* renamed from: a */
    public void mo171188a(C64975a.AbstractC64977b.AbstractC64978a aVar) {
        this.f163704e = aVar;
    }

    /* renamed from: a */
    private PasswordEditText.C65324d m255095a(String str) {
        return PasswordEditText.C65324d.m256266a(this.f163703d, str);
    }

    /* renamed from: b */
    private void m255096b(PasswordEditText passwordEditText, TextView textView) {
        passwordEditText.mo224687a();
        textView.setVisibility(0);
    }

    /* renamed from: a */
    public void mo223992a(PasswordEditText passwordEditText, TextView textView) {
        passwordEditText.mo224689b();
        textView.setVisibility(8);
    }

    public SetNewPasswordView(Activity activity, CommonUiContainer commonUiContainer, PwdSetPwdStepInfo pwdSetPwdStepInfo) {
        this.f163703d = activity;
        this.f163702c = commonUiContainer;
        commonUiContainer.mo222875a(this);
        this.f163705f = pwdSetPwdStepInfo;
    }

    /* renamed from: a */
    public void mo223993a(PasswordEditText passwordEditText, TextView textView, String str) {
        String str2;
        boolean z;
        PwdSetPwdStepInfo pwdSetPwdStepInfo = this.f163705f;
        if (pwdSetPwdStepInfo != null) {
            str2 = pwdSetPwdStepInfo.regExp;
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || str.matches(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo223992a(passwordEditText, textView);
        } else {
            m255096b(passwordEditText, textView);
        }
    }
}
