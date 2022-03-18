package com.ss.android.vc.entity.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PbAnnotation {
    String def() default "";

    String desc() default "";
}
