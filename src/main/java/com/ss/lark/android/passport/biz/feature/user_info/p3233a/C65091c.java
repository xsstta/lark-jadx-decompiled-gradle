package com.ss.lark.android.passport.biz.feature.user_info.p3233a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetUserInfoStepInfo;
import com.ss.lark.android.passport.biz.feature.user_info.UserInfoSettingStatisticsHelper;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;
import com.ss.lark.android.passport.biz.widget.MailInput;
import com.ss.lark.android.passport.biz.widget.PhoneInput;
import java.util.Objects;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.c */
public class C65091c {

    /* renamed from: a */
    public String f163914a;

    /* renamed from: b */
    private final PassportLog f163915b = PassportLog.f123351c.mo171474a();

    /* renamed from: c */
    private final SetUserInfoStepInfo f163916c;

    /* renamed from: d */
    private final SetUserInfoStepInfo.CredentialInputItem f163917d;

    /* renamed from: e */
    private final SetUserInfoStepInfo.Input f163918e;

    /* renamed from: f */
    private CountryBean f163919f;

    /* renamed from: g */
    private final UniContext f163920g;

    /* renamed from: h */
    private final PhoneInput f163921h;

    /* renamed from: i */
    private final MailInput f163922i;

    /* renamed from: j */
    private final CommonEditInput f163923j;

    /* renamed from: k */
    private final AbstractC65093a f163924k;

    /* renamed from: l */
    private final AbstractC65094b f163925l;

    /* renamed from: m */
    private int f163926m;

    /* renamed from: n */
    private String f163927n;

    /* renamed from: o */
    private final int f163928o;

    /* renamed from: p */
    private final boolean f163929p;

    /* renamed from: q */
    private final View f163930q;

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.c$a */
    public interface AbstractC65093a {
        /* renamed from: a */
        void mo224257a();

        /* renamed from: a */
        void mo224258a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.c$b */
    public interface AbstractC65094b {
        void onUserInfoChanged(int i, String str, String str2, int i2);
    }

    /* renamed from: a */
    public View mo224251a() {
        return this.f163930q;
    }

    /* renamed from: c */
    public boolean mo224255c() {
        return this.f163921h.mo224614h();
    }

    /* renamed from: d */
    public void mo224256d() {
        AbstractC65094b bVar = this.f163925l;
        if (bVar != null) {
            bVar.onUserInfoChanged(this.f163926m, this.f163927n, this.f163914a, this.f163928o);
        }
    }

    /* renamed from: e */
    private void m255626e() {
        if (this.f163918e != null) {
            this.f163923j.setVisibility(0);
            this.f163923j.setInputHint(this.f163918e.mPlaceholder);
            this.f163923j.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65091c.C650921 */

                @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
                /* renamed from: a */
                public void mo222970a(String str) {
                    C65091c.this.f163914a = str;
                    C65091c.this.mo224256d();
                }
            });
            UniContext uniContext = this.f163920g;
            if (uniContext != null && !TextUtils.isEmpty(uniContext.getCurUserName())) {
                this.f163923j.setContent(this.f163920g.getCurUserName());
            }
        }
    }

    /* renamed from: b */
    public void mo224254b() {
        SetUserInfoStepInfo setUserInfoStepInfo = this.f163916c;
        if (setUserInfoStepInfo != null) {
            int i = this.f163926m;
            if (i == 2) {
                UserInfoSettingStatisticsHelper.m255606a(setUserInfoStepInfo.mFlowType);
            } else if (i == 1) {
                UserInfoSettingStatisticsHelper.m255608b(setUserInfoStepInfo.mFlowType);
            }
        }
    }

    /* renamed from: a */
    public void mo224253a(String str) {
        this.f163923j.setContent(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m255625b(String str) {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            str2 = str.replaceAll(" ", str2);
        }
        this.f163927n = str2;
        mo224256d();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m255624b(Context context) {
        PassportLog passportLog = this.f163915b;
        passportLog.mo171465b("SetUserInfoInputItem", "Register onRegionSelect " + this.f163921h.getRegionCode());
        if (C49203q.m193977c(context)) {
            C49203q.m193973a(context);
        }
        AbstractC65093a aVar = this.f163924k;
        if (aVar != null) {
            aVar.mo224257a();
        }
        this.f163921h.setCursorVisibility(false);
    }

    /* renamed from: a */
    private void m255622a(Context context) {
        SetUserInfoStepInfo.CredentialInputItem credentialInputItem = this.f163917d;
        if (credentialInputItem != null) {
            int i = credentialInputItem.mCredentialType;
            this.f163926m = i;
            if (i == 2) {
                this.f163922i.setVisibility(0);
                this.f163921h.setVisibility(8);
                this.f163922i.mo224570a(2, 16.0f);
                this.f163922i.setOnInputEmailChangeListener(new AbstractC65288b.AbstractC65290b() {
                    /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$c$eW2sVkhMTIqB8HDCVsgM2_21uuc */

                    @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65290b
                    public final void onInputEmailChanged(String str) {
                        C65091c.this.m255625b((C65091c) str);
                    }
                });
                if (this.f163917d.mCredentialInput != null) {
                    this.f163922i.setEmailInputHint(this.f163917d.mCredentialInput.mPlaceholder);
                }
                UniContext uniContext = this.f163920g;
                if (uniContext != null && !TextUtils.isEmpty(uniContext.getCurLoginEmail())) {
                    this.f163922i.setContactPoint(this.f163920g.getCurLoginEmail());
                }
            } else if (i == 1) {
                this.f163922i.setVisibility(8);
                this.f163921h.setVisibility(0);
                this.f163921h.mo224603a(2, 16.0f);
                this.f163921h.setChangeCountryCodeEnable(this.f163929p);
                String str = null;
                if (this.f163929p) {
                    this.f163921h.setOnRegionSelectedListener(new PhoneInput.AbstractC65287b(context) {
                        /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$c$3jF1GLg_QyTPwuaxNIW92KKgBik */
                        public final /* synthetic */ Context f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.lark.android.passport.biz.widget.PhoneInput.AbstractC65287b
                        public final void onRegionSelect() {
                            C65091c.this.m255624b((C65091c) this.f$1);
                        }
                    });
                } else {
                    this.f163921h.setOnRegionSelectedListener(null);
                }
                this.f163921h.setOnInputPhoneChangeListener(new AbstractC65288b.AbstractC65293e() {
                    /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$c$8LXggdKc7IxbhF4u_ODdm_afKZs */

                    @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65293e
                    public final void onInputPhoneChanged(String str, String str2) {
                        C65091c.this.m255623a((C65091c) str, str2);
                    }
                });
                if (this.f163917d.mCredentialInput != null) {
                    this.f163921h.setPhoneInputHint(this.f163917d.mCredentialInput.mPlaceholder);
                }
                UniContext uniContext2 = this.f163920g;
                if (uniContext2 != null && !TextUtils.isEmpty(uniContext2.getCurLoginPhone()) && (this.f163929p || TextUtils.equals(this.f163920g.getCurCountryCode(), "+86"))) {
                    this.f163921h.setSimplePhoneNum(this.f163920g.getCurLoginPhone());
                    str = this.f163920g.getCurCountryCode();
                }
                AbstractC65093a aVar = this.f163924k;
                if (aVar != null) {
                    aVar.mo224258a(str);
                }
            }
        } else {
            this.f163922i.setVisibility(8);
            this.f163921h.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m255623a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str2.trim())) {
            this.f163927n = "";
        } else {
            this.f163927n = TextUtils.concat("+", str, str2).toString().replaceAll(" ", "");
        }
        mo224256d();
    }

    /* renamed from: a */
    public void mo224252a(CountryBean countryBean, boolean z) {
        this.f163919f = countryBean;
        if (this.f163921h.getVisibility() == 0) {
            if (z && !Objects.equals(this.f163921h.getCountryInfo(), countryBean) && !countryBean.getCode().equals("+86")) {
                this.f163921h.mo224605d();
            }
            this.f163921h.mo224604a(this.f163919f);
            this.f163921h.setCursorVisibility(true);
        }
    }

    public C65091c(Bundle bundle, Context context, UniContext uniContext, ViewGroup viewGroup, AbstractC65093a aVar, AbstractC65094b bVar) {
        this.f163916c = (SetUserInfoStepInfo) bundle.getSerializable("step_info");
        this.f163917d = (SetUserInfoStepInfo.CredentialInputItem) bundle.getSerializable("cp_item");
        this.f163918e = (SetUserInfoStepInfo.Input) bundle.getSerializable("name_input");
        this.f163919f = (CountryBean) bundle.getSerializable("country_bean");
        this.f163914a = bundle.getString("name_value");
        this.f163927n = bundle.getString("vp_value");
        this.f163928o = bundle.getInt("position");
        this.f163929p = bundle.getBoolean("enable_change_region_code");
        this.f163920g = uniContext;
        this.f163924k = aVar;
        this.f163925l = bVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.signin_sdk_user_info_input_item, viewGroup, false);
        this.f163930q = inflate;
        this.f163921h = (PhoneInput) inflate.findViewById(R.id.phone_input);
        this.f163922i = (MailInput) inflate.findViewById(R.id.mail_input);
        CommonEditInput commonEditInput = (CommonEditInput) inflate.findViewById(R.id.name_input_layout);
        this.f163923j = commonEditInput;
        commonEditInput.mo224507a();
        m255622a(context);
        m255626e();
    }
}
