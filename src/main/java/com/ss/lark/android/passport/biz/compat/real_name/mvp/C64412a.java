package com.ss.lark.android.passport.biz.compat.real_name.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.RecoverAccountStepInfoBackup;

/* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.a */
public class C64412a {

    /* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.a$a */
    public interface AbstractC64413a extends AbstractC49025e {
        /* renamed from: a */
        void mo222974a(String str, String str2, AbstractC49352d<BaseStepData> dVar);

        RecoverAccountStepInfoBackup cc_();
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.a$b */
    public interface AbstractC64414b extends AbstractC49027g<AbstractC64415a> {

        /* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.a$b$a */
        public interface AbstractC64415a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            String mo222976a();

            /* renamed from: a */
            void mo222977a(String str, String str2);
        }

        /* renamed from: a */
        void mo222961a(RecoverAccountStepInfoBackup recoverAccountStepInfoBackup);

        /* renamed from: d */
        void mo222963d();

        /* renamed from: e */
        void mo222964e();
    }
}
