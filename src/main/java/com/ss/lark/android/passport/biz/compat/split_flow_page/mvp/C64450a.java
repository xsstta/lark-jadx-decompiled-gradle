package com.ss.lark.android.passport.biz.compat.split_flow_page.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SpliteStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.RefreshTicketData;

/* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.a */
public class C64450a {

    /* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.a$a */
    public interface AbstractC64451a extends AbstractC49025e {
        /* renamed from: a */
        void mo223033a(int i, AbstractC49352d<BaseStepData> dVar);

        /* renamed from: a */
        void mo223034a(AbstractC49352d<BaseStepData> dVar);

        /* renamed from: b */
        void mo223035b(AbstractC49352d<RefreshTicketData> dVar);

        SpliteStepInfo cf_();

        int cg_();

        boolean ch_();

        /* renamed from: e */
        String mo223039e();

        /* renamed from: g */
        String mo223040g();

        /* renamed from: h */
        String mo223041h();
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.a$b */
    public interface AbstractC64452b extends AbstractC49027g<AbstractC64453a> {

        /* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.a$b$a */
        public interface AbstractC64453a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223042a();

            /* renamed from: b */
            void mo223043b();
        }

        /* renamed from: a */
        void mo223021a(BaseStepData baseStepData, boolean z);

        /* renamed from: a */
        void mo223023a(SpliteStepInfo spliteStepInfo);

        /* renamed from: a */
        void mo223024a(SpliteStepInfo spliteStepInfo, String str, boolean z);

        /* renamed from: d */
        void mo223027d();

        /* renamed from: e */
        void mo223028e();

        /* renamed from: f */
        void mo223029f();
    }
}
