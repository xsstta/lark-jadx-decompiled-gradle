package com.ss.lark.android.passport.biz.feature.user_info.p3233a;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetUserInfoStepInfo;
import com.ss.lark.android.passport.biz.feature.country.AbstractC64744h;
import com.ss.lark.android.passport.biz.feature.country.C64720c;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65091c;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65103f;
import com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils;
import com.ss.lark.android.passport.biz.widget.NoScrollViewPager;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.f */
public class C65103f extends AbstractC49023c<C65086a.AbstractC65088b.AbstractC65089a> implements C65086a.AbstractC65088b {

    /* renamed from: c */
    public C65086a.AbstractC65088b.AbstractC65089a f163943c;

    /* renamed from: d */
    public View f163944d;

    /* renamed from: e */
    public AppCompatCheckBox f163945e;

    /* renamed from: f */
    public C65090b f163946f;

    /* renamed from: g */
    public int f163947g;

    /* renamed from: h */
    public String f163948h;

    /* renamed from: i */
    public SetUserInfoStepInfo f163949i;

    /* renamed from: j */
    private final Activity f163950j;

    /* renamed from: k */
    private final FragmentManager f163951k;

    /* renamed from: l */
    private NoScrollViewPager f163952l;

    /* renamed from: m */
    private UDTabLayout f163953m;

    /* renamed from: n */
    private TextView f163954n;

    /* renamed from: o */
    private UniContext f163955o;

    /* renamed from: p */
    private CountryBean f163956p;

    /* renamed from: q */
    private C64720c f163957q;

    /* renamed from: r */
    private String f163958r;

    /* renamed from: s */
    private String f163959s;

    /* renamed from: t */
    private UDDialog f163960t;

    /* renamed from: u */
    private CommonUiContainer f163961u;

    /* renamed from: v */
    private final C65091c.AbstractC65093a f163962v = new C65091c.AbstractC65093a() {
        /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65103f.C651041 */

        @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65091c.AbstractC65093a
        /* renamed from: a */
        public void mo224257a() {
            C65103f.this.mo224268g();
        }

        @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65091c.AbstractC65093a
        /* renamed from: a */
        public void mo224258a(String str) {
            C65103f.this.f163943c.mo224246a(str);
        }
    };

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163943c = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163955o;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163955o = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C65086a.AbstractC65088b.AbstractC65089a aVar) {
        this.f163943c = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65088b
    /* renamed from: a */
    public void mo224242a(final SetUserInfoStepInfo setUserInfoStepInfo) {
        this.f163949i = setUserInfoStepInfo;
        if (setUserInfoStepInfo != null) {
            this.f163961u.mo222871a((CharSequence) setUserInfoStepInfo.mTitle);
            this.f163961u.mo222872a(setUserInfoStepInfo.mSubTitle, (JSONObject) null, this.f163955o, (C49226y.AbstractC49228a) null);
            this.f163961u.mo222870a(setUserInfoStepInfo.mNextButton);
            C65090b bVar = new C65090b(setUserInfoStepInfo, this.f163955o, this.f163956p, m255670l(), this.f163962v, new C65091c.AbstractC65094b() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$zYXp8t7XI6EfpYdjDQhrgpd8zA */

                @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65091c.AbstractC65094b
                public final void onUserInfoChanged(int i, String str, String str2, int i2) {
                    C65103f.this.m255658a(i, str, str2, i2);
                }
            });
            this.f163946f = bVar;
            this.f163952l.setAdapter(bVar);
            this.f163952l.addOnPageChangeListener(new ViewPager.C1581f() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65103f.C651052 */

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
                public void onPageSelected(int i) {
                    C65103f.this.f163946f.mo224248a(i, C65103f.this.f163948h);
                    int i2 = setUserInfoStepInfo.mCredentialInputList.get(i).mCredentialType;
                    C65103f.this.mo224264a(i2);
                    PassportLog passportLog = C65103f.this.f123085b;
                    passportLog.mo171465b("n_action_set_user_info_change_cp_type", "cpType = " + i2);
                }
            });
            if (!TextUtils.isEmpty(setUserInfoStepInfo.mPrivacyPolicy)) {
                this.f163944d.setVisibility(0);
                this.f163945e.setChecked(false);
                m255662a(this.f163954n, setUserInfoStepInfo);
            }
            if (setUserInfoStepInfo.mCredentialInputList == null || setUserInfoStepInfo.mCredentialInputList.size() <= 1) {
                this.f163953m.setVisibility(8);
            } else if (this.f163955o != null) {
                int i = -1;
                if (m255670l()) {
                    if (!TextUtils.isEmpty(this.f163955o.getCurLoginPhone())) {
                        i = m255657a(setUserInfoStepInfo.mCredentialInputList, 1);
                    } else if (!TextUtils.isEmpty(this.f163955o.getCurLoginEmail())) {
                        i = m255657a(setUserInfoStepInfo.mCredentialInputList, 2);
                    }
                }
                if (i >= 0) {
                    this.f163952l.post(new Runnable(i) {
                        /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$S1yTdODsXbhx7tZCK9zqEWQg1Nw */
                        public final /* synthetic */ int f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C65103f.this.m255665b(this.f$1);
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65088b
    /* renamed from: a */
    public void mo224241a(CountryBean countryBean, boolean z) {
        this.f163956p = countryBean;
        C65090b bVar = this.f163946f;
        if (bVar != null) {
            bVar.mo224249a(countryBean, z);
        }
    }

    /* renamed from: a */
    public void mo224266a(Runnable runnable) {
        UDDialog uDDialog = this.f163960t;
        if (uDDialog != null && uDDialog.isShowing()) {
            this.f163960t.dismiss();
        }
        View inflate = LayoutInflater.from(this.f163950j).inflate(R.layout.signin_sdk_register_dialog_content, (ViewGroup) null);
        m255662a((TextView) inflate.findViewById(R.id.lkui_dialog_content_message_tv), this.f163949i);
        UDDialogBuilder eVar = new UDDialogBuilder(this.f163950j);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(R.string.Lark_Login_V3_AgreePolicyTitle)).titleBold(true)).contentLayout(inflate)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Login_V3_PolicyAlertCancel, $$Lambda$f$k5F729mvV5ON5CutO5bXwrLFXI.INSTANCE)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Login_V3_PolicyAlertAgree, new DialogInterface.OnClickListener(runnable) {
            /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$OkUfmbgUAkAq5c7wviDpaHeJ8LU */
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C65103f.this.m255664a(this.f$1, dialogInterface, i);
            }
        });
        UDDialog build = eVar.build();
        this.f163960t = build;
        build.show();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n */
    private /* synthetic */ void m255672n() {
        C49203q.m193972a(this.f163950j);
    }

    /* renamed from: h */
    private int m255666h() {
        NoScrollViewPager noScrollViewPager = this.f163952l;
        if (noScrollViewPager == null) {
            return 0;
        }
        return noScrollViewPager.getCurrentItem();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private /* synthetic */ void m255673o() {
        this.f163957q.mo223576b();
        m255671m();
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65088b
    /* renamed from: d */
    public void mo224243d() {
        Activity activity = this.f163950j;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65088b
    /* renamed from: e */
    public void mo224244e() {
        Activity activity = this.f163950j;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: i */
    private void m255667i() {
        m255659a(this.f163947g, this.f163958r, this.f163959s, this.f163948h, m255666h());
    }

    /* renamed from: k */
    private void m255669k() {
        if (this.f163957q == null) {
            C64720c a = C64720c.m254225a();
            this.f163957q = a;
            a.mo223574a(new AbstractC64744h.AbstractC64745a() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$oK8mtKCXnl566PTgMAi7Mi3mAIQ */

                @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64745a
                public final void onCountrySelect(CountryBean countryBean) {
                    C65103f.this.m255663a((C65103f) countryBean);
                }
            });
            this.f163957q.mo223575a(new AbstractC64744h.AbstractC64746b() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$7iRfReYeccKH3wyoqCcBSoO96Y */

                @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64746b
                public final void onPageClose() {
                    C65103f.this.m255673o();
                }
            });
        }
    }

    /* renamed from: f */
    public String mo224267f() {
        String str;
        String trim;
        int i = this.f163947g;
        if (i == 2) {
            String str2 = this.f163959s;
            if (str2 == null) {
                return "";
            }
            trim = str2.trim();
        } else if (i != 1 || (str = this.f163958r) == null) {
            return "";
        } else {
            trim = str.trim();
        }
        return trim;
    }

    /* renamed from: l */
    private boolean m255670l() {
        SetUserInfoStepInfo setUserInfoStepInfo = this.f163949i;
        if (setUserInfoStepInfo == null) {
            return ServiceFinder.m193748c().isLarkPackage();
        }
        if (TextUtils.isEmpty(setUserInfoStepInfo.mUnit)) {
            return ServiceFinder.m193748c().isLarkPackage();
        }
        if (TextUtils.equals(this.f163949i.mUnit, "eu_ea") || TextUtils.equals(this.f163949i.mUnit, "boeva")) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m255671m() {
        Activity activity = this.f163950j;
        if (activity != null && C49203q.m193977c(activity)) {
            this.f123085b.mo171465b("n_page_set_user_info_start", "keyboardControl : showing");
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$aEtziuG8KofjNq75IxrO4O226Ds */

                public final void run() {
                    C65103f.this.m255672n();
                }
            }, 100);
        }
    }

    /* renamed from: g */
    public void mo224268g() {
        FragmentTransaction beginTransaction = this.f163951k.beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.signin_sdk_translate_from_bottom, R.anim.signin_sdk_translate_to_bottom);
        if (!this.f163957q.isAdded()) {
            beginTransaction.add(this.f163961u.f162613b.getId(), this.f163957q, "CountrySelectFragment");
        } else {
            beginTransaction.show(this.f163957q);
            this.f163957q.mo223577c();
        }
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: j */
    private void m255668j() {
        this.f163952l = (NoScrollViewPager) this.f163950j.findViewById(R.id.view_pager);
        this.f163953m = (UDTabLayout) this.f163950j.findViewById(R.id.tab_layout);
        this.f163944d = this.f163950j.findViewById(R.id.policy_layout);
        this.f163945e = (AppCompatCheckBox) this.f163950j.findViewById(R.id.policy_check_box);
        this.f163954n = (TextView) this.f163950j.findViewById(R.id.policy_text_view);
        new UDTabLayoutCoordinator(this.f163953m, this.f163952l).attach();
        this.f163961u.mo222876a(false);
        this.f163961u.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65103f.View$OnClickListenerC651063 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m255689a() {
                C65103f.this.f163943c.mo224245a(C65103f.this.f163947g, C65103f.this.mo224267f(), C65103f.this.f163948h.trim());
            }

            public void onClick(View view) {
                if (C65103f.this.f163949i == null) {
                    C65103f.this.f123085b.mo171471d("n_action_set_user_info_next", "step info is null");
                    return;
                }
                C65103f.this.f123085b.mo171465b("n_action_set_user_info_next", "click Btn createTeam");
                if (C65103f.this.f163944d.getVisibility() != 0 || C65103f.this.f163945e.isChecked()) {
                    C65103f.this.f163943c.mo224245a(C65103f.this.f163947g, C65103f.this.mo224267f(), C65103f.this.f163948h.trim());
                } else {
                    C65103f.this.mo224266a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$3$47pXiKkNT51fu31WbSJC6ihAZg */

                        public final void run() {
                            C65103f.View$OnClickListenerC651063.this.m255689a();
                        }
                    });
                }
            }
        });
        this.f163945e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$f$3dwqsgng0EDcMijiMaf6cNmCvRk */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C65103f.this.m255661a((C65103f) compoundButton, (CompoundButton) z);
            }
        });
        m255669k();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m255668j();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m255665b(int i) {
        this.f163952l.setCurrentItem(i, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m255663a(CountryBean countryBean) {
        this.f163956p = countryBean;
        this.f163946f.mo224249a(countryBean, true);
        m255671m();
    }

    /* renamed from: a */
    public void mo224264a(int i) {
        m255659a(i, this.f163958r, this.f163959s, this.f163948h, m255666h());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m255661a(CompoundButton compoundButton, boolean z) {
        m255667i();
    }

    /* renamed from: a */
    private int m255657a(List<SetUserInfoStepInfo.CredentialInputItem> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).mCredentialType == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m255662a(TextView textView, SetUserInfoStepInfo setUserInfoStepInfo) {
        String str;
        if (ServiceFinder.m193748c().isLogin()) {
            str = setUserInfoStepInfo.mTenantUnitDomain;
        } else {
            str = ServiceFinder.m193751f().getPolicyHost(IDomainService.UrlUnitType.HOST_UNIT);
        }
        if (TextUtils.isEmpty(str)) {
            str = ServiceFinder.m193751f().getPolicyHost(IDomainService.UrlUnitType.HOST_UNIT);
        }
        new PrivacyPolicyUtils.TextViewBuilder(textView, (int) R.string.Lark_Login_V3_registerNextStepPolicyTip, str).mo224495b();
    }

    public C65103f(Activity activity, FragmentManager fragmentManager, CommonUiContainer commonUiContainer) {
        this.f163950j = activity;
        this.f163951k = fragmentManager;
        this.f163961u = commonUiContainer;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m255664a(Runnable runnable, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        runnable.run();
        this.f163945e.setChecked(true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m255658a(int i, String str, String str2, int i2) {
        if (i == 1) {
            m255659a(i, str, this.f163959s, str2, i2);
        } else if (i == 2) {
            m255659a(i, this.f163958r, str, str2, i2);
        } else {
            PassportLog passportLog = this.f123085b;
            passportLog.mo171471d("n_page_set_user_info_start", "onUserInfoUpdate 4 params invalid cpType: " + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r0.f163946f.mo224250a(m255666h()) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (com.ss.android.lark.passport.infra.util.C49225x.m194058a(r0.f163959s) != false) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m255659a(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65103f.m255659a(int, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
