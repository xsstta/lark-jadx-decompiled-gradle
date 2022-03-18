package com.bytedance.ee.bear.contract.maintab;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class MainTab {

    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TAB {
    }
}
