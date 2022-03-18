package com.ss.lark.android.passport.biz.feature.real_name.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import butterknife.BindView;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.p2441c.C49173f;
import com.ss.android.lark.statistics.Statistics;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.RecoverAccountStepInfo;
import com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a;
import com.ss.lark.android.passport.biz.utils.C65251f;
import com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;
import com.ss.lark.android.passport.biz.widget.common.SwitchTextView;
import com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public class RealNameView extends AbstractC49023c<C64928a.AbstractC64930b.AbstractC64931a> implements C64928a.AbstractC64930b {

    /* renamed from: c */
    public final Activity f163624c;

    /* renamed from: d */
    public UDDialog f163625d;

    /* renamed from: e */
    public SwitchTextView f163626e;

    /* renamed from: f */
    public final CommonUiContainer f163627f;

    /* renamed from: g */
    private C64928a.AbstractC64930b.AbstractC64931a f163628g;

    /* renamed from: h */
    private final AbstractC65288b.AbstractC65292d f163629h = new AbstractC65288b.AbstractC65292d() {
        /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.C649191 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65292d
        /* renamed from: a */
        public void mo222966a() {
            RealNameView.this.f163627f.mo222880c().performClick();
        }
    };
    @BindView(6323)
    public AppCompatCheckBox mCheckBoxPolicy;
    @BindView(6469)
    public CommonEditInput mEtIdCode;
    @BindView(6473)
    public CommonEditInput mEtUserName;
    @BindView(7202)
    public TextView mTvPolicy;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163628g = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m254953h();
    }

    @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64930b
    /* renamed from: f */
    public void mo223938f() {
        this.f163624c.finish();
    }

    @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64930b
    /* renamed from: d */
    public void mo223936d() {
        Activity activity = this.f163624c;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64930b
    /* renamed from: e */
    public void mo223937e() {
        Activity activity = this.f163624c;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: h */
    private void m254953h() {
        this.mEtIdCode.setInputLength(20);
        this.mEtIdCode.mo224517a("(\\d{6})(\\d{8})(\\d{4})", true);
        this.mEtIdCode.setOnKeyboardDetectorListener(this.f163629h);
        this.mEtIdCode.setInputType(2);
        this.mEtIdCode.setKeyListener(DigitsKeyListener.getInstance("0123456789xX"));
        this.mEtUserName.setOnKeyboardDetectorListener(this.f163629h);
        this.f163627f.mo222876a(false);
        this.mEtIdCode.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.C649224 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                RealNameView.this.mEtIdCode.mo224507a();
                RealNameView.this.mo223939g();
            }
        });
        this.mEtUserName.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.C649235 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                RealNameView.this.mEtUserName.mo224507a();
                RealNameView.this.mo223939g();
            }
        });
        this.mCheckBoxPolicy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.C649246 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            }
        });
        m254954i();
    }

    /* renamed from: i */
    private void m254954i() {
        final String a = this.f163628g.mo223951a();
        if (TextUtils.isEmpty(a)) {
            this.f123085b.mo171471d("RealNameView", "initAccountAppealView but appealUrl is empty");
            return;
        }
        SwitchTextView a2 = SwitchTextView.m256216a(this.f163627f.f162603g);
        this.f163626e = a2;
        this.f163627f.mo222874a(a2, (LinearLayout.LayoutParams) null, new Function1<LinearLayout.LayoutParams, Unit>() {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.C649268 */

            /* renamed from: a */
            public Unit invoke(LinearLayout.LayoutParams layoutParams) {
                layoutParams.topMargin = C49154ag.m193828a((Context) RealNameView.this.f163624c, 16.0f);
                return null;
            }
        });
        this.f163626e.setVisibility(0);
        this.f163626e.mo224646a(this.f163624c.getResources().getString(R.string.Lark_Passport_IdentityVerificationDisabledTip), this.f163624c.getResources().getString(R.string.Lark_Passport_IdentityVerificationDisabled_AppealLink), new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.View$OnClickListenerC649279 */

            public void onClick(View view) {
                C65251f.m256141a(RealNameView.this.f163624c, a, RealNameView.this.f123085b);
                Statistics.sendEvent("passport_account_verify_appeal");
                RealNameView.this.f163624c.finish();
                RealNameView.this.f163624c.overridePendingTransition(0, 0);
                RealNameView.this.f123085b.mo171465b("n_action_account_appeal_click", "appeal clicked");
            }
        });
        this.f163626e.setHighlightColor(0);
        this.f163627f.f162605i.setOnImeChangeHandler(new Function3<View, Boolean, Integer, Unit>() {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.AnonymousClass10 */

            /* renamed from: a */
            public Unit invoke(View view, Boolean bool, Integer num) {
                int i;
                SwitchTextView switchTextView = RealNameView.this.f163626e;
                if (bool.booleanValue()) {
                    i = 4;
                } else {
                    i = 0;
                }
                switchTextView.setVisibility(i);
                RealNameView.this.f163627f.f162605i.mo224661a(view, bool.booleanValue(), num.intValue());
                return null;
            }
        });
        this.f163627f.f162605i.setOnImeChangedExtraHeightProvider(new AbstractC65313b() {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.C649202 */

            @Override // com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b
            /* renamed from: c */
            public /* synthetic */ int mo223943c() {
                return AbstractC65313b.CC.$default$c(this);
            }

            @Override // com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b
            /* renamed from: a */
            public int mo223941a() {
                return -C49173f.m193892d(RealNameView.this.f163626e);
            }

            @Override // com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b
            /* renamed from: b */
            public int mo223942b() {
                return -C49173f.m193892d(RealNameView.this.f163626e);
            }
        });
    }

    /* renamed from: g */
    public void mo223939g() {
        if (TextUtils.isEmpty(this.mEtUserName.getRemoveBlankText()) || TextUtils.isEmpty(this.mEtIdCode.getRemoveBlankText())) {
            this.f163627f.mo222876a(false);
        } else if (this.mEtIdCode.getRemoveBlankText().length() == 15 || this.mEtIdCode.getRemoveBlankText().length() == 18) {
            this.f163627f.mo222876a(true);
        } else {
            this.f163627f.mo222876a(false);
        }
    }

    /* renamed from: a */
    public void mo171188a(C64928a.AbstractC64930b.AbstractC64931a aVar) {
        this.f163628g = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64930b
    /* renamed from: a */
    public void mo223933a(final RecoverAccountStepInfo recoverAccountStepInfo) {
        if (recoverAccountStepInfo != null) {
            this.f163627f.mo222871a((CharSequence) recoverAccountStepInfo.getTitle());
            this.f163627f.mo222879b(recoverAccountStepInfo.getSubTile());
            this.f163627f.mo222881c(R.string.Lark_Login_V3_NextStep);
            String string = this.f163624c.getString(R.string.Lark_Login_RecoverAccountIDPlaceholder);
            if (recoverAccountStepInfo.getIdInput() != null) {
                string = recoverAccountStepInfo.getIdInput().placeholder;
            }
            this.mEtIdCode.setInputHint(string);
            String string2 = this.f163624c.getString(R.string.Lark_Login_RecoverAccountNamePlaceholder);
            if (recoverAccountStepInfo.getNameInput() != null) {
                string2 = recoverAccountStepInfo.getNameInput().placeholder;
            }
            this.mEtUserName.setInputHint(string2);
            m254950a(recoverAccountStepInfo, this.mTvPolicy).mo224495b();
            this.f163627f.mo222873a((View.OnClickListener) new View.OnClickListener() {
                /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.View$OnClickListenerC649213 */

                public void onClick(View view) {
                    RealNameView realNameView = RealNameView.this;
                    realNameView.mo223934a(recoverAccountStepInfo, realNameView.mEtUserName.getRemoveBlankText(), RealNameView.this.mEtIdCode.getRemoveBlankText());
                }
            });
        }
    }

    public RealNameView(Activity activity, CommonUiContainer commonUiContainer) {
        this.f163624c = activity;
        this.f163627f = commonUiContainer;
    }

    /* renamed from: a */
    private PrivacyPolicyUtils.TextViewBuilder m254950a(RecoverAccountStepInfo recoverAccountStepInfo, TextView textView) {
        String str;
        if (recoverAccountStepInfo == null || TextUtils.isEmpty(recoverAccountStepInfo.getPolicyDomain())) {
            str = ServiceFinder.m193751f().getPolicyHost(IDomainService.UrlUnitType.CURRENT_UNIT);
        } else {
            str = recoverAccountStepInfo.getPolicyDomain();
        }
        PrivacyPolicyUtils.Policy bVar = new PrivacyPolicyUtils.Policy(this.f163624c.getString(R.string.Lark_Passport_IdentityVerifyPolicy), ServiceFinder.m193751f().getPolicyUrl(str, IDomainService.Policy.REAL_NAME));
        return new PrivacyPolicyUtils.TextViewBuilder(textView, (int) R.string.Lark_Login_V3_registerNextStepPolicyTip, str).mo224485a(PrivacyPolicyUtils.PolicyType.SERVICE_TERM, bVar).mo224485a(PrivacyPolicyUtils.PolicyType.PRIVACY, new PrivacyPolicyUtils.Policy(this.f163624c.getString(R.string.Lark_Passport_FaceInfoRulesPolicy), ServiceFinder.m193751f().getPolicyUrl(str, IDomainService.Policy.FACE_INFO)));
    }

    /* renamed from: a */
    public void mo223934a(RecoverAccountStepInfo recoverAccountStepInfo, String str, String str2) {
        PassportLog passportLog = this.f123085b;
        passportLog.mo171465b("n_action_opthree_next", "next, policy checked: " + this.mCheckBoxPolicy.isChecked());
        if (this.mCheckBoxPolicy.isChecked()) {
            this.f163628g.mo223952a(str, str2);
            return;
        }
        View inflate = LayoutInflater.from(this.f163624c).inflate(R.layout.signin_sdk_register_dialog_content, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.lkui_dialog_content_message_tv);
        if (textView != null) {
            m254950a(recoverAccountStepInfo, textView).mo224486a(new Function1<PrivacyPolicyUtils.PolicyType, Unit>() {
                /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView.C649257 */

                /* renamed from: a */
                public Unit invoke(PrivacyPolicyUtils.PolicyType policyType) {
                    if (RealNameView.this.f163625d == null || !RealNameView.this.f163625d.isShowing()) {
                        return null;
                    }
                    RealNameView.this.f163625d.dismiss();
                    return null;
                }
            }).mo224495b();
        }
        UDDialogBuilder eVar = new UDDialogBuilder(this.f163624c);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(R.string.Lark_Login_V3_AgreePolicyTitle)).titleBold(true)).contentLayout(inflate)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Login_V3_PolicyAlertCancel, $$Lambda$RealNameView$jrlIoBFllz1prFSwe1xecfx_u90.INSTANCE)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Login_V3_PolicyAlertAgree, new DialogInterface.OnClickListener(str, str2) {
            /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.$$Lambda$RealNameView$PhemZj9cJjLx96dcFG5hkfZq0 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                RealNameView.this.m254952a(this.f$1, this.f$2, dialogInterface, i);
            }
        });
        UDDialog build = eVar.build();
        this.f163625d = build;
        build.show();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m254952a(String str, String str2, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f163628g.mo223952a(str, str2);
        this.mCheckBoxPolicy.setChecked(true);
    }
}
