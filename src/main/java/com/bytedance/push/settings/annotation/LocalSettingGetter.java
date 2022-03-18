package com.bytedance.push.settings.annotation;

public @interface LocalSettingGetter {
    boolean defaultBoolean() default false;

    float defaultFloat() default 0.0f;

    int defaultInt() default 0;

    long defaultLong() default 0;

    String defaultString() default "";

    String key();
}
