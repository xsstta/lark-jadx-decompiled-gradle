package com.ss.android.lark.security.verify;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.security.account.SecurityVerifyHitPoint;
import com.ss.android.lark.security.account.SecurityVerifyResult;
import com.ss.android.lark.security.api.VerifySecurityPwdStep;
import com.ss.android.lark.security.verify.AbstractC54089a;
import com.ss.android.lark.security.widget.SecurityVerifyEditText;

public class VerifySecurityPasswordView extends AbstractC49023c<AbstractC54089a.AbstractC54091b.AbstractC54092a> implements AbstractC54089a.AbstractC54091b {

    /* renamed from: c */
    public final Activity f133891c;

    /* renamed from: d */
    public AbstractC54089a.AbstractC54091b.AbstractC54092a f133892d;

    /* renamed from: e */
    public SecurityVerifyResult f133893e = SecurityVerifyResult.newInstance(1);

    /* renamed from: f */
    private AbstractC54088a f133894f;
    @BindView(6123)
    LKUILottieAnimationView mAnimationLoadingView;
    @BindView(5918)
    ImageView mCloseIv;
    @BindView(6327)
    RelativeLayout mPwdLayout;
    @BindView(6586)
    TextView mTvForgetPwd;
    @BindView(6654)
    SecurityVerifyEditText mVerifyCodeEditText;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.security.verify.VerifySecurityPasswordView$a */
    public interface AbstractC54088a {
        /* renamed from: a */
        void mo185140a(VerifySecurityPasswordView verifySecurityPasswordView);
    }

    /* renamed from: i */
    private void m209873i() {
        LKUILottieAnimationView lKUILottieAnimationView = this.mAnimationLoadingView;
        if (lKUILottieAnimationView != null) {
            lKUILottieAnimationView.cancelAnimation();
        }
    }

    /* renamed from: j */
    private boolean m209874j() {
        Activity activity = this.f133891c;
        if (activity == null || activity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f133894f.mo185140a(this);
        m209872h();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        m209873i();
        this.f133892d.mo185143a(this.f133893e);
        this.f133894f = null;
    }

    /* renamed from: d */
    public void mo185130d() {
        this.mVerifyCodeEditText.mo185158b();
        this.mVerifyCodeEditText.mo185155a();
    }

    /* renamed from: e */
    public void mo185131e() {
        if (!this.mAnimationLoadingView.isAnimating()) {
            this.mAnimationLoadingView.playAnimation();
        }
    }

    /* renamed from: f */
    private void m209870f() {
        if (!m209874j() && KeyboardUtils.isSoftShowing(this.f133891c)) {
            KeyboardUtils.hideKeyboard(this.f133891c);
        }
    }

    /* renamed from: g */
    private void m209871g() {
        m209873i();
        this.mAnimationLoadingView.setVisibility(8);
        this.mVerifyCodeEditText.setVisibility(0);
        this.mTvForgetPwd.setVisibility(0);
    }

    /* renamed from: h */
    private void m209872h() {
        this.mCloseIv.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.View$OnClickListenerC540867 */

            public void onClick(View view) {
                SecurityVerifyHitPoint.m209796a("svc_popup_verify_close");
                VerifySecurityPasswordView.this.f133891c.finish();
            }
        });
        this.mVerifyCodeEditText.setOnTextFinishListener(new SecurityVerifyEditText.AbstractC54106c() {
            /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.C540878 */

            @Override // com.ss.android.lark.security.widget.SecurityVerifyEditText.AbstractC54106c
            /* renamed from: a */
            public void mo185139a(String str) {
                VerifySecurityPasswordView.this.mo185131e();
                VerifySecurityPasswordView.this.mAnimationLoadingView.setVisibility(0);
                VerifySecurityPasswordView.this.mVerifyCodeEditText.setVisibility(8);
                VerifySecurityPasswordView.this.mTvForgetPwd.setVisibility(8);
                VerifySecurityPasswordView.this.f133892d.mo185144a(str);
            }
        });
        this.mAnimationLoadingView.setAnimation("verify/data.json");
        this.mAnimationLoadingView.setRepeatCount(-1);
    }

    /* renamed from: a */
    public void mo171188a(AbstractC54089a.AbstractC54091b.AbstractC54092a aVar) {
        this.f133892d = aVar;
    }

    @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54091b
    /* renamed from: a */
    public void mo185127a(String str) {
        if (!m209874j()) {
            SecurityVerifyHitPoint.m209796a("svc_verify_succ");
            m209873i();
            this.f133893e = SecurityVerifyResult.newInstance(0, str);
            m209870f();
            this.f133891c.finish();
        }
    }

    @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54091b
    /* renamed from: a */
    public void mo185125a(final VerifySecurityPwdStep verifySecurityPwdStep) {
        if (!m209874j() && verifySecurityPwdStep != null) {
            this.mPwdLayout.setVisibility(0);
            this.mVerifyCodeEditText.mo185155a();
            if (verifySecurityPwdStep.getForgetSecPwdButton() != null) {
                this.mTvForgetPwd.setVisibility(0);
                this.mTvForgetPwd.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.View$OnClickListenerC540823 */

                    public void onClick(View view) {
                        SecurityVerifyHitPoint.m209796a("svc_forget_clk");
                        C49092f.m193529a(VerifySecurityPasswordView.this.f133891c, verifySecurityPwdStep.getForgetSecPwdButton().next, RouterScene.ALL.value, VerifySecurityPasswordView.this.f123084a, VerifySecurityPasswordView.this.f123085b, (AbstractC49336a) null);
                    }
                });
                return;
            }
            this.mTvForgetPwd.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54091b
    /* renamed from: a */
    public void mo185124a(final BaseStepData baseStepData) {
        if (!m209874j()) {
            m209870f();
            this.mPwdLayout.setVisibility(8);
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f133891c).message(R.string.Lark_Security_Verify_MessageOfGotoSetPassword)).cancelable(false)).cancelOnTouchOutside(false)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Security_Verify_TextOfCancel, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.DialogInterface$OnClickListenerC540812 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    VerifySecurityPasswordView.this.f133893e = SecurityVerifyResult.newInstance(1);
                    VerifySecurityPasswordView.this.f133891c.finish();
                }
            })).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Security_Verify_TextOfGoToSetPassword, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.DialogInterface$OnClickListenerC540801 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    SecurityVerifyHitPoint.m209796a("svc_forward_set_clk");
                    C49092f.m193529a(VerifySecurityPasswordView.this.f133891c, baseStepData, RouterScene.ALL.value, VerifySecurityPasswordView.this.f123084a, VerifySecurityPasswordView.this.f123085b, (AbstractC49336a) null);
                    VerifySecurityPasswordView.this.f133891c.finish();
                }
            })).show();
        }
    }

    @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54091b
    /* renamed from: b */
    public void mo185128b(String str) {
        if (!m209874j()) {
            SecurityVerifyHitPoint.m209796a("svc_verify_fail");
            this.f133893e = SecurityVerifyResult.newInstance(2);
            m209871g();
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f133891c).message(UDDialogUtils.m193819a(str))).cancelable(false)).cancelOnTouchOutside(false)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Security_Verify_TextOfRetryInputPassword, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.DialogInterface$OnClickListenerC540834 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    VerifySecurityPasswordView.this.mo185130d();
                }
            })).show();
        }
    }

    @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54091b
    /* renamed from: c */
    public void mo185129c(String str) {
        if (!m209874j()) {
            SecurityVerifyHitPoint.m209796a("svc_verify_fail");
            this.f133893e = SecurityVerifyResult.newInstance(3);
            m209871g();
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f133891c).message(UDDialogUtils.m193819a(str))).cancelable(false)).cancelOnTouchOutside(false)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Security_Verify_TextOfGetBackPassword, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.DialogInterface$OnClickListenerC540856 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (VerifySecurityPasswordView.this.mTvForgetPwd.getVisibility() == 0) {
                        VerifySecurityPasswordView.this.mTvForgetPwd.performClick();
                    }
                    VerifySecurityPasswordView.this.mo185130d();
                }
            })).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Security_Verify_TextOfCancel, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.security.verify.VerifySecurityPasswordView.DialogInterface$OnClickListenerC540845 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    VerifySecurityPasswordView.this.f133891c.finish();
                }
            })).show();
        }
    }

    public VerifySecurityPasswordView(Activity activity, AbstractC54088a aVar) {
        this.f133891c = activity;
        this.f133894f = aVar;
    }
}
