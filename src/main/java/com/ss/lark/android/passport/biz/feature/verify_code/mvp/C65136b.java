package com.ss.lark.android.passport.biz.feature.verify_code.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;

/* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.b */
public class C65136b {

    /* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.b$a */
    public interface AbstractC65137a extends AbstractC49025e {
        /* renamed from: a */
        void mo224342a(int i, AbstractC49352d<BaseStepData> dVar);

        /* renamed from: a */
        void mo224343a(ICallback<ApplyCodeData> aVar);

        /* renamed from: a */
        void mo224344a(String str, ICallback<BaseStepData> aVar);

        /* renamed from: a */
        void mo224345a(String str, boolean z, ICallback<BaseStepData> aVar);

        /* renamed from: b */
        void mo224346b(ICallback<ApplyCodeData> aVar);

        /* renamed from: c */
        VerifyIdentityStepInfo.VerifyIdentifyBean mo224347c();

        VerifyIdentityStepInfo cB_();

        boolean cC_();

        /* renamed from: e */
        String mo224350e();

        /* renamed from: g */
        boolean mo224351g();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.b$b */
    public interface AbstractC65138b extends AbstractC49027g<AbstractC65139a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.b$b$a */
        public interface AbstractC65139a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo224352a();

            /* renamed from: a */
            void mo224353a(int i);

            /* renamed from: a */
            void mo224354a(String str);

            /* renamed from: b */
            String mo224355b();

            /* renamed from: c */
            int mo224356c();

            /* renamed from: d */
            void mo224357d();

            /* renamed from: e */
            boolean mo224358e();
        }

        /* renamed from: a */
        void mo224319a(int i);

        /* renamed from: a */
        void mo224320a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, String str, boolean z, boolean z2);

        /* renamed from: a */
        void mo224323a(String str, int i, String str2);

        /* renamed from: a */
        void mo224324a(String str, boolean z);

        /* renamed from: a */
        void mo224325a(boolean z);

        /* renamed from: d */
        void mo224327d();

        /* renamed from: e */
        void mo224328e();

        /* renamed from: f */
        void mo224329f();

        /* renamed from: g */
        void mo224330g();

        /* renamed from: h */
        void mo224331h();
    }
}
