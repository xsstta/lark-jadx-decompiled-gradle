package com.ss.lark.android.passport.biz.feature.set_credential;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.lark.android.passport.biz.feature.set_credential.C64996a;
import com.ss.lark.android.passport.biz.feature.set_credential.C65002c;
import com.ss.lark.android.passport.biz.utils.C65243a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.c */
public class C65002c extends AbstractC49021b<C64996a.AbstractC64997a, C64996a.AbstractC64998b, C64996a.AbstractC64999c> {

    /* renamed from: d */
    public final Context f163752d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64996a.AbstractC64999c mo171180c() {
        return new C65007a();
    }

    /* renamed from: i */
    public void mo224051i() {
        C65243a.m256125a(this.f163752d, this.f123081c, new AbstractC49352d<CountryBean>() {
            /* class com.ss.lark.android.passport.biz.feature.set_credential.C65002c.C650042 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C65002c.this.f123081c;
                passportLog.mo171471d("n_page_new_credential_start", "get country info failed:" + networkErrorResult.toString());
            }

            /* renamed from: a */
            public void mo145179a(final CountryBean countryBean) {
                if (countryBean == null) {
                    C65002c.this.f123081c.mo171471d("n_page_new_credential_start", "local default country not found");
                } else {
                    PassportLog passportLog = C65002c.this.f123081c;
                    passportLog.mo171465b("n_page_new_credential_start", "local default country loaded: " + countryBean.getKey());
                }
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.lark.android.passport.biz.feature.set_credential.C65002c.C650042.RunnableC650051 */

                    public void run() {
                        ((C64996a.AbstractC64998b) C65002c.this.mo171181d()).mo224032a(countryBean);
                    }
                });
            }
        });
    }

    /* renamed from: h */
    public void mo224050h() {
        PassportLog passportLog = this.f123081c;
        passportLog.mo171465b("n_page_new_credential_start", "original code: " + ((C64996a.AbstractC64997a) mo171182e()).mo224024g());
        if (TextUtils.isEmpty(((C64996a.AbstractC64997a) mo171182e()).mo224024g())) {
            mo224051i();
        } else {
            C65243a.m256126a(this.f163752d, ((C64996a.AbstractC64997a) mo171182e()).mo224024g(), new AbstractC49352d<CountryBean>() {
                /* class com.ss.lark.android.passport.biz.feature.set_credential.C65002c.C650031 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C65002c.this.f123081c.mo171471d("n_page_new_credential_start", "search original code failed, code: " + ((C64996a.AbstractC64997a) C65002c.this.mo171182e()).mo224024g());
                    C65002c.this.mo224051i();
                }

                /* renamed from: a */
                public void mo145179a(CountryBean countryBean) {
                    ((C64996a.AbstractC64998b) C65002c.this.mo171181d()).mo224032a(countryBean);
                    if (countryBean == null) {
                        PassportLog passportLog = C65002c.this.f123081c;
                        passportLog.mo171471d("n_page_new_credential_start", "country not found, original code: " + ((C64996a.AbstractC64997a) C65002c.this.mo171182e()).cu_());
                        return;
                    }
                    PassportLog passportLog2 = C65002c.this.f123081c;
                    passportLog2.mo171465b("n_page_new_credential_start", "found country: " + countryBean.getKey() + " by original code: " + ((C64996a.AbstractC64997a) C65002c.this.mo171182e()).cu_());
                }
            });
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64996a.AbstractC64998b) mo171181d()).mo224033a((C64996a.AbstractC64997a) mo171182e());
        String h = ((C64996a.AbstractC64997a) mo171182e()).mo224025h();
        boolean isCnEnv = ServiceFinder.m193749d().isCnEnv(h);
        boolean equals = "86".equals(((C64996a.AbstractC64997a) mo171182e()).mo224024g());
        PassportLog passportLog = this.f123081c;
        passportLog.mo171465b("n_page_new_credential_start", "identityUnit: " + h + ", code: " + ((C64996a.AbstractC64997a) mo171182e()).mo224024g());
        if (!isCnEnv || !equals) {
            if (isCnEnv) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(((C64996a.AbstractC64997a) mo171182e()).mo224024g());
                arrayList.add("86");
                ((C64996a.AbstractC64998b) mo171181d()).mo224035a(arrayList);
                PassportLog passportLog2 = this.f123081c;
                passportLog2.mo171465b("n_page_new_credential_start", "cn identity but not cn code, availableCodes: " + TextUtils.join(",", arrayList));
            } else {
                ((C64996a.AbstractC64998b) mo171181d()).mo224035a((List<String>) null);
                this.f123081c.mo171465b("n_page_new_credential_start", "cn code but not cn identity");
            }
            ((C64996a.AbstractC64998b) mo171181d()).mo224036a(true);
        } else {
            ((C64996a.AbstractC64998b) mo171181d()).mo224036a(false);
            this.f123081c.mo171465b("n_page_new_credential_start", "cn code and cn identity");
        }
        mo224050h();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.c$a */
    public class C65007a implements C64996a.AbstractC64999c {
        public C65007a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64999c
        /* renamed from: a */
        public boolean mo224044a(String str) {
            return str.matches(".+@.+");
        }

        @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64999c
        /* renamed from: c */
        public void mo224047c(String str) {
            C65002c.this.mo224048a(str);
        }

        @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64999c
        /* renamed from: b */
        public void mo224046b(String str) {
            C65243a.m256126a(C65002c.this.f163752d, str, new AbstractC49352d<CountryBean>() {
                /* class com.ss.lark.android.passport.biz.feature.set_credential.C65002c.C65007a.C650081 */

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: b */
                private /* synthetic */ void m255208b(CountryBean countryBean) {
                    ((C64996a.AbstractC64998b) C65002c.this.mo171181d()).mo224032a(countryBean);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    PassportLog passportLog = C65002c.this.f123081c;
                    passportLog.mo171471d("RecoverAccountPresenter", "search region code failed:" + networkErrorResult.toString());
                }

                /* renamed from: a */
                public void mo145179a(CountryBean countryBean) {
                    if (countryBean != null) {
                        C65243a.m256128a(countryBean.getKey());
                        PassportLog passportLog = C65002c.this.f123081c;
                        passportLog.mo171465b("n_page_new_credential", "country selected: " + countryBean.getKey());
                    }
                    UICallbackExecutor.execute(new Runnable(countryBean) {
                        /* class com.ss.lark.android.passport.biz.feature.set_credential.$$Lambda$c$a$1$jMZ5jzu7L1272QnMiLQ2KRY9X8U */
                        public final /* synthetic */ CountryBean f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C65002c.C65007a.C650081.this.m255208b(this.f$1);
                        }
                    });
                }
            });
        }

        @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64999c
        /* renamed from: a */
        public boolean mo224045a(String str, String str2) {
            if (C57782ag.m224241a(str) || C57782ag.m224241a(str2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo224048a(String str) {
        this.f123081c.mo171465b("n_action_new_credential_next_req", "set new credential req start");
        ((C64996a.AbstractC64997a) mo171182e()).mo224019a(str, new AbstractC49352d<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.set_credential.C65002c.C650063 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C65002c.this.f123081c;
                passportLog.mo171471d("n_action_new_credential_fail", "set new credential failed, error" + networkErrorResult);
            }

            /* renamed from: a */
            public void mo145179a(BaseStepData baseStepData) {
                C49092f.m193529a(C65002c.this.f163752d, baseStepData, RouterScene.ALL.value, C65002c.this.f123080b, C65002c.this.f123081c, (AbstractC49336a) null);
                ((C64996a.AbstractC64998b) C65002c.this.mo171181d()).mo224038d();
                PassportLog passportLog = C65002c.this.f123081c;
                passportLog.mo171465b("n_action_new_credential_succ", "set new credential success, next: " + baseStepData.nextStep);
            }
        });
    }

    public C65002c(Context context, C64996a.AbstractC64997a aVar, C64996a.AbstractC64998b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163752d = context;
    }
}
