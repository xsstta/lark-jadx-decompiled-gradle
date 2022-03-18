package com.ss.lark.android.passport.biz.feature.input_pwd.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a;
import com.ss.lark.android.passport.biz.widget.password.PasswordEditText;

public class InputPwdView extends AbstractC49023c<C64787a.AbstractC64789b.AbstractC64790a> implements C64787a.AbstractC64789b {

    /* renamed from: c */
    protected Activity f163362c;

    /* renamed from: d */
    protected C64787a.AbstractC64789b.AbstractC64790a f163363d;

    /* renamed from: e */
    public AbstractC64786a f163364e;

    /* renamed from: f */
    public final CommonUiContainer f163365f;

    /* renamed from: g */
    private UniContext f163366g;
    @BindView(6677)
    public ViewGroup llResetPwd;
    @BindView(6467)
    PasswordEditText mPwdEditText;
    @BindView(7206)
    protected TextView tvResetPwd;
    @BindView(7207)
    public TextView tvResetPwdClick;
    @BindView(7183)
    protected TextView viewChangePage;

    /* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView$a */
    public interface AbstractC64786a {
        /* renamed from: a */
        void mo223658a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m254426i();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163366g;
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b
    /* renamed from: f */
    public void mo223664f() {
        this.mPwdEditText.mo224691d();
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b
    /* renamed from: g */
    public void mo223665g() {
        this.f163362c.finish();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163363d = null;
        this.f163364e = null;
        PasswordEditText passwordEditText = this.mPwdEditText;
        if (passwordEditText != null) {
            passwordEditText.mo224690c();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b
    /* renamed from: d */
    public void mo223662d() {
        Activity activity = this.f163362c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b
    /* renamed from: e */
    public void mo223663e() {
        Activity activity = this.f163362c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: h */
    public void mo223666h() {
        if (this.f163363d == null) {
            this.f123085b.mo171471d("n_action_verify_pwd_next", "empty viewDelegate");
            return;
        }
        this.f163365f.mo222876a(this.f163363d.mo223677b(this.mPwdEditText.getString()));
    }

    /* renamed from: i */
    private void m254426i() {
        this.f163365f.mo222876a(false);
        ak.m193850a(this.viewChangePage, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView.View$OnClickListenerC647801 */

            public void onClick(View view) {
                if (!InputPwdView.this.f163363d.mo223676a()) {
                    InputPwdView.this.f123085b.mo171465b("n_page_verify_pwd_start", "checkAndOpenMagicLinkPage return false, and do changePage");
                    InputPwdView.this.f163364e.mo223658a();
                    InputPwdView.this.mo223664f();
                    return;
                }
                InputPwdView.this.f123085b.mo171465b("n_page_verify_pwd_start", "checkAndOpenMagicLinkPage return true");
            }
        });
        String string = this.f163362c.getResources().getString(R.string.Lark_Login_V3_InputPasswordPlaceholder);
        C64787a.AbstractC64789b.AbstractC64790a aVar = this.f163363d;
        if (aVar != null) {
            string = aVar.mo223673a(this.f163362c);
        }
        this.mPwdEditText.mo224688a(PasswordEditText.C65324d.m256266a(this.f163362c, string));
        this.mPwdEditText.mo224694g();
        this.mPwdEditText.setTextChangeListener(new PasswordEditText.AbstractC65325e() {
            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView.C647812 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65325e
            /* renamed from: a */
            public void mo222922a(String str) {
                InputPwdView.this.mo223666h();
            }
        });
        this.mPwdEditText.setOnInputCompleteListener(new PasswordEditText.AbstractC65321a() {
            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView.C647823 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65321a
            /* renamed from: a */
            public void mo222923a(String str) {
                InputPwdView.this.mo223666h();
            }
        });
        this.mPwdEditText.setOnKeyboardDetectorListener(new PasswordEditText.AbstractC65322b() {
            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView.C647834 */

            @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65322b
            /* renamed from: a */
            public void mo222924a(String str) {
                InputPwdView.this.f163365f.mo222880c().performClick();
            }
        });
        this.f163365f.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView.View$OnClickListenerC647845 */

            public void onClick(View view) {
                InputPwdView.this.f163363d.mo223675a(InputPwdView.this.mPwdEditText.getString());
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163366g = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C64787a.AbstractC64789b.AbstractC64790a aVar) {
        this.f163363d = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b
    /* renamed from: a */
    public void mo223659a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean) {
        if (verifyIdentifyBean != null) {
            this.f163365f.mo222872a(verifyIdentifyBean.subTitle, (JSONObject) null, this.f163366g, (C49226y.AbstractC49228a) null);
            if (verifyIdentifyBean.code_button != null) {
                this.viewChangePage.setVisibility(0);
                this.viewChangePage.setText(verifyIdentifyBean.code_button.text);
            } else {
                this.viewChangePage.setVisibility(8);
            }
            if (!TextUtils.isEmpty(verifyIdentifyBean.title)) {
                this.f163365f.mo222871a((CharSequence) verifyIdentifyBean.title);
            } else {
                this.f163365f.mo222869a(R.string.Lark_Login_V3_InputPassword);
            }
            this.f163365f.mo222870a(verifyIdentifyBean.next_button);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b
    /* renamed from: a */
    public void mo223661a(String str, final int i) {
        this.llResetPwd.setVisibility(0);
        this.tvResetPwd.setText(str);
        this.tvResetPwdClick.setText(R.string.Lark_Login_V3_ResetPwd);
        ak.m193850a(this.tvResetPwdClick, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView.View$OnClickListenerC647856 */

            public void onClick(View view) {
                InputPwdView.this.mPwdEditText.mo224693f();
                if (InputPwdView.this.f163363d == null) {
                    InputPwdView.this.f123085b.mo171471d("n_action_verify_pwd_reset", "empty viewDelegate");
                    return;
                }
                InputPwdView.this.f123085b.mo171465b("n_action_reset_pwd_click", "reset pwd clicked");
                InputPwdView.this.f163363d.mo223674a(i);
                C49203q.m193973a((Context) InputPwdView.this.f163362c);
            }
        });
    }

    public InputPwdView(Activity activity, AbstractC64786a aVar, CommonUiContainer commonUiContainer) {
        this.f163362c = activity;
        this.f163364e = aVar;
        this.f163365f = commonUiContainer;
        commonUiContainer.mo222875a(this);
    }
}
