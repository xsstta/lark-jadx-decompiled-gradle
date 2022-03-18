package com.he.v8_inspect.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonProperty {
    boolean required() default false;
}
