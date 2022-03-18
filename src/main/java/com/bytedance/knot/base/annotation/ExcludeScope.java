package com.bytedance.knot.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Repeatable(ExcludeContainer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcludeScope {
    Scope type() default Scope.CLASS;

    String[] value() default {""};
}
