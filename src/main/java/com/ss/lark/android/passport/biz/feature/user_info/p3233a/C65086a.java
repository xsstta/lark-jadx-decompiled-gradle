package com.ss.lark.android.passport.biz.feature.user_info.p3233a;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetUserInfoStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.a */
public class C65086a {

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.a$a */
    public interface AbstractC65087a extends AbstractC49025e {
        /* renamed from: a */
        void mo224238a(int i, String str, String str2, AbstractC49352d<BaseStepData> dVar);

        /* renamed from: a */
        void mo224239a(Context context, String str, boolean z, String str2, AbstractC49352d<CountryBean> dVar);

        /* renamed from: c */
        SetUserInfoStepInfo mo224240c();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.a$b */
    public interface AbstractC65088b extends AbstractC49027g<AbstractC65089a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.a$b$a */
        public interface AbstractC65089a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo224245a(int i, String str, String str2);

            /* renamed from: a */
            void mo224246a(String str);
        }

        /* renamed from: a */
        void mo224241a(CountryBean countryBean, boolean z);

        /* renamed from: a */
        void mo224242a(SetUserInfoStepInfo setUserInfoStepInfo);

        /* renamed from: d */
        void mo224243d();

        /* renamed from: e */
        void mo224244e();
    }
}
