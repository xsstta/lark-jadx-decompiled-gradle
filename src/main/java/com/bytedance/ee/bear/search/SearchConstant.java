package com.bytedance.ee.bear.search;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface SearchConstant {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SearchType {
    }
}
