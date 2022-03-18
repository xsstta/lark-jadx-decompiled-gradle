package com.ss.android.lark.security.verify;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.security.account.SecurityVerifyResult;
import com.ss.android.lark.security.api.CheckSecurityPwdStep;
import com.ss.android.lark.security.api.VerifySecurityPwdResultStep;
import com.ss.android.lark.security.api.VerifySecurityPwdStep;

/* renamed from: com.ss.android.lark.security.verify.a */
public interface AbstractC54089a {

    /* renamed from: com.ss.android.lark.security.verify.a$a */
    public interface AbstractC54090a extends AbstractC49025e {
        /* renamed from: a */
        void mo185141a(IGetDataCallback<CheckSecurityPwdStep> iGetDataCallback);

        /* renamed from: a */
        void mo185142a(String str, String str2, String str3, IGetDataCallback<VerifySecurityPwdResultStep> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.security.verify.a$b */
    public interface AbstractC54091b extends AbstractC49027g<AbstractC54092a> {

        /* renamed from: com.ss.android.lark.security.verify.a$b$a */
        public interface AbstractC54092a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo185143a(SecurityVerifyResult securityVerifyResult);

            /* renamed from: a */
            void mo185144a(String str);
        }

        /* renamed from: a */
        void mo185124a(BaseStepData baseStepData);

        /* renamed from: a */
        void mo185125a(VerifySecurityPwdStep verifySecurityPwdStep);

        /* renamed from: a */
        void mo185127a(String str);

        /* renamed from: b */
        void mo185128b(String str);

        /* renamed from: c */
        void mo185129c(String str);
    }
}
