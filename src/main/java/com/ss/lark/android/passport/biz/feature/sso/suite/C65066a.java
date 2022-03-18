package com.ss.lark.android.passport.biz.feature.sso.suite;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.SuiteInfo;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.a */
public class C65066a {

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.a$a */
    public interface AbstractC65067a extends AbstractC49025e {

        /* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.a$a$a */
        public interface AbstractC65068a {
            /* renamed from: a */
            void mo224203a();
        }

        /* renamed from: a */
        void mo224195a(IGetDataCallback<BaseStepData> iGetDataCallback);

        /* renamed from: a */
        void mo224196a(boolean z, IGetDataCallback<BaseStepData> iGetDataCallback);

        /* renamed from: b */
        void mo224197b(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo224198b(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        String mo224199c();

        SuiteInfo cx_();

        boolean cy_();

        /* renamed from: e */
        int mo224202e();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.a$b */
    public interface AbstractC65069b extends AbstractC49027g<AbstractC65070a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.a$b$a */
        public interface AbstractC65070a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo224204a();

            /* renamed from: a */
            void mo224205a(boolean z);

            /* renamed from: b */
            void mo224206b(boolean z);
        }

        /* renamed from: a */
        void mo224178a(SuiteInfo suiteInfo);

        /* renamed from: a */
        void mo224180a(String str);

        /* renamed from: a */
        void mo224181a(boolean z);

        /* renamed from: b */
        void mo224182b(String str);

        /* renamed from: b */
        void mo224183b(boolean z);

        /* renamed from: c */
        void mo224184c(boolean z);

        /* renamed from: d */
        void mo224185d();

        /* renamed from: e */
        void mo224186e();

        /* renamed from: f */
        void mo224187f();

        /* renamed from: g */
        boolean mo224188g();

        /* renamed from: h */
        void mo224189h();
    }
}
