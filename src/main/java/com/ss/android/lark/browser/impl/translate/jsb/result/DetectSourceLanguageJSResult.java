package com.ss.android.lark.browser.impl.translate.jsb.result;

public class DetectSourceLanguageJSResult implements BaseJSResult {
    private String code;
    private String name;

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "DetectSourceLanguageJSResult{code='" + this.code + '\'' + ", name='" + this.name + '\'' + '}';
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
