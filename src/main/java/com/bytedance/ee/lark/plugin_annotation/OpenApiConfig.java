package com.bytedance.ee.lark.plugin_annotation;

import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface OpenApiConfig {
    LKOpenApiBizType bizType();

    LKOpenApiBizDomain domain() default LKOpenApiBizDomain.OPEN_PLATFORM;

    boolean publicToJS() default false;

    String scene() default "";
}
