package com.bytedance.sdk.bridge.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BridgeMethod {
    @BridgePrivilege
    String privilege() default "protected";

    String sync() default "ASYNC";

    String value();
}
