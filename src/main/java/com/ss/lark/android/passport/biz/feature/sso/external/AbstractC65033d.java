package com.ss.lark.android.passport.biz.feature.sso.external;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.d */
public interface AbstractC65033d {

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.d$a */
    public interface AbstractC65034a extends AbstractC49025e {
        /* renamed from: a */
        void mo224095a(List<String> list, IGetDataCallback<BaseStepData> iGetDataCallback);

        /* renamed from: g */
        String mo224096g();

        /* renamed from: h */
        AuthInfo mo224097h();

        /* renamed from: i */
        int mo224098i();

        /* renamed from: j */
        void mo224099j();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.d$b */
    public interface AbstractC65035b extends AbstractC49027g<AbstractC65036a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.d$b$a */
        public interface AbstractC65036a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo224105a();

            /* renamed from: a */
            void mo224106a(List<String> list);
        }

        /* renamed from: a */
        void mo224077a(AuthInfo authInfo);

        /* renamed from: a */
        void mo224081a(boolean z);

        /* renamed from: b */
        void mo224083b(String str);

        /* renamed from: d */
        void mo224084d();

        /* renamed from: e */
        void mo224085e();

        /* renamed from: f */
        void mo224086f();

        /* renamed from: g */
        boolean mo224087g();

        /* renamed from: h */
        void mo224088h();
    }
}
