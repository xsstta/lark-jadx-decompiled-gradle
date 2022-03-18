package com.ss.lark.android.passport.biz.feature.country;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.CountrySelectModel;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.country.i */
public class C64747i {

    /* renamed from: com.ss.lark.android.passport.biz.feature.country.i$a */
    public interface AbstractC64748a extends AbstractC49025e {
        /* renamed from: a */
        void mo223537a(Context context, boolean z, AbstractC49352d<CountrySelectModel.CountryInfo> dVar);

        /* renamed from: a */
        void mo223538a(Context context, boolean z, String str, AbstractC49352d<List<CountryBean>> dVar);

        /* renamed from: a */
        void mo223539a(Context context, boolean z, List<String> list, AbstractC49352d<List<CountryBean>> dVar);

        /* renamed from: a */
        void mo223540a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.country.i$b */
    public interface AbstractC64749b extends AbstractC49027g<AbstractC64750a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.country.i$b$a */
        public interface AbstractC64750a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223594a(CountryBean countryBean);

            /* renamed from: a */
            void mo223595a(String str);
        }

        /* renamed from: a */
        void mo223566a(CountrySelectModel.CountryInfo countryInfo);

        /* renamed from: a */
        void mo223567a(List<CountryBean> list);

        /* renamed from: e */
        Context mo223558e();

        /* renamed from: g */
        void mo223568g();
    }
}
