package com.ss.lark.android.passport.biz.feature.create_team.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.C64482a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.IndustryInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.TenantCreateStepInfo;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.create_team.mvp.c */
public class C64767c {

    /* renamed from: com.ss.lark.android.passport.biz.feature.create_team.mvp.c$a */
    public interface AbstractC64768a extends AbstractC49025e {
        /* renamed from: a */
        void mo223633a(String str, String str2, String str3, UniContext uniContext, ICallback<BaseStepData> aVar);

        /* renamed from: g */
        TenantCreateStepInfo mo223634g();

        /* renamed from: h */
        List<TenantCreateStepInfo.CommonList> mo223635h();

        /* renamed from: i */
        List<TenantCreateStepInfo.IndustryTypeList> mo223636i();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.create_team.mvp.c$b */
    public interface AbstractC64769b extends AbstractC49027g<AbstractC64770a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.create_team.mvp.c$b$a */
        public interface AbstractC64770a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            List<C64482a> mo223640a();

            /* renamed from: a */
            void mo223641a(String str, String str2, String str3, String str4);

            /* renamed from: b */
            List<IndustryInfo> mo223642b();

            /* renamed from: b */
            boolean mo223643b(String str, String str2, String str3, String str4);
        }

        /* renamed from: a */
        void mo223617a(TenantCreateStepInfo tenantCreateStepInfo);

        /* renamed from: d */
        void mo223622d();

        /* renamed from: e */
        void mo223623e();
    }
}
