package com.tt.miniapphost.process.extra;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface ICrossProcessOperator {

    @Retention(RetentionPolicy.SOURCE)
    public @interface OperateProcessIdentify {
    }

    String operateProcessIdentify();
}
