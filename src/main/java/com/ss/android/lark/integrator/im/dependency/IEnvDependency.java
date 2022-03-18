package com.ss.android.lark.integrator.im.dependency;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IEnvDependency {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ENV_TYPE {
    }

    /* renamed from: a */
    String mo143624a();
}
