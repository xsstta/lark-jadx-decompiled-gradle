package com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.ResetPhoneStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.a */
public class C64425a {

    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.a$a */
    public interface AbstractC64426a extends AbstractC49025e {
        /* renamed from: a */
        void mo222991a(String str, AbstractC49352d<BaseStepData> dVar);

        ResetPhoneStepInfo cd_();
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.a$b */
    public interface AbstractC64427b extends AbstractC49027g<AbstractC64428a> {

        /* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.a$b$a */
        public interface AbstractC64428a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo222993a(String str);
        }

        /* renamed from: a */
        void mo222986a(ResetPhoneStepInfo resetPhoneStepInfo);

        /* renamed from: d */
        void mo222987d();

        /* renamed from: e */
        void mo222988e();
    }
}
