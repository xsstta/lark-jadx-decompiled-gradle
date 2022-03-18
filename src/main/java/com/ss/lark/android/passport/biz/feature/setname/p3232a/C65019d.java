package com.ss.lark.android.passport.biz.feature.setname.p3232a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetNameStepInfo;
import com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;

/* renamed from: com.ss.lark.android.passport.biz.feature.setname.a.d */
public class C65019d extends AbstractC49023c<C65009a.AbstractC65011b.AbstractC65012a> implements C65009a.AbstractC65011b {

    /* renamed from: c */
    public C65009a.AbstractC65011b.AbstractC65012a f163769c;

    /* renamed from: d */
    CommonEditInput f163770d;

    /* renamed from: e */
    public final CommonUiContainer f163771e;

    /* renamed from: f */
    public AppCompatCheckBox f163772f;

    /* renamed from: g */
    private final Activity f163773g;

    /* renamed from: h */
    private UniContext f163774h;

    /* renamed from: i */
    private View f163775i;

    /* renamed from: j */
    private TextView f163776j;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163769c = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m255244f();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163774h;
    }

    @Override // com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a.AbstractC65011b
    /* renamed from: d */
    public void mo224063d() {
        Activity activity = this.f163773g;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a.AbstractC65011b
    /* renamed from: e */
    public void mo224064e() {
        Activity activity = this.f163773g;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: f */
    private void m255244f() {
        CommonEditInput commonEditInput = (CommonEditInput) this.f163773g.findViewById(R.id.user_name_layout);
        this.f163770d = commonEditInput;
        commonEditInput.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.feature.setname.p3232a.C65019d.C650201 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                C65019d.this.f163771e.mo222876a(!TextUtils.isEmpty(str.trim()));
            }
        });
        this.f163775i = this.f163773g.findViewById(R.id.policy_layout);
        this.f163772f = (AppCompatCheckBox) this.f163773g.findViewById(R.id.policy_check_box);
        this.f163776j = (TextView) this.f163773g.findViewById(R.id.policy_text_view);
        this.f163772f.setChecked(false);
        this.f163771e.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.setname.p3232a.C65019d.View$OnClickListenerC650212 */

            public void onClick(View view) {
                C65019d.this.f123085b.mo171465b("SetNameView", "click Btn createTeam");
                C65019d.this.f163769c.mo224065a(C65019d.this.f163770d.getContent().trim(), C65019d.this.f163772f.isChecked());
            }
        });
        this.f163771e.mo222876a(false);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163774h = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C65009a.AbstractC65011b.AbstractC65012a aVar) {
        this.f163769c = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a.AbstractC65011b
    /* renamed from: a */
    public void mo224062a(SetNameStepInfo setNameStepInfo) {
        if (setNameStepInfo != null) {
            if (!TextUtils.isEmpty(setNameStepInfo.nameInput.placeholder)) {
                this.f163771e.mo222871a((CharSequence) setNameStepInfo.nameInput.placeholder);
                this.f163770d.setInputHint(setNameStepInfo.nameInput.placeholder);
            }
            if (!TextUtils.isEmpty(setNameStepInfo.title)) {
                this.f163771e.mo222871a((CharSequence) setNameStepInfo.title);
            }
            this.f163771e.mo222872a(setNameStepInfo.subTitle, (JSONObject) null, this.f163774h, (C49226y.AbstractC49228a) null);
            this.f163771e.mo222870a(setNameStepInfo.nextButton);
            this.f163770d.setContent(setNameStepInfo.name);
            this.f163770d.mo224520d();
            if (setNameStepInfo.showOptIn) {
                this.f123085b.mo171460a("n_action_set_name_show_opt_in");
                this.f163775i.setVisibility(0);
                this.f163776j.setText(setNameStepInfo.optTitle);
                return;
            }
            this.f163775i.setVisibility(8);
        }
    }

    public C65019d(Activity activity, CommonUiContainer commonUiContainer) {
        this.f163773g = activity;
        this.f163771e = commonUiContainer;
    }
}
