package com.ss.lark.android.passport.biz.feature.country;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.util.C49193h;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.C64747i;
import com.ss.lark.android.passport.biz.feature.country.CountrySelectModel;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.country.e */
public class C64729e extends AbstractC49021b<C64747i.AbstractC64748a, C64747i.AbstractC64749b, C64747i.AbstractC64749b.AbstractC64750a> {

    /* renamed from: d */
    private final CountrySelectParams f163277d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    public void cn_() {
        super.cn_();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m254247i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64747i.AbstractC64749b.AbstractC64750a mo171180c() {
        return new C64734a();
    }

    /* renamed from: h */
    public void mo223589h() {
        C64747i.AbstractC64749b bVar = (C64747i.AbstractC64749b) mo171181d();
        if (bVar != null) {
            bVar.mo223568g();
        }
        m254247i();
    }

    /* renamed from: i */
    private void m254247i() {
        CountrySelectParams countrySelectParams = this.f163277d;
        if (countrySelectParams == null || C49193h.m193948a(countrySelectParams.mo223547a())) {
            ((C64747i.AbstractC64748a) mo171182e()).mo223537a(((C64747i.AbstractC64749b) mo171181d()).mo223558e(), false, new AbstractC49352d<CountrySelectModel.CountryInfo>() {
                /* class com.ss.lark.android.passport.biz.feature.country.C64729e.C647301 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C64729e.this.f123081c.mo171471d("CountrySelectPresenter", networkErrorResult.toString());
                }

                /* renamed from: a */
                public void mo145179a(final CountrySelectModel.CountryInfo countryInfo) {
                    C49148ac.m193806a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.country.C64729e.C647301.RunnableC647311 */

                        public void run() {
                            ((C64747i.AbstractC64749b) C64729e.this.mo171181d()).mo223566a(countryInfo);
                        }
                    });
                }
            });
        } else {
            ((C64747i.AbstractC64748a) mo171182e()).mo223539a(((C64747i.AbstractC64749b) mo171181d()).mo223558e(), false, this.f163277d.mo223547a(), (AbstractC49352d<List<CountryBean>>) new AbstractC49352d<List<CountryBean>>() {
                /* class com.ss.lark.android.passport.biz.feature.country.C64729e.C647322 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C64729e.this.f123081c.mo171471d("CountrySelectPresenter", networkErrorResult.toString());
                }

                /* renamed from: a */
                public void mo145179a(final List<CountryBean> list) {
                    C49148ac.m193806a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.country.C64729e.C647322.RunnableC647331 */

                        public void run() {
                            ((C64747i.AbstractC64749b) C64729e.this.mo171181d()).mo223567a(list);
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.e$a */
    public class C64734a implements C64747i.AbstractC64749b.AbstractC64750a {
        C64734a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b.AbstractC64750a
        /* renamed from: a */
        public void mo223594a(CountryBean countryBean) {
            ((C64747i.AbstractC64748a) C64729e.this.mo171182e()).mo223540a(countryBean.getKey());
        }

        @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b.AbstractC64750a
        /* renamed from: a */
        public void mo223595a(String str) {
            ((C64747i.AbstractC64748a) C64729e.this.mo171182e()).mo223538a(((C64747i.AbstractC64749b) C64729e.this.mo171181d()).mo223558e(), false, str, (AbstractC49352d<List<CountryBean>>) new AbstractC49352d<List<CountryBean>>() {
                /* class com.ss.lark.android.passport.biz.feature.country.C64729e.C64734a.C647351 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C64729e.this.f123081c.mo171471d("CountrySelectPresenter", networkErrorResult.toString());
                }

                /* renamed from: a */
                public void mo145179a(final List<CountryBean> list) {
                    C49148ac.m193806a(new Runnable() {
                        /* class com.ss.lark.android.passport.biz.feature.country.C64729e.C64734a.C647351.RunnableC647361 */

                        public void run() {
                            ((C64747i.AbstractC64749b) C64729e.this.mo171181d()).mo223567a(list);
                        }
                    });
                }
            });
        }
    }

    public C64729e(C64747i.AbstractC64748a aVar, C64747i.AbstractC64749b bVar, UniContext uniContext, CountrySelectParams countrySelectParams, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163277d = countrySelectParams;
    }
}
