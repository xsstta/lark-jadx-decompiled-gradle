package com.ss.lark.android.passport.biz.feature.input_pwd.mvp;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;

/* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.a */
public class C64787a {

    /* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.a$a */
    public interface AbstractC64788a extends AbstractC49025e {
        /* renamed from: a */
        void mo223670a(int i, AbstractC49352d<BaseStepData> dVar);

        /* renamed from: a */
        void mo223671a(String str, ICallback<VerifyPwdData> aVar);

        VerifyIdentityStepInfo cm_();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.a$b */
    public interface AbstractC64789b extends AbstractC49027g<AbstractC64790a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.a$b$a */
        public interface AbstractC64790a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            String mo223673a(Context context);

            /* renamed from: a */
            void mo223674a(int i);

            /* renamed from: a */
            void mo223675a(String str);

            /* renamed from: a */
            boolean mo223676a();

            /* renamed from: b */
            boolean mo223677b(String str);
        }

        /* renamed from: a */
        void mo223659a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean);

        /* renamed from: a */
        void mo223661a(String str, int i);

        /* renamed from: d */
        void mo223662d();

        /* renamed from: e */
        void mo223663e();

        /* renamed from: f */
        void mo223664f();

        /* renamed from: g */
        void mo223665g();
    }
}
