package com.lark.falcon.engine.module.anonotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JavaScriptObject {
    String name() default "";
}
