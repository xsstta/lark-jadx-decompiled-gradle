package com.ss.lark.android.passport.biz.compat.verify_code.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.util.C49153af;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a;
import com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText;

public class LoginVerifyCodeView extends AbstractC49023c<C64536a.AbstractC64538b.AbstractC64539a> implements C64536a.AbstractC64538b {

    /* renamed from: c */
    public AbstractC64535b f162918c;

    /* renamed from: d */
    protected C64536a.AbstractC64538b.AbstractC64539a f162919d;

    /* renamed from: e */
    public Handler f162920e;

    /* renamed from: f */
    protected Activity f162921f;

    /* renamed from: g */
    private RunnableC64534a f162922g;

    /* renamed from: h */
    private UniContext f162923h;

    /* renamed from: i */
    private VerifyCodeEditText.AbstractC65370d f162924i = new VerifyCodeEditText.AbstractC65370d() {
        /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.C645271 */

        @Override // com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.AbstractC65370d
        /* renamed from: a */
        public void mo223210a(String str) {
            if (!TextUtils.isEmpty(str) && str.length() == 6) {
                C49203q.m193973a((Context) LoginVerifyCodeView.this.f162921f);
                LoginVerifyCodeView.this.f162919d.mo223231a(str);
            }
        }
    };
    @BindView(6681)
    View llContainer;
    @BindView(6377)
    protected TextView mCountdownTv;
    @BindView(6684)
    protected LinearLayout mLlFindAccount;
    @BindView(7231)
    protected TextView mTvFindAccountClick;
    @BindView(7320)
    protected VerifyCodeEditText mVerifyCodeEditText;
    @BindView(6567)
    protected ImageView titlbarVeryfyCode;
    @BindView(7214)
    protected TextView tvTips;
    @BindView(7246)
    protected TextView tvTitle;
    @BindView(7218)
    protected TextView tvVerifySub;
    @BindView(7183)
    protected TextView viewChange;

    /* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView$b */
    public interface AbstractC64535b {
        /* renamed from: a */
        void mo223198a();

        /* renamed from: a */
        void mo223199a(LoginVerifyCodeView loginVerifyCodeView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f162923h;
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: e */
    public void mo223206e() {
        this.f162921f.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView$a */
    public class RunnableC64534a implements Runnable {

        /* renamed from: b */
        private final int f162933b;

        /* renamed from: c */
        private boolean f162934c;

        /* renamed from: d */
        private int f162935d;

        /* renamed from: a */
        public void mo223217a() {
            LoginVerifyCodeView.this.f162920e.removeCallbacks(this);
            this.f162934c = false;
            this.f162935d = this.f162933b;
        }

        public void run() {
            int i;
            if (this.f162934c || (i = this.f162935d) <= 0) {
                LoginVerifyCodeView.this.mo223204b(0);
                this.f162934c = false;
                this.f162935d = this.f162933b;
                return;
            }
            int i2 = i - 1;
            this.f162935d = i2;
            LoginVerifyCodeView.this.mo223204b(i2);
            LoginVerifyCodeView.this.f162920e.postDelayed(this, 1000);
        }

        /* renamed from: a */
        public void mo223219a(boolean z) {
            this.f162934c = z;
        }

        /* renamed from: a */
        public void mo223218a(int i) {
            LoginVerifyCodeView.this.f162920e.removeCallbacks(this);
            this.f162934c = false;
            this.f162935d = i;
        }

        public RunnableC64534a(int i) {
            this.f162933b = i;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f162922g.mo223219a(true);
        this.f162922g.mo223217a();
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: f */
    public void mo223207f() {
        Activity activity = this.f162921f;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: g */
    public void mo223208g() {
        Activity activity = this.f162921f;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: h */
    public void mo223209h() {
        this.mVerifyCodeEditText.mo224832a();
        this.mVerifyCodeEditText.mo224838d();
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: d */
    public void mo223205d() {
        mo223204b(59);
        this.f162922g.mo223217a();
        this.f162920e.postDelayed(this.f162922g, 1000);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f162922g = new RunnableC64534a(59);
        this.f162920e = new Handler(Looper.getMainLooper());
        this.f162918c.mo223199a(this);
        m253526i();
        this.mVerifyCodeEditText.mo224837c();
    }

    /* renamed from: i */
    private void m253526i() {
        this.mCountdownTv.setEnabled(false);
        mo223205d();
        this.mCountdownTv.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.View$OnClickListenerC645282 */

            public void onClick(View view) {
                LoginVerifyCodeView.this.f162919d.mo223230a();
            }
        });
        this.mVerifyCodeEditText.mo224834a(VerifyCodeEditText.C65372f.m256394a(this.f162921f).mo224866f(10).mo224859a(C49154ag.m193840c(this.f162921f, R.color.text_title)));
        this.mVerifyCodeEditText.setOnTextFinishListener(new VerifyCodeEditText.AbstractC65371e() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.C645293 */

            @Override // com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.AbstractC65371e
            /* renamed from: a */
            public void mo223212a(String str) {
                LoginVerifyCodeView.this.mVerifyCodeEditText.mo224836b();
            }
        });
        this.mVerifyCodeEditText.setOnTextChangeListener(this.f162924i);
        this.viewChange.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.View$OnClickListenerC645304 */

            public void onClick(View view) {
                LoginVerifyCodeView.this.f162918c.mo223198a();
            }
        });
        this.titlbarVeryfyCode.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.View$OnClickListenerC645315 */

            public void onClick(View view) {
                LoginVerifyCodeView.this.f162919d.mo223236e();
            }
        });
        this.mVerifyCodeEditText.mo224838d();
        this.llContainer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.View$OnFocusChangeListenerC645326 */

            public void onFocusChange(View view, boolean z) {
                if (z && C49203q.m193977c(LoginVerifyCodeView.this.f162921f)) {
                    C49203q.m193973a((Context) LoginVerifyCodeView.this.f162921f);
                }
            }
        });
        ak.m193850a(this.mTvFindAccountClick, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.View$OnClickListenerC645337 */

            public void onClick(View view) {
                if ("forget_verify_code".equals(LoginVerifyCodeView.this.f162919d.mo223232b())) {
                    C49096b.m193602n();
                    LoginVerifyCodeView.this.f162919d.mo223233b("pwd");
                    return;
                }
                C49096b.m193597i();
                LoginVerifyCodeView.this.f162919d.mo223233b("login");
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f162923h = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C64536a.AbstractC64538b.AbstractC64539a aVar) {
        this.f162919d = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: a */
    public void mo223200a(int i) {
        mo223204b(i);
        this.f162922g.mo223218a(i);
        this.f162920e.postDelayed(this.f162922g, 1000);
    }

    /* renamed from: b */
    public void mo223204b(int i) {
        Activity activity = this.f162921f;
        if (activity != null) {
            if (i <= 0) {
                this.mCountdownTv.setText(C49154ag.m193830a((Context) activity, (int) R.string.Lark_Login_V3_ResendVerifyCode));
                this.mCountdownTv.setTextColor(C49154ag.m193840c(this.f162921f, R.color.lkui_B500));
                this.mCountdownTv.setEnabled(true);
            } else {
                int i2 = R.string.Lark_Login_DescOfAuthentication;
                C64536a.AbstractC64538b.AbstractC64539a aVar = this.f162919d;
                if (aVar != null) {
                    i2 = aVar.mo223235d();
                }
                TextView textView = this.mCountdownTv;
                Activity activity2 = this.f162921f;
                textView.setText(C49154ag.m193831a(activity2, i2, "time", i + "", this.f123085b));
                this.mCountdownTv.setTextColor(C49154ag.m193840c(this.f162921f, R.color.lkui_N500));
                this.mCountdownTv.setEnabled(false);
            }
            if (i <= 0) {
                String c = this.f162919d.mo223234c();
                if (!TextUtils.isEmpty(c)) {
                    this.tvTips.setText(c);
                }
            }
        }
    }

    public LoginVerifyCodeView(Activity activity, AbstractC64535b bVar) {
        this.f162918c = bVar;
        this.f162921f = activity;
    }

    /* renamed from: a */
    private void m253525a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, String str) {
        String a = C49153af.m193826a(this.f162921f, str, "contact", verifyIdentifyBean.contact, this.f123085b);
        SpannableString spannableString = new SpannableString(a);
        int indexOf = a.indexOf(verifyIdentifyBean.contact);
        if (indexOf >= 0 && verifyIdentifyBean.contact.length() + indexOf <= spannableString.length()) {
            spannableString.setSpan(new ForegroundColorSpan(-16777216), indexOf, verifyIdentifyBean.contact.length() + indexOf, 33);
            spannableString.setSpan(new StyleSpan(1), indexOf, verifyIdentifyBean.contact.length() + indexOf, 33);
        }
        this.tvVerifySub.setText(spannableString);
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: a */
    public void mo223201a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, boolean z) {
        int i;
        if (verifyIdentifyBean != null) {
            boolean c = C49121a.m193727a().mo171509c(4);
            LinearLayout linearLayout = this.mLlFindAccount;
            int i2 = 0;
            if (!verifyIdentifyBean.showRecoverAccount || !c) {
                i = 8;
            } else {
                i = 0;
            }
            linearLayout.setVisibility(i);
            if (verifyIdentifyBean.showRecoverAccount) {
                if ("forget_verify_code".equals(this.f162919d.mo223232b())) {
                    C49096b.m193598j();
                } else {
                    C49096b.m193594h();
                }
            }
            UniContext uniContext = this.f162923h;
            if (uniContext != null) {
                uniContext.appendOneTimeParam("title", verifyIdentifyBean.title).appendOneTimeParam("subTitle", verifyIdentifyBean.subTitle).appendOneTimeParam("missNextStep", "false");
            }
            this.f123085b.mo171465b("LoginVerifyCodeView", "showVerifyView");
            if (!TextUtils.isEmpty(verifyIdentifyBean.subTitle) && !TextUtils.isEmpty(verifyIdentifyBean.contact)) {
                m253525a(verifyIdentifyBean, verifyIdentifyBean.subTitle);
            } else if (this.f162919d.mo223237f()) {
                m253525a(verifyIdentifyBean, C49154ag.m193830a((Context) this.f162921f, (int) R.string.Lark_Passport_PrivacySettings_BeforeChanging_Verification_VerificationCodeSent));
            }
            TextView textView = this.viewChange;
            if (!z) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (!TextUtils.isEmpty(verifyIdentifyBean.title)) {
                this.tvTitle.setText(verifyIdentifyBean.title);
            } else if (this.f162919d.mo223237f()) {
                this.tvTitle.setText(C49154ag.m193830a((Context) this.f162921f, (int) R.string.Lark_Passport_PrivacySettings_BeforeChanging_Verication_Title));
            }
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b
    /* renamed from: a */
    public void mo223203a(String str, boolean z) {
        Intent intent = new Intent();
        if (z) {
            intent.putExtra("X-Verify-Token", str);
            this.f162921f.setResult(-1, intent);
        } else {
            intent.putExtra("errorMsg", str);
            this.f162921f.setResult(0, intent);
        }
        this.f162921f.finish();
    }
}
