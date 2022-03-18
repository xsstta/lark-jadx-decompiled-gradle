package com.bytedance.ee.lark.plugin_annotation;

import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.bytedance.ee.lark.plugin_annotation.bean.Scope;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface PluginConfig {
    OpenApiConfig[] openAccessConfig() default {};

    LKOpenApiBizDomain owner() default LKOpenApiBizDomain.OPEN_PLATFORM;

    PluginEnv pluginEnv() default PluginEnv.BIZ_ENV;

    Scope scope() default Scope.CONTAINER;
}
