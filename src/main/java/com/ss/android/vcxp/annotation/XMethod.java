package com.ss.android.vcxp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface XMethod {
    String bigParamCacheId() default "56648189-3b35-45f3-8d0d-9bc1d653585f";

    int bigParamCacheSize() default 2097152;

    int[] bigParamIndex() default {};

    String bigResultCacheId() default "16e267ab-fe3c-45bf-afe4-b44e636f8fd1";

    int bigResultCacheSize() default 2097152;

    boolean isBigResult() default false;

    boolean isReleaseMethod() default false;

    boolean isStatic() default false;

    String methodId() default "";

    XProcess runOnProcess() default XProcess.Unspecified;
}
