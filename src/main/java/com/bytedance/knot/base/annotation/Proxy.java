package com.bytedance.knot.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Proxy {
    TargetType targetType() default TargetType.SELF;

    ProxyType type() default ProxyType.METHOD;

    String value();
}
