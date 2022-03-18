package com.lynx.tasm.behavior;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LynxProp {
    String customType() default "__default_type__";

    boolean defaultBoolean() default false;

    double defaultDouble() default 0.0d;

    float defaultFloat() default 0.0f;

    int defaultInt() default 0;

    String name();
}
