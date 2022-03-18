package com.ss.lark.android.passport.biz.feature.sso.ssosdk;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SSOConfirmStepInfo;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.a */
public interface AbstractC65052a {

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.a$a */
    public interface AbstractC65053a extends AbstractC49025e {
        /* renamed from: a */
        void mo224158a(String str, List<String> list, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback);

        /* renamed from: c */
        AuthInfo mo224159c();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.a$b */
    public interface AbstractC65054b extends AbstractC49027g<AbstractC65055a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.a$b$a */
        public interface AbstractC65055a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo224160a();

            /* renamed from: a */
            void mo224161a(String str);

            /* renamed from: a */
            void mo224162a(List<String> list);
        }

        /* renamed from: a */
        void mo224139a(AuthInfo authInfo);

        /* renamed from: a */
        void mo224141a(String str);

        /* renamed from: a */
        void mo224143a(String str, String str2);

        /* renamed from: d */
        void mo224146d();

        /* renamed from: e */
        void mo224147e();

        /* renamed from: f */
        void mo224148f();

        /* renamed from: g */
        boolean mo224149g();

        /* renamed from: h */
        void mo224150h();
    }
}
