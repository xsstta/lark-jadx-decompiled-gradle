package com.bytedance.knot.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Repeatable(MatchContainer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MatchScope {
    Scope type() default Scope.CLASS;

    String[] value() default {""};
}
