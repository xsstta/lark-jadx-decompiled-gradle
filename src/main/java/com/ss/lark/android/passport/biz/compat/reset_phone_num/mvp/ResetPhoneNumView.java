package com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.ResetPhoneStepInfo;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;

public class ResetPhoneNumView extends AbstractC49023c<C64425a.AbstractC64427b.AbstractC64428a> implements C64425a.AbstractC64427b {

    /* renamed from: c */
    public C64425a.AbstractC64427b.AbstractC64428a f162724c;

    /* renamed from: d */
    private final Activity f162725d;

    /* renamed from: e */
    private AbstractC64424a f162726e;

    /* renamed from: f */
    private final CommonUiContainer f162727f;
    @BindView(6470)
    public CommonEditInput mEtPhoneNum;

    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.ResetPhoneNumView$a */
    public interface AbstractC64424a {
        /* renamed from: a */
        void mo222984a(ResetPhoneNumView resetPhoneNumView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f162724c = null;
        this.f162726e = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f162726e.mo222984a(this);
        m253183g();
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a.AbstractC64427b
    /* renamed from: d */
    public void mo222987d() {
        Activity activity = this.f162725d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a.AbstractC64427b
    /* renamed from: e */
    public void mo222988e() {
        Activity activity = this.f162725d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: f */
    public void mo222989f() {
        if (TextUtils.isEmpty(this.mEtPhoneNum.getRemoveBlankText())) {
            this.f162727f.mo222876a(false);
        } else if (this.mEtPhoneNum.getRemoveBlankText().length() == 11) {
            this.f162727f.mo222876a(true);
        } else {
            this.f162727f.mo222876a(false);
        }
    }

    /* renamed from: g */
    private void m253183g() {
        this.mEtPhoneNum.setInputType(2);
        this.mEtPhoneNum.setInputHint(this.f162725d.getString(R.string.Lark_Login_RecoverAccountNewPhoneNumberPlaceholder));
        this.mEtPhoneNum.setInputLength(13);
        this.mEtPhoneNum.mo224520d();
        this.mEtPhoneNum.mo224517a("(\\d{3})(\\d{4})(\\d{4})", true);
        this.f162727f.mo222876a(false);
        this.f162727f.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.ResetPhoneNumView.View$OnClickListenerC644221 */

            public void onClick(View view) {
                C49096b.m193601m();
                ResetPhoneNumView.this.f123085b.mo171465b("n_action_old_new_credential_next", "next clicked");
                ResetPhoneNumView.this.f162724c.mo222993a(ResetPhoneNumView.this.mEtPhoneNum.getRemoveBlankText());
            }
        });
        this.mEtPhoneNum.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.ResetPhoneNumView.C644232 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                ResetPhoneNumView.this.mEtPhoneNum.mo224507a();
                ResetPhoneNumView.this.mo222989f();
            }
        });
    }

    /* renamed from: a */
    public void mo171188a(C64425a.AbstractC64427b.AbstractC64428a aVar) {
        this.f162724c = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a.AbstractC64427b
    /* renamed from: a */
    public void mo222986a(ResetPhoneStepInfo resetPhoneStepInfo) {
        if (resetPhoneStepInfo != null) {
            this.f162727f.mo222871a((CharSequence) resetPhoneStepInfo.title);
            this.f162727f.mo222879b(resetPhoneStepInfo.subTitle);
            this.f162727f.mo222881c(R.string.Lark_Login_V3_NextStep);
        }
    }

    public ResetPhoneNumView(Activity activity, AbstractC64424a aVar, CommonUiContainer commonUiContainer) {
        this.f162725d = activity;
        this.f162726e = aVar;
        this.f162727f = commonUiContainer;
    }
}
