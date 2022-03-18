package com.ss.lark.android.passport.biz.feature.real_name.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.RecoverAccountStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.feature.real_name.mvp.a */
public class C64928a {

    /* renamed from: com.ss.lark.android.passport.biz.feature.real_name.mvp.a$a */
    public interface AbstractC64929a extends AbstractC49025e {
        /* renamed from: a */
        void mo223949a(String str, String str2, AbstractC49352d<BaseStepData> dVar);

        RecoverAccountStepInfo cr_();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.real_name.mvp.a$b */
    public interface AbstractC64930b extends AbstractC49027g<AbstractC64931a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.real_name.mvp.a$b$a */
        public interface AbstractC64931a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            String mo223951a();

            /* renamed from: a */
            void mo223952a(String str, String str2);
        }

        /* renamed from: a */
        void mo223933a(RecoverAccountStepInfo recoverAccountStepInfo);

        /* renamed from: d */
        void mo223936d();

        /* renamed from: e */
        void mo223937e();

        /* renamed from: f */
        void mo223938f();
    }
}
