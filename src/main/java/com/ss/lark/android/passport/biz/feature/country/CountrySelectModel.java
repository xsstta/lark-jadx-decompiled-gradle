package com.ss.lark.android.passport.biz.feature.country;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.p2423a.C49012c;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.C64747i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CountrySelectModel extends C49020a implements C64747i.AbstractC64748a {
    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64748a
    /* renamed from: a */
    public void mo223540a(String str) {
    }

    public class CountryInfo implements Serializable {
        private final List<CountryBean> countryData;
        private final List<CountryBean> countryTopData;

        public List<CountryBean> getCountryData() {
            return this.countryData;
        }

        public List<CountryBean> getCountryTopData() {
            return this.countryTopData;
        }

        public CountryInfo(List<CountryBean> list, List<CountryBean> list2) {
            this.countryData = list;
            this.countryTopData = list2;
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64748a
    /* renamed from: a */
    public void mo223537a(final Context context, final boolean z, final AbstractC49352d<CountryInfo> dVar) {
        C49148ac.m193808b(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.country.CountrySelectModel.RunnableC647083 */

            public void run() {
                final C49012c cVar = new C49012c(dVar);
                CountrySelectModel.this.cw_().mo171122a(cVar);
                C64741g.m254275a().mo223606a(context, z, new AbstractC49352d<Country>() {
                    /* class com.ss.lark.android.passport.biz.feature.country.CountrySelectModel.RunnableC647083.C647091 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                    /* renamed from: a */
                    public void mo145178a(NetworkErrorResult networkErrorResult) {
                        cVar.mo145178a(networkErrorResult);
                    }

                    /* renamed from: a */
                    public void mo145179a(Country country) {
                        ArrayList arrayList = new ArrayList(country.getData().values());
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : country.getTopList()) {
                            CountryBean countryBean = country.getData().get(str);
                            if (countryBean != null) {
                                CountryBean countryBean2 = new CountryBean(countryBean);
                                countryBean2.setHeadIndex(String.valueOf(-1));
                                arrayList2.add(countryBean2);
                            }
                        }
                        cVar.mo145179a(new CountryInfo(arrayList, arrayList2));
                    }
                });
            }
        });
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64748a
    /* renamed from: a */
    public void mo223538a(final Context context, boolean z, final String str, final AbstractC49352d<List<CountryBean>> dVar) {
        C49148ac.m193808b(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.country.CountrySelectModel.RunnableC647072 */

            public void run() {
                C49012c cVar = new C49012c(dVar);
                CountrySelectModel.this.cw_().mo171122a(cVar);
                C64741g.m254275a().mo223607a(context, false, str, (AbstractC49352d<List<CountryBean>>) cVar);
            }
        });
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64748a
    /* renamed from: a */
    public void mo223539a(final Context context, final boolean z, final List<String> list, final AbstractC49352d<List<CountryBean>> dVar) {
        C49148ac.m193808b(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.country.CountrySelectModel.RunnableC647061 */

            public void run() {
                C49012c cVar = new C49012c(dVar);
                CountrySelectModel.this.cw_().mo171122a(cVar);
                C64741g.m254275a().mo223608a(context, z, list, cVar);
            }
        });
    }
}
