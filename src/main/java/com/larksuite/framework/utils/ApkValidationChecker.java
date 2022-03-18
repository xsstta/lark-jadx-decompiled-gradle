package com.larksuite.framework.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ApkValidationChecker {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckResult {
    }
}
