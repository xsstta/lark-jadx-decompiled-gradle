package com.ss.android.lark.security.set;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.security.set.AbstractC54070a;
import com.ss.android.lark.security.widget.SecurityVerifyEditText;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;

public class SetSecurityPasswordView extends AbstractC49023c<AbstractC54070a.AbstractC54072b.AbstractC54073a> implements AbstractC54070a.AbstractC54072b {

    /* renamed from: c */
    public final Activity f133865c;

    /* renamed from: d */
    public String f133866d = "";

    /* renamed from: e */
    public String f133867e = "";

    /* renamed from: f */
    public boolean f133868f;
    @RouterFieldAnno

    /* renamed from: g */
    public SetSecurityPwdStep f133869g;

    /* renamed from: h */
    private AbstractC54069a f133870h;

    /* renamed from: i */
    private AbstractC54070a.AbstractC54072b.AbstractC54073a f133871i;

    /* renamed from: j */
    private final Bundle f133872j;

    /* renamed from: k */
    private final Handler f133873k = new Handler();

    /* renamed from: l */
    private final SecurityVerifyEditText.AbstractC54104a f133874l = new SecurityVerifyEditText.AbstractC54104a() {
        /* class com.ss.android.lark.security.set.SetSecurityPasswordView.C540631 */

        @Override // com.ss.android.lark.security.widget.SecurityVerifyEditText.AbstractC54104a
        /* renamed from: a */
        public void mo185095a(String str) {
            if (str.length() == 4) {
                SetSecurityPasswordView.this.f133866d = str;
                if (!SetSecurityPasswordView.this.mo185094h() && C49203q.m193977c(SetSecurityPasswordView.this.f133865c)) {
                    C49203q.m193973a((Context) SetSecurityPasswordView.this.f133865c);
                }
            }
        }
    };
    @BindView(5940)
    TextView mCountDownDesc;
    @BindView(6102)
    CheckBox mIvSwitch;
    @BindView(6569)
    CommonTitleBar mTitleBar;
    @BindView(6593)
    TextView mTvSubTitle;
    @BindView(6654)
    SecurityVerifyEditText mVerifyCodeEditText;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.security.set.SetSecurityPasswordView$a */
    public interface AbstractC54069a {
        /* renamed from: a */
        void mo185101a();

        /* renamed from: a */
        void mo185102a(SetSecurityPasswordView setSecurityPasswordView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f133870h = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m209822j();
        this.f133868f = false;
    }

    /* renamed from: j */
    private void m209822j() {
        AbstractC54069a aVar = this.f133870h;
        if (aVar != null) {
            aVar.mo185102a(this);
            m209821i();
            m209823k();
        }
    }

    @Override // com.ss.android.lark.security.set.AbstractC54070a.AbstractC54072b
    /* renamed from: d */
    public void mo185090d() {
        Activity activity = this.f133865c;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.android.lark.security.set.AbstractC54070a.AbstractC54072b
    /* renamed from: e */
    public void mo185091e() {
        Activity activity = this.f133865c;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: g */
    public void mo185093g() {
        if (this.f133870h != null) {
            C49203q.m193973a((Context) this.f133865c);
            this.f133870h.mo185101a();
        }
    }

    /* renamed from: h */
    public boolean mo185094h() {
        Activity activity = this.f133865c;
        if (activity == null || activity.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m209821i() {
        if (this.f133872j != null) {
            Intent intent = new Intent();
            intent.putExtras(this.f133872j);
            C49092f.m193525a(this, intent);
        }
    }

    /* renamed from: f */
    public void mo185092f() {
        if (this.mVerifyCodeEditText.getVerifyCodeText().length() == 4 && !this.f133868f) {
            m209819b(this.mVerifyCodeEditText.getVerifyCodeText());
        } else if (this.mVerifyCodeEditText.getVerifyCodeText().length() == 4 && this.f133868f) {
            m209820c(this.mVerifyCodeEditText.getVerifyCodeText());
        }
    }

    /* renamed from: k */
    private void m209823k() {
        this.mVerifyCodeEditText.mo185155a();
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.security.set.SetSecurityPasswordView.View$OnClickListenerC540642 */

            public void onClick(View view) {
                SetSecurityPasswordView.this.mo185093g();
            }
        });
        SetSecurityPwdStep setSecurityPwdStep = this.f133869g;
        if (setSecurityPwdStep != null) {
            this.mTitleBar.setTitle(setSecurityPwdStep.getTitle());
        }
        this.mCountDownDesc.setText(UIHelper.mustacheFormat((int) R.string.Lark_Security_Verify_SubTipOfInputPassword));
        this.mVerifyCodeEditText.setOnInputCompleteListener(this.f133874l);
        this.mVerifyCodeEditText.setOnInputProcessListener(new SecurityVerifyEditText.AbstractC54105b() {
            /* class com.ss.android.lark.security.set.SetSecurityPasswordView.C540653 */

            @Override // com.ss.android.lark.security.widget.SecurityVerifyEditText.AbstractC54105b
            /* renamed from: a */
            public void mo185097a(String str) {
                if (str != null && str.length() == 4) {
                    SetSecurityPasswordView.this.f133866d = str;
                    SetSecurityPasswordView.this.mo185092f();
                }
            }
        });
        this.mIvSwitch.setButtonDrawable(UDIconUtils.getIconDrawable(this.f133865c, (int) R.drawable.lark_security_verify_preview_cb_bg, UDColorUtils.getColor(this.f133865c, R.color.icon_n3)));
        this.mIvSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.security.set.SetSecurityPasswordView.C540664 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SetSecurityPasswordView.this.mVerifyCodeEditText.mo185157a(z);
            }
        });
    }

    /* renamed from: a */
    public void mo171188a(AbstractC54070a.AbstractC54072b.AbstractC54073a aVar) {
        this.f133871i = aVar;
    }

    /* renamed from: b */
    private void m209819b(final String str) {
        this.f133873k.postDelayed(new Runnable() {
            /* class com.ss.android.lark.security.set.SetSecurityPasswordView.RunnableC540675 */

            public void run() {
                if (SetSecurityPasswordView.this.f133869g != null) {
                    SetSecurityPasswordView.this.mTitleBar.setTitle(SetSecurityPasswordView.this.f133869g.getConfirmTitle());
                    SetSecurityPasswordView.this.mTvSubTitle.setText(SetSecurityPasswordView.this.f133869g.getConfirmSubTitle());
                }
                SetSecurityPasswordView.this.mTitleBar.setTitle(R.string.Lark_Passport_ReEnterNewSCTitlePC);
                SetSecurityPasswordView.this.mTvSubTitle.setText(R.string.Lark_Security_Verify_TipOfInputPassword);
                SetSecurityPasswordView.this.f133867e = str;
                SetSecurityPasswordView.this.mVerifyCodeEditText.mo185155a();
                SetSecurityPasswordView.this.mVerifyCodeEditText.mo185158b();
                SetSecurityPasswordView.this.f133868f = true;
            }
        }, 200);
    }

    @Override // com.ss.android.lark.security.set.AbstractC54070a.AbstractC54072b
    /* renamed from: a */
    public void mo185089a(boolean z) {
        LKUIToast.showInCenter(this.f133865c, (int) R.string.Lark_Passport_PSsetSuccessToast);
        if (!mo185094h()) {
            mo185093g();
        }
    }

    /* renamed from: c */
    private void m209820c(String str) {
        if (this.f133867e.equals(str)) {
            this.f133871i.mo185116a(this.f133866d);
            return;
        }
        SetSecurityPwdStep setSecurityPwdStep = this.f133869g;
        if (setSecurityPwdStep != null) {
            this.mTvSubTitle.setText(setSecurityPwdStep.getSubtitle());
        }
        this.f133873k.postDelayed(new Runnable() {
            /* class com.ss.android.lark.security.set.SetSecurityPasswordView.RunnableC540686 */

            public void run() {
                SetSecurityPasswordView.this.f133867e = "";
                LKUIToast.showInCenter(SetSecurityPasswordView.this.f133865c, (int) R.string.Lark_Passport_SCWordNotSameToastPC);
                if (SetSecurityPasswordView.this.f133869g != null) {
                    SetSecurityPasswordView.this.mTitleBar.setTitle(SetSecurityPasswordView.this.f133869g.getTitle());
                }
                SetSecurityPasswordView.this.mVerifyCodeEditText.mo185158b();
                SetSecurityPasswordView.this.f133868f = false;
            }
        }, 200);
    }

    @Override // com.ss.android.lark.security.set.AbstractC54070a.AbstractC54072b
    /* renamed from: a */
    public void mo185088a(String str) {
        this.f133866d = "";
        if (!mo185094h()) {
            LKUIToast.show(this.f133865c.getApplicationContext(), str);
            this.mVerifyCodeEditText.mo185158b();
            this.mVerifyCodeEditText.mo185155a();
            this.mVerifyCodeEditText.setOnInputCompleteListener(this.f133874l);
        }
    }

    public SetSecurityPasswordView(Activity activity, Bundle bundle, AbstractC54069a aVar) {
        this.f133865c = activity;
        this.f133872j = bundle;
        this.f133870h = aVar;
    }
}
