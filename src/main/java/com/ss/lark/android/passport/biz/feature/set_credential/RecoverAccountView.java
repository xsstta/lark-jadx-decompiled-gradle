package com.ss.lark.android.passport.biz.feature.set_credential;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.feature.auth_type.ContactPointTypeEnum;
import com.ss.lark.android.passport.biz.feature.country.AbstractC64744h;
import com.ss.lark.android.passport.biz.feature.country.CountrySelectManager;
import com.ss.lark.android.passport.biz.feature.country.CountrySelectParams;
import com.ss.lark.android.passport.biz.feature.set_credential.C64996a;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.MailInput;
import com.ss.lark.android.passport.biz.widget.PhoneInput;
import java.util.List;
import java.util.Objects;

public class RecoverAccountView extends AbstractC49023c<C64996a.AbstractC64999c> implements C64996a.AbstractC64998b {

    /* renamed from: i */
    private static final boolean f163727i = PassportConfigHelper.m193027i();

    /* renamed from: c */
    public final Activity f163728c;

    /* renamed from: d */
    public C64996a.AbstractC64999c f163729d;

    /* renamed from: e */
    public boolean f163730e;

    /* renamed from: f */
    public CountrySelectManager f163731f;

    /* renamed from: g */
    public final CommonUiContainer f163732g;

    /* renamed from: h */
    private AbstractC64995a f163733h;

    /* renamed from: j */
    private final AbstractC65288b.AbstractC65290b f163734j = new AbstractC65288b.AbstractC65290b() {
        /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.C649861 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65290b
        public void onInputEmailChanged(String str) {
            if (!TextUtils.isEmpty(RecoverAccountView.this.mMailInput.getMail())) {
                RecoverAccountView.this.f163732g.mo222876a(RecoverAccountView.this.f163729d.mo224044a(str));
            } else {
                RecoverAccountView.this.f163732g.mo222876a(false);
            }
        }
    };

    /* renamed from: k */
    private final AbstractC65288b.AbstractC65293e f163735k = new AbstractC65288b.AbstractC65293e() {
        /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.C649872 */

        @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65293e
        public void onInputPhoneChanged(String str, String str2) {
            if (TextUtils.isEmpty(RecoverAccountView.this.mPhoneInput.getSimplePhoneNum()) || !RecoverAccountView.this.mPhoneInput.mo224614h()) {
                RecoverAccountView.this.f163732g.mo222876a(false);
            } else {
                RecoverAccountView.this.f163732g.mo222876a(RecoverAccountView.this.f163729d.mo224045a(str, str2));
            }
        }
    };
    @BindView(6735)
    public MailInput mMailInput;
    @BindView(6863)
    public PhoneInput mPhoneInput;

    /* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView$a */
    public interface AbstractC64995a {
        /* renamed from: a */
        void mo224042a();

        /* renamed from: a */
        void mo224043a(RecoverAccountView recoverAccountView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163729d = null;
        this.f163733h = null;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64998b
    /* renamed from: d */
    public void mo224038d() {
        AbstractC64995a aVar = this.f163733h;
        if (aVar != null) {
            aVar.mo224042a();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f163733h.mo224043a(this);
        m255159e();
    }

    /* renamed from: e */
    private void m255159e() {
        this.f163732g.mo222876a(false);
        this.f163732g.mo222881c(R.string.Lark_Passport_CP_ModifyBtnTxt);
        this.mPhoneInput.mo224606e();
        this.mPhoneInput.setOnInputPhoneChangeListener(this.f163735k);
        this.mMailInput.setOnInputEmailChangeListener(this.f163734j);
        this.mPhoneInput.setChangeCountryCodeEnable(f163727i);
        this.mPhoneInput.setRegionCodeListener(new PhoneInput.AbstractC65286a() {
            /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.C649883 */

            @Override // com.ss.lark.android.passport.biz.widget.PhoneInput.AbstractC65286a
            /* renamed from: a */
            public void mo223897a(String str) {
                if (RecoverAccountView.this.f163729d != null) {
                    RecoverAccountView.this.f163729d.mo224046b(str);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo171188a(C64996a.AbstractC64999c cVar) {
        this.f163729d = cVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64998b
    /* renamed from: a */
    public void mo224032a(CountryBean countryBean) {
        this.mPhoneInput.mo224604a(countryBean);
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64998b
    /* renamed from: a */
    public void mo224035a(List<String> list) {
        if (this.f163731f == null) {
            CountrySelectManager dVar = new CountrySelectManager(this.f163732g.f162612a, this.f163732g.f162612a.getSupportFragmentManager(), this.f163732g.f162613b.getId(), new CountrySelectParams(list));
            this.f163731f = dVar;
            dVar.mo223580a(new AbstractC64744h.AbstractC64745a() {
                /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.C649905 */

                @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64745a
                public void onCountrySelect(CountryBean countryBean) {
                    if (!Objects.equals(RecoverAccountView.this.mPhoneInput.getCountryInfo(), countryBean)) {
                        RecoverAccountView.this.mPhoneInput.mo224605d();
                    }
                    RecoverAccountView.this.mPhoneInput.mo224604a(countryBean);
                }
            });
            this.f163731f.mo223581a(new AbstractC64744h.AbstractC64746b() {
                /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.C649916 */

                @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64746b
                public void onPageClose() {
                    RecoverAccountView.this.f163731f.mo223578a();
                    RecoverAccountView.this.mPhoneInput.setCursorVisibility(true);
                    RecoverAccountView recoverAccountView = RecoverAccountView.this;
                    recoverAccountView.mo224037b(recoverAccountView.f163730e);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo224037b(boolean z) {
        if (z) {
            if (!C49203q.m193977c(this.f163728c)) {
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.RunnableC649927 */

                    public void run() {
                        C49203q.m193976b(RecoverAccountView.this.f163728c);
                    }
                }, 100);
            }
        } else if (C49203q.m193977c(this.f163728c)) {
            UICallbackExecutor.executeDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.RunnableC649938 */

                public void run() {
                    C49203q.m193973a((Context) RecoverAccountView.this.f163728c);
                }
            }, 100);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64998b
    /* renamed from: a */
    public void mo224033a(final C64996a.AbstractC64997a aVar) {
        String str;
        this.f163732g.mo222871a((CharSequence) aVar.cs_());
        this.f163732g.mo222879b(aVar.ct_());
        this.f163732g.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.View$OnClickListenerC649949 */

            public void onClick(View view) {
                String str;
                if (aVar.mo224023e() == ContactPointTypeEnum.MAIL.value()) {
                    str = RecoverAccountView.this.mMailInput.getMail();
                } else {
                    str = "";
                }
                if (aVar.mo224023e() == ContactPointTypeEnum.PHONE.value()) {
                    str = RecoverAccountView.this.mPhoneInput.getPhoneNum();
                }
                RecoverAccountView.this.f123085b.mo171465b("n_action_new_credential_next", "next clicked");
                RecoverAccountView.this.f163729d.mo224047c(str);
            }
        });
        if (aVar.cu_() != null) {
            str = aVar.cu_().placeholder;
        } else {
            str = null;
        }
        if (aVar.mo224023e() == ContactPointTypeEnum.PHONE.value()) {
            this.mPhoneInput.setVisibility(0);
            if (!TextUtils.isEmpty(str)) {
                this.mPhoneInput.setPhoneInputHint(str);
            }
            this.mMailInput.setVisibility(8);
            this.mPhoneInput.mo224606e();
        } else if (aVar.mo224023e() == ContactPointTypeEnum.MAIL.value()) {
            this.mPhoneInput.setVisibility(8);
            this.mMailInput.setVisibility(0);
            if (!TextUtils.isEmpty(str)) {
                this.mMailInput.setEmailInputHint(str);
            }
            this.mMailInput.mo224571d();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64998b
    /* renamed from: a */
    public void mo224036a(boolean z) {
        if (z) {
            this.mPhoneInput.setOnRegionSelectedListener(new PhoneInput.AbstractC65287b() {
                /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.C649894 */

                @Override // com.ss.lark.android.passport.biz.widget.PhoneInput.AbstractC65287b
                public void onRegionSelect() {
                    RecoverAccountView recoverAccountView = RecoverAccountView.this;
                    recoverAccountView.f163730e = C49203q.m193977c(recoverAccountView.f163728c);
                    if (RecoverAccountView.this.f163730e) {
                        C49203q.m193973a((Context) RecoverAccountView.this.f163728c);
                    }
                    if (RecoverAccountView.this.f163731f != null) {
                        RecoverAccountView.this.f163731f.mo223583b();
                    }
                    RecoverAccountView.this.mPhoneInput.setCursorVisibility(false);
                }
            });
        } else {
            this.mPhoneInput.setOnRegionSelectedListener(null);
        }
        this.mPhoneInput.setChangeCountryCodeEnable(z);
    }

    public RecoverAccountView(Activity activity, AbstractC64995a aVar, CommonUiContainer commonUiContainer) {
        this.f163728c = activity;
        this.f163733h = aVar;
        this.f163732g = commonUiContainer;
    }
}
