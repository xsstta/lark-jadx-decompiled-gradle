package com.ss.lark.android.passport.biz.feature.bio_auth.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.BioStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.feature.bio_auth.mvp.c */
public class C64675c {

    /* renamed from: com.ss.lark.android.passport.biz.feature.bio_auth.mvp.c$a */
    public interface AbstractC64676a extends AbstractC49025e {
        /* renamed from: a */
        void mo223464a(String str, ICallback<BaseStepData> aVar);

        /* renamed from: a */
        boolean mo223465a(String str);

        /* renamed from: b */
        String mo223466b(String str);

        /* renamed from: b */
        void mo223467b(String str, ICallback<BaseStepData> aVar);

        /* renamed from: g */
        BioStepInfo mo223468g();

        /* renamed from: h */
        String mo223469h();

        /* renamed from: i */
        String mo223470i();

        /* renamed from: j */
        String mo223471j();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.bio_auth.mvp.c$b */
    public interface AbstractC64677b extends AbstractC49027g<AbstractC64678a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.bio_auth.mvp.c$b$a */
        public interface AbstractC64678a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223474a();

            /* renamed from: b */
            void mo223476b();
        }

        /* renamed from: a */
        void mo223456a(BaseStepData baseStepData, boolean z);

        /* renamed from: a */
        void mo223457a(BioStepInfo bioStepInfo);

        /* renamed from: d */
        void mo223459d();

        /* renamed from: e */
        void mo223460e();

        /* renamed from: g */
        void mo223462g();
    }
}
