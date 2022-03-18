package com.ss.lark.android.passport.biz.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.base.p2423a.C49012c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.lark.android.passport.biz.account.C64291a;
import com.ss.lark.android.passport.biz.feature.country.C64741g;
import com.ss.lark.android.passport.biz.feature.country.Country;

/* renamed from: com.ss.lark.android.passport.biz.utils.a */
public final class C65243a {
    /* renamed from: a */
    public static void m256128a(String str) {
        C57865c.m224576a(new Runnable(str) {
            /* class com.ss.lark.android.passport.biz.utils.$$Lambda$a$BAePZkZu38dSWglaeC9IjitzYso */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C64291a.m252812c(this.f$0);
            }
        });
    }

    /* renamed from: a */
    public static void m256125a(final Context context, final PassportLog passportLog, final AbstractC49352d<CountryBean> dVar) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.lark.android.passport.biz.utils.C65243a.RunnableC652441 */

            public void run() {
                final C49012c cVar = new C49012c(dVar);
                C64741g.m254275a().mo223606a(context, true, (AbstractC49352d<Country>) new AbstractC49352d<Country>() {
                    /* class com.ss.lark.android.passport.biz.utils.C65243a.RunnableC652441.C652451 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                    /* renamed from: a */
                    public void mo145178a(NetworkErrorResult networkErrorResult) {
                        PassportLog passportLog = passportLog;
                        passportLog.mo171471d("CountryUtil", "getCountryInfo error: " + networkErrorResult.getErrorMessage());
                    }

                    /* renamed from: a */
                    public void mo145179a(Country country) {
                        if (country != null) {
                            String b = C64291a.m252807b();
                            if (TextUtils.isEmpty(b)) {
                                AbstractC49370a d = ServiceFinder.m193749d();
                                if (TextUtils.equals(d.getUserUnit(), d.getBoeVaUnit()) || TextUtils.equals(d.getUserUnit(), d.getVaUnit())) {
                                    b = country.getDefaultCountry();
                                } else {
                                    b = "CN";
                                }
                                C64291a.m252812c(b);
                            }
                            CountryBean countryBean = null;
                            if (country.getData() != null) {
                                countryBean = country.getData().get(b);
                            }
                            cVar.mo145179a(countryBean);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m256126a(Context context, String str, AbstractC49352d<CountryBean> dVar) {
        C57865c.m224576a(new Runnable(context, str) {
            /* class com.ss.lark.android.passport.biz.utils.$$Lambda$a$tgDA2pb3kHdqRoOe2_dzvaZQtbk */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C65243a.m256127a(AbstractC49352d.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m256127a(AbstractC49352d dVar, Context context, String str) {
        C64741g.m254275a().mo223609b(context, false, str, new C49012c(dVar));
    }
}
