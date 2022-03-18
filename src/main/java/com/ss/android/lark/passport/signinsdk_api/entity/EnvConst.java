package com.ss.android.lark.passport.signinsdk_api.entity;

import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class EnvConst {

    @Retention(RetentionPolicy.SOURCE)
    public @interface OLD_ENV {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UNIT {
    }

    /* renamed from: a */
    public static HostEnvBean m194442a() {
        return new HostEnvBean("eu_nc", null, null, 1);
    }

    /* renamed from: b */
    public static HostEnvBean m194443b() {
        return new HostEnvBean("eu_ea", null, null, 1);
    }

    /* renamed from: c */
    public static HostEnvBean m194444c() {
        return new HostEnvBean("boecn", null, null, 2);
    }

    /* renamed from: d */
    public static HostEnvBean m194445d() {
        return new HostEnvBean("boeva", null, null, 2);
    }
}
