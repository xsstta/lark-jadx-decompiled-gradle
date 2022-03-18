package com.bytedance.ee.bear.at;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AtConstant {

    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Zone {
    }
}
