package com.ss.lark.android.passport.biz.feature.set_credential;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.infra.entity.InputInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.a */
public class C64996a {

    /* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.a$a */
    public interface AbstractC64997a extends AbstractC49025e {
        /* renamed from: a */
        void mo224019a(String str, AbstractC49352d<BaseStepData> dVar);

        String cs_();

        String ct_();

        InputInfo cu_();

        /* renamed from: e */
        int mo224023e();

        /* renamed from: g */
        String mo224024g();

        /* renamed from: h */
        String mo224025h();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.a$b */
    public interface AbstractC64998b extends AbstractC49027g<AbstractC64999c> {
        /* renamed from: a */
        void mo224032a(CountryBean countryBean);

        /* renamed from: a */
        void mo224033a(AbstractC64997a aVar);

        /* renamed from: a */
        void mo224035a(List<String> list);

        /* renamed from: a */
        void mo224036a(boolean z);

        /* renamed from: d */
        void mo224038d();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.a$c */
    interface AbstractC64999c extends AbstractC49027g.AbstractC49028a {
        /* renamed from: a */
        boolean mo224044a(String str);

        /* renamed from: a */
        boolean mo224045a(String str, String str2);

        /* renamed from: b */
        void mo224046b(String str);

        /* renamed from: c */
        void mo224047c(String str);
    }
}
