package com.ss.lark.android.passport.biz.compat.v2.http.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CodeHandlerAnno {
    int code() default -1;
}
