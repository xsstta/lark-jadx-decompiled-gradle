package com.ss.android.lark.browser.impl.translate.jsb.result;

public class ErrorJSResult implements BaseJSResult {
    private String error;

    public String getError() {
        return this.error;
    }

    public String toString() {
        return "ErrorJSResult{error='" + this.error + '\'' + '}';
    }

    public void setError(String str) {
        this.error = str;
    }

    public ErrorJSResult(String str) {
        this.error = str;
    }
}
