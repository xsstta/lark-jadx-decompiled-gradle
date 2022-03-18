package com.facebook.react.common;

import javax.annotation.Nullable;

public class JavascriptException extends RuntimeException {
    @Nullable
    private String extraDataAsJson;

    @Nullable
    public String getExtraDataAsJson() {
        return this.extraDataAsJson;
    }

    public JavascriptException(String str) {
        super(str);
    }

    public JavascriptException setExtraDataAsJson(@Nullable String str) {
        this.extraDataAsJson = str;
        return this;
    }
}
