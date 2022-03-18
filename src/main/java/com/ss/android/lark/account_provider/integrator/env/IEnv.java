package com.ss.android.lark.account_provider.integrator.env;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IEnv {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ENV_TYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UNIT_TYPE {
    }

    /* renamed from: a */
    int mo101493a();

    /* renamed from: b */
    String mo101494b();
}
