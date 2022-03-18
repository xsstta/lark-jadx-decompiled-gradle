package com.ss.lark.android.passport.biz.feature.auth_type.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import com.ss.lark.android.passport.biz.entity.AuthTypeStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.c */
public class C64634c {

    /* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.c$a */
    public interface AbstractC64635a extends AbstractC49025e {
        /* renamed from: g */
        AuthTypeStepInfo mo223439g();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.c$b */
    public interface AbstractC64636b extends AbstractC49027g<AbstractC64637a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.c$b$a */
        public interface AbstractC64637a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223441a(BaseStepData baseStepData, ButtonType buttonType);
        }

        /* renamed from: a */
        void mo223433a(AuthTypeStepInfo authTypeStepInfo);

        /* renamed from: e */
        void mo223436e();

        /* renamed from: f */
        void mo223437f();
    }
}
