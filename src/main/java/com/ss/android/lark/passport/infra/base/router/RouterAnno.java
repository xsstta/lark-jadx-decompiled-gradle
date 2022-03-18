package com.ss.android.lark.passport.infra.base.router;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface RouterAnno {
    String name() default "";

    String teaName() default "";

    String watcherName() default "";
}
