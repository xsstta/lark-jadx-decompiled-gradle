package com.ss.android.lark.autoinit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface AutoInit {
    Class bindModule();

    String generateClassSuffix() default "";

    String getDependencyMethodName() default "getDependency";

    String initMethodName() default "getModule";

    String[] moduleAliases() default {};

    String moduleName() default "";

    String[] thirdPartyComponentPrefixes() default {};

    Class[] thirdPartyComponents() default {};
}
