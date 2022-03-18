package com.ss.lark.android.passport.biz.compat.verify_code.mvp;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.a */
public class C64536a {

    /* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.a$a */
    public interface AbstractC64537a extends AbstractC49025e {
        /* renamed from: a */
        void mo223221a(AbstractC49352d<V2ResponseModel<ApplyCodeData>> dVar);

        /* renamed from: a */
        void mo223222a(String str, AbstractC49352d<V2ResponseModel<BaseStepData>> dVar);

        /* renamed from: a */
        void mo223223a(String str, String str2, AbstractC49352d<V2ResponseModel<ApplyCodeData>> dVar);

        VerifyIdentityStepInfo.VerifyIdentifyBean cj_();

        VerifyIdentityStepInfo ck_();

        int cl_();

        /* renamed from: e */
        JSONObject mo223227e();

        /* renamed from: g */
        boolean mo223228g();

        /* renamed from: h */
        boolean mo223229h();
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.a$b */
    public interface AbstractC64538b extends AbstractC49027g<AbstractC64539a> {

        /* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.a$b$a */
        public interface AbstractC64539a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223230a();

            /* renamed from: a */
            void mo223231a(String str);

            /* renamed from: b */
            String mo223232b();

            /* renamed from: b */
            void mo223233b(String str);

            /* renamed from: c */
            String mo223234c();

            /* renamed from: d */
            int mo223235d();

            /* renamed from: e */
            void mo223236e();

            /* renamed from: f */
            boolean mo223237f();
        }

        /* renamed from: a */
        void mo223200a(int i);

        /* renamed from: a */
        void mo223201a(VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, boolean z);

        /* renamed from: a */
        void mo223203a(String str, boolean z);

        /* renamed from: d */
        void mo223205d();

        /* renamed from: e */
        void mo223206e();

        /* renamed from: f */
        void mo223207f();

        /* renamed from: g */
        void mo223208g();

        /* renamed from: h */
        void mo223209h();
    }
}
