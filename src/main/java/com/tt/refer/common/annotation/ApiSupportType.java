package com.tt.refer.common.annotation;

import com.tt.refer.common.base.AppType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiSupportType {
    String[] apiName();

    AppType[] support() default {};

    AppType[] testSupport() default {};
}
