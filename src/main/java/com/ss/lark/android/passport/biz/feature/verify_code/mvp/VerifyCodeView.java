package com.ss.lark.android.passport.biz.feature.verify_code.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b;
import com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText;

public class VerifyCodeView extends AbstractC49023c<C65136b.AbstractC65138b.AbstractC65139a> implements C65136b.AbstractC65138b {

    /* renamed from: c */
    public final AbstractC65134b f164030c;

    /* renamed from: d */
    protected C65136b.AbstractC65138b.AbstractC65139a f164031d;

    /* renamed from: e */
    public Handler f164032e;

    /* renamed from: f */
    protected Activity f164033f;

    /* renamed from: g */
    private RunnableC65133a f164034g;

    /* renamed from: h */
    private UniContext f164035h;

    /* renamed from: i */
    private String f164036i = "verify_code";

    /* renamed from: j */
    private final VerifyCodeEditText.AbstractC65370d f164037j = new VerifyCodeEditText.AbstractC65370d() {
        /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.C651241 */

        @Override // com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.AbstractC65370d
        /* renamed from: a */
        public void mo223210a(String str) {
            if (!TextUtils.isEmpty(str) && str.length() == 6) {
                C49203q.m193973a((Context) VerifyCodeView.this.f164033f);
                VerifyCodeView.this.f164031d.mo224354a(str);
            }
        }
    };

    /* renamed from: k */
    private final CommonUiContainer f164038k;
    @BindView(6377)
    protected TextView mCountdownTv;
    @BindView(6684)
    protected LinearLayout mLlFindAccount;
    @BindView(7230)
    protected TextView mTvFindAccount;
    @BindView(7231)
    protected TextView mTvFindAccountClick;
    @BindView(7320)
    protected VerifyCodeEditText mVerifyCodeEditText;
    @BindView(7214)
    protected TextView tvTips;
    @BindView(7182)
    protected TextView viewBackupPhone;
    @BindView(7186)
    protected TextView viewChange;
    @BindView(7183)
    protected TextView viewChangeCode;
    @BindView(7185)
    protected TextView viewOtp;

    /* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView$b */
    public interface AbstractC65134b {
        /* renamed from: a */
        void mo224313a();

        /* renamed from: b */
        void mo224314b();

        /* renamed from: c */
        void mo224315c();

        /* renamed from: d */
        void mo224316d();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f164035h;
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: a */
    public void mo224325a(boolean z) {
        this.mLlFindAccount.setVisibility(z ? 0 : 8);
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: e */
    public void mo224328e() {
        this.f164033f.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView$a */
    public class RunnableC65133a implements Runnable {

        /* renamed from: b */
        private final int f164051b;

        /* renamed from: c */
        private boolean f164052c;

        /* renamed from: d */
        private int f164053d;

        /* renamed from: a */
        public void mo224338a() {
            VerifyCodeView.this.f164032e.removeCallbacks(this);
            this.f164052c = false;
            this.f164053d = this.f164051b;
        }

        public void run() {
            int i;
            if (this.f164052c || (i = this.f164053d) <= 0) {
                VerifyCodeView.this.mo224326b(0);
                this.f164052c = false;
                this.f164053d = this.f164051b;
                return;
            }
            int i2 = i - 1;
            this.f164053d = i2;
            VerifyCodeView.this.mo224326b(i2);
            VerifyCodeView.this.f164032e.postDelayed(this, 1000);
        }

        /* renamed from: a */
        public void mo224340a(boolean z) {
            this.f164052c = z;
        }

        /* renamed from: a */
        public void mo224339a(int i) {
            VerifyCodeView.this.f164032e.removeCallbacks(this);
            this.f164052c = false;
            this.f164053d = i;
        }

        public RunnableC65133a(int i) {
            this.f164051b = i;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f164034g.mo224340a(true);
        this.f164034g.mo224338a();
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: f */
    public void mo224329f() {
        Activity activity = this.f164033f;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: g */
    public void mo224330g() {
        Activity activity = this.f164033f;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: h */
    public void mo224331h() {
        this.mVerifyCodeEditText.mo224832a();
        this.mVerifyCodeEditText.mo224838d();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f164034g = new RunnableC65133a(59);
        this.f164032e = new Handler(Looper.getMainLooper());
        m255801i();
        this.mVerifyCodeEditText.mo224837c();
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: d */
    public void mo224327d() {
        mo224326b(59);
        this.f164034g.mo224338a();
        this.f164032e.postDelayed(this.f164034g, 1000);
    }

    /* renamed from: i */
    private void m255801i() {
        this.mCountdownTv.setEnabled(false);
        mo224327d();
        this.mCountdownTv.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.View$OnClickListenerC651263 */

            public void onClick(View view) {
                VerifyCodeView.this.f164031d.mo224352a();
            }
        });
        this.mVerifyCodeEditText.mo224834a(VerifyCodeEditText.C65372f.m256394a(this.f164033f).mo224866f(10));
        this.mVerifyCodeEditText.setOnTextFinishListener(new VerifyCodeEditText.AbstractC65371e() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.C651274 */

            @Override // com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.AbstractC65371e
            /* renamed from: a */
            public void mo223212a(String str) {
                VerifyCodeView.this.mVerifyCodeEditText.mo224836b();
            }
        });
        this.mVerifyCodeEditText.setOnTextChangeListener(this.f164037j);
        this.viewChange.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.View$OnClickListenerC651285 */

            public void onClick(View view) {
                VerifyCodeView.this.f164030c.mo224313a();
            }
        });
        this.viewOtp.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.View$OnClickListenerC651296 */

            public void onClick(View view) {
                C65135a.m255829a("otp_code");
                VerifyCodeView.this.f164030c.mo224316d();
            }
        });
        this.viewBackupPhone.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.View$OnClickListenerC651307 */

            public void onClick(View view) {
                VerifyCodeView.this.f164030c.mo224314b();
            }
        });
        this.viewChangeCode.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.View$OnClickListenerC651318 */

            public void onClick(View view) {
                VerifyCodeView.this.f164030c.mo224315c();
            }
        });
        this.f164038k.mo222883d().setTitleClickListener(new CommonTitleBar.AbstractC49239c() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.C651329 */

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: a */
            public void mo171769a() {
                VerifyCodeView.this.f164031d.mo224357d();
            }
        });
        this.mVerifyCodeEditText.mo224838d();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f164035h = uniContext;
    }

    /* renamed from: b */
    private void m255800b(String str) {
        if ("otp_code".equals(str)) {
            this.mCountdownTv.setVisibility(8);
        } else {
            this.mCountdownTv.setVisibility(0);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: a */
    public void mo224319a(int i) {
        mo224326b(i);
        this.f164034g.mo224339a(i);
        this.f164032e.postDelayed(this.f164034g, 1000);
    }

    /* renamed from: a */
    public void mo171188a(C65136b.AbstractC65138b.AbstractC65139a aVar) {
        this.f164031d = aVar;
    }

    /* renamed from: b */
    public void mo224326b(int i) {
        Activity activity = this.f164033f;
        if (activity != null) {
            if (i <= 0) {
                this.mCountdownTv.setText(C49154ag.m193830a((Context) activity, (int) R.string.Lark_Login_V3_ResendVerifyCode));
                this.mCountdownTv.setTextColor(C49154ag.m193840c(this.f164033f, R.color.primary_pri_500));
                this.mCountdownTv.setEnabled(true);
            } else {
                int i2 = R.string.Lark_Login_DescOfAuthentication;
                C65136b.AbstractC65138b.AbstractC65139a aVar = this.f164031d;
                if (aVar != null) {
                    i2 = aVar.mo224356c();
                }
                TextView textView = this.mCountdownTv;
                Activity activity2 = this.f164033f;
                textView.setText(C49154ag.m193831a(activity2, i2, "time", i + "", this.f123085b));
                this.mCountdownTv.setTextColor(C49154ag.m193840c(this.f164033f, R.color.text_placeholder));
                this.mCountdownTv.setEnabled(false);
            }
            if (i <= 0) {
                this.tvTips.setVisibility(0);
                String b = this.f164031d.mo224355b();
                if (!TextUtils.isEmpty(b)) {
                    this.tvTips.setText(b);
                    return;
                }
                return;
            }
            this.tvTips.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo224322a(String str) {
        this.f164036i = str;
    }

    /* renamed from: a */
    private void m255799a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, String str) {
        this.f164038k.mo222872a(str, (JSONObject) null, this.f164035h, (C49226y.AbstractC49228a) null);
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: a */
    public void mo224324a(String str, boolean z) {
        Intent intent = new Intent();
        if (z) {
            intent.putExtra("X-Verify-Token", str);
            this.f164033f.setResult(-1, intent);
        } else {
            intent.putExtra("errorMsg", str);
            this.f164033f.setResult(0, intent);
        }
        this.f164033f.finish();
    }

    public VerifyCodeView(Activity activity, AbstractC65134b bVar, CommonUiContainer commonUiContainer) {
        this.f164030c = bVar;
        this.f164033f = activity;
        this.f164038k = commonUiContainer;
        commonUiContainer.mo222875a(this);
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: a */
    public void mo224323a(String str, final int i, final String str2) {
        this.mTvFindAccount.setText(str);
        int i2 = R.string.Lark_Login_RecoverAccountTextLink;
        if (str2 != null) {
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1948761613) {
                if (hashCode != -1265405765) {
                    if (hashCode == -948077951 && str2.equals("otp_code")) {
                        c = 0;
                    }
                } else if (str2.equals("backup_phone_code")) {
                    c = 2;
                }
            } else if (str2.equals("verify_code")) {
                c = 1;
            }
            if (c == 0) {
                i2 = R.string.Lark_Passport_OTPVerify_ResetOTP;
            }
        }
        this.mTvFindAccountClick.setText(i2);
        ak.m193850a(this.mTvFindAccountClick, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.View$OnClickListenerC651252 */

            public void onClick(View view) {
                String str;
                if ("otp_code".equals(str2)) {
                    str = "n_action_reset_otp_click";
                } else {
                    str = "n_action_account_retrieve_click";
                }
                PassportLog passportLog = VerifyCodeView.this.f123085b;
                passportLog.mo171465b(str, "retrieve clicked, verifyType: " + str2);
                VerifyCodeView.this.f164031d.mo224353a(i);
                C49203q.m193973a((Context) VerifyCodeView.this.f164033f);
            }
        });
    }

    @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b
    /* renamed from: a */
    public void mo224320a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, String str, boolean z, boolean z2) {
        if (verifyIdentifyBean != null) {
            UniContext uniContext = this.f164035h;
            if (uniContext != null) {
                uniContext.appendOneTimeParam("title", verifyIdentifyBean.title).appendOneTimeParam("subTitle", verifyIdentifyBean.subTitle).appendOneTimeParam("missNextStep", "false");
            }
            this.f123085b.mo171465b("VerifyCodeView", "showVerifyView");
            if (!TextUtils.isEmpty(verifyIdentifyBean.subTitle)) {
                m255799a(verifyIdentifyBean, verifyIdentifyBean.subTitle);
            } else if (this.f164031d.mo224358e()) {
                m255799a(verifyIdentifyBean, C49154ag.m193830a((Context) this.f164033f, (int) R.string.Lark_Passport_PrivacySettings_BeforeChanging_Verification_VerificationCodeSent));
            }
            if (verifyIdentifyBean.pwd_button != null) {
                this.viewChange.setVisibility(0);
                this.viewChange.setText(verifyIdentifyBean.pwd_button.text);
            } else {
                this.viewChange.setVisibility(8);
            }
            if (verifyIdentifyBean.otp_button != null) {
                this.viewOtp.setVisibility(0);
                this.viewOtp.setText(verifyIdentifyBean.otp_button.text);
            } else {
                this.viewOtp.setVisibility(8);
            }
            if (verifyIdentifyBean.spare_code_button != null) {
                this.viewBackupPhone.setVisibility(0);
                this.viewBackupPhone.setText(verifyIdentifyBean.spare_code_button.text);
            } else {
                this.viewBackupPhone.setVisibility(8);
            }
            if (verifyIdentifyBean.code_button != null) {
                this.viewChangeCode.setVisibility(0);
                this.viewChangeCode.setText(verifyIdentifyBean.code_button.text);
            } else {
                this.viewChangeCode.setVisibility(8);
            }
            if (!TextUtils.isEmpty(verifyIdentifyBean.title)) {
                this.f164038k.mo222871a((CharSequence) verifyIdentifyBean.title);
            } else if (this.f164031d.mo224358e()) {
                this.f164038k.mo222869a(R.string.Lark_Passport_PrivacySettings_BeforeChanging_Verication_Title);
            }
            m255800b(str);
        }
    }
}
