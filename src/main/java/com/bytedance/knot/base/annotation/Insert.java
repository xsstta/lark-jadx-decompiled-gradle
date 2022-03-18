package com.bytedance.knot.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Insert {
    TargetType targetType() default TargetType.SELF;

    InsertType type();

    String value();
}
