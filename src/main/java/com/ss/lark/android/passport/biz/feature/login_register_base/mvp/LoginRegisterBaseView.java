package com.ss.lark.android.passport.biz.feature.login_register_base.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.AuthChannelEnum;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.model.GetPassportConfigData;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.account.C64291a;
import com.ss.lark.android.passport.biz.base.ui.BaseUiContainer;
import com.ss.lark.android.passport.biz.entity.LoginUserInputV2;
import com.ss.lark.android.passport.biz.feature.country.AbstractC64744h;
import com.ss.lark.android.passport.biz.feature.country.C64720c;
import com.ss.lark.android.passport.biz.feature.login_input.LoginStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView;
import com.ss.lark.android.passport.biz.feature.p3216a.C64574a;
import com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.C65296c;
import com.ss.lark.android.passport.biz.widget.InputTabView;
import com.ss.lark.android.passport.biz.widget.MailInput;
import com.ss.lark.android.passport.biz.widget.NoScrollViewPager;
import com.ss.lark.android.passport.biz.widget.PhoneInput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public abstract class LoginRegisterBaseView extends AbstractC49023c<C64903a.AbstractC64905b.AbstractC64906a> implements C64903a.AbstractC64905b {

    /* renamed from: c */
    protected Activity f163563c;
    @BindView(6323)
    public AppCompatCheckBox checkBoxPolicy;

    /* renamed from: d */
    protected C64903a.AbstractC64905b.AbstractC64906a f163564d;

    /* renamed from: e */
    protected boolean f163565e = true;

    /* renamed from: f */
    public FragmentManager f163566f;

    /* renamed from: g */
    public C64720c f163567g;

    /* renamed from: h */
    protected PageType f163568h;

    /* renamed from: i */
    protected UniContext f163569i;
    @BindView(6567)
    public ImageView ivBack;

    /* renamed from: j */
    public PhoneInput f163570j;

    /* renamed from: k */
    public MailInput f163571k;

    /* renamed from: l */
    public InputTabView f163572l;
    @BindView(6687)
    public View llRegisterPolicy;

    /* renamed from: m */
    public InputTabView f163573m;
    @BindView(6303)
    public Button mBtnNext;
    @BindView(6721)
    public ViewGroup mContainerWithoutTitle;
    @BindView(6483)
    public View mFeishuTitleTab;
    @BindView(6606)
    public View mLarkTitleTab;
    @BindView(6664)
    public LinearLayout mLlAppleLogin;
    @BindView(6666)
    public View mLlBottomCompany;
    @BindView(6680)
    public LinearLayout mLlChange;
    @BindView(6667)
    public LinearLayout mLlCompanyLogin;
    @BindView(6673)
    public LinearLayout mLlGoogleLogin;
    @BindView(6690)
    public LinearLayout mLlSplite;
    @BindView(6908)
    public LinearLayout mRegisterContentFrame;
    @BindView(7242)
    public TextView mSubTitle;
    @BindView(7202)
    public TextView mTvPolicy;
    @BindView(7327)
    public NoScrollViewPager mViewPager;
    @BindView(6665)
    public ViewGroup mllBottom;

    /* renamed from: n */
    public UDDialog f163574n;

    /* renamed from: o */
    protected CountryBean f163575o;

    /* renamed from: p */
    protected BaseUiContainer f163576p;

    /* renamed from: q */
    private AbstractC64902a f163577q;

    /* renamed from: r */
    private List<View> f163578r;

    /* renamed from: s */
    private C65296c f163579s;

    /* renamed from: t */
    private AbstractC49339b f163580t;
    @BindView(7184)
    public AppCompatTextView tvChangeLanguage;
    @BindView(7197)
    public TextView tvLoginPolicy;
    @BindView(7205)
    public TextView tvRegister;
    @BindView(7210)
    public TextView tvSplit;
    @BindView(7246)
    public TextView tvTitle;

    /* renamed from: u */
    private final AbstractC65288b.AbstractC65289a f163581u = new AbstractC65288b.AbstractC65289a() {
        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.C648931 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65289a
        /* renamed from: a */
        public void mo223887a() {
        }
    };

    /* renamed from: v */
    private final AbstractC65288b.AbstractC65293e f163582v = new AbstractC65288b.AbstractC65293e() {
        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass12 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65293e
        public void onInputPhoneChanged(String str, String str2) {
        }
    };

    /* renamed from: w */
    private final AbstractC65288b.AbstractC65290b f163583w = new AbstractC65288b.AbstractC65290b() {
        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass16 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65290b
        public void onInputEmailChanged(String str) {
            LoginRegisterBaseView.this.mBtnNext.setEnabled(LoginRegisterBaseView.this.f163564d.mo223906a(str));
        }
    };

    /* renamed from: x */
    private final AbstractC65288b.AbstractC65292d f163584x = new AbstractC65288b.AbstractC65292d() {
        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass17 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65292d
        /* renamed from: a */
        public void mo222966a() {
            LoginRegisterBaseView.this.mBtnNext.performClick();
        }
    };

    /* access modifiers changed from: protected */
    public enum PageType {
        LOGIN,
        REGISTER,
        SIMPLIFY
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView$a */
    public interface AbstractC64902a {
        /* renamed from: a */
        void mo223866a(LoginRegisterBaseView loginRegisterBaseView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo223861f();

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163569i;
    }

    /* renamed from: a */
    public void mo223879a(Runnable runnable) {
        this.f123085b.mo171465b("n_action_login_input_policy", "show dialog");
        new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass10 */

            public void onClick(View view) {
                if (LoginRegisterBaseView.this.f163574n != null && LoginRegisterBaseView.this.f163574n.isShowing()) {
                    LoginRegisterBaseView.this.f163574n.dismiss();
                }
            }
        };
        View inflate = LayoutInflater.from(this.f163563c).inflate(R.layout.signin_sdk_register_dialog_content, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.lkui_dialog_content_message_tv);
        if (textView != null) {
            textView.setText(new PrivacyPolicyUtils.Builder(this.f163563c, (int) R.string.Lark_Login_V3_AgreePolicyTip, IDomainService.UrlUnitType.HOST_UNIT).mo224486a(new Function1<PrivacyPolicyUtils.PolicyType, Unit>() {
                /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass11 */

                /* renamed from: a */
                public Unit invoke(PrivacyPolicyUtils.PolicyType policyType) {
                    if (LoginRegisterBaseView.this.f163574n == null || !LoginRegisterBaseView.this.f163574n.isShowing()) {
                        return null;
                    }
                    LoginRegisterBaseView.this.f163574n.dismiss();
                    return null;
                }
            }).mo224487a());
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
        UDDialogBuilder eVar = new UDDialogBuilder(this.f163563c);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(R.string.Lark_Login_V3_AgreePolicyTitle)).titleBold(true)).contentLayout(inflate)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Login_V3_PolicyAlertCancel, new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.$$Lambda$LoginRegisterBaseView$BFBGrX2f4S1nF5SVCZCwdRhIPtU */

            public final void onClick(DialogInterface dialogInterface, int i) {
                LoginRegisterBaseView.this.m254848a(dialogInterface, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Login_V3_PolicyAlertAgree, new DialogInterface.OnClickListener(runnable) {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.$$Lambda$LoginRegisterBaseView$ZOtj4cNmYBv3bT4m4JSgf9YepLE */
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                LoginRegisterBaseView.this.m254849a(this.f$1, dialogInterface, i);
            }
        });
        UDDialog build = eVar.build();
        this.f163574n = build;
        build.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo223881h() {
        return this.checkBoxPolicy.isChecked();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163564d = null;
        this.f163577q = null;
        ServiceFinder.m193752g().removeLocaleSelectListener(this.f163580t);
    }

    /* renamed from: l */
    public void mo223885l() {
        Activity activity = this.f163563c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    /* renamed from: m */
    public void mo223886m() {
        Activity activity = this.f163563c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: i */
    public void mo223882i() {
        LoginStatisticsHelper.m254803e();
        C49092f.m193532a(this.f163563c, "idp_login_page", new JSONObject(), RouterScene.ALL.value, mo171187c(), this.f123085b, (AbstractC49336a) null);
    }

    /* renamed from: k */
    public void mo223884k() {
        if (C49203q.m193977c(this.f163563c)) {
            this.f123085b.mo171465b("n_page_login_input_start", "keyboardControl : showing");
            C49148ac.m193807a(new Runnable() {
                /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass15 */

                public void run() {
                    C49203q.m193972a(LoginRegisterBaseView.this.f163563c);
                }
            }, 100);
        }
    }

    /* renamed from: n */
    private void m254853n() {
        this.f163566f = ((FragmentActivity) this.f163563c).getSupportFragmentManager();
        if (this.f163567g == null) {
            C64720c a = C64720c.m254225a();
            this.f163567g = a;
            a.mo223574a(new AbstractC64744h.AbstractC64745a() {
                /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass13 */

                @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64745a
                public void onCountrySelect(CountryBean countryBean) {
                    if (!Objects.equals(LoginRegisterBaseView.this.f163570j.getCountryInfo(), countryBean)) {
                        LoginRegisterBaseView.this.f163570j.mo224605d();
                    }
                    LoginRegisterBaseView.this.f163575o = countryBean;
                    LoginRegisterBaseView.this.f163570j.mo224604a(countryBean);
                    LoginRegisterBaseView.this.mo223884k();
                }
            });
            this.f163567g.mo223575a(new AbstractC64744h.AbstractC64746b() {
                /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass14 */

                @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64746b
                public void onPageClose() {
                    LoginRegisterBaseView.this.f163567g.mo223576b();
                    LoginRegisterBaseView.this.f163570j.setCursorVisibility(true);
                    LoginRegisterBaseView.this.mo223884k();
                }
            });
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f163577q.mo223866a(this);
        mo223859d();
    }

    /* renamed from: j */
    public void mo223883j() {
        String str;
        if (this.f163564d == null) {
            this.f123085b.mo171471d("n_action_login_input_next", "empty view delegate");
            return;
        }
        WatcherHelper.m193664a(this.f163569i, C40654u.f103178a);
        if (this.f163564d.mo223907b() == 2) {
            str = this.f163571k.getMail();
        } else {
            str = this.f163570j.getPhoneNum();
        }
        this.f163564d.mo223909c(str);
        C64291a.m252805a(mo223862g());
    }

    /* renamed from: g */
    private LoginUserInputV2 mo223862g() {
        LoginUserInputV2 loginUserInputV2 = new LoginUserInputV2();
        loginUserInputV2.setMode(this.f163564d.mo223907b());
        if (this.f163564d.mo223907b() == 2) {
            loginUserInputV2.setContent(this.f163571k.getMail());
            loginUserInputV2.setCp(this.f163571k.getMail());
        } else if (this.f163564d.mo223907b() == 1) {
            loginUserInputV2.setContent(this.f163570j.getSimplePhoneNum());
            loginUserInputV2.setCp(this.f163570j.getPhoneNum());
            CountryBean countryBean = this.f163575o;
            if (countryBean != null) {
                loginUserInputV2.setCountryCode(countryBean.getKey());
            }
        }
        return loginUserInputV2;
    }

    /* renamed from: e */
    private void mo223860e() {
        int i;
        int i2;
        int i3;
        GetPassportConfigData.ConfigBean e = PassportConfigCenter.f123034a.mo171114e();
        boolean c = C49121a.m193727a().mo171509c(3);
        PassportLog passportLog = this.f123085b;
        passportLog.mo171465b("n_action_login_input_idp", " Show C Idp：" + c);
        int i4 = 0;
        if (e == null || e.idpSwitchData == null) {
            this.f123085b.mo171465b("n_action_login_input_idp", " data or idpSwitchData is null");
        } else {
            LinearLayout linearLayout = this.mLlAppleLogin;
            if (!e.idpSwitchData.isEnableAppleId() || !c) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
            LinearLayout linearLayout2 = this.mLlGoogleLogin;
            if (!e.idpSwitchData.isEnableGoogle() || !c) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            linearLayout2.setVisibility(i3);
            PassportLog passportLog2 = this.f123085b;
            passportLog2.mo171465b("n_action_login_input_idp", " (data.idpSwitchData.isEnableGoogle() = " + e.idpSwitchData.isEnableGoogle());
        }
        boolean c2 = C49121a.m193727a().mo171509c(2);
        LinearLayout linearLayout3 = this.mLlCompanyLogin;
        if (c2) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout3.setVisibility(i);
        boolean c3 = C49121a.m193727a().mo171509c(5);
        LinearLayout linearLayout4 = this.mLlSplite;
        if ((!mo223861f() || !c3) && !c && !c2) {
            i4 = 8;
        }
        linearLayout4.setVisibility(i4);
    }

    /* renamed from: d */
    private void mo223859d() {
        this.f163578r = new ArrayList();
        if (!ServiceFinder.m193748c().isLarkPackage()) {
            this.mFeishuTitleTab.setVisibility(0);
            this.mLarkTitleTab.setVisibility(8);
            this.f163572l = (InputTabView) this.f163563c.findViewById(R.id.tab_phone_feishu);
            this.f163573m = (InputTabView) this.f163563c.findViewById(R.id.tab_mail_feishu);
        } else {
            this.mFeishuTitleTab.setVisibility(8);
            this.mLarkTitleTab.setVisibility(0);
            this.f163572l = (InputTabView) this.f163563c.findViewById(R.id.tab_phone_lark);
            this.f163573m = (InputTabView) this.f163563c.findViewById(R.id.tab_mail_lark);
        }
        this.f163570j = new PhoneInput(this.f163563c);
        this.f163571k = new MailInput(this.f163563c);
        this.f163578r.add(0, this.f163570j);
        this.f163578r.add(1, this.f163571k);
        C65296c cVar = new C65296c(this.f163578r);
        this.f163579s = cVar;
        this.mViewPager.setAdapter(cVar);
        this.mViewPager.addOnPageChangeListener(new ViewPager.C1581f() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass18 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                PassportLog passportLog = LoginRegisterBaseView.this.f123085b;
                passportLog.mo171465b("n_action_login_input_change_cp_type", "position = " + i);
            }
        });
        this.mBtnNext.setEnabled(false);
        m254853n();
        this.checkBoxPolicy.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass19 */

            public void onClick(View view) {
                LoginStatisticsHelper.m254806h();
                LoginRegisterBaseView.this.f123085b.mo171465b("n_action_login_input_policy", "click");
            }
        });
        this.f163570j.setOnInputPhoneChangeListener(this.f163582v);
        this.f163570j.setOnRegionSelectedListener(new PhoneInput.AbstractC65287b() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass20 */

            @Override // com.ss.lark.android.passport.biz.widget.PhoneInput.AbstractC65287b
            public void onRegionSelect() {
                boolean z;
                Throwable th;
                if (!LoginRegisterBaseView.this.f163565e) {
                    LoginRegisterBaseView.this.f123085b.mo171465b("n_action_login_input_change_region_code", "PhoneInput onRegionSelect but not enable");
                    return;
                }
                PassportLog passportLog = LoginRegisterBaseView.this.f123085b;
                passportLog.mo171465b("n_action_login_input_change_region_code", "PhoneInput onRegionSelect " + LoginRegisterBaseView.this.f163570j.getRegionCode());
                if (C49203q.m193977c(LoginRegisterBaseView.this.f163563c)) {
                    C49203q.m193973a((Context) LoginRegisterBaseView.this.f163563c);
                }
                try {
                    FragmentTransaction beginTransaction = LoginRegisterBaseView.this.f163566f.beginTransaction();
                    beginTransaction.setCustomAnimations(R.anim.signin_sdk_translate_from_bottom, R.anim.signin_sdk_translate_to_bottom);
                    if (LoginRegisterBaseView.this.f163567g.isAdded() || LoginRegisterBaseView.this.f163566f.findFragmentByTag("CountrySelectFragment") != null) {
                        beginTransaction.show(LoginRegisterBaseView.this.f163567g);
                        LoginRegisterBaseView.this.f163567g.mo223577c();
                    } else {
                        z = true;
                        try {
                            beginTransaction.add(LoginRegisterBaseView.this.f163576p.f162613b.getId(), LoginRegisterBaseView.this.f163567g, "CountrySelectFragment");
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    beginTransaction.commitAllowingStateLoss();
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                    PassportLog passportLog2 = LoginRegisterBaseView.this.f123085b;
                    passportLog2.mo171462a("n_action_login_input_change_region_code", "commit mCountrySelectFragment error, isAdd: " + z, th);
                    LoginRegisterBaseView.this.f163570j.setCursorVisibility(false);
                }
                LoginRegisterBaseView.this.f163570j.setCursorVisibility(false);
            }
        });
        this.f163570j.setOnKeyboardDetectorListener(this.f163584x);
        this.f163570j.setOnInputCompleteListener(this.f163581u);
        this.f163570j.setInputEnabledChangeListener(new AbstractC65288b.AbstractC65291c() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass21 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65291c
            /* renamed from: a */
            public void mo223896a(boolean z) {
                LoginRegisterBaseView.this.mBtnNext.setEnabled(z);
            }
        });
        this.f163570j.setRegionCodeListener(new PhoneInput.AbstractC65286a() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.AnonymousClass22 */

            @Override // com.ss.lark.android.passport.biz.widget.PhoneInput.AbstractC65286a
            /* renamed from: a */
            public void mo223897a(String str) {
                if (LoginRegisterBaseView.this.f163564d != null) {
                    LoginRegisterBaseView.this.f163564d.mo223908b(str);
                }
            }
        });
        this.f163571k.setOnInputEmailChangeListener(this.f163583w);
        this.f163571k.setOnKeyboardDetectorListener(this.f163584x);
        ak.m193850a(this.mBtnNext, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.View$OnClickListenerC648942 */

            public void onClick(View view) {
                if (!LoginRegisterBaseView.this.mo223881h()) {
                    LoginRegisterBaseView loginRegisterBaseView = LoginRegisterBaseView.this;
                    loginRegisterBaseView.mo223879a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.$$Lambda$LoginRegisterBaseView$2$pSQ27Ca73Xe3wZPLM1FtfIliLs */

                        public final void run() {
                            LoginRegisterBaseView.this.mo223883j();
                        }
                    });
                    return;
                }
                LoginRegisterBaseView.this.mo223883j();
            }
        });
        this.f163571k.setOnInputCompleteListener(this.f163581u);
        this.ivBack.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.View$OnClickListenerC648953 */

            public void onClick(View view) {
                LoginRegisterBaseView.this.mo223875a(view);
            }
        });
        ak.m193850a(this.tvChangeLanguage, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.View$OnClickListenerC648964 */

            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("fromLogin", true);
                ServiceFinder.m193752g().openLanguageSettingPage(LoginRegisterBaseView.this.f163563c, bundle);
                LoginRegisterBaseView.this.f123085b.mo171460a("n_action_login_input_lang");
            }
        });
        C64574a.m253733a(this.tvChangeLanguage);
        this.f163580t = new AbstractC49339b() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.C648975 */

            @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b
            /* renamed from: a */
            public void mo172130a(Locale locale) {
                if (LoginRegisterBaseView.this.f163564d != null) {
                    C64291a.m252804a(LoginRegisterBaseView.this.f163564d.mo223907b());
                    C49032c.m193132a().mo171198c();
                }
            }
        };
        ServiceFinder.m193752g().addLocaleSelectListener(this.f163580t);
        new PrivacyPolicyUtils.TextViewBuilder(this.mTvPolicy, (int) R.string.Lark_Login_V3_registerNextStepPolicyTip, IDomainService.UrlUnitType.HOST_UNIT).mo224495b();
        new PrivacyPolicyUtils.TextViewBuilder(this.tvLoginPolicy, (int) R.string.Lark_Login_V3_loginNextStepPolicyTip, IDomainService.UrlUnitType.HOST_UNIT).mo224495b();
        ak.m193850a(this.mLlAppleLogin, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.View$OnClickListenerC648986 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m254879a() {
                LoginRegisterBaseView.this.f163564d.mo223905a(AuthChannelEnum.TYPE_APPLE);
            }

            public void onClick(View view) {
                LoginStatisticsHelper.m254804f();
                LoginRegisterBaseView.this.f123085b.mo171465b("n_action_login_input_idp", "Apple Login Click");
                WatcherHelper.m193664a(LoginRegisterBaseView.this.f163569i, C40654u.f103203z);
                HashMap hashMap = new HashMap();
                hashMap.put("channel", AuthChannelEnum.TYPE_APPLE.value());
                LoginRegisterBaseView.this.f123085b.mo171467b("n_action_login_c_idp", "apple login clicked", hashMap);
                if (!LoginRegisterBaseView.this.mo223881h()) {
                    LoginRegisterBaseView.this.mo223879a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.$$Lambda$LoginRegisterBaseView$6$ulmJy8QkeY0tHAolOokkBY3nBRE */

                        public final void run() {
                            LoginRegisterBaseView.View$OnClickListenerC648986.this.m254879a();
                        }
                    });
                } else {
                    LoginRegisterBaseView.this.f163564d.mo223905a(AuthChannelEnum.TYPE_APPLE);
                }
            }
        });
        ak.m193850a(this.mLlGoogleLogin, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.View$OnClickListenerC648997 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m254880a() {
                LoginRegisterBaseView.this.f163564d.mo223905a(AuthChannelEnum.TYPE_GOOGLE);
            }

            public void onClick(View view) {
                LoginStatisticsHelper.m254805g();
                LoginRegisterBaseView.this.f123085b.mo171465b("n_action_login_input_idp", "Google Login Click");
                WatcherHelper.m193664a(LoginRegisterBaseView.this.f163569i, C40654u.f103202y);
                HashMap hashMap = new HashMap();
                hashMap.put("channel", AuthChannelEnum.TYPE_GOOGLE.value());
                LoginRegisterBaseView.this.f123085b.mo171467b("n_action_login_c_idp", "google login clicked", hashMap);
                if (!LoginRegisterBaseView.this.mo223881h()) {
                    LoginRegisterBaseView.this.mo223879a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.$$Lambda$LoginRegisterBaseView$7$9XiDE93MBAu7yHlYrOB5rcjdtuA */

                        public final void run() {
                            LoginRegisterBaseView.View$OnClickListenerC648997.this.m254880a();
                        }
                    });
                } else {
                    LoginRegisterBaseView.this.f163564d.mo223905a(AuthChannelEnum.TYPE_GOOGLE);
                }
            }
        });
        ak.m193850a(this.mLlCompanyLogin, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.View$OnClickListenerC649008 */

            public void onClick(View view) {
                LoginRegisterBaseView.this.f123085b.mo171465b("n_action_login_input_idp", "SSO Click");
                if (!LoginRegisterBaseView.this.mo223881h()) {
                    LoginRegisterBaseView loginRegisterBaseView = LoginRegisterBaseView.this;
                    loginRegisterBaseView.mo223879a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.$$Lambda$LoginRegisterBaseView$8$weWFCcLV1CuRzL6L9sLhb5Zsmzk */

                        public final void run() {
                            LoginRegisterBaseView.this.mo223882i();
                        }
                    });
                    return;
                }
                LoginRegisterBaseView.this.mo223882i();
            }
        });
        mo223860e();
        View$OnClickListenerC649019 r0 = new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView.View$OnClickListenerC649019 */

            public void onClick(View view) {
                LoginRegisterBaseView.this.f163564d.mo223904a();
                LoginRegisterBaseView loginRegisterBaseView = LoginRegisterBaseView.this;
                loginRegisterBaseView.mo223874a(loginRegisterBaseView.f163564d.mo223907b());
            }
        };
        ak.m193850a(this.f163572l, r0);
        ak.m193850a(this.f163573m, r0);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163569i = uniContext;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo223875a(View view) {
        this.f163563c.finish();
    }

    /* renamed from: a */
    public void mo223874a(int i) {
        if (i == 2) {
            this.f163571k.mo224571d();
            this.f163571k.mo224572e();
            return;
        }
        this.f163570j.mo224606e();
        this.f163570j.mo224608g();
    }

    /* renamed from: b */
    public void mo223880b(int i) {
        if (i == 2) {
            LoginStatisticsHelper.m254802d();
            this.f163573m.setChooseed(true);
            this.f163572l.setChooseed(false);
            this.mViewPager.setCurrentItem(1);
            this.mBtnNext.setEnabled(this.f163564d.mo223906a(this.f163571k.getMail()));
        } else if (i == 1) {
            LoginStatisticsHelper.m254801c();
            this.f163570j.mo224607f();
            this.f163572l.setChooseed(true);
            this.f163573m.setChooseed(false);
            this.mViewPager.setCurrentItem(0);
            this.mBtnNext.setEnabled(this.f163570j.mo224614h());
        }
    }

    /* renamed from: a */
    public void mo223876a(CountryBean countryBean) {
        this.f163575o = countryBean;
        this.f163570j.mo224604a(countryBean);
    }

    /* renamed from: a */
    public void mo223877a(BaseUiContainer aVar) {
        this.f163576p = aVar;
    }

    /* renamed from: a */
    public void mo171188a(C64903a.AbstractC64905b.AbstractC64906a aVar) {
        this.f163564d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m254848a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f123085b.mo171465b("n_action_login_input_policy", "checked canceled on dialog");
    }

    public LoginRegisterBaseView(Activity activity, AbstractC64902a aVar) {
        this.f163563c = activity;
        this.f163577q = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m254849a(Runnable runnable, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        runnable.run();
        this.checkBoxPolicy.setChecked(true);
        this.f123085b.mo171465b("n_action_login_input_policy", "checked on dialog");
    }
}
