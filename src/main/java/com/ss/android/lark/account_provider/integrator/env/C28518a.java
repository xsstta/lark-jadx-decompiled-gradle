package com.ss.android.lark.account_provider.integrator.env;

import com.ss.android.lark.passport.infra.service.ServiceFinder;

/* renamed from: com.ss.android.lark.account_provider.integrator.env.a */
public class C28518a {
    /* renamed from: a */
    public static IEnv m104522a() {
        return new C28519b(ServiceFinder.m193752g().getEnvType(), ServiceFinder.m193752g().getUserUnit());
    }
}
