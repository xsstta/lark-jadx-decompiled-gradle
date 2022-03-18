package com.ss.lark.android.passport.biz.compat.real_name.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import butterknife.BindView;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.widget.p2444b.C49247a;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.statistics.Statistics;
import com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.RecoverAccountStepInfoBackup;
import com.ss.lark.android.passport.biz.utils.C65251f;
import com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;
import com.ss.lark.android.passport.biz.widget.KeyboardDetectorConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class RealNameView implements C64412a.AbstractC64414b {

    /* renamed from: a */
    public Activity f162693a;

    /* renamed from: b */
    public UDDialog f162694b;

    /* renamed from: c */
    public PassportLog f162695c;

    /* renamed from: d */
    private C64412a.AbstractC64414b.AbstractC64415a f162696d;

    /* renamed from: e */
    private AbstractC64411a f162697e;

    /* renamed from: f */
    private UniContext f162698f;

    /* renamed from: g */
    private AbstractC65288b.AbstractC65292d f162699g = new AbstractC65288b.AbstractC65292d() {
        /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.C644021 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65292d
        /* renamed from: a */
        public void mo222966a() {
            RealNameView.this.mBtnNext.performClick();
        }
    };
    @BindView(7180)
    public TextView mAppealTip;
    @BindView(6665)
    public View mBottomLayout;
    @BindView(6303)
    public Button mBtnNext;
    @BindView(6323)
    public AppCompatCheckBox mCheckBoxPolicy;
    @BindView(6720)
    public KeyboardDetectorConstraintLayout mContainer;
    @BindView(6469)
    public CommonEditInput mEtIdCode;
    @BindView(6473)
    public CommonEditInput mEtUserName;
    @BindView(6567)
    public ImageView mIvBack;
    @BindView(7202)
    public TextView mTvPolicy;
    @BindView(7242)
    public TextView mTvSubTitle;
    @BindView(7246)
    public TextView mTvTitle;

    /* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView$a */
    public interface AbstractC64411a {
        /* renamed from: a */
        void mo222955a(RealNameView realNameView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f162698f;
    }

    @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a.AbstractC64414b
    /* renamed from: a */
    public void mo222961a(RecoverAccountStepInfoBackup recoverAccountStepInfoBackup) {
        if (recoverAccountStepInfoBackup != null) {
            this.mTvTitle.setText(recoverAccountStepInfoBackup.title);
            this.mTvSubTitle.setText(recoverAccountStepInfoBackup.subTitle);
        }
    }

    /* renamed from: a */
    public void mo222962a(String str, String str2) {
        PassportLog passportLog = this.f162695c;
        passportLog.mo171465b("n_action_old_opthree_next", "next clicked, policy checked: " + this.mCheckBoxPolicy.isChecked());
        if (this.mCheckBoxPolicy.isChecked()) {
            this.f162696d.mo222977a(str, str2);
            return;
        }
        View inflate = LayoutInflater.from(this.f162693a).inflate(R.layout.signin_sdk_register_dialog_content, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.lkui_dialog_content_message_tv);
        if (textView != null) {
            PrivacyPolicyUtils.Policy bVar = new PrivacyPolicyUtils.Policy(this.f162693a.getString(R.string.Lark_Passport_IdentityVerifyPolicy), ServiceFinder.m193751f().getPolicyUrl(IDomainService.UrlUnitType.CURRENT_UNIT, IDomainService.Policy.REAL_NAME));
            textView.setText(new PrivacyPolicyUtils.Builder(this.f162693a, (int) R.string.Lark_Login_V3_AgreePolicyTip, IDomainService.UrlUnitType.CURRENT_UNIT).mo224485a(PrivacyPolicyUtils.PolicyType.SERVICE_TERM, bVar).mo224485a(PrivacyPolicyUtils.PolicyType.PRIVACY, new PrivacyPolicyUtils.Policy(this.f162693a.getString(R.string.Lark_Passport_FaceInfoRulesPolicy), ServiceFinder.m193751f().getPolicyUrl(IDomainService.UrlUnitType.CURRENT_UNIT, IDomainService.Policy.FACE_INFO))).mo224486a(new Function1<PrivacyPolicyUtils.PolicyType, Unit>() {
                /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.C644109 */

                /* renamed from: a */
                public Unit invoke(PrivacyPolicyUtils.PolicyType policyType) {
                    if (RealNameView.this.f162694b == null || !RealNameView.this.f162694b.isShowing()) {
                        return null;
                    }
                    RealNameView.this.f162694b.dismiss();
                    return null;
                }
            }).mo224487a());
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
        UDDialogBuilder eVar = new UDDialogBuilder(this.f162693a);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(R.string.Lark_Login_V3_AgreePolicyTitle)).titleBold(true)).contentLayout(inflate)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Login_V3_PolicyAlertCancel, $$Lambda$RealNameView$qCrGru_8UpUfP2MIAGIZNAi04XI.INSTANCE)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Login_V3_PolicyAlertAgree, new DialogInterface.OnClickListener(str, str2) {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.$$Lambda$RealNameView$fhuqG2qsos4cjLHMEhpfecI_Ja8 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                RealNameView.this.m253131a(this.f$1, this.f$2, dialogInterface, i);
            }
        });
        UDDialog build = eVar.build();
        this.f162694b = build;
        build.show();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f162696d = null;
        this.f162697e = null;
    }

    @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a.AbstractC64414b
    /* renamed from: d */
    public void mo222963d() {
        Activity activity = this.f162693a;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a.AbstractC64414b
    /* renamed from: e */
    public void mo222964e() {
        Activity activity = this.f162693a;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: h */
    private void m253134h() {
        String a = this.f162696d.mo222976a();
        if (TextUtils.isEmpty(a)) {
            this.f162695c.mo171471d("RealNameView", "initAccountAppealView but appealUrl is empty");
            return;
        }
        this.mAppealTip.setVisibility(0);
        String string = this.f162693a.getResources().getString(R.string.Lark_Passport_IdentityVerificationDisabledTip);
        String string2 = this.f162693a.getResources().getString(R.string.Lark_Passport_IdentityVerificationDisabled_AppealLink);
        String concat = string.concat(string2);
        SpannableString spannableString = new SpannableString(concat);
        int indexOf = concat.indexOf(string2);
        spannableString.setSpan(new C49247a(this.f162693a, new View.OnClickListener(a) {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.$$Lambda$RealNameView$osDhrMf3vqkWd5hjBLISGnBMAtc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                RealNameView.this.m253130a((RealNameView) this.f$1, (String) view);
            }
        }), indexOf, string2.length() + indexOf, 33);
        this.mAppealTip.setText(spannableString);
        this.mAppealTip.setMovementMethod(LinkMovementMethod.getInstance());
        this.mAppealTip.setHighlightColor(0);
    }

    /* renamed from: f */
    public void mo222965f() {
        if (TextUtils.isEmpty(this.mEtUserName.getRemoveBlankText()) || TextUtils.isEmpty(this.mEtIdCode.getRemoveBlankText())) {
            this.mBtnNext.setEnabled(false);
        } else if (this.mEtIdCode.getRemoveBlankText().length() == 15 || this.mEtIdCode.getRemoveBlankText().length() == 18) {
            this.mBtnNext.setEnabled(true);
        } else {
            this.mBtnNext.setEnabled(false);
        }
    }

    /* renamed from: g */
    private void m253133g() {
        this.mEtIdCode.setInputHint(this.f162693a.getString(R.string.Lark_Login_RecoverAccountIDPlaceholder));
        this.mEtUserName.setInputHint(this.f162693a.getString(R.string.Lark_Login_RecoverAccountNamePlaceholder));
        this.mEtIdCode.setInputLength(20);
        this.mEtIdCode.mo224517a("(\\d{6})(\\d{8})(\\d{4})", true);
        this.mEtIdCode.setInputType(2);
        this.mEtIdCode.setKeyListener(DigitsKeyListener.getInstance("0123456789xX"));
        this.mIvBack.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.View$OnClickListenerC644043 */

            public void onClick(View view) {
                RealNameView.this.f162693a.finish();
            }
        });
        this.mEtIdCode.setOnKeyboardDetectorListener(this.f162699g);
        this.mEtUserName.setOnKeyboardDetectorListener(this.f162699g);
        this.mBtnNext.setEnabled(false);
        ak.m193850a(this.mBtnNext, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.View$OnClickListenerC644054 */

            public void onClick(View view) {
                RealNameView realNameView = RealNameView.this;
                realNameView.mo222962a(realNameView.mEtUserName.getRemoveBlankText(), RealNameView.this.mEtIdCode.getRemoveBlankText());
            }
        });
        this.mEtIdCode.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.C644065 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                RealNameView.this.mEtIdCode.mo224507a();
                RealNameView.this.mo222965f();
            }
        });
        this.mEtUserName.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.C644076 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                RealNameView.this.mEtUserName.mo224507a();
                RealNameView.this.mo222965f();
            }
        });
        this.mContainer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.View$OnFocusChangeListenerC644087 */

            public void onFocusChange(View view, boolean z) {
                if (z && C49203q.m193977c(RealNameView.this.f162693a)) {
                    C49203q.m193973a((Context) RealNameView.this.f162693a);
                }
            }
        });
        PrivacyPolicyUtils.Policy bVar = new PrivacyPolicyUtils.Policy(this.f162693a.getString(R.string.Lark_Passport_IdentityVerifyPolicy), ServiceFinder.m193751f().getPolicyUrl(IDomainService.UrlUnitType.CURRENT_UNIT, IDomainService.Policy.REAL_NAME));
        new PrivacyPolicyUtils.TextViewBuilder(this.mTvPolicy, (int) R.string.Lark_Login_V3_registerNextStepPolicyTip, IDomainService.UrlUnitType.CURRENT_UNIT).mo224485a(PrivacyPolicyUtils.PolicyType.SERVICE_TERM, bVar).mo224485a(PrivacyPolicyUtils.PolicyType.PRIVACY, new PrivacyPolicyUtils.Policy(this.f162693a.getString(R.string.Lark_Passport_FaceInfoRulesPolicy), ServiceFinder.m193751f().getPolicyUrl(IDomainService.UrlUnitType.CURRENT_UNIT, IDomainService.Policy.FACE_INFO))).mo224495b();
        this.mCheckBoxPolicy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.C644098 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    C49096b.m193600l();
                }
            }
        });
        m253134h();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f162697e.mo222955a(this);
        m253133g();
        View findViewById = this.f162693a.findViewById(16908290);
        findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.$$Lambda$RealNameView$qkvYECWVNxD4L9pq9K2SnH6oYh0 */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                RealNameView.this.m253129a(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.View$OnLayoutChangeListenerC644032 */

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (view != null && view.getWidth() > 0 && view.getHeight() > 0) {
                    if (((float) view.getHeight()) / ((float) view.getWidth()) <= 2.0f) {
                        RealNameView.this.f162693a.getWindow().setSoftInputMode(32);
                        RealNameView.this.f162695c.mo171465b("RealNameView", "short screen");
                    } else {
                        RealNameView.this.mEtUserName.mo224520d();
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171185a(PassportLog passportLog) {
        this.f162695c = passportLog;
    }

    /* renamed from: a */
    private void m253132a(boolean z) {
        if (z) {
            if (this.mAppealTip.getVisibility() != 0) {
                this.mAppealTip.setVisibility(0);
                this.mBottomLayout.requestLayout();
            }
        } else if (this.mAppealTip.getVisibility() != 8) {
            this.mAppealTip.setVisibility(8);
            this.mBottomLayout.requestLayout();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f162698f = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C64412a.AbstractC64414b.AbstractC64415a aVar) {
        this.f162696d = aVar;
    }

    public RealNameView(Activity activity, AbstractC64411a aVar) {
        this.f162693a = activity;
        this.f162697e = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m253130a(String str, View view) {
        C65251f.m256141a(this.f162693a, str, this.f162695c);
        Statistics.sendEvent("passport_account_verify_appeal");
        this.f162693a.finish();
        this.f162693a.overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m253131a(String str, String str2, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C49096b.m193600l();
        this.f162696d.mo222977a(str, str2);
        this.mCheckBoxPolicy.setChecked(true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m253129a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (((float) (i4 - i2)) > ((float) C49154ag.m193837b(this.f162693a)) * 0.75f) {
            z = true;
        } else {
            z = false;
        }
        m253132a(z);
    }
}
