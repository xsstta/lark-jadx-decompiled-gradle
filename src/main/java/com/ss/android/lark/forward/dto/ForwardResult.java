package com.ss.android.lark.forward.dto;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ForwardResult implements Serializable {
    private final int mResult;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FORWARDRESULT {
    }

    public int getResult() {
        return this.mResult;
    }

    public ForwardResult(int i) {
        this.mResult = i;
    }
}
