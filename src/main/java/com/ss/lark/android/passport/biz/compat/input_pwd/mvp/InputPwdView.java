package com.ss.lark.android.passport.biz.compat.input_pwd.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.util.C49153af;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.ChoosePolicyUtil;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.widget.C49240a;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.base.p3208a.C64343a;
import com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.widget.password.PasswordEditText;

public class InputPwdView extends AbstractC49023c<C64375a.AbstractC64377b.AbstractC64378a> implements C64375a.AbstractC64377b {

    /* renamed from: c */
    protected Activity f162644c;
    @BindView(6338)
    ConstraintLayout clTranslationContainer;

    /* renamed from: d */
    protected C64375a.AbstractC64377b.AbstractC64378a f162645d;

    /* renamed from: e */
    public AbstractC64374a f162646e;

    /* renamed from: f */
    private UniContext f162647f;

    /* renamed from: g */
    private C64343a f162648g;

    /* renamed from: h */
    private C49240a.AbstractC49245b f162649h = new C49240a.AbstractC49245b() {
        /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.C643728 */

        @Override // com.ss.android.lark.passport.infra.widget.C49240a.AbstractC49245b
        /* renamed from: a */
        public void mo171800a() {
            InputPwdView.this.mo222916a(true);
        }

        @Override // com.ss.android.lark.passport.infra.widget.C49240a.AbstractC49245b
        /* renamed from: b */
        public void mo171801b() {
            InputPwdView.this.mo222916a(false);
        }
    };
    @BindView(6681)
    View llContainer;
    @BindView(6675)
    LinearLayout mLlNextStep;
    @BindView(6467)
    PasswordEditText mPwdEditText;
    @BindView(6567)
    ImageView titlebarInputPwd;
    @BindView(7206)
    protected TextView tvResetPwd;
    @BindView(7195)
    protected TextView tvSubtitle;
    @BindView(7194)
    protected TextView tvTitle;
    @BindView(7183)
    protected TextView viewChangePage;

    /* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView$a */
    public interface AbstractC64374a {
        /* renamed from: a */
        void mo222912a();

        /* renamed from: a */
        void mo222913a(InputPwdView inputPwdView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f162647f;
    }

    @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b
    /* renamed from: f */
    public void mo222919f() {
        this.mPwdEditText.mo224691d();
    }

    /* renamed from: i */
    private void m253040i() {
        new C49240a(this.f162644c).mo171796a(this.f162649h);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f162646e.mo222913a(this);
        m253039h();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f162645d = null;
        this.f162646e = null;
        PasswordEditText passwordEditText = this.mPwdEditText;
        if (passwordEditText != null) {
            passwordEditText.mo224690c();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b
    /* renamed from: d */
    public void mo222917d() {
        Activity activity = this.f162644c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b
    /* renamed from: e */
    public void mo222918e() {
        Activity activity = this.f162644c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: g */
    public void mo222920g() {
        if (this.f162645d == null) {
            this.f123085b.mo171471d("InputPwdView", "empty viewDelegate");
            return;
        }
        this.mLlNextStep.setEnabled(this.f162645d.mo222935b(this.mPwdEditText.getString()));
    }

    /* renamed from: j */
    private void m253041j() {
        ChoosePolicyUtil.f123476b.mo171690a(this.tvResetPwd, this.f162644c.getResources().getString(R.string.Lark_Login_V3_ForgetPassword), this.f162644c.getResources().getString(R.string.Lark_Login_V3_ResetPwd), new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.View$OnClickListenerC643739 */

            public void onClick(View view) {
                InputPwdView.this.mPwdEditText.mo224693f();
                if (InputPwdView.this.f162645d == null) {
                    InputPwdView.this.f123085b.mo171471d("InputPwdView", "empty viewDelegate");
                } else {
                    InputPwdView.this.f162645d.mo222934b();
                }
            }
        });
    }

    /* renamed from: h */
    private void m253039h() {
        this.mLlNextStep.setEnabled(false);
        ak.m193850a(this.viewChangePage, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.View$OnClickListenerC643651 */

            public void onClick(View view) {
                if (!InputPwdView.this.f162645d.mo222933a()) {
                    InputPwdView.this.f123085b.mo171465b("InputPwdView", "checkAndOpenMagicLinkPage return false, and do changePage");
                    InputPwdView.this.f162646e.mo222912a();
                    return;
                }
                InputPwdView.this.f123085b.mo171465b("InputPwdView", "checkAndOpenMagicLinkPage return true");
            }
        });
        String string = this.f162644c.getResources().getString(R.string.Lark_Login_V3_InputPasswordPlaceholder);
        C64375a.AbstractC64377b.AbstractC64378a aVar = this.f162645d;
        if (aVar != null) {
            string = aVar.mo222931a(this.f162644c);
        }
        this.mPwdEditText.mo224688a(PasswordEditText.C65324d.m256266a(this.f162644c, string));
        this.mPwdEditText.mo224694g();
        this.mPwdEditText.setTextChangeListener(new PasswordEditText.AbstractC65325e() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.C643662 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65325e
            /* renamed from: a */
            public void mo222922a(String str) {
                InputPwdView.this.mo222920g();
            }
        });
        this.mPwdEditText.setOnInputCompleteListener(new PasswordEditText.AbstractC65321a() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.C643673 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65321a
            /* renamed from: a */
            public void mo222923a(String str) {
                InputPwdView.this.mo222920g();
            }
        });
        this.mPwdEditText.setOnKeyboardDetectorListener(new PasswordEditText.AbstractC65322b() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.C643684 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65322b
            /* renamed from: a */
            public void mo222924a(String str) {
                InputPwdView.this.mLlNextStep.performClick();
            }
        });
        ak.m193850a(this.mLlNextStep, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.View$OnClickListenerC643695 */

            public void onClick(View view) {
                InputPwdView.this.f162645d.mo222932a(InputPwdView.this.mPwdEditText.getString());
            }
        });
        this.titlebarInputPwd.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.View$OnClickListenerC643706 */

            public void onClick(View view) {
                if (C49203q.m193977c(InputPwdView.this.f162644c)) {
                    C49203q.m193973a((Context) InputPwdView.this.f162644c);
                }
                InputPwdView.this.f162644c.finish();
            }
        });
        this.llContainer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.View$OnFocusChangeListenerC643717 */

            public void onFocusChange(View view, boolean z) {
                if (z && C49203q.m193977c(InputPwdView.this.f162644c)) {
                    C49203q.m193973a((Context) InputPwdView.this.f162644c);
                }
            }
        });
        m253041j();
        m253040i();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f162647f = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C64375a.AbstractC64377b.AbstractC64378a aVar) {
        this.f162645d = aVar;
    }

    /* renamed from: a */
    public void mo222916a(boolean z) {
        if (z) {
            int top = this.mLlNextStep.getTop() - this.clTranslationContainer.getBottom();
            if (top < 0) {
                top -= C49154ag.m193838b((Context) this.f162644c, (int) R.dimen.signin_sdk_login_input_offset);
            }
            if (top < 0 && this.f162648g == null) {
                C64343a a = new C64343a.C64344a().mo222866a(this.clTranslationContainer).mo222865a(top).mo222867a();
                this.f162648g = a;
                a.mo222863a();
                return;
            }
            return;
        }
        C64343a aVar = this.f162648g;
        if (aVar != null) {
            aVar.mo222864b();
            this.f162648g = null;
        }
    }

    public InputPwdView(Activity activity, AbstractC64374a aVar) {
        this.f162644c = activity;
        this.f162646e = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b
    /* renamed from: a */
    public void mo222915a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, boolean z, boolean z2, boolean z3) {
        int i;
        String str;
        if (verifyIdentifyBean != null) {
            if (!TextUtils.isEmpty(verifyIdentifyBean.subTitle) && !TextUtils.isEmpty(verifyIdentifyBean.contact)) {
                String a = C49153af.m193826a(this.f162644c, verifyIdentifyBean.subTitle, "contact", verifyIdentifyBean.contact, this.f123085b);
                SpannableString spannableString = new SpannableString(a);
                int indexOf = a.indexOf(verifyIdentifyBean.contact);
                if (indexOf >= 0 && verifyIdentifyBean.contact.length() + indexOf <= spannableString.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(-16777216), indexOf, verifyIdentifyBean.contact.length() + indexOf, 33);
                    spannableString.setSpan(new StyleSpan(1), indexOf, verifyIdentifyBean.contact.length() + indexOf, 33);
                }
                this.tvSubtitle.setText(spannableString);
            }
            TextView textView = this.viewChangePage;
            int i2 = 0;
            if (z || z2) {
                i = 0;
            } else {
                i = 4;
            }
            textView.setVisibility(i);
            if (z) {
                str = this.f162644c.getString(R.string.Lark_Login_V3_VerifyCodeLogin);
            } else {
                str = this.f162644c.getString(R.string.Lark_Login_VerifyEmailLogin);
            }
            this.viewChangePage.setText(str);
            if (!z3) {
                i2 = 8;
            }
            this.tvResetPwd.setVisibility(i2);
            if (!TextUtils.isEmpty(verifyIdentifyBean.title)) {
                this.tvTitle.setText(verifyIdentifyBean.title);
            }
        }
    }
}
