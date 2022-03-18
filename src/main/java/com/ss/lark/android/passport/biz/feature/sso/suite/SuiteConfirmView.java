package com.ss.lark.android.passport.biz.feature.sso.suite;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SuiteInfo;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.feature.sso.C65022a;
import com.ss.lark.android.passport.biz.feature.sso.suite.C65066a;
import com.ss.lark.android.passport.biz.widget.CenterTextView;

public class SuiteConfirmView extends AbstractC49023c<C65066a.AbstractC65069b.AbstractC65070a> implements C65066a.AbstractC65069b {

    /* renamed from: c */
    public C65066a.AbstractC65069b.AbstractC65070a f163863c;

    /* renamed from: d */
    private final Activity f163864d;

    /* renamed from: e */
    private DialogC49246b f163865e;

    /* renamed from: f */
    private final AbstractC65065a f163866f;

    /* renamed from: g */
    private boolean f163867g;
    @BindView(6520)
    TextView mHitTextView;
    @BindView(6717)
    TextView mLoginAll;
    @BindView(6714)
    CenterTextView mLoginAppNameTV;
    @BindView(6718)
    TextView mLoginSingle;
    @BindView(6716)
    TextView mLoginTV;
    @BindView(6513)
    ViewGroup mMultiLoginGroup;
    @BindView(6314)
    CheckBox mNotifyChecker;
    @BindView(6315)
    ConstraintLayout mNotifyLayout;
    @BindView(7167)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmView$a */
    public interface AbstractC65065a {
        /* renamed from: a */
        void mo224193a();

        /* renamed from: a */
        void mo224194a(SuiteConfirmView suiteConfirmView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: d */
    public void mo224185d() {
        this.f163866f.mo224193a();
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: f */
    public void mo224187f() {
        DialogC49246b bVar = this.f163865e;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: g */
    public boolean mo224188g() {
        return this.f163864d.isFinishing();
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: h */
    public void mo224189h() {
        this.f163864d.finish();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f163866f.mo224194a(this);
        m255506i();
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: e */
    public void mo224186e() {
        if (this.f163865e == null) {
            this.f163865e = new DialogC49246b(this.f163864d, true);
        }
        this.f163865e.show();
    }

    /* renamed from: i */
    private void m255506i() {
        this.f163865e = new DialogC49246b(this.f163864d, true);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmView.View$OnClickListenerC650621 */

            public void onClick(View view) {
                C65022a.m255255a("close_btn_click", "suite");
                SuiteConfirmView.this.f163863c.mo224204a();
            }
        });
        this.mNotifyChecker.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmView.C650632 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SuiteConfirmView.this.f163863c.mo224206b(z);
            }
        });
        ak.m95026a(this.mNotifyChecker, UIHelper.dp2px(5.0f));
        this.mHitTextView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmView.View$OnClickListenerC650643 */

            public void onClick(View view) {
                SuiteConfirmView.this.mNotifyChecker.setChecked(!SuiteConfirmView.this.mNotifyChecker.isChecked());
            }
        });
    }

    /* renamed from: a */
    public void mo171188a(C65066a.AbstractC65069b.AbstractC65070a aVar) {
        this.f163863c = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: c */
    public void mo224184c(boolean z) {
        this.f163864d.moveTaskToBack(z);
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: b */
    public void mo224183b(boolean z) {
        int i;
        ConstraintLayout constraintLayout = this.mNotifyLayout;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        constraintLayout.setVisibility(i);
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: a */
    public void mo224178a(SuiteInfo suiteInfo) {
        if (suiteInfo == null) {
            this.f123085b.mo171471d("SuiteConfirmView", "initViewBySuiteInfo suiteInfo is null ");
            return;
        }
        this.mLoginAppNameTV.setText(suiteInfo.title);
        if (!TextUtils.isEmpty(suiteInfo.subTitle)) {
            this.mHitTextView.setText(suiteInfo.subTitle);
        }
        boolean z = true;
        if (suiteInfo.buttonList == null || suiteInfo.buttonList.size() <= 1) {
            z = false;
        }
        this.f163867g = z;
        m255504b(suiteInfo);
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: b */
    public void mo224182b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = UIHelper.getString(R.string.Lark_Legacy_LoginNotifyRelogin);
        }
        UDDialogUtils.DialogWrapper a = UDDialogUtils.m193814a(this.f163864d, str, UIHelper.getString(R.string.Lark_Login_SSO_TimeoutButton));
        a.mo171633a(false);
        a.mo171632a();
    }

    /* renamed from: b */
    private void m255504b(SuiteInfo suiteInfo) {
        if (this.f163867g) {
            this.mMultiLoginGroup.setVisibility(0);
            this.mLoginTV.setVisibility(8);
            ButtonInfo buttonInfo = suiteInfo.buttonList.get(0);
            ButtonInfo buttonInfo2 = suiteInfo.buttonList.get(1);
            this.mLoginSingle.setText(buttonInfo.text);
            this.mLoginAll.setText(buttonInfo2.text);
            this.mLoginSingle.setOnClickListener(new View.OnClickListener(buttonInfo) {
                /* class com.ss.lark.android.passport.biz.feature.sso.suite.$$Lambda$SuiteConfirmView$T303fdGS9Da3MvzMUbhxrwGPQa0 */
                public final /* synthetic */ ButtonInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    SuiteConfirmView.lambda$T303fdGS9Da3MvzMUbhxrwGPQa0(SuiteConfirmView.this, this.f$1, view);
                }
            });
            this.mLoginAll.setOnClickListener(new View.OnClickListener(buttonInfo2) {
                /* class com.ss.lark.android.passport.biz.feature.sso.suite.$$Lambda$SuiteConfirmView$fVbhAnv5XFfa75bhKLzAya9a1zI */
                public final /* synthetic */ ButtonInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    SuiteConfirmView.lambda$fVbhAnv5XFfa75bhKLzAya9a1zI(SuiteConfirmView.this, this.f$1, view);
                }
            });
            return;
        }
        ButtonInfo buttonInfo3 = suiteInfo.buttonList.get(0);
        this.mMultiLoginGroup.setVisibility(8);
        this.mLoginTV.setVisibility(0);
        this.mLoginTV.setText(buttonInfo3.text);
        this.mLoginTV.setEnabled(true);
        this.mLoginTV.setOnClickListener(new View.OnClickListener(buttonInfo3) {
            /* class com.ss.lark.android.passport.biz.feature.sso.suite.$$Lambda$SuiteConfirmView$X_4Bq7FhGzDjtVOjY6ZCbResnA */
            public final /* synthetic */ ButtonInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                SuiteConfirmView.m271533lambda$X_4Bq7FhGzDjtVOjY6ZCbResnA(SuiteConfirmView.this, this.f$1, view);
            }
        });
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: a */
    public void mo224180a(String str) {
        LKUIToast.show(this.f163864d, str);
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b
    /* renamed from: a */
    public void mo224181a(boolean z) {
        this.mNotifyChecker.setChecked(z);
    }

    public SuiteConfirmView(AbstractC65065a aVar, FragmentActivity fragmentActivity) {
        this.f163864d = fragmentActivity;
        this.f163866f = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255502a(ButtonInfo buttonInfo, View view) {
        boolean z;
        C65022a.m255257c();
        C65022a.m255255a("confirm_btn_click", "suite");
        C65066a.AbstractC65069b.AbstractC65070a aVar = this.f163863c;
        if (buttonInfo.actionType == ButtonType.QR_AUTH_ALL.getValue()) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo224205a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m255503b(ButtonInfo buttonInfo, View view) {
        boolean z;
        C65022a.m255254a();
        C65066a.AbstractC65069b.AbstractC65070a aVar = this.f163863c;
        if (buttonInfo.actionType == ButtonType.QR_AUTH_ALL.getValue()) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo224205a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m255505c(ButtonInfo buttonInfo, View view) {
        boolean z;
        C65022a.m255256b();
        C65066a.AbstractC65069b.AbstractC65070a aVar = this.f163863c;
        if (buttonInfo.actionType == ButtonType.QR_AUTH_ALL.getValue()) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo224205a(z);
    }
}
