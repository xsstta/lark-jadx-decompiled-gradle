package com.ss.android.lark.mm.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MmHttpMethod {
    boolean post() default false;
}
