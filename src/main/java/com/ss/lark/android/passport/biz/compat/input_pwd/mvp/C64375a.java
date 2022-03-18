package com.ss.lark.android.passport.biz.compat.input_pwd.mvp;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.a */
public class C64375a {

    /* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.a$a */
    public interface AbstractC64376a extends AbstractC49025e {
        /* renamed from: a */
        void mo222929a(String str, AbstractC49352d<V2ResponseModel<VerifyPwdData>> dVar);

        VerifyIdentityStepInfo cb_();
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.a$b */
    public interface AbstractC64377b extends AbstractC49027g<AbstractC64378a> {

        /* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.a$b$a */
        public interface AbstractC64378a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            String mo222931a(Context context);

            /* renamed from: a */
            void mo222932a(String str);

            /* renamed from: a */
            boolean mo222933a();

            /* renamed from: b */
            void mo222934b();

            /* renamed from: b */
            boolean mo222935b(String str);
        }

        /* renamed from: a */
        void mo222915a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, boolean z, boolean z2, boolean z3);

        /* renamed from: d */
        void mo222917d();

        /* renamed from: e */
        void mo222918e();

        /* renamed from: f */
        void mo222919f();
    }
}
